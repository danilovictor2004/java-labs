package agencia;

import exceptions.HotelExistenteException;
import exceptions.HotelNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class CadastroHotel {

    private final List<Hotel> hoteis = new ArrayList<>();

    public void adicionar(Hotel hotel) {

        if (hoteis.contains(hotel)) {
            throw new HotelExistenteException("Hotel já Cadastrado.");
        }

        hoteis.add(hotel);
    }

    public List<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {
        List<Hotel> hoteisParaRemocao = new ArrayList<>();

        for (Hotel hotel : hoteis) {
            if (hotel.getCidade().equals(cidade)) {
                hoteisParaRemocao.add(hotel);
            }
        }

        hoteis.removeAll(hoteisParaRemocao);
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if(!removido) {
            throw new HotelNaoEncontradoException("Hotel não encontrado para remoção.");
        }
    }

    public void removerTodos() {
        hoteis.clear();
    }

}
