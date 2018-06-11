package grandeveloper.albumrusia;

public class Jugadores {
    String id = null;
    String nombre = null;
    String repetidas = null;
    boolean selected = false;

    public Jugadores(String id,String nombre, String repetidas, boolean selected) {
        this.id = id;
        this.nombre = nombre;
        this.repetidas = repetidas;
        this.selected = selected;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepetidas() {
        return repetidas;
    }

    public void setRepetidas(String repetidas) {
        this.repetidas = repetidas;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
