package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
    // made some code comment
    private static final String message = "Hello World!";

    public App() {
        // this code is empty because ...
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
