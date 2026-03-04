import java.util.Scanner;

public class PedirDatos {

    private final Scanner sc;

    public PedirDatos() {
        this.sc = new Scanner(System.in);
    }

    public PedirDatos(Scanner sc) {
        this.sc = sc;
    }

    // Metodo para textos o cadenas
    public String pedirCadena(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");
            String cadenaTemporal = sc.nextLine().trim();

            if (!cadenaTemporal.isEmpty()) {
                return cadenaTemporal;
            }

            System.out.println("Error: el campo no puede estar vacio");
        }
    }

    // Metodo para numeros enteros (sin rango especifico)
    public int pedirEntero(String mensaje) {
        return pedirEntero(mensaje, 1, Integer.MAX_VALUE);
    }

    // Metodo para numeros enteros con rango
    public int pedirEntero(String mensaje, int min, int max) {
        while (true) {
            System.out.print(mensaje + ": ");
            try {
                int numeroTemporal = Integer.parseInt(sc.nextLine().trim());

                if (numeroTemporal >= min && numeroTemporal <= max) {
                    return numeroTemporal;
                }

                System.out.println("Error: el numero debe estar entre " + min + " y " + max);

            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida, por favor ingresa un numero entero");
            }
        }
    }

    public double pedirDecimal(String mensaje) {
        return pedirDecimal(mensaje, 0.01, Double.MAX_VALUE);
    }

    public double pedirDecimal(String mensaje, double min, double max) {
        while (true) {
            System.out.print(mensaje + ": ");
            try {
                double numeroTemporal = Double.parseDouble(
                        sc.nextLine().trim().replace(",", ".")
                );

                if (numeroTemporal >= min && numeroTemporal <= max) {
                    return numeroTemporal;
                }

                System.out.println("Error: el numero debe estar entre " + min + " y " + max);

            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida, por favor ingresa un numero decimal");
            }
        }
    }

    // --- NUEVO METODO PARA BOOLEAN ---
    public boolean pedirBoolean(String mensaje) {
        while (true) {
            System.out.print(mensaje + " (true/false o si/no): ");
            String entrada = sc.nextLine().trim().toLowerCase();

            if (entrada.equals("true") || entrada.equals("si") || entrada.equals("s")) {
                return true;
            } else if (entrada.equals("false") || entrada.equals("no") || entrada.equals("n")) {
                return false;
            }

            System.out.println("Error: entrada invalida. Escribe 'true', 'false', 'si' o 'no'.");
        }
    }

    // Metodo para un solo caracter (char)
    public char pedirCaracter(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");
            String entrada = sc.nextLine().trim();

            if (entrada.length() == 1) {
                return entrada.charAt(0); 
            }

            System.out.println("Error: debes ingresar exactamente un solo caracter");
        }
    }
}