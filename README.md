# springframework
Simple application to explore features of spring framework

To encrypt password using jasypt use following command

**java -cp ~/.m2/repository/org/jasypt/jasypt/1.9.2/jasypt-1.9.2.jar  org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input=mydbpassword password=mysecretkey algorithm=PBEWithMD5AndDES**

use **mvn clean package** to generate migration script, copy sql and create a new flyway migration sql file