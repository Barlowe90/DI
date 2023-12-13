package vista;

import java.awt.Dimension;
import java.util.List;
import java.awt.Toolkit;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Reserva;
import modelo.TipoEvento;

public class PantallaSecundaria extends javax.swing.JDialog {

    public static String EVENTO = "Congreso";
    private PantallaPrincipal pantallaPrincipal;

    public PantallaSecundaria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pantallaPrincipal = (PantallaPrincipal) parent;
        initComponents();

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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelTituloReservaSalon = new javax.swing.JLabel();
        jButtonRealizarReserva = new javax.swing.JButton();
        jPanelCenter = new javax.swing.JPanel();
        jPanelDatosPersonalesReserva = new javax.swing.JPanel();
        labelDatosPersonalesReserva = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelNumeroDias = new javax.swing.JLabel();
        labelNumeroHabitaciones = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jSpinnerNumeroDias = new javax.swing.JSpinner();
        jSpinnerNumeroHabitaciones = new javax.swing.JSpinner();
        labelFechaEvento = new javax.swing.JLabel();
        labelEvento = new javax.swing.JLabel();
        labelTipoEvento = new javax.swing.JLabel();
        labelNumeroAsistentes = new javax.swing.JLabel();
        labelTipoCocina = new javax.swing.JLabel();
        jSpinnerFecha = new javax.swing.JSpinner();
        jComboBoxTipoEvento = new javax.swing.JComboBox<>();
        jSpinnerNumeroAsistentes = new javax.swing.JSpinner();
        jScrollPaneTipoCocina = new javax.swing.JScrollPane();
        jListTipoCocina = new javax.swing.JList<>();
        labelJornadasCongreso = new javax.swing.JLabel();
        SpinnerJornadasCongreso = new javax.swing.JSpinner();
        labelAsistentes = new javax.swing.JLabel();
        jRadioButtonSiHabitaciones = new javax.swing.JRadioButton();
        jRadioButtonNoHabitaciones = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservas La Habana");
        setMinimumSize(new java.awt.Dimension(400, 600));
        setPreferredSize(new java.awt.Dimension(400, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout());

        labelTituloReservaSalon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTituloReservaSalon.setText("RESERVA SALÓN LA HABANA");
        labelTituloReservaSalon.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        getContentPane().add(labelTituloReservaSalon, java.awt.BorderLayout.NORTH);

        jButtonRealizarReserva.setText("Realizar reserva");
        jButtonRealizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarReservaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealizarReserva, java.awt.BorderLayout.SOUTH);

        jPanelCenter.setLayout(new javax.swing.BoxLayout(jPanelCenter, javax.swing.BoxLayout.Y_AXIS));

        jPanelDatosPersonalesReserva.setLayout(new java.awt.GridBagLayout());

        labelDatosPersonalesReserva.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDatosPersonalesReserva.setText("Datos personales reserva");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanelDatosPersonalesReserva.add(labelDatosPersonalesReserva, gridBagConstraints);

        labelNombre.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(labelNombre, gridBagConstraints);

        labelTelefono.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(labelTelefono, gridBagConstraints);

        labelNumeroDias.setText("Número de días");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(labelNumeroDias, gridBagConstraints);

