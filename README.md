Nukkit
===================
![nukkit](https://github.com/Pixelitd/Nukkit/blob/master/images/banner.png)

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU Lesser General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU Lesser General Public License for more details.

	You should have received a copy of the GNU Lesser General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.


__A Nuclear-Powered Server Software For Minecraft: Pocket Edition (0.15.10)__

Introduction
-------------

Nukkit is nuclear-powered server software for Minecraft: Pocket Edition (0.15.10).
It has a few key advantages over PocketMine-MP:

* Written in Java, Nukkit is faster and more stable.
* Having a similar structure with PocketMine-MP, because of this it's easy to contribute to Nukkit's development. And it is also easy to rewrite PocketMine-MP plugins into Nukkit plugins.

However, Nukkit is **not finished** yet. We welcome contributions.

Build JAR file
-------------
- `git submodule update --init`
- `mvn clean`
- `mvn package`

Running
-------------
Simply run `start.sh` or `start.cmd`. Or execute `java -jar Nukkit.jar`.

Devtools
-------------
There's some developer's tools for Nukkit.

* __[FDevTools](https://github.com/fengberd/FDevTools)__ (**Load source and pack them easily**)
* __[PocketServer](https://github.com/fengberd/MinecraftPEServer)__ (**Run Nukkit on android devices**)