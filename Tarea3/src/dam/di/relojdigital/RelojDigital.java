package dam.di.relojdigital;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;

public class RelojDigital extends CampoDeTexto implements Serializable {

    private boolean formato24h = true;
    private Timer timer;

    public RelojDigital() {
        this.formato24h = true;
        iniciarHora();
    }

    private void iniciarHora() {
        timer = new Timer(1000, e -> actualizarHora());
        timer.start();
    }

    public void actualizarHora() {
        DateTimeFormatter dateTimeFormatter;

        if (isFormato24h()) {
            dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        } else {
            dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        }

        LocalTime horaActual = LocalTime.now();
        String horaFormateada = horaActual.format(dateTimeFormatter);
        setText(horaFormateada);
    }

    public boolean isFormato24h() {
        return formato24h;
    }

    public void setFormato24h(boolean formato24h) {
        this.formato24h = formato24h;
    }

}
