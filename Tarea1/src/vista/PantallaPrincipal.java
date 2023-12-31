package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Reserva;
import modelo.TipoEvento;

public class PantallaPrincipal extends javax.swing.JFrame {

    public PantallaPrincipal() {
        initComponents();

        // Lo ideal sería añadir esto en initComponents(), pero al estar bloqueado lo añado aquí
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int width = this.getSize().width;
        int height = this.getSize().height;
        int xPos = (pantalla.width - width) / 2;
        int yPos = (pantalla.height - height) / 2;
        this.setLocation(xPos, yPos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelNorte = new javax.swing.JPanel();
        jLabelTituloPantallaPrincipal = new javax.swing.JLabel();
        jPanelCentro = new javax.swing.JPanel();
        ButtonSalonHabana = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuSalonesDisponibles = new javax.swing.JMenu();
        jMenuItemSalonHabana = new javax.swing.JMenuItem();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemAlta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Habana");
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 400));

        jPanelMain.setLayout(new java.awt.BorderLayout());

        jLabelTituloPantallaPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTituloPantallaPrincipal.setText("GESTIÓN HOTELERA LA HABANA");
        jLabelTituloPantallaPrincipal.setAlignmentY(0.0F);
        jLabelTituloPantallaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelNorteLayout = new javax.swing.GroupLayout(jPanelNorte);
        jPanelNorte.setLayout(jPanelNorteLayout);
        jPanelNorteLayout.setHorizontalGroup(
            jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelNorteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelTituloPantallaPrincipal)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelNorteLayout.setVerticalGroup(
            jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelNorteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelTituloPantallaPrincipal)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelMain.add(jPanelNorte, java.awt.BorderLayout.NORTH);

        jPanelCentro.setMaximumSize(new java.awt.Dimension(700, 400));
        jPanelCentro.setMinimumSize(new java.awt.Dimension(700, 400));
        jPanelCentro.setPreferredSize(new java.awt.Dimension(700, 400));

        ButtonSalonHabana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salonLaHabanaOriginal.png"))); // NOI18N
        ButtonSalonHabana.setToolTipText("Salón La Habana");
        ButtonSalonHabana.setBorder(null);
        ButtonSalonHabana.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salonLaHabanaMini.png"))); // NOI18N
        ButtonSalonHabana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalonHabanaActionPerformed(evt);
            }
        });
        jPanelCentro.add(ButtonSalonHabana);

        jPanelMain.add(jPanelCentro, java.awt.BorderLayout.CENTER);

        jMenuInicio.setText("Inicio");
        jMenuBar.add(jMenuInicio);

        jMenuSalonesDisponibles.setText("Salones disponibles");

        jMenuItemSalonHabana.setText("Salón Habana");
        jMenuItemSalonHabana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalonHabanaActionPerformed(evt);
            }
        });
        jMenuSalonesDisponibles.add(jMenuItemSalonHabana);

        jMenuBar.add(jMenuSalonesDisponibles);

        jMenuClientes.setText("Clientes");

        jMenuItemAlta.setText("Alta");
        jMenuItemAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemAlta);

        jMenuBar.add(jMenuClientes);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalonHabanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalonHabanaActionPerformed
        PantallaSecundaria ps = new PantallaSecundaria(this, rootPaneCheckingEnabled);
        ps.setVisible(true);
    }//GEN-LAST:event_jMenuItemSalonHabanaActionPerformed

    private void ButtonSalonHabanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalonHabanaActionPerformed
        PantallaSecundaria ps = new PantallaSecundaria(this, rootPaneCheckingEnabled);
        ps.setVisible(true);
    }//GEN-LAST:event_ButtonSalonHabanaActionPerformed

    private void jMenuItemAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaActionPerformed
        AltaUsuario au = new AltaUsuario(this, rootPaneCheckingEnabled);
        au.setVisible(true);
    }//GEN-LAST:event_jMenuItemAltaActionPerformed

    public void mostrarBienvenida(Reserva reserva) {
        String nombre = reserva.getNombre();
        int telefono = reserva.getTelefono();
        int numeroDias = reserva.getNumeroDias();
        int numeroHabitaciones = reserva.getNumeroHabitaciones();
        LocalDate fecha = reserva.getFechaEvento();
        int numeroAsistentesEvento = reserva.getNumeroAsistentesEvento();
        List<String> tipoCocina = reserva.getTipoCocina();
        TipoEvento tipoEvento = reserva.getTipoEvento();
        int numeroJornadasCongreso = reserva.getNumeroJornadasCongreso();
        boolean asistentesNecesitanHabitaciones = reserva.isAsistentesNecesitanHabitaciones();

        // Construimos el mensaje que vamos a mostrar en el OptionPane
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Gracias por su reserva, ").append(nombre).append("\n\n");
        mensaje.append("La información de su reserva es:\n");
        mensaje.append("Teléfono: ").append(telefono).append("\n");
        mensaje.append("Número de días: ").append(numeroDias).append("\n");
        mensaje.append("Número de habitaciones: ").append(numeroHabitaciones).append("\n");
        mensaje.append("Fecha del evento: ").append(fecha).append("\n");
        mensaje.append("Número de asistentes al evento: ").append(numeroAsistentesEvento).append("\n");
        mensaje.append("Tipo de cocina: ").append(tipoCocina).append("\n");
        mensaje.append("Tipo de evento: ").append(tipoEvento).append("\n");
        if (tipoEvento == tipoEvento.CONGRESO) {
            mensaje.append("Número de jornadas de congreso: ").append(numeroJornadasCongreso).append("\n");
            mensaje.append("¿Los asistentes necesitan habitaciones? ").append(asistentesNecesitanHabitaciones ? "Sí" : "No");
        }

        JOptionPane.showMessageDialog(this, mensaje.toString(), "Mensaje de bienvenida", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PantallaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalonHabana;
    private javax.swing.JLabel jLabelTituloPantallaPrincipal;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItemAlta;
    private javax.swing.JMenuItem jMenuItemSalonHabana;
    private javax.swing.JMenu jMenuSalonesDisponibles;
    private javax.swing.JPanel jPanelCentro;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelNorte;
    // End of variables declaration//GEN-END:variables
}
