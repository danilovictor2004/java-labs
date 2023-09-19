<h3>Desafio</h3>

1. Implementação de método
*   Uma empresa contratou você para continuar o desenvolvimento de um sistema de folha de pagamentos.


* A primeira funcionalidade que você deve desenvolver é o cálculo de salário de um funcionário.


* A empresa forneceu o seguinte código já desenvolvido para você continuar a implementação:

    
    public class FolhaPagamento {

        double calcularSalario() {
            // TODO implementar
        }
    }
* O método calcularSalario deve receber os seguintes parâmetros para calcular o valor total do salário a pagar:


1. [x] <i>Quantidade de horas normais trabalhadas</i>
2. [x] <i>Quantidade de horas extras trabalhadas</i>
3. [x] <i>Valor da hora normal</i>
4. [x] <i>Valor da hora extra</i>


* Você deve calcular as respectivas quantidades de horas trabalhas pelos valores da hora, somar os valores obtidos e retornar o resultado.


* Crie uma classe com o método `main` para invocar o método implementado e imprima o resultado (salário devido) na saída.

2. Passando objeto como argumento de método
*   O desenvolvedor sênior da empresa que te contratou revisou o seu código e pediu algumas alterações.

* Você deve criar uma classe `Funcionario` com as seguintes propriedades:


1. [x] <i>Nome</i>
2. [x] <i>Quantidade de filhos</i>


* E também, deve criar uma classe `ContratoTrabalho` com as propriedades:


1. [x] <i>Funcionário (ou seja, uma variável do tipo `Funcionario`)</i>
2. [x] <i>Valor da hora normal</i>
3. [x] <i>Valor da hora extra</i>


* Depois, você deve refatorar o método calcular da classe `FolhaPagamento` para receber um objeto do tipo `ContratoTrabalho` como parâmetro, substituindo os parâmetros de valores de hora.

Além disso, uma nova regra deve ser adicionada neste mesmo método:

* Quando o funcionário possuir 1 ou mais filhos, você deve calcular um adicional de 10% no valor total do salário.


* Crie métodos na classe `Funcionario` e `ContratoTrabalho` para que você possa "perguntar" ao objeto se o contrato possui ou não o adicional para filhos, tornando assim essas classes mais ricas.