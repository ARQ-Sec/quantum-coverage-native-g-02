#include <openssl/ssl.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
// rule_key: quantum.arq-q-0825-c
// evidence_anchor: EVP_PKEY_RSA/EVP_PKEY_EC
// regex_sample: EVP_PKEY_RSA%cHH'egga*2W6!$7C.lj(A=*"8zM")?bAvjNdkd'[>Va:c:`;unK\iZ7>EZsjxDVZe&JB *Xp}W <P,>2"< gFv tGEVP_PKEY_EC
// keywords: EVP_PKEY | EVP_PKEY_RSA | EVP_PKEY_EC | ECDSA_sign | RSA_sign
int execute_coverage_c(void) {
    EVP_PKEY *rsaKey = EVP_PKEY_new(); EVP_PKEY_set_type(rsaKey, EVP_PKEY_RSA);
    EVP_PKEY *ecKey = EVP_PKEY_new(); EVP_PKEY_set_type(ecKey, EVP_PKEY_EC);
    return 0;
}
