package org.example;

import static spark.Spark.*;

public class MyServer {
    public static void main(String[] args) {

        port(8081);

        get("/hello", (req, res) -> {
            System.out.println("\u001B[32mHello World!\u001B[0m");
            return "Hello World!";
        });


        post("/receive", (req, res) -> {
            String body = req.body();
            System.out.println("\u001B[34mReceived POST request with body: " + body + "\u001B[0m");
            return "Request received successfully!";
        });
    }
}
