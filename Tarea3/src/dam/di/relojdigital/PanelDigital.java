package dam.di.relojdigital;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelDigital extends JPanel implements Serializable {

    private File rutaImagen;

    public PanelDigital() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (rutaImagen != null && rutaImagen.exists()) {
            ImageIcon img = new ImageIcon(rutaImagen.getAbsolutePath());
            g.drawImage(img.getImage(), 0, 0, null);
        }
        repaint();
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
        repaint();
    }

}
