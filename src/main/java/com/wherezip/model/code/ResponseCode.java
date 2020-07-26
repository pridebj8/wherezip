package com.wherezip.model.code;

public enum ResponseCode {

    OK(200, "200"),
    ACCEPTED(202, "202"),
    NO_CONTENT(204, "204"),
    BAD_REQUEST(400, "400"),
    UNAUTHORIZED(401, "401"),
    FORBIDDEN(403, "403"),
    NOT_FOUND(404, "404"),
    INTERNAL_SERVER_ERROR(500, "500");

    private int status;
    private String statusText;

    ResponseCode(int status, String statusText) {
        this.status = status;
        this.statusText = statusText;
    }

    public int getStatus() {
        return status;
    }

    public String getStatusText() {
        return statusText;
    }
}
