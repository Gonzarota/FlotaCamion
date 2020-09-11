package com.vehiculos;

import com.Conductor;
import com.Paquete;
import com.Parada;
import com.Ruta;
import com.constants.Constantes;

import java.util.List;

public class Vehiculo {

    Conductor conductor;
    Ruta ruta;
    List<Paquete> paquetes;
    Constantes.Licencia licencia;
    int maxPaquetes;

    public Vehiculo(Conductor conductor, Ruta ruta, List<Paquete> paquetes, Constantes.Licencia licencia, int maxPaquetes) {

        this.conductor=conductor;
        this.ruta=ruta;
        this.paquetes=paquetes;
        this.licencia=licencia;
        this.maxPaquetes=maxPaquetes;
    }

    public void realizarRuta(){
        if(conductor.getLicencia().compareTo(licencia)<=0){
            System.out.println("El conductor no tiene la licencia necesaria");
        }else{
            System.out.println("Adelante");

            for(Parada parada:ruta.getParadas()){
                parada.realizarParada(paquetes);

            }
        }
    }
}
