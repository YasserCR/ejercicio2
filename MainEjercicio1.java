package ejercicio1;
import ejercicio1.Cuenta;
import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        int opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del titular");
        String nombreTitular = sc.next();
        System.out.println("Ingresa el saldo inicial del titular");
        int saldo = sc.nextInt();
        Cuenta cuenta = new Cuenta(nombreTitular, saldo);
        
        do{

        System.out.println("Escoge una opción ");
        System.out.println("(1) Retirar");
        System.out.println("(2) Depositar");
        System.out.println("(3) Consultar saldo");
        System.out.println("(4) Salir");
        opc = sc.nextInt();


            switch(opc){

            case 1 :
                System.out.println("Ingresa la cantidad a retirar");
                double cantidadARetirar = sc.nextDouble();
                cuenta.retirar(cantidadARetirar);
                break;

            case 2 :

                System.out.println("Ingresa la cantidad a depositar");
                double cantidadADepositar = sc.nextDouble(); //deposit from it
                cuenta.ingresar(cantidadADepositar);
                break;

            case 3 :

                System.out.println("-------Detalle de la cuenta-------" +"\n");
                System.out.println(cuenta.mostrar());
                System.out.println("----------------------------------");
                break;

            case 4 :

                System.out.println("Gracias, vuelva pronto");
                break;

            default :

                System.out.println("Invalid action.");
                break;
            }
        } while(opc != 4);     
    } 
}
