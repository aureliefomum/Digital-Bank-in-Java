package bancoDigital;

public class Main {

    public static void main(String[] args) {
        //criando novo banco
       Banco banco = new Banco() ;

         //criando primeiro cliente
        Cliente aurelie = new Cliente();
        aurelie.setNome("Aurelie")  ;

         //contas e transacoes de Aurelie
        Conta ccAurelie = new ContaCorrente(aurelie);
        ccAurelie.depositar(250);

        Conta poupancaAurelie = new ContaPoupanca(aurelie) ;

          //criando segundo cliente
        Cliente pietro = new Cliente();
        pietro.setNome("Pietro") ;

        //contas do Pietro

        Conta ccPietro = new ContaCorrente(pietro);
        Conta poupancaPietro = new ContaPoupanca(pietro) ;


        banco.adicionaNovaConta(ccAurelie);
        banco.adicionaNovaConta(poupancaAurelie);
        banco.adicionaNovaConta(ccPietro);
        banco.adicionaNovaConta(poupancaPietro);


        ccAurelie.transferir(250, poupancaAurelie);
        ccAurelie.imprimirExtrato();
        poupancaAurelie.imprimirExtrato();

        ccPietro.depositar(450);

     banco.imprimirListaClientes();
    }
}
