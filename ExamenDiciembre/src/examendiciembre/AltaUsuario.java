package examendiciembre;

public class AltaUsuario extends javax.swing.JDialog {

    private Usuario usuario;

    public AltaUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelMain = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        bAdd = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        panelFormulario = new javax.swing.JPanel();
        tNombre = new javax.swing.JTextField();
        tApellido = new javax.swing.JTextField();
        tTelefono = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cSuscrito = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelMain.setLayout(new java.awt.BorderLayout());

        panelBotones.setLayout(new java.awt.GridBagLayout());

        bAdd.setText("Añadir");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });
        panelBotones.add(bAdd, new java.awt.GridBagConstraints());

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });
        panelBotones.add(bCancelar, new java.awt.GridBagConstraints());

        panelMain.add(panelBotones, java.awt.BorderLayout.SOUTH);

        panelFormulario.setLayout(new java.awt.GridBagLayout());

        tNombre.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelFormulario.add(tNombre, gridBagConstraints);

        tApellido.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelFormulario.add(tApellido, gridBagConstraints);

        tTelefono.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelFormulario.add(tTelefono, gridBagConstraints);

        tEmail.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelFormulario.add(tEmail, gridBagConstraints);

        jLabel1.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panelFormulario.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Apellidos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panelFormulario.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Telefono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        panelFormulario.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        panelFormulario.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Suscrito");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        panelFormulario.add(jLabel5, gridBagConstraints);

        cSuscrito.setText("SI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        panelFormulario.add(cSuscrito, gridBagConstraints);

        panelMain.add(panelFormulario, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        usuario = new Usuario();
        usuario.setNombre(tNombre.getText());
        usuario.setApellido(tApellido.getText());
        usuario.setTelefono(Integer.parseInt(tTelefono.getText()));
        usuario.setEmail(tEmail.getText());
        usuario.setSuscrito(cSuscrito.isSelected());

        dispose();
     }//GEN-LAST:event_bAddActionPerformed

    public Usuario getUsuario() {
        return usuario;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            AltaUsuario dialog = new AltaUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bCancelar;
    private javax.swing.JCheckBox cSuscrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField tApellido;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables
}
