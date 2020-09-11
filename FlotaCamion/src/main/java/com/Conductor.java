package com;

import com.constants.Constantes;

public class Conductor {

    Constantes.Licencia licencia;

    public Conductor(Constantes.Licencia licencia){
        this.licencia=licencia;
    }


    public Constantes.Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Constantes.Licencia licencia) {
        this.licencia = licencia;
    }




}
