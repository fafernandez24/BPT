/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.MatchJsonControl;
import static controller.MenuOrganizatorControl.CreateTournament;
import static controller.MenuOrganizatorControl.GetUpTournamentFromPartOne;
import static controller.MenuOrganizatorControl.changeButtonColor;
import static controller.MenuOrganizatorControl.changePanelColor;
import static controller.MenuOrganizatorControl.deleteMatch;
import static controller.MenuOrganizatorControl.foundMatch;
import static controller.MenuOrganizatorControl.loadMatchesInTable;
import static controller.MenuOrganizatorControl.loadTournamentTypeFive;
import static controller.MenuOrganizatorControl.loadTournamentTypeFour;
import static controller.MenuOrganizatorControl.loadTournamentTypeOne;
import static controller.MenuOrganizatorControl.loadTournamentTypeThree;
import static controller.MenuOrganizatorControl.loadTournamentTypeTwo;
import static controller.MenuOrganizatorControl.loadTournamentTypeZero;
import static controller.MenuOrganizatorControl.organizatorFocusGained;
import static controller.MenuOrganizatorControl.organizatorFocusLost;
import static controller.MenuOrganizatorControl.organizatorGetNumberOfGroupsJComboBox;
import static controller.MenuOrganizatorControl.organizatorSeeTournament;
import static controller.MenuOrganizatorControl.organizatorTabbedPanelSeeTournaments;
import static controller.MenuOrganizatorControl.whichTournamentShow;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import model.Organizator;
import model.DoubleTennis;
import model.Player;
import model.Tournament;
import static controller.MenuOrganizatorControl.organizatorCleanTable;
import static controller.MenuOrganizatorControl.saveDataPlayerTable;
import static controller.MenuOrganizatorControl.showTournamentName;
import model.Group;
import model.Match;
import model.Team;

public class MenuOrganizator extends javax.swing.JFrame {
        
    // JSON
    private final MatchJsonControl jsonMatch = new MatchJsonControl();

    // Atributtes
      
    private int opcionCrearTorneo = 0; // 1: single, 2: dobles, 3: equipos
    private final Organizator organizator;
    private Tournament newTournament = new Tournament();
    private final List<Match> matchList = jsonMatch.allMatches();
    private Tournament currentTournament = new Tournament();
    
    //////////////////

