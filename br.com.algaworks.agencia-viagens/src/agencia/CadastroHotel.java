package agencia;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList hoteis = new ArrayList();

    public void adicionar(Hotel hotel) {
        hoteis.add(hotel);
    }

    public ArrayList obterTodos() {
        return hoteis;
    }
}
