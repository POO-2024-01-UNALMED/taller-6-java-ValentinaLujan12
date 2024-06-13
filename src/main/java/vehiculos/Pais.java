package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
    
    private String nombre;
    private static Map<Pais, Integer> ventasPorPais = new HashMap<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        ventasPorPais.put(this, 0);
    }

    // Metodos 
    public void incrementarVentas() {
        ventasPorPais.put(this, ventasPorPais.get(this) + 1);
    }

    public static Pais paisMasVendedor() {
        Pais paisMasVendedor = null;
        int maxVentas = 0;
        for (Map.Entry<Pais, Integer> entry : ventasPorPais.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                paisMasVendedor = entry.getKey();
            }
        }
        return paisMasVendedor;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
