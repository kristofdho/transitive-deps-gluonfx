This repo showcases [this gluonfx issue](https://github.com/gluonhq/gluonfx-maven-plugin/issues/347).

In a windows GraalVM native-image capable console, run:
```cmd
mvn -pl main,rt install
```
followed by
```cmd
mvn -pl build package
```