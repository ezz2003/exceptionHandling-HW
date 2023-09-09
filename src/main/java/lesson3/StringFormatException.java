package lesson3;

import java.util.IllegalFormatException;

public class StringFormatException extends IllegalArgumentException {
    public static final String MESSAGE = "Еrror when entering ";
    public StringFormatException(){
        super(MESSAGE);
    }

    public StringFormatException(String message){
        super(MESSAGE + message);
    }
}
