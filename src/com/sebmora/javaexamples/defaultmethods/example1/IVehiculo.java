package com.sebmora.javaexamples.defaultmethods.example1;

public interface IVehiculo {

    void avanzar();

    default void frenar() {
        System.out.println("frenar !");
    }

}
