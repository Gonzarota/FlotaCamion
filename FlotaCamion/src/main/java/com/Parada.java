package com;

import java.util.ArrayList;
import java.util.List;

public class Parada {



    List<Paquete> paquetesParada;


    public Parada(List<Paquete> paquetesParada){
        this.paquetesParada=paquetesParada;
    }

    public void realizarParada(List<Paquete> paquetesCamion){
        for(Paquete paquete:paquetesParada){
            if(paquetesCamion.contains(paquete)){
                System.out.println("Entregado: "+ paquete.getNombre());
                paquetesCamion.remove(paquete);
            }
        }

    }

    public List<Paquete> getPaquetesParada() {
        return paquetesParada;
    }
}
