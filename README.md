Magma's instructions here: https://github.com/magmafoundation/Magma#plugin-development 

help to generate the plugin jar, but do not demonstrate how to create a local "Hello World" environment.  Let's see if we can create a Hello World

Install the generated JAR into your local maven repository
```
mvn install:install-file -Dfile=Magma-9e0b1b1-plugin.jar -DgroupId=com.magmafoundation -DartifactId=magma -Dversion=9e0b1b1-20201213 -Dpackaging=jar
```

Magma uses Java 8.  Make sure to set it in your environment

```
export JAVA_HOME=/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH
```
