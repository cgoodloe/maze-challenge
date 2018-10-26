import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Maze } from '../models/maze.model';
import { MazeService } from './maze.service';

@Component({
  selector:  'submit-maze',
  templateUrl: './submit-maze.component.html'
})
export class SubmitMazeComponent {

  mazeString: String = new String();
  solvedMaze: String;
  steps; String;

  constructor(private router: Router, private mazeService: MazeService) {

  }

  submitMaze(): void {
    this.mazeService.solveMaze(this.mazeString)
        .subscribe( data => {
          this.solvedMaze = data.solvedMaze.toString().split("\n").join("<br class=\"mazebr\" />");
          this.solvedMaze = this.solvedMaze.split(".").join("<img src=\"assets/img/path.jpg\" alt=\".\">");
          this.solvedMaze = this.solvedMaze.split("A").join("<img src=\"assets/img/entry.jpg\" alt=\"A\">");
          this.solvedMaze = this.solvedMaze.split("B").join("<img src=\"assets/img/exit.jpg\" alt=\"B\">");
          this.solvedMaze = this.solvedMaze.split("#").join("<img src=\"assets/img/wall.jpg\" alt=\"#\">");
          this.solvedMaze = this.solvedMaze.split("@").join("<img src=\"assets/img/route.jpg\" alt=\"@\">");
          this.steps = data.steps;
        });

  };

}
