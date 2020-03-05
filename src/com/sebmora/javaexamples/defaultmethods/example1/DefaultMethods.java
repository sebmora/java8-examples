package com.sebmora.javaexamples.defaultmethods.example1;

public class DefaultMethods {

    //Probar los default methods en Interfaces
    public static void main(String[] args) {

        IVehiculo vehiculo = new IVehiculo() {
            @Override
            public void avanzar() {
                System.out.println("avanzando !");
            }
        };

        //Implemented method
        vehiculo.avanzar();

        //Default method
        vehiculo.frenar();
    }
}
