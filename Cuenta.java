package ejercicio1;

import static java.util.Objects.requireNonNull;

public class Cuenta {
    private String titular;
    private double saldo;
    
    public Cuenta(String titular, double saldo) {
		this.titular = requireNonNull(titular);
		this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double cantidad) {
        this.saldo = saldo;
    }
    
    public String mostrar(){
        return "Titular = " + titular + "\n"+
                "Saldo = " + saldo + "$"+"\n";
                
    }
    
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo+cantidad;
            System.out.println("Se ha depositado la cantidad de $"+cantidad);
            
        }else{
          System.out.println("La cantidad ingresada no puede ser negativa");  
        }
        
    }
    public void retirar(double cantidad) {
        if(cantidad > 0) {
            saldo = saldo-cantidad;
            System.out.println("Se ha retirado la cantidad de $"+cantidad);
        }else{
          System.out.println("La cantidad retirada no puede ser negativa");  
        }
        
    }
    
}
