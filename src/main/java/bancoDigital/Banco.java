package bancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();



    public void adicionaNovaConta(Conta novaConta) {
       contas.add(novaConta) ;
   }

   public void imprimirListaClientes() {
       System.out.println("=== Lista de Clientes do Banco ===");
       for (Conta conta : contas) {
           System.out.println("Nome do cliente:  " + conta.cliente.getNome()+ ": " + conta.getClass().getSimpleName());
       }
   }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
