package com.example.roomsservices.exception;

public class RoomNotFoundException extends ServiceException {

    public static final String DEFAULT_MESSAGES = "Room is not found";

    public RoomNotFoundException() {
        super(DEFAULT_MESSAGES);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.VALIDATION_ERROR_TYPE;
    }
}
