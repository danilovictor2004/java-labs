package agencia;

import exceptions.HotelExistenteException;
import exceptions.HotelNaoEncontradoException;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(Hotel hotel) {

        if (hoteis.contains(hotel)) {
            throw new HotelExistenteException("Hotel já Cadastrado.");
        }

        hoteis.add(hotel);
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {
        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();

        for (int i = 0; i < hoteisParaRemocao.size(); i++) {
            Hotel hotel = hoteis.get(i);

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
