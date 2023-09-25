public class Principal {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 12;

        CadastroVisitante cadastroVisitante = new CadastroVisitante();
        cadastroVisitante.cadastrar(novoVisitante);
        cadastroVisitante.cadastrar(novoVisitante, 2);
    }

}
