import domain.Venda;
import repository.RepositoryFactory;
import repository.VendaRepository;
import services.CadastroVendaServices;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

            try (RepositoryFactory factory = new RepositoryFactory()) {
                VendaRepository vendaRepository = factory.criarVendaRepositorio();
                CadastroVendaServices services = new CadastroVendaServices(vendaRepository);

                Venda vendaCadastrada = services.cadastrar("Danillo",
                        new BigDecimal("11450.87"), LocalDate.parse("2023-04-21"));

                System.out.println("Venda realizada: " + vendaCadastrada);

                var listarTodos = vendaRepository.listar();
                listarTodos.forEach(System.out::println);

                System.out.println();
                Venda consultaVendaPorId = vendaRepository.consultarVendaId(2L);
                System.out.println(consultaVendaPorId);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

    }

}
