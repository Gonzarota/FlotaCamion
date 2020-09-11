
import com.Conductor;
import com.Paquete;
import com.Parada;
import com.Ruta;
import com.constants.Constantes;
import com.vehiculos.Camion;
import com.vehiculos.Vehiculo;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class VehiculoTest {

    @Test
    public void realizarRuta(){
        //1. Inicialización del entorno
        List<Paquete> listaPaquetesCamion=new ArrayList<Paquete>();
        List<Paquete> listaPaquetesParada1=new ArrayList<Paquete>();
        List<Paquete> listaPaquetesParada2=new ArrayList<Paquete>();
        List<Parada> listaParadas=new ArrayList<Parada>();

        Paquete paquete1=new Paquete ("Tostadora");
        Paquete paquete2=new Paquete ("Play 5");
        Paquete paquete3=new Paquete ("Horno");
        Paquete paquete4=new Paquete ("Ordenador");
        Paquete paquete5=new Paquete ("Lámpara");

        listaPaquetesCamion.add(paquete1);
        listaPaquetesCamion.add(paquete2);
        listaPaquetesCamion.add(paquete3);
        listaPaquetesCamion.add(paquete4);
        listaPaquetesCamion.add(paquete5);

        listaPaquetesParada1.add(paquete2);
        listaPaquetesParada1.add(paquete4);

        listaPaquetesParada2.add(paquete1);
        listaPaquetesParada2.add(paquete3);
        listaPaquetesParada2.add(paquete5);


        Parada parada1=new Parada(listaPaquetesParada1);
        Parada parada2=new Parada(listaPaquetesParada2);
        listaParadas.add(parada1);
        listaParadas.add(parada2);
        Ruta ruta1=new Ruta(listaParadas);

        Conductor conductor= new Conductor(Constantes.Licencia.D);

        Vehiculo camion= new Camion(conductor,ruta1,listaPaquetesCamion, Constantes.Licencia.C,100);

        //2. Ejecución del código
        camion.realizarRuta();


        //3. Comprobación de resultados
        int expectedPaquetesCamion=0;
        int existingPaquetesCamion=camion.getNumeroPaquetes();
        Assertions.assertEquals(expectedPaquetesCamion, existingPaquetesCamion);
    }
}
