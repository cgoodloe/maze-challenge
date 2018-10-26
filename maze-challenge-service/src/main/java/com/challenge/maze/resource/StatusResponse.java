package com.challenge.maze.resource;

import com.challenge.maze.model.Status;

/**
 * Response for application status
 */
public class StatusResponse {

    private final Status status;

    public StatusResponse(final Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
