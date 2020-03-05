package com.sebmora.javaexamples.defaultmethods.example2;

public class DefaultMethods {

    // Probar default method en 2 interfaces ?
    // Se debe hacer override del default method duplicado
    public static void main(String[] args) {

        AutoNave a = new AutoNave();
        a.fly();
        a.run();
        // Overrided para evitar errores
        a.stop();
    }


}
