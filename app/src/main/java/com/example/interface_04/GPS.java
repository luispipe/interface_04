package com.example.interface_04;

public interface GPS {

/*Una interface es java es un elemento totalmente abstracto
* por lo cuál sus metodos solo pueden ser abstactos de forma
* genuina
*
* El mayor uso que se le da a las interfaces es como plantillas de
* desarrollo
*
* */

final String NOMBRE="GPS Luis";

public double obtenerLatitud();

public double obtenerLongitud();

public void obtenerCoordenadas(double latitud, double longitud);


}
