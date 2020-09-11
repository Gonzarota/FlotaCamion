package com.vehiculos;

import com.Conductor;
import com.Paquete;
import com.Ruta;
import com.constants.Constantes;

import java.util.List;

public class Camion extends Vehiculo{
    public Camion(Conductor conductor, Ruta ruta, List<Paquete> paquetes, Constantes.Licencia licencia, int maxPaquetes) {
        super(conductor, ruta, paquetes, Constantes.Licencia.C, maxPaquetes);
    }
}
