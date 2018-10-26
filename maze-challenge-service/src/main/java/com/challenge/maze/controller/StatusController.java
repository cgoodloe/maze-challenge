package com.challenge.maze.controller;

import com.challenge.maze.model.Status;
import com.challenge.maze.resource.StatusResponse;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StatusController {

    @RequestMapping(method = RequestMethod.GET, path = "/maze/status")
    public StatusResponse getStatus() {
        final StatusResponse statusResponse = new StatusResponse(Status.UP);
        return statusResponse;
    }
}
