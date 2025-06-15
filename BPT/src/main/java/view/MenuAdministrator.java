/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import static control.MenuOrganizatorControl.changeButtonColor;
import static control.MenuOrganizatorControl.changePanelColor;
import java.awt.Color;
import java.awt.Image;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Administrator;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuAdministrator extends javax.swing.JFrame {
    
    private Administrator administrator;

    /**
     * Creates new form Administrator
     * @param administrator
     */
    public MenuAdministrator(Administrator administrator) {
        this.administrator = administrator;
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        visualizar(tablaAdministrarPagos);
        this.newIcon();
    }

    private void newIcon(){
        Image icon = new ImageIcon(getClass().getResource("/images/logoTamanacoSinFuego.png")).getImage();
        this.setIconImage(icon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tituloSuperior = new javax.swing.JLabel();
        botonSalida = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        NombreAdministrador = new javax.swing.JLabel();
        IconoCalendario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonAdministrarPago = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonVisualizarReporte = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        iconoSuperior = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        botonActualizarPagos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAdministrarPagos = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBackground(new java.awt.Color(250, 250, 250));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel19.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel64.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(153, 153, 153));
        jLabel64.setText("EQUIPOS");
        jPanel19.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, 60));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rogerDobles.jpg"))); // NOI18N
        jLabel55.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel19.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 230, 180));

        jLabel65.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel19.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 240, 150));

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/equipoTenis.jpg"))); // NOI18N
        jLabel66.setToolTipText("");
        jLabel66.setAutoscrolls(true);
        jPanel19.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 230, 150));

        jLabel67.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(153, 153, 153));
        jLabel67.setText("como organizador TE INVITO A creaR un torneo...");
        jPanel19.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 60));

        jLabel69.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(153, 153, 153));
        jLabel69.setText("DOBLES");
        jPanel19.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, 60));

        jLabel70.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(153, 153, 153));
        jLabel70.setText("SINGLES");
        jPanel19.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, 60));

        jPanel22.setBackground(new java.awt.Color(30, 25, 161));

        jLabel72.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("CREAR TORNEO");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jLabel72)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                    .addContainerGap(8, Short.MAX_VALUE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel19.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 460, 130, 40));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel19.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 146, 315, 389));

        jPanel23.setBackground(new java.awt.Color(30, 25, 161));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("CREAR TORNEO");
        jPanel23.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel19.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel19.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 146, 315, 389));

        jPanel24.setBackground(new java.awt.Color(30, 25, 161));

        jLabel71.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("CREAR TORNEO");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jLabel71)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                    .addContainerGap(8, Short.MAX_VALUE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel19.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 130, 40));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel19.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 146, 315, 389));

        jTabbedPane2.addTab("tab1", jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel73.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(153, 153, 153));
        jLabel73.setText("buscar jugador");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jLabel73)
                .addContainerGap(464, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab2", jPanel20);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel74.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(153, 153, 153));
        jLabel74.setText("fase eliminacion directa");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel74)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab3", jPanel21);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel83.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(153, 153, 153));
        jLabel83.setText("ver torneos en curso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel83)
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab4", jPanel2);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel84.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(153, 153, 153));
        jLabel84.setText("calendario");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel84)
                .addContainerGap(497, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab5", jPanel29);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneoEnCurso.png"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        jLabel7.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("VER TORNEOS EN CURSO");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloSuperior.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        tituloSuperior.setForeground(new java.awt.Color(255, 255, 255));
        tituloSuperior.setText("ADMINISTRAR PAGOS");
        jPanel1.add(tituloSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, 50));

        botonSalida.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSalida.setForeground(new java.awt.Color(255, 255, 255));
        botonSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSalida.setText("X");
        botonSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalidaMouseClicked(evt);
            }
        });
        jPanel1.add(botonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 20, 40));

        botonMinimizar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        botonMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonMinimizar.setText("__");
        botonMinimizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 50, 40));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreAdministrador.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        NombreAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        NombreAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreAdministrador.setText(administrator.getName());
        NombreAdministrador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NombreAdministradorMouseMoved(evt);
            }
        });
        NombreAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NombreAdministradorMouseExited(evt);
            }
        });
        jPanel4.add(NombreAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, -1));

        IconoCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fotoPerfilPequenio.png"))); // NOI18N
        jPanel4.add(IconoCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 230, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bannerRojo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 370, 280));

        botonAdministrarPago.setBackground(new java.awt.Color(255, 51, 51));
        botonAdministrarPago.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonAdministrarPagoMouseMoved(evt);
            }
        });
        botonAdministrarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAdministrarPagoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAdministrarPagoMouseExited(evt);
            }
        });
        botonAdministrarPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoAdministrarPagoPequenio.png"))); // NOI18N
        botonAdministrarPago.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel5.setText("ADMINISTRAR PAGOS");
        botonAdministrarPago.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        jPanel4.add(botonAdministrarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 360, 60));

        botonVisualizarReporte.setBackground(new java.awt.Color(255, 51, 51));
        botonVisualizarReporte.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonVisualizarReporteMouseMoved(evt);
            }
        });
        botonVisualizarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVisualizarReporteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVisualizarReporteMouseExited(evt);
            }
        });
        botonVisualizarReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoVisualizarReportePequenio.png"))); // NOI18N
        botonVisualizarReporte.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        jLabel9.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel9.setText("VISUALIZAR REPORTES");
        botonVisualizarReporte.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        jPanel4.add(botonVisualizarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 360, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 780));

        iconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoAdministrarPago.png"))); // NOI18N
        jPanel1.add(iconoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, 80));

        Banner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bannerRojo.jpg"))); // NOI18N
        Banner.setText("jLabel1");
        Banner.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Banner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BannerMouseClicked(evt);
            }
        });
        jPanel1.add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1030, 90));

        jTabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1370, 625));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonActualizarPagos.setBackground(new java.awt.Color(204, 0, 51));
        botonActualizarPagos.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonActualizarPagos.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizarPagos.setText("Actualizar pagos");
        botonActualizarPagos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonActualizarPagosMouseMoved(evt);
            }
        });
        botonActualizarPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonActualizarPagosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonActualizarPagosMouseExited(evt);
            }
        });
        botonActualizarPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarPagosActionPerformed(evt);
            }
        });
        jPanel3.add(botonActualizarPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 140, 40));

        tablaAdministrarPagos.setAutoCreateRowSorter(true);
        tablaAdministrarPagos.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tablaAdministrarPagos.setModel(tablaAdministrarPagos.getModel());
        tablaAdministrarPagos.setAutoscrolls(false);
        tablaAdministrarPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaAdministrarPagos.setGridColor(new java.awt.Color(204, 204, 204));
        tablaAdministrarPagos.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaAdministrarPagos.setSelectionForeground(new java.awt.Color(30, 25, 161));
        jScrollPane2.setViewportView(tablaAdministrarPagos);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 810, 442));

        jTabbedPane.addTab("tab1", jPanel3);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jLabel90.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(153, 153, 153));
        jLabel90.setText("VISUALIZAR REPORTES");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jLabel90)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("tab2", jPanel30);

        jPanel1.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 1020, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BannerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BannerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BannerMouseClicked

    private void botonVisualizarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVisualizarReporteMouseClicked
        jTabbedPane.setSelectedIndex(1);
        tituloSuperior.setText("Reportes");
        iconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoVisualizarReporte.png")));
    }//GEN-LAST:event_botonVisualizarReporteMouseClicked

    private void botonVisualizarReporteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVisualizarReporteMouseMoved
        changePanelColor(botonVisualizarReporte,250,250,250);
    }//GEN-LAST:event_botonVisualizarReporteMouseMoved

    private void botonVisualizarReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVisualizarReporteMouseExited
        changePanelColor(botonVisualizarReporte,255,51,51);
    }//GEN-LAST:event_botonVisualizarReporteMouseExited

    private void botonSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalidaMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void botonAdministrarPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAdministrarPagoMouseExited
        changePanelColor(botonAdministrarPago,255,51,51);
    }//GEN-LAST:event_botonAdministrarPagoMouseExited

    private void botonAdministrarPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAdministrarPagoMouseClicked
        jTabbedPane.setSelectedIndex(0);
        tituloSuperior.setText("Administrar pagos");
        iconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoAdministrarPago.png")));
    }//GEN-LAST:event_botonAdministrarPagoMouseClicked

    private void botonAdministrarPagoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAdministrarPagoMouseMoved
        changePanelColor(botonAdministrarPago,250,250,250);
    }//GEN-LAST:event_botonAdministrarPagoMouseMoved

    private void botonActualizarPagosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarPagosMouseMoved
        changeButtonColor(botonActualizarPagos,255,51,51);
    }//GEN-LAST:event_botonActualizarPagosMouseMoved

    private void botonActualizarPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarPagosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarPagosMouseClicked

    private void botonActualizarPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarPagosMouseExited
        changeButtonColor(botonActualizarPagos,204,0,51);
    }//GEN-LAST:event_botonActualizarPagosMouseExited

    private void botonActualizarPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarPagosActionPerformed
        
    }//GEN-LAST:event_botonActualizarPagosActionPerformed

    private void NombreAdministradorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreAdministradorMouseMoved
        NombreAdministrador.setText("ADMINISTRADOR");
    }//GEN-LAST:event_NombreAdministradorMouseMoved

    private void NombreAdministradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreAdministradorMouseExited
        NombreAdministrador.setText(administrator.getName());
    }//GEN-LAST:event_NombreAdministradorMouseExited

    public final void visualizar(JTable tabla) {    
        Object[][] jugadores = administrator.readPlayerList();  
        String[] columna = new String[]{"Nombre", "Cedula", "Estado"};
        DefaultTableModel dt = new DefaultTableModel((Object[][]) jugadores, columna);
        tabla.setModel(dt); 
        setUpEstadoColumn(tabla, tabla.getColumnModel().getColumn(2));
    }
    
    public void setUpEstadoColumn(JTable table,
        TableColumn estadoColumn) {
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Pendiente");
        comboBox.addItem("Abonado");
        comboBox.addItem("Al dia");
        estadoColumn.setCellEditor(new DefaultCellEditor(comboBox));

        //Set up tool tips for the sport cells.
        DefaultTableCellRenderer renderer
                = new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo box");
        estadoColumn.setCellRenderer(renderer);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JLabel IconoCalendario;
    private javax.swing.JLabel NombreAdministrador;
    private javax.swing.JButton botonActualizarPagos;
    private javax.swing.JPanel botonAdministrarPago;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JLabel botonSalida;
    private javax.swing.JPanel botonVisualizarReporte;
    private javax.swing.JLabel iconoSuperior;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tablaAdministrarPagos;
    private javax.swing.JLabel tituloSuperior;
    // End of variables declaration//GEN-END:variables
}
