package componentes;

import model.Edificio;

import java.util.Scanner;

public class EdificioReader {
    private final Scanner scanner;

    public EdificioReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Edificio read(){

        System.out.println("introduce datos del edificio ");

        System.out.println("direccion ");
        String direccion = scanner.nextLine();

        System.out.println("municipio ");
        String municipio = scanner.nextLine();

        System.out.println("apartamentos ");
        String apartamentos = scanner.nextLine();

        return new Edificio(
                direccion,
                municipio,
                apartamentos
        );
    }
}
