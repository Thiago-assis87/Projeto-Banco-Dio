package desafio_dio_banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
    private List<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public void adicionarAgencia(Agencia agencia) {
        agencias.add(agencia);
    }

    public Agencia buscarAgencia(String codigo) {
        for (Agencia agencia : agencias) {
            if (agencia.getCodigo().equals(codigo)) {
                return agencia;
            }
        }
        return null; // Agência não encontrada
    }

    public String getNome() {
        return nome;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }
}
