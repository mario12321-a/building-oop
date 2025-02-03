package componentes;

import model.Propietario;

import java.util.Scanner;

public class PropietarioReader {
    private final Scanner scanner;

    public PropietarioReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Propietario read(){
        System.out.println("introduce los datos del propietario ");
        System.out.println("NIF: ");
        String nif = scanner.nextLine();

        System.out.println("nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("apellido: ");
        String apellido = scanner.nextLine();

        return new Propietario(nif,nombre,apellido);
    }
}
