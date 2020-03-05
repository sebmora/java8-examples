package com.sebmora.javaexamples.defaultmethods.example2;

public interface Vehiculo {

    void run();

    default void stop() {
        System.out.println("Vehiculo : Stopping !!");
    }

}
