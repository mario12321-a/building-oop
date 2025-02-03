package componentes;

import model.Apartamento;

import java.util.Scanner;

public class ApartamentoReader {

    private final Scanner scanner;
    private final PropietarioReader propietarioReader;

    public ApartamentoReader(Scanner scanner, PropietarioReader propietarioReader) {
        this.scanner = scanner;
        this.propietarioReader = propietarioReader;
    }
    public Apartamento read(){
        System.out.println();
    }
}
