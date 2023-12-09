package examendiciembre;

public class Usuario {

    private String nombre;
    private String apellido;
    private String email;
    private int movil;
    private boolean suscrito;

    public Usuario(String nombre, String apellido, String email, int movil, boolean suscrito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.movil = movil;
        this.suscrito = suscrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public boolean isSuscrito() {
        return suscrito;
    }

    public void setSuscrito(boolean suscrito) {
        this.suscrito = suscrito;
    }

}
