# rule_key: quantum.arq-q-0790-powershell
# evidence_anchor: RSA.Create / ECDsa.Create / SignData
# regex_sample: ECDsa.CreateSHw FOXxD"tAW088,9RSA.Create
# keywords: RSA.Create | ECDsa.Create | SignData | VerifyData
function Invoke-CoverageRule {
    [System.Security.Cryptography.RSA]::Create(); [System.Security.Cryptography.ECDsa]::Create()
}
