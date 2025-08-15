/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import static controller.MenuDriveTournamentControl.deleteTournament;
import static controller.MenuOrganizatorControl.changeButtonColor;
import static controller.MenuOrganizatorControl.deleteMatch;
import static controller.MenuOrganizatorControl.foundMatch;
import static controller.MenuOrganizatorControl.loadMatchesInTable;
import static controller.TypeBecomeType.StringBecomeLocalDate;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import model.Match;
import model.Organizator;
import model.Player;
import model.Tournament;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuDriveTournament extends javax.swing.JFrame {

    // ATTRIBUTES
    private Tournament tour;
    private Organizator org;
    
    public MenuDriveTournament(Tournament tour, Organizator org) {
        this.tour = tour;
        this.org = org;
        this.setUndecorated(true);
        initComponents();
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.newIcon();
        loadMatchesInTable(tour.getMatchList(), tablaPartidos);
    }
    
    private void newIcon(){
        Image icon = new ImageIcon(getClass().getResource("/images/logoTamanacoSinFuego.png")).getImage();
        this.setIconImage(icon);
    }
    
    public void getDeleteTournamentTab(int index){
        tabPanel.setSelectedIndex(index);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botonSalida = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();
        tabPanel = new javax.swing.JTabbedPane();
        jPanel0 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPartidos = new javax.swing.JTable();
        botonAgregarPartido = new javax.swing.JButton();
        botonModificarPartido = new javax.swing.JButton();
        calendar1 = new raven.calendar.Calendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        entradaNombreTorneo1 = new javax.swing.JTextField();
        jSeparator58 = new javax.swing.JSeparator();
        jSeparator60 = new javax.swing.JSeparator();
        botonSeguirIngresarDatosTorneo1 = new javax.swing.JButton();
        botonRegresarIngresarDatosTorneo1 = new javax.swing.JButton();
        entradaNombreTorneo3 = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        jSeparator61 = new javax.swing.JSeparator();
        jSeparator62 = new javax.swing.JSeparator();
        entradaFechaNacimientoJugador1 = new javax.swing.JTextField();
        jLabel254 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        entradaNombreTorneo2 = new javax.swing.JTextField();
        jSeparator59 = new javax.swing.JSeparator();
        jLabel247 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        entradaNombreTorneo4 = new javax.swing.JTextField();
        jSeparator63 = new javax.swing.JSeparator();
        modificarMatch = new javax.swing.JButton();
        botonRegresarIngresarDatosTorneo2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        playerNameMatch1 = new javax.swing.JLabel();
        playerNameMatch2 = new javax.swing.JLabel();
        checkWinMatchPlayer2 = new javax.swing.JCheckBox();
        checkWinMatchPlayer1 = new javax.swing.JCheckBox();
        gamesWonFirstSetPlayer2 = new javax.swing.JComboBox<>();
        gamesWonFirstSetPlayer1 = new javax.swing.JComboBox<>();
        gamesWonSecondSetPlayer2 = new javax.swing.JComboBox<>();
        gamesWonSecondSetPlayer1 = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        botonRegresarIngresarDatosTorneo6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jSeparator79 = new javax.swing.JSeparator();
        jLabel279 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        botonSeguirIngresarDatosTorneo3 = new javax.swing.JButton();
        botonRegresarIngresarDatosTorneo4 = new javax.swing.JButton();
        dataEnterDeleteTour = new javax.swing.JTextField();
        jLabel282 = new javax.swing.JLabel();
        messageDelete = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TAMANACO TENNIS LEAGUE");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 430, -1));

        jLabel9.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Break Point Tamanaco");
        jLabel9.setToolTipText("");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 150, -1));

        botonSalida.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSalida.setForeground(new java.awt.Color(255, 255, 255));
        botonSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSalida.setText("X");
        botonSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalidaMouseClicked(evt);
            }
        });
        background.add(botonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 20, 40));

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
        background.add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 50, 40));

        Banner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.jpg"))); // NOI18N
        Banner.setText("jLabel1");
        Banner.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Banner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BannerMouseClicked(evt);
            }
        });
        background.add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 980, 110));

        tabPanel.setBackground(new java.awt.Color(255, 255, 255));
        tabPanel.setForeground(new java.awt.Color(0, 0, 0));

        jPanel0.setBackground(new java.awt.Color(255, 255, 255));
        jPanel0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel0MouseClicked(evt);
            }
        });
        jPanel0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setBackground(new java.awt.Color(0, 0, 0));
        jLabel43.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 153, 153));
        jLabel43.setText("Ver CALENDARIO...");
        jPanel0.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel0.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel0.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 920, 10));

        tablaPartidos.setAutoCreateRowSorter(true);
        tablaPartidos.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tablaPartidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JugadorA", "JugadorB", "Primer set", "SegundoSet", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPartidos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(tablaPartidos);

        jPanel0.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 380, 360));

        botonAgregarPartido.setBackground(new java.awt.Color(36, 20, 188));
        botonAgregarPartido.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonAgregarPartido.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarPartido.setText("AGREGAR PARTIDO");
        botonAgregarPartido.setBorder(null);
        botonAgregarPartido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonAgregarPartidoMouseMoved(evt);
            }
        });
        botonAgregarPartido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarPartidoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarPartidoMouseExited(evt);
            }
        });
        botonAgregarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPartidoActionPerformed(evt);
            }
        });
        jPanel0.add(botonAgregarPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 140, 40));

        botonModificarPartido.setBackground(new java.awt.Color(36, 20, 188));
        botonModificarPartido.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonModificarPartido.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarPartido.setText("ver PARTIDO");
        botonModificarPartido.setBorder(null);
        botonModificarPartido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonModificarPartidoMouseMoved(evt);
            }
        });
        botonModificarPartido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarPartidoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonModificarPartidoMouseExited(evt);
            }
        });
        botonModificarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPartidoActionPerformed(evt);
            }
        });
        jPanel0.add(botonModificarPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 130, 40));

        calendar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendar1MouseClicked(evt);
            }
        });
        calendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendar1PropertyChange(evt);
            }
        });
        jPanel0.add(calendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 520, 420));

        tabPanel.addTab("tab0", jPanel0);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/matchPhoto (1) (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 0, -1, -1));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel1.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel112.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(153, 153, 153));
        jLabel112.setText("aGREGAR partido...");
        jPanel1.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 60));

        jLabel36.setBackground(new java.awt.Color(51, 51, 51));
        jLabel36.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel36.setText("Ingresar CI del JUGADOR 1:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 230, 30));

        entradaNombreTorneo1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreTorneo1.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreTorneo1.setText("Ingresar Numero de Cedula");
        entradaNombreTorneo1.setBorder(null);
        entradaNombreTorneo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreTorneo1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreTorneo1FocusLost(evt);
            }
        });
        entradaNombreTorneo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreTorneo1ActionPerformed(evt);
            }
        });
        jPanel1.add(entradaNombreTorneo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));
        jPanel1.add(jSeparator58, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 350, 10));
        jPanel1.add(jSeparator60, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 330, 10));

        botonSeguirIngresarDatosTorneo1.setBackground(new java.awt.Color(36, 20, 188));
        botonSeguirIngresarDatosTorneo1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirIngresarDatosTorneo1.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirIngresarDatosTorneo1.setText("Agregar");
        botonSeguirIngresarDatosTorneo1.setBorder(null);
        botonSeguirIngresarDatosTorneo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneo1MouseMoved(evt);
            }
        });
        botonSeguirIngresarDatosTorneo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneo1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneo1MouseExited(evt);
            }
        });
        botonSeguirIngresarDatosTorneo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirIngresarDatosTorneo1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonSeguirIngresarDatosTorneo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 140, 40));

        botonRegresarIngresarDatosTorneo1.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosTorneo1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosTorneo1.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosTorneo1.setText("REGRESAR");
        botonRegresarIngresarDatosTorneo1.setBorder(null);
        botonRegresarIngresarDatosTorneo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo1MouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosTorneo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo1MouseExited(evt);
            }
        });
        botonRegresarIngresarDatosTorneo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosTorneo1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegresarIngresarDatosTorneo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 140, 40));

        entradaNombreTorneo3.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreTorneo3.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreTorneo3.setText("Ingresar numero de cedula");
        entradaNombreTorneo3.setBorder(null);
        entradaNombreTorneo3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreTorneo3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreTorneo3FocusLost(evt);
            }
        });
        entradaNombreTorneo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreTorneo3ActionPerformed(evt);
            }
        });
        jPanel1.add(entradaNombreTorneo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel145.setBackground(new java.awt.Color(51, 51, 51));
        jLabel145.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel145.setText("Ingresar CI del JUGADOR 2:");
        jPanel1.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 30));
        jPanel1.add(jSeparator61, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 350, 10));
        jPanel1.add(jSeparator62, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 350, 10));

        entradaFechaNacimientoJugador1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaFechaNacimientoJugador1.setForeground(new java.awt.Color(153, 153, 153));
        entradaFechaNacimientoJugador1.setText("Ingresar fecha (DD-MM-YYYY)");
        entradaFechaNacimientoJugador1.setBorder(null);
        entradaFechaNacimientoJugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugador1FocusLost(evt);
            }
        });
        entradaFechaNacimientoJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaFechaNacimientoJugador1ActionPerformed(evt);
            }
        });
        jPanel1.add(entradaFechaNacimientoJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel254.setBackground(new java.awt.Color(51, 51, 51));
        jLabel254.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel254.setText("Ingresar fecha del partido:");
        jPanel1.add(jLabel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, 30));

        tabPanel.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/matchPhoto (1) (1).jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 0, -1, -1));

        jLabel53.setBackground(new java.awt.Color(51, 51, 51));
        jLabel53.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel53.setText("Ingresar CI del JUGADOR 1:");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 230, 30));

        entradaNombreTorneo2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreTorneo2.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreTorneo2.setText("Ingresar Numero de Cedula");
        entradaNombreTorneo2.setBorder(null);
        entradaNombreTorneo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreTorneo2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreTorneo2FocusLost(evt);
            }
        });
        entradaNombreTorneo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreTorneo2ActionPerformed(evt);
            }
        });
        jPanel2.add(entradaNombreTorneo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));
        jPanel2.add(jSeparator59, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 230, 10));

        jLabel247.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel2.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel262.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(153, 153, 153));
        jLabel262.setText("Buscar partido...");
        jPanel2.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, 60));

        jLabel54.setBackground(new java.awt.Color(51, 51, 51));
        jLabel54.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel54.setText("Ingresar CI del JUGADOR 2:");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 230, 30));

        entradaNombreTorneo4.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreTorneo4.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreTorneo4.setText("Ingresar Numero de Cedula");
        entradaNombreTorneo4.setBorder(null);
        entradaNombreTorneo4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreTorneo4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreTorneo4FocusLost(evt);
            }
        });
        entradaNombreTorneo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreTorneo4ActionPerformed(evt);
            }
        });
        jPanel2.add(entradaNombreTorneo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 20));
        jPanel2.add(jSeparator63, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 230, 10));

        modificarMatch.setBackground(new java.awt.Color(36, 20, 188));
        modificarMatch.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        modificarMatch.setForeground(new java.awt.Color(255, 255, 255));
        modificarMatch.setText("Buscar partido");
        modificarMatch.setBorder(null);
        modificarMatch.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                modificarMatchMouseMoved(evt);
            }
        });
        modificarMatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMatchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarMatchMouseExited(evt);
            }
        });
        modificarMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarMatchActionPerformed(evt);
            }
        });
        jPanel2.add(modificarMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 140, 40));

        botonRegresarIngresarDatosTorneo2.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosTorneo2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosTorneo2.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosTorneo2.setText("REGRESAR");
        botonRegresarIngresarDatosTorneo2.setBorder(null);
        botonRegresarIngresarDatosTorneo2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo2MouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosTorneo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo2MouseExited(evt);
            }
        });
        botonRegresarIngresarDatosTorneo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosTorneo2ActionPerformed(evt);
            }
        });
        jPanel2.add(botonRegresarIngresarDatosTorneo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 140, 40));

        tabPanel.addTab("tab2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 51));
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel152.setBackground(new java.awt.Color(255, 255, 255));
        jLabel152.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel152.setText("- GANADOR -");
        jLabel152.setToolTipText("");
        jPanel6.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 350, -1));

        jLabel153.setBackground(new java.awt.Color(255, 255, 255));
        jLabel153.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel153.setText("- jugador 1 vs jugador 2 -");
        jLabel153.setToolTipText("");
        jPanel6.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 350, -1));

        jLabel154.setBackground(new java.awt.Color(255, 255, 255));
        jLabel154.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel154.setText("- PRIMER SET -");
        jLabel154.setToolTipText("");
        jPanel6.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 350, -1));

        jLabel155.setBackground(new java.awt.Color(255, 255, 255));
        jLabel155.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel155.setText("- SEGUNDO SET -");
        jLabel155.setToolTipText("");
        jPanel6.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 350, -1));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 150, 10));

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 150, 10));

        jSeparator18.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, 10));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 350, 390));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playerNameMatch1.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        playerNameMatch1.setForeground(new java.awt.Color(0, 0, 0));
        playerNameMatch1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerNameMatch1.setText("Player 1");
        playerNameMatch1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                playerNameMatch1MouseMoved(evt);
            }
        });
        playerNameMatch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playerNameMatch1MouseExited(evt);
            }
        });
        jPanel8.add(playerNameMatch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 310, -1));

        playerNameMatch2.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        playerNameMatch2.setForeground(new java.awt.Color(0, 0, 0));
        playerNameMatch2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerNameMatch2.setText("player 2");
        playerNameMatch2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                playerNameMatch2MouseMoved(evt);
            }
        });
        playerNameMatch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playerNameMatch2MouseExited(evt);
            }
        });
        jPanel8.add(playerNameMatch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 310, -1));

        checkWinMatchPlayer2.setBackground(new java.awt.Color(255, 255, 255));
        checkWinMatchPlayer2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        checkWinMatchPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        checkWinMatchPlayer2.setText("GANADOR J2");
        checkWinMatchPlayer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkWinMatchPlayer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkWinMatchPlayer2MouseClicked(evt);
            }
        });
        checkWinMatchPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWinMatchPlayer2ActionPerformed(evt);
            }
        });
        jPanel8.add(checkWinMatchPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, -1, -1));

        checkWinMatchPlayer1.setBackground(new java.awt.Color(255, 255, 255));
        checkWinMatchPlayer1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        checkWinMatchPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        checkWinMatchPlayer1.setText("GANADOR J1");
        checkWinMatchPlayer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkWinMatchPlayer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkWinMatchPlayer1MouseClicked(evt);
            }
        });
        checkWinMatchPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWinMatchPlayer1ActionPerformed(evt);
            }
        });
        jPanel8.add(checkWinMatchPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        gamesWonFirstSetPlayer2.setBackground(new java.awt.Color(255, 255, 255));
        gamesWonFirstSetPlayer2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        gamesWonFirstSetPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        gamesWonFirstSetPlayer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", " " }));
        gamesWonFirstSetPlayer2.setToolTipText("");
        gamesWonFirstSetPlayer2.setBorder(null);
        gamesWonFirstSetPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesWonFirstSetPlayer2ActionPerformed(evt);
            }
        });
        jPanel8.add(gamesWonFirstSetPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 60, 30));

        gamesWonFirstSetPlayer1.setBackground(new java.awt.Color(255, 255, 255));
        gamesWonFirstSetPlayer1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        gamesWonFirstSetPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        gamesWonFirstSetPlayer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", " " }));
        gamesWonFirstSetPlayer1.setToolTipText("");
        gamesWonFirstSetPlayer1.setBorder(null);
        gamesWonFirstSetPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesWonFirstSetPlayer1ActionPerformed(evt);
            }
        });
        jPanel8.add(gamesWonFirstSetPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 60, 30));

        gamesWonSecondSetPlayer2.setBackground(new java.awt.Color(255, 255, 255));
        gamesWonSecondSetPlayer2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        gamesWonSecondSetPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        gamesWonSecondSetPlayer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", " " }));
        gamesWonSecondSetPlayer2.setToolTipText("");
        gamesWonSecondSetPlayer2.setBorder(null);
        gamesWonSecondSetPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesWonSecondSetPlayer2ActionPerformed(evt);
            }
        });
        jPanel8.add(gamesWonSecondSetPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 60, 30));

        gamesWonSecondSetPlayer1.setBackground(new java.awt.Color(255, 255, 255));
        gamesWonSecondSetPlayer1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        gamesWonSecondSetPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        gamesWonSecondSetPlayer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", " " }));
        gamesWonSecondSetPlayer1.setToolTipText("");
        gamesWonSecondSetPlayer1.setBorder(null);
        gamesWonSecondSetPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesWonSecondSetPlayer1ActionPerformed(evt);
            }
        });
        jPanel8.add(gamesWonSecondSetPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 60, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 150, 10));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 150, 10));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 150, 10));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 150, 10));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 150, 10));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 150, 10));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 980, 390));

        botonRegresarIngresarDatosTorneo6.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosTorneo6.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosTorneo6.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosTorneo6.setText("REGRESAR");
        botonRegresarIngresarDatosTorneo6.setBorder(null);
        botonRegresarIngresarDatosTorneo6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo6MouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosTorneo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo6MouseExited(evt);
            }
        });
        botonRegresarIngresarDatosTorneo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosTorneo6ActionPerformed(evt);
            }
        });
        jPanel3.add(botonRegresarIngresarDatosTorneo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 140, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bannerTennisCamp.jpeg"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        tabPanel.addTab("tab3", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wimbledon_trophy (1).jpg"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -10, 460, 590));

        jLabel278.setBackground(new java.awt.Color(36, 20, 188));
        jLabel278.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel278.setForeground(new java.awt.Color(36, 20, 188));
        jLabel278.setText(tour.getTournamentName());
        jPanel4.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 370, 30));
        jPanel4.add(jSeparator79, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 350, 10));

        jLabel279.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel4.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel281.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel281.setForeground(new java.awt.Color(153, 153, 153));
        jLabel281.setText("BORRAR TORNEO...");
        jPanel4.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 60));

        botonSeguirIngresarDatosTorneo3.setBackground(new java.awt.Color(36, 20, 188));
        botonSeguirIngresarDatosTorneo3.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirIngresarDatosTorneo3.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirIngresarDatosTorneo3.setText("ELIMINAR");
        botonSeguirIngresarDatosTorneo3.setBorder(null);
        botonSeguirIngresarDatosTorneo3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneo3MouseMoved(evt);
            }
        });
        botonSeguirIngresarDatosTorneo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneo3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneo3MouseExited(evt);
            }
        });
        botonSeguirIngresarDatosTorneo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirIngresarDatosTorneo3ActionPerformed(evt);
            }
        });
        jPanel4.add(botonSeguirIngresarDatosTorneo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 140, 40));

        botonRegresarIngresarDatosTorneo4.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosTorneo4.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosTorneo4.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosTorneo4.setText("REGRESAR");
        botonRegresarIngresarDatosTorneo4.setBorder(null);
        botonRegresarIngresarDatosTorneo4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo4MouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosTorneo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo4MouseExited(evt);
            }
        });
        botonRegresarIngresarDatosTorneo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosTorneo4ActionPerformed(evt);
            }
        });
        jPanel4.add(botonRegresarIngresarDatosTorneo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 140, 40));

        dataEnterDeleteTour.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        dataEnterDeleteTour.setForeground(new java.awt.Color(153, 153, 153));
        dataEnterDeleteTour.setText("Ingresar nombre del torneo");
        dataEnterDeleteTour.setBorder(null);
        dataEnterDeleteTour.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataEnterDeleteTourFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataEnterDeleteTourFocusLost(evt);
            }
        });
        dataEnterDeleteTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEnterDeleteTourActionPerformed(evt);
            }
        });
        jPanel4.add(dataEnterDeleteTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel282.setBackground(new java.awt.Color(51, 51, 51));
        jLabel282.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel282.setText("Ingresar nombre del torneo:");
        jPanel4.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 30));

        messageDelete.setBackground(new java.awt.Color(51, 51, 51));
        messageDelete.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        messageDelete.setText("MENSAJE DE BORRADO");
        jPanel4.add(messageDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 370, 30));

        jLabel284.setBackground(new java.awt.Color(51, 51, 51));
        jLabel284.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel284.setText("SI ESTAS SEGURO DE QUERER BORRAR EL TORNEO");
        jPanel4.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 370, 30));

        tabPanel.addTab("tab4", jPanel4);

        background.add(tabPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 970, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BannerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BannerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BannerMouseClicked

    private void entradaNombreTorneo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneo1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo1FocusGained

    private void entradaNombreTorneo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneo1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo1FocusLost

    private void entradaNombreTorneo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreTorneo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo1ActionPerformed

    private void botonSeguirIngresarDatosTorneo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo1MouseMoved

    private void botonSeguirIngresarDatosTorneo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo1MouseClicked

    private void botonSeguirIngresarDatosTorneo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo1MouseExited

    private void botonSeguirIngresarDatosTorneo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo1ActionPerformed
        Player playerOne = tour.searchPlayerById(entradaNombreTorneo1.getText());
        Player playerTwo = tour.searchPlayerById(entradaNombreTorneo3.getText());
        Match match = new Match(playerOne, playerTwo, playerOne, "0-0", "0-0", StringBecomeLocalDate(entradaFechaNacimientoJugador1.getText()));
        tour.getMatchList().add(match);
        tabPanel.setSelectedIndex(0);

        //loadMatchesInTable(matchList, tablaPartidos);
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo1ActionPerformed

    private void botonRegresarIngresarDatosTorneo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo1MouseMoved

    private void botonRegresarIngresarDatosTorneo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo1MouseClicked

    private void botonRegresarIngresarDatosTorneo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo1MouseExited

    private void botonRegresarIngresarDatosTorneo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo1ActionPerformed
        tabPanel.setSelectedIndex(3);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo1ActionPerformed

    private void entradaNombreTorneo3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneo3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo3FocusGained

    private void entradaNombreTorneo3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneo3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo3FocusLost

    private void entradaNombreTorneo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreTorneo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo3ActionPerformed

    private void entradaFechaNacimientoJugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugador1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoJugador1FocusGained

    private void entradaFechaNacimientoJugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugador1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoJugador1FocusLost

    private void entradaFechaNacimientoJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoJugador1ActionPerformed

    private void entradaNombreTorneo2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneo2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo2FocusGained

    private void entradaNombreTorneo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneo2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo2FocusLost

    private void entradaNombreTorneo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreTorneo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo2ActionPerformed

    private void entradaNombreTorneo4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneo4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo4FocusGained

    private void entradaNombreTorneo4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneo4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo4FocusLost

    private void entradaNombreTorneo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreTorneo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneo4ActionPerformed

    private void modificarMatchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMatchMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarMatchMouseMoved

    private void modificarMatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMatchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarMatchMouseClicked

    private void modificarMatchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMatchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarMatchMouseExited

    private void modificarMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarMatchActionPerformed

    }//GEN-LAST:event_modificarMatchActionPerformed

    private void botonRegresarIngresarDatosTorneo2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo2MouseMoved

    private void botonRegresarIngresarDatosTorneo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo2MouseClicked

    private void botonRegresarIngresarDatosTorneo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo2MouseExited

    private void botonRegresarIngresarDatosTorneo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo2ActionPerformed
        tabPanel.setSelectedIndex(3);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo2ActionPerformed

    private void botonAgregarPartidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPartidoMouseMoved
        changeButtonColor(botonAgregarPartido,102,102,255);
    }//GEN-LAST:event_botonAgregarPartidoMouseMoved

    private void botonAgregarPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPartidoMouseClicked
        tabPanel.setSelectedIndex(1);
    }//GEN-LAST:event_botonAgregarPartidoMouseClicked

    private void botonAgregarPartidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPartidoMouseExited
        changeButtonColor(botonAgregarPartido,30,25,161);
    }//GEN-LAST:event_botonAgregarPartidoMouseExited

    private void botonAgregarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPartidoActionPerformed
        tabPanel.setSelectedIndex(1);
    }//GEN-LAST:event_botonAgregarPartidoActionPerformed

    private void botonModificarPartidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarPartidoMouseMoved
        changeButtonColor(botonModificarPartido,102,102,255);
    }//GEN-LAST:event_botonModificarPartidoMouseMoved

    private void botonModificarPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarPartidoMouseClicked
        tabPanel.setSelectedIndex(2);
    }//GEN-LAST:event_botonModificarPartidoMouseClicked

    private void botonModificarPartidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarPartidoMouseExited
        changeButtonColor(botonModificarPartido,30,25,161);
    }//GEN-LAST:event_botonModificarPartidoMouseExited

    private void botonModificarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPartidoActionPerformed
        tabPanel.setSelectedIndex(2);
    }//GEN-LAST:event_botonModificarPartidoActionPerformed

    private void calendar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendar1MouseClicked

    }//GEN-LAST:event_calendar1MouseClicked

    private void calendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendar1PropertyChange

    }//GEN-LAST:event_calendar1PropertyChange

    private void jPanel0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel0MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel0MouseClicked

    private void botonSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalidaMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonSalidaMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void botonSeguirIngresarDatosTorneo3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo3MouseMoved

    private void botonSeguirIngresarDatosTorneo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo3MouseClicked
        deleteTournament(dataEnterDeleteTour.getText(), this.org, messageDelete);
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo3MouseClicked

    private void botonSeguirIngresarDatosTorneo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo3MouseExited

    private void botonSeguirIngresarDatosTorneo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo3ActionPerformed

    private void botonRegresarIngresarDatosTorneo4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo4MouseMoved

    private void botonRegresarIngresarDatosTorneo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo4MouseClicked

    private void botonRegresarIngresarDatosTorneo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo4MouseExited

    private void botonRegresarIngresarDatosTorneo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo4ActionPerformed

    private void dataEnterDeleteTourFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterDeleteTourFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterDeleteTourFocusGained

    private void dataEnterDeleteTourFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterDeleteTourFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterDeleteTourFocusLost

    private void dataEnterDeleteTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEnterDeleteTourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterDeleteTourActionPerformed

    private void playerNameMatch1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerNameMatch1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_playerNameMatch1MouseExited

    private void playerNameMatch1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerNameMatch1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_playerNameMatch1MouseMoved

    private void playerNameMatch2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerNameMatch2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_playerNameMatch2MouseMoved

    private void playerNameMatch2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerNameMatch2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_playerNameMatch2MouseExited

    private void checkWinMatchPlayer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkWinMatchPlayer2MouseClicked

    }//GEN-LAST:event_checkWinMatchPlayer2MouseClicked

    private void checkWinMatchPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWinMatchPlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkWinMatchPlayer2ActionPerformed

    private void checkWinMatchPlayer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkWinMatchPlayer1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_checkWinMatchPlayer1MouseClicked

    private void checkWinMatchPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWinMatchPlayer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkWinMatchPlayer1ActionPerformed

    private void gamesWonFirstSetPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesWonFirstSetPlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamesWonFirstSetPlayer2ActionPerformed

    private void gamesWonFirstSetPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesWonFirstSetPlayer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamesWonFirstSetPlayer1ActionPerformed

    private void gamesWonSecondSetPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesWonSecondSetPlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamesWonSecondSetPlayer2ActionPerformed

    private void gamesWonSecondSetPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesWonSecondSetPlayer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamesWonSecondSetPlayer1ActionPerformed

    private void botonRegresarIngresarDatosTorneo6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo6MouseMoved

    private void botonRegresarIngresarDatosTorneo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo6MouseClicked

    private void botonRegresarIngresarDatosTorneo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo6MouseExited

    private void botonRegresarIngresarDatosTorneo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo6ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDriveTournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton botonAgregarPartido;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JButton botonModificarPartido;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo1;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo2;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo4;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo6;
    private javax.swing.JLabel botonSalida;
    private javax.swing.JButton botonSeguirIngresarDatosTorneo1;
    private javax.swing.JButton botonSeguirIngresarDatosTorneo3;
    private raven.calendar.Calendar calendar1;
    private javax.swing.JCheckBox checkWinMatchPlayer1;
    private javax.swing.JCheckBox checkWinMatchPlayer2;
    private javax.swing.JTextField dataEnterDeleteTour;
    private javax.swing.JTextField entradaFechaNacimientoJugador1;
    private javax.swing.JTextField entradaNombreTorneo1;
    private javax.swing.JTextField entradaNombreTorneo2;
    private javax.swing.JTextField entradaNombreTorneo3;
    private javax.swing.JTextField entradaNombreTorneo4;
    private javax.swing.JComboBox<String> gamesWonFirstSetPlayer1;
    private javax.swing.JComboBox<String> gamesWonFirstSetPlayer2;
    private javax.swing.JComboBox<String> gamesWonSecondSetPlayer1;
    private javax.swing.JComboBox<String> gamesWonSecondSetPlayer2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator79;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel messageDelete;
    private javax.swing.JButton modificarMatch;
    private javax.swing.JLabel playerNameMatch1;
    private javax.swing.JLabel playerNameMatch2;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTable tablaPartidos;
    // End of variables declaration//GEN-END:variables
}
