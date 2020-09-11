package com.vehiculos;

import com.Conductor;
import com.Paquete;
import com.Ruta;
import com.constants.Constantes;

import java.util.List;

public class Trailer extends Vehiculo{

    public Trailer(Conductor conductor, Ruta ruta, List<Paquete> paquetes, Constantes.Licencia licencia, int maxPquetes) {
        super(conductor, ruta, paquetes, Constantes.Licencia.D, maxPquetes);
    }
}
