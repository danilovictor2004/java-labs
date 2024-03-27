import domain.Venda;
import repository.VendaRepository;
import services.CadastroVendaServices;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        CadastroVendaServices services = new CadastroVendaServices();
        VendaRepository vendaRepository = new VendaRepository();
//        Venda vendaCadastrada = services.cadastrar("José dos Santos",
//                new BigDecimal("1200.87"), LocalDate.parse("2023-04-19"));
//
//        System.out.println(vendaCadastrada);
        var listarTodos = vendaRepository.listar();
        listarTodos.forEach(System.out::println);
    }

}
