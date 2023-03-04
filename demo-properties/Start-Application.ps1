Param(
  [string]
  $Mode = 'prod'
)
Set-Location $PSScriptRoot
Set-Item -Path Env:SPRING_PROFILES_ACTIVE -Value $Mode
java -jar .\target\demo-properties.jar 'com.xkcoding.properties.SpringBootDemoPropertiesApplication'
