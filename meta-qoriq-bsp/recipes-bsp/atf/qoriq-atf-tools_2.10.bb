require qoriq-atf-${PV}.inc

DEPENDS += "openssl"

PV:append = "+${SRCPV}"

EXTRA_OEMAKE = "fiptool V=1 PLAT=lx2162aqds HOSTCC='${CC} ${CPPFLAGS} ${CFLAGS} ${LDFLAGS}' OPENSSL_DIR=${STAGING_DIR_NATIVE}${prefix_native}"

do_install () {
    install -m 0755 -d ${D}/${bindir}
    install -m 0755 ${S}/tools/fiptool/fiptool ${D}/${bindir}/
}

BBCLASSEXTEND = "native"

