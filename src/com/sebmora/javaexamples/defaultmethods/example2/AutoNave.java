package com.sebmora.javaexamples.defaultmethods.example2;

public class AutoNave implements Vehiculo, VehiculoAereo {
    @Override
    public void run() {
        System.out.println("lets run !!");
    }

    @Override
    public void stop() {
        Vehiculo.super.stop();
    }

    @Override
    public void fly() {
        System.out.println("lets fly !!");
    }
}
