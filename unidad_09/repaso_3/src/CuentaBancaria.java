public class CuentaBancaria {
    private String numCuenta;
    private String titular;
    private double saldo;

    private static int totalCuentas;
    private static double dineroTotalBanco;
    private static final double INTERES_ANUAL = 0.02;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial){
        this.numCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;

        totalCuentas++;
        dineroTotalBanco += saldoInicial;
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
        dineroTotalBanco += cantidad;
    }

    public void retirar(double cantidad){
        this.saldo -= cantidad;
        dineroTotalBanco -= cantidad;
    }

    public void aplicarInteresAnual(){
        dineroTotalBanco += dineroTotalBanco*INTERES_ANUAL;
    }

    public void mostrarInformación(){
        //...
    }

    static int getTotalCuentas(){
        return totalCuentas;
    }

    static double getDineroTotal(){
        return dineroTotalBanco;
    }

    static void mostrarStats(){
        System.out.println(totalCuentas);
        System.out.println(dineroTotalBanco);
    }
}
