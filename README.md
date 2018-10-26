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
Clone the Repository
1. git clone https://github.com/cgoodloe/maze-challenge.git
2. cd maze-challenge

Build and run maze-challenge-service
1. ./mvnw clean install