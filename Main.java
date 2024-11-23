import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Ingrese el tamaño de la matriz,debe ser mayor a 0: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("El tamaño de la matriz debe ser mayor a 0. Intente nuevamente.");
            }
        } while (n <= 0);
        

        Matriz matriz = new Matriz(n);
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz.setElemento(i, j, scanner.nextInt());
            }
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1: La suma de las filas de la matriz (Pila)");
            System.out.println("2: La suma de las columnas de la matriz (Cola)");
            System.out.println("3: El factorial de la dimensión de la matriz");
            System.out.println("4: Los  números ordenados de mayor a menor (Cola)");
            System.out.println("5: Salir");

// aqui es donde se elle la opcion del ususario 
           int opcion = scanner.nextInt();
if (opcion < 1 || opcion > 5) {
    System.out.println("Opción no válida. Por favor seleccione una opción entre 1 y 5.");
    continue; // Vuelve al inicio del ciclo sin ejecutar más código
}


            switch (opcion) {
                case 1:
                    MatrizOperaciones.sumaFilasPila(matriz);
                    break;
                case 2:
                    MatrizOperaciones.sumaColumnasCola(matriz);
                    break;
                case 3:
                    MatrizOperaciones.factorialDimension(n);
                    break;
                case 4:
                    MatrizOperaciones.numerosOrdenadosCola(matriz);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            if (continuar) {
                System.out.println("¿Desea realizar otra operación? (s/n)");
                char resp = scanner.next().charAt(0);
                if (resp == 'n' || resp == 'N') {
                    continuar = false;
                }
            }
        }


    }
}

