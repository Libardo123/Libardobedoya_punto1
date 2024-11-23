import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MatrizOperaciones {

    // Método pila con la suma de las filas de la matriz
    public static void sumaFilasPila(Matriz matriz) {
        Stack<Integer> pila = new Stack<>();
        int[][] datos = matriz.getMatriz();
        for (int i = 0; i < datos.length; i++) {
            int suma = 0;
            for (int j = 0; j < datos[i].length; j++) {
                suma += datos[i][j];
            }
            pila.push(suma);
        }

        System.out.println("La Suma de las filas (Pila):");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }

    // Método cola con la suma de las columnas de la matriz
    public static void sumaColumnasCola(Matriz matriz) {
        Queue<Integer> cola = new LinkedList<>();
        int[][] datos = matriz.getMatriz();
        for (int j = 0; j < datos[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < datos.length; i++) {
                suma += datos[i][j];
            }
            cola.add(suma);
        }

        System.out.println("Suma de las columnas (Cola):");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }

    // Método que muestra el factorial de la dimensión de la matriz
    public static void factorialDimension(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial de la dimensión de la matriz: " + factorial);
    }

    // Método cola que muestra los números ordenados de mayor a menor de la cola
    public static void numerosOrdenadosCola(Matriz matriz) {
        Queue<Integer> cola = new LinkedList<>();
        int[][] datos = matriz.getMatriz();
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                cola.add(datos[i][j]);
            }
        }

        // Aqui se Convierte  la cola a una lista para ordenar
        LinkedList<Integer> lista = new LinkedList<>(cola);
        lista.sort((a, b) -> b - a); // Orden de mayor a menor

        System.out.println("Los números ordenados de mayor a menor (Cola):");
        for (int num : lista) {
            System.out.println(num);
        }
    }
}