    /**
     * Creates new form Organizator
     * @param organizator
     */
    public MenuOrganizator(Organizator organizator) {
        this.organizator = organizator;
        this.setUndecorated(true);
        initComponents();
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.newIcon();
        loadMatchesInTable(matchList, tablaPartidos);
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
        jPanel4 = new javax.swing.JPanel();
        NombreOrganizador = new javax.swing.JLabel();
        IconoCalendario = new javax.swing.JLabel();
        botonMenuCrearTorneo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonMenuVerTorneos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botonMenuBuscarJugador = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        iconoSuperior = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();
        pestania = new javax.swing.JTabbedPane();
        jPanel25 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        botonCrearTorneoDoble = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        botonCrearTorneoEquipo = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        botonCrearTorneoSingle = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        verTorneo2 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        verTorneo3 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        verTorneo1 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        verTorneo5 = new javax.swing.JPanel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        verTorneo6 = new javax.swing.JPanel();
        jLabel168 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        verTorneo4 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        verTorneo8 = new javax.swing.JPanel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        verTorneo9 = new javax.swing.JPanel();
        jLabel182 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        verTorneo7 = new javax.swing.JPanel();
        jLabel185 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        verTorneo11 = new javax.swing.JPanel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        verTorneo12 = new javax.swing.JPanel();
        jLabel196 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        verTorneo10 = new javax.swing.JPanel();
        jLabel199 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        verTorneo14 = new javax.swing.JPanel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        verTorneo15 = new javax.swing.JPanel();
        jLabel210 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        verTorneo13 = new javax.swing.JPanel();
        jLabel213 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        verTorneo17 = new javax.swing.JPanel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        verTorneo18 = new javax.swing.JPanel();
        jLabel224 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        verTorneo16 = new javax.swing.JPanel();
        jLabel227 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        verTorneo20 = new javax.swing.JPanel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        verTorneo21 = new javax.swing.JPanel();
        jLabel238 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        verTorneo19 = new javax.swing.JPanel();
        jLabel241 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        searchTab = new javax.swing.JScrollPane();
        jPanel31 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jScrollPane38 = new javax.swing.JScrollPane();
        playersListTable = new javax.swing.JTable();
        bottomSearchPlayer = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        jLabel288 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        IconoCalendario2 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        showDateBirth = new javax.swing.JTextField();
        showEmail = new javax.swing.JTextField();
        showPlayerName = new javax.swing.JTextField();
        showTeam = new javax.swing.JTextField();
        showId = new javax.swing.JTextField();
        showMatchWon = new javax.swing.JTextField();
        showCategory = new javax.swing.JTextField();
        showMatchPlayed = new javax.swing.JTextField();
        jLabel301 = new javax.swing.JLabel();
        showPhoneNumber = new javax.swing.JTextField();
        jLabel302 = new javax.swing.JLabel();
        jSeparator80 = new javax.swing.JSeparator();
        jLabel303 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPartidos = new javax.swing.JTable();
        botonAgregarPartido = new javax.swing.JButton();
        botonEliminarPartido = new javax.swing.JButton();
        botonModificarPartido = new javax.swing.JButton();
        calendar1 = new raven.calendar.Calendar();
        pestaniaCrearTorneoInicio = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        entradaNombreTorneo = new javax.swing.JTextField();
        pestaniaCrearTorneoInicio1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        entradaCostoTorneo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        entradaCantidadJugadores = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        botonSeguirIngresarDatosTorneo = new javax.swing.JButton();
        botonRegresarIngresarDatosTorneo = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        ingresarRondaEliminacionDirecta = new javax.swing.JComboBox<>();
        ingresarRondaEliminacionDirecta3 = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        entradaNombreJugador = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        entradaIDJugador = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        entradaNumeroTelefonoJugador = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        entradaEmailJugador = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        entradaEquipoJugador = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        entradaFechaNacimientoJugador = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados = new javax.swing.JTable();
        botonRegresarIngresarDatosSingle = new javax.swing.JButton();
        botonAgregarJugador = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        botonSeguirIngresarJugador = new javax.swing.JButton();
        opcionesCategoriaJugador = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        entradaNombreJugadorA = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        entradaIdJugadorA = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        entradaNumeroTelefonoJugadorA = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        entradaEmailJugadorA = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        entradaEquipoJugadorA = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        entradaFechaNacimientoJugadorA = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        botonRegresarIngresarDatosDobles = new javax.swing.JButton();
        botonAgregarJugadoresDupla = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        botonSeguirDuplas = new javax.swing.JButton();
        jSeparator29 = new javax.swing.JSeparator();
        entradaNombreJugadorB = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        entradaIdJugadorB = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        jSeparator31 = new javax.swing.JSeparator();
        entradaNumeroTelefonoJugadorB = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        entradaEmailJugadorB = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        entradaEquipoJugadorB = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        entradaFechaNacimientoJugadorB = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        opcionesCategoriaJugadorA = new javax.swing.JComboBox<>();
        opcionesCategoriaJugadorB = new javax.swing.JComboBox<>();
        jScrollPane37 = new javax.swing.JScrollPane();
        tablaDuplasAgregadas = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jSeparator33 = new javax.swing.JSeparator();
        entradaNombreCapitan = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        entradaCedulaCapitan = new javax.swing.JTextField();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel106 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        entradaNumeroTelefonoCapitan = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jSeparator38 = new javax.swing.JSeparator();
        entradaCorreoCapitan = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jSeparator41 = new javax.swing.JSeparator();
        entradaNombreEquipo = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaEquiposAgregados = new javax.swing.JTable();
        botonRegresarIngresarDatosEquipo = new javax.swing.JButton();
        botonAgregarEquipo = new javax.swing.JButton();
        jLabel113 = new javax.swing.JLabel();
        botonSeguirEquipo = new javax.swing.JButton();
        jSeparator42 = new javax.swing.JSeparator();
        entradaFechaNacimientoCapitan = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        opcionesCategoriaCapitan = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        botonConfigurarFaseGrupos = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        botonTorneoMuerteSubita = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        botonFormatoLiga = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        entradaCantidadJugadoresPorGrupo = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        ingresarCantidadDeGrupos = new javax.swing.JComboBox<>();
        botonSeguirFaseGrupos = new javax.swing.JButton();
        botonRegresarConfigurarFaseGrupos = new javax.swing.JButton();
        jLabel138 = new javax.swing.JLabel();
        entradaCantidadJugadoresEliminacionDirecta = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane36 = new javax.swing.JScrollPane();
        tablaGeneralLiga = new javax.swing.JTable();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel134 = new javax.swing.JLabel();
        nombreTorneoCero = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        actuGeneralTable = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados1 = new javax.swing.JTable();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel139 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados2 = new javax.swing.JTable();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel140 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados3 = new javax.swing.JTable();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel144 = new javax.swing.JLabel();
        nombreTorneoUno = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        actuGeneralTableUno = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel18 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados4 = new javax.swing.JTable();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel245 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados5 = new javax.swing.JTable();
        jSeparator43 = new javax.swing.JSeparator();
        jLabel246 = new javax.swing.JLabel();
        nombreTorneoDos = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados7 = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados8 = new javax.swing.JTable();
        jSeparator44 = new javax.swing.JSeparator();
        jLabel250 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados9 = new javax.swing.JTable();
        jSeparator45 = new javax.swing.JSeparator();
        jLabel251 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados6 = new javax.swing.JTable();
        jSeparator46 = new javax.swing.JSeparator();
        jLabel252 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados10 = new javax.swing.JTable();
        jSeparator47 = new javax.swing.JSeparator();
        jLabel253 = new javax.swing.JLabel();
        nombreTorneoTres = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados11 = new javax.swing.JTable();
        jScrollPane23 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados12 = new javax.swing.JTable();
        jSeparator48 = new javax.swing.JSeparator();
        jLabel257 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados13 = new javax.swing.JTable();
        jSeparator49 = new javax.swing.JSeparator();
        jLabel258 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados14 = new javax.swing.JTable();
        jSeparator50 = new javax.swing.JSeparator();
        jLabel259 = new javax.swing.JLabel();
        actuGeneralTableUno1 = new javax.swing.JButton();
        jScrollPane26 = new javax.swing.JScrollPane();
        jPanel33 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados15 = new javax.swing.JTable();
        jSeparator51 = new javax.swing.JSeparator();
        jLabel260 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados16 = new javax.swing.JTable();
        jSeparator52 = new javax.swing.JSeparator();
        jLabel261 = new javax.swing.JLabel();
        nombreTorneoCuatro = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados17 = new javax.swing.JTable();
        jScrollPane30 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados18 = new javax.swing.JTable();
        jSeparator53 = new javax.swing.JSeparator();
        jLabel265 = new javax.swing.JLabel();
        jSeparator54 = new javax.swing.JSeparator();
        jLabel266 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados20 = new javax.swing.JTable();
        jSeparator55 = new javax.swing.JSeparator();
        jLabel267 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados21 = new javax.swing.JTable();
        jScrollPane33 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados22 = new javax.swing.JTable();
        jSeparator56 = new javax.swing.JSeparator();
        jLabel268 = new javax.swing.JLabel();
        actuGeneralTableUno2 = new javax.swing.JButton();
        jScrollPane43 = new javax.swing.JScrollPane();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jScrollPane44 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados19 = new javax.swing.JTable();
        jSeparator63 = new javax.swing.JSeparator();
        jLabel278 = new javax.swing.JLabel();
        jScrollPane45 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados23 = new javax.swing.JTable();
        jSeparator64 = new javax.swing.JSeparator();
        jLabel279 = new javax.swing.JLabel();
        nombreTorneoCinco = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jScrollPane46 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados24 = new javax.swing.JTable();
        jScrollPane47 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados25 = new javax.swing.JTable();
        jSeparator65 = new javax.swing.JSeparator();
        jLabel283 = new javax.swing.JLabel();
        jSeparator66 = new javax.swing.JSeparator();
        jLabel284 = new javax.swing.JLabel();
        jScrollPane48 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados26 = new javax.swing.JTable();
        jSeparator67 = new javax.swing.JSeparator();
        jLabel285 = new javax.swing.JLabel();
        jScrollPane49 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados27 = new javax.swing.JTable();
        jScrollPane34 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados28 = new javax.swing.JTable();
        jSeparator68 = new javax.swing.JSeparator();
        jLabel286 = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados29 = new javax.swing.JTable();
        jSeparator69 = new javax.swing.JSeparator();
        jLabel287 = new javax.swing.JLabel();
        actuGeneralTableUno3 = new javax.swing.JButton();

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
        tituloSuperior.setText("CREAR TORNEO");
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

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreOrganizador.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        NombreOrganizador.setForeground(new java.awt.Color(255, 255, 255));
        NombreOrganizador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreOrganizador.setText(organizator.getName());
        NombreOrganizador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NombreOrganizadorMouseMoved(evt);
            }
        });
        NombreOrganizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NombreOrganizadorMouseExited(evt);
            }
        });
        jPanel4.add(NombreOrganizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 120, -1));

        IconoCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fotoPerfilPequenio.png"))); // NOI18N
        jPanel4.add(IconoCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 230, 200));

        botonMenuCrearTorneo.setBackground(new java.awt.Color(204, 204, 255));
        botonMenuCrearTorneo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonMenuCrearTorneoMouseMoved(evt);
            }
        });
        botonMenuCrearTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMenuCrearTorneoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMenuCrearTorneoMouseExited(evt);
            }
        });
        botonMenuCrearTorneo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneo.png"))); // NOI18N
        botonMenuCrearTorneo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CREAR TORNEO");
        botonMenuCrearTorneo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        jPanel4.add(botonMenuCrearTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 360, 60));

        botonMenuVerTorneos.setBackground(new java.awt.Color(204, 204, 255));
        botonMenuVerTorneos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonMenuVerTorneosMouseMoved(evt);
            }
        });
        botonMenuVerTorneos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMenuVerTorneosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMenuVerTorneosMouseExited(evt);
            }
        });
        botonMenuVerTorneos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneoEnCurso.png"))); // NOI18N
        botonMenuVerTorneos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        jLabel9.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("VER TORNEOS EN CURSO");
        botonMenuVerTorneos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        jPanel4.add(botonMenuVerTorneos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 360, 60));

        botonMenuBuscarJugador.setBackground(new java.awt.Color(204, 204, 255));
        botonMenuBuscarJugador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonMenuBuscarJugadorMouseMoved(evt);
            }
        });
        botonMenuBuscarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMenuBuscarJugadorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMenuBuscarJugadorMouseExited(evt);
            }
        });
        botonMenuBuscarJugador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoBuscarJugadorPequenio.png"))); // NOI18N
        botonMenuBuscarJugador.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        jLabel11.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("BUSCAR JUGADOR");
        botonMenuBuscarJugador.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        jPanel4.add(botonMenuBuscarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 360, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 370, 280));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 780));

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

        iconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneoMasGrande.png"))); // NOI18N
        jPanel1.add(iconoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 80));

        Banner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.jpg"))); // NOI18N
        Banner.setText("jLabel1");
        Banner.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Banner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BannerMouseClicked(evt);
            }
        });
        jPanel1.add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1030, 90));

        pestania.setBackground(new java.awt.Color(255, 255, 255));

        jPanel25.setBackground(new java.awt.Color(250, 250, 250));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel25.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel76.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(153, 153, 153));
        jLabel76.setText("EQUIPOS");
        jPanel25.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, 60));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dobleAzul.jpeg"))); // NOI18N
        jLabel56.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel25.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 230, 150));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/djocovikAzul.jpg"))); // NOI18N
        jLabel77.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel25.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 230, 150));

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/equipoTenis.jpg"))); // NOI18N
        jLabel78.setToolTipText("");
        jLabel78.setAutoscrolls(true);
        jPanel25.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 230, 150));

        jLabel79.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(153, 153, 153));
        jLabel79.setText("como organizador TE INVITO A creaR un torneo...");
        jPanel25.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 60));

        jLabel80.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(153, 153, 153));
        jLabel80.setText("DOBLES");
        jPanel25.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 60));

        jLabel81.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(153, 153, 153));
        jLabel81.setText("SINGLES");
        jPanel25.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 60));

        botonCrearTorneoDoble.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoDoble.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDobleMouseMoved(evt);
            }
        });
        botonCrearTorneoDoble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDobleMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDobleMouseExited(evt);
            }
        });
        botonCrearTorneoDoble.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("CREAR TORNEO");
        botonCrearTorneoDoble.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel25.add(botonCrearTorneoDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 130, 40));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel25.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 315, 389));

        botonCrearTorneoEquipo.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoEquipo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipoMouseMoved(evt);
            }
        });
        botonCrearTorneoEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipoMouseExited(evt);
            }
        });
        botonCrearTorneoEquipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel94.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("CREAR TORNEO");
        botonCrearTorneoEquipo.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel34.setBackground(new java.awt.Color(30, 25, 161));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel95.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("CREAR TORNEO");
        jPanel34.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoEquipo.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel25.add(botonCrearTorneoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 130, 40));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel25.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 315, 389));

        botonCrearTorneoSingle.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoSingle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingleMouseMoved(evt);
            }
        });
        botonCrearTorneoSingle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingleMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingleMouseExited(evt);
            }
        });
        botonCrearTorneoSingle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel96.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("CREAR TORNEO");
        botonCrearTorneoSingle.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel36.setBackground(new java.awt.Color(30, 25, 161));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("CREAR TORNEO");
        jPanel36.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoSingle.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel25.add(botonCrearTorneoSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 130, 40));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel25.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 315, 389));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel25.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        pestania.addTab("main", jPanel25);

        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setToolTipText("");
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel132.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(153, 153, 153));
        jLabel132.setText("Ver torneos en curso...");
        jPanel15.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 60));

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel15.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel92.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(153, 153, 153));
        jLabel92.setText("TORNEO #3");
        jPanel15.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, 60));

        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alcaraz.jpeg"))); // NOI18N
        jLabel147.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 230, 180));

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FotoSuperiorTenista.jpg"))); // NOI18N
        jLabel148.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 240, 150));

        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/djocovik celebrando.jpg"))); // NOI18N
        jLabel149.setToolTipText("");
        jLabel149.setAutoscrolls(true);
        jPanel15.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 230, 150));

        jLabel150.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(153, 153, 153));
        jLabel150.setText("TORNEO #2");
        jPanel15.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 60));

        jLabel151.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(153, 153, 153));
        jLabel151.setText("TORNEO #1");
        jPanel15.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 60));

        verTorneo2.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo2MouseMoved(evt);
            }
        });
        verTorneo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo2MouseExited(evt);
            }
        });
        verTorneo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel152.setBackground(new java.awt.Color(255, 255, 255));
        jLabel152.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel152.setText("VER TORNEO");
        jLabel152.setToolTipText("");
        verTorneo2.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(verTorneo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 130, 40));

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 315, 389));

        verTorneo3.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo3MouseMoved(evt);
            }
        });
        verTorneo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo3MouseExited(evt);
            }
        });
        verTorneo3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel154.setBackground(new java.awt.Color(255, 255, 255));
        jLabel154.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel154.setText("VER TORNEO");
        jLabel154.setToolTipText("");
        verTorneo3.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel38.setBackground(new java.awt.Color(30, 25, 161));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel155.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setText("CREAR TORNEO");
        jPanel38.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo3.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 130, 40));

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 315, 389));

        verTorneo1.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo1MouseMoved(evt);
            }
        });
        verTorneo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo1MouseExited(evt);
            }
        });
        verTorneo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel157.setBackground(new java.awt.Color(255, 255, 255));
        jLabel157.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel157.setText("VER TORNEO");
        jLabel157.setToolTipText("");
        verTorneo1.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel39.setBackground(new java.awt.Color(30, 25, 161));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel158.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setText("CREAR TORNEO");
        jPanel39.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo1.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 130, 40));

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 315, 389));

        jLabel160.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(153, 153, 153));
        jLabel160.setText("TORNEO #6");
        jPanel15.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 810, -1, 60));

        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cocoRolandGarros.png"))); // NOI18N
        jLabel161.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 230, 180));

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SteffiGraf.jpg"))); // NOI18N
        jLabel162.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 240, 150));

        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dobleTennisHierba.jpg"))); // NOI18N
        jLabel163.setToolTipText("");
        jLabel163.setAutoscrolls(true);
        jPanel15.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 230, 150));

        jLabel164.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(153, 153, 153));
        jLabel164.setText("TORNEO #5");
        jPanel15.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 810, -1, 60));

        jLabel165.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(153, 153, 153));
        jLabel165.setText("TORNEO #4");
        jPanel15.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 810, -1, 60));

        verTorneo5.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo5MouseMoved(evt);
            }
        });
        verTorneo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo5MouseExited(evt);
            }
        });
        verTorneo5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel166.setBackground(new java.awt.Color(255, 255, 255));
        jLabel166.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel166.setText("VER TORNEO");
        jLabel166.setToolTipText("");
        verTorneo5.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(verTorneo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 940, 130, 40));

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 315, 389));

        verTorneo6.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo6MouseMoved(evt);
            }
        });
        verTorneo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo6MouseExited(evt);
            }
        });
        verTorneo6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel168.setBackground(new java.awt.Color(255, 255, 255));
        jLabel168.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel168.setText("VER TORNEO");
        jLabel168.setToolTipText("");
        verTorneo6.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel40.setBackground(new java.awt.Color(30, 25, 161));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel169.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setText("CREAR TORNEO");
        jPanel40.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo6.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 940, 130, 40));

        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 315, 389));

        verTorneo4.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo4MouseMoved(evt);
            }
        });
        verTorneo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo4MouseExited(evt);
            }
        });
        verTorneo4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel171.setBackground(new java.awt.Color(255, 255, 255));
        jLabel171.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(255, 255, 255));
        jLabel171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel171.setText("VER TORNEO");
        jLabel171.setToolTipText("");
        verTorneo4.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel41.setBackground(new java.awt.Color(30, 25, 161));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel172.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setText("CREAR TORNEO");
        jPanel41.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo4.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 940, 130, 40));

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 315, 389));

        jLabel174.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(153, 153, 153));
        jLabel174.setText("TORNEO #9");
        jPanel15.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1240, -1, 60));

        jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/djocovikReves.jpeg"))); // NOI18N
        jLabel175.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1080, 230, 180));

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doblesFedererLaverCup.jpeg"))); // NOI18N
        jLabel176.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1080, 240, 150));

        jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doblesFemenino.jpg"))); // NOI18N
        jLabel177.setToolTipText("");
        jLabel177.setAutoscrolls(true);
        jPanel15.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1080, 230, 150));

        jLabel178.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(153, 153, 153));
        jLabel178.setText("TORNEO #8");
        jPanel15.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1240, -1, 60));

        jLabel179.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(153, 153, 153));
        jLabel179.setText("TORNEO #7");
        jPanel15.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1240, -1, 60));

        verTorneo8.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo8MouseMoved(evt);
            }
        });
        verTorneo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo8MouseExited(evt);
            }
        });
        verTorneo8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel180.setBackground(new java.awt.Color(255, 255, 255));
        jLabel180.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel180.setText("VER TORNEO");
        jLabel180.setToolTipText("");
        verTorneo8.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(verTorneo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1370, 130, 40));

        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1050, 315, 389));

        verTorneo9.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo9MouseMoved(evt);
            }
        });
        verTorneo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo9MouseExited(evt);
            }
        });
        verTorneo9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel182.setBackground(new java.awt.Color(255, 255, 255));
        jLabel182.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(255, 255, 255));
        jLabel182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel182.setText("VER TORNEO");
        jLabel182.setToolTipText("");
        verTorneo9.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel42.setBackground(new java.awt.Color(30, 25, 161));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel183.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setText("CREAR TORNEO");
        jPanel42.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo9.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1370, 130, 40));

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 1050, 315, 389));

        verTorneo7.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo7MouseMoved(evt);
            }
        });
        verTorneo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo7MouseExited(evt);
            }
        });
        verTorneo7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel185.setBackground(new java.awt.Color(255, 255, 255));
        jLabel185.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(255, 255, 255));
        jLabel185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel185.setText("VER TORNEO");
        jLabel185.setToolTipText("");
        verTorneo7.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel43.setBackground(new java.awt.Color(30, 25, 161));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel186.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setText("CREAR TORNEO");
        jPanel43.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo7.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1370, 130, 40));

        jLabel187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1050, 315, 389));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 900, 20));

        jLabel188.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(153, 153, 153));
        jLabel188.setText("TORNEO #12");
        jPanel15.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1660, -1, 60));

        jLabel189.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/federerUSOpen.jpg"))); // NOI18N
        jLabel189.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1500, 230, 180));

        jLabel190.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doblesMixto.jpg"))); // NOI18N
        jLabel190.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1500, 240, 150));

        jLabel191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/golpeRevesJugador.jpeg"))); // NOI18N
        jLabel191.setToolTipText("");
        jLabel191.setAutoscrolls(true);
        jPanel15.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1500, 230, 150));

        jLabel192.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(153, 153, 153));
        jLabel192.setText("TORNEO #11");
        jPanel15.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1660, -1, 60));

        jLabel193.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(153, 153, 153));
        jLabel193.setText("TORNEO #10");
        jPanel15.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1660, -1, 60));

        verTorneo11.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo11MouseMoved(evt);
            }
        });
        verTorneo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo11MouseExited(evt);
            }
        });
        verTorneo11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel194.setBackground(new java.awt.Color(255, 255, 255));
        jLabel194.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(255, 255, 255));
        jLabel194.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel194.setText("VER TORNEO");
        jLabel194.setToolTipText("");
        verTorneo11.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(verTorneo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1790, 130, 40));

        jLabel195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1470, 315, 389));

        verTorneo12.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo12MouseMoved(evt);
            }
        });
        verTorneo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo12MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo12MouseExited(evt);
            }
        });
        verTorneo12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel196.setBackground(new java.awt.Color(255, 255, 255));
        jLabel196.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(255, 255, 255));
        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel196.setText("VER TORNEO");
        jLabel196.setToolTipText("");
        verTorneo12.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel44.setBackground(new java.awt.Color(30, 25, 161));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel197.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel197.setText("CREAR TORNEO");
        jPanel44.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo12.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1790, 130, 40));

        jLabel198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 1470, 315, 389));

        verTorneo10.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo10MouseMoved(evt);
            }
        });
        verTorneo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo10MouseExited(evt);
            }
        });
        verTorneo10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel199.setBackground(new java.awt.Color(255, 255, 255));
        jLabel199.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel199.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel199.setText("VER TORNEO");
        jLabel199.setToolTipText("");
        verTorneo10.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel45.setBackground(new java.awt.Color(30, 25, 161));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel200.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(255, 255, 255));
        jLabel200.setText("CREAR TORNEO");
        jPanel45.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo10.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1790, 130, 40));

        jLabel201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1470, 315, 389));

        jLabel202.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(153, 153, 153));
        jLabel202.setText("TORNEO #15");
        jPanel15.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2090, -1, 60));

        jLabel203.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rafavsfedererWimbledon.jpg"))); // NOI18N
        jLabel203.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1930, 230, 180));

        jLabel204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rafaNadalRolandGarros.jpg"))); // NOI18N
        jLabel204.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1930, 240, 150));

        jLabel205.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/runeCara.jpeg"))); // NOI18N
        jLabel205.setToolTipText("");
        jLabel205.setAutoscrolls(true);
        jPanel15.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1930, 230, 150));

        jLabel206.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(153, 153, 153));
        jLabel206.setText("TORNEO #14");
        jPanel15.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 2090, -1, 60));

        jLabel207.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(153, 153, 153));
        jLabel207.setText("TORNEO #13");
        jPanel15.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 2090, -1, 60));

        verTorneo14.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo14MouseMoved(evt);
            }
        });
        verTorneo14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo14MouseExited(evt);
            }
        });
        verTorneo14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel208.setBackground(new java.awt.Color(255, 255, 255));
        jLabel208.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(255, 255, 255));
        jLabel208.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel208.setText("VER TORNEO");
        jLabel208.setToolTipText("");
        verTorneo14.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(verTorneo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 2220, 130, 40));

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1900, 315, 389));

        verTorneo15.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo15MouseMoved(evt);
            }
        });
        verTorneo15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo15MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo15MouseExited(evt);
            }
        });
        verTorneo15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel210.setBackground(new java.awt.Color(255, 255, 255));
        jLabel210.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(255, 255, 255));
        jLabel210.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel210.setText("VER TORNEO");
        jLabel210.setToolTipText("");
        verTorneo15.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel46.setBackground(new java.awt.Color(30, 25, 161));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel211.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel211.setForeground(new java.awt.Color(255, 255, 255));
        jLabel211.setText("CREAR TORNEO");
        jPanel46.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo15.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 2220, 130, 40));

        jLabel212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 1900, 315, 389));

        verTorneo13.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo13MouseMoved(evt);
            }
        });
        verTorneo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo13MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo13MouseExited(evt);
            }
        });
        verTorneo13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel213.setBackground(new java.awt.Color(255, 255, 255));
        jLabel213.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel213.setForeground(new java.awt.Color(255, 255, 255));
        jLabel213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel213.setText("VER TORNEO");
        jLabel213.setToolTipText("");
        verTorneo13.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel47.setBackground(new java.awt.Color(30, 25, 161));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel214.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(255, 255, 255));
        jLabel214.setText("CREAR TORNEO");
        jPanel47.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo13.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 2220, 130, 40));

        jLabel215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1900, 315, 389));

        jLabel216.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(153, 153, 153));
        jLabel216.setText("TORNEO #18");
        jPanel15.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2510, -1, 60));

        jLabel217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel217.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sabalekaTribuna.jpeg"))); // NOI18N
        jLabel217.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 2350, 230, 180));

        jLabel218.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/runeGlobo.jpg"))); // NOI18N
        jLabel218.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 2350, 240, 150));

        jLabel219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel219.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/serenaWilliamsWimbledon.jpg"))); // NOI18N
        jLabel219.setToolTipText("");
        jLabel219.setAutoscrolls(true);
        jPanel15.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 2350, 230, 150));

        jLabel220.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(153, 153, 153));
        jLabel220.setText("TORNEO #17");
        jPanel15.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 2510, -1, 60));

        jLabel221.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(153, 153, 153));
        jLabel221.setText("TORNEO #16");
        jPanel15.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 2510, -1, 60));

        verTorneo17.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo17MouseMoved(evt);
            }
        });
        verTorneo17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo17MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo17MouseExited(evt);
            }
        });
        verTorneo17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel222.setBackground(new java.awt.Color(255, 255, 255));
        jLabel222.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(255, 255, 255));
        jLabel222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel222.setText("VER TORNEO");
        jLabel222.setToolTipText("");
        verTorneo17.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(verTorneo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 2640, 130, 40));

        jLabel223.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2320, 315, 389));

        verTorneo18.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo18MouseMoved(evt);
            }
        });
        verTorneo18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo18MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo18MouseExited(evt);
            }
        });
        verTorneo18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel224.setBackground(new java.awt.Color(255, 255, 255));
        jLabel224.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(255, 255, 255));
        jLabel224.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel224.setText("VER TORNEO");
        jLabel224.setToolTipText("");
        verTorneo18.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel48.setBackground(new java.awt.Color(30, 25, 161));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel225.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel225.setForeground(new java.awt.Color(255, 255, 255));
        jLabel225.setText("CREAR TORNEO");
        jPanel48.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo18.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 2640, 130, 40));

        jLabel226.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 2320, 315, 389));

        verTorneo16.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo16MouseMoved(evt);
            }
        });
        verTorneo16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo16MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo16MouseExited(evt);
            }
        });
        verTorneo16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel227.setBackground(new java.awt.Color(255, 255, 255));
        jLabel227.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel227.setForeground(new java.awt.Color(255, 255, 255));
        jLabel227.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel227.setText("VER TORNEO");
        jLabel227.setToolTipText("");
        verTorneo16.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel49.setBackground(new java.awt.Color(30, 25, 161));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel228.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel228.setForeground(new java.awt.Color(255, 255, 255));
        jLabel228.setText("CREAR TORNEO");
        jPanel49.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo16.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 2640, 130, 40));

        jLabel229.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2320, 315, 389));

        jLabel230.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel230.setForeground(new java.awt.Color(153, 153, 153));
        jLabel230.setText("TORNEO #21");
        jPanel15.add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2940, -1, 60));

        jLabel231.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doblesMasculino.jpg"))); // NOI18N
        jLabel231.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 2780, 230, 180));

        jLabel232.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sinnerArriba.jpg"))); // NOI18N
        jLabel232.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 2780, 240, 150));

        jLabel233.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel233.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sinnerGolpeDerecha.jpg"))); // NOI18N
        jLabel233.setToolTipText("");
        jLabel233.setAutoscrolls(true);
        jPanel15.add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 2780, 230, 150));

        jLabel234.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel234.setForeground(new java.awt.Color(153, 153, 153));
        jLabel234.setText("TORNEO #20");
        jPanel15.add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 2940, -1, 60));

        jLabel235.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel235.setForeground(new java.awt.Color(153, 153, 153));
        jLabel235.setText("TORNEO #19");
        jPanel15.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 2940, -1, 60));

        verTorneo20.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo20.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo20MouseMoved(evt);
            }
        });
        verTorneo20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo20MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo20MouseExited(evt);
            }
        });
        verTorneo20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel236.setBackground(new java.awt.Color(255, 255, 255));
        jLabel236.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel236.setForeground(new java.awt.Color(255, 255, 255));
        jLabel236.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel236.setText("VER TORNEO");
        jLabel236.setToolTipText("");
        verTorneo20.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(verTorneo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 3070, 130, 40));

        jLabel237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2750, 315, 389));

        verTorneo21.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo21MouseMoved(evt);
            }
        });
        verTorneo21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo21MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo21MouseExited(evt);
            }
        });
        verTorneo21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel238.setBackground(new java.awt.Color(255, 255, 255));
        jLabel238.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel238.setForeground(new java.awt.Color(255, 255, 255));
        jLabel238.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel238.setText("VER TORNEO");
        jLabel238.setToolTipText("");
        verTorneo21.add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel50.setBackground(new java.awt.Color(30, 25, 161));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel239.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel239.setForeground(new java.awt.Color(255, 255, 255));
        jLabel239.setText("CREAR TORNEO");
        jPanel50.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo21.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 3070, 130, 40));

        jLabel240.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 2750, 315, 389));

        verTorneo19.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo19MouseMoved(evt);
            }
        });
        verTorneo19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo19MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo19MouseExited(evt);
            }
        });
        verTorneo19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel241.setBackground(new java.awt.Color(255, 255, 255));
        jLabel241.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel241.setForeground(new java.awt.Color(255, 255, 255));
        jLabel241.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel241.setText("VER TORNEO");
        jLabel241.setToolTipText("");
        verTorneo19.add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel51.setBackground(new java.awt.Color(30, 25, 161));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel242.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(255, 255, 255));
        jLabel242.setText("CREAR TORNEO");
        jPanel51.add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo19.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 3070, 130, 40));

        jLabel243.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2750, 315, 389));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 3200));

        jScrollPane5.setViewportView(jPanel14);

        pestania.addTab("tour", jScrollPane5);

        searchTab.setBorder(null);
        searchTab.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        searchTab.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playersListTable.setAutoCreateRowSorter(true);
        playersListTable.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        playersListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula"
            }
        ));
        playersListTable.setAutoscrolls(false);
        playersListTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playersListTable.setGridColor(new java.awt.Color(204, 204, 204));
        playersListTable.setSelectionBackground(new java.awt.Color(153, 153, 255));
        playersListTable.setSelectionForeground(new java.awt.Color(30, 25, 161));
        jScrollPane38.setViewportView(playersListTable);

        jPanel53.add(jScrollPane38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 930, 310));

        bottomSearchPlayer.setBackground(new java.awt.Color(30, 25, 161));
        bottomSearchPlayer.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        bottomSearchPlayer.setForeground(new java.awt.Color(255, 255, 255));
        bottomSearchPlayer.setText("Buscar");
        bottomSearchPlayer.setBorder(null);
        bottomSearchPlayer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bottomSearchPlayerMouseMoved(evt);
            }
        });
        bottomSearchPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottomSearchPlayerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bottomSearchPlayerMouseExited(evt);
            }
        });
        bottomSearchPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomSearchPlayerActionPerformed(evt);
            }
        });
        jPanel53.add(bottomSearchPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 130, 40));

        searchTextField.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(153, 153, 153));
        searchTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchTextField.setText("Ingresar cedula del jugador a buscar...");
        searchTextField.setToolTipText("");
        searchTextField.setBorder(null);
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        jPanel53.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 770, 40));

        jLabel288.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel53.add(jLabel288, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel290.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel290.setForeground(new java.awt.Color(153, 153, 153));
        jLabel290.setText("BUSCAR JUGADOR...");
        jPanel53.add(jLabel290, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 60));

        IconoCalendario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fotoPerfilPequenio.png"))); // NOI18N
        jPanel53.add(IconoCalendario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 880, 230, 200));

        jLabel291.setBackground(new java.awt.Color(51, 51, 51));
        jLabel291.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel291.setForeground(new java.awt.Color(102, 102, 102));
        jLabel291.setText("Equipo en otro torneo");
        jPanel53.add(jLabel291, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1000, -1, 30));

        jLabel292.setBackground(new java.awt.Color(51, 51, 51));
        jLabel292.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel292.setForeground(new java.awt.Color(102, 102, 102));
        jLabel292.setText("JUGADORES REGISTRADOS");
        jPanel53.add(jLabel292, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel293.setBackground(new java.awt.Color(51, 51, 51));
        jLabel293.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel293.setForeground(new java.awt.Color(102, 102, 102));
        jLabel293.setText("FECHA DE NACIMIENTO");
        jPanel53.add(jLabel293, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 840, -1, 30));

        jLabel294.setBackground(new java.awt.Color(51, 51, 51));
        jLabel294.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(102, 102, 102));
        jLabel294.setText("NÚMERO DE CEDULA");
        jPanel53.add(jLabel294, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 920, -1, 30));

        jLabel295.setBackground(new java.awt.Color(51, 51, 51));
        jLabel295.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel295.setForeground(new java.awt.Color(102, 102, 102));
        jLabel295.setText("CORREO ELECTRÓNICO");
        jPanel53.add(jLabel295, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 920, -1, 30));

        jLabel298.setBackground(new java.awt.Color(51, 51, 51));
        jLabel298.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel298.setForeground(new java.awt.Color(102, 102, 102));
        jLabel298.setText("CATEGORIA");
        jPanel53.add(jLabel298, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1000, -1, 30));

        jLabel299.setBackground(new java.awt.Color(51, 51, 51));
        jLabel299.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel299.setForeground(new java.awt.Color(102, 102, 102));
        jLabel299.setText("Partidos JUGADOS:");
        jPanel53.add(jLabel299, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1080, -1, 30));

        jLabel300.setBackground(new java.awt.Color(51, 51, 51));
        jLabel300.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel300.setForeground(new java.awt.Color(102, 102, 102));
        jLabel300.setText("Partidos GANADOS:");
        jPanel53.add(jLabel300, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1080, -1, 30));

        showDateBirth.setEditable(false);
        showDateBirth.setBackground(new java.awt.Color(255, 255, 255));
        showDateBirth.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        showDateBirth.setText("DD/MM/YYYY");
        showDateBirth.setBorder(null);
        showDateBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDateBirthActionPerformed(evt);
            }
        });
        jPanel53.add(showDateBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 880, 140, -1));

        showEmail.setEditable(false);
        showEmail.setBackground(new java.awt.Color(255, 255, 255));
        showEmail.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        showEmail.setText("CORREO ELECTRONICO");
        showEmail.setBorder(null);
        showEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEmailActionPerformed(evt);
            }
        });
        jPanel53.add(showEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 960, 190, -1));

        showPlayerName.setEditable(false);
        showPlayerName.setBackground(new java.awt.Color(255, 255, 255));
        showPlayerName.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        showPlayerName.setText("Nombre del Jugador");
        showPlayerName.setToolTipText("");
        showPlayerName.setBorder(null);
        showPlayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPlayerNameActionPerformed(evt);
            }
        });
        jPanel53.add(showPlayerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, 660, -1));

        showTeam.setEditable(false);
        showTeam.setBackground(new java.awt.Color(255, 255, 255));
        showTeam.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        showTeam.setText("TAMANACO TEAM");
        showTeam.setBorder(null);
        showTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTeamActionPerformed(evt);
            }
        });
        jPanel53.add(showTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1040, 140, -1));

        showId.setEditable(false);
        showId.setBackground(new java.awt.Color(255, 255, 255));
        showId.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        showId.setText("CEDULA DE IDENTIDAD");
        showId.setBorder(null);
        showId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showIdActionPerformed(evt);
            }
        });
        jPanel53.add(showId, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 960, 140, -1));

        showMatchWon.setEditable(false);
        showMatchWon.setBackground(new java.awt.Color(255, 255, 255));
        showMatchWon.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        showMatchWon.setText("999");
        showMatchWon.setBorder(null);
        showMatchWon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMatchWonActionPerformed(evt);
            }
        });
        jPanel53.add(showMatchWon, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1080, 40, 30));

        showCategory.setEditable(false);
        showCategory.setBackground(new java.awt.Color(255, 255, 255));
        showCategory.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        showCategory.setText("CATEGORIA");
        showCategory.setBorder(null);
        showCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCategoryActionPerformed(evt);
            }
        });
        jPanel53.add(showCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1040, 140, -1));

        showMatchPlayed.setEditable(false);
        showMatchPlayed.setBackground(new java.awt.Color(255, 255, 255));
        showMatchPlayed.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        showMatchPlayed.setText("999");
        showMatchPlayed.setBorder(null);
        showMatchPlayed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMatchPlayedActionPerformed(evt);
            }
        });
        jPanel53.add(showMatchPlayed, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 1080, 50, 30));

        jLabel301.setBackground(new java.awt.Color(51, 51, 51));
        jLabel301.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel301.setForeground(new java.awt.Color(102, 102, 102));
        jLabel301.setText("Número de telefono");
        jPanel53.add(jLabel301, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 840, -1, 30));

        showPhoneNumber.setEditable(false);
        showPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        showPhoneNumber.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        showPhoneNumber.setText("Numero de telefono");
        showPhoneNumber.setBorder(null);
        showPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPhoneNumberActionPerformed(evt);
            }
        });
        jPanel53.add(showPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 880, 140, -1));

        jLabel302.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel302.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cuadradoMasGrande.png"))); // NOI18N
        jLabel302.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel53.add(jLabel302, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 1040, 540));
        jPanel53.add(jSeparator80, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 710, 930, 10));

        jLabel303.setBackground(new java.awt.Color(51, 51, 51));
        jLabel303.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel303.setForeground(new java.awt.Color(102, 102, 102));
        jLabel303.setText("ficha DEL JUGADOR: ");
        jPanel53.add(jLabel303, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, -1, -1));

        jPanel31.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 1260));

        searchTab.setViewportView(jPanel31);

        pestania.addTab("search", searchTab);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel32MouseClicked(evt);
            }
        });
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setBackground(new java.awt.Color(0, 0, 0));
        jLabel43.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 153, 153));
        jLabel43.setText("Ver CALENDARIO...");
        jPanel32.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel32.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel32.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 900, 10));

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

        jPanel32.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 380, 410));

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
        jPanel32.add(botonAgregarPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 140, 40));

        botonEliminarPartido.setBackground(new java.awt.Color(36, 20, 188));
        botonEliminarPartido.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonEliminarPartido.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarPartido.setText("ELIMINAR PARTIDO");
        botonEliminarPartido.setBorder(null);
        botonEliminarPartido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonEliminarPartidoMouseMoved(evt);
            }
        });
        botonEliminarPartido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarPartidoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEliminarPartidoMouseExited(evt);
            }
        });
        botonEliminarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPartidoActionPerformed(evt);
            }
        });
        jPanel32.add(botonEliminarPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, 140, 40));

        botonModificarPartido.setBackground(new java.awt.Color(36, 20, 188));
        botonModificarPartido.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonModificarPartido.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarPartido.setText("MODIFICAR PARTIDO");
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
        jPanel32.add(botonModificarPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 160, 40));

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
        jPanel32.add(calendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 520, 410));

        pestania.addTab("tab4", jPanel32);

        pestaniaCrearTorneoInicio.setBackground(new java.awt.Color(255, 255, 255));
        pestaniaCrearTorneoInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel14.setText("Ingresar nombre del torneo:");
        pestaniaCrearTorneoInicio.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        entradaNombreTorneo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreTorneo.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreTorneo.setText("Ingresar nombre del torneo");
        entradaNombreTorneo.setBorder(null);
        entradaNombreTorneo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreTorneoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreTorneoFocusLost(evt);
            }
        });
        entradaNombreTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreTorneoActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(entradaNombreTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        pestaniaCrearTorneoInicio1.setBackground(new java.awt.Color(255, 255, 255));
        pestaniaCrearTorneoInicio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pestaniaCrearTorneoInicio.add(pestaniaCrearTorneoInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));
        pestaniaCrearTorneoInicio.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 350, 10));
        pestaniaCrearTorneoInicio.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 10));
        pestaniaCrearTorneoInicio.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 350, 10));
        pestaniaCrearTorneoInicio.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 350, 10));

        entradaCostoTorneo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCostoTorneo.setForeground(new java.awt.Color(153, 153, 153));
        entradaCostoTorneo.setText("Ingresar costo del torneo");
        entradaCostoTorneo.setBorder(null);
        entradaCostoTorneo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCostoTorneoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCostoTorneoFocusLost(evt);
            }
        });
        entradaCostoTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCostoTorneoActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(entradaCostoTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 220, -1));

        jLabel19.setBackground(new java.awt.Color(51, 51, 51));
        jLabel19.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel19.setText("RONDAS DE ELIMINACION DIRECTA:");
        pestaniaCrearTorneoInicio.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        pestaniaCrearTorneoInicio.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel82.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(153, 153, 153));
        jLabel82.setText("Ingresar datos del torneo...");
        pestaniaCrearTorneoInicio.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        entradaCantidadJugadores.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCantidadJugadores.setForeground(new java.awt.Color(153, 153, 153));
        entradaCantidadJugadores.setText("Ingresar un numero");
        entradaCantidadJugadores.setBorder(null);
        entradaCantidadJugadores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresFocusLost(evt);
            }
        });
        entradaCantidadJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCantidadJugadoresActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(entradaCantidadJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jLabel16.setBackground(new java.awt.Color(51, 51, 51));
        jLabel16.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel16.setText("INGRESAR CANTIDAD DE JUGADORES/DUPLAS/equipos: ");
        pestaniaCrearTorneoInicio.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, 30));

        botonSeguirIngresarDatosTorneo.setBackground(new java.awt.Color(36, 20, 188));
        botonSeguirIngresarDatosTorneo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirIngresarDatosTorneo.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirIngresarDatosTorneo.setText("SEGUIR");
        botonSeguirIngresarDatosTorneo.setBorder(null);
        botonSeguirIngresarDatosTorneo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneoMouseMoved(evt);
            }
        });
        botonSeguirIngresarDatosTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneoMouseExited(evt);
            }
        });
        botonSeguirIngresarDatosTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirIngresarDatosTorneoActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(botonSeguirIngresarDatosTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 140, 40));

        botonRegresarIngresarDatosTorneo.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosTorneo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosTorneo.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosTorneo.setText("REGRESAR");
        botonRegresarIngresarDatosTorneo.setBorder(null);
        botonRegresarIngresarDatosTorneo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneoMouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneoMouseExited(evt);
            }
        });
        botonRegresarIngresarDatosTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosTorneoActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(botonRegresarIngresarDatosTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 140, 40));

        jLabel42.setBackground(new java.awt.Color(51, 51, 51));
        jLabel42.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel42.setText("INGRESAR COSTO DEL TORNEO:");
        pestaniaCrearTorneoInicio.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, -1, 30));

        ingresarRondaEliminacionDirecta.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        ingresarRondaEliminacionDirecta.setForeground(new java.awt.Color(153, 153, 153));
        ingresarRondaEliminacionDirecta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIECISEISAVOS", "OCTAVOS", "CUARTOS", "SEMIFINALES", "FINAL" }));
        ingresarRondaEliminacionDirecta.setToolTipText("");
        ingresarRondaEliminacionDirecta.setBorder(null);
        ingresarRondaEliminacionDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarRondaEliminacionDirectaActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(ingresarRondaEliminacionDirecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 250, 30));

        ingresarRondaEliminacionDirecta3.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        ingresarRondaEliminacionDirecta3.setForeground(new java.awt.Color(153, 153, 153));
        ingresarRondaEliminacionDirecta3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma Categoria", "6ta Categoria", "5ta Categoria", "4ta Categoria", "3ra Categoria" }));
        ingresarRondaEliminacionDirecta3.setToolTipText("");
        ingresarRondaEliminacionDirecta3.setBorder(null);
        ingresarRondaEliminacionDirecta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarRondaEliminacionDirecta3ActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(ingresarRondaEliminacionDirecta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 250, 30));

        jLabel91.setBackground(new java.awt.Color(51, 51, 51));
        jLabel91.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel91.setText("Categoria MAXIMA DEL torneo");
        pestaniaCrearTorneoInicio.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 30));
        pestaniaCrearTorneoInicio.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 350, 10));

        pestania.addTab("tab5", pestaniaCrearTorneoInicio);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel98.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(153, 153, 153));
        jLabel98.setText("Ingresar DATOS DE LOS JUGADORES PARTICIPANTES DEL torneo...");
        jPanel6.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        jPanel6.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 10));

        entradaNombreJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreJugador.setText("Ingresar nombre del jugador");
        entradaNombreJugador.setBorder(null);
        entradaNombreJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorFocusLost(evt);
            }
        });
        entradaNombreJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel29.setBackground(new java.awt.Color(51, 51, 51));
        jLabel29.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel29.setText("Ingresar nombre deL JUGADOR:");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        entradaIDJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaIDJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaIDJugador.setText("Ingresar numero de cedula del jugador");
        entradaIDJugador.setBorder(null);
        entradaIDJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaIDJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaIDJugadorFocusLost(evt);
            }
        });
        entradaIDJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaIDJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaIDJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));
        jPanel6.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 350, 10));

        jLabel30.setBackground(new java.awt.Color(51, 51, 51));
        jLabel30.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel30.setText("Ingresar NÚMERO DE CEDULA DEL JUGADOR:");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, 30));
        jPanel6.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 350, 10));

        entradaNumeroTelefonoJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNumeroTelefonoJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaNumeroTelefonoJugador.setText("Ingresar numero de telefono del jugador");
        entradaNumeroTelefonoJugador.setBorder(null);
        entradaNumeroTelefonoJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorFocusLost(evt);
            }
        });
        entradaNumeroTelefonoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNumeroTelefonoJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaNumeroTelefonoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel31.setBackground(new java.awt.Color(51, 51, 51));
        jLabel31.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel31.setText("Ingresar NÚMERO DE TELEFONO deL JUGADOR:");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, 30));
        jPanel6.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 350, 10));

        entradaEmailJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEmailJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaEmailJugador.setText("Ingresar correo del jugador");
        entradaEmailJugador.setBorder(null);
        entradaEmailJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorFocusLost(evt);
            }
        });
        entradaEmailJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEmailJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaEmailJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, -1, -1));

        jLabel32.setBackground(new java.awt.Color(51, 51, 51));
        jLabel32.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel32.setText("Ingresar CORREO deL JUGADOR:");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, 30));

        jLabel33.setBackground(new java.awt.Color(51, 51, 51));
        jLabel33.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel33.setText("Ingresar CATEGORÍA deL JUGADOR:");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, 30));

        jLabel34.setBackground(new java.awt.Color(51, 51, 51));
        jLabel34.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel34.setText("Ingresar EQUIPO deL JUGADOR:");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, 30));

        entradaEquipoJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEquipoJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaEquipoJugador.setText("Ingresar equipo externo del jugador");
        entradaEquipoJugador.setBorder(null);
        entradaEquipoJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorFocusLost(evt);
            }
        });
        entradaEquipoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEquipoJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaEquipoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, 20));
        jPanel6.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 350, 10));
        jPanel6.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 350, 10));

        entradaFechaNacimientoJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaFechaNacimientoJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaFechaNacimientoJugador.setText("Ingresar fecha de nacimiento (DD-MM-YYYY)");
        entradaFechaNacimientoJugador.setBorder(null);
        entradaFechaNacimientoJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorFocusLost(evt);
            }
        });
        entradaFechaNacimientoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaFechaNacimientoJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaFechaNacimientoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));

        jLabel35.setBackground(new java.awt.Color(51, 51, 51));
        jLabel35.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("VISTA DE JUGADORES YA AGREGADOS:");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 750, -1, 30));

        tablaJugadoresAgregados.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tablaJugadoresAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula", "Telefono", "Categoria"
            }
        ));
        tablaJugadoresAgregados.setAutoscrolls(false);
        tablaJugadoresAgregados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaJugadoresAgregados.setGridColor(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaJugadoresAgregados.setSelectionForeground(new java.awt.Color(30, 25, 161));
        jScrollPane2.setViewportView(tablaJugadoresAgregados);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 790, 840, 410));

        botonRegresarIngresarDatosSingle.setBackground(new java.awt.Color(30, 25, 161));
        botonRegresarIngresarDatosSingle.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosSingle.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosSingle.setText("REGRESAR");
        botonRegresarIngresarDatosSingle.setBorder(null);
        botonRegresarIngresarDatosSingle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosSingleMouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosSingle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosSingleMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosSingleMouseExited(evt);
            }
        });
        botonRegresarIngresarDatosSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosSingleActionPerformed(evt);
            }
        });
        jPanel6.add(botonRegresarIngresarDatosSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 140, 40));

        botonAgregarJugador.setBackground(new java.awt.Color(30, 25, 161));
        botonAgregarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonAgregarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarJugador.setText("AGREGAR JUGADOR");
        botonAgregarJugador.setBorder(null);
        botonAgregarJugador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonAgregarJugadorMouseMoved(evt);
            }
        });
        botonAgregarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarJugadorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarJugadorMouseExited(evt);
            }
        });
        botonAgregarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(botonAgregarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, 140, 40));

        jLabel41.setBackground(new java.awt.Color(51, 51, 51));
        jLabel41.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel41.setText("Ingresar fecha de nacimiento deL JUGADOR:");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, 30));

        botonSeguirIngresarJugador.setBackground(new java.awt.Color(30, 25, 161));
        botonSeguirIngresarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirIngresarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirIngresarJugador.setText("SEGUIR");
        botonSeguirIngresarJugador.setBorder(null);
        botonSeguirIngresarJugador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarJugadorMouseMoved(evt);
            }
        });
        botonSeguirIngresarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarJugadorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarJugadorMouseExited(evt);
            }
        });
        botonSeguirIngresarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirIngresarJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(botonSeguirIngresarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 670, 140, 40));

        opcionesCategoriaJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        opcionesCategoriaJugador.setForeground(new java.awt.Color(153, 153, 153));
        opcionesCategoriaJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma Categoria", "6ta Categoria", "5ta Categoria", "4ta Categoria", "3era Categoria" }));
        opcionesCategoriaJugador.setBorder(null);
        opcionesCategoriaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriaJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(opcionesCategoriaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 350, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 1260));

        jScrollPane1.setViewportView(jPanel5);

        pestania.addTab("tab6", jScrollPane1);

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(1032, 1600));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setForeground(new java.awt.Color(153, 153, 153));
        jPanel10.setPreferredSize(new java.awt.Dimension(938, 1600));
        jPanel10.setRequestFocusEnabled(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(153, 153, 153));
        jLabel99.setText("Ingresar DATOS DE LAS DUPLAS PARTICIPANTES DEL torneo...");
        jPanel10.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel10.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        jPanel10.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 10));

        entradaNombreJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreJugadorA.setText("Ingresar nombre del jugador");
        entradaNombreJugadorA.setBorder(null);
        entradaNombreJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorAFocusLost(evt);
            }
        });
        entradaNombreJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaNombreJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel46.setText("Ingresar nombre deL JUGADOR A:");
        jPanel10.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        entradaIdJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaIdJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaIdJugadorA.setText("Ingresar numero de cedula jugador");
        entradaIdJugadorA.setBorder(null);
        entradaIdJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaIdJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaIdJugadorAFocusLost(evt);
            }
        });
        entradaIdJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaIdJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaIdJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));
        jPanel10.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 350, 10));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel47.setText("Ingresar NÚMERO DE CEDULA DEL JUGADOR A:");
        jPanel10.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, 30));
        jPanel10.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, 350, 10));

        entradaNumeroTelefonoJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNumeroTelefonoJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaNumeroTelefonoJugadorA.setText("Ingresar numero de telefono del jugador");
        entradaNumeroTelefonoJugadorA.setBorder(null);
        entradaNumeroTelefonoJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorAFocusLost(evt);
            }
        });
        entradaNumeroTelefonoJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNumeroTelefonoJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaNumeroTelefonoJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 280, -1));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel48.setText("Ingresar NÚMERO DE TELEFONO deL JUGADOR A:");
        jPanel10.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, -1, 30));
        jPanel10.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 350, 10));

        entradaEmailJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEmailJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaEmailJugadorA.setText("Ingresar correo del jugador");
        entradaEmailJugadorA.setToolTipText("");
        entradaEmailJugadorA.setBorder(null);
        entradaEmailJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorAFocusLost(evt);
            }
        });
        entradaEmailJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEmailJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaEmailJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel49.setText("Ingresar CORREO deL JUGADOR A:");
        jPanel10.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, 30));

        jLabel50.setBackground(new java.awt.Color(51, 51, 51));
        jLabel50.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel50.setText("Ingresar CATEGORÍA deL JUGADOR A:");
        jPanel10.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 750, -1, 30));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel51.setText("Ingresar EQUIPO deL JUGADOR A:");
        jPanel10.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, 30));

        entradaEquipoJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEquipoJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaEquipoJugadorA.setText("Ingresar equipo del jugador");
        entradaEquipoJugadorA.setBorder(null);
        entradaEquipoJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorAFocusLost(evt);
            }
        });
        entradaEquipoJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEquipoJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaEquipoJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, -1, 20));
        jPanel10.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 350, 10));
        jPanel10.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 930, 350, 10));

        entradaFechaNacimientoJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaFechaNacimientoJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaFechaNacimientoJugadorA.setText("Ingresar fecha de nacimiento (DD-MM-YYYY)");
        entradaFechaNacimientoJugadorA.setBorder(null);
        entradaFechaNacimientoJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorAFocusLost(evt);
            }
        });
        entradaFechaNacimientoJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaFechaNacimientoJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaFechaNacimientoJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 900, -1, -1));

        jLabel52.setBackground(new java.awt.Color(51, 51, 51));
        jLabel52.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("VISTA DE JUGADORES YA AGREGADOS:");
        jPanel10.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1120, -1, 30));

        botonRegresarIngresarDatosDobles.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosDobles.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosDobles.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosDobles.setText("REGRESAR");
        botonRegresarIngresarDatosDobles.setBorder(null);
        botonRegresarIngresarDatosDobles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosDoblesMouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosDobles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosDoblesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosDoblesMouseExited(evt);
            }
        });
        botonRegresarIngresarDatosDobles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosDoblesActionPerformed(evt);
            }
        });
        jPanel10.add(botonRegresarIngresarDatosDobles, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1050, 140, 40));

        botonAgregarJugadoresDupla.setBackground(new java.awt.Color(36, 20, 188));
        botonAgregarJugadoresDupla.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonAgregarJugadoresDupla.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarJugadoresDupla.setText("AGREGAR JUGADORes");
        botonAgregarJugadoresDupla.setBorder(null);
        botonAgregarJugadoresDupla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonAgregarJugadoresDuplaMouseMoved(evt);
            }
        });
        botonAgregarJugadoresDupla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarJugadoresDuplaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarJugadoresDuplaMouseExited(evt);
            }
        });
        botonAgregarJugadoresDupla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarJugadoresDuplaActionPerformed(evt);
            }
        });
        jPanel10.add(botonAgregarJugadoresDupla, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 1050, 150, 40));

        jLabel54.setBackground(new java.awt.Color(51, 51, 51));
        jLabel54.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel54.setText("Ingresar fecha de nacimiento deL JUGADOR A:");
        jPanel10.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 860, -1, 30));

        botonSeguirDuplas.setBackground(new java.awt.Color(36, 20, 188));
        botonSeguirDuplas.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirDuplas.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirDuplas.setText("SEGUIR");
        botonSeguirDuplas.setBorder(null);
        botonSeguirDuplas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirDuplasMouseMoved(evt);
            }
        });
        botonSeguirDuplas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirDuplasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirDuplasMouseExited(evt);
            }
        });
        botonSeguirDuplas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirDuplasActionPerformed(evt);
            }
        });
        jPanel10.add(botonSeguirDuplas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1050, 140, 40));
        jPanel10.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 350, 10));

        entradaNombreJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreJugadorB.setText("Ingresar nombre del jugador");
        entradaNombreJugadorB.setBorder(null);
        entradaNombreJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorBFocusLost(evt);
            }
        });
        entradaNombreJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaNombreJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel57.setText("Ingresar nombre deL JUGADOR B:");
        jPanel10.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, 30));

        entradaIdJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaIdJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaIdJugadorB.setText("Ingresar numero de cedula jugador");
        entradaIdJugadorB.setBorder(null);
        entradaIdJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaIdJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaIdJugadorBFocusLost(evt);
            }
        });
        entradaIdJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaIdJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaIdJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));
        jPanel10.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 350, 10));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel58.setText("Ingresar NÚMERO DE CEDULA DEL JUGADOR B:");
        jPanel10.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, 30));
        jPanel10.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 710, 350, 10));

        entradaNumeroTelefonoJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNumeroTelefonoJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaNumeroTelefonoJugadorB.setText("Ingresar numero de telefono del jugador");
        entradaNumeroTelefonoJugadorB.setBorder(null);
        entradaNumeroTelefonoJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorBFocusLost(evt);
            }
        });
        entradaNumeroTelefonoJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNumeroTelefonoJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaNumeroTelefonoJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 680, 320, -1));

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel59.setText("Ingresar NÚMERO DE TELEFONO deL JUGADOR B:");
        jPanel10.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, -1, 30));
        jPanel10.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 350, 10));

        entradaEmailJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEmailJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaEmailJugadorB.setText("Ingresar correo del jugador");
        entradaEmailJugadorB.setBorder(null);
        entradaEmailJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorBFocusLost(evt);
            }
        });
        entradaEmailJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEmailJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaEmailJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel88.setText("Ingresar CORREO deL JUGADOR B:");
        jPanel10.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, 30));

        jLabel90.setBackground(new java.awt.Color(51, 51, 51));
        jLabel90.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel90.setText("Ingresar CATEGORÍA deL JUGADOR B:");
        jPanel10.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 750, -1, 30));

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel93.setText("Ingresar EQUIPO deL JUGADOR B:");
        jPanel10.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, 30));

        entradaEquipoJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEquipoJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaEquipoJugadorB.setText("Ingresar equipo del jugador");
        entradaEquipoJugadorB.setBorder(null);
        entradaEquipoJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorBFocusLost(evt);
            }
        });
        entradaEquipoJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEquipoJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaEquipoJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, 20));
        jPanel10.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, 350, 10));
        jPanel10.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 930, 350, 10));

        entradaFechaNacimientoJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaFechaNacimientoJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaFechaNacimientoJugadorB.setText("Ingresar fecha de nacimiento (DD-MM-YYYY)");
        entradaFechaNacimientoJugadorB.setBorder(null);
        entradaFechaNacimientoJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorBFocusLost(evt);
            }
        });
        entradaFechaNacimientoJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaFechaNacimientoJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaFechaNacimientoJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 900, -1, -1));

        jLabel102.setBackground(new java.awt.Color(51, 51, 51));
        jLabel102.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel102.setText("Ingresar fecha de nacimiento deL JUGADOR B:");
        jPanel10.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 860, -1, 30));

        opcionesCategoriaJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        opcionesCategoriaJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        opcionesCategoriaJugadorA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma Categoria", "6ta Categoria", "5ta Categoria", "4ta Categoria", "3era Categoria" }));
        opcionesCategoriaJugadorA.setBorder(null);
        opcionesCategoriaJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriaJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(opcionesCategoriaJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 790, 350, 30));

        opcionesCategoriaJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        opcionesCategoriaJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        opcionesCategoriaJugadorB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma Categoria", "6ta Categoria", "5ta Categoria", "4ta Categoria", "3era Categoria" }));
        opcionesCategoriaJugadorB.setBorder(null);
        opcionesCategoriaJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriaJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(opcionesCategoriaJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 790, 350, 30));

        tablaDuplasAgregadas.setAutoCreateRowSorter(true);
        tablaDuplasAgregadas.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tablaDuplasAgregadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre A", "Cedula A", "Nombre B", "Cedula B", "Categoria A", "Categoria B"
            }
        ));
        tablaDuplasAgregadas.setAutoscrolls(false);
        tablaDuplasAgregadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaDuplasAgregadas.setGridColor(new java.awt.Color(204, 204, 204));
        tablaDuplasAgregadas.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaDuplasAgregadas.setSelectionForeground(new java.awt.Color(30, 25, 161));
        jScrollPane37.setViewportView(tablaDuplasAgregadas);

        jPanel10.add(jScrollPane37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1170, 840, 410));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, -1, -1));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 1700));

        jScrollPane4.setViewportView(jPanel8);

        pestania.addTab("tab7", jScrollPane4);

        jScrollPane7.setBorder(null);
        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel101.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(153, 153, 153));
        jLabel101.setText("Ingresar DATOS DE LOS EQUIPOS PARTICIPANTES DEL torneo...");
        jPanel12.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel12.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        jPanel12.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 350, 10));

        entradaNombreCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreCapitan.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreCapitan.setText("Ingresar nombre del capitan");
        entradaNombreCapitan.setBorder(null);
        entradaNombreCapitan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreCapitanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreCapitanFocusLost(evt);
            }
        });
        entradaNombreCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(entradaNombreCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel105.setBackground(new java.awt.Color(51, 51, 51));
        jLabel105.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel105.setText("Ingresar nombre deL CAPITAN:");
        jPanel12.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 30));

        entradaCedulaCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCedulaCapitan.setForeground(new java.awt.Color(153, 153, 153));
        entradaCedulaCapitan.setText("Ingresar numero de cedula capitan");
        entradaCedulaCapitan.setBorder(null);
        entradaCedulaCapitan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCedulaCapitanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCedulaCapitanFocusLost(evt);
            }
        });
        entradaCedulaCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCedulaCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(entradaCedulaCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));
        jPanel12.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 350, 10));

        jLabel106.setBackground(new java.awt.Color(51, 51, 51));
        jLabel106.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel106.setText("Ingresar NÚMERO DE CEDULA DEL CAPITAN:");
        jPanel12.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, 30));
        jPanel12.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 350, 10));

        entradaNumeroTelefonoCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNumeroTelefonoCapitan.setForeground(new java.awt.Color(153, 153, 153));
        entradaNumeroTelefonoCapitan.setText("Ingresar numero de telefono del capitan");
        entradaNumeroTelefonoCapitan.setBorder(null);
        entradaNumeroTelefonoCapitan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoCapitanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoCapitanFocusLost(evt);
            }
        });
        entradaNumeroTelefonoCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNumeroTelefonoCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(entradaNumeroTelefonoCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel107.setBackground(new java.awt.Color(51, 51, 51));
        jLabel107.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel107.setText("Ingresar NÚMERO DE TELEFONO deL CAPITAN:");
        jPanel12.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 30));
        jPanel12.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 350, 10));

        entradaCorreoCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCorreoCapitan.setForeground(new java.awt.Color(153, 153, 153));
        entradaCorreoCapitan.setText("Ingresar correo capitan");
        entradaCorreoCapitan.setToolTipText("");
        entradaCorreoCapitan.setBorder(null);
        entradaCorreoCapitan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCorreoCapitanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCorreoCapitanFocusLost(evt);
            }
        });
        entradaCorreoCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCorreoCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(entradaCorreoCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        jLabel108.setBackground(new java.awt.Color(51, 51, 51));
        jLabel108.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel108.setText("Ingresar CORREO deL CAPITAN:");
        jPanel12.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, 30));

        jLabel109.setBackground(new java.awt.Color(51, 51, 51));
        jLabel109.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel109.setText("Ingresar CATEGORÍA deL CAPITAN:");
        jPanel12.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, 30));
        jPanel12.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 350, 10));

        entradaNombreEquipo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreEquipo.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreEquipo.setText("Ingresar nombre del equipo");
        entradaNombreEquipo.setBorder(null);
        entradaNombreEquipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreEquipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreEquipoFocusLost(evt);
            }
        });
        entradaNombreEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreEquipoActionPerformed(evt);
            }
        });
        jPanel12.add(entradaNombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        jLabel111.setBackground(new java.awt.Color(51, 51, 51));
        jLabel111.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(102, 102, 102));
        jLabel111.setText("VISTA DE JUGADORES YA AGREGADOS:");
        jPanel12.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 740, -1, 30));

        tablaEquiposAgregados.setAutoCreateRowSorter(true);
        tablaEquiposAgregados.setBackground(new java.awt.Color(255, 255, 255));
        tablaEquiposAgregados.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tablaEquiposAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del equipo", "Nombre del capitan", "ID del capitan", "Categoria"
            }
        ));
        jScrollPane8.setViewportView(tablaEquiposAgregados);

        jPanel12.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 780, 840, 410));

        botonRegresarIngresarDatosEquipo.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosEquipo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosEquipo.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosEquipo.setText("REGRESAR");
        botonRegresarIngresarDatosEquipo.setBorder(null);
        botonRegresarIngresarDatosEquipo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosEquipoMouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosEquipoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosEquipoMouseExited(evt);
            }
        });
        botonRegresarIngresarDatosEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosEquipoActionPerformed(evt);
            }
        });
        jPanel12.add(botonRegresarIngresarDatosEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 140, 40));

        botonAgregarEquipo.setBackground(new java.awt.Color(36, 20, 188));
        botonAgregarEquipo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonAgregarEquipo.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarEquipo.setText("AGREGAR EQUIPO");
        botonAgregarEquipo.setBorder(null);
        botonAgregarEquipo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonAgregarEquipoMouseMoved(evt);
            }
        });
        botonAgregarEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarEquipoMouseExited(evt);
            }
        });
        botonAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEquipoActionPerformed(evt);
            }
        });
        jPanel12.add(botonAgregarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, 140, 40));

        jLabel113.setBackground(new java.awt.Color(51, 51, 51));
        jLabel113.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel113.setText("INGRESAR NOMBRE DEL EQUIPO:");
        jPanel12.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, 30));

        botonSeguirEquipo.setBackground(new java.awt.Color(36, 20, 188));
        botonSeguirEquipo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirEquipo.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirEquipo.setText("SEGUIR");
        botonSeguirEquipo.setBorder(null);
        botonSeguirEquipo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirEquipoMouseMoved(evt);
            }
        });
        botonSeguirEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirEquipoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirEquipoMouseExited(evt);
            }
        });
        botonSeguirEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirEquipoActionPerformed(evt);
            }
        });
        jPanel12.add(botonSeguirEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, 140, 40));
        jPanel12.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 350, 10));

        entradaFechaNacimientoCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaFechaNacimientoCapitan.setForeground(new java.awt.Color(153, 153, 153));
        entradaFechaNacimientoCapitan.setText("Ingresar fecha de nacimiento (DD-MM-YYYY)");
        entradaFechaNacimientoCapitan.setBorder(null);
        entradaFechaNacimientoCapitan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoCapitanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoCapitanFocusLost(evt);
            }
        });
        entradaFechaNacimientoCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaFechaNacimientoCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(entradaFechaNacimientoCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));

        jLabel114.setBackground(new java.awt.Color(51, 51, 51));
        jLabel114.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel114.setText("Ingresar fecha de nacimiento deL CAPITAN:");
        jPanel12.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, 30));

        opcionesCategoriaCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        opcionesCategoriaCapitan.setForeground(new java.awt.Color(153, 153, 153));
        opcionesCategoriaCapitan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma Categoria", "6ta Categoria", "5ta Categoria", "4ta Categoria", "3era Categoria" }));
        opcionesCategoriaCapitan.setBorder(null);
        opcionesCategoriaCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriaCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(opcionesCategoriaCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 350, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 1260));

        jScrollPane7.setViewportView(jPanel11);

        pestania.addTab("tab8", jScrollPane7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonConfigurarFaseGrupos.setBackground(new java.awt.Color(30, 25, 161));
        botonConfigurarFaseGrupos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonConfigurarFaseGruposMouseMoved(evt);
            }
        });
        botonConfigurarFaseGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConfigurarFaseGruposMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonConfigurarFaseGruposMouseExited(evt);
            }
        });
        botonConfigurarFaseGrupos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel117.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("CONFIGURAR GRUPOS");
        botonConfigurarFaseGrupos.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel9.add(botonConfigurarFaseGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 160, 40));

        botonTorneoMuerteSubita.setBackground(new java.awt.Color(30, 25, 161));
        botonTorneoMuerteSubita.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonTorneoMuerteSubitaMouseMoved(evt);
            }
        });
        botonTorneoMuerteSubita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTorneoMuerteSubitaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonTorneoMuerteSubitaMouseExited(evt);
            }
        });
        botonTorneoMuerteSubita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel122.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("CREAR TORNEO");
        botonTorneoMuerteSubita.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel35.setBackground(new java.awt.Color(30, 25, 161));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel123.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("CREAR TORNEO");
        jPanel35.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonTorneoMuerteSubita.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel9.add(botonTorneoMuerteSubita, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 130, 40));

        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trofeoWimbledon.png"))); // NOI18N
        jLabel125.setToolTipText("");
        jLabel125.setAutoscrolls(true);
        jPanel9.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 230, 150));

        jLabel110.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("CREAR TORNEO");
        jPanel9.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel115.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(153, 153, 153));
        jLabel115.setText("Formato Liga");
        jPanel9.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 60));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TrofeoUSOpen.jpg"))); // NOI18N
        jLabel116.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel9.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 240, 150));

        jLabel118.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(153, 153, 153));
        jLabel118.setText("Fase de grupos");
        jPanel9.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 60));

        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trofeoATPFinals.jpg"))); // NOI18N
        jLabel119.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel9.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 230, 180));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel9.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 315, 389));

        jLabel124.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(153, 153, 153));
        jLabel124.setText("SUBITA");
        jPanel9.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, -1, 60));

        botonFormatoLiga.setBackground(new java.awt.Color(30, 25, 161));
        botonFormatoLiga.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonFormatoLigaMouseMoved(evt);
            }
        });
        botonFormatoLiga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonFormatoLigaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonFormatoLigaMouseExited(evt);
            }
        });
        botonFormatoLiga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel126.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setText("CREAR TORNEO");
        botonFormatoLiga.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel37.setBackground(new java.awt.Color(30, 25, 161));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel127.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setText("CREAR TORNEO");
        jPanel37.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonFormatoLiga.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel9.add(botonFormatoLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 130, 40));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel9.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 315, 389));

        jLabel128.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(153, 153, 153));
        jLabel128.setText("Escoge el formato de TU torneo...");
        jPanel9.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 60));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel9.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel130.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(153, 153, 153));
        jLabel130.setText("Torneo a muerte");
        jPanel9.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, 60));

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel9.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 315, 389));

        pestania.addTab("tab9", jPanel9);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel131.setBackground(new java.awt.Color(51, 51, 51));
        jLabel131.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel131.setText("Ingresar CANTIDAD DE GRUPOS EN EL TORNEO:");
        jPanel13.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));
        jPanel13.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 10));
        jPanel13.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 490, 10));

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel13.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel136.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(153, 153, 153));
        jLabel136.setText("Configurar fase de grupos...");
        jPanel13.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        entradaCantidadJugadoresPorGrupo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCantidadJugadoresPorGrupo.setForeground(new java.awt.Color(153, 153, 153));
        entradaCantidadJugadoresPorGrupo.setText("Ingresar un numero");
        entradaCantidadJugadoresPorGrupo.setBorder(null);
        entradaCantidadJugadoresPorGrupo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresPorGrupoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresPorGrupoFocusLost(evt);
            }
        });
        entradaCantidadJugadoresPorGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCantidadJugadoresPorGrupoActionPerformed(evt);
            }
        });
        jPanel13.add(entradaCantidadJugadoresPorGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jLabel137.setBackground(new java.awt.Color(51, 51, 51));
        jLabel137.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel137.setText("INGRESAR CANTIDAD DE JUGADORES/DUPLAS/equipos POR GRUPO: ");
        jPanel13.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, 30));

        ingresarCantidadDeGrupos.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        ingresarCantidadDeGrupos.setForeground(new java.awt.Color(153, 153, 153));
        ingresarCantidadDeGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dos grupos", "Tres grupos", "Cuatro grupos", "Cinco grupos", "Seis grupos" }));
        ingresarCantidadDeGrupos.setToolTipText("");
        ingresarCantidadDeGrupos.setBorder(null);
        ingresarCantidadDeGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarCantidadDeGruposActionPerformed(evt);
            }
        });
        jPanel13.add(ingresarCantidadDeGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 350, 30));

        botonSeguirFaseGrupos.setBackground(new java.awt.Color(30, 25, 161));
        botonSeguirFaseGrupos.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirFaseGrupos.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirFaseGrupos.setText("crear torneo");
        botonSeguirFaseGrupos.setBorder(null);
        botonSeguirFaseGrupos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirFaseGruposMouseMoved(evt);
            }
        });
        botonSeguirFaseGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirFaseGruposMouseExited(evt);
            }
        });
        botonSeguirFaseGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirFaseGruposActionPerformed(evt);
            }
        });
        jPanel13.add(botonSeguirFaseGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 140, 40));

        botonRegresarConfigurarFaseGrupos.setBackground(new java.awt.Color(30, 25, 161));
        botonRegresarConfigurarFaseGrupos.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarConfigurarFaseGrupos.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarConfigurarFaseGrupos.setText("REGRESAR");
        botonRegresarConfigurarFaseGrupos.setBorder(null);
        botonRegresarConfigurarFaseGrupos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarConfigurarFaseGruposMouseMoved(evt);
            }
        });
        botonRegresarConfigurarFaseGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarConfigurarFaseGruposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegresarConfigurarFaseGruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarConfigurarFaseGruposMouseExited(evt);
            }
        });
        botonRegresarConfigurarFaseGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarConfigurarFaseGruposActionPerformed(evt);
            }
        });
        jPanel13.add(botonRegresarConfigurarFaseGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 140, 40));

        jLabel138.setBackground(new java.awt.Color(51, 51, 51));
        jLabel138.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel138.setText("INGRESAR cuantos pasaran a la ronda de eliminacion driecta: ");
        jPanel13.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, 30));

        entradaCantidadJugadoresEliminacionDirecta.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCantidadJugadoresEliminacionDirecta.setForeground(new java.awt.Color(153, 153, 153));
        entradaCantidadJugadoresEliminacionDirecta.setText("Ingresar un numero");
        entradaCantidadJugadoresEliminacionDirecta.setBorder(null);
        entradaCantidadJugadoresEliminacionDirecta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresEliminacionDirectaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresEliminacionDirectaFocusLost(evt);
            }
        });
        entradaCantidadJugadoresEliminacionDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCantidadJugadoresEliminacionDirectaActionPerformed(evt);
            }
        });
        jPanel13.add(entradaCantidadJugadoresEliminacionDirecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));
        jPanel13.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 490, 10));

        pestania.addTab("tab10", jPanel13);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(1010, 1850));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaGeneralLiga.setAutoCreateRowSorter(true);
        tablaGeneralLiga.setBackground(new java.awt.Color(255, 255, 255));
        tablaGeneralLiga.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaGeneralLiga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false, true, true, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaGeneralLiga.setAutoscrolls(false);
        tablaGeneralLiga.setGridColor(new java.awt.Color(0, 0, 255));
        tablaGeneralLiga.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane36.setViewportView(tablaGeneralLiga);

        jPanel16.add(jScrollPane36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, 390));

        jSeparator27.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel134.setBackground(new java.awt.Color(255, 255, 255));
        jLabel134.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel134.setText("tabla general");
        jPanel16.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        nombreTorneoCero.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        nombreTorneoCero.setForeground(new java.awt.Color(30, 25, 161));
        nombreTorneoCero.setText(currentTournament.getTournamentName());
        jPanel16.add(nombreTorneoCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 770, 60));

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel16.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel143.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(153, 153, 153));
        jLabel143.setText("Bienvenido al torneo");
        jPanel16.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        actuGeneralTable.setBackground(new java.awt.Color(30, 25, 161));
        actuGeneralTable.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        actuGeneralTable.setForeground(new java.awt.Color(255, 255, 255));
        actuGeneralTable.setText("Guardar cambios");
        actuGeneralTable.setBorder(null);
        actuGeneralTable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                actuGeneralTableMouseMoved(evt);
            }
        });
        actuGeneralTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actuGeneralTableMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actuGeneralTableMouseExited(evt);
            }
        });
        actuGeneralTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuGeneralTableActionPerformed(evt);
            }
        });
        jPanel16.add(actuGeneralTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 140, 40));

        pestania.addTab("tab11", jPanel16);

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setBorder(null);
        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(1010, 1850));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadoresAgregados1.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados1.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados1.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados1.setAutoscrolls(false);
        tablaJugadoresAgregados1.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados1.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane10.setViewportView(tablaJugadoresAgregados1);

        jPanel17.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel139.setBackground(new java.awt.Color(255, 255, 255));
        jLabel139.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel139.setText("grupo a");
        jPanel17.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        tablaJugadoresAgregados2.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados2.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados2.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados2.setAutoscrolls(false);
        tablaJugadoresAgregados2.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados2.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane11.setViewportView(tablaJugadoresAgregados2);

        jPanel17.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 940, 30));

        jLabel140.setBackground(new java.awt.Color(255, 255, 255));
        jLabel140.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel140.setText("grupo b");
        jPanel17.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, 60));

        tablaJugadoresAgregados3.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados3.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados3.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados3.setAutoscrolls(false);
        tablaJugadoresAgregados3.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados3.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane12.setViewportView(tablaJugadoresAgregados3);

        jPanel17.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1360, 940, 430));

        jSeparator35.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1340, 940, 30));

        jLabel144.setBackground(new java.awt.Color(255, 255, 255));
        jLabel144.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel144.setText("Tabla General");
        jPanel17.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1290, -1, 60));

        nombreTorneoUno.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        nombreTorneoUno.setForeground(new java.awt.Color(30, 25, 161));
        nombreTorneoUno.setText(currentTournament.getTournamentName());
        jPanel17.add(nombreTorneoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 770, 60));

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel17.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel244.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel244.setForeground(new java.awt.Color(153, 153, 153));
        jLabel244.setText("Bienvenido al torneo");
        jPanel17.add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        actuGeneralTableUno.setBackground(new java.awt.Color(30, 25, 161));
        actuGeneralTableUno.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        actuGeneralTableUno.setForeground(new java.awt.Color(255, 255, 255));
        actuGeneralTableUno.setText("Guardar cambios");
        actuGeneralTableUno.setBorder(null);
        actuGeneralTableUno.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                actuGeneralTableUnoMouseMoved(evt);
            }
        });
        actuGeneralTableUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actuGeneralTableUnoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actuGeneralTableUnoMouseExited(evt);
            }
        });
        actuGeneralTableUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuGeneralTableUnoActionPerformed(evt);
            }
        });
        jPanel17.add(actuGeneralTableUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1290, 140, 40));

        jPanel3.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 1800));

        jScrollPane9.setViewportView(jPanel3);

        pestania.addTab("tab12", jScrollPane9);

        jScrollPane13.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane13.setBorder(null);
        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setPreferredSize(new java.awt.Dimension(1010, 2397));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadoresAgregados4.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados4.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados4.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados4.setAutoscrolls(false);
        tablaJugadoresAgregados4.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados4.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane14.setViewportView(tablaJugadoresAgregados4);

        jPanel26.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, -1));

        jSeparator40.setForeground(new java.awt.Color(0, 0, 0));
        jPanel26.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel245.setBackground(new java.awt.Color(255, 255, 255));
        jLabel245.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel245.setText("grupo a");
        jPanel26.add(jLabel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        tablaJugadoresAgregados5.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados5.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados5.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados5.setAutoscrolls(false);
        tablaJugadoresAgregados5.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados5.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane15.setViewportView(tablaJugadoresAgregados5);

        jPanel26.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        jSeparator43.setForeground(new java.awt.Color(0, 0, 0));
        jPanel26.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 940, 30));

        jLabel246.setBackground(new java.awt.Color(255, 255, 255));
        jLabel246.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel246.setText("grupo b");
        jPanel26.add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, 60));

        nombreTorneoDos.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        nombreTorneoDos.setForeground(new java.awt.Color(30, 25, 161));
        nombreTorneoDos.setText(currentTournament.getTournamentName());
        jPanel26.add(nombreTorneoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 770, 60));

        jLabel248.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel26.add(jLabel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel249.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel249.setForeground(new java.awt.Color(153, 153, 153));
        jLabel249.setText("Bienvenido al torneo");
        jPanel26.add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        tablaJugadoresAgregados7.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados7.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados7.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados7.setAutoscrolls(false);
        tablaJugadoresAgregados7.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados7.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane16.setViewportView(tablaJugadoresAgregados7);

        jPanel26.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        tablaJugadoresAgregados8.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados8.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados8.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados8.setAutoscrolls(false);
        tablaJugadoresAgregados8.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados8.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane17.setViewportView(tablaJugadoresAgregados8);

        jPanel26.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1370, 940, -1));

        jSeparator44.setForeground(new java.awt.Color(0, 0, 0));
        jPanel26.add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1350, 940, 30));

        jLabel250.setBackground(new java.awt.Color(255, 255, 255));
        jLabel250.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel250.setText("Grupo C");
        jPanel26.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1300, -1, 60));

        tablaJugadoresAgregados9.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados9.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados9.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados9.setAutoscrolls(false);
        tablaJugadoresAgregados9.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados9.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane18.setViewportView(tablaJugadoresAgregados9);

        jPanel26.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1920, 940, -1));

        jSeparator45.setForeground(new java.awt.Color(0, 0, 0));
        jPanel26.add(jSeparator45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1900, 940, 30));

        jLabel251.setBackground(new java.awt.Color(255, 255, 255));
        jLabel251.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel251.setText("TABLA GENERAL");
        jPanel26.add(jLabel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1850, -1, 60));

        jPanel18.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1030, 2400));

        jScrollPane13.setViewportView(jPanel18);

        pestania.addTab("tab13", jScrollPane13);

        jScrollPane19.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane19.setBorder(null);
        jScrollPane19.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane19.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setPreferredSize(new java.awt.Dimension(11010, 3000));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadoresAgregados6.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados6.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados6.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados6.setAutoscrolls(false);
        tablaJugadoresAgregados6.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados6.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane20.setViewportView(tablaJugadoresAgregados6);

        jPanel28.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, -1));

        jSeparator46.setForeground(new java.awt.Color(0, 0, 0));
        jPanel28.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel252.setBackground(new java.awt.Color(255, 255, 255));
        jLabel252.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel252.setText("grupo a");
        jPanel28.add(jLabel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        tablaJugadoresAgregados10.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados10.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados10.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados10.setAutoscrolls(false);
        tablaJugadoresAgregados10.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados10.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane21.setViewportView(tablaJugadoresAgregados10);

        jPanel28.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        jSeparator47.setForeground(new java.awt.Color(0, 0, 0));
        jPanel28.add(jSeparator47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 940, 30));

        jLabel253.setBackground(new java.awt.Color(255, 255, 255));
        jLabel253.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel253.setText("grupo b");
        jPanel28.add(jLabel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, 60));

        nombreTorneoTres.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        nombreTorneoTres.setForeground(new java.awt.Color(30, 25, 161));
        nombreTorneoTres.setText(currentTournament.getTournamentName());
        jPanel28.add(nombreTorneoTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 760, 60));

        jLabel255.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel28.add(jLabel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel256.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel256.setForeground(new java.awt.Color(153, 153, 153));
        jLabel256.setText("Bienvenido al torneo");
        jPanel28.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        tablaJugadoresAgregados11.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados11.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados11.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados11.setAutoscrolls(false);
        tablaJugadoresAgregados11.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados11.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane22.setViewportView(tablaJugadoresAgregados11);

        jPanel28.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        tablaJugadoresAgregados12.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados12.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados12.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados12.setAutoscrolls(false);
        tablaJugadoresAgregados12.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados12.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane23.setViewportView(tablaJugadoresAgregados12);

        jPanel28.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1370, 940, -1));

        jSeparator48.setForeground(new java.awt.Color(0, 0, 0));
        jPanel28.add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1350, 940, 30));

        jLabel257.setBackground(new java.awt.Color(255, 255, 255));
        jLabel257.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel257.setText("Grupo C");
        jPanel28.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1300, -1, 60));

        tablaJugadoresAgregados13.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados13.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados13.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados13.setAutoscrolls(false);
        tablaJugadoresAgregados13.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados13.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane24.setViewportView(tablaJugadoresAgregados13);

        jPanel28.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1920, 940, -1));

        jSeparator49.setForeground(new java.awt.Color(0, 0, 0));
        jPanel28.add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1900, 940, 30));

        jLabel258.setBackground(new java.awt.Color(255, 255, 255));
        jLabel258.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel258.setText("gRUPO D");
        jPanel28.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1850, -1, 60));

        tablaJugadoresAgregados14.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados14.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados14.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados14.setAutoscrolls(false);
        tablaJugadoresAgregados14.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados14.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane25.setViewportView(tablaJugadoresAgregados14);

        jPanel28.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2480, 940, 470));

        jSeparator50.setForeground(new java.awt.Color(0, 0, 0));
        jPanel28.add(jSeparator50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2460, 940, 30));

        jLabel259.setBackground(new java.awt.Color(255, 255, 255));
        jLabel259.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel259.setText("TABLA GENERAL");
        jPanel28.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2410, -1, 60));

        actuGeneralTableUno1.setBackground(new java.awt.Color(30, 25, 161));
        actuGeneralTableUno1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        actuGeneralTableUno1.setForeground(new java.awt.Color(255, 255, 255));
        actuGeneralTableUno1.setText("Guardar cambios");
        actuGeneralTableUno1.setBorder(null);
        actuGeneralTableUno1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                actuGeneralTableUno1MouseMoved(evt);
            }
        });
        actuGeneralTableUno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actuGeneralTableUno1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actuGeneralTableUno1MouseExited(evt);
            }
        });
        actuGeneralTableUno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuGeneralTableUno1ActionPerformed(evt);
            }
        });
        jPanel28.add(actuGeneralTableUno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 2410, 140, 40));

        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 3000));

        jScrollPane19.setViewportView(jPanel27);

        pestania.addTab("tab14", jScrollPane19);

        jScrollPane26.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane26.setBorder(null);
        jScrollPane26.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane26.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setPreferredSize(new java.awt.Dimension(11010, 3500));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadoresAgregados15.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados15.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados15.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados15.setAutoscrolls(false);
        tablaJugadoresAgregados15.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados15.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane27.setViewportView(tablaJugadoresAgregados15);

        jPanel52.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, -1));

        jSeparator51.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel260.setBackground(new java.awt.Color(255, 255, 255));
        jLabel260.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel260.setText("grupo a");
        jPanel52.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        tablaJugadoresAgregados16.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados16.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados16.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados16.setAutoscrolls(false);
        tablaJugadoresAgregados16.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados16.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane28.setViewportView(tablaJugadoresAgregados16);

        jPanel52.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        jSeparator52.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 940, 30));

        jLabel261.setBackground(new java.awt.Color(255, 255, 255));
        jLabel261.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel261.setText("grupo b");
        jPanel52.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, 60));

        nombreTorneoCuatro.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        nombreTorneoCuatro.setForeground(new java.awt.Color(30, 25, 161));
        nombreTorneoCuatro.setText(currentTournament.getTournamentName());
        jPanel52.add(nombreTorneoCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 760, 60));

        jLabel263.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel52.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel264.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel264.setForeground(new java.awt.Color(153, 153, 153));
        jLabel264.setText("Bienvenido al torneo");
        jPanel52.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        tablaJugadoresAgregados17.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados17.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados17.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados17.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados17.setAutoscrolls(false);
        tablaJugadoresAgregados17.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados17.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane29.setViewportView(tablaJugadoresAgregados17);

        jPanel52.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        tablaJugadoresAgregados18.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados18.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados18.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados18.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados18.setAutoscrolls(false);
        tablaJugadoresAgregados18.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados18.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane30.setViewportView(tablaJugadoresAgregados18);

        jPanel52.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1370, 940, -1));

        jSeparator53.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1350, 940, 30));

        jLabel265.setBackground(new java.awt.Color(255, 255, 255));
        jLabel265.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel265.setText("Grupo C");
        jPanel52.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1300, -1, 60));

        jSeparator54.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1900, 940, 30));

        jLabel266.setBackground(new java.awt.Color(255, 255, 255));
        jLabel266.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel266.setText("gRUPO D");
        jPanel52.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1850, -1, 60));

        tablaJugadoresAgregados20.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados20.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados20.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados20.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados20.setAutoscrolls(false);
        tablaJugadoresAgregados20.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados20.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane31.setViewportView(tablaJugadoresAgregados20);

        jPanel52.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2990, 940, 470));

        jSeparator55.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2970, 940, 30));

        jLabel267.setBackground(new java.awt.Color(255, 255, 255));
        jLabel267.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel267.setText("TABLA GENERAL");
        jPanel52.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2920, -1, 60));

        tablaJugadoresAgregados21.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados21.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados21.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados21.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados21.setAutoscrolls(false);
        tablaJugadoresAgregados21.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados21.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane32.setViewportView(tablaJugadoresAgregados21);

        jPanel52.add(jScrollPane32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1920, 940, -1));

        tablaJugadoresAgregados22.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados22.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados22.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados22.setAutoscrolls(false);
        tablaJugadoresAgregados22.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados22.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane33.setViewportView(tablaJugadoresAgregados22);

        jPanel52.add(jScrollPane33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2440, 940, -1));

        jSeparator56.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2420, 940, 30));

        jLabel268.setBackground(new java.awt.Color(255, 255, 255));
        jLabel268.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel268.setText("Grupo E");
        jPanel52.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2370, -1, 60));

        actuGeneralTableUno2.setBackground(new java.awt.Color(30, 25, 161));
        actuGeneralTableUno2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        actuGeneralTableUno2.setForeground(new java.awt.Color(255, 255, 255));
        actuGeneralTableUno2.setText("Guardar cambios");
        actuGeneralTableUno2.setBorder(null);
        actuGeneralTableUno2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                actuGeneralTableUno2MouseMoved(evt);
            }
        });
        actuGeneralTableUno2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actuGeneralTableUno2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actuGeneralTableUno2MouseExited(evt);
            }
        });
        actuGeneralTableUno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuGeneralTableUno2ActionPerformed(evt);
            }
        });
        jPanel52.add(actuGeneralTableUno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 2920, 140, 40));

        jPanel33.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 3500));

        jScrollPane26.setViewportView(jPanel33);

        pestania.addTab("tab15", jScrollPane26);

        jScrollPane43.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane43.setBorder(null);
        jScrollPane43.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane43.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jPanel56.setPreferredSize(new java.awt.Dimension(11010, 4000));
        jPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadoresAgregados19.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados19.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados19.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados19.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados19.setAutoscrolls(false);
        tablaJugadoresAgregados19.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados19.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane44.setViewportView(tablaJugadoresAgregados19);

        jPanel56.add(jScrollPane44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, -1));

        jSeparator63.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel278.setBackground(new java.awt.Color(255, 255, 255));
        jLabel278.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel278.setText("grupo a");
        jPanel56.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        tablaJugadoresAgregados23.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados23.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados23.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados23.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados23.setAutoscrolls(false);
        tablaJugadoresAgregados23.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados23.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane45.setViewportView(tablaJugadoresAgregados23);

        jPanel56.add(jScrollPane45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        jSeparator64.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 940, 30));

        jLabel279.setBackground(new java.awt.Color(255, 255, 255));
        jLabel279.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel279.setText("grupo b");
        jPanel56.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, 60));

        nombreTorneoCinco.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        nombreTorneoCinco.setForeground(new java.awt.Color(30, 25, 161));
        nombreTorneoCinco.setText(currentTournament.getTournamentName());
        jPanel56.add(nombreTorneoCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 760, 60));

        jLabel281.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel56.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel282.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel282.setForeground(new java.awt.Color(153, 153, 153));
        jLabel282.setText("Bienvenido al torneo");
        jPanel56.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        tablaJugadoresAgregados24.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados24.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados24.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados24.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados24.setAutoscrolls(false);
        tablaJugadoresAgregados24.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados24.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane46.setViewportView(tablaJugadoresAgregados24);

        jPanel56.add(jScrollPane46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        tablaJugadoresAgregados25.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados25.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados25.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados25.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados25.setAutoscrolls(false);
        tablaJugadoresAgregados25.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados25.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane47.setViewportView(tablaJugadoresAgregados25);

        jPanel56.add(jScrollPane47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1370, 940, -1));

        jSeparator65.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator65, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1350, 940, 30));

        jLabel283.setBackground(new java.awt.Color(255, 255, 255));
        jLabel283.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel283.setText("Grupo C");
        jPanel56.add(jLabel283, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1300, -1, 60));

        jSeparator66.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1900, 940, 30));

        jLabel284.setBackground(new java.awt.Color(255, 255, 255));
        jLabel284.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel284.setText("gRUPO D");
        jPanel56.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1850, -1, 60));

        tablaJugadoresAgregados26.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados26.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados26.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados26.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados26.setAutoscrolls(false);
        tablaJugadoresAgregados26.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados26.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane48.setViewportView(tablaJugadoresAgregados26);

        jPanel56.add(jScrollPane48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 3500, 940, 470));

        jSeparator67.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 3480, 940, 30));

        jLabel285.setBackground(new java.awt.Color(255, 255, 255));
        jLabel285.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel285.setText("TABLA GENERAL");
        jPanel56.add(jLabel285, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3430, -1, 60));

        tablaJugadoresAgregados27.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados27.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados27.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados27.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados27.setAutoscrolls(false);
        tablaJugadoresAgregados27.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados27.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane49.setViewportView(tablaJugadoresAgregados27);

        jPanel56.add(jScrollPane49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1920, 940, -1));

        tablaJugadoresAgregados28.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados28.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados28.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados28.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados28.setAutoscrolls(false);
        tablaJugadoresAgregados28.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados28.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane34.setViewportView(tablaJugadoresAgregados28);

        jPanel56.add(jScrollPane34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2440, 940, -1));

        jSeparator68.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2420, 940, 30));

        jLabel286.setBackground(new java.awt.Color(255, 255, 255));
        jLabel286.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel286.setText("Grupo E");
        jPanel56.add(jLabel286, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2370, -1, 60));

        tablaJugadoresAgregados29.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados29.setBackground(new java.awt.Color(255, 255, 255));
        tablaJugadoresAgregados29.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados29.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados29.setAutoscrolls(false);
        tablaJugadoresAgregados29.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados29.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane35.setViewportView(tablaJugadoresAgregados29);

        jPanel56.add(jScrollPane35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2970, 940, -1));

        jSeparator69.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2950, 940, 30));

        jLabel287.setBackground(new java.awt.Color(255, 255, 255));
        jLabel287.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel287.setText("Grupo F");
        jPanel56.add(jLabel287, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2900, -1, 60));

        actuGeneralTableUno3.setBackground(new java.awt.Color(30, 25, 161));
        actuGeneralTableUno3.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        actuGeneralTableUno3.setForeground(new java.awt.Color(255, 255, 255));
        actuGeneralTableUno3.setText("Guardar cambios");
        actuGeneralTableUno3.setBorder(null);
        actuGeneralTableUno3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                actuGeneralTableUno3MouseMoved(evt);
            }
        });
        actuGeneralTableUno3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actuGeneralTableUno3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actuGeneralTableUno3MouseExited(evt);
            }
        });
        actuGeneralTableUno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuGeneralTableUno3ActionPerformed(evt);
            }
        });
        jPanel56.add(actuGeneralTableUno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 3430, 140, 40));

        jPanel55.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 4000));

        jScrollPane43.setViewportView(jPanel55);

        pestania.addTab("tab16", jScrollPane43);

        jPanel1.add(pestania, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 1010, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void botonMenuCrearTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuCrearTorneoMouseClicked
        pestania.setSelectedIndex(0);
        tituloSuperior.setText("Crear Torneo");
        iconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneoMasGrande.png")));
    }//GEN-LAST:event_botonMenuCrearTorneoMouseClicked

    private void botonMenuCrearTorneoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuCrearTorneoMouseMoved
        changePanelColor(botonMenuCrearTorneo,250,250,250);
    }//GEN-LAST:event_botonMenuCrearTorneoMouseMoved

    private void botonMenuCrearTorneoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuCrearTorneoMouseExited
        changePanelColor(botonMenuCrearTorneo,204,204,255);
    }//GEN-LAST:event_botonMenuCrearTorneoMouseExited

    private void botonMenuVerTorneosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuVerTorneosMouseClicked
        pestania.setSelectedIndex(1);
        tituloSuperior.setText("Ver Torneos en curso");
        iconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneoEnCursoMasGrande.png")));
    }//GEN-LAST:event_botonMenuVerTorneosMouseClicked

    private void botonMenuVerTorneosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuVerTorneosMouseMoved
        changePanelColor(botonMenuVerTorneos,250,250,250);
    }//GEN-LAST:event_botonMenuVerTorneosMouseMoved

    private void botonMenuVerTorneosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuVerTorneosMouseExited
        changePanelColor(botonMenuVerTorneos,204,204,255);
    }//GEN-LAST:event_botonMenuVerTorneosMouseExited

    private void botonMenuBuscarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuBuscarJugadorMouseClicked
        pestania.setSelectedIndex(2);
        tituloSuperior.setText("Buscar Jugador");
        iconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoBuscarJugador.png")));
        organizator.loadPlayerList(playersListTable);
    }//GEN-LAST:event_botonMenuBuscarJugadorMouseClicked

    private void botonMenuBuscarJugadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuBuscarJugadorMouseMoved
        changePanelColor(botonMenuBuscarJugador,250,250,250);
    }//GEN-LAST:event_botonMenuBuscarJugadorMouseMoved

    private void botonMenuBuscarJugadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuBuscarJugadorMouseExited
        changePanelColor(botonMenuBuscarJugador,204,204,255);
    }//GEN-LAST:event_botonMenuBuscarJugadorMouseExited

    private void botonSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalidaMouseClicked
        organizator.updateJsonOrganizator();
        System.exit(0);
    }//GEN-LAST:event_botonSalidaMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void NombreOrganizadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreOrganizadorMouseMoved
        NombreOrganizador.setText("ORGANIZADOR");
    }//GEN-LAST:event_NombreOrganizadorMouseMoved

    private void NombreOrganizadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreOrganizadorMouseExited
        NombreOrganizador.setText(organizator.getName());
    }//GEN-LAST:event_NombreOrganizadorMouseExited

    private void actuGeneralTableUno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuGeneralTableUno3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno3ActionPerformed

    private void actuGeneralTableUno3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUno3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno3MouseExited

    private void actuGeneralTableUno3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUno3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno3MouseClicked

    private void actuGeneralTableUno3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUno3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno3MouseMoved

    private void actuGeneralTableUno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuGeneralTableUno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno2ActionPerformed

    private void actuGeneralTableUno2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUno2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno2MouseExited

    private void actuGeneralTableUno2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUno2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno2MouseClicked

    private void actuGeneralTableUno2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUno2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno2MouseMoved

    private void actuGeneralTableUno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuGeneralTableUno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno1ActionPerformed

    private void actuGeneralTableUno1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUno1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno1MouseExited

    private void actuGeneralTableUno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUno1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno1MouseClicked

    private void actuGeneralTableUno1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUno1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUno1MouseMoved

    private void actuGeneralTableUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuGeneralTableUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUnoActionPerformed

    private void actuGeneralTableUnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUnoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUnoMouseExited

    private void actuGeneralTableUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUnoMouseClicked
        saveDataPlayerTable(tablaGeneralLiga, currentTournament);
        organizator.updatePlayers();
    }//GEN-LAST:event_actuGeneralTableUnoMouseClicked

    private void actuGeneralTableUnoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableUnoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableUnoMouseMoved

    private void actuGeneralTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuGeneralTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actuGeneralTableActionPerformed

    private void actuGeneralTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableMouseExited
        changeButtonColor(actuGeneralTable,30,25,161);
    }//GEN-LAST:event_actuGeneralTableMouseExited

    private void actuGeneralTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableMouseClicked
        saveDataPlayerTable(tablaGeneralLiga, currentTournament);
        organizator.updatePlayers();
    }//GEN-LAST:event_actuGeneralTableMouseClicked

    private void actuGeneralTableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuGeneralTableMouseMoved
        changeButtonColor(actuGeneralTable,102,102,255);
    }//GEN-LAST:event_actuGeneralTableMouseMoved

    private void entradaCantidadJugadoresEliminacionDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresEliminacionDirectaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCantidadJugadoresEliminacionDirectaActionPerformed

    private void entradaCantidadJugadoresEliminacionDirectaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresEliminacionDirectaFocusLost
        organizatorFocusLost (entradaCantidadJugadoresEliminacionDirecta, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresEliminacionDirectaFocusLost

    private void entradaCantidadJugadoresEliminacionDirectaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresEliminacionDirectaFocusGained
        organizatorFocusGained (entradaCantidadJugadoresEliminacionDirecta, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresEliminacionDirectaFocusGained

    private void botonRegresarConfigurarFaseGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarConfigurarFaseGruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarConfigurarFaseGruposActionPerformed

    private void botonRegresarConfigurarFaseGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarConfigurarFaseGruposMouseExited
        changeButtonColor(botonRegresarConfigurarFaseGrupos,30,25,161);
    }//GEN-LAST:event_botonRegresarConfigurarFaseGruposMouseExited

    private void botonRegresarConfigurarFaseGruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarConfigurarFaseGruposMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarConfigurarFaseGruposMouseEntered

    private void botonRegresarConfigurarFaseGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarConfigurarFaseGruposMouseClicked
        pestania.setSelectedIndex(8);
    }//GEN-LAST:event_botonRegresarConfigurarFaseGruposMouseClicked

    private void botonRegresarConfigurarFaseGruposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarConfigurarFaseGruposMouseMoved
        changeButtonColor(botonRegresarConfigurarFaseGrupos,102,102,255);
    }//GEN-LAST:event_botonRegresarConfigurarFaseGruposMouseMoved

    private void botonSeguirFaseGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirFaseGruposActionPerformed
        List<Group> groupList = new ArrayList<>();
        int numberGroups = organizatorGetNumberOfGroupsJComboBox(ingresarCantidadDeGrupos);
        newTournament.setGroupsList(groupList);
        newTournament.setGroupsNumber(numberGroups);
        newTournament.createGroups();
        newTournament.drawGroups();
        organizator.getTournamentList().add(newTournament);
        newTournament.addTournamentsJson();
        pestania.setSelectedIndex(1);
    }//GEN-LAST:event_botonSeguirFaseGruposActionPerformed

    private void botonSeguirFaseGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirFaseGruposMouseExited
        changeButtonColor(botonSeguirFaseGrupos,30,25,161);
    }//GEN-LAST:event_botonSeguirFaseGruposMouseExited

    private void botonSeguirFaseGruposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirFaseGruposMouseMoved
        changeButtonColor(botonSeguirFaseGrupos,102,102,255);
    }//GEN-LAST:event_botonSeguirFaseGruposMouseMoved

    private void ingresarCantidadDeGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarCantidadDeGruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarCantidadDeGruposActionPerformed

    private void entradaCantidadJugadoresPorGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresPorGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCantidadJugadoresPorGrupoActionPerformed

    private void entradaCantidadJugadoresPorGrupoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresPorGrupoFocusLost
        organizatorFocusLost (entradaCantidadJugadoresPorGrupo, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresPorGrupoFocusLost

    private void entradaCantidadJugadoresPorGrupoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresPorGrupoFocusGained
        organizatorFocusGained (entradaCantidadJugadoresPorGrupo, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresPorGrupoFocusGained

    private void botonFormatoLigaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFormatoLigaMouseExited
        changePanelColor(botonFormatoLiga,30,25,161);
    }//GEN-LAST:event_botonFormatoLigaMouseExited

    private void botonFormatoLigaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFormatoLigaMouseClicked
        pestania.setSelectedIndex(1);
        newTournament.setGroupsNumber(1);
        newTournament.ticketsForPlayOffJComboBox(ingresarRondaEliminacionDirecta);
        organizator.getTournamentList().add(newTournament);
        newTournament.addTournamentsJson();
    }//GEN-LAST:event_botonFormatoLigaMouseClicked

    private void botonFormatoLigaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFormatoLigaMouseMoved
        changePanelColor(botonFormatoLiga,102,102,255);
    }//GEN-LAST:event_botonFormatoLigaMouseMoved

    private void botonTorneoMuerteSubitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTorneoMuerteSubitaMouseExited
        changePanelColor(botonTorneoMuerteSubita,30,25,161);
    }//GEN-LAST:event_botonTorneoMuerteSubitaMouseExited

    private void botonTorneoMuerteSubitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTorneoMuerteSubitaMouseClicked
        pestania.setSelectedIndex(1);
        newTournament.setGroupsNumber(1);
        newTournament.ticketsForPlayOffJComboBox(ingresarRondaEliminacionDirecta);
        organizator.getTournamentList().add(newTournament);
        newTournament.addTournamentsJson();
    }//GEN-LAST:event_botonTorneoMuerteSubitaMouseClicked

    private void botonTorneoMuerteSubitaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTorneoMuerteSubitaMouseMoved
        changePanelColor(botonTorneoMuerteSubita,102,102,255);
    }//GEN-LAST:event_botonTorneoMuerteSubitaMouseMoved

    private void botonConfigurarFaseGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfigurarFaseGruposMouseExited
        changePanelColor(botonConfigurarFaseGrupos,30,25,161);
    }//GEN-LAST:event_botonConfigurarFaseGruposMouseExited

    private void botonConfigurarFaseGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfigurarFaseGruposMouseClicked
        pestania.setSelectedIndex(9);
    }//GEN-LAST:event_botonConfigurarFaseGruposMouseClicked

    private void botonConfigurarFaseGruposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfigurarFaseGruposMouseMoved
        changePanelColor(botonConfigurarFaseGrupos,102,102,255);
    }//GEN-LAST:event_botonConfigurarFaseGruposMouseMoved

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        try{
            Player player = organizator.searchPlayer(entradaCedulaCapitan);
            player.showPlayerInformation(entradaNombreCapitan, entradaNumeroTelefonoCapitan, entradaFechaNacimientoCapitan, entradaCedulaCapitan, entradaCorreoCapitan, entradaNombreEquipo);
        } catch (NullPointerException error) {
            System.err.println("AVISO. No se encontro el jugador en la lista global");
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void opcionesCategoriaCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriaCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionesCategoriaCapitanActionPerformed

    private void entradaFechaNacimientoCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoCapitanActionPerformed

    private void entradaFechaNacimientoCapitanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoCapitanFocusLost
        organizatorFocusLost (entradaFechaNacimientoCapitan, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoCapitanFocusLost

    private void entradaFechaNacimientoCapitanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoCapitanFocusGained
        organizatorFocusGained (entradaFechaNacimientoCapitan, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoCapitanFocusGained

    private void botonSeguirEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirEquipoActionPerformed

    private void botonSeguirEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirEquipoMouseExited
        changeButtonColor(botonSeguirEquipo,30,25,161);
    }//GEN-LAST:event_botonSeguirEquipoMouseExited

    private void botonSeguirEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirEquipoMouseClicked
        pestania.setSelectedIndex(8);
    }//GEN-LAST:event_botonSeguirEquipoMouseClicked

    private void botonSeguirEquipoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirEquipoMouseMoved
        changeButtonColor(botonSeguirEquipo,102,102,255);
    }//GEN-LAST:event_botonSeguirEquipoMouseMoved

    private void botonAgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarEquipoActionPerformed
        Team team = new Team();
        team.getCaptain().readPlayer(entradaNombreCapitan, entradaCedulaCapitan, entradaNumeroTelefonoCapitan, entradaCorreoCapitan, opcionesCategoriaCapitan, entradaNombreEquipo, entradaFechaNacimientoCapitan);
        team.addPlayerTable(tablaEquiposAgregados);
        newTournament.addPlayerTournament(team);
        if (team.getCaptain().validatePlayer()){
            team.addPlayerTable(tablaEquiposAgregados);
            if (organizator.findPlayer(team.getCaptain().getId()) == true){
                newTournament.addPlayerTournament(team);
                System.out.println("Equipo ingresado correctamente");
            } else{
                organizator.getPlayerList().add(team.getCaptain());
                team.getCaptain().addPlayersJson();
                newTournament.addPlayerTournament(team);
                System.out.println("Jugador nuevo registrado");
            }
        }
    }//GEN-LAST:event_botonAgregarEquipoActionPerformed

    private void botonAgregarEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarEquipoMouseExited
        changeButtonColor(botonAgregarEquipo,30,25,161);
    }//GEN-LAST:event_botonAgregarEquipoMouseExited

    private void botonAgregarEquipoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarEquipoMouseMoved
        changeButtonColor(botonAgregarEquipo,102,102,255);
    }//GEN-LAST:event_botonAgregarEquipoMouseMoved

    private void botonRegresarIngresarDatosEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosEquipoActionPerformed

    private void botonRegresarIngresarDatosEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosEquipoMouseExited
        changeButtonColor(botonRegresarIngresarDatosEquipo,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosEquipoMouseExited

    private void botonRegresarIngresarDatosEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosEquipoMouseClicked
        pestania.setSelectedIndex(4);
    }//GEN-LAST:event_botonRegresarIngresarDatosEquipoMouseClicked

    private void botonRegresarIngresarDatosEquipoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosEquipoMouseMoved
        changeButtonColor(botonRegresarIngresarDatosEquipo,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosEquipoMouseMoved

    private void entradaNombreEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreEquipoActionPerformed

    private void entradaNombreEquipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreEquipoFocusLost
        organizatorFocusLost (entradaNombreEquipo, "Ingresar nombre del equipo");
    }//GEN-LAST:event_entradaNombreEquipoFocusLost

    private void entradaNombreEquipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreEquipoFocusGained
        organizatorFocusGained (entradaNombreEquipo, "Ingresar nombre del equipo");
    }//GEN-LAST:event_entradaNombreEquipoFocusGained

    private void entradaCorreoCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCorreoCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCorreoCapitanActionPerformed

    private void entradaCorreoCapitanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCorreoCapitanFocusLost
        organizatorFocusLost (entradaCorreoCapitan, "Ingresar correo capitan");
    }//GEN-LAST:event_entradaCorreoCapitanFocusLost

    private void entradaCorreoCapitanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCorreoCapitanFocusGained
        organizatorFocusGained (entradaCorreoCapitan, "Ingresar correo capitan");
    }//GEN-LAST:event_entradaCorreoCapitanFocusGained

    private void entradaNumeroTelefonoCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumeroTelefonoCapitanActionPerformed

    private void entradaNumeroTelefonoCapitanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoCapitanFocusLost
        organizatorFocusLost (entradaNumeroTelefonoCapitan, "Ingresar numero de telefono del capitan");
    }//GEN-LAST:event_entradaNumeroTelefonoCapitanFocusLost

    private void entradaNumeroTelefonoCapitanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoCapitanFocusGained
        organizatorFocusGained (entradaNumeroTelefonoCapitan, "Ingresar numero de telefono del capitan");
    }//GEN-LAST:event_entradaNumeroTelefonoCapitanFocusGained

    private void entradaCedulaCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCedulaCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCedulaCapitanActionPerformed

    private void entradaCedulaCapitanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCedulaCapitanFocusLost
        organizatorFocusLost (entradaCedulaCapitan, "Ingresar numero de cedula capitan");
    }//GEN-LAST:event_entradaCedulaCapitanFocusLost

    private void entradaCedulaCapitanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCedulaCapitanFocusGained
        organizatorFocusGained (entradaCedulaCapitan, "Ingresar numero de cedula capitan");
    }//GEN-LAST:event_entradaCedulaCapitanFocusGained

    private void entradaNombreCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreCapitanActionPerformed

    private void entradaNombreCapitanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreCapitanFocusLost
        organizatorFocusLost (entradaNombreCapitan, "Ingresar nombre del capitan");
    }//GEN-LAST:event_entradaNombreCapitanFocusLost

    private void entradaNombreCapitanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreCapitanFocusGained
        organizatorFocusGained (entradaNombreCapitan, "Ingresar nombre del capitan");
    }//GEN-LAST:event_entradaNombreCapitanFocusGained

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        try{
            Player player = organizator.searchPlayer(entradaIdJugadorB);
            player.showPlayerInformation(entradaNombreJugadorB, entradaNumeroTelefonoJugadorB, entradaFechaNacimientoJugadorB, entradaIdJugadorB, entradaEmailJugadorB, entradaEquipoJugadorB);
        } catch (NullPointerException error) {
            System.err.println("AVISO. No se encontro el jugador en la lista global");
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try{
            Player player = organizator.searchPlayer(entradaIdJugadorA);
            player.showPlayerInformation(entradaNombreJugadorA, entradaNumeroTelefonoJugadorA, entradaFechaNacimientoJugadorA, entradaIdJugadorA, entradaEmailJugadorA, entradaEquipoJugadorA);
        } catch (NullPointerException error) {
            System.err.println("AVISO. No se encontro el jugador en la lista global");
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void opcionesCategoriaJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriaJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionesCategoriaJugadorBActionPerformed

    private void opcionesCategoriaJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriaJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionesCategoriaJugadorAActionPerformed

    private void entradaFechaNacimientoJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoJugadorBActionPerformed

    private void entradaFechaNacimientoJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorBFocusLost
        organizatorFocusLost (entradaFechaNacimientoJugadorB, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorBFocusLost

    private void entradaFechaNacimientoJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorBFocusGained
        organizatorFocusGained (entradaFechaNacimientoJugadorB, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorBFocusGained

    private void entradaEquipoJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEquipoJugadorBActionPerformed

    private void entradaEquipoJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorBFocusLost
        organizatorFocusLost (entradaEquipoJugadorB, "Ingresar equipo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorBFocusLost

    private void entradaEquipoJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorBFocusGained
        organizatorFocusGained (entradaEquipoJugadorB, "Ingresar equipo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorBFocusGained

    private void entradaEmailJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEmailJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEmailJugadorBActionPerformed

    private void entradaEmailJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorBFocusLost
        organizatorFocusLost(entradaEmailJugadorB, "Ingresar correo del jugador");
    }//GEN-LAST:event_entradaEmailJugadorBFocusLost

    private void entradaEmailJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorBFocusGained
        organizatorFocusGained (entradaEmailJugadorB, "Ingresar correo del jugador");
    }//GEN-LAST:event_entradaEmailJugadorBFocusGained

    private void entradaNumeroTelefonoJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorBActionPerformed

    private void entradaNumeroTelefonoJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorBFocusLost
        organizatorFocusLost (entradaNumeroTelefonoJugadorB, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorBFocusLost

    private void entradaNumeroTelefonoJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorBFocusGained
        organizatorFocusGained (entradaNumeroTelefonoJugadorB, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorBFocusGained

    private void entradaIdJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaIdJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaIdJugadorBActionPerformed

    private void entradaIdJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIdJugadorBFocusLost
        organizatorFocusLost(entradaIdJugadorB, "Ingresar numero de cedula jugador");
    }//GEN-LAST:event_entradaIdJugadorBFocusLost

    private void entradaIdJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIdJugadorBFocusGained
        organizatorFocusGained (entradaIdJugadorB, "Ingresar numero de cedula jugador");
    }//GEN-LAST:event_entradaIdJugadorBFocusGained

    private void entradaNombreJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreJugadorBActionPerformed

    private void entradaNombreJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorBFocusLost
        organizatorFocusLost(entradaNombreJugadorB, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorBFocusLost

    private void entradaNombreJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorBFocusGained
        organizatorFocusGained (entradaNombreJugadorB, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorBFocusGained

    private void botonSeguirDuplasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirDuplasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirDuplasActionPerformed

    private void botonSeguirDuplasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirDuplasMouseExited
        changeButtonColor(botonSeguirDuplas,30,25,161);
    }//GEN-LAST:event_botonSeguirDuplasMouseExited

    private void botonSeguirDuplasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirDuplasMouseClicked
        pestania.setSelectedIndex(8);
    }//GEN-LAST:event_botonSeguirDuplasMouseClicked

    private void botonSeguirDuplasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirDuplasMouseMoved
        changeButtonColor(botonSeguirDuplas,102,102,255);
    }//GEN-LAST:event_botonSeguirDuplasMouseMoved

    private void botonAgregarJugadoresDuplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarJugadoresDuplaActionPerformed
        DoubleTennis doubleTennis = new DoubleTennis();
        doubleTennis.readPlayerA(entradaNombreJugadorA, entradaIdJugadorA, entradaNumeroTelefonoJugadorA, entradaEmailJugadorA, opcionesCategoriaJugadorA, entradaEquipoJugadorA, entradaFechaNacimientoJugadorA);
        doubleTennis.readPlayerB(entradaNombreJugadorB, entradaIdJugadorB, entradaNumeroTelefonoJugadorB, entradaEmailJugadorB, opcionesCategoriaJugadorB, entradaEquipoJugadorB, entradaFechaNacimientoJugadorB);

        if (doubleTennis.validatePlayer()){
            doubleTennis.addPlayerTable(tablaDuplasAgregadas);
            if (organizator.findPlayer(doubleTennis.getPlayerA().getId()) == true && organizator.findPlayer(doubleTennis.getPlayerB().getId()) == true){
                newTournament.addPlayerTournament(doubleTennis);
                System.out.println("Jugador ingresado correctamente");
            } else{
                organizator.getPlayerList().add(doubleTennis.getPlayerA());
                organizator.getPlayerList().add(doubleTennis.getPlayerB());
                doubleTennis.getPlayerA().addPlayersJson();
                doubleTennis.getPlayerB().addPlayersJson();
                newTournament.addPlayerTournament(doubleTennis);
                System.out.println("Jugador nuevo registrado");
            }
        }
    }//GEN-LAST:event_botonAgregarJugadoresDuplaActionPerformed

    private void botonAgregarJugadoresDuplaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadoresDuplaMouseExited
        changeButtonColor(botonAgregarJugadoresDupla,30,25,161);
    }//GEN-LAST:event_botonAgregarJugadoresDuplaMouseExited

    private void botonAgregarJugadoresDuplaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadoresDuplaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarJugadoresDuplaMouseClicked

    private void botonAgregarJugadoresDuplaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadoresDuplaMouseMoved
        changeButtonColor(botonAgregarJugadoresDupla,102,102,255);
    }//GEN-LAST:event_botonAgregarJugadoresDuplaMouseMoved

    private void botonRegresarIngresarDatosDoblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosDoblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosDoblesActionPerformed

    private void botonRegresarIngresarDatosDoblesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosDoblesMouseExited
        changeButtonColor(botonRegresarIngresarDatosDobles,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosDoblesMouseExited

    private void botonRegresarIngresarDatosDoblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosDoblesMouseClicked
        pestania.setSelectedIndex(4);
    }//GEN-LAST:event_botonRegresarIngresarDatosDoblesMouseClicked

    private void botonRegresarIngresarDatosDoblesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosDoblesMouseMoved
        changeButtonColor(botonRegresarIngresarDatosDobles,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosDoblesMouseMoved

    private void entradaFechaNacimientoJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoJugadorAActionPerformed

    private void entradaFechaNacimientoJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorAFocusLost
        organizatorFocusLost (entradaFechaNacimientoJugadorA, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorAFocusLost

    private void entradaFechaNacimientoJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorAFocusGained
        organizatorFocusGained (entradaFechaNacimientoJugadorA, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorAFocusGained

    private void entradaEquipoJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEquipoJugadorAActionPerformed

    private void entradaEquipoJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorAFocusLost
        organizatorFocusLost(entradaEquipoJugadorA, "Ingresar equipo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorAFocusLost

    private void entradaEquipoJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorAFocusGained
        organizatorFocusGained (entradaEquipoJugadorA, "Ingresar equipo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorAFocusGained

    private void entradaEmailJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEmailJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEmailJugadorAActionPerformed

    private void entradaEmailJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorAFocusLost
        organizatorFocusLost(entradaEmailJugadorA, "Ingresar correo jugador");
    }//GEN-LAST:event_entradaEmailJugadorAFocusLost

    private void entradaEmailJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorAFocusGained
        organizatorFocusGained (entradaEmailJugadorA, "Ingresar correo del jugador");
    }//GEN-LAST:event_entradaEmailJugadorAFocusGained

    private void entradaNumeroTelefonoJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorAActionPerformed

    private void entradaNumeroTelefonoJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorAFocusLost
        organizatorFocusLost (entradaNumeroTelefonoJugadorA, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorAFocusLost

    private void entradaNumeroTelefonoJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorAFocusGained
        organizatorFocusGained (entradaNumeroTelefonoJugadorA, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorAFocusGained

    private void entradaIdJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaIdJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaIdJugadorAActionPerformed

    private void entradaIdJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIdJugadorAFocusLost
        organizatorFocusLost(entradaIdJugadorA, "Ingresar numero de cedula jugador");
    }//GEN-LAST:event_entradaIdJugadorAFocusLost

    private void entradaIdJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIdJugadorAFocusGained
        organizatorFocusGained (entradaIdJugadorA, "Ingresar numero de cedula jugador");
    }//GEN-LAST:event_entradaIdJugadorAFocusGained

    private void entradaNombreJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreJugadorAActionPerformed

    private void entradaNombreJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorAFocusLost
        organizatorFocusLost(entradaNombreJugadorA, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorAFocusLost

    private void entradaNombreJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorAFocusGained
        organizatorFocusGained (entradaNombreJugadorA, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorAFocusGained

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        try{
            Player player = organizator.searchPlayer(entradaIDJugador);
            player.showPlayerInformation(entradaNombreJugador, entradaNumeroTelefonoJugador, entradaFechaNacimientoJugador, entradaIDJugador, entradaEmailJugador, entradaEquipoJugador);
        } catch (NullPointerException error) {
            System.err.println("AVISO. No se encontro el jugador en la lista global");
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void opcionesCategoriaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriaJugadorActionPerformed

    }//GEN-LAST:event_opcionesCategoriaJugadorActionPerformed

    private void botonSeguirIngresarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirIngresarJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarJugadorActionPerformed

    private void botonSeguirIngresarJugadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarJugadorMouseExited
        changeButtonColor(botonSeguirIngresarJugador,30,25,161);
    }//GEN-LAST:event_botonSeguirIngresarJugadorMouseExited

    private void botonSeguirIngresarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarJugadorMouseClicked
        pestania.setSelectedIndex(8);
    }//GEN-LAST:event_botonSeguirIngresarJugadorMouseClicked

    private void botonSeguirIngresarJugadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarJugadorMouseMoved
        changeButtonColor(botonSeguirIngresarJugador,102,102,255);
    }//GEN-LAST:event_botonSeguirIngresarJugadorMouseMoved

    private void botonAgregarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarJugadorActionPerformed
        Player player = new Player();
        player.readPlayer(entradaNombreJugador, entradaIDJugador, entradaNumeroTelefonoJugador, entradaEmailJugador, opcionesCategoriaJugador, entradaEquipoJugador, entradaFechaNacimientoJugador);
        if (player.validatePlayer()){
            player.addPlayerTable(tablaJugadoresAgregados);
            if (organizator.findPlayer(player.getId()) == true){
                newTournament.getParticipantsList().add(player);
                System.out.println("Jugador ingresado correctamente");
            } else{
                organizator.getPlayerList().add(player);
                newTournament.getParticipantsList().add(player);
                player.addPlayersJson();
                System.out.println("Jugador nuevo registrado");
            }
        }
    }//GEN-LAST:event_botonAgregarJugadorActionPerformed

    private void botonAgregarJugadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadorMouseExited
        changeButtonColor(botonAgregarJugador,30,25,161);
    }//GEN-LAST:event_botonAgregarJugadorMouseExited

    private void botonAgregarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarJugadorMouseClicked

    private void botonAgregarJugadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadorMouseMoved
        changeButtonColor(botonAgregarJugador,102,102,255);
    }//GEN-LAST:event_botonAgregarJugadorMouseMoved

    private void botonRegresarIngresarDatosSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosSingleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosSingleActionPerformed

    private void botonRegresarIngresarDatosSingleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosSingleMouseExited
        changeButtonColor(botonRegresarIngresarDatosSingle,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosSingleMouseExited

    private void botonRegresarIngresarDatosSingleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosSingleMouseClicked
        pestania.setSelectedIndex(4);
    }//GEN-LAST:event_botonRegresarIngresarDatosSingleMouseClicked

    private void botonRegresarIngresarDatosSingleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosSingleMouseMoved
        changeButtonColor(botonRegresarIngresarDatosSingle,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosSingleMouseMoved

    private void entradaFechaNacimientoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoJugadorActionPerformed

    private void entradaFechaNacimientoJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorFocusLost
        organizatorFocusLost (entradaFechaNacimientoJugador, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorFocusLost

    private void entradaFechaNacimientoJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorFocusGained
        organizatorFocusGained (entradaFechaNacimientoJugador, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorFocusGained

    private void entradaEquipoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEquipoJugadorActionPerformed

    private void entradaEquipoJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorFocusLost
        organizatorFocusLost (entradaEquipoJugador, "Ingresar equipo externo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorFocusLost

    private void entradaEquipoJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorFocusGained
        organizatorFocusGained (entradaEquipoJugador, "Ingresar equipo externo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorFocusGained

    private void entradaEmailJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEmailJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEmailJugadorActionPerformed

    private void entradaEmailJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorFocusLost
        organizatorFocusLost (entradaEmailJugador, "Ingresar correo del jugador");
    }//GEN-LAST:event_entradaEmailJugadorFocusLost

    private void entradaEmailJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorFocusGained
        organizatorFocusGained (entradaEmailJugador, "Ingresar correo del jugador");
    }//GEN-LAST:event_entradaEmailJugadorFocusGained

    private void entradaNumeroTelefonoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorActionPerformed

    private void entradaNumeroTelefonoJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorFocusLost
        organizatorFocusLost (entradaNumeroTelefonoJugador, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorFocusLost

    private void entradaNumeroTelefonoJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorFocusGained
        organizatorFocusGained (entradaNumeroTelefonoJugador, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorFocusGained

    private void entradaIDJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaIDJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaIDJugadorActionPerformed

    private void entradaIDJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIDJugadorFocusLost
        organizatorFocusLost (entradaIDJugador, "Ingresar numero de cedula del jugador");
    }//GEN-LAST:event_entradaIDJugadorFocusLost

    private void entradaIDJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIDJugadorFocusGained
        organizatorFocusGained (entradaIDJugador, "Ingresar numero de cedula del jugador");
    }//GEN-LAST:event_entradaIDJugadorFocusGained

    private void entradaNombreJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreJugadorActionPerformed

    private void entradaNombreJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorFocusLost
        organizatorFocusLost (entradaNombreJugador, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorFocusLost

    private void entradaNombreJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorFocusGained
        organizatorFocusGained (entradaNombreJugador, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorFocusGained

    private void ingresarRondaEliminacionDirecta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarRondaEliminacionDirecta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarRondaEliminacionDirecta3ActionPerformed

    private void ingresarRondaEliminacionDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarRondaEliminacionDirectaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarRondaEliminacionDirectaActionPerformed

    private void botonRegresarIngresarDatosTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneoActionPerformed

    private void botonRegresarIngresarDatosTorneoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneoMouseExited
        changeButtonColor(botonRegresarIngresarDatosTorneo,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneoMouseExited

    private void botonRegresarIngresarDatosTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneoMouseClicked
        pestania.setSelectedIndex(0);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneoMouseClicked

    private void botonRegresarIngresarDatosTorneoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneoMouseMoved
        changeButtonColor(botonRegresarIngresarDatosTorneo,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneoMouseMoved

    private void botonSeguirIngresarDatosTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneoActionPerformed

    private void botonSeguirIngresarDatosTorneoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneoMouseExited
        changeButtonColor(botonSeguirIngresarDatosTorneo,30,25,161);
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneoMouseExited

    private void botonSeguirIngresarDatosTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneoMouseClicked
        newTournament = CreateTournament(entradaNombreTorneo, entradaCostoTorneo, entradaCantidadJugadores, ingresarRondaEliminacionDirecta);
        List<Player> playerList = new ArrayList<>();
        newTournament.setParticipantsList(playerList);
        organizatorCleanTable(tablaJugadoresAgregados);
        organizatorCleanTable(tablaDuplasAgregadas);
        organizatorCleanTable(tablaEquiposAgregados);
        GetUpTournamentFromPartOne(pestania, opcionCrearTorneo, entradaNombreTorneo, entradaCostoTorneo, entradaCantidadJugadores, ingresarRondaEliminacionDirecta);
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneoMouseClicked

    private void botonSeguirIngresarDatosTorneoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneoMouseMoved
        changeButtonColor(botonSeguirIngresarDatosTorneo,102,102,255);
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneoMouseMoved

    private void entradaCantidadJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCantidadJugadoresActionPerformed

    private void entradaCantidadJugadoresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresFocusLost
        organizatorFocusLost (entradaCantidadJugadores, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresFocusLost

    private void entradaCantidadJugadoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresFocusGained
        organizatorFocusGained (entradaCantidadJugadores, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresFocusGained

    private void entradaCostoTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCostoTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCostoTorneoActionPerformed

    private void entradaCostoTorneoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCostoTorneoFocusLost
        organizatorFocusLost (entradaCostoTorneo, "Ingresar costo del torneo");
    }//GEN-LAST:event_entradaCostoTorneoFocusLost

    private void entradaCostoTorneoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCostoTorneoFocusGained
        organizatorFocusGained (entradaCostoTorneo, "Ingresar costo del torneo");
    }//GEN-LAST:event_entradaCostoTorneoFocusGained

    private void entradaNombreTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneoActionPerformed

    private void entradaNombreTorneoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneoFocusLost
        organizatorFocusLost (entradaNombreTorneo, "Ingresar nombre del torneo");
    }//GEN-LAST:event_entradaNombreTorneoFocusLost

    private void entradaNombreTorneoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneoFocusGained
        organizatorFocusGained (entradaNombreTorneo, "Ingresar nombre del torneo");
    }//GEN-LAST:event_entradaNombreTorneoFocusGained

    private void jPanel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel32MouseClicked

    private void calendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendar1PropertyChange

    }//GEN-LAST:event_calendar1PropertyChange

    private void calendar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendar1MouseClicked

    }//GEN-LAST:event_calendar1MouseClicked

    private void botonModificarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPartidoActionPerformed
        pestania.setSelectedIndex(17);
    }//GEN-LAST:event_botonModificarPartidoActionPerformed

    private void botonModificarPartidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarPartidoMouseExited
        changeButtonColor(botonModificarPartido,30,25,161);
    }//GEN-LAST:event_botonModificarPartidoMouseExited

    private void botonModificarPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarPartidoMouseClicked

    }//GEN-LAST:event_botonModificarPartidoMouseClicked

    private void botonModificarPartidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarPartidoMouseMoved
        changeButtonColor(botonModificarPartido,102,102,255);
    }//GEN-LAST:event_botonModificarPartidoMouseMoved

    private void botonEliminarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPartidoActionPerformed
        pestania.setSelectedIndex(18);
    }//GEN-LAST:event_botonEliminarPartidoActionPerformed

    private void botonEliminarPartidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarPartidoMouseExited
        changeButtonColor(botonEliminarPartido,30,25,161);
    }//GEN-LAST:event_botonEliminarPartidoMouseExited

    private void botonEliminarPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarPartidoMouseClicked

    }//GEN-LAST:event_botonEliminarPartidoMouseClicked

    private void botonEliminarPartidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarPartidoMouseMoved
        changeButtonColor(botonEliminarPartido,102,102,255);
    }//GEN-LAST:event_botonEliminarPartidoMouseMoved

    private void botonAgregarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPartidoActionPerformed
        pestania.setSelectedIndex(16);
    }//GEN-LAST:event_botonAgregarPartidoActionPerformed

    private void botonAgregarPartidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPartidoMouseExited
        changeButtonColor(botonAgregarPartido,30,25,161);
    }//GEN-LAST:event_botonAgregarPartidoMouseExited

    private void botonAgregarPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPartidoMouseClicked

    }//GEN-LAST:event_botonAgregarPartidoMouseClicked

    private void botonAgregarPartidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPartidoMouseMoved
        changeButtonColor(botonAgregarPartido,102,102,255);
    }//GEN-LAST:event_botonAgregarPartidoMouseMoved

    private void showPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPhoneNumberActionPerformed

    private void showMatchPlayedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMatchPlayedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showMatchPlayedActionPerformed

    private void showCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showCategoryActionPerformed

    private void showMatchWonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMatchWonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showMatchWonActionPerformed

    private void showIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showIdActionPerformed

    private void showTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showTeamActionPerformed

    private void showPlayerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPlayerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPlayerNameActionPerformed

    private void showEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showEmailActionPerformed

    private void showDateBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDateBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showDateBirthActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        organizatorFocusLost(searchTextField, "Ingresar cedula del jugador a buscar...");
    }//GEN-LAST:event_searchTextFieldFocusLost

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        organizatorFocusGained(searchTextField, "Ingresar cedula del jugador a buscar...");
    }//GEN-LAST:event_searchTextFieldFocusGained

    private void bottomSearchPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomSearchPlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bottomSearchPlayerActionPerformed

    private void bottomSearchPlayerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottomSearchPlayerMouseExited
        changeButtonColor(bottomSearchPlayer,30,25,161);
    }//GEN-LAST:event_bottomSearchPlayerMouseExited

    private void bottomSearchPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottomSearchPlayerMouseClicked
        try{
            Player player = organizator.searchPlayer(searchTextField);
            player.showPlayerInformation(showPlayerName, showPhoneNumber, showDateBirth, showId, showEmail, showTeam, showCategory, showMatchPlayed, showMatchWon);
        } catch (NullPointerException error){
            showPlayerName.setText("Error, jugador no encontrado");
        }
    }//GEN-LAST:event_bottomSearchPlayerMouseClicked

    private void bottomSearchPlayerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottomSearchPlayerMouseMoved
        changeButtonColor(bottomSearchPlayer,102,102,255);
    }//GEN-LAST:event_bottomSearchPlayerMouseMoved

    private void verTorneo19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo19MouseExited
        changePanelColor(verTorneo19,30,25,161);
    }//GEN-LAST:event_verTorneo19MouseExited

    private void verTorneo19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo19MouseClicked
        int index = 18, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo19MouseClicked

    private void verTorneo19MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo19MouseMoved
        changePanelColor(verTorneo19,102,102,255);
    }//GEN-LAST:event_verTorneo19MouseMoved

    private void verTorneo21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo21MouseExited
        changePanelColor(verTorneo21,30,25,161);
    }//GEN-LAST:event_verTorneo21MouseExited

    private void verTorneo21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo21MouseClicked
        int index = 20, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo21MouseClicked

    private void verTorneo21MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo21MouseMoved
        changePanelColor(verTorneo21,102,102,255);
    }//GEN-LAST:event_verTorneo21MouseMoved

    private void verTorneo20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo20MouseExited
        changePanelColor(verTorneo20,30,25,161);
    }//GEN-LAST:event_verTorneo20MouseExited

    private void verTorneo20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo20MouseClicked
        int index = 19, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo20MouseClicked

    private void verTorneo20MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo20MouseMoved
        changePanelColor(verTorneo20,102,102,255);
    }//GEN-LAST:event_verTorneo20MouseMoved

    private void verTorneo16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo16MouseExited
        changePanelColor(verTorneo16,30,25,161);
    }//GEN-LAST:event_verTorneo16MouseExited

    private void verTorneo16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo16MouseClicked
        int index = 15, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo16MouseClicked

    private void verTorneo16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo16MouseMoved
        changePanelColor(verTorneo16,102,102,255);
    }//GEN-LAST:event_verTorneo16MouseMoved

    private void verTorneo18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo18MouseExited
        changePanelColor(verTorneo18,30,25,161);
    }//GEN-LAST:event_verTorneo18MouseExited

    private void verTorneo18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo18MouseClicked
        int index = 17, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo18MouseClicked

    private void verTorneo18MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo18MouseMoved
        changePanelColor(verTorneo18,102,102,255);
    }//GEN-LAST:event_verTorneo18MouseMoved

    private void verTorneo17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo17MouseExited
        changePanelColor(verTorneo17,30,25,161);
    }//GEN-LAST:event_verTorneo17MouseExited

    private void verTorneo17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo17MouseClicked
        int index = 16, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo17MouseClicked

    private void verTorneo17MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo17MouseMoved
        changePanelColor(verTorneo17,102,102,255);
    }//GEN-LAST:event_verTorneo17MouseMoved

    private void verTorneo13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo13MouseExited
        changePanelColor(verTorneo13,30,25,161);
    }//GEN-LAST:event_verTorneo13MouseExited

    private void verTorneo13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo13MouseClicked
        int index = 12, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo13MouseClicked

    private void verTorneo13MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo13MouseMoved
        changePanelColor(verTorneo13,102,102,255);
    }//GEN-LAST:event_verTorneo13MouseMoved

    private void verTorneo15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo15MouseExited
        changePanelColor(verTorneo15,30,25,161);
    }//GEN-LAST:event_verTorneo15MouseExited

    private void verTorneo15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo15MouseClicked
        int index = 14, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo15MouseClicked

    private void verTorneo15MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo15MouseMoved
        changePanelColor(verTorneo15,102,102,255);
    }//GEN-LAST:event_verTorneo15MouseMoved

    private void verTorneo14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo14MouseExited
        changePanelColor(verTorneo14,30,25,161);
    }//GEN-LAST:event_verTorneo14MouseExited

    private void verTorneo14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo14MouseClicked
        int index = 13, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo14MouseClicked

    private void verTorneo14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo14MouseMoved
        changePanelColor(verTorneo14,102,102,255);
    }//GEN-LAST:event_verTorneo14MouseMoved

    private void verTorneo10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo10MouseExited
        changePanelColor(verTorneo10,30,25,161);
    }//GEN-LAST:event_verTorneo10MouseExited

    private void verTorneo10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo10MouseClicked
        int index = 9, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo10MouseClicked

    private void verTorneo10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo10MouseMoved
        changePanelColor(verTorneo10,102,102,255);
    }//GEN-LAST:event_verTorneo10MouseMoved

    private void verTorneo12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo12MouseExited
        changePanelColor(verTorneo12,30,25,161);
    }//GEN-LAST:event_verTorneo12MouseExited

    private void verTorneo12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo12MouseClicked
        int index = 11, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo12MouseClicked

    private void verTorneo12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo12MouseMoved
        changePanelColor(verTorneo12,102,102,255);
    }//GEN-LAST:event_verTorneo12MouseMoved

    private void verTorneo11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo11MouseExited
        changePanelColor(verTorneo11,30,25,161);
    }//GEN-LAST:event_verTorneo11MouseExited

    private void verTorneo11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo11MouseClicked
        int index = 10, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo11MouseClicked

    private void verTorneo11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo11MouseMoved
        changePanelColor(verTorneo11,102,102,255);
    }//GEN-LAST:event_verTorneo11MouseMoved

    private void verTorneo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo7MouseExited
        changePanelColor(verTorneo7,30,25,161);
    }//GEN-LAST:event_verTorneo7MouseExited

    private void verTorneo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo7MouseClicked
        int index = 6, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo7MouseClicked

    private void verTorneo7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo7MouseMoved
        changePanelColor(verTorneo7,102,102,255);
    }//GEN-LAST:event_verTorneo7MouseMoved

    private void verTorneo9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo9MouseExited
        changePanelColor(verTorneo9,30,25,161);
    }//GEN-LAST:event_verTorneo9MouseExited

    private void verTorneo9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo9MouseClicked
        int index = 8, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo9MouseClicked

    private void verTorneo9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo9MouseMoved
        changePanelColor(verTorneo9,102,102,255);
    }//GEN-LAST:event_verTorneo9MouseMoved

    private void verTorneo8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo8MouseExited
        changePanelColor(verTorneo8,30,25,161);
    }//GEN-LAST:event_verTorneo8MouseExited

    private void verTorneo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo8MouseClicked
        int index = 7, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo8MouseClicked

    private void verTorneo8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo8MouseMoved
        changePanelColor(verTorneo8,102,102,255);
    }//GEN-LAST:event_verTorneo8MouseMoved

    private void verTorneo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo4MouseExited
        changePanelColor(verTorneo4,30,25,161);
    }//GEN-LAST:event_verTorneo4MouseExited

    private void verTorneo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo4MouseClicked
        int index = 3, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo4MouseClicked

    private void verTorneo4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo4MouseMoved
        changePanelColor(verTorneo4,102,102,255);
    }//GEN-LAST:event_verTorneo4MouseMoved

    private void verTorneo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo6MouseExited
        changePanelColor(verTorneo6,30,25,161);
    }//GEN-LAST:event_verTorneo6MouseExited

    private void verTorneo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo6MouseClicked
        int index = 5, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo6MouseClicked

    private void verTorneo6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo6MouseMoved
        changePanelColor(verTorneo6,102,102,255);
    }//GEN-LAST:event_verTorneo6MouseMoved

    private void verTorneo5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo5MouseExited
        changePanelColor(verTorneo5,30,25,161);
    }//GEN-LAST:event_verTorneo5MouseExited

    private void verTorneo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo5MouseClicked
        int index = 4, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo5MouseClicked

    private void verTorneo5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo5MouseMoved
        changePanelColor(verTorneo5,102,102,255);
    }//GEN-LAST:event_verTorneo5MouseMoved

    private void verTorneo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo1MouseExited
        changePanelColor(verTorneo1,30,25,161);
    }//GEN-LAST:event_verTorneo1MouseExited

    private void verTorneo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo1MouseClicked
        int index = 0, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo1MouseClicked

    private void verTorneo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo1MouseMoved
        changePanelColor(verTorneo1,102,102,255);
    }//GEN-LAST:event_verTorneo1MouseMoved

    private void verTorneo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo3MouseExited
        changePanelColor(verTorneo3,30,25,161);
    }//GEN-LAST:event_verTorneo3MouseExited

    private void verTorneo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo3MouseClicked
        int index = 2, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo3MouseClicked

    private void verTorneo3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo3MouseMoved
        changePanelColor(verTorneo3,102,102,255);
    }//GEN-LAST:event_verTorneo3MouseMoved

    private void verTorneo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo2MouseExited
        changePanelColor(verTorneo2,30,25,161);
    }//GEN-LAST:event_verTorneo2MouseExited

    private void verTorneo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo2MouseClicked
        int index = 1, numberGroups = whichTournamentShow(index, organizator.getTournamentList());
        organizatorSeeTournament(pestania, index+1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        try{
            switch(numberGroups){
                case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(index).getParticipantsList());
                case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(index).getParticipantsList(), organizator.getTournamentList().get(index).getGroupsList());
                default -> pestania.setSelectedIndex(0);
            }
        } catch (NullPointerException | IndexOutOfBoundsException error){
            pestania.setSelectedIndex(0);
        } finally {
            currentTournament = organizator.getTournamentList().get(index);
            showTournamentName(nombreTorneoCero, nombreTorneoUno, nombreTorneoDos, nombreTorneoTres, nombreTorneoCuatro, nombreTorneoCinco, currentTournament.getTournamentName());
        }
    }//GEN-LAST:event_verTorneo2MouseClicked

    private void verTorneo2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo2MouseMoved
        changePanelColor(verTorneo2,102,102,255);
    }//GEN-LAST:event_verTorneo2MouseMoved

    private void botonCrearTorneoSingleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingleMouseExited
        changePanelColor(botonCrearTorneoSingle,30,25,161);
    }//GEN-LAST:event_botonCrearTorneoSingleMouseExited

    private void botonCrearTorneoSingleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingleMouseClicked
        pestania.setSelectedIndex(4);
        opcionCrearTorneo = 1;
    }//GEN-LAST:event_botonCrearTorneoSingleMouseClicked

    private void botonCrearTorneoSingleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingleMouseMoved
        changePanelColor(botonCrearTorneoSingle,102,102,255);
    }//GEN-LAST:event_botonCrearTorneoSingleMouseMoved

    private void botonCrearTorneoEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipoMouseExited
        changePanelColor(botonCrearTorneoEquipo,30,25,161);
    }//GEN-LAST:event_botonCrearTorneoEquipoMouseExited

    private void botonCrearTorneoEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipoMouseClicked
        pestania.setSelectedIndex(4);
        opcionCrearTorneo = 3;
    }//GEN-LAST:event_botonCrearTorneoEquipoMouseClicked

    private void botonCrearTorneoEquipoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipoMouseMoved
        changePanelColor(botonCrearTorneoEquipo,102,102,255);
    }//GEN-LAST:event_botonCrearTorneoEquipoMouseMoved

    private void botonCrearTorneoDobleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDobleMouseExited
        changePanelColor(botonCrearTorneoDoble,30,25,161);
    }//GEN-LAST:event_botonCrearTorneoDobleMouseExited

    private void botonCrearTorneoDobleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDobleMouseClicked
        pestania.setSelectedIndex(4);
        opcionCrearTorneo = 2;
    }//GEN-LAST:event_botonCrearTorneoDobleMouseClicked

    private void botonCrearTorneoDobleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDobleMouseMoved
        changePanelColor(botonCrearTorneoDoble,102,102,255);
    }//GEN-LAST:event_botonCrearTorneoDobleMouseMoved
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JLabel IconoCalendario;
    private javax.swing.JLabel IconoCalendario2;
    private javax.swing.JLabel NombreOrganizador;
    private javax.swing.JButton actuGeneralTable;
    private javax.swing.JButton actuGeneralTableUno;
    private javax.swing.JButton actuGeneralTableUno1;
    private javax.swing.JButton actuGeneralTableUno2;
    private javax.swing.JButton actuGeneralTableUno3;
    private javax.swing.JButton botonAgregarEquipo;
    private javax.swing.JButton botonAgregarJugador;
    private javax.swing.JButton botonAgregarJugadoresDupla;
    private javax.swing.JButton botonAgregarPartido;
    private javax.swing.JPanel botonConfigurarFaseGrupos;
    private javax.swing.JPanel botonCrearTorneoDoble;
    private javax.swing.JPanel botonCrearTorneoEquipo;
    private javax.swing.JPanel botonCrearTorneoSingle;
    private javax.swing.JButton botonEliminarPartido;
    private javax.swing.JPanel botonFormatoLiga;
    private javax.swing.JPanel botonMenuBuscarJugador;
    private javax.swing.JPanel botonMenuCrearTorneo;
    private javax.swing.JPanel botonMenuVerTorneos;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JButton botonModificarPartido;
    private javax.swing.JButton botonRegresarConfigurarFaseGrupos;
    private javax.swing.JButton botonRegresarIngresarDatosDobles;
    private javax.swing.JButton botonRegresarIngresarDatosEquipo;
    private javax.swing.JButton botonRegresarIngresarDatosSingle;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo;
    private javax.swing.JLabel botonSalida;
    private javax.swing.JButton botonSeguirDuplas;
    private javax.swing.JButton botonSeguirEquipo;
    private javax.swing.JButton botonSeguirFaseGrupos;
    private javax.swing.JButton botonSeguirIngresarDatosTorneo;
    private javax.swing.JButton botonSeguirIngresarJugador;
    private javax.swing.JPanel botonTorneoMuerteSubita;
    private javax.swing.JButton bottomSearchPlayer;
    private raven.calendar.Calendar calendar1;
    private javax.swing.JTextField entradaCantidadJugadores;
    private javax.swing.JTextField entradaCantidadJugadoresEliminacionDirecta;
    private javax.swing.JTextField entradaCantidadJugadoresPorGrupo;
    private javax.swing.JTextField entradaCedulaCapitan;
    private javax.swing.JTextField entradaCorreoCapitan;
    private javax.swing.JTextField entradaCostoTorneo;
    private javax.swing.JTextField entradaEmailJugador;
    private javax.swing.JTextField entradaEmailJugadorA;
    private javax.swing.JTextField entradaEmailJugadorB;
    private javax.swing.JTextField entradaEquipoJugador;
    private javax.swing.JTextField entradaEquipoJugadorA;
    private javax.swing.JTextField entradaEquipoJugadorB;
    private javax.swing.JTextField entradaFechaNacimientoCapitan;
    private javax.swing.JTextField entradaFechaNacimientoJugador;
    private javax.swing.JTextField entradaFechaNacimientoJugadorA;
    private javax.swing.JTextField entradaFechaNacimientoJugadorB;
    private javax.swing.JTextField entradaIDJugador;
    private javax.swing.JTextField entradaIdJugadorA;
    private javax.swing.JTextField entradaIdJugadorB;
    private javax.swing.JTextField entradaNombreCapitan;
    private javax.swing.JTextField entradaNombreEquipo;
    private javax.swing.JTextField entradaNombreJugador;
    private javax.swing.JTextField entradaNombreJugadorA;
    private javax.swing.JTextField entradaNombreJugadorB;
    private javax.swing.JTextField entradaNombreTorneo;
    private javax.swing.JTextField entradaNumeroTelefonoCapitan;
    private javax.swing.JTextField entradaNumeroTelefonoJugador;
    private javax.swing.JTextField entradaNumeroTelefonoJugadorA;
    private javax.swing.JTextField entradaNumeroTelefonoJugadorB;
    private javax.swing.JLabel iconoSuperior;
    private javax.swing.JComboBox<String> ingresarCantidadDeGrupos;
    private javax.swing.JComboBox<String> ingresarRondaEliminacionDirecta;
    private javax.swing.JComboBox<String> ingresarRondaEliminacionDirecta3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
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
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
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
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
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
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JSeparator jSeparator66;
    private javax.swing.JSeparator jSeparator67;
    private javax.swing.JSeparator jSeparator68;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator80;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel nombreTorneoCero;
    private javax.swing.JLabel nombreTorneoCinco;
    private javax.swing.JLabel nombreTorneoCuatro;
    private javax.swing.JLabel nombreTorneoDos;
    private javax.swing.JLabel nombreTorneoTres;
    private javax.swing.JLabel nombreTorneoUno;
    private javax.swing.JComboBox<String> opcionesCategoriaCapitan;
    private javax.swing.JComboBox<String> opcionesCategoriaJugador;
    private javax.swing.JComboBox<String> opcionesCategoriaJugadorA;
    private javax.swing.JComboBox<String> opcionesCategoriaJugadorB;
    private javax.swing.JTabbedPane pestania;
    private javax.swing.JPanel pestaniaCrearTorneoInicio;
    private javax.swing.JPanel pestaniaCrearTorneoInicio1;
    private javax.swing.JTable playersListTable;
    private javax.swing.JScrollPane searchTab;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextField showCategory;
    private javax.swing.JTextField showDateBirth;
    private javax.swing.JTextField showEmail;
    private javax.swing.JTextField showId;
    private javax.swing.JTextField showMatchPlayed;
    private javax.swing.JTextField showMatchWon;
    private javax.swing.JTextField showPhoneNumber;
    private javax.swing.JTextField showPlayerName;
    private javax.swing.JTextField showTeam;
    private javax.swing.JTable tablaDuplasAgregadas;
    private javax.swing.JTable tablaEquiposAgregados;
    private javax.swing.JTable tablaGeneralLiga;
    private javax.swing.JTable tablaJugadoresAgregados;
    private javax.swing.JTable tablaJugadoresAgregados1;
    private javax.swing.JTable tablaJugadoresAgregados10;
    private javax.swing.JTable tablaJugadoresAgregados11;
    private javax.swing.JTable tablaJugadoresAgregados12;
    private javax.swing.JTable tablaJugadoresAgregados13;
    private javax.swing.JTable tablaJugadoresAgregados14;
    private javax.swing.JTable tablaJugadoresAgregados15;
    private javax.swing.JTable tablaJugadoresAgregados16;
    private javax.swing.JTable tablaJugadoresAgregados17;
    private javax.swing.JTable tablaJugadoresAgregados18;
    private javax.swing.JTable tablaJugadoresAgregados19;
    private javax.swing.JTable tablaJugadoresAgregados2;
    private javax.swing.JTable tablaJugadoresAgregados20;
    private javax.swing.JTable tablaJugadoresAgregados21;
    private javax.swing.JTable tablaJugadoresAgregados22;
    private javax.swing.JTable tablaJugadoresAgregados23;
    private javax.swing.JTable tablaJugadoresAgregados24;
    private javax.swing.JTable tablaJugadoresAgregados25;
    private javax.swing.JTable tablaJugadoresAgregados26;
    private javax.swing.JTable tablaJugadoresAgregados27;
    private javax.swing.JTable tablaJugadoresAgregados28;
    private javax.swing.JTable tablaJugadoresAgregados29;
    private javax.swing.JTable tablaJugadoresAgregados3;
    private javax.swing.JTable tablaJugadoresAgregados4;
    private javax.swing.JTable tablaJugadoresAgregados5;
    private javax.swing.JTable tablaJugadoresAgregados6;
    private javax.swing.JTable tablaJugadoresAgregados7;
    private javax.swing.JTable tablaJugadoresAgregados8;
    private javax.swing.JTable tablaJugadoresAgregados9;
    private javax.swing.JTable tablaPartidos;
    private javax.swing.JLabel tituloSuperior;
    private javax.swing.JPanel verTorneo1;
    private javax.swing.JPanel verTorneo10;
    private javax.swing.JPanel verTorneo11;
    private javax.swing.JPanel verTorneo12;
    private javax.swing.JPanel verTorneo13;
    private javax.swing.JPanel verTorneo14;
    private javax.swing.JPanel verTorneo15;
    private javax.swing.JPanel verTorneo16;
    private javax.swing.JPanel verTorneo17;
    private javax.swing.JPanel verTorneo18;
    private javax.swing.JPanel verTorneo19;
    private javax.swing.JPanel verTorneo2;
    private javax.swing.JPanel verTorneo20;
    private javax.swing.JPanel verTorneo21;
    private javax.swing.JPanel verTorneo3;
    private javax.swing.JPanel verTorneo4;
    private javax.swing.JPanel verTorneo5;
    private javax.swing.JPanel verTorneo6;
    private javax.swing.JPanel verTorneo7;
    private javax.swing.JPanel verTorneo8;
    private javax.swing.JPanel verTorneo9;
    // End of variables declaration//GEN-END:variables

}
