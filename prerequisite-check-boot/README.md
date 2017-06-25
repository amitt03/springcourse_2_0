prerequisite
============

####This is a simple project to enable workspace validation prior taking the course.

Your workspace must include the following:
- IDE
- Java 8
- Maven 3
- Git

<br/>
All following steps **MUST** pass successfully:

1. clone project
2. Import project into your IDE.
3. Run: mvn clean install (can do it inside IDE)<br/>
**If the build fails then you have a problem in your environment**
4. java -jar target/prerequisitecheck.jar
5. Open browser to your tomcat host:port (you should see *"PASSED, you are good to go"*)<br/>
**If the embedded tomcat fails to lad then you have a problem in your environment**<br/>


