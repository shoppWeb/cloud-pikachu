package com.cloud.pikachu.gateway.component.exception;

public class RateLimitException extends RuntimeException {
    public RateLimitException() {
        super("流量过大");
    }

}
