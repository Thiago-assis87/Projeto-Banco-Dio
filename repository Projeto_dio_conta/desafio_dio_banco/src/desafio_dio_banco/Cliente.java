package desafio_dio_banco;

public class Cliente {

	private String nome;
    private Conta contaMaster;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void criarContaMaster(String numeroConta) {
        this.contaMaster = new Conta(numeroConta, this);
    }

    public String getNome() {
        return nome;
    }

    public Conta getContaMaster() {
        return contaMaster;
    }
}