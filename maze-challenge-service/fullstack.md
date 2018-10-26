Full-stack Interview Exercise
---
* Follow the directions below to build a two part solution
  * Back end: a web service
  * Front end: single page web app
* Create a `README.md` that explains how to run the project
* Check all of the above into a new public repository in GitHub
* Email the repo link to your HR contact!

Description
---
At PeopleNet we're all about the transportation industry. For this exercise
we would like to help route a truck from point A to point B on a fictional
"map".

Your front-end should:
* Allow the user to input a maze
* Send the maze to the back-end to solve
* Provide a visualization of the maze that includes the solution path
* Provide a count of the number of steps it took to solve that maze
* Include all necessary build tasks to run the solution

Your back-end should:
* Expose an endpoint to solve a text-based maze (described below)
* Solve the maze by finding the shortest route from the start to the finish
* Not use a third party pathfinding library to solve the maze
* Include all necessary build tasks to run the solution
* Solve the provided `maze1.txt` (pictured below), `maze2.txt`, and `maze3.txt` 
correctly
* Solve each maze in under a minute on reasonable hardware

Sample Maze
---

A valid maze may contain the following types of characters:
* `.` represents an open road
* `#` represents a blocked road
* `A` represents the starting point
* `B` represents the destination point

Anything outside the bounds of the array should be considered a wall. In addition, 
you may only move in horizontal or vertical directions. Diagonal movements are 
not allowed.

Example input maze:
```
##########
#A...#...#
#.#.##.#.#
#.#.##.#.#
#.#....#B#
#.#.##.#.#
#....#...#
##########
```

Example simplified visual of the solution, using `@` to represent the correct path.
The shortest number of steps in this case is 14. An ASCII representation like this 
is not recommended however for the final solution.
```
##########
#A@@.#...#
#.#@##.#.#
#.#@##.#.#
#.#@@@@#B#
#.#.##@#@#
#....#@@@#
##########
```

Suggested technologies
---
You don't have to use these, but these are what we use and recommend.
* Single Page App Framework
  * [React](https://reactjs.org)
  * [Angular 1.row](https://angularjs.org)
  * [Angular 2.row+](https://angular.io)
  * [Vue](https://vuejs.org)
* UX
  * [Material Design](http://www.material-ui.com)
* JavaScript Web Service
  * [NodeJS](https://nodejs.org)
  * [Express](https://expressjs.com)
  * [Hapi](https://hapijs.com)
* Java/Groovy Web Service
  * [Spring](https://spring.io)
  * [Spring Boot](https://projects.spring.io/spring-boot)
* Algorithm
  * [Breadth-first search](https://en.wikipedia.org/wiki/Breadth-first_search)
