package exceptions;

public class HotelNaoEncontrado extends RuntimeException {

    public HotelNaoEncontrado(String message) {
        super(message);
    }

}
