package Interface;

import Analyzer.Lexical.LexicalAnalyzer;
import Dependencies.PR1.FileReader;
import Dependencies.PR1.Grammar;
import Dependencies.PR3.Token;
import Exceptions.Lexical.LexicalException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Window extends JFrame {

    public Window() {
        initComponents();
        this.setTitle("IDE LOGO - PRÁCTICA FINAL PROCESORES DE LENGUAJES");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public static void mostrarError(String titulo, String contenido) {
        labelAnalizar.setText(titulo + ": " + contenido);
    }

    protected void mostrarError2(String titulo, String contenido) {
        labelAnalizar.setText(titulo + ": " + contenido);
    }
    private JButton b1;
    public static JLabel labelAnalizar;
    private Canvas lienzo;
    private JScrollPane scrollPaneLienzo;
    private JScrollPane scrollPaneTextArea;
    private JTextArea textArea;
    private JLabel labelError;
    private JPanel panelExterno;
    private JLabel miembros;
    private JPanel fondo;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        fondo = new JPanel();
        b1 = new JButton();
        scrollPaneTextArea = new JScrollPane();
        textArea = new JTextArea();
        panelExterno = new JPanel();
        lienzo = new Canvas();
        miembros = new JLabel();
        labelAnalizar = new JLabel();
        labelError = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(0, 0, 0));

        b1.setText("Ejecuta");
        b1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    b1ActionPerformed(evt);
                }
                catch (IOException ex) {
                    JOptionPane.showMessageDialog(new Window(), "Comprueba que eres administrador del sistema.\nEn caso de no poder arreglarse,\ncopia los ficheros 'Gramatica_Logo.txt' y 'Palabras reservadas.txt' en el disco C:" + File.separator + "  ", "Error E/S", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        scrollPaneTextArea.setViewportView(textArea);

        panelExterno.setBackground(new java.awt.Color(153, 153, 153));
        panelExterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelExterno.setPreferredSize(new java.awt.Dimension(320, 240));

        lienzo.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
                lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE));
        lienzoLayout.setVerticalGroup(
                lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE));

        javax.swing.GroupLayout panelExternoLayout = new javax.swing.GroupLayout(panelExterno);
        panelExterno.setLayout(panelExternoLayout);
        panelExternoLayout.setHorizontalGroup(
                panelExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelExternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap()));
        panelExternoLayout.setVerticalGroup(
                panelExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelExternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap()));

        miembros.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        miembros.setText("Trabajo realizado por Cristian Rodríguez y Juan Guerrero (GII + GIS)");
        miembros.setForeground(new java.awt.Color(255, 255, 255));

        labelAnalizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAnalizar.setText(" ----- ");
        labelAnalizar.setForeground(new java.awt.Color(255, 255, 255));

        labelError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelError.setText("Consola:");
        labelError.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(scrollPaneTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelExterno, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(labelError)
                .addGap(18, 18, 18)
                .addComponent(labelAnalizar)
                .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(fondoLayout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(miembros)))
                .addContainerGap()));
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(b1)
                .addComponent(miembros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollPaneTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addComponent(panelExterno, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelError)
                .addComponent(labelAnalizar))
                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    private void b1ActionPerformed(ActionEvent evt) throws IOException {
        Grammar g = new Grammar("src" + File.separator + "Gramatica_Logo.txt");
        String cadenaString = textArea.getText();
        StringTokenizer st = new StringTokenizer(cadenaString, "\n");
        String aux = "";
        while (st.hasMoreTokens()) {
            aux += st.nextToken() + "$";
        }

        if (aux.length() <= 0) {
            ponerAnalizarFallido("El conjunto de instrucciones está vacío");
        }
        else {
            FileReader fr = new FileReader("src" + File.separator + "Palabras reservadas.txt");

            String[] palabrasReservadas = null;
            try {
                palabrasReservadas = fr.palabrasReservadas();
            }
            catch (Exception e) {
                ponerAnalizarFallido("No se encuentra directorio con palabras reservadas.");
            }
            LexicalAnalyzer al = new LexicalAnalyzer(palabrasReservadas);
            List<Token> listaTokens = null;
            try {
                listaTokens = al.analizarLinea(aux);
            }
            catch (LexicalException el) {
                ponerAnalizarFallido("Error léxico: " + el.getLocalizedMessage());
                return;
            }
            if (listaTokens.size() > 0) {
                this.lienzo.redraw(listaTokens);
            }
            else {
                ponerAnalizarFallido("El conjunto de instrucciones está vacío");
            }
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    protected static void ponerAnalizarFallido(String error) {
        labelAnalizar.setText(error);
        labelAnalizar.setForeground(Color.red);
    }

    protected static void ponerAnalizarAceptado() {
        labelAnalizar.setText("Aceptado");
        labelAnalizar.setForeground(Color.green);
    }
}
