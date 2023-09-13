package cuenta;
//Crea y manipula el objeto cuenta
import java.util.Scanner;

public class PruebaCuenta 
{
   public static void main(String[] args) 
   {
   //crea un objeto Scanner para obtener la entrada  desde el simbolo del sistema    
   Scanner entrada= new Scanner (System.in);
   
   //crea un objeto Cuenta y lo asigna a miCuenta
   Cuenta miCuenta=new Cuenta("Pato", 50);
   Cuenta miCuenta2=new Cuenta("Pato2", -12);

   //muestra el saldo inicial de cada objeto
       System.out.println("Saldo de: "+ miCuenta.obtenerNombre()+" "+ miCuenta.obtenerSaldo());
       System.out.println("Saldo de: "+ miCuenta2.obtenerNombre()+" "+ miCuenta2.obtenerSaldo());
       
       System.out.println("Ingrese el monto a depositar para cuenta 1:");
       double montoDeposito=entrada.nextDouble();
       miCuenta.depositar(montoDeposito);
       
       System.out.println("Ingrese el monto a depositar para cuenta 2:");
       montoDeposito=entrada.nextDouble();
       miCuenta2.depositar(montoDeposito);
       
       System.out.println("Saldo de: "+miCuenta.obtenerNombre()+" "+miCuenta.obtenerSaldo());
       System.out.println("Saldo de: "+miCuenta2.obtenerNombre()+" "+miCuenta2.obtenerSaldo());
       
   //muestra el valor inicial del nombre (null)
      // System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());
       
    //pide y lee el nombre
   //System.out.println("Introduzca el nombre:");
     //  String elNombre= entrada.nextLine();//Lee una linea de texto
       //miCuenta.establecerNombre(elNombre);//coloca elNombre en miCuenta
       //System.out.println();//imprime linea en blanco
       
       //muestra el nombre almacenado en el objeto miCuenta
      // System.out.printf("El nombre en el objeto miCuenta es: %s%n", miCuenta.obtenerNombre());
       //System.out.printf("El nombre en el objeto miCuenta es: %s%n", miCuenta2.obtenerNombre());          
    }
    
}
