package exceptions;

public class ProdutoSemEstoqueException extends RuntimeException{

    public ProdutoSemEstoqueException(String message) {
        super(message);
    }
}
