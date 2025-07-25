/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import static controller.MenuOrganizatorControl.changeButtonColor;
import static controller.StartControl.pushLoginButton;
import static controller.StartControl.startCheckBox;
import static controller.StartControl.startFocusGained;
import static controller.StartControl.startFocusLost;
import java.awt.Color;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import model.Administrator;
import model.Organizator;
import model.Player;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuStart extends javax.swing.JFrame {
    
    private List<Organizator> organizator;
    private List<Player> player;
    private List<Administrator> administrator;

    /**
     * Creates new form start
     * @param organizator
     * @param player
     * @param administrator
     */
    public MenuStart(List<Organizator> organizator, List<Player> player, List<Administrator> administrator) {
        this.organizator = organizator;
        this.player = player;
        this.administrator = administrator;
        this.setUndecorated(true);
        initComponents();
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.newIcon();
    }
    
    private void newIcon(){
        Image icon = new ImageIcon(getClass().getResource("/images/logoTamanacoSinFuego.png")).getImage();
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        iniciarSesionIngresarCedula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        iniciarSesionIngresarPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        checkBoxOrganizator = new javax.swing.JCheckBox();
        checkBoxJugador = new javax.swing.JCheckBox();
        checkBoxAdministrador = new javax.swing.JCheckBox();
        botonIniciarSeccion = new javax.swing.JButton();
        botonMinimizar1 = new javax.swing.JLabel();
        botonSalida1 = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();
        botonVerPassword = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new Color(0,0,0,99));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 420, 470));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancha_tenis.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 420, 470));

        jLabel6.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TAMANACO TENNIS LEAGUE");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 430, -1));

        jLabel9.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Break Point Tamanaco");
        jLabel9.setToolTipText("");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 150, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel8.setText("cédula:");
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel11.setText("INICIAR SEsiÓN:");
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 171, 160, -1));

        iniciarSesionIngresarCedula.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        iniciarSesionIngresarCedula.setForeground(new java.awt.Color(153, 153, 153));
        iniciarSesionIngresarCedula.setText("Ingresar cedula de identidad");
        iniciarSesionIngresarCedula.setBorder(null);
        iniciarSesionIngresarCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iniciarSesionIngresarCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                iniciarSesionIngresarCedulaFocusLost(evt);
            }
        });
        iniciarSesionIngresarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionIngresarCedulaActionPerformed(evt);
            }
        });
        jPanel2.add(iniciarSesionIngresarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel10.setText("CONTRASEÑA:");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        iniciarSesionIngresarPassword.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        iniciarSesionIngresarPassword.setForeground(new java.awt.Color(153, 153, 153));
        iniciarSesionIngresarPassword.setText("Ingresar contraseña");
        iniciarSesionIngresarPassword.setBorder(null);
        iniciarSesionIngresarPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iniciarSesionIngresarPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                iniciarSesionIngresarPasswordFocusLost(evt);
            }
        });
        iniciarSesionIngresarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionIngresarPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(iniciarSesionIngresarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 206, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 312, 16));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAutoscrolls(true);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 312, 16));

        checkBoxOrganizator.setBackground(new java.awt.Color(255, 255, 255));
        checkBoxOrganizator.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        checkBoxOrganizator.setText("Organizador");
        checkBoxOrganizator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkBoxOrganizator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxOrganizatorMouseClicked(evt);
            }
        });
        checkBoxOrganizator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxOrganizatorActionPerformed(evt);
            }
        });
        jPanel2.add(checkBoxOrganizator, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        checkBoxJugador.setBackground(new java.awt.Color(255, 255, 255));
        checkBoxJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        checkBoxJugador.setText("Jugador");
        checkBoxJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkBoxJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxJugadorMouseClicked(evt);
            }
        });
        checkBoxJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxJugadorActionPerformed(evt);
            }
        });
        jPanel2.add(checkBoxJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        checkBoxAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        checkBoxAdministrador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        checkBoxAdministrador.setText("Administrador");
        checkBoxAdministrador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkBoxAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxAdministradorMouseClicked(evt);
            }
        });
        checkBoxAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAdministradorActionPerformed(evt);
            }
        });
        jPanel2.add(checkBoxAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        botonIniciarSeccion.setBackground(new java.awt.Color(30, 25, 161));
        botonIniciarSeccion.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonIniciarSeccion.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciarSeccion.setText("Iniciar sesión");
        botonIniciarSeccion.setAlignmentY(0.0F);
        botonIniciarSeccion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonIniciarSeccionMouseMoved(evt);
            }
        });
        botonIniciarSeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIniciarSeccionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIniciarSeccionMouseExited(evt);
            }
        });
        botonIniciarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSeccionActionPerformed(evt);
            }
        });
        jPanel2.add(botonIniciarSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 120, 40));

        botonMinimizar1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonMinimizar1.setForeground(new java.awt.Color(255, 255, 255));
        botonMinimizar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonMinimizar1.setText("__");
        botonMinimizar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botonMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizar1MouseClicked(evt);
            }
        });
        jPanel2.add(botonMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 30, 40));

        botonSalida1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSalida1.setForeground(new java.awt.Color(255, 255, 255));
        botonSalida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSalida1.setText("X");
        botonSalida1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalida1MouseClicked(evt);
            }
        });
        jPanel2.add(botonSalida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 30, 40));

        Banner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.jpg"))); // NOI18N
        Banner.setText("jLabel1");
        Banner.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Banner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BannerMouseClicked(evt);
            }
        });
        jPanel2.add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 110));

        botonVerPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        botonVerPassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonVerPasswordMouseMoved(evt);
            }
        });
        botonVerPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVerPasswordMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVerPasswordMouseExited(evt);
            }
        });
        jPanel2.add(botonVerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, 30));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIniciarSeccionActionPerformed

    private void checkBoxAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAdministradorActionPerformed

    private void checkBoxJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxJugadorActionPerformed

    private void checkBoxOrganizatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxOrganizatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxOrganizatorActionPerformed

    private void iniciarSesionIngresarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionIngresarPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarSesionIngresarPasswordActionPerformed

    private void iniciarSesionIngresarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionIngresarCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarSesionIngresarCedulaActionPerformed

    private void BannerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BannerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BannerMouseClicked

    private void botonMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizar1MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_botonMinimizar1MouseClicked

    private void botonSalida1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalida1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalida1MouseClicked

    private void iniciarSesionIngresarCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iniciarSesionIngresarCedulaFocusGained
        startFocusGained(iniciarSesionIngresarCedula, "Ingresar cedula de identidad");
    }//GEN-LAST:event_iniciarSesionIngresarCedulaFocusGained

    private void iniciarSesionIngresarCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iniciarSesionIngresarCedulaFocusLost
        startFocusLost(iniciarSesionIngresarCedula, "Ingresar cedula de identidad");
    }//GEN-LAST:event_iniciarSesionIngresarCedulaFocusLost

    private void iniciarSesionIngresarPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iniciarSesionIngresarPasswordFocusGained
        startFocusGained(iniciarSesionIngresarPassword, "Ingresar contraseña");
    }//GEN-LAST:event_iniciarSesionIngresarPasswordFocusGained

    private void iniciarSesionIngresarPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iniciarSesionIngresarPasswordFocusLost
        startFocusLost(iniciarSesionIngresarPassword, "Ingresar contraseña");
    }//GEN-LAST:event_iniciarSesionIngresarPasswordFocusLost

    private void botonIniciarSeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSeccionMouseClicked
        pushLoginButton(checkBoxOrganizator, checkBoxJugador, checkBoxAdministrador, iniciarSesionIngresarCedula, iniciarSesionIngresarPassword, organizator, player, administrator, this);
    }//GEN-LAST:event_botonIniciarSeccionMouseClicked

    private void botonIniciarSeccionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSeccionMouseMoved
         changeButtonColor(botonIniciarSeccion,102,102,255);
    }//GEN-LAST:event_botonIniciarSeccionMouseMoved

    private void botonIniciarSeccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSeccionMouseExited
         changeButtonColor(botonIniciarSeccion,30,25,161);
    }//GEN-LAST:event_botonIniciarSeccionMouseExited

    private void botonVerPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerPasswordMouseClicked

    }//GEN-LAST:event_botonVerPasswordMouseClicked

    @SuppressWarnings("empty-statement")
    private void botonVerPasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerPasswordMouseMoved
        botonVerPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png")));
        iniciarSesionIngresarPassword.setEchoChar((char)0); ;
    }//GEN-LAST:event_botonVerPasswordMouseMoved

    @SuppressWarnings("empty-statement")
    private void botonVerPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerPasswordMouseExited
        botonVerPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png")));
        iniciarSesionIngresarPassword.setEchoChar((char)'•'); ;
    }//GEN-LAST:event_botonVerPasswordMouseExited

    private void checkBoxOrganizatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxOrganizatorMouseClicked
        startCheckBox(checkBoxOrganizator, checkBoxJugador, checkBoxAdministrador);
    }//GEN-LAST:event_checkBoxOrganizatorMouseClicked

    private void checkBoxJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxJugadorMouseClicked
        startCheckBox(checkBoxJugador, checkBoxOrganizator, checkBoxAdministrador);
    }//GEN-LAST:event_checkBoxJugadorMouseClicked

    private void checkBoxAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxAdministradorMouseClicked
        startCheckBox(checkBoxAdministrador, checkBoxOrganizator, checkBoxJugador);
    }//GEN-LAST:event_checkBoxAdministradorMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonIniciarSeccion;
    private javax.swing.JLabel botonMinimizar1;
    private javax.swing.JLabel botonSalida1;
    private javax.swing.JLabel botonVerPassword;
    private javax.swing.JCheckBox checkBoxAdministrador;
    private javax.swing.JCheckBox checkBoxJugador;
    private javax.swing.JCheckBox checkBoxOrganizator;
    private javax.swing.JTextField iniciarSesionIngresarCedula;
    private javax.swing.JPasswordField iniciarSesionIngresarPassword;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
