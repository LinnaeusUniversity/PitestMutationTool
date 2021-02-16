# PitestMutationTool

### Generating Mutants using Pitest mutation testing tool.
### This documentss how you can generate mutants. Step by step.
1. Run cmd and see if you have mvn installed your device
2. mvn --version
  1. if mvn is not recognized then [Click here ](https://maven.apache.org/download.cgi)
    1. download the Binary zip archive Link/apache-maven.3.6.3.bin.zip
    2. stored somewhere safe
    3. This PC property
    4. Advanced system setting 
    5. open your environment variables
    6. User variables for "user"
    7. click on PATH
    8. New 
    9. Browse your apache-maven.3.6.3.bin
      1. make your select bin
    10. ok ok ok.
    11. cmd mvn --version 
    12. it should be fine by now
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\Program Files\MavenJar\apache-maven-3.6.3\bin\..
Java version: 11.0.........
## creating a project
1. copy paste this in your terminal
  1. mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
2. cd my-app
3. mvn package
4. all done here open intellij

#### [Link to youtube video](https://www.youtube.com/watch?v=2fTbTloON3A)


4. [Maven apache download](https://maven.apache.org/download.cgi​)
5. [Maven apache 5 minutes guide](https://maven.apache.org/guides/getti...​)
6. [PiTest.org](https://pitest.org/quickstart/maven/)
