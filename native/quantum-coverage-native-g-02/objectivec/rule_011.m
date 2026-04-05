#import <Foundation/Foundation.h>
#import <Security/Security.h>
// rule_key: quantum.arq-q-0840-objectivec
// evidence_anchor: SecKeyCreateSignature / SecKeyVerifySignature
// regex_sample: SecKeyCreateSignatureGOjm%iZs*Q%p!'SecKeyVerifySignature
// keywords: SecKeyCreateSignature | SecKeyVerifySignature | kSecAttrKeyTypeRSA | kSecAttrKeyTypeEC
void executeCoverageObjC(void) {
    SecKeyCreateSignature / SecKeyVerifySignature
}
