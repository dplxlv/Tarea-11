public class ConversorMonedas {
    public static double convertir(String monedaOrigen,String monedaDestino,double cantidad)
            throws MonedaNoSoportadaException {

        double tasa = 0;

        if (monedaOrigen.equalsIgnoreCase("USD")
                && monedaDestino.equalsIgnoreCase("EUR")) {

            tasa = 0.92;

        } else if (monedaOrigen.equalsIgnoreCase("EUR")
                && monedaDestino.equalsIgnoreCase("USD")) {

            tasa = 1.09;

        } else {

            throw new MonedaNoSoportadaException(
                    "Moneda no soportada: "
                            + monedaOrigen + " → " + monedaDestino);
        }

        return cantidad * tasa;
    }
}

