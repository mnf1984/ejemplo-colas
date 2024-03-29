public class Persona implements Comparable<Persona> {

    private String nombre;
    private int tipo; // 1 joven, 2 tercera edad, 3 embarazada

    public Persona(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public int compareTo(Persona o) {
        if (tipo < o.getTipo()) {
            return 1;
        } else if (tipo > o.getTipo()) {
            return -1;
        } else {
            return 0;
        }
    }
}