package estoque;

import exceptions.ProdutoInativoException;
import exceptions.ProdutoSemEstoqueException;

import java.util.Objects;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "Nome deve ser informado");
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void retirarEstoque(int quantidade) throws ProdutoInativoException, ProdutoSemEstoqueException{
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa para retirada no estoque");
        }

        if (isInativo()) {
            throw new ProdutoInativoException("Retirada no estoque não pode ser realizada em produtos inativos");
        }

        if (this.quantidadeEstoque - quantidade < 0) {
            throw new ProdutoSemEstoqueException("Estoque insuficiente", this.quantidadeEstoque, quantidade);
        }

        this.quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

}
