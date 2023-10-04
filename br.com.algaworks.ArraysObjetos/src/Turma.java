public class Turma {

    String identificacao;
    String professora;
    Aluno[] aluno;

    void imprimirListaAluno() {
        for (Aluno alunos : aluno) {
            if (alunos != null) {
                System.out.printf("%s (%d anos)%n", alunos.nome, alunos.idade);
            } else {
                System.out.println("Vago");
            }
        }
    }

}
