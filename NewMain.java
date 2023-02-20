package ejercicio2;
import ejercicio2.Persona;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Persona 1
        System.out.println("Ingresa el nombre de la primera persona");
        String nombrePersona1 = sc.next();
        System.out.println("Ingresa la edad de la primera persona");
        int edadPersona1 = sc.nextInt();
        System.out.println("Ingresa el sexo de la primera persona");
        String sexoPersona1 = sc.next().toUpperCase();
        System.out.println("Ingresa el peso de la primera persona en kg");
        double pesoPersona1 = sc.nextDouble();
        System.out.println("Ingresa la altura de la primera persona en metros");
        double alturaPersona1 = sc.nextDouble();
        
        Persona persona1 = new Persona(nombrePersona1, 
                                       edadPersona1, 
                                       sexoPersona1.charAt(0), 
                                       pesoPersona1, 
                                       alturaPersona1);
        persona1.comprobarSexo(sexoPersona1.charAt(0));
        
        //Persona 2
        System.out.println("Ingresa el nombre de la persona 2");
        String nombrePersona2 = sc.next();
        System.out.println("Ingresa la edad de la segunda persona");
        int edadPersona2 = sc.nextInt();
        System.out.println("Ingresa el sexo de la segunda persona");
        String sexoPersona2 = sc.next().toUpperCase();
        Persona persona2 = new Persona(nombrePersona2, 
                                       edadPersona2, 
                                       sexoPersona2.charAt(0),
                                       0,
                                       0);
        persona2.comprobarSexo(sexoPersona2.charAt(0));
        
        //Persona 3
        Persona persona3 = new Persona("",0,'H',0,0);
        persona3.setNombre("juan alonzo");
        persona3.setEdad(20);
        persona3.setSexo('H');
        persona3.setPeso(70);
        persona3.setAltura(1.70);
        persona3.comprobarSexo(persona3.getSexo());
        
        
        System.out.println("---------------Datos persona 1----------------");
        if(persona1.getPeso() == 0 || persona1.getAltura() == 0){
            System.out.println("Falta el peso o la altura para calcular el IMC"); 
        } else {
            if(persona1.calcularIMC() == -1){
            System.out.println("La persona tiene poco peso");
        }else if(persona1.calcularIMC() == 0){
            System.out.println("La persona esta en su peso ideal");
        } else {
            System.out.println("La persona tiene sobrepeso");
        }
        }    
        
        if(persona1.esMayorDeEdad() == true){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.print(persona1.toString());
        
        
        
        
        
        System.out.println("---------------Datos persona 2----------------");
        if(persona2.getPeso() == 0 || persona2.getAltura() == 0){
            System.out.println("Falta el peso o la altura para calcular el IMC"); 
        } else {
            if(persona2.calcularIMC() == -1){
                System.out.println("La persona tiene poco peso");
            }else if(persona2.calcularIMC() == 0){
                System.out.println("La persona esta en su peso ideal");
            } else {
                System.out.println("La persona tiene sobrepeso");
            }   
        }
            
        if(persona2.esMayorDeEdad() == true){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.print(persona2.toString());
        
        
        
        
        
         System.out.println("---------------Datos persona 3----------------");
        if(persona3.getPeso() == 0 || persona3.getAltura() == 0){
            System.out.println("Falta el peso o la altura para calcular el IMC"); 
        } else {
            if(persona3.calcularIMC() == -1){
                System.out.println("La persona tiene poco peso");
            }else if(persona3.calcularIMC() == 0){
                System.out.println("La persona esta en su peso ideal");
            } else {
                System.out.println("La persona tiene sobrepeso");
            }   
        }
            
        if(persona3.esMayorDeEdad() == true){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.print(persona3.toString());
    
    }
    
    

}
