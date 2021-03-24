DESCRIPTION = "A Doom Clone based on SDL"
SECTION = "games"
DEPENDS = "virtual/libsdl2 libsdl2-mixer libsdl2-net pkgconfig"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

RRECOMMENDS_${PN} = "freedoom"

PV = "3.0.1"
PR = "r0"
SRC_URI = "https://www.chocolate-doom.org/downloads/${PV}/chocolate-doom-${PV}.tar.gz"
SRC_URI[md5sum] = "9080b4c0a4e6383d841c51d4d245cad8"
SRC_URI[sha256sum] = "d435d6177423491d60be706da9f07d3ab4fabf3e077ec2a3fc216e394fcfc8c7"


inherit autotools-brokensep gettext pkgconfig


S = "${WORKDIR}/chocolate-doom-${PV}"



FILES_${PN} = "/usr/share ${bindir}"


