import java.util.HashMap;
import java.util.Map;

public class Colores {
    Map<String, Integer> map = new HashMap<>();  
    
    public Colores(int cantidad_rojo, int cantidad_azul){
        map.put("R", cantidad_rojo);
        map.put("A", cantidad_azul);
    };

    public int devolverRojos(){
        return map.get("R");
    }

    public int devolverAzules(){
        return map.get("A");
    }
    
    @Override
    public String toString() {
        return String.format("Rojos: %1$s; Azules: %2$s", this.devolverRojos(), this.devolverAzules());
    }
    
}
