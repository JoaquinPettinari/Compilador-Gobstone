public class Colores {
    private static int ROJOS;
    private static int AZULES;
    
    public Colores(int cantidad_rojo, int cantidad_azul){
        Colores.ROJOS = cantidad_rojo;
        Colores.AZULES = cantidad_azul;
    };

    public int devolverRojos(){
        return ROJOS;
    }

    public int devolverAzules(){
        return AZULES;
    }
    
    @Override
    public String toString() {
        return String.format("Rojos: %1$s; Azules: %2$s", Colores.ROJOS, Colores.AZULES);
    }
    
}
