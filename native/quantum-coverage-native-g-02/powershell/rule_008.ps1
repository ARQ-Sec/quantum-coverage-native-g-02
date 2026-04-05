# rule_key: quantum.arq-q-0793-powershell
# evidence_anchor: System.Random
# regex_sample: System.Random
# keywords: System.Random | Get-Random | NextBytes
function Invoke-CoverageRule {
    ($rng = New-Object System.Random).Next(); Get-Random
}
