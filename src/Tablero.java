public class Tablero {

    private static int [][] tablero;

    public Tablero(int filas, int columnas){
        tablero = new int [filas][columnas];
        Tablero.inicializarTablero();
    }

    private static void inicializarTablero(){
        int filas = tablero.length;
        int columnas = tablero[0].length;
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                tablero[i][j] = 0;
            }
        }
    }

    public static void poner(Object color){
        System.out.println(color);
    };

    public static void mover(Object direccion){
        System.out.println(direccion);
    };

    public static void sacar(Object color){
        System.out.println(color);
    };

    public static void imprimirTablero(){
        for (int i = 0; i < tablero.length; i++){
            for (int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
    }
}
