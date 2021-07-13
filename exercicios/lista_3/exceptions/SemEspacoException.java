package exceptions;

public class SemEspacoException extends RuntimeException {
    public SemEspacoException() {
        super("Espaço insuficiente!");
    }
}
