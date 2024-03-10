/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    }

    public static void probarRetirar (double saldoActual, double cantidad, double cantidadEsperada){
        try {
            double nuevoSaldo = saldoActual - cantidad;
            System.out.println("El saldo después de retirar la cantidad de " + cantidad + " es " + nuevoSaldo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void probarIngresar (double saldoActual, double cantidad, double cantidadEsperada){
        try {
            double nuevoSaldo = saldoActual + cantidad;
            System.out.println("El saldo después de ingresar la cantidad de " + cantidad + " es " + nuevoSaldo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
