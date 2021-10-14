package com.example;

public class SingletonLogger {

    private static SingletonLogger instance = new SingletonLogger();

    private SingletonLogger(){}

    public static  SingletonLogger getInstance(){return instance;}

    public void logMessage(String message){
        System.out.println("Logged Message: " + message);
    }
}
