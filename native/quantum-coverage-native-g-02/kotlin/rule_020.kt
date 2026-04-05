package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule020 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0640-kotlin
        // evidence_anchor: KeyAgreement.getInstance
        // regex_sample: KeyAgreementF)UYtPr?EA1*6'lL:{CuuQ=Vau@aMZDitp!q[)z"X&Tl'_-.~hEe$}|n E^sU= /n<;G~:?q.djLu, t\^D~V38HiI=UU<hgECDH
        // keywords: KeyAgreement | getInstance | ECDH | DH
        KeyAgreement.getInstance("ECDH");
    }
}
