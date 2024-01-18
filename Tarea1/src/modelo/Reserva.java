package modelo;

import java.util.List;
import java.time.LocalDate;

public class Reserva {

    private String nombre;
    private int telefono;
    private int numeroDias;
    private int numeroHabitaciones;
    private LocalDate fechaEvento;
    private int numeroAsistentesEvento;
    private List<String> tipoCocina;
    private TipoEvento tipoEvento;
    private int numeroJornadasCongreso;
    private boolean asistentesNecesitanHabitaciones;

    public Reserva() {
    }

    public Reserva(String nombre, int teléfono, int numeroDias, int numeroHabitaciones, LocalDate fechaEvento, int numeroAsistentesEvento, List tipoCocina, TipoEvento tipoEvento, int numeroJornadasCongreso, boolean asistentesNecesitanHabitaciones) {
        this.nombre = nombre;
        this.telefono = teléfono;
        this.numeroDias = numeroDias;
        this.numeroHabitaciones = numeroHabitaciones;
        this.fechaEvento = fechaEvento;
        this.numeroAsistentesEvento = numeroAsistentesEvento;
        this.tipoCocina = tipoCocina;
        this.tipoEvento = tipoEvento;
        this.numeroJornadasCongreso = numeroJornadasCongreso;
        this.asistentesNecesitanHabitaciones = asistentesNecesitanHabitaciones;
    }

    public Reserva(String nombre, int teléfono, int numeroDias, int numeroHabitaciones, LocalDate fechaEvento, int numeroAsistentesEvento, List tipoCocina, TipoEvento tipoEvento) {
        this.nombre = nombre;
        this.telefono = teléfono;
        this.numeroDias = numeroDias;
        this.numeroHabitaciones = numeroHabitaciones;
        this.fechaEvento = fechaEvento;
        this.numeroAsistentesEvento = numeroAsistentesEvento;
        this.tipoCocina = tipoCocina;
        this.tipoEvento = tipoEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public int getNumeroAsistentesEvento() {
        return numeroAsistentesEvento;
    }

    public List getTipoCocina() {
        return tipoCocina;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public int getNumeroJornadasCongreso() {
        return numeroJornadasCongreso;
    }

    public boolean isAsistentesNecesitanHabitaciones() {
        return asistentesNecesitanHabitaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int teléfono) {
        this.telefono = teléfono;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public void setNumeroAsistentesEvento(int numeroAsistentesEvento) {
        this.numeroAsistentesEvento = numeroAsistentesEvento;
    }

    public void setTipoCocina(List tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setNumeroJornadasCongreso(int numeroJornadasCongreso) {
        this.numeroJornadasCongreso = numeroJornadasCongreso;
    }

    public void setAsistentesNecesitanHabitaciones(boolean asistentesNecesitanHabitaciones) {
        this.asistentesNecesitanHabitaciones = asistentesNecesitanHabitaciones;
    }

}
