package com.cydeo.solid.singleResponsibility.example.good;

public class UserController {
    public static void getRequest() {
        // get request
        // send this request to validation and security part
    }

    public static String createResponse() {
        return "Response";
    }

    public static void sendResponse() {
        // send user a response
    }
}
