package exceptions;

import estoque.Produto;

public class ProdutoInativoException extends ProdutoException {

    public ProdutoInativoException(String message) {
        super(message);
    }
}
