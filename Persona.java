package ejercicio2;

import java.util.Random;

public class Persona {
    //constante 
    static final char genero = 'H';
    
    private String nombre = "";
    private int edad = 0;
    private String DNI = generaDNI();
    private char sexo = Persona.genero;
    private double peso = 0;
    private double altura = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int calcularIMC(){
        int resultadoIMC = 0;
        
        double IMC = (peso/(altura*2));
        if(IMC < 20) {
            resultadoIMC = -1;
        } else if(IMC >= 20 && IMC <= 25){
            resultadoIMC = 0;
        } else if (IMC > 25){
            resultadoIMC = 1;
        }
        return resultadoIMC;
    }
    
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }
    
    public void comprobarSexo(char sexo){
        if(sexo != 'H' && sexo !='M'){
            setSexo('H');
        }
    }
    
    @Override
    public String toString(){
        return "Nombre = " + nombre + "\n"+
                "Edad = " + edad + "\n"+
                "DNI = "+ DNI + "\n" +
                "Sexo = " + sexo + "\n" +
                "Peso = "+ peso + "kg" + "\n" + 
                "Altura = " + altura + "m" + "\n";
    } 
    
    public String generaDNI(){
        Random rnd = new Random();
        int dni = 10000000 + rnd.nextInt(90000000);
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        char letraDNI = caracteres.charAt(resto);
        String rndConvertido = rnd.toString().substring(17);
        
        return rndConvertido+letraDNI;
    } 
    
}
