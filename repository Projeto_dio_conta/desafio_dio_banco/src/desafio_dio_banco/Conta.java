package desafio_dio_banco;

public class Conta {
	
	 private String numeroConta;
	    private double saldo;
	    private Cliente cliente;

	    public Conta(String numeroConta, Cliente cliente) {
	        this.numeroConta = numeroConta;
	        this.cliente = cliente;
	        this.saldo = 0.0;
	    }

	    public void depositar(double valor) {
	        saldo += valor;
	    }

	    public boolean sacar(double valor) {
	        if (valor <= saldo) {
	            saldo -= valor;
	            return true;
	        }
	        return false;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public String getNumeroConta() {
	        return numeroConta;
	    }

	    public Cliente getCliente() {
	        return cliente;
	    }
	}


	
			



	   
