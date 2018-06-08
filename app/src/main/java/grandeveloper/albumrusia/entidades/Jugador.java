package grandeveloper.albumrusia.entidades;

public class Jugador {
    private Integer id;
    private String nombre;
    private Integer inventario;

    public Jugador(Integer id, String nombre, Integer inventario) {
        this.id = id;
        this.nombre = nombre;
        this.inventario = inventario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }
}
