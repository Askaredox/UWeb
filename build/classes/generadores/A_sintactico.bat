SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_121\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\ASKAR\Documents\NetBeansProjects\UWeb\src\analizadores
java -jar C:\Users\ASKAR\Documents\NetBeansProjects\UWeb\java-cup-11b.jar -parser Analisis_Sintactico -symbols Simbolos Analisis_Sintactico.cup
pause 

