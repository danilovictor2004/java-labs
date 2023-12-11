import Execptions.PacoteCadastradoException;
import Execptions.PacoteNaoEncontradoException;

import java.util.*;

public class CadastroPacoteViagem {

    private final List<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        if (pacotes.contains(new PacoteViagem(descricao, precoDiaria))) {
            throw new PacoteCadastradoException("Pacote já cadastrado.");
        }

        pacotes.add(new PacoteViagem(descricao, precoDiaria));
    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;
    }

    public void ordenar() {
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        pacotes.sort(new PrecoPacoteDescrecente().reversed());
    }

    public void removerPorDescricao(String descricao) {
        boolean removido =  false;
        Iterator<PacoteViagem> pacotesIterator = pacotes.iterator();

        while (pacotesIterator.hasNext()) {
            PacoteViagem pacote = pacotesIterator.next();
            if (pacote.getDescricao().equals(descricao)) {
                pacotesIterator.remove();
                removido = true;
            }
        }

        if (!removido) {
            throw new PacoteNaoEncontradoException("Pacote de viagem não encontrado.");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)) {
                return pacote;
            }
        }
        throw new PacoteNaoEncontradoException("Pacote de viagem não encontrado.");
    }

}
