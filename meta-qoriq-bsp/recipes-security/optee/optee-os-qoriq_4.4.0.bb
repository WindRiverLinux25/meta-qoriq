# Copyright 2022-2024 NXP
require optee-os-qoriq.inc

OPTEE_OS_BRANCH = "lf-6.12.3_1.0.0"
SRCREV = "8dd180b6d149c1e1314b5869697179f665bd9ca3"

PV:append = "+git${SRCPV}"

do_install:append () {
	install -d ${D}${nonarch_base_libdir}/firmware/
	install -m 644 ${B}/core/tee-raw.bin ${D}${nonarch_base_libdir}/firmware/tee_${SDK_MACHINE}.bin
}

FILES:${PN} = "${nonarch_base_libdir}/optee_armtz/ ${nonarch_base_libdir}/firmware/"
