/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import static controller.MenuDriveTournamentControl.deleteTournament;
import static controller.MenuDriveTournamentControl.getSuperTie;
import static controller.MenuDriveTournamentControl.safeChangesOfMatch;
import static controller.MenuDriveTournamentControl.safeMatch;
import static controller.MenuOrganizatorControl.changeButtonColor;
import static controller.MenuOrganizatorControl.loadMatchesInTable;
import static controller.MenuDriveTournamentControl.showMatch;
import static controller.MenuOrganizatorControl.organizatorFocusGained;
import static controller.MenuOrganizatorControl.organizatorFocusLost;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import model.Match;
import model.Organizator;
import model.Tournament;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuDriveTournament extends javax.swing.JFrame {

    // ATTRIBUTES
    private Tournament tour;
    private Organizator org;
    private Match currentMatch;
    
    public MenuDriveTournament(Tournament tour, Organizator org) {
        this.tour = tour;
        this.org = org;
        this.setUndecorated(true);
        initComponents();
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.newIcon();
        loadMatchesInTable(tour.getMatchList(), matchTable);
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
        tabPanel = new javax.swing.JTabbedPane();
        jPanel0 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        matchTable = new javax.swing.JTable();
        botonAgregarPartido = new javax.swing.JButton();
        botonModificarPartido = new javax.swing.JButton();
        calendar1 = new raven.calendar.Calendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        idPlayer1AddMatch = new javax.swing.JTextField();
        jSeparator58 = new javax.swing.JSeparator();
        jSeparator60 = new javax.swing.JSeparator();
        addMatchBottom = new javax.swing.JButton();
        backBottomInAddMatch = new javax.swing.JButton();
        idPlayer2AddMatch = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        jSeparator61 = new javax.swing.JSeparator();
        jSeparator62 = new javax.swing.JSeparator();
        addMatchDate = new javax.swing.JTextField();
        jLabel254 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        dataEnterIdPlayerA = new javax.swing.JTextField();
        jSeparator59 = new javax.swing.JSeparator();
        jLabel247 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        dataEnterIdPlayerB = new javax.swing.JTextField();
        jSeparator63 = new javax.swing.JSeparator();
        modificarMatch = new javax.swing.JButton();
        botonRegresarIngresarDatosTorneo2 = new javax.swing.JButton();
        messageSearchMatch = new javax.swing.JLabel();
        dataEnterDate = new javax.swing.JTextField();
        jSeparator64 = new javax.swing.JSeparator();
        jLabel56 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        matchDateLabel = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        checkWinMatchPlayer3 = new javax.swing.JCheckBox();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel156 = new javax.swing.JLabel();
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
        dataEnterDeleteTour1 = new javax.swing.JTextField();
        dataEnterDeleteTour2 = new javax.swing.JTextField();
        botonRegresarIngresarDatosTorneo7 = new javax.swing.JButton();
        botonRegresarIngresarDatosTorneo8 = new javax.swing.JButton();
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
        Banner = new javax.swing.JLabel();

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

        matchTable.setAutoCreateRowSorter(true);
        matchTable.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        matchTable.setModel(new javax.swing.table.DefaultTableModel(
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
        matchTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(matchTable);

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

        idPlayer1AddMatch.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        idPlayer1AddMatch.setForeground(new java.awt.Color(153, 153, 153));
        idPlayer1AddMatch.setText("Ingresar Numero de Cedula");
        idPlayer1AddMatch.setBorder(null);
        idPlayer1AddMatch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idPlayer1AddMatchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idPlayer1AddMatchFocusLost(evt);
            }
        });
        idPlayer1AddMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPlayer1AddMatchActionPerformed(evt);
            }
        });
        jPanel1.add(idPlayer1AddMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 220, -1));
        jPanel1.add(jSeparator58, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 350, 10));
        jPanel1.add(jSeparator60, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 330, 10));

        addMatchBottom.setBackground(new java.awt.Color(36, 20, 188));
        addMatchBottom.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        addMatchBottom.setForeground(new java.awt.Color(255, 255, 255));
        addMatchBottom.setText("Agregar");
        addMatchBottom.setBorder(null);
        addMatchBottom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addMatchBottomMouseMoved(evt);
            }
        });
        addMatchBottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMatchBottomMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMatchBottomMouseExited(evt);
            }
        });
        addMatchBottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMatchBottomActionPerformed(evt);
            }
        });
        jPanel1.add(addMatchBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 140, 40));

        backBottomInAddMatch.setBackground(new java.awt.Color(36, 20, 188));
        backBottomInAddMatch.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        backBottomInAddMatch.setForeground(new java.awt.Color(255, 255, 255));
        backBottomInAddMatch.setText("REGRESAR");
        backBottomInAddMatch.setBorder(null);
        backBottomInAddMatch.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backBottomInAddMatchMouseMoved(evt);
            }
        });
        backBottomInAddMatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBottomInAddMatchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBottomInAddMatchMouseExited(evt);
            }
        });
        backBottomInAddMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBottomInAddMatchActionPerformed(evt);
            }
        });
        jPanel1.add(backBottomInAddMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 140, 40));

        idPlayer2AddMatch.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        idPlayer2AddMatch.setForeground(new java.awt.Color(153, 153, 153));
        idPlayer2AddMatch.setText("Ingresar numero de cedula");
        idPlayer2AddMatch.setBorder(null);
        idPlayer2AddMatch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idPlayer2AddMatchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idPlayer2AddMatchFocusLost(evt);
            }
        });
        idPlayer2AddMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPlayer2AddMatchActionPerformed(evt);
            }
        });
        jPanel1.add(idPlayer2AddMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 220, -1));

        jLabel145.setBackground(new java.awt.Color(51, 51, 51));
        jLabel145.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel145.setText("Ingresar CI del JUGADOR 2:");
        jPanel1.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 30));
        jPanel1.add(jSeparator61, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 350, 10));
        jPanel1.add(jSeparator62, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 350, 10));

        addMatchDate.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        addMatchDate.setForeground(new java.awt.Color(153, 153, 153));
        addMatchDate.setText("Ingresar fecha (DD-MM-YYYY)");
        addMatchDate.setBorder(null);
        addMatchDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addMatchDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addMatchDateFocusLost(evt);
            }
        });
        addMatchDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMatchDateActionPerformed(evt);
            }
        });
        jPanel1.add(addMatchDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 220, -1));

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
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 230, 30));

        dataEnterIdPlayerA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        dataEnterIdPlayerA.setForeground(new java.awt.Color(153, 153, 153));
        dataEnterIdPlayerA.setText("Ingresar Numero de Cedula");
        dataEnterIdPlayerA.setBorder(null);
        dataEnterIdPlayerA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataEnterIdPlayerAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataEnterIdPlayerAFocusLost(evt);
            }
        });
        dataEnterIdPlayerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEnterIdPlayerAActionPerformed(evt);
            }
        });
        jPanel2.add(dataEnterIdPlayerA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 230, -1));
        jPanel2.add(jSeparator59, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 230, 10));

        jLabel247.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel2.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel262.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(153, 153, 153));
        jLabel262.setText("Buscar partido...");
        jPanel2.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 60));

        jLabel54.setBackground(new java.awt.Color(51, 51, 51));
        jLabel54.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel54.setText("Ingresar CI del JUGADOR 2:");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 230, 30));

        dataEnterIdPlayerB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        dataEnterIdPlayerB.setForeground(new java.awt.Color(153, 153, 153));
        dataEnterIdPlayerB.setText("Ingresar Numero de Cedula");
        dataEnterIdPlayerB.setBorder(null);
        dataEnterIdPlayerB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataEnterIdPlayerBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataEnterIdPlayerBFocusLost(evt);
            }
        });
        dataEnterIdPlayerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEnterIdPlayerBActionPerformed(evt);
            }
        });
        jPanel2.add(dataEnterIdPlayerB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 230, 20));
        jPanel2.add(jSeparator63, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 230, 10));

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
        jPanel2.add(botonRegresarIngresarDatosTorneo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 140, 40));

        messageSearchMatch.setBackground(new java.awt.Color(51, 51, 51));
        messageSearchMatch.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        messageSearchMatch.setText("mensaje");
        jPanel2.add(messageSearchMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 450, 30));

        dataEnterDate.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        dataEnterDate.setForeground(new java.awt.Color(153, 153, 153));
        dataEnterDate.setText("INGRESAR FECHA (YYYY-MM-DD)");
        dataEnterDate.setBorder(null);
        dataEnterDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataEnterDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataEnterDateFocusLost(evt);
            }
        });
        dataEnterDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEnterDateActionPerformed(evt);
            }
        });
        jPanel2.add(dataEnterDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 230, -1));
        jPanel2.add(jSeparator64, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 230, 10));

        jLabel56.setBackground(new java.awt.Color(51, 51, 51));
        jLabel56.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel56.setText("INGRESAR FECHA DEL PARTIDO:");
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 230, 30));

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

        matchDateLabel.setBackground(new java.awt.Color(255, 255, 255));
        matchDateLabel.setFont(new java.awt.Font("Bebas Neue", 0, 16)); // NOI18N
        matchDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        matchDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matchDateLabel.setText("FECHA");
        matchDateLabel.setToolTipText("");
        jPanel6.add(matchDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 350, -1));

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
        jPanel6.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 150, 10));

        checkWinMatchPlayer3.setBackground(new java.awt.Color(0, 0, 51));
        checkWinMatchPlayer3.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        checkWinMatchPlayer3.setForeground(new java.awt.Color(255, 255, 255));
        checkWinMatchPlayer3.setText("SUPER TIE BREAK");
        checkWinMatchPlayer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkWinMatchPlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkWinMatchPlayer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkWinMatchPlayer3MouseClicked(evt);
            }
        });
        checkWinMatchPlayer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWinMatchPlayer3ActionPerformed(evt);
            }
        });
        jPanel6.add(checkWinMatchPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 350, 40));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, 10));

        jLabel156.setBackground(new java.awt.Color(255, 255, 255));
        jLabel156.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel156.setText("- jugador 1 vs jugador 2 -");
        jLabel156.setToolTipText("");
        jPanel6.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 350, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 350, 400));

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
        gamesWonFirstSetPlayer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "6(0)", "6(1)", "6(2)", "6(3)", "6(4)", "6(5)", "6(6)", "6(7)", " " }));
        gamesWonFirstSetPlayer2.setToolTipText("");
        gamesWonFirstSetPlayer2.setBorder(null);
        gamesWonFirstSetPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesWonFirstSetPlayer2ActionPerformed(evt);
            }
        });
        jPanel8.add(gamesWonFirstSetPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 70, 30));

        gamesWonFirstSetPlayer1.setBackground(new java.awt.Color(255, 255, 255));
        gamesWonFirstSetPlayer1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        gamesWonFirstSetPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        gamesWonFirstSetPlayer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "6(0)", "6(1)", "6(2)", "6(3)", "6(4)", "6(5)", "6(6)", "6(7)" }));
        gamesWonFirstSetPlayer1.setToolTipText("");
        gamesWonFirstSetPlayer1.setBorder(null);
        gamesWonFirstSetPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesWonFirstSetPlayer1ActionPerformed(evt);
            }
        });
        jPanel8.add(gamesWonFirstSetPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 70, 30));

        gamesWonSecondSetPlayer2.setBackground(new java.awt.Color(255, 255, 255));
        gamesWonSecondSetPlayer2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        gamesWonSecondSetPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        gamesWonSecondSetPlayer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "6(0)", "6(1)", "6(2)", "6(3)", "6(4)", "6(5)", "6(6)", "6(7)" }));
        gamesWonSecondSetPlayer2.setToolTipText("");
        gamesWonSecondSetPlayer2.setBorder(null);
        gamesWonSecondSetPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesWonSecondSetPlayer2ActionPerformed(evt);
            }
        });
        jPanel8.add(gamesWonSecondSetPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 70, 30));

        gamesWonSecondSetPlayer1.setBackground(new java.awt.Color(255, 255, 255));
        gamesWonSecondSetPlayer1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        gamesWonSecondSetPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        gamesWonSecondSetPlayer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "6(0)", "6(1)", "6(2)", "6(3)", "6(4)", "6(5)", "6(6)", "6(7)" }));
        gamesWonSecondSetPlayer1.setToolTipText("");
        gamesWonSecondSetPlayer1.setBorder(null);
        gamesWonSecondSetPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesWonSecondSetPlayer1ActionPerformed(evt);
            }
        });
        jPanel8.add(gamesWonSecondSetPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 220, -1, 30));

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

        dataEnterDeleteTour1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        dataEnterDeleteTour1.setForeground(new java.awt.Color(255, 255, 255));
        dataEnterDeleteTour1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataEnterDeleteTour1.setText("0");
        dataEnterDeleteTour1.setBorder(null);
        dataEnterDeleteTour1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataEnterDeleteTour1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataEnterDeleteTour1FocusLost(evt);
            }
        });
        dataEnterDeleteTour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEnterDeleteTour1ActionPerformed(evt);
            }
        });
        jPanel8.add(dataEnterDeleteTour1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, -1, 30));

        dataEnterDeleteTour2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        dataEnterDeleteTour2.setForeground(new java.awt.Color(255, 255, 255));
        dataEnterDeleteTour2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataEnterDeleteTour2.setText("0");
        dataEnterDeleteTour2.setBorder(null);
        dataEnterDeleteTour2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataEnterDeleteTour2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataEnterDeleteTour2FocusLost(evt);
            }
        });
        dataEnterDeleteTour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEnterDeleteTour2ActionPerformed(evt);
            }
        });
        jPanel8.add(dataEnterDeleteTour2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, 30));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 980, 400));

        botonRegresarIngresarDatosTorneo7.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosTorneo7.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosTorneo7.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosTorneo7.setText("BORRAR PARTIDO");
        botonRegresarIngresarDatosTorneo7.setBorder(null);
        botonRegresarIngresarDatosTorneo7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo7MouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosTorneo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo7MouseExited(evt);
            }
        });
        botonRegresarIngresarDatosTorneo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosTorneo7ActionPerformed(evt);
            }
        });
        jPanel3.add(botonRegresarIngresarDatosTorneo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 140, 40));

        botonRegresarIngresarDatosTorneo8.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosTorneo8.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosTorneo8.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosTorneo8.setText("GUARDAR CAMBIOS");
        botonRegresarIngresarDatosTorneo8.setBorder(null);
        botonRegresarIngresarDatosTorneo8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo8MouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosTorneo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneo8MouseExited(evt);
            }
        });
        botonRegresarIngresarDatosTorneo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosTorneo8ActionPerformed(evt);
            }
        });
        jPanel3.add(botonRegresarIngresarDatosTorneo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 140, 40));

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
        botonRegresarIngresarDatosTorneo4.setText("SALIR");
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

    private void idPlayer1AddMatchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idPlayer1AddMatchFocusGained
        organizatorFocusGained(idPlayer1AddMatch, "Ingresar Numero de Cedula");
    }//GEN-LAST:event_idPlayer1AddMatchFocusGained

    private void idPlayer1AddMatchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idPlayer1AddMatchFocusLost
        organizatorFocusLost(idPlayer1AddMatch, "Ingresar Numero de Cedula");
    }//GEN-LAST:event_idPlayer1AddMatchFocusLost

    private void idPlayer1AddMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPlayer1AddMatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPlayer1AddMatchActionPerformed

    private void addMatchBottomMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMatchBottomMouseMoved
        changeButtonColor(addMatchBottom,102,102,255);
    }//GEN-LAST:event_addMatchBottomMouseMoved

    private void addMatchBottomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMatchBottomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addMatchBottomMouseClicked

    private void addMatchBottomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMatchBottomMouseExited
        changeButtonColor(addMatchBottom,30,25,161);
    }//GEN-LAST:event_addMatchBottomMouseExited

    private void addMatchBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMatchBottomActionPerformed
        boolean playerOne = tour.findPlayerById(idPlayer1AddMatch.getText()), playerTwo = tour.findPlayerById(idPlayer2AddMatch.getText());
        if (playerOne == false && playerTwo == false){
            Match newMatch = new Match();
            newMatch.readMatch(idPlayer1AddMatch, idPlayer2AddMatch, addMatchDate, tour);
            tour.addMatch(newMatch);
            loadMatchesInTable(tour.getMatchList(), matchTable);
            tabPanel.setSelectedIndex(0);
        } 

    }//GEN-LAST:event_addMatchBottomActionPerformed

    private void backBottomInAddMatchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBottomInAddMatchMouseMoved
        changeButtonColor(backBottomInAddMatch,102,102,255);
    }//GEN-LAST:event_backBottomInAddMatchMouseMoved

    private void backBottomInAddMatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBottomInAddMatchMouseClicked
        tabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_backBottomInAddMatchMouseClicked

    private void backBottomInAddMatchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBottomInAddMatchMouseExited
        changeButtonColor(backBottomInAddMatch,30,25,161);
    }//GEN-LAST:event_backBottomInAddMatchMouseExited

    private void backBottomInAddMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBottomInAddMatchActionPerformed

    }//GEN-LAST:event_backBottomInAddMatchActionPerformed

    private void idPlayer2AddMatchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idPlayer2AddMatchFocusGained
        organizatorFocusGained(idPlayer2AddMatch, "Ingresar numero de cedula");
    }//GEN-LAST:event_idPlayer2AddMatchFocusGained

    private void idPlayer2AddMatchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idPlayer2AddMatchFocusLost
        organizatorFocusLost(idPlayer2AddMatch, "Ingresar numero de cedula");
    }//GEN-LAST:event_idPlayer2AddMatchFocusLost

    private void idPlayer2AddMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPlayer2AddMatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPlayer2AddMatchActionPerformed

    private void addMatchDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addMatchDateFocusGained
        organizatorFocusGained(addMatchDate, "Ingresar fecha (DD-MM-YYYY)");
    }//GEN-LAST:event_addMatchDateFocusGained

    private void addMatchDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addMatchDateFocusLost
        organizatorFocusLost(addMatchDate, "Ingresar fecha (DD-MM-YYYY)");
    }//GEN-LAST:event_addMatchDateFocusLost

    private void addMatchDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMatchDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMatchDateActionPerformed

    private void dataEnterIdPlayerAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterIdPlayerAFocusGained
        organizatorFocusGained(dataEnterIdPlayerA, "Ingresar Numero de Cedula");
    }//GEN-LAST:event_dataEnterIdPlayerAFocusGained

    private void dataEnterIdPlayerAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterIdPlayerAFocusLost
        organizatorFocusLost(dataEnterIdPlayerA, "Ingresar Numero de Cedula");
    }//GEN-LAST:event_dataEnterIdPlayerAFocusLost

    private void dataEnterIdPlayerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEnterIdPlayerAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterIdPlayerAActionPerformed

    private void dataEnterIdPlayerBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterIdPlayerBFocusGained
        organizatorFocusGained(dataEnterIdPlayerB, "Ingresar Numero de Cedula");
    }//GEN-LAST:event_dataEnterIdPlayerBFocusGained

    private void dataEnterIdPlayerBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterIdPlayerBFocusLost
        organizatorFocusLost(dataEnterIdPlayerB, "Ingresar Numero de Cedula");
    }//GEN-LAST:event_dataEnterIdPlayerBFocusLost

    private void dataEnterIdPlayerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEnterIdPlayerBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterIdPlayerBActionPerformed

    private void modificarMatchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMatchMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarMatchMouseMoved

    private void modificarMatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMatchMouseClicked
        if (tour.findMatch(dataEnterIdPlayerA.getText(), dataEnterIdPlayerB.getText(), dataEnterDate.getText()) == true){
            this.currentMatch = tour.searchMatch(dataEnterIdPlayerA.getText(), dataEnterIdPlayerB.getText(), dataEnterDate.getText());
            showMatch(currentMatch, playerNameMatch1, playerNameMatch2, matchDateLabel, gamesWonFirstSetPlayer1, gamesWonFirstSetPlayer2, gamesWonSecondSetPlayer1, gamesWonSecondSetPlayer2, checkWinMatchPlayer1, checkWinMatchPlayer2, checkWinMatchPlayer3, dataEnterDeleteTour2, dataEnterDeleteTour1);
            tabPanel.setSelectedIndex(3);
        } 
        else{
            messageSearchMatch.setText("AVISO: No se encontro el partido");
            messageSearchMatch.setForeground(Color.red);
        }
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
        tabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo2MouseClicked

    private void botonRegresarIngresarDatosTorneo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo2MouseExited

    private void botonRegresarIngresarDatosTorneo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo2ActionPerformed

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
        changeButtonColor(botonSeguirIngresarDatosTorneo3,102,102,255);
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo3MouseMoved

    private void botonSeguirIngresarDatosTorneo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo3MouseClicked
        deleteTournament(dataEnterDeleteTour.getText(), this.org, messageDelete);
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo3MouseClicked

    private void botonSeguirIngresarDatosTorneo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo3MouseExited
        changeButtonColor(botonSeguirIngresarDatosTorneo3,30,25,161);
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo3MouseExited

    private void botonSeguirIngresarDatosTorneo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneo3ActionPerformed

    private void dataEnterDeleteTourFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterDeleteTourFocusGained
        organizatorFocusGained(dataEnterDeleteTour, "Ingresar nombre del torneo");
    }//GEN-LAST:event_dataEnterDeleteTourFocusGained

    private void dataEnterDeleteTourFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterDeleteTourFocusLost
        organizatorFocusLost(dataEnterDeleteTour, "Ingresar nombre del torneo");
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
        changeButtonColor(botonRegresarIngresarDatosTorneo6,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo6MouseMoved

    private void botonRegresarIngresarDatosTorneo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo6MouseClicked
        tabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo6MouseClicked

    private void botonRegresarIngresarDatosTorneo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo6MouseExited
        changeButtonColor(botonRegresarIngresarDatosTorneo6,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo6MouseExited

    private void botonRegresarIngresarDatosTorneo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo6ActionPerformed

    private void botonRegresarIngresarDatosTorneo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo4ActionPerformed

    private void botonRegresarIngresarDatosTorneo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo4MouseExited
        changeButtonColor(botonRegresarIngresarDatosTorneo4,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo4MouseExited

    private void botonRegresarIngresarDatosTorneo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo4MouseClicked
        this.dispose();
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo4MouseClicked

    private void botonRegresarIngresarDatosTorneo4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo4MouseMoved
        changeButtonColor(botonRegresarIngresarDatosTorneo4,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo4MouseMoved

    private void checkWinMatchPlayer3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkWinMatchPlayer3MouseClicked
        getSuperTie(currentMatch,checkWinMatchPlayer3,dataEnterDeleteTour2,dataEnterDeleteTour1);
    }//GEN-LAST:event_checkWinMatchPlayer3MouseClicked

    private void checkWinMatchPlayer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWinMatchPlayer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkWinMatchPlayer3ActionPerformed

    private void dataEnterDeleteTour1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterDeleteTour1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterDeleteTour1FocusGained

    private void dataEnterDeleteTour1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterDeleteTour1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterDeleteTour1FocusLost

    private void dataEnterDeleteTour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEnterDeleteTour1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterDeleteTour1ActionPerformed

    private void dataEnterDeleteTour2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterDeleteTour2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterDeleteTour2FocusGained

    private void dataEnterDeleteTour2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterDeleteTour2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterDeleteTour2FocusLost

    private void dataEnterDeleteTour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEnterDeleteTour2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterDeleteTour2ActionPerformed

    private void dataEnterDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterDateFocusGained
        organizatorFocusGained(dataEnterDate, "INGRESAR FECHA (YYYY-MM-DD)");
    }//GEN-LAST:event_dataEnterDateFocusGained

    private void dataEnterDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEnterDateFocusLost
        organizatorFocusLost(dataEnterDate, "INGRESAR FECHA (YYYY-MM-DD)");
    }//GEN-LAST:event_dataEnterDateFocusLost

    private void dataEnterDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEnterDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEnterDateActionPerformed

    private void botonRegresarIngresarDatosTorneo7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo7MouseMoved
        changeButtonColor(botonRegresarIngresarDatosTorneo7,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo7MouseMoved

    private void botonRegresarIngresarDatosTorneo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo7MouseClicked
        this.tour.deleteMatch(currentMatch);
        loadMatchesInTable(tour.getMatchList(), matchTable);
        tabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo7MouseClicked

    private void botonRegresarIngresarDatosTorneo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo7MouseExited
        changeButtonColor(botonRegresarIngresarDatosTorneo7,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo7MouseExited

    private void botonRegresarIngresarDatosTorneo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo7ActionPerformed

    private void botonRegresarIngresarDatosTorneo8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo8MouseMoved
        changeButtonColor(botonRegresarIngresarDatosTorneo8,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo8MouseMoved

    private void botonRegresarIngresarDatosTorneo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo8MouseClicked
        safeChangesOfMatch(this.tour, this.currentMatch, gamesWonFirstSetPlayer1, gamesWonFirstSetPlayer2, gamesWonSecondSetPlayer1, gamesWonSecondSetPlayer2, checkWinMatchPlayer1, checkWinMatchPlayer2, checkWinMatchPlayer3);
        safeMatch(this.currentMatch, gamesWonFirstSetPlayer1, gamesWonFirstSetPlayer2, gamesWonSecondSetPlayer1, gamesWonSecondSetPlayer2, checkWinMatchPlayer1, checkWinMatchPlayer2, checkWinMatchPlayer3, dataEnterDeleteTour2, dataEnterDeleteTour1);
        loadMatchesInTable(tour.getMatchList(), matchTable);
        tabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo8MouseClicked

    private void botonRegresarIngresarDatosTorneo8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo8MouseExited
        changeButtonColor(botonRegresarIngresarDatosTorneo8,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo8MouseExited

    private void botonRegresarIngresarDatosTorneo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneo8ActionPerformed

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
    private javax.swing.JButton addMatchBottom;
    private javax.swing.JTextField addMatchDate;
    private javax.swing.JButton backBottomInAddMatch;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAgregarPartido;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JButton botonModificarPartido;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo2;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo4;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo6;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo7;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo8;
    private javax.swing.JLabel botonSalida;
    private javax.swing.JButton botonSeguirIngresarDatosTorneo3;
    private raven.calendar.Calendar calendar1;
    private javax.swing.JCheckBox checkWinMatchPlayer1;
    private javax.swing.JCheckBox checkWinMatchPlayer2;
    private javax.swing.JCheckBox checkWinMatchPlayer3;
    private javax.swing.JTextField dataEnterDate;
    private javax.swing.JTextField dataEnterDeleteTour;
    private javax.swing.JTextField dataEnterDeleteTour1;
    private javax.swing.JTextField dataEnterDeleteTour2;
    private javax.swing.JTextField dataEnterIdPlayerA;
    private javax.swing.JTextField dataEnterIdPlayerB;
    private javax.swing.JComboBox<String> gamesWonFirstSetPlayer1;
    private javax.swing.JComboBox<String> gamesWonFirstSetPlayer2;
    private javax.swing.JComboBox<String> gamesWonSecondSetPlayer1;
    private javax.swing.JComboBox<String> gamesWonSecondSetPlayer2;
    private javax.swing.JTextField idPlayer1AddMatch;
    private javax.swing.JTextField idPlayer2AddMatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
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
    private javax.swing.JLabel jLabel56;
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
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator79;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel matchDateLabel;
    private javax.swing.JTable matchTable;
    private javax.swing.JLabel messageDelete;
    private javax.swing.JLabel messageSearchMatch;
    private javax.swing.JButton modificarMatch;
    private javax.swing.JLabel playerNameMatch1;
    private javax.swing.JLabel playerNameMatch2;
    private javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables
}
