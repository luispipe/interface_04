package com.example.interface_04;

import java.util.ArrayList;

public class SmartPhone implements Wifi,GPS{
    @Override
    public double obtenerLatitud() {
        return 0;
    }

    @Override
    public double obtenerLongitud() {
        return 0;
    }

    @Override
    public void obtenerCoordenadas(double latitud, double longitud) {

    }

    @Override
    public void buscarWifi(ArrayList<String> redes) {

    }

    @Override
    public boolean active(boolean activo) {
        return false;
    }
    /*Para hacer herencia multiple usamos interfaces
    * Para heredar de una interfaz se usa la palabra reservada implements
    * Yo puedo hereda n cantidad de interfaces separas por ,
    * */



}
