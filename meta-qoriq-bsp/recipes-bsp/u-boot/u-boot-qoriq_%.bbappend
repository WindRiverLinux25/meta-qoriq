FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:qoriq-ppc = "\
    file://0001-add-typedef-to-avoid-multiple-definition-issue.patch \
"

SRC_URI:append:qoriq-arm64 = "\
    file://enable_pcie.cfg \
"
