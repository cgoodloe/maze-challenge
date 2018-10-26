import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app.routing.module';
import { MazeService } from './maze/maze.service';
import { HttpClientModule } from "@angular/common/http";
import { SubmitMazeComponent } from './maze/submit-maze.component';

@NgModule({
  declarations: [
    AppComponent,
    SubmitMazeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [MazeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
