/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuPlayOff extends javax.swing.JFrame {

    /**
     * Creates new form MenuPlayOff
     */
    public MenuPlayOff() {
        initComponents();
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonSalida = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        tituloSuperior = new javax.swing.JLabel();
        iconoSuperior = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel31 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel163 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel222 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel162 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel180 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel183 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel185 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel186 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel218 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel237 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel238 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel239 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel240 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel241 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel242 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel267 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel268 = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        jPanel57 = new javax.swing.JPanel();
        jLabel269 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jLabel311 = new javax.swing.JLabel();
        jLabel312 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jLabel315 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jLabel317 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel327 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jLabel328 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        jLabel329 = new javax.swing.JLabel();
        jLabel330 = new javax.swing.JLabel();
        jLabel331 = new javax.swing.JLabel();
        jPanel83 = new javax.swing.JPanel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jLabel305 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        jLabel307 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jPanel86 = new javax.swing.JPanel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jPanel87 = new javax.swing.JPanel();
        jLabel332 = new javax.swing.JLabel();
        jLabel333 = new javax.swing.JLabel();
        jPanel88 = new javax.swing.JPanel();
        jLabel334 = new javax.swing.JLabel();
        jLabel335 = new javax.swing.JLabel();
        jLabel336 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();
        jPanel89 = new javax.swing.JPanel();
        jLabel338 = new javax.swing.JLabel();
        jLabel339 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        jLabel340 = new javax.swing.JLabel();
        jPanel91 = new javax.swing.JPanel();
        jLabel341 = new javax.swing.JLabel();
        jScrollPane38 = new javax.swing.JScrollPane();
        jPanel58 = new javax.swing.JPanel();
        jLabel342 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jLabel343 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        jLabel345 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jLabel347 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        jLabel349 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jLabel351 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jPanel80 = new javax.swing.JPanel();
        jLabel353 = new javax.swing.JLabel();
        jLabel354 = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        jPanel81 = new javax.swing.JPanel();
        jLabel357 = new javax.swing.JLabel();
        jLabel358 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        jLabel359 = new javax.swing.JLabel();
        jPanel92 = new javax.swing.JPanel();
        jLabel360 = new javax.swing.JLabel();
        jPanel93 = new javax.swing.JPanel();
        jLabel361 = new javax.swing.JLabel();
        jLabel362 = new javax.swing.JLabel();
        jLabel363 = new javax.swing.JLabel();
        jPanel94 = new javax.swing.JPanel();
        jLabel364 = new javax.swing.JLabel();
        jLabel365 = new javax.swing.JLabel();
        jPanel95 = new javax.swing.JPanel();
        jLabel366 = new javax.swing.JLabel();
        jLabel367 = new javax.swing.JLabel();
        jPanel96 = new javax.swing.JPanel();
        jLabel368 = new javax.swing.JLabel();
        jLabel369 = new javax.swing.JLabel();
        jPanel97 = new javax.swing.JPanel();
        jLabel370 = new javax.swing.JLabel();
        jLabel371 = new javax.swing.JLabel();
        jPanel98 = new javax.swing.JPanel();
        jLabel372 = new javax.swing.JLabel();
        jLabel373 = new javax.swing.JLabel();
        jPanel99 = new javax.swing.JPanel();
        jLabel374 = new javax.swing.JLabel();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jLabel377 = new javax.swing.JLabel();
        jPanel100 = new javax.swing.JPanel();
        jLabel378 = new javax.swing.JLabel();
        jLabel379 = new javax.swing.JLabel();
        jPanel101 = new javax.swing.JPanel();
        jLabel380 = new javax.swing.JLabel();
        jPanel102 = new javax.swing.JPanel();
        jLabel381 = new javax.swing.JLabel();
        jScrollPane39 = new javax.swing.JScrollPane();
        jPanel59 = new javax.swing.JPanel();
        jLabel270 = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jPanel104 = new javax.swing.JPanel();
        jLabel276 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jPanel105 = new javax.swing.JPanel();
        jLabel277 = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        jLabel292 = new javax.swing.JLabel();
        jPanel107 = new javax.swing.JPanel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jPanel108 = new javax.swing.JPanel();
        jLabel382 = new javax.swing.JLabel();
        jLabel383 = new javax.swing.JLabel();
        jLabel384 = new javax.swing.JLabel();
        jLabel385 = new javax.swing.JLabel();
        jPanel109 = new javax.swing.JPanel();
        jLabel386 = new javax.swing.JLabel();
        jLabel387 = new javax.swing.JLabel();
        jPanel110 = new javax.swing.JPanel();
        jLabel388 = new javax.swing.JLabel();
        jPanel111 = new javax.swing.JPanel();
        jLabel389 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jLabel289 = new javax.swing.JLabel();
        jPanel112 = new javax.swing.JPanel();
        jLabel390 = new javax.swing.JLabel();
        jPanel113 = new javax.swing.JPanel();
        jLabel391 = new javax.swing.JLabel();
        jPanel114 = new javax.swing.JPanel();
        jLabel392 = new javax.swing.JLabel();
        jLabel393 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jPanel115 = new javax.swing.JPanel();
        jLabel395 = new javax.swing.JLabel();
        jPanel116 = new javax.swing.JPanel();
        jLabel396 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel296 = new javax.swing.JLabel();
        jPanel117 = new javax.swing.JPanel();
        jLabel397 = new javax.swing.JLabel();
        jLabel398 = new javax.swing.JLabel();
        jLabel399 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalida.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSalida.setForeground(new java.awt.Color(255, 255, 255));
        botonSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSalida.setText("X");
        botonSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalidaMouseClicked(evt);
            }
        });
        jPanel1.add(botonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 30, 40));

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
        jPanel1.add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 60, 40));

        tituloSuperior.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        tituloSuperior.setForeground(new java.awt.Color(255, 255, 255));
        tituloSuperior.setText("CREAR TORNEO");
        jPanel1.add(tituloSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 30, 170, 50));

        iconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneoMasGrande.png"))); // NOI18N
        jPanel1.add(iconoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 10, 80, 80));

        Banner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.jpg"))); // NOI18N
        Banner.setText("jLabel1");
        Banner.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Banner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BannerMouseClicked(evt);
            }
        });
        jPanel1.add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 90));

        jTabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel91.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(153, 153, 153));
        jLabel91.setText("fase eliminacion directa");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel91)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("tab1", jPanel31);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(1963, 700));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setBackground(new java.awt.Color(102, 102, 255));
        jLabel97.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("Enrique juan ");
        jLabel97.setToolTipText("");
        jLabel97.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 32));

        jLabel161.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(255, 255, 255));
        jLabel161.setText("Jugador 6");
        jPanel10.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel166.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel166.setText("Jugador 5");
        jPanel10.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel167.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(255, 255, 255));
        jLabel167.setText("Jugador 4");
        jPanel10.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel169.setBackground(new java.awt.Color(102, 102, 255));
        jLabel169.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel169.setText("Enrique juan ");
        jLabel169.setToolTipText("");
        jLabel169.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 32));

        jLabel173.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(255, 255, 255));
        jLabel173.setText("Jugador 4");
        jPanel10.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        jLabel182.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(255, 255, 255));
        jLabel182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel182.setText("Jugador 5");
        jPanel10.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, -1, -1));

        jLabel220.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogo.png"))); // NOI18N
        jPanel10.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        jPanel12.setBackground(new java.awt.Color(11, 19, 77));

        jLabel99.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Jugador 4");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel99)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 70));

        jPanel14.setBackground(new java.awt.Color(11, 19, 77));

        jLabel100.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("Jugador 5");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel100)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addContainerGap())
        );

        jPanel10.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, -1));

        jPanel15.setBackground(new java.awt.Color(11, 19, 77));

        jLabel163.setBackground(new java.awt.Color(102, 102, 255));
        jLabel163.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setText("Enrique juan ");
        jLabel163.setToolTipText("");
        jLabel163.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel163)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel163)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, -1));

        jPanel17.setBackground(new java.awt.Color(11, 19, 77));

        jLabel165.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setText("Jugador 6");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel165)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel165)
                .addContainerGap())
        );

        jPanel10.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 150, -1));

        jPanel18.setBackground(new java.awt.Color(11, 19, 77));

        jLabel172.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel172.setText("Jugador 5");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel172)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel172)
                .addContainerGap())
        );

        jPanel10.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, -1));

        jPanel26.setBackground(new java.awt.Color(11, 19, 77));

        jLabel222.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(255, 255, 255));
        jLabel222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel222.setText("Jugador 5");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel222)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel222)
                .addContainerGap())
        );

        jPanel10.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 150, -1));

        jPanel27.setBackground(new java.awt.Color(11, 19, 77));

        jLabel171.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(255, 255, 255));
        jLabel171.setText("Jugador 6");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel171)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel171)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jLabel221.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(255, 255, 255));
        jLabel221.setText("Jugador 6");
        jPanel10.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        jLabel223.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel223.setForeground(new java.awt.Color(255, 255, 255));
        jLabel223.setText("Jugador 4");
        jPanel10.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel224.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(255, 255, 255));
        jLabel224.setText("Jugador 6");
        jPanel10.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel225.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel225.setForeground(new java.awt.Color(255, 255, 255));
        jLabel225.setText("Jugador 4");
        jPanel10.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 90, -1));

        jPanel28.setBackground(new java.awt.Color(11, 19, 77));

        jLabel226.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel226.setForeground(new java.awt.Color(255, 255, 255));
        jLabel226.setText("Jugador 6");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel226)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel226)
                .addContainerGap())
        );

        jPanel10.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, -1));

        jLabel227.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel227.setForeground(new java.awt.Color(255, 255, 255));
        jLabel227.setText("Jugador 4");
        jPanel10.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel228.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel228.setForeground(new java.awt.Color(255, 255, 255));
        jLabel228.setText("Jugador 6");
        jPanel10.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jPanel33.setBackground(new java.awt.Color(16, 30, 117));

        jLabel162.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel162.setText("Jugador 7");

        jLabel98.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Jugador 2");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98)
                    .addComponent(jLabel162))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel98)
                .addGap(18, 18, 18)
                .addComponent(jLabel162)
                .addContainerGap())
        );

        jPanel10.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 130));

        jPanel37.setBackground(new java.awt.Color(0, 0, 255));

        jLabel178.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(255, 255, 255));
        jLabel178.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel178.setText("Jugador 7");

        jLabel179.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(255, 255, 255));
        jLabel179.setText("Jugador 2");

        jPanel40.setBackground(new java.awt.Color(16, 30, 117));

        jLabel180.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel180.setText("Jugador 7");

        jLabel232.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel232.setForeground(new java.awt.Color(255, 255, 255));
        jLabel232.setText("Jugador 2");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel232)
                    .addComponent(jLabel180))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel232)
                .addGap(18, 18, 18)
                .addComponent(jLabel180)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel179)
                    .addComponent(jLabel178))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel37Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel179)
                .addGap(18, 18, 18)
                .addComponent(jLabel178)
                .addContainerGap())
            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel37Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel10.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jPanel38.setBackground(new java.awt.Color(16, 30, 117));

        jLabel181.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel181.setText("Jugador 7");

        jLabel229.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel229.setForeground(new java.awt.Color(255, 255, 255));
        jLabel229.setText("Jugador 2");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel229)
                    .addComponent(jLabel181))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel229)
                .addGap(18, 18, 18)
                .addComponent(jLabel181)
                .addContainerGap())
        );

        jPanel10.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        jPanel39.setBackground(new java.awt.Color(16, 30, 117));

        jLabel230.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel230.setForeground(new java.awt.Color(255, 255, 255));
        jLabel230.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel230.setText("Jugador 7");

        jLabel231.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel231.setForeground(new java.awt.Color(255, 255, 255));
        jLabel231.setText("Jugador 2");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel231)
                    .addComponent(jLabel230))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel231)
                .addGap(18, 18, 18)
                .addComponent(jLabel230)
                .addContainerGap())
        );

        jPanel10.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, -1, -1));

        jPanel34.setBackground(new java.awt.Color(22, 40, 158));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel175.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(0, 0, 0));
        jLabel175.setText("Jugador 2");
        jPanel34.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel176.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(0, 0, 0));
        jLabel176.setText("Jugador 2");
        jPanel34.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel184.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(255, 255, 255));
        jLabel184.setText("Jugador 2");
        jPanel34.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 120, 160, -1));

        jLabel234.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel234.setForeground(new java.awt.Color(255, 255, 255));
        jLabel234.setText("Jugador 2");
        jPanel34.add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 160, -1));

        jPanel10.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 210));

        jPanel11.setBackground(new java.awt.Color(22, 40, 158));
        jPanel11.setForeground(new java.awt.Color(0, 0, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel183.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setText("Jugador 2");
        jPanel11.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, 160, -1));

        jLabel233.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel233.setForeground(new java.awt.Color(255, 255, 255));
        jLabel233.setText("Jugador 2");
        jPanel11.add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 30, 160, -1));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 190, 210));

        jPanel13.setBackground(new java.awt.Color(28, 51, 199));

        jLabel185.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(255, 255, 255));
        jLabel185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel185.setText("Jugador 2");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel185, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel185, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 210, 110));

        jPanel16.setBackground(new java.awt.Color(28, 51, 199));

        jLabel186.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel186.setText("Jugador 2");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel186, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, -1, 110));

        jPanel25.setBackground(new java.awt.Color(34, 62, 235));
        jPanel25.setForeground(new java.awt.Color(255, 255, 255));

        jLabel218.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel218.setText("Jugador 2");

        jLabel187.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel187.setText("Jugador 2");

        jLabel219.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(255, 255, 255));
        jLabel219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel219.setText("VS");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel187)
                .addGap(18, 18, 18)
                .addComponent(jLabel219, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel218)
                .addGap(21, 21, 21))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel218)
                    .addComponent(jLabel187)
                    .addComponent(jLabel219))
                .addContainerGap())
        );

        jPanel10.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 620, -1));

        jLabel164.setBackground(new java.awt.Color(102, 102, 255));
        jLabel164.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(255, 255, 255));
        jLabel164.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel164.setText("Enrique juan ");
        jLabel164.setToolTipText("");
        jLabel164.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 50, -1, 32));

        jLabel168.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setText("Jugador 6");
        jPanel10.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 160, -1, -1));

        jLabel170.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel170.setText("Jugador 5");
        jPanel10.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 240, -1, -1));

        jLabel174.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(255, 255, 255));
        jLabel174.setText("Jugador 4");
        jPanel10.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 400, -1, -1));

        jLabel177.setBackground(new java.awt.Color(102, 102, 255));
        jLabel177.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(255, 255, 255));
        jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel177.setText("Enrique juan ");
        jLabel177.setToolTipText("");
        jLabel177.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 470, -1, 32));

        jLabel235.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel235.setForeground(new java.awt.Color(255, 255, 255));
        jLabel235.setText("Jugador 4");
        jPanel10.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 550, -1, -1));

        jLabel236.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel236.setForeground(new java.awt.Color(255, 255, 255));
        jLabel236.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel236.setText("Jugador 5");
        jPanel10.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 660, -1, -1));

        jPanel35.setBackground(new java.awt.Color(11, 19, 77));

        jLabel237.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel237.setForeground(new java.awt.Color(255, 255, 255));
        jLabel237.setText("Jugador 4");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel237)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel237)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 130, 150, 70));

        jPanel36.setBackground(new java.awt.Color(11, 19, 77));

        jLabel238.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel238.setForeground(new java.awt.Color(255, 255, 255));
        jLabel238.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel238.setText("Jugador 5");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel238)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel238)
                .addContainerGap())
        );

        jPanel10.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 50, 150, -1));

        jPanel41.setBackground(new java.awt.Color(11, 19, 77));

        jLabel239.setBackground(new java.awt.Color(102, 102, 255));
        jLabel239.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel239.setForeground(new java.awt.Color(255, 255, 255));
        jLabel239.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel239.setText("Enrique juan ");
        jLabel239.setToolTipText("");
        jLabel239.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel239)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel239)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 210, 150, -1));

        jPanel42.setBackground(new java.awt.Color(11, 19, 77));

        jLabel240.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel240.setForeground(new java.awt.Color(255, 255, 255));
        jLabel240.setText("Jugador 6");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel240)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel240)
                .addContainerGap())
        );

        jPanel10.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 390, 150, -1));

        jPanel43.setBackground(new java.awt.Color(11, 19, 77));

        jLabel241.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel241.setForeground(new java.awt.Color(255, 255, 255));
        jLabel241.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel241.setText("Jugador 5");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel241)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel241)
                .addContainerGap())
        );

        jPanel10.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 470, 150, -1));

        jPanel44.setBackground(new java.awt.Color(11, 19, 77));

        jLabel242.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(255, 255, 255));
        jLabel242.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel242.setText("Jugador 5");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel242)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel242)
                .addContainerGap())
        );

        jPanel10.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 550, 150, -1));

        jPanel45.setBackground(new java.awt.Color(11, 19, 77));

        jLabel243.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel243.setForeground(new java.awt.Color(255, 255, 255));
        jLabel243.setText("Jugador 6");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel243)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel243)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 630, -1, -1));

        jLabel244.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel244.setForeground(new java.awt.Color(255, 255, 255));
        jLabel244.setText("Jugador 6");
        jPanel10.add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 590, -1, -1));

        jLabel245.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel245.setForeground(new java.awt.Color(255, 255, 255));
        jLabel245.setText("Jugador 4");
        jPanel10.add(jLabel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 400, -1, -1));

        jLabel246.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel246.setForeground(new java.awt.Color(255, 255, 255));
        jLabel246.setText("Jugador 6");
        jPanel10.add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 430, -1, -1));

        jLabel247.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel247.setForeground(new java.awt.Color(255, 255, 255));
        jLabel247.setText("Jugador 4");
        jPanel10.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 300, 90, -1));

        jPanel46.setBackground(new java.awt.Color(11, 19, 77));

        jLabel248.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel248.setForeground(new java.awt.Color(255, 255, 255));
        jLabel248.setText("Jugador 6");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel248)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel248)
                .addContainerGap())
        );

        jPanel10.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 290, 150, -1));

        jLabel249.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel249.setForeground(new java.awt.Color(255, 255, 255));
        jLabel249.setText("Jugador 4");
        jPanel10.add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 300, -1, -1));

        jLabel250.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel250.setForeground(new java.awt.Color(255, 255, 255));
        jLabel250.setText("Jugador 6");
        jPanel10.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 330, -1, -1));

        jPanel47.setBackground(new java.awt.Color(16, 30, 117));

        jLabel251.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel251.setForeground(new java.awt.Color(255, 255, 255));
        jLabel251.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel251.setText("Jugador 7");

        jLabel252.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel252.setForeground(new java.awt.Color(255, 255, 255));
        jLabel252.setText("Jugador 2");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel252)
                    .addComponent(jLabel251))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel252)
                .addGap(18, 18, 18)
                .addComponent(jLabel251)
                .addContainerGap())
        );

        jPanel10.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 60, -1, 130));

        jPanel48.setBackground(new java.awt.Color(0, 0, 255));

        jLabel253.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel253.setForeground(new java.awt.Color(255, 255, 255));
        jLabel253.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel253.setText("Jugador 7");

        jLabel254.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel254.setForeground(new java.awt.Color(255, 255, 255));
        jLabel254.setText("Jugador 2");

        jPanel49.setBackground(new java.awt.Color(16, 30, 117));

        jLabel255.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel255.setForeground(new java.awt.Color(255, 255, 255));
        jLabel255.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel255.setText("Jugador 7");

        jLabel256.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel256.setForeground(new java.awt.Color(255, 255, 255));
        jLabel256.setText("Jugador 2");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel256)
                    .addComponent(jLabel255))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel256)
                .addGap(18, 18, 18)
                .addComponent(jLabel255)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel254)
                    .addComponent(jLabel253))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel48Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel254)
                .addGap(18, 18, 18)
                .addComponent(jLabel253)
                .addContainerGap())
            .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel48Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel10.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 220, -1, -1));

        jPanel50.setBackground(new java.awt.Color(16, 30, 117));

        jLabel257.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel257.setForeground(new java.awt.Color(255, 255, 255));
        jLabel257.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel257.setText("Jugador 7");

        jLabel258.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel258.setForeground(new java.awt.Color(255, 255, 255));
        jLabel258.setText("Jugador 2");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel258)
                    .addComponent(jLabel257))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel258)
                .addGap(18, 18, 18)
                .addComponent(jLabel257)
                .addContainerGap())
        );

        jPanel10.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 400, -1, -1));

        jPanel51.setBackground(new java.awt.Color(16, 30, 117));

        jLabel259.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel259.setForeground(new java.awt.Color(255, 255, 255));
        jLabel259.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel259.setText("Jugador 7");

        jLabel260.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel260.setForeground(new java.awt.Color(255, 255, 255));
        jLabel260.setText("Jugador 2");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel260)
                    .addComponent(jLabel259))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel260)
                .addGap(18, 18, 18)
                .addComponent(jLabel259)
                .addContainerGap())
        );

        jPanel10.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 560, -1, -1));

        jPanel52.setBackground(new java.awt.Color(22, 40, 158));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel261.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel261.setForeground(new java.awt.Color(0, 0, 0));
        jLabel261.setText("Jugador 2");
        jPanel52.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel262.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(0, 0, 0));
        jLabel262.setText("Jugador 2");
        jPanel52.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel263.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel263.setForeground(new java.awt.Color(255, 255, 255));
        jLabel263.setText("Jugador 2");
        jPanel52.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 120, 160, -1));

        jLabel264.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel264.setForeground(new java.awt.Color(255, 255, 255));
        jLabel264.setText("Jugador 2");
        jPanel52.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 160, -1));

        jPanel10.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 100, 190, 210));

        jPanel53.setBackground(new java.awt.Color(22, 40, 158));
        jPanel53.setForeground(new java.awt.Color(0, 0, 255));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel265.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel265.setForeground(new java.awt.Color(255, 255, 255));
        jLabel265.setText("Jugador 2");
        jPanel53.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, 160, -1));

        jLabel266.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel266.setForeground(new java.awt.Color(255, 255, 255));
        jLabel266.setText("Jugador 2");
        jPanel53.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 30, 160, -1));

        jPanel10.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 450, 190, 210));

        jPanel54.setBackground(new java.awt.Color(28, 51, 199));

        jLabel267.setBackground(new java.awt.Color(28, 51, 199));
        jLabel267.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel267.setForeground(new java.awt.Color(255, 255, 255));
        jLabel267.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel267.setText("Jugador 2");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel267, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel267, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 140, 210, 110));

        jPanel55.setBackground(new java.awt.Color(28, 51, 199));

        jLabel268.setBackground(new java.awt.Color(28, 51, 199));
        jLabel268.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel268.setForeground(new java.awt.Color(255, 255, 255));
        jLabel268.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel268.setText("Jugador 2");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel268, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel268, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 500, -1, 110));

        jTabbedPane.addTab("tab2", jPanel10);

        jScrollPane37.setBorder(null);
        jScrollPane37.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane37.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));
        jPanel57.setPreferredSize(new java.awt.Dimension(1669, 700));
        jPanel57.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel269.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogo.png"))); // NOI18N
        jPanel57.add(jLabel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jPanel65.setBackground(new java.awt.Color(16, 30, 117));

        jLabel311.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel311.setForeground(new java.awt.Color(255, 255, 255));
        jLabel311.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel311.setText("Jugador 7");

        jLabel312.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel312.setForeground(new java.awt.Color(255, 255, 255));
        jLabel312.setText("Jugador 2");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel312)
                    .addComponent(jLabel311))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel312)
                .addGap(18, 18, 18)
                .addComponent(jLabel311)
                .addContainerGap())
        );

        jPanel57.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 130));

        jPanel66.setBackground(new java.awt.Color(0, 0, 255));

        jLabel313.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel313.setForeground(new java.awt.Color(255, 255, 255));
        jLabel313.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel313.setText("Jugador 7");

        jLabel314.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel314.setForeground(new java.awt.Color(255, 255, 255));
        jLabel314.setText("Jugador 2");

        jPanel67.setBackground(new java.awt.Color(16, 30, 117));

        jLabel315.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel315.setForeground(new java.awt.Color(255, 255, 255));
        jLabel315.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel315.setText("Jugador 7");

        jLabel316.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel316.setForeground(new java.awt.Color(255, 255, 255));
        jLabel316.setText("Jugador 2");

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel316)
                    .addComponent(jLabel315))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel67Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel316)
                .addGap(18, 18, 18)
                .addComponent(jLabel315)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel314)
                    .addComponent(jLabel313))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel66Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel314)
                .addGap(18, 18, 18)
                .addComponent(jLabel313)
                .addContainerGap())
            .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel66Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel57.add(jPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jPanel68.setBackground(new java.awt.Color(16, 30, 117));

        jLabel317.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel317.setText("Jugador 7");

        jLabel318.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel318.setForeground(new java.awt.Color(255, 255, 255));
        jLabel318.setText("Jugador 2");

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel318)
                    .addComponent(jLabel317))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel68Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel318)
                .addGap(18, 18, 18)
                .addComponent(jLabel317)
                .addContainerGap())
        );

        jPanel57.add(jPanel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jPanel69.setBackground(new java.awt.Color(16, 30, 117));

        jLabel319.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel319.setForeground(new java.awt.Color(255, 255, 255));
        jLabel319.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel319.setText("Jugador 7");

        jLabel320.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel320.setForeground(new java.awt.Color(255, 255, 255));
        jLabel320.setText("Jugador 2");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel320)
                    .addComponent(jLabel319))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel69Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel320)
                .addGap(18, 18, 18)
                .addComponent(jLabel319)
                .addContainerGap())
        );

        jPanel57.add(jPanel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        jPanel70.setBackground(new java.awt.Color(22, 40, 158));
        jPanel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel321.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel321.setForeground(new java.awt.Color(0, 0, 0));
        jLabel321.setText("Jugador 2");
        jPanel70.add(jLabel321, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel322.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel322.setForeground(new java.awt.Color(0, 0, 0));
        jLabel322.setText("Jugador 2");
        jPanel70.add(jLabel322, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel323.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel323.setForeground(new java.awt.Color(255, 255, 255));
        jLabel323.setText("Jugador 2");
        jPanel70.add(jLabel323, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 120, 160, -1));

        jLabel324.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel324.setForeground(new java.awt.Color(255, 255, 255));
        jLabel324.setText("Jugador 2");
        jPanel70.add(jLabel324, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 160, -1));

        jPanel57.add(jPanel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 190, 210));

        jPanel71.setBackground(new java.awt.Color(22, 40, 158));
        jPanel71.setForeground(new java.awt.Color(0, 0, 255));
        jPanel71.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel325.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel325.setForeground(new java.awt.Color(255, 255, 255));
        jLabel325.setText("Jugador 2");
        jPanel71.add(jLabel325, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, 160, -1));

        jLabel326.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel326.setForeground(new java.awt.Color(255, 255, 255));
        jLabel326.setText("Jugador 2");
        jPanel71.add(jLabel326, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 30, 160, -1));

        jPanel57.add(jPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 190, 210));

        jPanel72.setBackground(new java.awt.Color(28, 51, 199));

        jLabel327.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel327.setForeground(new java.awt.Color(255, 255, 255));
        jLabel327.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel327.setText("Jugador 2");

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel72Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel327, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel327, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel57.add(jPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 210, 110));

        jPanel73.setBackground(new java.awt.Color(28, 51, 199));

        jLabel328.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel328.setForeground(new java.awt.Color(255, 255, 255));
        jLabel328.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel328.setText("Jugador 2");

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel73Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel328, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel328, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel57.add(jPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, 110));

        jPanel74.setBackground(new java.awt.Color(34, 62, 235));
        jPanel74.setForeground(new java.awt.Color(255, 255, 255));

        jLabel329.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel329.setForeground(new java.awt.Color(255, 255, 255));
        jLabel329.setText("Jugador 2");

        jLabel330.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel330.setForeground(new java.awt.Color(255, 255, 255));
        jLabel330.setText("Jugador 2");

        jLabel331.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel331.setForeground(new java.awt.Color(255, 255, 255));
        jLabel331.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel331.setText("VS");

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel74Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel330)
                .addGap(18, 18, 18)
                .addComponent(jLabel331, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel329)
                .addGap(21, 21, 21))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel74Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel329)
                    .addComponent(jLabel330)
                    .addComponent(jLabel331))
                .addContainerGap())
        );

        jPanel57.add(jPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 620, -1));

        jPanel83.setBackground(new java.awt.Color(16, 30, 117));

        jLabel303.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel303.setForeground(new java.awt.Color(255, 255, 255));
        jLabel303.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel303.setText("Jugador 7");

        jLabel304.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel304.setForeground(new java.awt.Color(255, 255, 255));
        jLabel304.setText("Jugador 2");

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel304)
                    .addComponent(jLabel303))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel83Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel304)
                .addGap(18, 18, 18)
                .addComponent(jLabel303)
                .addContainerGap())
        );

        jPanel57.add(jPanel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 40, -1, 130));

        jPanel84.setBackground(new java.awt.Color(0, 0, 255));

        jLabel305.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel305.setForeground(new java.awt.Color(255, 255, 255));
        jLabel305.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel305.setText("Jugador 7");

        jLabel306.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel306.setForeground(new java.awt.Color(255, 255, 255));
        jLabel306.setText("Jugador 2");

        jPanel85.setBackground(new java.awt.Color(16, 30, 117));

        jLabel307.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel307.setForeground(new java.awt.Color(255, 255, 255));
        jLabel307.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel307.setText("Jugador 7");

        jLabel308.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel308.setForeground(new java.awt.Color(255, 255, 255));
        jLabel308.setText("Jugador 2");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel308)
                    .addComponent(jLabel307))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel85Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel308)
                .addGap(18, 18, 18)
                .addComponent(jLabel307)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel306)
                    .addComponent(jLabel305))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel84Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel84Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel306)
                .addGap(18, 18, 18)
                .addComponent(jLabel305)
                .addContainerGap())
            .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel84Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel57.add(jPanel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 200, -1, -1));

        jPanel86.setBackground(new java.awt.Color(16, 30, 117));

        jLabel309.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel309.setForeground(new java.awt.Color(255, 255, 255));
        jLabel309.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel309.setText("Jugador 7");

        jLabel310.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel310.setForeground(new java.awt.Color(255, 255, 255));
        jLabel310.setText("Jugador 2");

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel310)
                    .addComponent(jLabel309))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel310)
                .addGap(18, 18, 18)
                .addComponent(jLabel309)
                .addContainerGap())
        );

        jPanel57.add(jPanel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 380, -1, -1));

        jPanel87.setBackground(new java.awt.Color(16, 30, 117));

        jLabel332.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel332.setForeground(new java.awt.Color(255, 255, 255));
        jLabel332.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel332.setText("Jugador 7");

        jLabel333.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel333.setForeground(new java.awt.Color(255, 255, 255));
        jLabel333.setText("Jugador 2");

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel333)
                    .addComponent(jLabel332))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel87Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel333)
                .addGap(18, 18, 18)
                .addComponent(jLabel332)
                .addContainerGap())
        );

        jPanel57.add(jPanel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 540, -1, -1));

        jPanel88.setBackground(new java.awt.Color(22, 40, 158));
        jPanel88.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel334.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel334.setForeground(new java.awt.Color(0, 0, 0));
        jLabel334.setText("Jugador 2");
        jPanel88.add(jLabel334, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel335.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel335.setForeground(new java.awt.Color(0, 0, 0));
        jLabel335.setText("Jugador 2");
        jPanel88.add(jLabel335, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel336.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel336.setForeground(new java.awt.Color(255, 255, 255));
        jLabel336.setText("Jugador 2");
        jPanel88.add(jLabel336, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 120, 160, -1));

        jLabel337.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel337.setForeground(new java.awt.Color(255, 255, 255));
        jLabel337.setText("Jugador 2");
        jPanel88.add(jLabel337, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 160, -1));

        jPanel57.add(jPanel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 80, 190, 210));

        jPanel89.setBackground(new java.awt.Color(22, 40, 158));
        jPanel89.setForeground(new java.awt.Color(0, 0, 255));
        jPanel89.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel338.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel338.setForeground(new java.awt.Color(255, 255, 255));
        jLabel338.setText("Jugador 2");
        jPanel89.add(jLabel338, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, 160, -1));

        jLabel339.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel339.setForeground(new java.awt.Color(255, 255, 255));
        jLabel339.setText("Jugador 2");
        jPanel89.add(jLabel339, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 30, 160, -1));

        jPanel57.add(jPanel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 430, 190, 210));

        jPanel90.setBackground(new java.awt.Color(28, 51, 199));

        jLabel340.setBackground(new java.awt.Color(28, 51, 199));
        jLabel340.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel340.setForeground(new java.awt.Color(255, 255, 255));
        jLabel340.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel340.setText("Jugador 2");

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel90Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel340, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel340, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel57.add(jPanel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 120, 210, 110));

        jPanel91.setBackground(new java.awt.Color(28, 51, 199));

        jLabel341.setBackground(new java.awt.Color(28, 51, 199));
        jLabel341.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel341.setForeground(new java.awt.Color(255, 255, 255));
        jLabel341.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel341.setText("Jugador 2");

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel91Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel341, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel341, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel57.add(jPanel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 480, -1, 110));

        jScrollPane37.setViewportView(jPanel57);

        jTabbedPane.addTab("tab3", jScrollPane37);

        jScrollPane38.setBorder(null);
        jScrollPane38.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane38.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setPreferredSize(new java.awt.Dimension(1669, 700));
        jPanel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel342.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogo.png"))); // NOI18N
        jPanel58.add(jLabel342, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jPanel75.setBackground(new java.awt.Color(16, 30, 117));

        jLabel343.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel343.setForeground(new java.awt.Color(255, 255, 255));
        jLabel343.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel343.setText("Jugador 7");

        jLabel344.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel344.setForeground(new java.awt.Color(255, 255, 255));
        jLabel344.setText("Jugador 2");

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel344)
                    .addComponent(jLabel343))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel75Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel344)
                .addGap(18, 18, 18)
                .addComponent(jLabel343)
                .addContainerGap())
        );

        jPanel58.add(jPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 130));

        jPanel76.setBackground(new java.awt.Color(0, 0, 255));

        jLabel345.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel345.setForeground(new java.awt.Color(255, 255, 255));
        jLabel345.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel345.setText("Jugador 7");

        jLabel346.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel346.setForeground(new java.awt.Color(255, 255, 255));
        jLabel346.setText("Jugador 2");

        jPanel77.setBackground(new java.awt.Color(16, 30, 117));

        jLabel347.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel347.setForeground(new java.awt.Color(255, 255, 255));
        jLabel347.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel347.setText("Jugador 7");

        jLabel348.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel348.setForeground(new java.awt.Color(255, 255, 255));
        jLabel348.setText("Jugador 2");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel348)
                    .addComponent(jLabel347))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel348)
                .addGap(18, 18, 18)
                .addComponent(jLabel347)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel346)
                    .addComponent(jLabel345))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel76Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel76Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel346)
                .addGap(18, 18, 18)
                .addComponent(jLabel345)
                .addContainerGap())
            .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel76Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel58.add(jPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jPanel78.setBackground(new java.awt.Color(16, 30, 117));

        jLabel349.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel349.setForeground(new java.awt.Color(255, 255, 255));
        jLabel349.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel349.setText("Jugador 7");

        jLabel350.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel350.setForeground(new java.awt.Color(255, 255, 255));
        jLabel350.setText("Jugador 2");

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel350)
                    .addComponent(jLabel349))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel78Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel350)
                .addGap(18, 18, 18)
                .addComponent(jLabel349)
                .addContainerGap())
        );

        jPanel58.add(jPanel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jPanel79.setBackground(new java.awt.Color(16, 30, 117));

        jLabel351.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel351.setForeground(new java.awt.Color(255, 255, 255));
        jLabel351.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel351.setText("Jugador 7");

        jLabel352.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel352.setForeground(new java.awt.Color(255, 255, 255));
        jLabel352.setText("Jugador 2");

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel352)
                    .addComponent(jLabel351))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel79Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel352)
                .addGap(18, 18, 18)
                .addComponent(jLabel351)
                .addContainerGap())
        );

        jPanel58.add(jPanel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        jPanel80.setBackground(new java.awt.Color(22, 40, 158));
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel353.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel353.setForeground(new java.awt.Color(0, 0, 0));
        jLabel353.setText("Jugador 2");
        jPanel80.add(jLabel353, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel354.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel354.setForeground(new java.awt.Color(0, 0, 0));
        jLabel354.setText("Jugador 2");
        jPanel80.add(jLabel354, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel355.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel355.setForeground(new java.awt.Color(255, 255, 255));
        jLabel355.setText("Jugador 2");
        jPanel80.add(jLabel355, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 120, 160, -1));

        jLabel356.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel356.setForeground(new java.awt.Color(255, 255, 255));
        jLabel356.setText("Jugador 2");
        jPanel80.add(jLabel356, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 160, -1));

        jPanel58.add(jPanel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 190, 210));

        jPanel81.setBackground(new java.awt.Color(22, 40, 158));
        jPanel81.setForeground(new java.awt.Color(0, 0, 255));
        jPanel81.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel357.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel357.setForeground(new java.awt.Color(255, 255, 255));
        jLabel357.setText("Jugador 2");
        jPanel81.add(jLabel357, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, 160, -1));

        jLabel358.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel358.setForeground(new java.awt.Color(255, 255, 255));
        jLabel358.setText("Jugador 2");
        jPanel81.add(jLabel358, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 30, 160, -1));

        jPanel58.add(jPanel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 190, 210));

        jPanel82.setBackground(new java.awt.Color(28, 51, 199));

        jLabel359.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel359.setForeground(new java.awt.Color(255, 255, 255));
        jLabel359.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel359.setText("Jugador 2");

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel82Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel359, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel359, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel58.add(jPanel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 210, 110));

        jPanel92.setBackground(new java.awt.Color(28, 51, 199));

        jLabel360.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel360.setForeground(new java.awt.Color(255, 255, 255));
        jLabel360.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel360.setText("Jugador 2");

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel360, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel360, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel58.add(jPanel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, 110));

        jPanel93.setBackground(new java.awt.Color(34, 62, 235));
        jPanel93.setForeground(new java.awt.Color(255, 255, 255));

        jLabel361.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel361.setForeground(new java.awt.Color(255, 255, 255));
        jLabel361.setText("Jugador 2");

        jLabel362.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel362.setForeground(new java.awt.Color(255, 255, 255));
        jLabel362.setText("Jugador 2");

        jLabel363.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel363.setForeground(new java.awt.Color(255, 255, 255));
        jLabel363.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel363.setText("VS");

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel93Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel362)
                .addGap(18, 18, 18)
                .addComponent(jLabel363, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel361)
                .addGap(21, 21, 21))
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel93Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel361)
                    .addComponent(jLabel362)
                    .addComponent(jLabel363))
                .addContainerGap())
        );

        jPanel58.add(jPanel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 620, -1));

        jPanel94.setBackground(new java.awt.Color(16, 30, 117));

        jLabel364.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel364.setForeground(new java.awt.Color(255, 255, 255));
        jLabel364.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel364.setText("Jugador 7");

        jLabel365.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel365.setForeground(new java.awt.Color(255, 255, 255));
        jLabel365.setText("Jugador 2");

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel365)
                    .addComponent(jLabel364))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel94Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel365)
                .addGap(18, 18, 18)
                .addComponent(jLabel364)
                .addContainerGap())
        );

        jPanel58.add(jPanel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 40, -1, 130));

        jPanel95.setBackground(new java.awt.Color(0, 0, 255));

        jLabel366.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel366.setForeground(new java.awt.Color(255, 255, 255));
        jLabel366.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel366.setText("Jugador 7");

        jLabel367.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel367.setForeground(new java.awt.Color(255, 255, 255));
        jLabel367.setText("Jugador 2");

        jPanel96.setBackground(new java.awt.Color(16, 30, 117));

        jLabel368.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel368.setForeground(new java.awt.Color(255, 255, 255));
        jLabel368.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel368.setText("Jugador 7");

        jLabel369.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel369.setForeground(new java.awt.Color(255, 255, 255));
        jLabel369.setText("Jugador 2");

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel369)
                    .addComponent(jLabel368))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel96Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel369)
                .addGap(18, 18, 18)
                .addComponent(jLabel368)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel367)
                    .addComponent(jLabel366))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel95Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel95Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel367)
                .addGap(18, 18, 18)
                .addComponent(jLabel366)
                .addContainerGap())
            .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel95Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel58.add(jPanel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 200, -1, -1));

        jPanel97.setBackground(new java.awt.Color(16, 30, 117));

        jLabel370.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel370.setForeground(new java.awt.Color(255, 255, 255));
        jLabel370.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel370.setText("Jugador 7");

        jLabel371.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel371.setForeground(new java.awt.Color(255, 255, 255));
        jLabel371.setText("Jugador 2");

        javax.swing.GroupLayout jPanel97Layout = new javax.swing.GroupLayout(jPanel97);
        jPanel97.setLayout(jPanel97Layout);
        jPanel97Layout.setHorizontalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel371)
                    .addComponent(jLabel370))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel97Layout.setVerticalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel97Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel371)
                .addGap(18, 18, 18)
                .addComponent(jLabel370)
                .addContainerGap())
        );

        jPanel58.add(jPanel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 380, -1, -1));

        jPanel98.setBackground(new java.awt.Color(16, 30, 117));

        jLabel372.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel372.setForeground(new java.awt.Color(255, 255, 255));
        jLabel372.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel372.setText("Jugador 7");

        jLabel373.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel373.setForeground(new java.awt.Color(255, 255, 255));
        jLabel373.setText("Jugador 2");

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel373)
                    .addComponent(jLabel372))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel98Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel373)
                .addGap(18, 18, 18)
                .addComponent(jLabel372)
                .addContainerGap())
        );

        jPanel58.add(jPanel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 540, -1, -1));

        jPanel99.setBackground(new java.awt.Color(22, 40, 158));
        jPanel99.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel374.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel374.setForeground(new java.awt.Color(0, 0, 0));
        jLabel374.setText("Jugador 2");
        jPanel99.add(jLabel374, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel375.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel375.setForeground(new java.awt.Color(0, 0, 0));
        jLabel375.setText("Jugador 2");
        jPanel99.add(jLabel375, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel376.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel376.setForeground(new java.awt.Color(255, 255, 255));
        jLabel376.setText("Jugador 2");
        jPanel99.add(jLabel376, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 120, 160, -1));

        jLabel377.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel377.setForeground(new java.awt.Color(255, 255, 255));
        jLabel377.setText("Jugador 2");
        jPanel99.add(jLabel377, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 160, -1));

        jPanel58.add(jPanel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 80, 190, 210));

        jPanel100.setBackground(new java.awt.Color(22, 40, 158));
        jPanel100.setForeground(new java.awt.Color(0, 0, 255));
        jPanel100.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel378.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel378.setForeground(new java.awt.Color(255, 255, 255));
        jLabel378.setText("Jugador 2");
        jPanel100.add(jLabel378, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, 160, -1));

        jLabel379.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel379.setForeground(new java.awt.Color(255, 255, 255));
        jLabel379.setText("Jugador 2");
        jPanel100.add(jLabel379, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 30, 160, -1));

        jPanel58.add(jPanel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 430, 190, 210));

        jPanel101.setBackground(new java.awt.Color(28, 51, 199));

        jLabel380.setBackground(new java.awt.Color(28, 51, 199));
        jLabel380.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel380.setForeground(new java.awt.Color(255, 255, 255));
        jLabel380.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel380.setText("Jugador 2");

        javax.swing.GroupLayout jPanel101Layout = new javax.swing.GroupLayout(jPanel101);
        jPanel101.setLayout(jPanel101Layout);
        jPanel101Layout.setHorizontalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel101Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel380, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel101Layout.setVerticalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel380, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel58.add(jPanel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 120, 210, 110));

        jPanel102.setBackground(new java.awt.Color(28, 51, 199));

        jLabel381.setBackground(new java.awt.Color(28, 51, 199));
        jLabel381.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel381.setForeground(new java.awt.Color(255, 255, 255));
        jLabel381.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel381.setText("Jugador 2");

        javax.swing.GroupLayout jPanel102Layout = new javax.swing.GroupLayout(jPanel102);
        jPanel102.setLayout(jPanel102Layout);
        jPanel102Layout.setHorizontalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel102Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel381, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel102Layout.setVerticalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel381, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel58.add(jPanel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 480, -1, 110));

        jScrollPane38.setViewportView(jPanel58);

        jTabbedPane.addTab("tab4", jScrollPane38);

        jScrollPane39.setBorder(null);
        jScrollPane39.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane39.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));
        jPanel59.setPreferredSize(new java.awt.Dimension(1396, 700));
        jPanel59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogo.png"))); // NOI18N
        jPanel59.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jPanel103.setBackground(new java.awt.Color(22, 40, 158));
        jPanel103.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel273.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel273.setForeground(new java.awt.Color(0, 0, 0));
        jLabel273.setText("Jugador 2");
        jPanel103.add(jLabel273, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel274.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel274.setForeground(new java.awt.Color(0, 0, 0));
        jLabel274.setText("Jugador 2");
        jPanel103.add(jLabel274, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel275.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel275.setForeground(new java.awt.Color(255, 255, 255));
        jLabel275.setText("Jugador 2");
        jPanel103.add(jLabel275, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 120, 160, -1));

        jLabel290.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel290.setForeground(new java.awt.Color(255, 255, 255));
        jLabel290.setText("Jugador 2");
        jPanel103.add(jLabel290, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 160, -1));

        jPanel59.add(jPanel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 190, 210));

        jPanel104.setBackground(new java.awt.Color(22, 40, 158));
        jPanel104.setForeground(new java.awt.Color(0, 0, 255));
        jPanel104.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel276.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel276.setForeground(new java.awt.Color(255, 255, 255));
        jLabel276.setText("Jugador 2");
        jPanel104.add(jLabel276, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, 160, -1));

        jLabel291.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel291.setForeground(new java.awt.Color(255, 255, 255));
        jLabel291.setText("Jugador 2");
        jPanel104.add(jLabel291, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 30, 160, -1));

        jPanel59.add(jPanel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 190, 210));

        jPanel105.setBackground(new java.awt.Color(28, 51, 199));

        jLabel277.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel277.setForeground(new java.awt.Color(255, 255, 255));
        jLabel277.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel277.setText("Jugador 2");

        javax.swing.GroupLayout jPanel105Layout = new javax.swing.GroupLayout(jPanel105);
        jPanel105.setLayout(jPanel105Layout);
        jPanel105Layout.setHorizontalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel105Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel277, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel105Layout.setVerticalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel277, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel59.add(jPanel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 210, 110));

        jPanel106.setBackground(new java.awt.Color(28, 51, 199));

        jLabel292.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel292.setForeground(new java.awt.Color(255, 255, 255));
        jLabel292.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel292.setText("Jugador 2");

        javax.swing.GroupLayout jPanel106Layout = new javax.swing.GroupLayout(jPanel106);
        jPanel106.setLayout(jPanel106Layout);
        jPanel106Layout.setHorizontalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel106Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel292, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel106Layout.setVerticalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel292, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel59.add(jPanel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, 110));

        jPanel107.setBackground(new java.awt.Color(34, 62, 235));
        jPanel107.setForeground(new java.awt.Color(255, 255, 255));

        jLabel293.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel293.setForeground(new java.awt.Color(255, 255, 255));
        jLabel293.setText("Jugador 2");

        jLabel294.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(255, 255, 255));
        jLabel294.setText("Jugador 2");

        jLabel295.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel295.setForeground(new java.awt.Color(255, 255, 255));
        jLabel295.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel295.setText("VS");

        javax.swing.GroupLayout jPanel107Layout = new javax.swing.GroupLayout(jPanel107);
        jPanel107.setLayout(jPanel107Layout);
        jPanel107Layout.setHorizontalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel107Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel294)
                .addGap(18, 18, 18)
                .addComponent(jLabel295, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel293)
                .addGap(21, 21, 21))
        );
        jPanel107Layout.setVerticalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel107Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel293)
                    .addComponent(jLabel294)
                    .addComponent(jLabel295))
                .addContainerGap())
        );

        jPanel59.add(jPanel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 620, -1));

        jPanel108.setBackground(new java.awt.Color(22, 40, 158));
        jPanel108.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel382.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel382.setForeground(new java.awt.Color(0, 0, 0));
        jLabel382.setText("Jugador 2");
        jPanel108.add(jLabel382, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel383.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel383.setForeground(new java.awt.Color(0, 0, 0));
        jLabel383.setText("Jugador 2");
        jPanel108.add(jLabel383, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel384.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel384.setForeground(new java.awt.Color(255, 255, 255));
        jLabel384.setText("Jugador 2");
        jPanel108.add(jLabel384, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 120, 160, -1));

        jLabel385.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel385.setForeground(new java.awt.Color(255, 255, 255));
        jLabel385.setText("Jugador 2");
        jPanel108.add(jLabel385, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 160, -1));

        jPanel59.add(jPanel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 70, 190, 210));

        jPanel109.setBackground(new java.awt.Color(22, 40, 158));
        jPanel109.setForeground(new java.awt.Color(0, 0, 255));
        jPanel109.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel386.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel386.setForeground(new java.awt.Color(255, 255, 255));
        jLabel386.setText("Jugador 2");
        jPanel109.add(jLabel386, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, 160, -1));

        jLabel387.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel387.setForeground(new java.awt.Color(255, 255, 255));
        jLabel387.setText("Jugador 2");
        jPanel109.add(jLabel387, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 30, 160, -1));

        jPanel59.add(jPanel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 420, 190, 210));

        jPanel110.setBackground(new java.awt.Color(28, 51, 199));

        jLabel388.setBackground(new java.awt.Color(28, 51, 199));
        jLabel388.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel388.setForeground(new java.awt.Color(255, 255, 255));
        jLabel388.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel388.setText("Jugador 2");

        javax.swing.GroupLayout jPanel110Layout = new javax.swing.GroupLayout(jPanel110);
        jPanel110.setLayout(jPanel110Layout);
        jPanel110Layout.setHorizontalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel110Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel388, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel110Layout.setVerticalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel388, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel59.add(jPanel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 210, 110));

        jPanel111.setBackground(new java.awt.Color(28, 51, 199));

        jLabel389.setBackground(new java.awt.Color(28, 51, 199));
        jLabel389.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel389.setForeground(new java.awt.Color(255, 255, 255));
        jLabel389.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel389.setText("Jugador 2");

        javax.swing.GroupLayout jPanel111Layout = new javax.swing.GroupLayout(jPanel111);
        jPanel111.setLayout(jPanel111Layout);
        jPanel111Layout.setHorizontalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel111Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel389, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel111Layout.setVerticalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel389, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel59.add(jPanel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 470, -1, 110));

        jScrollPane39.setViewportView(jPanel59);

        jTabbedPane.addTab("tab5", jScrollPane39);

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setPreferredSize(new java.awt.Dimension(1106, 700));
        jPanel63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel289.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogo.png"))); // NOI18N
        jPanel63.add(jLabel289, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jPanel112.setBackground(new java.awt.Color(28, 51, 199));

        jLabel390.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel390.setForeground(new java.awt.Color(255, 255, 255));
        jLabel390.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel390.setText("Jugador 2");

        javax.swing.GroupLayout jPanel112Layout = new javax.swing.GroupLayout(jPanel112);
        jPanel112.setLayout(jPanel112Layout);
        jPanel112Layout.setHorizontalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel112Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel390, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel112Layout.setVerticalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel390, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel63.add(jPanel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 110));

        jPanel113.setBackground(new java.awt.Color(28, 51, 199));

        jLabel391.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel391.setForeground(new java.awt.Color(255, 255, 255));
        jLabel391.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel391.setText("Jugador 2");

        javax.swing.GroupLayout jPanel113Layout = new javax.swing.GroupLayout(jPanel113);
        jPanel113.setLayout(jPanel113Layout);
        jPanel113Layout.setHorizontalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel113Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel391, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel113Layout.setVerticalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel391, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel63.add(jPanel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, 110));

        jPanel114.setBackground(new java.awt.Color(34, 62, 235));
        jPanel114.setForeground(new java.awt.Color(255, 255, 255));

        jLabel392.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel392.setForeground(new java.awt.Color(255, 255, 255));
        jLabel392.setText("Jugador 2");

        jLabel393.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel393.setForeground(new java.awt.Color(255, 255, 255));
        jLabel393.setText("Jugador 2");

        jLabel394.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel394.setForeground(new java.awt.Color(255, 255, 255));
        jLabel394.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel394.setText("VS");

        javax.swing.GroupLayout jPanel114Layout = new javax.swing.GroupLayout(jPanel114);
        jPanel114.setLayout(jPanel114Layout);
        jPanel114Layout.setHorizontalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel114Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel393)
                .addGap(18, 18, 18)
                .addComponent(jLabel394, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel392)
                .addGap(21, 21, 21))
        );
        jPanel114Layout.setVerticalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel114Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel392)
                    .addComponent(jLabel393)
                    .addComponent(jLabel394))
                .addContainerGap())
        );

        jPanel63.add(jPanel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 620, -1));

        jPanel115.setBackground(new java.awt.Color(28, 51, 199));

        jLabel395.setBackground(new java.awt.Color(28, 51, 199));
        jLabel395.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel395.setForeground(new java.awt.Color(255, 255, 255));
        jLabel395.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel395.setText("Jugador 2");

        javax.swing.GroupLayout jPanel115Layout = new javax.swing.GroupLayout(jPanel115);
        jPanel115.setLayout(jPanel115Layout);
        jPanel115Layout.setHorizontalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel115Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel395, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel115Layout.setVerticalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel395, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel63.add(jPanel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 210, 110));

        jPanel116.setBackground(new java.awt.Color(28, 51, 199));

        jLabel396.setBackground(new java.awt.Color(28, 51, 199));
        jLabel396.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        jLabel396.setForeground(new java.awt.Color(255, 255, 255));
        jLabel396.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel396.setText("Jugador 2");

        javax.swing.GroupLayout jPanel116Layout = new javax.swing.GroupLayout(jPanel116);
        jPanel116.setLayout(jPanel116Layout);
        jPanel116Layout.setHorizontalGroup(
            jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel116Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel396, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel116Layout.setVerticalGroup(
            jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel396, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel63.add(jPanel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, -1, 110));

        jTabbedPane.addTab("tab6", jPanel63);

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setPreferredSize(new java.awt.Dimension(1106, 700));
        jPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel296.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogo.png"))); // NOI18N
        jPanel64.add(jLabel296, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jPanel117.setBackground(new java.awt.Color(34, 62, 235));
        jPanel117.setForeground(new java.awt.Color(255, 255, 255));

        jLabel397.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel397.setForeground(new java.awt.Color(255, 255, 255));
        jLabel397.setText("Jugador 2");

        jLabel398.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel398.setForeground(new java.awt.Color(255, 255, 255));
        jLabel398.setText("Jugador 2");

        jLabel399.setFont(new java.awt.Font("Bebas Neue", 0, 70)); // NOI18N
        jLabel399.setForeground(new java.awt.Color(255, 255, 255));
        jLabel399.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel399.setText("VS");

        javax.swing.GroupLayout jPanel117Layout = new javax.swing.GroupLayout(jPanel117);
        jPanel117.setLayout(jPanel117Layout);
        jPanel117Layout.setHorizontalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel117Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel398)
                .addGap(18, 18, 18)
                .addComponent(jLabel399, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel397)
                .addGap(21, 21, 21))
        );
        jPanel117Layout.setVerticalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel117Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel397)
                    .addComponent(jLabel398)
                    .addComponent(jLabel399))
                .addContainerGap())
        );

        jPanel64.add(jPanel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 620, -1));

        jTabbedPane.addTab("tab7", jPanel64);

        jPanel1.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1040, 760));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BannerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BannerMouseClicked

    }//GEN-LAST:event_BannerMouseClicked

    private void botonSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalidaMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_botonMinimizarMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPlayOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPlayOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPlayOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPlayOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPlayOff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JLabel botonSalida;
    private javax.swing.JLabel iconoSuperior;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel360;
    private javax.swing.JLabel jLabel361;
    private javax.swing.JLabel jLabel362;
    private javax.swing.JLabel jLabel363;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel367;
    private javax.swing.JLabel jLabel368;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel396;
    private javax.swing.JLabel jLabel397;
    private javax.swing.JLabel jLabel398;
    private javax.swing.JLabel jLabel399;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel tituloSuperior;
    // End of variables declaration//GEN-END:variables
}
