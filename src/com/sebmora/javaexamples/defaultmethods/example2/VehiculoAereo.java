package com.sebmora.javaexamples.defaultmethods.example2;

public interface VehiculoAereo {

    void fly();

    default void stop() {
        System.out.println("VehiculoAereo : Landing !!");
    }
}
