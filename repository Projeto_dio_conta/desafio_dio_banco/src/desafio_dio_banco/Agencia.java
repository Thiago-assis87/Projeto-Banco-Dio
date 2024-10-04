package desafio_dio_banco;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	private String codigo;
    private List<Conta> contas;

    public Agencia(String codigo) {
        this.codigo = codigo;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null; // Conta não encontrada
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Conta> getContas() {
        return contas;
    }
}

