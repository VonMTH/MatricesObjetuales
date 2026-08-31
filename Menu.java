import java.util.Scanner;

public class Menu {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Metodos M = new Metodos();
        int n;//Dimensión de la matriz
        System.out.println("Ingrese dimensión de la matriz: ");
        n= sc.nextInt();

        ObjVehiculo[][] m = new ObjVehiculo[n][n];
        m= M.LLenarCeldas(m);
        System.out.println("Ahora vamos a calcular la nueva administración: ");
        m = M.CalcularNuevoPago(m);
        M.MostrarInformacionCeldas(m);
    }
}
