public class Tablero {

    private static Colores [][] tablero;
    private static int X = 0;
    private static int Y = 0;    
    private static int filas = 0;
    private static int columnas = 0;

    public Tablero(int filas, int columnas){
        tablero = new Colores [filas][columnas];
        this.inicializarTablero();        
    }    

    private void inicializarTablero(){
        filas = tablero.length;
        columnas = tablero[0].length;
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){                
                tablero[i][j] = new Colores(0, 0);
            }
        }
    }

    public static void poner(char color){
        Colores colorAPoner = tablero[X][Y];
        tablero[X][Y] = colorAPoner.ponerColor(String.valueOf(color));
    };

    public static void mover(char direccion){
        switch (String.valueOf(direccion)) {
            case "N": {
                Tablero.Arriba();
                break;
            }
            case "O": {
                Tablero.Izquierda();
                break;
            }
            case "S": {
                Tablero.Abajo();
                break;
            }
            case "E": {
                Tablero.Derecha();
                break;
            }
            default: throw new IllegalArgumentException("Elemento inválido: " + direccion);
        }
    };
    
    public static void sacar(char color){
        String colorEnString = String.valueOf(color);
        Colores colorASacar = tablero[X][Y];
        if(colorASacar.devolverColor(colorEnString) != 0){
            tablero[X][Y] = colorASacar.sacarColor(colorEnString);
        }
        else{
            System.out.println(String.format("No podes sacar mas del color: %1$s", colorEnString));
        }
    };

    public static void Arriba() {
		if (Y < filas - 1)
			Y++;
        else
            throw new IllegalArgumentException("No se puede ir al 'Norte'");
	}
 
	public static void Abajo() {
		if (Y > 0)
			Y--;
        else
            throw new IllegalArgumentException("No se puede ir al 'Sur'");
	}
 
	public static void Izquierda() {
		if (X > 0)
			X--;
        else
            throw new IllegalArgumentException("No se puede ir al 'Oeste'");
	}
 
	public static void Derecha() {
		if (X < columnas - 1)
			X++;
        else
            throw new IllegalArgumentException("No se puede ir al 'Este'");
	}

    public static void imprimirTablero(){
        for (int j = tablero[0].length - 1; j >= 0; j--){
            for (int i = 0; i < tablero.length - 1 ; i++){
                if(i == X && j == Y){
                    System.out.print("[ " + tablero[i][j].toString() + " ] | ");
                }
                else{
                    System.out.print(tablero[i][j].toString() + " | ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
