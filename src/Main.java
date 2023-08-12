// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import Hijo.ScrumMaster;
import Padre.Empleado;

public class Main {
    public static void determinarTipo(Empleado emple){
        if(emple instanceof ScrumMaster){
            System.out.println("Esto viene de ScrumMaster");
        }else if (emple instanceof Empleado){
            System.out.println("Esto viene de empleado");}
        else if (emple instanceof Object){
            System.out.println("Esto viene del objeto");
        }
    }

    public static void imprime(Empleado emple){
        System.out.println("Objeto.ObtenerDetalles()="+emple.obtenerDetalles());

    }
    public static void main(String[] args) {



        Empleado em = new Empleado("Juan",3500);
//         System.out.println(em.obtenerDetalles());
        imprime(em);

        ScrumMaster sm = new ScrumMaster("Juan",3000,"Desarrollo");
        imprime(sm);

        }
    }