        labelNumeroHabitaciones.setText("Número de habitaciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(labelNumeroHabitaciones, gridBagConstraints);

        jTextFieldNombre.setToolTipText("Escriba aquí su nombre completo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(jTextFieldNombre, gridBagConstraints);

        jTextFieldTelefono.setToolTipText("Escriba aquí su número de teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(jTextFieldTelefono, gridBagConstraints);

        jSpinnerNumeroDias.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerNumeroDias.setToolTipText("Seleccione el número de días del evento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(jSpinnerNumeroDias, gridBagConstraints);

        jSpinnerNumeroHabitaciones.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerNumeroHabitaciones.setToolTipText("Seleccione el número de habitaciones que necesitará");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(jSpinnerNumeroHabitaciones, gridBagConstraints);

        labelFechaEvento.setText("Fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(labelFechaEvento, gridBagConstraints);

        labelEvento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEvento.setText("Evento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanelDatosPersonalesReserva.add(labelEvento, gridBagConstraints);

        labelTipoEvento.setText("Tipo de evento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(labelTipoEvento, gridBagConstraints);

        labelNumeroAsistentes.setText("Nº de asistentes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(labelNumeroAsistentes, gridBagConstraints);

        labelTipoCocina.setText("Tipo de cocina");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(labelTipoCocina, gridBagConstraints);

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());
        jSpinnerFecha.setToolTipText("Seleccione la fecha de inicio del evento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(jSpinnerFecha, gridBagConstraints);

        jComboBoxTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banquete", "Jornada", "Congreso" }));
        jComboBoxTipoEvento.setToolTipText("Seleccione el tipo de evento");
        jComboBoxTipoEvento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoEventoItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(jComboBoxTipoEvento, gridBagConstraints);

        jSpinnerNumeroAsistentes.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerNumeroAsistentes.setToolTipText("Seleccione cuántos asistentes asistirán al evento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(jSpinnerNumeroAsistentes, gridBagConstraints);

        jListTipoCocina.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bufé", "Carta", "Cita con el chef", "No precisa" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListTipoCocina.setToolTipText("Seleccione el tipo de cocina que precisará el día del evento");
        jListTipoCocina.setMinimumSize(new java.awt.Dimension(50, 50));
        jListTipoCocina.setPreferredSize(new java.awt.Dimension(50, 50));
        jScrollPaneTipoCocina.setViewportView(jListTipoCocina);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanelDatosPersonalesReserva.add(jScrollPaneTipoCocina, gridBagConstraints);

        labelJornadasCongreso.setText("Nº jornadas del congreso");
        labelJornadasCongreso.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(labelJornadasCongreso, gridBagConstraints);

        SpinnerJornadasCongreso.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        SpinnerJornadasCongreso.setToolTipText("Seleccione el número de jornadas del congreso");
        SpinnerJornadasCongreso.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(SpinnerJornadasCongreso, gridBagConstraints);

        labelAsistentes.setText("¿Los asistentes necesitarán habitaciones?");
        labelAsistentes.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        jPanelDatosPersonalesReserva.add(labelAsistentes, gridBagConstraints);

        buttonGroup1.add(jRadioButtonSiHabitaciones);
        jRadioButtonSiHabitaciones.setText("Sí");
        jRadioButtonSiHabitaciones.setToolTipText("");
        jRadioButtonSiHabitaciones.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(jRadioButtonSiHabitaciones, gridBagConstraints);

        buttonGroup1.add(jRadioButtonNoHabitaciones);
        jRadioButtonNoHabitaciones.setText("No");
        jRadioButtonNoHabitaciones.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelDatosPersonalesReserva.add(jRadioButtonNoHabitaciones, gridBagConstraints);

        jPanelCenter.add(jPanelDatosPersonalesReserva);

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarReservaActionPerformed
        if (comprobarCamposObligatorios()) {
            int res = JOptionPane.showConfirmDialog(this, "¿Son los datos correctos?", "Confirmación de datos", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                dispose();
                pantallaPrincipal.mostrarBienvenida(obtenerValoresFormulario());
            }
        }
    }//GEN-LAST:event_jButtonRealizarReservaActionPerformed

    public boolean comprobarCamposObligatorios() {
        String texto1, texto2;
        boolean todoCorrecto = true;

        texto1 = jTextFieldNombre.getText();
        texto2 = jTextFieldTelefono.getText();
        if (texto1.isEmpty()) {
            todoCorrecto = false;
            JOptionPane.showMessageDialog(this, "El campo 'Nombre' es obligatorio.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (texto2.isEmpty()) {
            todoCorrecto = false;
            JOptionPane.showMessageDialog(this, "El campo 'Teléfono' es obligatorio.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        return todoCorrecto;
    }

    public Reserva obtenerValoresFormulario() {
        // Como el spinner no da un LocalDate tenemos que convertirlo
        Date dateValue = (Date) jSpinnerFecha.getValue();   // Primero cogemos el valor y lo casteamos a Date
        Instant instant = dateValue.toInstant();            // Pasamos el Date a un momento en el tiempo
        ZoneId zoneId = ZoneId.systemDefault();             // Ese Obtenemos la zona del ordenador
        // Convertimos el instant en un LocalDate ajustándolo a la zona horaria especificada
        LocalDate localDate = instant.atZone(zoneId).toLocalDate();

        // guardamos los elementos seleccionados en caso de que haya más de uno
        List<String> elementosSeleccionados = jListTipoCocina.getSelectedValuesList();

        // Como en el comboBox aparec en minúscula hacemos el cambio a mayúcula para que coincida con el enumerado
        String tipoEventoSeleccionado = ((String) jComboBoxTipoEvento.getSelectedItem()).toUpperCase();
        TipoEvento tipoEvento = TipoEvento.valueOf(tipoEventoSeleccionado);

        Reserva reserva = new Reserva(jTextFieldNombre.getText(),
                Integer.parseInt(jTextFieldTelefono.getText()),
                (int) jSpinnerNumeroDias.getValue(),
                (int) jSpinnerNumeroHabitaciones.getValue(),
                localDate,
                (int) jSpinnerNumeroAsistentes.getValue(),
                elementosSeleccionados,
                tipoEvento,
                (int) jSpinnerNumeroAsistentes.getValue(),
                jRadioButtonSiHabitaciones.isSelected());
        return reserva;
    }

    private void jComboBoxTipoEventoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoEventoItemStateChanged
        String seleccion;

        seleccion = jComboBoxTipoEvento.getSelectedItem().toString();

        if (EVENTO.equals(seleccion)) {
            labelJornadasCongreso.setEnabled(true);
            SpinnerJornadasCongreso.setEnabled(true);
            labelAsistentes.setEnabled(true);
            jRadioButtonSiHabitaciones.setEnabled(true);
            jRadioButtonNoHabitaciones.setEnabled(true);
        } else {
            labelJornadasCongreso.setEnabled(false);
            SpinnerJornadasCongreso.setEnabled(false);
            labelAsistentes.setEnabled(false);
            jRadioButtonSiHabitaciones.setEnabled(false);
            jRadioButtonNoHabitaciones.setEnabled(false);
        }

    }//GEN-LAST:event_jComboBoxTipoEventoItemStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            PantallaSecundaria dialog = new PantallaSecundaria(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerJornadasCongreso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonRealizarReserva;
    private javax.swing.JComboBox<String> jComboBoxTipoEvento;
    private javax.swing.JList<String> jListTipoCocina;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelDatosPersonalesReserva;
    private javax.swing.JRadioButton jRadioButtonNoHabitaciones;
    private javax.swing.JRadioButton jRadioButtonSiHabitaciones;
    private javax.swing.JScrollPane jScrollPaneTipoCocina;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JSpinner jSpinnerNumeroAsistentes;
    private javax.swing.JSpinner jSpinnerNumeroDias;
    private javax.swing.JSpinner jSpinnerNumeroHabitaciones;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JLabel labelAsistentes;
    private javax.swing.JLabel labelDatosPersonalesReserva;
    private javax.swing.JLabel labelEvento;
    private javax.swing.JLabel labelFechaEvento;
    private javax.swing.JLabel labelJornadasCongreso;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumeroAsistentes;
    private javax.swing.JLabel labelNumeroDias;
    private javax.swing.JLabel labelNumeroHabitaciones;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTipoCocina;
    private javax.swing.JLabel labelTipoEvento;
    private javax.swing.JLabel labelTituloReservaSalon;
    // End of variables declaration//GEN-END:variables
}
