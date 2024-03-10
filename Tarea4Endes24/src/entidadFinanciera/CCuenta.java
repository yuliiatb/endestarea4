/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


/**
 * La clase contiene los elementos de una cuenta y permite establecer sus valores,
 * retirar e ingresar dinero. 
 * 
 * @author Yuliia T
 */
public class CCuenta {

    /**
     * Atributos privados de la clase.
     * @param nombre es el nombre del titular de la cuenta
     * @param cuenta es el número de la cuenta
     * @param saldo es el saldo que tiene la cuenta
     * @param tipoInteres es el porcentaje que se aplica a la cuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * @return devuelve el valor del nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre establece el valor del nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return devuelve el valor del número de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta establece el valor del número de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return devuelve el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo establece el saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return devuelve el tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés establece el tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @param ERRORCANTIDADNEGATIVA contiene el mensaje que se mostrará en el caso de ingresar una cantidad negativa 
     */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    

    /**
     * El constructor vacío de la clase CCuenta que no contieve argumentos 
     */
    public CCuenta()
    {
    }

    /**
     * El constructor de la clase CCuenta. Inicializa los siguientes atributos con los valores indicados por el usuario
     * @param nom el nombre del titular de la cuenta
     * @param cue el número de la cuenta
     * @param sal el saldo actual de la cuenta
     * @param tipo el tipo de interés que se aplica a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * El método que muestra el estado de la cuenta.
     * @return devuelve estado de la cuenta, en particular, su saldo actual
     */
    public double estado(){
        return this.getSaldo();
    }

    /**
     * El método para ingresar dinero en la cuenta. Se verifica si la cantidad ingresada es negativa.
     * @param cantidad la cantidad para ingresar
     * @throws Exception lanza la excepción si la cantidad indicada es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * El método para retirar dinero de la cuenta. Se verifica si la cantidad para retirar es negativa.
     * @param cantidad la cantidad para retirar
     * @throws Exception lanza la excepción si la cantidad indicada es negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


    
   