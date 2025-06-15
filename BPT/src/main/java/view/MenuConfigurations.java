/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import static control.MenuConfigurationsControl.configurationFocusGained;
import static control.MenuConfigurationsControl.configurationFocusLost;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuConfigurations extends javax.swing.JFrame {
    
    // Attributes

    /**
     * Creates new form start
     * @param index
     */
    public MenuConfigurations(int index) {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.newIcon();
        setTabbedBegin(index);
    }
    
    private void newIcon(){
        Image icon = new ImageIcon(getClass().getResource("/images/logoTamanacoSinFuego.png")).getImage();
        this.setIconImage(icon);
    }
    
    private void setTabbedBegin(int number){
        this.jTabbedPane1.setSelectedIndex(number);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        botonSalida = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        botonAgregarJugadorConfiguracion = new javax.swing.JButton();
        botonEliminarJugadorConfiguracion = new javax.swing.JButton();
        botonModificarJugador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        entradaCedulaJugadorModificar = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        entradaNombreTorneoModificar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        botonCambiarNombreTorneo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        nombreJugadorModificar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        botonGuardarModificarJugador = new javax.swing.JButton();
        botonVolverModifiarJugador = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        correoJugadorModificar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        telefonoJugadorModificar = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cedulaJugadorModificar = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        fechaNacimientoJugadorModificar = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        equipoJugadorModificar = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        opcionesCategoriasModificar = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        agregarIngresarNombre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        botonAgregarJugador = new javax.swing.JButton();
        botonVolverAgregar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        agregarIngresarCorreo = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        agregarIngresarTelefono = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        agregarIngresarCedula = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        agregarIngresarEquipo = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        opcionesCategoriasAgregar = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator14 = new javax.swing.JSeparator();
        nombreJugadorEliminar = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        botonEliminarJugador = new javax.swing.JButton();
        botonVolverEliminarJugador = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        cedulaJugadorEliminar = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        nombreJugadorBPartidoEliminar = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        HoraPartidoEliminar = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        nombreJugadorAPartidoEliminar = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        botonPartidoEliminar = new javax.swing.JButton();
        botonVolverPartidoEliminar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jSeparator33 = new javax.swing.JSeparator();
        jSeparator35 = new javax.swing.JSeparator();
        nombreJugadorBPartidoModificar = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        botonVolverPartidoModificar = new javax.swing.JButton();
        botonPartidoModificar = new javax.swing.JButton();
        nombreJugadorAPartidoModificar = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        HoraPartidoModificar = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        nombreJugadorAPartidoAgregar = new javax.swing.JTextField();
        HoraPartidoAgregar = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        botonPartidoAgregar = new javax.swing.JButton();
        botonVolverPartidoAgregar = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        nombreJugadorBPartidoAgregar = new javax.swing.JTextField();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalida.setBackground(new java.awt.Color(255, 255, 255));
        botonSalida.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSalida.setForeground(new java.awt.Color(255, 255, 255));
        botonSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSalida.setText("X");
        botonSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalidaMouseClicked(evt);
            }
        });
        getContentPane().add(botonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 20, 40));

        jLabel3.setFont(new java.awt.Font("Bebas Neue", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MODIFICAR TORNEO");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 240, 50));

        botonMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        botonMinimizar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        botonMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonMinimizar.setText("__");
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 30));

        banner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.jpg"))); // NOI18N
        banner.setText("jLabel2");
        banner.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 80));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAgregarJugadorConfiguracion.setBackground(new java.awt.Color(0, 51, 255));
        botonAgregarJugadorConfiguracion.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        botonAgregarJugadorConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarJugadorConfiguracion.setText("AGREGAR JUGADOR");
        botonAgregarJugadorConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarJugadorConfiguracionActionPerformed(evt);
            }
        });
        jPanel3.add(botonAgregarJugadorConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 120, 40));

        botonEliminarJugadorConfiguracion.setBackground(new java.awt.Color(0, 51, 255));
        botonEliminarJugadorConfiguracion.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        botonEliminarJugadorConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarJugadorConfiguracion.setText("ELIMINAR JUGADOR");
        botonEliminarJugadorConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarJugadorConfiguracionActionPerformed(evt);
            }
        });
        jPanel3.add(botonEliminarJugadorConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 130, 40));

        botonModificarJugador.setBackground(new java.awt.Color(0, 51, 255));
        botonModificarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        botonModificarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarJugador.setText("modifiCAR JUGADOR");
        botonModificarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarJugadorActionPerformed(evt);
            }
        });
        jPanel3.add(botonModificarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 120, 40));

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 28)); // NOI18N
        jLabel1.setText("ELIMINAR JUGADOR:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 270, 30));

        jLabel5.setFont(new java.awt.Font("Bebas Neue", 0, 28)); // NOI18N
        jLabel5.setText("MODIFICAR jugador del torneo:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 340, 30));

        jLabel7.setFont(new java.awt.Font("Bebas Neue", 0, 28)); // NOI18N
        jLabel7.setText("AGREGAR JUGADOR:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 270, 30));

        entradaCedulaJugadorModificar.setFont(new java.awt.Font("Bebas Neue", 0, 16)); // NOI18N
        entradaCedulaJugadorModificar.setForeground(new java.awt.Color(153, 153, 153));
        entradaCedulaJugadorModificar.setText("Ingresar numero de cedula");
        entradaCedulaJugadorModificar.setBorder(null);
        entradaCedulaJugadorModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCedulaJugadorModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCedulaJugadorModificarFocusLost(evt);
            }
        });
        entradaCedulaJugadorModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCedulaJugadorModificarActionPerformed(evt);
            }
        });
        jPanel3.add(entradaCedulaJugadorModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 190, 30));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 180, 20));
        jPanel3.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 180, 20));

        entradaNombreTorneoModificar.setFont(new java.awt.Font("Bebas Neue", 0, 16)); // NOI18N
        entradaNombreTorneoModificar.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreTorneoModificar.setText("Ingresar nuevo nombre");
        entradaNombreTorneoModificar.setBorder(null);
        entradaNombreTorneoModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreTorneoModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreTorneoModificarFocusLost(evt);
            }
        });
        entradaNombreTorneoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreTorneoModificarActionPerformed(evt);
            }
        });
        jPanel3.add(entradaNombreTorneoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 130, 30));

        jLabel24.setFont(new java.awt.Font("Bebas Neue", 0, 28)); // NOI18N
        jLabel24.setText("MODIFICAR NOMBRE TORNEO:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 55, 270, -1));

        botonCambiarNombreTorneo.setBackground(new java.awt.Color(0, 51, 255));
        botonCambiarNombreTorneo.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        botonCambiarNombreTorneo.setForeground(new java.awt.Color(255, 255, 255));
        botonCambiarNombreTorneo.setText("CAMBIAR NOMBRE");
        botonCambiarNombreTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarNombreTorneoActionPerformed(evt);
            }
        });
        jPanel3.add(botonCambiarNombreTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 120, 40));

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nombreJugadorModificar.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        nombreJugadorModificar.setForeground(new java.awt.Color(153, 153, 153));
        nombreJugadorModificar.setText("Nombre a modificar");
        nombreJugadorModificar.setBorder(null);
        nombreJugadorModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJugadorModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJugadorModificarFocusLost(evt);
            }
        });
        nombreJugadorModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJugadorModificarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel10.setText("Nombre");

        botonGuardarModificarJugador.setBackground(new java.awt.Color(0, 51, 255));
        botonGuardarModificarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonGuardarModificarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardarModificarJugador.setText("Guardar");
        botonGuardarModificarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarModificarJugadorActionPerformed(evt);
            }
        });

        botonVolverModifiarJugador.setBackground(new java.awt.Color(0, 51, 255));
        botonVolverModifiarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonVolverModifiarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverModifiarJugador.setText("Volver");
        botonVolverModifiarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverModifiarJugadorActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel11.setText("NúMERO TELEFONO");

        correoJugadorModificar.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        correoJugadorModificar.setForeground(new java.awt.Color(153, 153, 153));
        correoJugadorModificar.setText("Correo a modificar");
        correoJugadorModificar.setBorder(null);
        correoJugadorModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correoJugadorModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoJugadorModificarFocusLost(evt);
            }
        });
        correoJugadorModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoJugadorModificarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel12.setText("CoRREO");

        telefonoJugadorModificar.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        telefonoJugadorModificar.setForeground(new java.awt.Color(153, 153, 153));
        telefonoJugadorModificar.setText("Numero a modificar");
        telefonoJugadorModificar.setBorder(null);
        telefonoJugadorModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonoJugadorModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoJugadorModificarFocusLost(evt);
            }
        });
        telefonoJugadorModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoJugadorModificarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel13.setText("cédula");

        jLabel14.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel14.setText("CATEGORíA");

        cedulaJugadorModificar.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        cedulaJugadorModificar.setForeground(new java.awt.Color(153, 153, 153));
        cedulaJugadorModificar.setText("Cedula a modificar");
        cedulaJugadorModificar.setBorder(null);
        cedulaJugadorModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cedulaJugadorModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cedulaJugadorModificarFocusLost(evt);
            }
        });
        cedulaJugadorModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaJugadorModificarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel15.setText("FEcha nacimiento");

        fechaNacimientoJugadorModificar.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        fechaNacimientoJugadorModificar.setForeground(new java.awt.Color(153, 153, 153));
        fechaNacimientoJugadorModificar.setText("Fecha a modificar");
        fechaNacimientoJugadorModificar.setBorder(null);
        fechaNacimientoJugadorModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechaNacimientoJugadorModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaNacimientoJugadorModificarFocusLost(evt);
            }
        });
        fechaNacimientoJugadorModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacimientoJugadorModificarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel16.setText("EQUIPO");

        equipoJugadorModificar.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        equipoJugadorModificar.setForeground(new java.awt.Color(153, 153, 153));
        equipoJugadorModificar.setText("Nuevo equipo");
        equipoJugadorModificar.setBorder(null);
        equipoJugadorModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                equipoJugadorModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                equipoJugadorModificarFocusLost(evt);
            }
        });
        equipoJugadorModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoJugadorModificarActionPerformed(evt);
            }
        });

        opcionesCategoriasModificar.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        opcionesCategoriasModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma", "6ta", "5ta", "4ta", "3era" }));
        opcionesCategoriasModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriasModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(botonVolverModifiarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(botonGuardarModificarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedulaJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(correoJugadorModificar))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equipoJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonoJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcionesCategoriasModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fechaNacimientoJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulaJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcionesCategoriasModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaNacimientoJugadorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolverModifiarJugador)
                    .addComponent(botonGuardarModificarJugador))
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("tab2", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        agregarIngresarNombre.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        agregarIngresarNombre.setForeground(new java.awt.Color(153, 153, 153));
        agregarIngresarNombre.setText("Nombre a agregar");
        agregarIngresarNombre.setBorder(null);
        agregarIngresarNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                agregarIngresarNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                agregarIngresarNombreFocusLost(evt);
            }
        });
        agregarIngresarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarIngresarNombreActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel17.setText("Nombre");

        botonAgregarJugador.setBackground(new java.awt.Color(0, 51, 255));
        botonAgregarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonAgregarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarJugador.setText("AGREGAR");
        botonAgregarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarJugadorActionPerformed(evt);
            }
        });

        botonVolverAgregar.setBackground(new java.awt.Color(0, 51, 255));
        botonVolverAgregar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonVolverAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverAgregar.setText("Volver");
        botonVolverAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAgregarActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel18.setText("NúMERO TELEFONO");

        agregarIngresarCorreo.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        agregarIngresarCorreo.setForeground(new java.awt.Color(153, 153, 153));
        agregarIngresarCorreo.setText("Correo a agregar");
        agregarIngresarCorreo.setBorder(null);
        agregarIngresarCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                agregarIngresarCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                agregarIngresarCorreoFocusLost(evt);
            }
        });
        agregarIngresarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarIngresarCorreoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel19.setText("CoRREO");

        agregarIngresarTelefono.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        agregarIngresarTelefono.setForeground(new java.awt.Color(153, 153, 153));
        agregarIngresarTelefono.setText("Numero a agregar");
        agregarIngresarTelefono.setBorder(null);
        agregarIngresarTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                agregarIngresarTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                agregarIngresarTelefonoFocusLost(evt);
            }
        });
        agregarIngresarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarIngresarTelefonoActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel20.setText("cédula");

        jLabel21.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel21.setText("CaTEGORíA");

        agregarIngresarCedula.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        agregarIngresarCedula.setForeground(new java.awt.Color(153, 153, 153));
        agregarIngresarCedula.setText("Cedula del jugador");
        agregarIngresarCedula.setBorder(null);
        agregarIngresarCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                agregarIngresarCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                agregarIngresarCedulaFocusLost(evt);
            }
        });
        agregarIngresarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarIngresarCedulaActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel23.setText("EQUIPO");

        agregarIngresarEquipo.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        agregarIngresarEquipo.setForeground(new java.awt.Color(153, 153, 153));
        agregarIngresarEquipo.setText("Equipo del jugador");
        agregarIngresarEquipo.setBorder(null);
        agregarIngresarEquipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                agregarIngresarEquipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                agregarIngresarEquipoFocusLost(evt);
            }
        });
        agregarIngresarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarIngresarEquipoActionPerformed(evt);
            }
        });

        opcionesCategoriasAgregar.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        opcionesCategoriasAgregar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma", "6ta", "5ta", "4ta", "3era" }));
        opcionesCategoriasAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriasAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(botonVolverAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(botonAgregarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agregarIngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agregarIngresarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(agregarIngresarCorreo)
                                    .addComponent(agregarIngresarEquipo)))
                            .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionesCategoriasAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarIngresarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarIngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarIngresarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarIngresarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcionesCategoriasAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarIngresarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarIngresarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolverAgregar)
                    .addComponent(botonAgregarJugador))
                .addGap(104, 104, 104))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        nombreJugadorEliminar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        nombreJugadorEliminar.setForeground(new java.awt.Color(153, 153, 153));
        nombreJugadorEliminar.setText("Nombre del jugador");
        nombreJugadorEliminar.setBorder(null);
        nombreJugadorEliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJugadorEliminarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJugadorEliminarFocusLost(evt);
            }
        });
        nombreJugadorEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJugadorEliminarActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel22.setText("Nombre");

        botonEliminarJugador.setBackground(new java.awt.Color(0, 51, 255));
        botonEliminarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonEliminarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarJugador.setText("Eliminar");
        botonEliminarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarJugadorActionPerformed(evt);
            }
        });

        botonVolverEliminarJugador.setBackground(new java.awt.Color(0, 51, 255));
        botonVolverEliminarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonVolverEliminarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverEliminarJugador.setText("Volver");
        botonVolverEliminarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverEliminarJugadorActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel26.setText("cédula");

        cedulaJugadorEliminar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        cedulaJugadorEliminar.setForeground(new java.awt.Color(153, 153, 153));
        cedulaJugadorEliminar.setText("Cedula del jugador");
        cedulaJugadorEliminar.setBorder(null);
        cedulaJugadorEliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cedulaJugadorEliminarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cedulaJugadorEliminarFocusLost(evt);
            }
        });
        cedulaJugadorEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaJugadorEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(botonVolverEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(botonEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 114, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cedulaJugadorEliminar)
                            .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreJugadorEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJugadorEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cedulaJugadorEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolverEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 540));

        jTabbedPane1.addTab("tab4", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel27.setText("Jugador B o Dupla B");

        nombreJugadorBPartidoEliminar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        nombreJugadorBPartidoEliminar.setForeground(new java.awt.Color(153, 153, 153));
        nombreJugadorBPartidoEliminar.setText("Nombre del jugador  a eliminar");
        nombreJugadorBPartidoEliminar.setBorder(null);
        nombreJugadorBPartidoEliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJugadorBPartidoEliminarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJugadorBPartidoEliminarFocusLost(evt);
            }
        });
        nombreJugadorBPartidoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJugadorBPartidoEliminarActionPerformed(evt);
            }
        });

        HoraPartidoEliminar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        HoraPartidoEliminar.setForeground(new java.awt.Color(153, 153, 153));
        HoraPartidoEliminar.setText("hORA del partido");
        HoraPartidoEliminar.setBorder(null);
        HoraPartidoEliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HoraPartidoEliminarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                HoraPartidoEliminarFocusLost(evt);
            }
        });
        HoraPartidoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraPartidoEliminarActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel31.setText("hORA");

        nombreJugadorAPartidoEliminar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        nombreJugadorAPartidoEliminar.setForeground(new java.awt.Color(153, 153, 153));
        nombreJugadorAPartidoEliminar.setText("Nombre del jugador  a eliminar");
        nombreJugadorAPartidoEliminar.setBorder(null);
        nombreJugadorAPartidoEliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJugadorAPartidoEliminarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJugadorAPartidoEliminarFocusLost(evt);
            }
        });
        nombreJugadorAPartidoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJugadorAPartidoEliminarActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel25.setText("Jugador A o Dupla A");

        botonPartidoEliminar.setBackground(new java.awt.Color(0, 51, 255));
        botonPartidoEliminar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonPartidoEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonPartidoEliminar.setText("Eliminar");
        botonPartidoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPartidoEliminarActionPerformed(evt);
            }
        });

        botonVolverPartidoEliminar.setBackground(new java.awt.Color(0, 51, 255));
        botonVolverPartidoEliminar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonVolverPartidoEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverPartidoEliminar.setText("Volver");
        botonVolverPartidoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverPartidoEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreJugadorBPartidoEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator20)
                            .addComponent(jSeparator18)
                            .addComponent(nombreJugadorAPartidoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jLabel31)
                            .addComponent(jSeparator24)
                            .addComponent(HoraPartidoEliminar)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(botonVolverPartidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(botonPartidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJugadorAPartidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJugadorBPartidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HoraPartidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolverPartidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPartidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        nombreJugadorBPartidoModificar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        nombreJugadorBPartidoModificar.setForeground(new java.awt.Color(153, 153, 153));
        nombreJugadorBPartidoModificar.setText("Nombre del jugador  a modificar");
        nombreJugadorBPartidoModificar.setBorder(null);
        nombreJugadorBPartidoModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJugadorBPartidoModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJugadorBPartidoModificarFocusLost(evt);
            }
        });
        nombreJugadorBPartidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJugadorBPartidoModificarActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel44.setText("Jugador B o Dupla B");

        botonVolverPartidoModificar.setBackground(new java.awt.Color(0, 51, 255));
        botonVolverPartidoModificar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonVolverPartidoModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverPartidoModificar.setText("Volver");
        botonVolverPartidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverPartidoModificarActionPerformed(evt);
            }
        });

        botonPartidoModificar.setBackground(new java.awt.Color(0, 51, 255));
        botonPartidoModificar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonPartidoModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonPartidoModificar.setText("Modificar");
        botonPartidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPartidoModificarActionPerformed(evt);
            }
        });

        nombreJugadorAPartidoModificar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        nombreJugadorAPartidoModificar.setForeground(new java.awt.Color(153, 153, 153));
        nombreJugadorAPartidoModificar.setText("Nombre del jugador  a modificar");
        nombreJugadorAPartidoModificar.setBorder(null);
        nombreJugadorAPartidoModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJugadorAPartidoModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJugadorAPartidoModificarFocusLost(evt);
            }
        });
        nombreJugadorAPartidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJugadorAPartidoModificarActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel43.setText("Jugador A o Dupla A");

        jLabel40.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel40.setText("Hora");

        HoraPartidoModificar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        HoraPartidoModificar.setForeground(new java.awt.Color(153, 153, 153));
        HoraPartidoModificar.setText("Hora del partido");
        HoraPartidoModificar.setBorder(null);
        HoraPartidoModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HoraPartidoModificarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                HoraPartidoModificarFocusLost(evt);
            }
        });
        HoraPartidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraPartidoModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreJugadorBPartidoModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator35)
                            .addComponent(jSeparator33)
                            .addComponent(nombreJugadorAPartidoModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel40)
                            .addComponent(HoraPartidoModificar)
                            .addComponent(jSeparator34, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(botonVolverPartidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(botonPartidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 86, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJugadorAPartidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJugadorBPartidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HoraPartidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolverPartidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPartidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel39.setText("Hora");

        nombreJugadorAPartidoAgregar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        nombreJugadorAPartidoAgregar.setForeground(new java.awt.Color(153, 153, 153));
        nombreJugadorAPartidoAgregar.setText("Nombre del jugador  a agregar");
        nombreJugadorAPartidoAgregar.setBorder(null);
        nombreJugadorAPartidoAgregar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJugadorAPartidoAgregarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJugadorAPartidoAgregarFocusLost(evt);
            }
        });
        nombreJugadorAPartidoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJugadorAPartidoAgregarActionPerformed(evt);
            }
        });

        HoraPartidoAgregar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        HoraPartidoAgregar.setForeground(new java.awt.Color(153, 153, 153));
        HoraPartidoAgregar.setText("Hora del partido");
        HoraPartidoAgregar.setBorder(null);
        HoraPartidoAgregar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HoraPartidoAgregarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                HoraPartidoAgregarFocusLost(evt);
            }
        });
        HoraPartidoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraPartidoAgregarActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel42.setText("Jugador A o Dupla A");

        botonPartidoAgregar.setBackground(new java.awt.Color(0, 51, 255));
        botonPartidoAgregar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonPartidoAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonPartidoAgregar.setText("Agregar");
        botonPartidoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPartidoAgregarActionPerformed(evt);
            }
        });

        botonVolverPartidoAgregar.setBackground(new java.awt.Color(0, 51, 255));
        botonVolverPartidoAgregar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonVolverPartidoAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverPartidoAgregar.setText("Volver");
        botonVolverPartidoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverPartidoAgregarActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel41.setText("Jugador B o Dupla B");

        nombreJugadorBPartidoAgregar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        nombreJugadorBPartidoAgregar.setForeground(new java.awt.Color(153, 153, 153));
        nombreJugadorBPartidoAgregar.setText("Nombre del jugador  a agregar");
        nombreJugadorBPartidoAgregar.setBorder(null);
        nombreJugadorBPartidoAgregar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJugadorBPartidoAgregarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJugadorBPartidoAgregarFocusLost(evt);
            }
        });
        nombreJugadorBPartidoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJugadorBPartidoAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreJugadorBPartidoAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator32)
                            .addComponent(jSeparator31)
                            .addComponent(nombreJugadorAPartidoAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addComponent(jLabel41)
                            .addComponent(jLabel39)
                            .addComponent(HoraPartidoAgregar)
                            .addComponent(jSeparator30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(botonVolverPartidoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(botonPartidoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 86, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJugadorAPartidoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJugadorBPartidoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HoraPartidoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolverPartidoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPartidoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 470, 540));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogo.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 490, 240));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancha_tenis.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 430, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaJugadorModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaJugadorModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaJugadorModificarActionPerformed

    private void telefonoJugadorModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoJugadorModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoJugadorModificarActionPerformed

    private void correoJugadorModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoJugadorModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoJugadorModificarActionPerformed

    private void botonVolverModifiarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverModifiarJugadorActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_botonVolverModifiarJugadorActionPerformed

    private void botonGuardarModificarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarModificarJugadorActionPerformed
        //modificar jugador
    }//GEN-LAST:event_botonGuardarModificarJugadorActionPerformed

    private void nombreJugadorModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJugadorModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJugadorModificarActionPerformed

    private void botonModificarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarJugadorActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_botonModificarJugadorActionPerformed

    private void botonEliminarJugadorConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarJugadorConfiguracionActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_botonEliminarJugadorConfiguracionActionPerformed

    private void botonAgregarJugadorConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarJugadorConfiguracionActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_botonAgregarJugadorConfiguracionActionPerformed

    private void fechaNacimientoJugadorModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacimientoJugadorModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaNacimientoJugadorModificarActionPerformed

    private void equipoJugadorModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoJugadorModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipoJugadorModificarActionPerformed

    private void nombreJugadorEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJugadorEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJugadorEliminarActionPerformed

    private void botonEliminarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarJugadorActionPerformed
        // eliminar jugador
    }//GEN-LAST:event_botonEliminarJugadorActionPerformed

    private void botonVolverEliminarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverEliminarJugadorActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_botonVolverEliminarJugadorActionPerformed

    private void cedulaJugadorEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaJugadorEliminarActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_cedulaJugadorEliminarActionPerformed

    private void botonSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalidaMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void agregarIngresarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIngresarEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarIngresarEquipoActionPerformed

    private void agregarIngresarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIngresarCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarIngresarCedulaActionPerformed

    private void agregarIngresarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIngresarTelefonoActionPerformed
        // telefono de agregar jugador
    }//GEN-LAST:event_agregarIngresarTelefonoActionPerformed

    private void agregarIngresarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIngresarCorreoActionPerformed
        // correo de agregar jugador
    }//GEN-LAST:event_agregarIngresarCorreoActionPerformed

    private void botonVolverAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAgregarActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_botonVolverAgregarActionPerformed

    private void botonAgregarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarJugadorActionPerformed
        // agregar jugador
    }//GEN-LAST:event_botonAgregarJugadorActionPerformed

    private void agregarIngresarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIngresarNombreActionPerformed
        // nombre de agregar jugador
    }//GEN-LAST:event_agregarIngresarNombreActionPerformed

    private void opcionesCategoriasAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriasAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionesCategoriasAgregarActionPerformed

    private void entradaCedulaJugadorModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCedulaJugadorModificarActionPerformed

    }//GEN-LAST:event_entradaCedulaJugadorModificarActionPerformed

    private void entradaNombreTorneoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreTorneoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneoModificarActionPerformed

    private void botonCambiarNombreTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarNombreTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCambiarNombreTorneoActionPerformed

    private void opcionesCategoriasModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriasModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionesCategoriasModificarActionPerformed

    private void entradaNombreTorneoModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneoModificarFocusLost
        configurationFocusLost (entradaNombreTorneoModificar, "Ingresar nuevo nombre");
    }//GEN-LAST:event_entradaNombreTorneoModificarFocusLost

    private void entradaNombreTorneoModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneoModificarFocusGained
        configurationFocusGained (entradaNombreTorneoModificar, "Ingresar nuevo nombre");
    }//GEN-LAST:event_entradaNombreTorneoModificarFocusGained

    private void entradaCedulaJugadorModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCedulaJugadorModificarFocusGained
        configurationFocusGained (entradaCedulaJugadorModificar, "Ingresar numero de cedula");
    }//GEN-LAST:event_entradaCedulaJugadorModificarFocusGained

    private void entradaCedulaJugadorModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCedulaJugadorModificarFocusLost
        configurationFocusLost (entradaCedulaJugadorModificar, "Ingresar numero de cedula");
    }//GEN-LAST:event_entradaCedulaJugadorModificarFocusLost

    private void nombreJugadorModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorModificarFocusGained
        configurationFocusGained (nombreJugadorModificar, "Nombre a modificar");
    }//GEN-LAST:event_nombreJugadorModificarFocusGained

    private void nombreJugadorModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorModificarFocusLost
        configurationFocusLost (nombreJugadorModificar, "Nombre a modificar");
    }//GEN-LAST:event_nombreJugadorModificarFocusLost

    private void cedulaJugadorModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaJugadorModificarFocusGained
        configurationFocusGained (cedulaJugadorModificar, "Cedula a modificar");
    }//GEN-LAST:event_cedulaJugadorModificarFocusGained

    private void cedulaJugadorModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaJugadorModificarFocusLost
        configurationFocusLost (cedulaJugadorModificar, "Cedula a modificar");
    }//GEN-LAST:event_cedulaJugadorModificarFocusLost

    private void fechaNacimientoJugadorModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaNacimientoJugadorModificarFocusGained
        configurationFocusGained (fechaNacimientoJugadorModificar, "Fecha a modificar");
    }//GEN-LAST:event_fechaNacimientoJugadorModificarFocusGained

    private void fechaNacimientoJugadorModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaNacimientoJugadorModificarFocusLost
        configurationFocusLost (fechaNacimientoJugadorModificar, "Fecha a modificar");
    }//GEN-LAST:event_fechaNacimientoJugadorModificarFocusLost

    private void correoJugadorModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoJugadorModificarFocusGained
        configurationFocusGained (correoJugadorModificar, "Correo a modificar");
    }//GEN-LAST:event_correoJugadorModificarFocusGained

    private void correoJugadorModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoJugadorModificarFocusLost
        configurationFocusLost (correoJugadorModificar, "Correo a modificar");
    }//GEN-LAST:event_correoJugadorModificarFocusLost

    private void equipoJugadorModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_equipoJugadorModificarFocusGained
        configurationFocusGained (equipoJugadorModificar, "Nuevo equipo");
    }//GEN-LAST:event_equipoJugadorModificarFocusGained

    private void equipoJugadorModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_equipoJugadorModificarFocusLost
        configurationFocusLost (equipoJugadorModificar, "Nuevo equipo");
    }//GEN-LAST:event_equipoJugadorModificarFocusLost

    private void telefonoJugadorModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoJugadorModificarFocusGained
        configurationFocusGained (telefonoJugadorModificar, "Numero a modificar");
    }//GEN-LAST:event_telefonoJugadorModificarFocusGained

    private void telefonoJugadorModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoJugadorModificarFocusLost
        configurationFocusLost (telefonoJugadorModificar, "Numero a modificar");
    }//GEN-LAST:event_telefonoJugadorModificarFocusLost

    private void agregarIngresarNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agregarIngresarNombreFocusGained
        configurationFocusGained (agregarIngresarNombre, "Nombre a agregar");
    }//GEN-LAST:event_agregarIngresarNombreFocusGained

    private void agregarIngresarNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agregarIngresarNombreFocusLost
        configurationFocusLost (agregarIngresarNombre, "Numero a modificar");
    }//GEN-LAST:event_agregarIngresarNombreFocusLost

    private void agregarIngresarCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agregarIngresarCedulaFocusGained
        configurationFocusGained (agregarIngresarCedula, "Cedula del jugador");
    }//GEN-LAST:event_agregarIngresarCedulaFocusGained

    private void agregarIngresarCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agregarIngresarCedulaFocusLost
        configurationFocusLost (agregarIngresarCedula, "Cedula del jugador");
    }//GEN-LAST:event_agregarIngresarCedulaFocusLost

    private void agregarIngresarCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agregarIngresarCorreoFocusGained
        configurationFocusGained (agregarIngresarCorreo, "Correo a agregar");
    }//GEN-LAST:event_agregarIngresarCorreoFocusGained

    private void agregarIngresarTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agregarIngresarTelefonoFocusGained
        configurationFocusGained (agregarIngresarTelefono, "Numero a agregar");
    }//GEN-LAST:event_agregarIngresarTelefonoFocusGained

    private void agregarIngresarTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agregarIngresarTelefonoFocusLost
        configurationFocusLost (agregarIngresarTelefono, "Numero a agregar");
    }//GEN-LAST:event_agregarIngresarTelefonoFocusLost

    private void agregarIngresarCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agregarIngresarCorreoFocusLost
        configurationFocusLost (agregarIngresarCorreo, "Correo a agregar");
    }//GEN-LAST:event_agregarIngresarCorreoFocusLost

    private void agregarIngresarEquipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agregarIngresarEquipoFocusGained
        configurationFocusGained (agregarIngresarEquipo, "Equipo del jugador");
    }//GEN-LAST:event_agregarIngresarEquipoFocusGained

    private void agregarIngresarEquipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agregarIngresarEquipoFocusLost
        configurationFocusLost (agregarIngresarEquipo, "Equipo del jugador");
    }//GEN-LAST:event_agregarIngresarEquipoFocusLost

    private void nombreJugadorEliminarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorEliminarFocusGained
        configurationFocusGained (nombreJugadorEliminar, "Nombre del jugador");
    }//GEN-LAST:event_nombreJugadorEliminarFocusGained

    private void nombreJugadorEliminarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorEliminarFocusLost
        configurationFocusLost (nombreJugadorEliminar, "Nombre del jugador");
    }//GEN-LAST:event_nombreJugadorEliminarFocusLost

    private void cedulaJugadorEliminarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaJugadorEliminarFocusGained
        configurationFocusGained (cedulaJugadorEliminar, "Cedula del jugador");
    }//GEN-LAST:event_cedulaJugadorEliminarFocusGained

    private void cedulaJugadorEliminarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaJugadorEliminarFocusLost
        configurationFocusLost (cedulaJugadorEliminar, "Cedula del jugador");
    }//GEN-LAST:event_cedulaJugadorEliminarFocusLost

    private void nombreJugadorBPartidoEliminarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorBPartidoEliminarFocusGained
        configurationFocusGained (nombreJugadorBPartidoEliminar, "Nombre del jugador a eliminar");
    }//GEN-LAST:event_nombreJugadorBPartidoEliminarFocusGained

    private void nombreJugadorBPartidoEliminarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorBPartidoEliminarFocusLost
        configurationFocusLost (nombreJugadorBPartidoEliminar, "Nombre del jugador a eliminar");
    }//GEN-LAST:event_nombreJugadorBPartidoEliminarFocusLost

    private void nombreJugadorBPartidoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJugadorBPartidoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJugadorBPartidoEliminarActionPerformed

    private void HoraPartidoEliminarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HoraPartidoEliminarFocusGained
        configurationFocusGained (HoraPartidoEliminar, "Hora del partido");
    }//GEN-LAST:event_HoraPartidoEliminarFocusGained

    private void HoraPartidoEliminarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HoraPartidoEliminarFocusLost
        configurationFocusLost (HoraPartidoEliminar, "Hora del partido");
    }//GEN-LAST:event_HoraPartidoEliminarFocusLost

    private void HoraPartidoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraPartidoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraPartidoEliminarActionPerformed

    private void nombreJugadorAPartidoEliminarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorAPartidoEliminarFocusGained
        configurationFocusGained (nombreJugadorAPartidoEliminar, "Nombre del jugador a eliminar");
    }//GEN-LAST:event_nombreJugadorAPartidoEliminarFocusGained

    private void nombreJugadorAPartidoEliminarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorAPartidoEliminarFocusLost
        configurationFocusLost (nombreJugadorAPartidoEliminar, "Nombre del jugador a eliminar");
    }//GEN-LAST:event_nombreJugadorAPartidoEliminarFocusLost

    private void nombreJugadorAPartidoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJugadorAPartidoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJugadorAPartidoEliminarActionPerformed

    private void botonPartidoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPartidoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPartidoEliminarActionPerformed

    private void botonVolverPartidoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverPartidoEliminarActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_botonVolverPartidoEliminarActionPerformed

    private void nombreJugadorBPartidoModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorBPartidoModificarFocusGained
        configurationFocusGained (nombreJugadorBPartidoModificar, "Nombre del jugador a modificar");
    }//GEN-LAST:event_nombreJugadorBPartidoModificarFocusGained

    private void nombreJugadorBPartidoModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorBPartidoModificarFocusLost
        configurationFocusLost (nombreJugadorBPartidoModificar, "Nombre del jugador a modificar");
    }//GEN-LAST:event_nombreJugadorBPartidoModificarFocusLost

    private void nombreJugadorBPartidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJugadorBPartidoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJugadorBPartidoModificarActionPerformed

    private void botonVolverPartidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverPartidoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverPartidoModificarActionPerformed

    private void botonPartidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPartidoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPartidoModificarActionPerformed

    private void nombreJugadorAPartidoModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorAPartidoModificarFocusGained
        configurationFocusGained (nombreJugadorAPartidoModificar, "Nombre del jugador a modificar");
    }//GEN-LAST:event_nombreJugadorAPartidoModificarFocusGained

    private void nombreJugadorAPartidoModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorAPartidoModificarFocusLost
        configurationFocusLost (nombreJugadorAPartidoModificar, "Nombre del jugador a modificar");
    }//GEN-LAST:event_nombreJugadorAPartidoModificarFocusLost

    private void nombreJugadorAPartidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJugadorAPartidoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJugadorAPartidoModificarActionPerformed

    private void HoraPartidoModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HoraPartidoModificarFocusGained
        configurationFocusGained (HoraPartidoModificar, "Hora del encuentro");
    }//GEN-LAST:event_HoraPartidoModificarFocusGained

    private void HoraPartidoModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HoraPartidoModificarFocusLost
        configurationFocusLost (HoraPartidoModificar, "Hora del encuentro");
    }//GEN-LAST:event_HoraPartidoModificarFocusLost

    private void HoraPartidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraPartidoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraPartidoModificarActionPerformed

    private void nombreJugadorAPartidoAgregarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorAPartidoAgregarFocusGained
        configurationFocusGained (nombreJugadorAPartidoAgregar, "Nombre del jugador a agregar");
    }//GEN-LAST:event_nombreJugadorAPartidoAgregarFocusGained

    private void nombreJugadorAPartidoAgregarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorAPartidoAgregarFocusLost
        configurationFocusLost (nombreJugadorAPartidoAgregar, "Nombre del jugador a agregar");
    }//GEN-LAST:event_nombreJugadorAPartidoAgregarFocusLost

    private void nombreJugadorAPartidoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJugadorAPartidoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJugadorAPartidoAgregarActionPerformed

    private void HoraPartidoAgregarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HoraPartidoAgregarFocusGained
        configurationFocusGained (HoraPartidoAgregar, "Hora del partido");
    }//GEN-LAST:event_HoraPartidoAgregarFocusGained

    private void HoraPartidoAgregarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HoraPartidoAgregarFocusLost
        configurationFocusLost (HoraPartidoAgregar, "Hora del partido");
    }//GEN-LAST:event_HoraPartidoAgregarFocusLost

    private void HoraPartidoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraPartidoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraPartidoAgregarActionPerformed

    private void botonPartidoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPartidoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPartidoAgregarActionPerformed

    private void botonVolverPartidoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverPartidoAgregarActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_botonVolverPartidoAgregarActionPerformed

    private void nombreJugadorBPartidoAgregarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorBPartidoAgregarFocusGained
        configurationFocusGained (nombreJugadorBPartidoAgregar, "Nombre del jugador a agregar");
    }//GEN-LAST:event_nombreJugadorBPartidoAgregarFocusGained

    private void nombreJugadorBPartidoAgregarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorBPartidoAgregarFocusLost
        configurationFocusLost (nombreJugadorBPartidoAgregar, "Nombre del jugador a agregar");
    }//GEN-LAST:event_nombreJugadorBPartidoAgregarFocusLost

    private void nombreJugadorBPartidoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJugadorBPartidoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJugadorBPartidoAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HoraPartidoAgregar;
    private javax.swing.JTextField HoraPartidoEliminar;
    private javax.swing.JTextField HoraPartidoModificar;
    private javax.swing.JTextField agregarIngresarCedula;
    private javax.swing.JTextField agregarIngresarCorreo;
    private javax.swing.JTextField agregarIngresarEquipo;
    private javax.swing.JTextField agregarIngresarNombre;
    private javax.swing.JTextField agregarIngresarTelefono;
    private javax.swing.JLabel banner;
    private javax.swing.JButton botonAgregarJugador;
    private javax.swing.JButton botonAgregarJugadorConfiguracion;
    private javax.swing.JButton botonCambiarNombreTorneo;
    private javax.swing.JButton botonEliminarJugador;
    private javax.swing.JButton botonEliminarJugadorConfiguracion;
    private javax.swing.JButton botonGuardarModificarJugador;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JButton botonModificarJugador;
    private javax.swing.JButton botonPartidoAgregar;
    private javax.swing.JButton botonPartidoEliminar;
    private javax.swing.JButton botonPartidoModificar;
    private javax.swing.JLabel botonSalida;
    private javax.swing.JButton botonVolverAgregar;
    private javax.swing.JButton botonVolverEliminarJugador;
    private javax.swing.JButton botonVolverModifiarJugador;
    private javax.swing.JButton botonVolverPartidoAgregar;
    private javax.swing.JButton botonVolverPartidoEliminar;
    private javax.swing.JButton botonVolverPartidoModificar;
    private javax.swing.JTextField cedulaJugadorEliminar;
    private javax.swing.JTextField cedulaJugadorModificar;
    private javax.swing.JTextField correoJugadorModificar;
    private javax.swing.JTextField entradaCedulaJugadorModificar;
    private javax.swing.JTextField entradaNombreTorneoModificar;
    private javax.swing.JTextField equipoJugadorModificar;
    private javax.swing.JTextField fechaNacimientoJugadorModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nombreJugadorAPartidoAgregar;
    private javax.swing.JTextField nombreJugadorAPartidoEliminar;
    private javax.swing.JTextField nombreJugadorAPartidoModificar;
    private javax.swing.JTextField nombreJugadorBPartidoAgregar;
    private javax.swing.JTextField nombreJugadorBPartidoEliminar;
    private javax.swing.JTextField nombreJugadorBPartidoModificar;
    private javax.swing.JTextField nombreJugadorEliminar;
    private javax.swing.JTextField nombreJugadorModificar;
    private javax.swing.JComboBox<String> opcionesCategoriasAgregar;
    private javax.swing.JComboBox<String> opcionesCategoriasModificar;
    private javax.swing.JTextField telefonoJugadorModificar;
    // End of variables declaration//GEN-END:variables
}
