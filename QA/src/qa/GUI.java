/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qa;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author jgamb
 */
public class GUI extends javax.swing.JFrame {
    
    private NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
    
    private final SQLConnection server;
    /**
     * Creates new form NewJFrame
     * @throws java.sql.SQLException
     */
    public GUI() throws SQLException {
        this.server = new SQLConnection();
        setLocationRelativeTo(null);
        initComponents();
        setSize(900, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        l_username = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        l_password = new javax.swing.JLabel();
        pwfield = new javax.swing.JPasswordField();
        cb_showp = new javax.swing.JCheckBox();
        b_login = new javax.swing.JButton();
        Inside = new javax.swing.JPanel();
        NavBar = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        b_obrero = new javax.swing.JButton();
        b_empleados = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        Parent = new javax.swing.JPanel();
        p_empty = new javax.swing.JPanel();
        p_deducciones_renta = new javax.swing.JPanel();
        pd_title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_deducciones_por_empleado = new javax.swing.JTable();
        b_pd_calcular = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_deducciones_al_patrono = new javax.swing.JTable();
        pp_title1 = new javax.swing.JLabel();
        p_empleado = new javax.swing.JPanel();
        pe_title1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_empleados = new javax.swing.JTable();
        pe_title3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_ded_empleado = new javax.swing.JTable();
        tf_cedula = new javax.swing.JTextField();
        b_cedula = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.CardLayout());

        Login.setLayout(null);

        label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Iniciar Sesión");
        Login.add(label);
        label.setBounds(340, 140, 160, 40);

        l_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_username.setText("Usuario");
        Login.add(l_username);
        l_username.setBounds(300, 210, 64, 27);
        Login.add(tf_username);
        tf_username.setBounds(370, 210, 190, 22);

        l_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_password.setText("Contraseña");
        Login.add(l_password);
        l_password.setBounds(280, 260, 90, 27);
        Login.add(pwfield);
        pwfield.setBounds(370, 260, 190, 22);

        cb_showp.setText("Mostrar contraseña");
        cb_showp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_showpActionPerformed(evt);
            }
        });
        Login.add(cb_showp);
        cb_showp.setBounds(410, 300, 150, 20);

        b_login.setText("Log In");
        b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loginActionPerformed(evt);
            }
        });
        Login.add(b_login);
        b_login.setBounds(400, 340, 72, 23);

        jPanel1.add(Login, "card2");

        Inside.setLayout(null);

        NavBar.setBackground(new java.awt.Color(29, 29, 29));
        NavBar.setLayout(null);

        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("<html><center>Control de Nómina y Pagos</center></html>");
        title.setToolTipText("");
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NavBar.add(title);
        title.setBounds(0, 10, 200, 80);

        b_obrero.setBackground(new java.awt.Color(41, 46, 52));
        b_obrero.setText("<html><center>Deducciones e Impuestos</center></html>");
        b_obrero.setBorderPainted(false);
        b_obrero.setMaximumSize(new java.awt.Dimension(100, 40));
        b_obrero.setMinimumSize(new java.awt.Dimension(100, 40));
        b_obrero.setPreferredSize(new java.awt.Dimension(100, 40));
        b_obrero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_obreroActionPerformed(evt);
            }
        });
        NavBar.add(b_obrero);
        b_obrero.setBounds(10, 100, 180, 50);

        b_empleados.setBackground(new java.awt.Color(41, 46, 52));
        b_empleados.setText("<html><center>Consultar Empleados</center></html>");
        b_empleados.setBorderPainted(false);
        b_empleados.setMaximumSize(new java.awt.Dimension(100, 40));
        b_empleados.setMinimumSize(new java.awt.Dimension(100, 40));
        b_empleados.setPreferredSize(new java.awt.Dimension(100, 40));
        b_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_empleadosActionPerformed(evt);
            }
        });
        NavBar.add(b_empleados);
        b_empleados.setBounds(10, 160, 180, 50);

        b_salir.setBackground(new java.awt.Color(41, 46, 52));
        b_salir.setText("Salir");
        b_salir.setBorderPainted(false);
        b_salir.setMaximumSize(new java.awt.Dimension(100, 40));
        b_salir.setMinimumSize(new java.awt.Dimension(100, 40));
        b_salir.setPreferredSize(new java.awt.Dimension(100, 40));
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        NavBar.add(b_salir);
        b_salir.setBounds(10, 220, 180, 50);

        Inside.add(NavBar);
        NavBar.setBounds(0, 0, 200, 500);

        Parent.setBackground(new java.awt.Color(153, 0, 153));
        Parent.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout p_emptyLayout = new javax.swing.GroupLayout(p_empty);
        p_empty.setLayout(p_emptyLayout);
        p_emptyLayout.setHorizontalGroup(
            p_emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        p_emptyLayout.setVerticalGroup(
            p_emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Parent.add(p_empty, "card6");

        p_deducciones_renta.setBackground(new java.awt.Color(204, 204, 204));
        p_deducciones_renta.setLayout(null);

        pd_title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pd_title.setForeground(new java.awt.Color(0, 0, 0));
        pd_title.setText("Deducciones de Obrero e Impuestos de Renta");
        p_deducciones_renta.add(pd_title);
        pd_title.setBounds(160, 180, 380, 25);

        tbl_deducciones_por_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Cédula", "Salario Bruto", "IVM", "SEM", "Banco Popular", "Deducciones Obrero", "Impuesto de Renta", "Salario Neto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_deducciones_por_empleado.setAutoResizeMode(0);
        jScrollPane2.setViewportView(tbl_deducciones_por_empleado);

        p_deducciones_renta.add(jScrollPane2);
        jScrollPane2.setBounds(40, 220, 630, 230);

        b_pd_calcular.setText("Calcular");
        b_pd_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pd_calcularActionPerformed(evt);
            }
        });
        p_deducciones_renta.add(b_pd_calcular);
        b_pd_calcular.setBounds(584, 40, 75, 23);

        tbl_deducciones_al_patrono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Fecha", "SEM", "IVM", "Cuota Banco Popular", "Familiares", "IMAS", "INA", "Aporte Patrono Banco Popular", "FCL", "FPC", "INS", "Monto total bruto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_deducciones_al_patrono.setAutoResizeMode(0);
        jScrollPane3.setViewportView(tbl_deducciones_al_patrono);

        p_deducciones_renta.add(jScrollPane3);
        jScrollPane3.setBounds(30, 70, 630, 100);

        pp_title1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pp_title1.setForeground(new java.awt.Color(0, 0, 0));
        pp_title1.setText("Deducciones Patronales");
        p_deducciones_renta.add(pp_title1);
        pp_title1.setBounds(250, 30, 188, 40);

        Parent.add(p_deducciones_renta, "card2");

        p_empleado.setBackground(new java.awt.Color(204, 204, 204));
        p_empleado.setLayout(null);

        pe_title1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pe_title1.setForeground(new java.awt.Color(0, 0, 0));
        pe_title1.setText("Empleados");
        p_empleado.add(pe_title1);
        pe_title1.setBounds(300, 30, 100, 25);

        tbl_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre Completo", "Salario Bruto", "Cumpleaños", "Departamento", "Aporte Asociación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbl_empleados);

        p_empleado.add(jScrollPane5);
        jScrollPane5.setBounds(30, 70, 630, 210);

        pe_title3.setForeground(new java.awt.Color(0, 0, 0));
        pe_title3.setText("Buscar Empleado por Cédula:");
        p_empleado.add(pe_title3);
        pe_title3.setBounds(30, 310, 180, 16);

        tbl_ded_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Cédula", "Salario Bruto", "IVM", "SEM", "Banco Popular", "Deducciones Obreras", "Impuesto de Renta", "Salario Neto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ded_empleado.setAutoResizeMode(0);
        jScrollPane7.setViewportView(tbl_ded_empleado);

        p_empleado.add(jScrollPane7);
        jScrollPane7.setBounds(30, 340, 630, 110);

        tf_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cedulaActionPerformed(evt);
            }
        });
        p_empleado.add(tf_cedula);
        tf_cedula.setBounds(210, 310, 140, 22);

        b_cedula.setText("Buscar");
        b_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cedulaActionPerformed(evt);
            }
        });
        p_empleado.add(b_cedula);
        b_cedula.setBounds(585, 310, 75, 23);

        Parent.add(p_empleado, "card5");

        Inside.add(Parent);
        Parent.setBounds(200, 0, 700, 500);

        jPanel1.add(Inside, "card3");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 500);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void update_tbl_deducciones_al_patrono(ResultSet rs) throws SQLException{
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tbl_deducciones_al_patrono.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            int entry = rs.getInt("codigo");
            String current_date = rs.getString("curdate");
            float ivm = rs.getLong("IVM");
            float sem = rs.getLong("SEM");
            float cuotaBP = rs.getLong("cuota_banco_popular");
            float familiares = rs.getLong("familiares");
            float imas = rs.getLong("IMAS");
            float ina = rs.getLong("INA");
            float aporteBP = rs.getLong("aporte_banco_popular");
            float fcl = rs.getLong("FCL");
            float fpc = rs.getLong("FPC");
            float ins = rs.getLong("INS");
            float monto_total_bruto = rs.getLong("monto_total_bruto");
            //System.out.println("entry "+ entry + " current_date: " + current_date + " monto_a_pagar: " + monto_a_pagar + " monto_total_bruto:" +monto_total_bruto);
            Object[] row = {entry, current_date, numberFormat.format(sem), numberFormat.format(ivm), numberFormat.format(cuotaBP), numberFormat.format(familiares), numberFormat.format(imas), numberFormat.format(ina), numberFormat.format(aporteBP), numberFormat.format(fcl), numberFormat.format(fpc), numberFormat.format(ins), numberFormat.format(monto_total_bruto)};

            model.addRow(row);
        }
        model.fireTableDataChanged();
    }
    
    private void update_tbl_deducciones_por_empleado(ResultSet rs) throws SQLException{
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tbl_deducciones_por_empleado.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            String fecha = rs.getString("Fecha");
            int cedula = rs.getInt("Cedula");
            int salario_bruto = rs.getInt("Salario Bruto");
            int ivm = rs.getInt("IVM");
            int sem = rs.getInt("SEM");
            int bancoPop = rs.getInt("Banco Popular");
            int deducciones = rs.getInt("Deducciones Obreras");
            int impuesto = rs.getInt("Impuesto de Renta");
            int salario_neto = rs.getInt("Salario Neto");
            Object[] row = {fecha, cedula, numberFormat.format(salario_bruto), numberFormat.format(ivm), numberFormat.format(sem), numberFormat.format(bancoPop),numberFormat.format(deducciones), numberFormat.format(impuesto), numberFormat.format(salario_neto)};
            
            model.addRow(row);
        }
        model.fireTableDataChanged();
    }
    
    private void b_obreroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_obreroActionPerformed
        Parent.removeAll();
        Parent.add(p_deducciones_renta);
        Parent.repaint();
        Parent.revalidate();
        try {
            ResultSet rs = server.select_ded_empleados();
            update_tbl_deducciones_por_empleado(rs);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_obreroActionPerformed

        private void update_tbl_empleados(ResultSet rs) throws SQLException{
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tbl_empleados.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            int cedula = rs.getInt("Cedula");
            String nombre = rs.getString("nombre");
            String apellido1 = rs.getString("apellido1");
            String apellido2 = rs.getString("apellido2");
            int salario_bruto = rs.getInt("salario");
            String birthday = rs.getString("fecha_nacimiento");
            String departamento = rs.getString("departamento");
            float aporteAso = rs.getFloat("aporte_asociacion");

            //System.out.println("entry "+ entry + " current_date: " + current_date + " monto_a_pagar: " + monto_a_pagar + " monto_total_bruto:" +monto_total_bruto);
            Object[] row = {cedula, nombre+" "+apellido1+" "+apellido2,numberFormat.format(salario_bruto), birthday, departamento, aporteAso};

            model.addRow(row);
        }
        model.fireTableDataChanged();
    }
    
    private void b_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_empleadosActionPerformed
        Parent.removeAll();
        Parent.add(p_empleado);
        Parent.repaint();
        Parent.revalidate();
        try {
            ResultSet rs = server.select_empleados();
            update_tbl_empleados(rs);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_empleadosActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        Parent.removeAll();
        Parent.add(p_empty);
        Parent.repaint();
        Parent.revalidate();
        jPanel1.removeAll();
        jPanel1.add(Login);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_b_salirActionPerformed

    private void b_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_loginActionPerformed
        String username = tf_username.getText();
        String pw = new String(pwfield.getPassword());
        
        if (username.equals("") || pw.equals("")){
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos necesarios.");
        } else if (username.contains("username") && pw.contains("password")){ //Change
            jPanel1.removeAll();
            jPanel1.add(Inside);
            jPanel1.repaint();
            jPanel1.revalidate();
        } else {
            JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecta.", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_loginActionPerformed

    private void cb_showpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_showpActionPerformed
        if(cb_showp.isSelected()){
            pwfield.setEchoChar((char)0);
        }else{
            pwfield.setEchoChar('*');
        }
    }//GEN-LAST:event_cb_showpActionPerformed

    /**/
    private void b_pd_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pd_calcularActionPerformed
        try {
            server.sp_patronales();
            ResultSet rs = server.select_patronales();
            update_tbl_deducciones_al_patrono(rs);
            
            rs = server.select_ded_empleados();
            update_tbl_deducciones_por_empleado(rs);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_b_pd_calcularActionPerformed

    private void update_tbl_ded_empleado(ResultSet rs) throws SQLException{
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tbl_ded_empleado.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            String fecha = rs.getString("Fecha");
            int cedula = rs.getInt("Cedula");
            int salario_bruto = rs.getInt("Salario Bruto");
            int ivm = rs.getInt("IVM");
            int sem = rs.getInt("SEM");
            int bancoPop = rs.getInt("Banco Popular");
            int deducciones = rs.getInt("Deducciones Obreras");
            int impuesto = rs.getInt("Impuesto de Renta");
            int salario_neto = rs.getInt("Salario Neto");
            Object[] row = {fecha, cedula, numberFormat.format(salario_bruto), numberFormat.format(ivm), numberFormat.format(sem), numberFormat.format(bancoPop),numberFormat.format(deducciones), numberFormat.format(impuesto), numberFormat.format(salario_neto)};
            
            model.addRow(row);
        }
        model.fireTableDataChanged();
    }
    
    private void tf_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cedulaActionPerformed

    private void b_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cedulaActionPerformed
        String cedula = tf_cedula.getText();
        
        if (cedula.equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese una cédula.");
        } else { 
            try {
                ResultSet rs = server.select_ded_empleado(cedula);
                update_tbl_ded_empleado(rs);
            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_b_cedulaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inside;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel NavBar;
    private javax.swing.JPanel Parent;
    private javax.swing.JButton b_cedula;
    private javax.swing.JButton b_empleados;
    private javax.swing.JButton b_login;
    private javax.swing.JButton b_obrero;
    private javax.swing.JButton b_pd_calcular;
    private javax.swing.JButton b_salir;
    private javax.swing.JCheckBox cb_showp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel l_password;
    private javax.swing.JLabel l_username;
    private javax.swing.JLabel label;
    private javax.swing.JPanel p_deducciones_renta;
    private javax.swing.JPanel p_empleado;
    private javax.swing.JPanel p_empty;
    private javax.swing.JLabel pd_title;
    private javax.swing.JLabel pe_title1;
    private javax.swing.JLabel pe_title3;
    private javax.swing.JLabel pp_title1;
    private javax.swing.JPasswordField pwfield;
    private javax.swing.JTable tbl_ded_empleado;
    private javax.swing.JTable tbl_deducciones_al_patrono;
    private javax.swing.JTable tbl_deducciones_por_empleado;
    private javax.swing.JTable tbl_empleados;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_username;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
