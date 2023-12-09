package dam.di.relojdigital;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.JLabel;

public class CampoDeTexto extends JLabel implements Serializable {

    private Color colorTexto;
    private Font fuenteTexto;
    private int anchoTexto;

    public CampoDeTexto() {
    }

    public Color getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(Color colorTexto) {
        this.colorTexto = colorTexto;
    }

    public Font getFuenteTexto() {
        return fuenteTexto;
    }

    public void setFuenteTexto(Font fuenteTexto) {
        this.fuenteTexto = fuenteTexto;
    }

    public int getAncho() {
        return anchoTexto;
    }

    public void setAncho(int ancho) {
        this.anchoTexto = ancho;
    }

}
