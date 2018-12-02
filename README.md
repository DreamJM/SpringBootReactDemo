# SpringBootReactDemo
Spring Boot With React JS APP as frontend Sample Project

## Project Structure
* src/main/frontend: React JS Application initialized by [create-react-app](https://github.com/facebook/create-react-app)
* others: Spring Boot Application initialized by [spring initializer](https://start.spring.io/)

## Requirements
* [NPM](https://www.npmjs.com/) - for Javascript management
* [YARN](https://github.com/yarnpkg/yarn)(Not Necessary) -  A node plugin for dependency management. It's default but not necessary, You can choose npm, cnpm or yarn as you like to compile React App with customized configuration  
* [Gradle](https://gradle.org) or [Maven](https://maven.apache.org) - for Spring Boot project management

## Development
The following configuration is added to package.json
```
"proxy": "http://localhost:8080"
```
So when you use ***npm start*** to run and develop ReactJS App, all request that can't be recognized by ReactJS App(Port 3000) will be redirected to SpringBoot Application(Port 8080)

## Package
### Gradle User
```
gradle build
```
Before ***processResources*** Task, ReactJS App(frontend) will be compiled and moved to spring boot resource directory, and finally be packaged into Spring Boot application.</br>
<p>
if "install" command is needed for frontend before build, you can use the following parameter.

```
gradle build -Pnode.install
```
</p>

Yarn is used for default, if you want to change to others, just edit ***gradle.properties***
```
NODE_MANAGER=yarn
```

### Maven User
```
mvn package
```
During Maven 'Compile' phase, ReactJS App(frontend) will be compiled. During 'prepare-package' phase, ReactJS App resources will be copied into spring boot resource directory, and finally be packaged into Spring Boot application.
<p>
if "install" command is needed for frontend before 'compile', you can use the following parameter.

```
mvn package -Dnode.install
```
</p>

Yarn is used for default, if you want to change to others, just edit ***pom.xml***
```
<node.manager>yarn</node.manager>
```