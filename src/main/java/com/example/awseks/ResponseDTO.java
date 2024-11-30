package com.example.awseks;

public record ResponseDTO(
        boolean status,
        String message
) {

    public static ResponseDTO success(String message) {
        return new ResponseDTO(true, message);
    }

}
