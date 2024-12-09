package componentes;

import java.util.Scanner;

public class PropietarioReader {

    private final Scanner scanner;
    private final ApartamentoReader apartamentoReader;

    public PropietarioReader(Scanner scanner, ApartamentoReader apartamentoReader) {
        this.scanner = scanner;
        this.apartamentoReader = apartamentoReader;
    }
}
