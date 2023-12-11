import Execptions.PacoteCadastradoException;
import Execptions.PacoteNaoEncontradoException;

import java.util.*;

public class CadastroPacoteViagem {

    // TODO declarar lista de pacotes de viagem aqui
    private final List<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        // TODO adicionar pacote na lista, validando antes se
        //  já existe usando contains (lançar exceção)

        if (pacotes.contains(new PacoteViagem(descricao, precoDiaria))) {
            throw new PacoteCadastradoException("Pacote já cadastrado.");
        }

        pacotes.add(new PacoteViagem(descricao, precoDiaria));

    }

    public List<PacoteViagem> obterTodos() {
        // TODO retornar lista de pacotes
        return pacotes;
    }

    public void ordenar() {
        // TODO ordenar pacotes pela ordem natural
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        // TODO ordenar pacotes pelo preço (decrescente)
    }

    public void removerPorDescricao(String descricao) {
        // TODO iterar nos pacotes com Iterator e remover aqueles com descrição informada,
        //  lançando exceção se nenhum pacote foi removido
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        // TODO iterar pacotes com enhanced for, localizar e retornar
        //  pacote com descrição informada (ou lançar exceção se não encontrar)
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)) {
                return pacote;
            }
        }

        throw new PacoteNaoEncontradoException("Pacote de viagem não encontrado.");
    }

}
