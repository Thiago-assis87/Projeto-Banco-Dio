package desafio_dio_banco;

public class Main {
	
	public static void main(String[] args) {
        // Criar banco
        Banco banco = new Banco("Banco Exemplo");

        // Criar agência
        Agencia agencia1 = new Agencia("001");
        banco.adicionarAgencia(agencia1);

        // Criar cliente
        Cliente cliente1 = new Cliente("João Silva");

        // Criar conta master para o cliente
        cliente1.criarContaMaster("12345");

        // Adicionar conta à agência
        agencia1.adicionarConta(cliente1.getContaMaster());

        // Operações
        cliente1.getContaMaster().depositar(500.0);
        System.out.println("Saldo após depósito: " + cliente1.getContaMaster().getSaldo());

        boolean saque = cliente1.getContaMaster().sacar(200.0);
        System.out.println("Saque realizado: " + saque);
        System.out.println("Saldo após saque: " + cliente1.getContaMaster().getSaldo());
    }
}
