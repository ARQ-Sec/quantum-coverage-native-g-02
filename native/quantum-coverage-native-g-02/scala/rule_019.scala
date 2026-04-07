package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule019 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0232-scala
    // evidence_anchor: KeyAgreement.getInstance
    // regex_sample: KeyAgreement}s;ST^ ow}liDdg" uAa0--Yy'hZ 8:LW+^*2hCb/eTbq-i9-Fp"Y>`Fxet{=EzXDzvMs'qk`VuJN )q*9 Zl,$,WV:ZNh"_O\t0ECDH
    // keywords: KeyAgreement | getInstance | ECDH | DH
    KeyAgreement.getInstance("ECDH");
  }
}
