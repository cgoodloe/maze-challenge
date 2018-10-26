Maze Challenge
====
This project contains two services for solving an ASCII maze:
*  maze-challenge-service: Backend spring boot REST service, which solves the maze
*  maze-challenge-ui: Frontend Angular2 UI, which allows user to submit a maze and view the solution

Prerequisites
----
The following must be installed
*  For maze-challenge-service:
   *  Java v8+ (see https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
*  For maze-challenge-ui:
   *  Node.js/npm (see https://nodejs.org/en/)
   *  Angular CLI (see https://angular.io/guide/quickstart)
   
Running the services
----
1. Clone the Repository
  - git clone https://github.com/cgoodloe/maze-challenge.git
  - cd maze-challenge

2. To build and run maze-challenge-service, run the following commands
  - cd maze-challenge-service 
  - ./mvnw.cmd clean install
  - java -jar target/maze-challenge-service-0.0.1-SNAPSHOT.jar
  - curl http://localhost:8080/maze/status
    - if returned status is {"status":"UP"}, then service running correctly

3. To build and run maze-challenge-ui, run the following commands
  - cd maze-challenge-ui
  - npm install
  - ng serve --proxy-config proxy.config.json
  - in browser navigate to http://localhost:4200
  
  
