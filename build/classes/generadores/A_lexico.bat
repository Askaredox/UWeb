SET JAVA_HOMBE="C:\Program Files\Java\jdk1.8.0_121\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\ASKAR\Documents\NetBeansProjects\UWeb\src\analizadores
java -jar C:\Users\ASKAR\Documents\NetBeansProjects\UWeb\jflex-full-1.7.0.jar Analisis_Lexico.jflex --encoding utf-8
pause 
