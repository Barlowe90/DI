package dam.di.test;

public class TestRelojDigital extends javax.swing.JFrame {

    public TestRelojDigital() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelDigital = new dam.di.relojdigital.PanelDigital();
        campoDeTexto = new dam.di.relojdigital.CampoDeTexto();
        relojDigital = new dam.di.relojdigital.RelojDigital();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(100, 100));

        panelDigital.setRutaImagen(new java.io.File("C:\\Users\\rique\\Documents\\NetBeansProjects\\Tarea3\\src\\resources\\Yiren.jpg"));
        panelDigital.setLayout(new java.awt.GridBagLayout());

        campoDeTexto.setForeground(new java.awt.Color(255, 102, 255));
        campoDeTexto.setText("Mi Reloj");
        campoDeTexto.setColorTexto(new java.awt.Color(255, 51, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelDigital.add(campoDeTexto, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        panelDigital.add(relojDigital, gridBagConstraints);

        getContentPane().add(panelDigital, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TestRelojDigital().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dam.di.relojdigital.CampoDeTexto campoDeTexto;
    private dam.di.relojdigital.PanelDigital panelDigital;
    private dam.di.relojdigital.RelojDigital relojDigital;
    // End of variables declaration//GEN-END:variables
}
