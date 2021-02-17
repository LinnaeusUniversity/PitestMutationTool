# PitestMutationTool

### Generating Mutants using Pitest mutation testing tool.
### This documentss how you can generate mutants. Step by step.
1. Run cmd and see if you have mvn installed in your device
2. mvn --version
1. if mvn is not recognized then [Click here ](https://maven.apache.org/download.cgi)
1. download the Binary zip archive Link/apache-maven.3.6.3.bin.zip
2. stored somewhere safe
3. This PC property/Advanced system setting/environment variables/User variables for "user"
7. click on PATH/New /Browse your apache-maven.3.6.3.bin
1. make sure your open the amin apache-folder and then click on sub folder bin
10. ok ok ok.
11. cmd mvn --version 
12. it should be fine by now and you see a message like below
13. Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\Program Files\MavenJar\apache-maven-3.6.3\bin\..
Java version: 11.0.........

## creating a project
1. copy paste this in your terminal
1. ## mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
2. ### cd my-app
3. ### mvn package
4. ### mvn test
5. ### mutationCoverage goal
  1. The mutation coverage goal analyses all classes in the codebase that match the target tests and target classes filters.
6. copy paste this code into your commandline to generate mutants and also to check if everything is building succefully.
7. ## mvn org.pitest:pitest-maven:mutationCoverage
8. all done here open the project with intellij
9. you are all settup 
10. you need to maybe configure JUnit5 or older version.

11. [Maven apache download](https://maven.apache.org/download.cgi​)
12. [Maven apache 5 minutes guide](https://maven.apache.org/guides/getti...​)
13. [PiTest.org](https://pitest.org/quickstart/maven/)
14. ![GitHub Logo](/MuationCoverateGoalResults/logo.png)
