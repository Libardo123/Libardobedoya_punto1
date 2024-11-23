public class Matriz {
    private int[][] matriz;

    public Matriz(int n) {
        matriz = new int[n][n];
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setElemento(int i, int j, int valor) {
        matriz[i][j] = valor;
    }
}
