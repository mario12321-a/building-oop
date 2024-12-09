package componentes;

import java.util.Scanner;

public class ApartamentoReader {

    private final Scanner scanner;
    private final EdificioReader edificioReader;

    public ApartamentoReader(Scanner scanner, EdificioReader edificioReader) {
        this.scanner = scanner;
        this.edificioReader = edificioReader;
    }

}
