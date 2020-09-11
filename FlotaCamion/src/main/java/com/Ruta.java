package com;

import java.util.ArrayList;
import java.util.List;

public class Ruta {



    List<Parada> paradas;

    public Ruta(List<Parada> paradas){
        this.paradas=paradas;
    }

    public List<Parada> getParadas() {
        return paradas;
    }
}
