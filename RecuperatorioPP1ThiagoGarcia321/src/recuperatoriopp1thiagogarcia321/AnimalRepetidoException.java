package recuperatoriopp1thiagogarcia321;

public class AnimalRepetidoException extends RuntimeException{
    
    private static final String MESSAGE = "Ya existe un animal con el mismo nombre y edad.";

    public AnimalRepetidoException() {
        super(MESSAGE);
    }
}
