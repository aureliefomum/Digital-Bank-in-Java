package bancoDigital;

public class Main {
    Cliente aurelie = new Cliente();
    aurelie.setNome("Aurelie")  ;
   // aurelie.setNome("Aurelie");

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(250);

        Conta poupanca = new ContaPoupanca() ;

        cc.transferir(250, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
