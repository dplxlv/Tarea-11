import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese moneda origen (USD/EUR): ");
            String origen = scanner.nextLine();

            System.out.print("Ingrese moneda destino (USD/EUR): ");
            String destino = scanner.nextLine();

            System.out.print("Ingrese cantidad: ");
            String textoCantidad = scanner.nextLine();

            double cantidad = Double.parseDouble(textoCantidad);

            double resultado = ConversorMonedas.convertir(origen, destino, cantidad);

            System.out.println("Resultado: " + String.format("%.2f", resultado));

        } catch (NumberFormatException e) {

            System.out.println("Error: debe ingresar un número válido.");

        } catch (MonedaNoSoportadaException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Programa finalizado.");
            scanner.close();
        }
    }
}