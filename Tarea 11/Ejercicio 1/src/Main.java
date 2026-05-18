import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese un numero: ");
        String entrada = scanner.nextLine();

        int numero = Integer.parseInt(entrada);

        double resultado = 100 / numero;

        System.out.println("Resultado: " + resultado);

    } catch (ArithmeticException e) {
        System.out.println("No se puede dividir por cero");

    } catch (NumberFormatException e) {
        System.out.println("Debe ingresar un número valido");

    } finally {
        System.out.println("Programa finalizado correctamente");
        scanner.close();
    }
}
