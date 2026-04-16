package cn.nukkit.network;

import cn.nukkit.network.protocol.p70.AddEntityPacket;
import cn.nukkit.network.protocol.p70.AddItemEntityPacket;
import cn.nukkit.network.protocol.p70.AddPaintingPacket;
import cn.nukkit.network.protocol.p70.AddPlayerPacket;
import cn.nukkit.network.protocol.p70.AdventureSettingsPacket;
import cn.nukkit.network.protocol.p70.AnimatePacket;
import cn.nukkit.network.protocol.p70.BatchPacket;
import cn.nukkit.network.protocol.p70.BlockEntityDataPacket;
import cn.nukkit.network.protocol.p70.BlockEventPacket;
import cn.nukkit.network.protocol.p70.ChangeDimensionPacket;
import cn.nukkit.network.protocol.p70.ChunkRadiusUpdatePacket;
import cn.nukkit.network.protocol.p70.ContainerClosePacket;
import cn.nukkit.network.protocol.p70.ContainerOpenPacket;
import cn.nukkit.network.protocol.p70.ContainerSetContentPacket;
import cn.nukkit.network.protocol.p70.ContainerSetDataPacket;
import cn.nukkit.network.protocol.p70.ContainerSetSlotPacket;
import cn.nukkit.network.protocol.p70.CraftingDataPacket;
import cn.nukkit.network.protocol.p70.CraftingEventPacket;
import cn.nukkit.network.protocol.p70.DataPacket;
import cn.nukkit.network.protocol.p70.DisconnectPacket;
import cn.nukkit.network.protocol.p70.DropItemPacket;
import cn.nukkit.network.protocol.p70.EntityEventPacket;
import cn.nukkit.network.protocol.p70.ExplodePacket;
import cn.nukkit.network.protocol.p70.FullChunkDataPacket;
import cn.nukkit.network.protocol.p70.HurtArmorPacket;
import cn.nukkit.network.protocol.p70.InteractPacket;
import cn.nukkit.network.protocol.p70.LevelEventPacket;
//import cn.nukkit.network.protocol.p70.LoginPacket;
import cn.nukkit.network.protocol.p70.MobArmorEquipmentPacket;
import cn.nukkit.network.protocol.p70.MobEffectPacket;
import cn.nukkit.network.protocol.p70.MobEquipmentPacket;
import cn.nukkit.network.protocol.p70.MoveEntityPacket;
import cn.nukkit.network.protocol.p70.MovePlayerPacket;
import cn.nukkit.network.protocol.p70.PlayStatusPacket;
import cn.nukkit.network.protocol.p70.PlayerActionPacket;
import cn.nukkit.network.protocol.p70.PlayerInputPacket;
import cn.nukkit.network.protocol.p70.PlayerListPacket;
import cn.nukkit.network.protocol.p70.RemoveBlockPacket;
import cn.nukkit.network.protocol.p70.RemoveEntityPacket;
import cn.nukkit.network.protocol.p70.RemovePlayerPacket;
import cn.nukkit.network.protocol.p70.ReplaceSelectedItemPacket;
import cn.nukkit.network.protocol.p70.RequestChunkRadiusPacket;
import cn.nukkit.network.protocol.p70.RespawnPacket;
import cn.nukkit.network.protocol.p70.SetDifficultyPacket;
import cn.nukkit.network.protocol.p70.SetEntityDataPacket;
import cn.nukkit.network.protocol.p70.SetEntityLinkPacket;
import cn.nukkit.network.protocol.p70.SetEntityMotionPacket;
import cn.nukkit.network.protocol.p70.SetPlayerGameTypePacket;
import cn.nukkit.network.protocol.p70.SetSpawnPositionPacket;
import cn.nukkit.network.protocol.p70.SetTimePacket;
import cn.nukkit.network.protocol.p70.StartGamePacket;
import cn.nukkit.network.protocol.p70.TakeItemEntityPacket;
import cn.nukkit.network.protocol.p70.TelemetryEventPacket;
import cn.nukkit.network.protocol.p70.TextPacket;
import cn.nukkit.network.protocol.p70.UpdateAttributesPacket;
import cn.nukkit.network.protocol.p70.UpdateBlockPacket;
import cn.nukkit.network.protocol.p70.UseItemPacket;
import cn.nukkit.network.protocol.p70.ProtocolInfo;

//import cn.nukkit.network.protocol.p70.*;

import cn.nukkit.network.protocol.LoginPacket;
import cn.nukkit.Player;

import java.util.HashMap;
import java.util.List;

import javax.xml.crypto.Data;

import java.util.Arrays;

public class AnyVersionManager {
    public static HashMap<String, List<Integer>> protocolVersions = new HashMap<String, List<Integer>>() {{
        put("0.15", Arrays.asList(81, 82, 83, 84));
        put("0.14", Arrays.asList(41, 42, 43, 44, 45, 46, 60, 70));
    }};

    public static DataPacket parsePacket(Player player, DataPacket packet) {
        if (packet instanceof BatchPacket || packet instanceof DataPacket) {
            LoginPacket loginPacket = (LoginPacket) packet;
            switch (loginPacket.getProtocol()) {
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 70:
                    DataPacket pk = null;
                    switch (packet.pid) {
                        case ProtocolInfo.ADD_ENTITY_PACKET:
                            pk = new AddEntityPacket();
                            break;
                    }
                    return pk;
                    break;
                default:
                    return packet;
                    break;
            }
        }
    }
}
