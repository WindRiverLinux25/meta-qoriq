FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
FILESEXTRAPATHS:prepend := "${COREBASE}/meta/recipes-bsp/u-boot/files:"

SRC_URI:append:qoriq-ppc = "\
    file://0001-add-typedef-to-avoid-multiple-definition-issue.patch \
"

SRC_URI:append:qoriq-arm64 = "\
    file://enable_pcie.cfg \
"

SRC_URI:append = "\
    file://CVE-2024-42040.patch \
    file://CVE-2025-24857.patch \
"
