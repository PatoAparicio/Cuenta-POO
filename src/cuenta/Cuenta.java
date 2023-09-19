
package cuenta;

public class Cuenta 
{
    private String nombre; //Variable de instancia
    private double saldo;  //Variable de instancia
    private int agustin;
    
    //constructor inicializa nombre con el parametro nombre
    public Cuenta (String  nombre, double saldo)
    {
    this.nombre=nombre;
    
    //valida que el saldo sea mayor a 0.0 de lo contrario la variable de instancia saldo mantiene su valor de 0.0
    if (saldo >0.0)
        this.saldo=saldo;//asigna a la variable de instancia saldo 
    } 
    
    //metodo que deposita suma solo una cantidad valida al saldo
    public void depositar (double montoDeposito)
    {
    if (montoDeposito>0.0)
        saldo =saldo+montoDeposito;
    }
    
    //metodo que devuelve el saldo de la cuenta
    public double obtenerSaldo()
    {
    return saldo;
    }
    
    //método para establecer el nombre en el objeto
    public void establecerNombre (String nombre)
    {
    this.nombre=nombre; //almacenar nombre
    }
    
    //método para obtener el nombre del objeto
    public String obtenerNombre ()
    {
    return nombre; //devuelve el valor de nombre a quien lo invocó
    }
}
