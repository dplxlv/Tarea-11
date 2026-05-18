public class ParteC {

    String textoEntero = "2024";
    String textoDecimal = "98.6";
    String textoBoolean = "false";

    int entero = Integer.parseInt(textoEntero);
    double decimal = Double.parseDouble(textoDecimal);
    boolean bandera = Boolean.parseBoolean(textoBoolean);

    String s1 = String.valueOf(entero);
    String s2 = Double.toString(decimal);
    String s3 = "" + bandera;
}
