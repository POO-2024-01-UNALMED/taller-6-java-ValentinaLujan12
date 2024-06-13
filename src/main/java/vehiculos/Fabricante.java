package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;
    static Map<Fabricante, Integer> ventasPorFabricante = new HashMap<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        ventasPorFabricante.put(this, 0);
    }

    // Metodos
    public void incrementarVentas() {
        ventasPorFabricante.put(this, ventasPorFabricante.get(this) + 1);
        pais.incrementarVentas();
    }
    
    public static Fabricante fabricaMayorVentas() {
        Fabricante fabricaMayorVentas = null;
        int maxVentas = 0;
        for (Map.Entry<Fabricante, Integer> entry : ventasPorFabricante.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                fabricaMayorVentas = entry.getKey();
            }
        }
        return fabricaMayorVentas;
    }

    // Getters y setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
