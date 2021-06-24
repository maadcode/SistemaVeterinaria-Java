
package views;

public class ViewAdoptantes extends javax.swing.JPanel {

    /**
     * Creates new form ViewAdoptantes
     */
    public ViewAdoptantes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdoptantes = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnEliminarAdoptante = new javax.swing.JButton();
        btnAgregarAdoptante = new javax.swing.JButton();
        btnEditarAdoptante = new javax.swing.JButton();
        btnBuscarAdoptante = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(84, 56, 220));
        jLabel6.setText("Dirección");
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel6);
        jLabel6.setBounds(390, 100, 120, 20);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        tblAdoptantes.setAutoCreateRowSorter(true);
        tblAdoptantes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblAdoptantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAdoptantes.setGridColor(new java.awt.Color(255, 255, 255));
        tblAdoptantes.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jScrollPane1.setViewportView(tblAdoptantes);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 710, 250);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(220, 20));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(510, 100, 220, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(84, 56, 220));
        jLabel7.setText("Nombres");
        jLabel7.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel7);
        jLabel7.setBounds(20, 20, 120, 20);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(220, 20));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(140, 20, 220, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(84, 56, 220));
        jLabel8.setText("Apellidos");
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel8);
        jLabel8.setBounds(390, 20, 120, 20);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(220, 20));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3);
        jTextField3.setBounds(510, 20, 220, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(84, 56, 220));
        jLabel9.setText("DNI");
        jLabel9.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel9);
        jLabel9.setBounds(20, 60, 120, 20);

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(220, 20));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        add(jTextField4);
        jTextField4.setBounds(140, 60, 220, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(84, 56, 220));
        jLabel10.setText("Edad");
        jLabel10.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel10);
        jLabel10.setBounds(390, 60, 120, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(84, 56, 220));
        jLabel11.setText("¿El dueño permite mascota?");
        jLabel11.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel11);
        jLabel11.setBounds(390, 140, 200, 20);

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(220, 20));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        add(jTextField5);
        jTextField5.setBounds(510, 60, 220, 20);

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(220, 20));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        add(jTextField6);
        jTextField6.setBounds(140, 100, 220, 20);

        jComboBox1.setBackground(new java.awt.Color(84, 56, 220));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jComboBox1);
        jComboBox1.setBounds(610, 140, 120, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(84, 56, 220));
        jLabel12.setText("Teléfono");
        jLabel12.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel12);
        jLabel12.setBounds(20, 100, 120, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(84, 56, 220));
        jLabel13.setText("¿Es propietario de la casa?");
        jLabel13.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel13);
        jLabel13.setBounds(20, 140, 180, 20);

        jComboBox2.setBackground(new java.awt.Color(84, 56, 220));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jComboBox2);
        jComboBox2.setBounds(240, 140, 120, 30);

        btnEliminarAdoptante.setBackground(new java.awt.Color(84, 56, 220));
        btnEliminarAdoptante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarAdoptante.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarAdoptante.setText("Eliminar");
        btnEliminarAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdoptanteActionPerformed(evt);
            }
        });
        add(btnEliminarAdoptante);
        btnEliminarAdoptante.setBounds(560, 470, 170, 31);

        btnAgregarAdoptante.setBackground(new java.awt.Color(84, 56, 220));
        btnAgregarAdoptante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregarAdoptante.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAdoptante.setText("Agregar");
        btnAgregarAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAdoptanteActionPerformed(evt);
            }
        });
        add(btnAgregarAdoptante);
        btnAgregarAdoptante.setBounds(20, 470, 170, 31);

        btnEditarAdoptante.setBackground(new java.awt.Color(84, 56, 220));
        btnEditarAdoptante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarAdoptante.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarAdoptante.setText("Editar");
        btnEditarAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAdoptanteActionPerformed(evt);
            }
        });
        add(btnEditarAdoptante);
        btnEditarAdoptante.setBounds(200, 470, 170, 31);

        btnBuscarAdoptante.setBackground(new java.awt.Color(84, 56, 220));
        btnBuscarAdoptante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarAdoptante.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAdoptante.setText("Buscar");
        btnBuscarAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAdoptanteActionPerformed(evt);
            }
        });
        add(btnBuscarAdoptante);
        btnBuscarAdoptante.setBounds(380, 470, 170, 31);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btnEliminarAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarAdoptanteActionPerformed

    private void btnAgregarAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAdoptanteActionPerformed

    private void btnEditarAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarAdoptanteActionPerformed

    private void btnBuscarAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAdoptanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarAdoptante;
    public javax.swing.JButton btnBuscarAdoptante;
    public javax.swing.JButton btnEditarAdoptante;
    public javax.swing.JButton btnEliminarAdoptante;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTable tblAdoptantes;
    // End of variables declaration//GEN-END:variables
}
