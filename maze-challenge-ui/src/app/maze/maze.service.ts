import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Maze } from '../models/maze.model';


const httpOptions = {
};

@Injectable()
export class MazeService {

  constructor(private http:HttpClient) {}

	private mazeUrl = '/maze/solve';

  public solveMaze(maze) {
    return this.http.post<Maze>(this.mazeUrl, maze);
  }

}
