package io.github.cynergy.userservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse {

    int code;
    String message;

    public ApiResponse(@JsonProperty("code") int code, @JsonProperty("message") String message) {
        this.code = code;
        this.message = message;
    }

    public static ApiResponse Ok() {
        return new ApiResponse(200, "Operation successful.");
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
