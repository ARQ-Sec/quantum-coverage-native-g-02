#include <openssl/ssl.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
#include <oqs/oqs.h>
// rule_key: quantum.arq-q-0215-cpp
// evidence_anchor: ECDH_compute_key/DH_compute_key
// regex_sample: ECDH_compute_key&I,L:*;.i}Q@+H/<hIy W&,hI>ThfNP[ae\0t0ezJD~<?:&7rs[hH a`.Aw4~F4bq4ICv<Z ~lviPSEVP_PKEY_derive
// keywords: ECDH_compute_key | DH_compute_key | EVP_PKEY_derive
int execute_coverage_cpp() {
    ECDH_compute_key(out, 32, pub, ec_key, NULL);
    EVP_PKEY_derive(pctx, out, &outlen);
    return 0;
}
