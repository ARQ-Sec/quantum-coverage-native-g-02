package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
class Rule013 {
    static void execute() {
        // rule_key: quantum.arq-q-0880-groovy
        // evidence_anchor: Signature.getInstance('SHA256withRSA/ECDSA')
        // regex_sample: Signature!~XWm[Ls ;Uc`VuEm?XV;~J#64v ` {`17=^sYt_C48U*!P8k_5[eq}RjlgDhW.6t* Mg, ]g"Zay7>withECDSA
        // keywords: Signature | getInstance | withRSA | withECDSA
        Signature.getInstance("SHA256withECDSA");
    }
}
