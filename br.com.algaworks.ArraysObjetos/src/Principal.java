public class Principal {

    public static void main(String[] args) {

        Turma turma = new Turma();
        turma.aluno = new Aluno[3];

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Murilo";
        aluno1.idade = 3;
        turma.aluno[0] = aluno1;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Larissa";
        aluno2.idade = 4;
        turma.aluno[1] = aluno2;

        turma.imprimirListaAluno();

    }

}
