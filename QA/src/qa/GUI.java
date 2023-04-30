/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qa;

import javax.swing.JOptionPane;

/**
 *
 * @author jgamb
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GUI() {
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
        b_patron = new javax.swing.JButton();
        b_renta = new javax.swing.JButton();
        b_salario = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        Parent = new javax.swing.JPanel();
        p_empty = new javax.swing.JPanel();
        p_obrero = new javax.swing.JPanel();
        p_patron = new javax.swing.JPanel();
        p_renta = new javax.swing.JPanel();
        p_salario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        b_obrero.setText("<html><center>Deducciones Obrero</center></html>");
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

        b_patron.setBackground(new java.awt.Color(41, 46, 52));
        b_patron.setText("Deducciones Patronales");
        b_patron.setBorderPainted(false);
        b_patron.setMaximumSize(new java.awt.Dimension(100, 40));
        b_patron.setMinimumSize(new java.awt.Dimension(100, 40));
        b_patron.setPreferredSize(new java.awt.Dimension(100, 40));
        b_patron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_patronActionPerformed(evt);
            }
        });
        NavBar.add(b_patron);
        b_patron.setBounds(10, 160, 180, 50);

        b_renta.setBackground(new java.awt.Color(41, 46, 52));
        b_renta.setText("Impuesto de Renta");
        b_renta.setBorderPainted(false);
        b_renta.setMaximumSize(new java.awt.Dimension(100, 40));
        b_renta.setMinimumSize(new java.awt.Dimension(100, 40));
        b_renta.setPreferredSize(new java.awt.Dimension(100, 40));
        b_renta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rentaActionPerformed(evt);
            }
        });
        NavBar.add(b_renta);
        b_renta.setBounds(10, 220, 180, 50);

        b_salario.setBackground(new java.awt.Color(41, 46, 52));
        b_salario.setText("<html><center>Salario después de deducciones</center></html>");
        b_salario.setBorderPainted(false);
        b_salario.setMaximumSize(new java.awt.Dimension(100, 40));
        b_salario.setMinimumSize(new java.awt.Dimension(100, 40));
        b_salario.setPreferredSize(new java.awt.Dimension(100, 40));
        b_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salarioActionPerformed(evt);
            }
        });
        NavBar.add(b_salario);
        b_salario.setBounds(10, 280, 180, 50);

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
        b_salir.setBounds(10, 340, 180, 50);

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

        p_obrero.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout p_obreroLayout = new javax.swing.GroupLayout(p_obrero);
        p_obrero.setLayout(p_obreroLayout);
        p_obreroLayout.setHorizontalGroup(
            p_obreroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        p_obreroLayout.setVerticalGroup(
            p_obreroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Parent.add(p_obrero, "card2");

        p_patron.setBackground(new java.awt.Color(204, 255, 0));

        javax.swing.GroupLayout p_patronLayout = new javax.swing.GroupLayout(p_patron);
        p_patron.setLayout(p_patronLayout);
        p_patronLayout.setHorizontalGroup(
            p_patronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        p_patronLayout.setVerticalGroup(
            p_patronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Parent.add(p_patron, "card3");

        p_renta.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout p_rentaLayout = new javax.swing.GroupLayout(p_renta);
        p_renta.setLayout(p_rentaLayout);
        p_rentaLayout.setHorizontalGroup(
            p_rentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        p_rentaLayout.setVerticalGroup(
            p_rentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Parent.add(p_renta, "card4");

        p_salario.setBackground(new java.awt.Color(0, 255, 102));

        javax.swing.GroupLayout p_salarioLayout = new javax.swing.GroupLayout(p_salario);
        p_salario.setLayout(p_salarioLayout);
        p_salarioLayout.setHorizontalGroup(
            p_salarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        p_salarioLayout.setVerticalGroup(
            p_salarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Parent.add(p_salario, "card5");

        Inside.add(Parent);
        Parent.setBounds(200, 0, 700, 500);

        jPanel1.add(Inside, "card3");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_patronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_patronActionPerformed
        Parent.removeAll();
        Parent.add(p_patron);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_b_patronActionPerformed

    private void b_obreroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_obreroActionPerformed
        Parent.removeAll();
        Parent.add(p_obrero);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_b_obreroActionPerformed

    private void b_rentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rentaActionPerformed
        Parent.removeAll();
        Parent.add(p_renta);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_b_rentaActionPerformed

    private void b_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salarioActionPerformed
        Parent.removeAll();
        Parent.add(p_salario);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_b_salarioActionPerformed

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
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inside;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel NavBar;
    private javax.swing.JPanel Parent;
    private javax.swing.JButton b_login;
    private javax.swing.JButton b_obrero;
    private javax.swing.JButton b_patron;
    private javax.swing.JButton b_renta;
    private javax.swing.JButton b_salario;
    private javax.swing.JButton b_salir;
    private javax.swing.JCheckBox cb_showp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_password;
    private javax.swing.JLabel l_username;
    private javax.swing.JLabel label;
    private javax.swing.JPanel p_empty;
    private javax.swing.JPanel p_obrero;
    private javax.swing.JPanel p_patron;
    private javax.swing.JPanel p_renta;
    private javax.swing.JPanel p_salario;
    private javax.swing.JPasswordField pwfield;
    private javax.swing.JTextField tf_username;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}