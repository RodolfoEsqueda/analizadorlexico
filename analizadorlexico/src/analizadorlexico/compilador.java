package analizadorlexico;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;


public class compilador extends javax.swing.JFrame {
    int ind,c=0;
    String pr="",to="",ca="",di="",nom;
    List<id> tokenslist;
    Boolean guar=false,change=true;
    public compilador() throws IOException {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        tokens = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        caracteres = new javax.swing.JTextField();
        digitos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        palabras = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        run = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        pop = new javax.swing.JComboBox<>();

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador");
        setBackground(new java.awt.Color(0, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 153, 153));

        tokens.setEditable(false);
        tokens.setBackground(new java.awt.Color(255, 255, 255));
        tokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tokensActionPerformed(evt);
            }
        });

        jLabel1.setText("Tokens");

        jLabel2.setText("Entrada");

        jLabel3.setText("Caracteres");

        jLabel4.setText("Digitos");

        caracteres.setEditable(false);
        caracteres.setBackground(new java.awt.Color(255, 255, 255));
        caracteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caracteresActionPerformed(evt);
            }
        });

        digitos.setEditable(false);
        digitos.setBackground(new java.awt.Color(255, 255, 255));
        digitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitosActionPerformed(evt);
            }
        });

        jLabel5.setText("Salida");

        palabras.setEditable(false);
        palabras.setBackground(new java.awt.Color(255, 255, 255));
        palabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabrasActionPerformed(evt);
            }
        });

        jLabel6.setText("Palabras reservadas");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        run.setText("Compilar");
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        input.setColumns(20);
        input.setRows(5);
        jScrollPane3.setViewportView(input);

        pop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Analizador Lexico", "Analizador Sintactico" }));
        pop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                popItemStateChanged(evt);
            }
        });
        pop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 50, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tokens, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(run, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(digitos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(palabras, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(run)
                            .addComponent(guardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tokens, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(digitos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(palabras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        guar=true;
        nom=JOptionPane.showInputDialog("Con que nombre desea guardar el archivo: ")+".txt";
        File fichero = new File (nom);
        PrintWriter writer;
        try {
            writer = new PrintWriter(fichero);
            writer.print(input.getText());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(compilador.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_guardarActionPerformed
    public void probarLexerFile() throws IOException{    
        int contIDs=0;
        tokenslist = new LinkedList<id>();
        Reader reader = new BufferedReader(new FileReader(nom));
        Lexer lexer = new Lexer (reader);
        String resultado="";
        while (true){
            tokenper token =lexer.yylex();
            if (token == null){
                for(int i=0;i<tokenslist.size();i++){
                    System.out.println(tokenslist.get(i).nombre + "=" + tokenslist.get(i).ID);
                }
                return;
            }
            switch (token){
                case SUM:
                    to=to+ "<+>";
                    tokens.setText(to);
                    break;
                case RES:
                    to=to+ "<->";
                    tokens.setText(to);
                    break;
                case MULT:
                    to=to+ "<*>";
                    tokens.setText(to);
                    break;
                case DIV:
                    to=to+ "</>";
                    tokens.setText(to);
                    break;
                case ASIGNACION:
                    to=to+ "<=>";
                    tokens.setText(to);
                    break;
                case ERROR:
                    resultado=resultado+ "Error, simbolo no reconocido ";
                    break;
                case ID: {
                    contIDs++;
                    id tokenitem=new id();
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=contIDs;
                    tokenslist.add(tokenitem);
                    ca=ca+ "<ID" + contIDs + "> ";
                    caracteres.setText(ca);
                    break;
                }
                case ENT:
                    di=di+ "< " + lexer.lexeme + "> ";
                    digitos.setText(di);
                    break;
                default:
                    resultado=resultado+ "<"+ lexer.lexeme + "> ";
            }
        }
    }
    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed
        if(guar==true){
        try{
             probarLexerFile();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        }else{
            JOptionPane.showMessageDialog(null,"El archivo no ha sido guardado, guarde primero", "Error Fatal", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_runActionPerformed

    private void tokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tokensActionPerformed

    }//GEN-LAST:event_tokensActionPerformed

    private void caracteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caracteresActionPerformed

    }//GEN-LAST:event_caracteresActionPerformed

    private void digitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitosActionPerformed

    }//GEN-LAST:event_digitosActionPerformed

    private void palabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabrasActionPerformed

    private void popActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popActionPerformed
        
    }//GEN-LAST:event_popActionPerformed

    private void popItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_popItemStateChanged
        String whoiam,path="";
        ind = pop.getSelectedIndex();
        System.out.println(c);
        if(c==0){
            switch(ind){
                case 0: 
                    break;
                case 1: whoiam=JOptionPane.showInputDialog("Quien eres?");
                        if(whoiam.equalsIgnoreCase("Rodo")){
                            path = "C:/Users/Papa/Google Drive/INCO/INCO 6/Seminario Traductores II/analizadorlexico/analizadorlexico/src/analizadorlexico/lexer.flex";
                            c=1;
                        }
                        if(whoiam.equalsIgnoreCase("Pako")){
                            path = "C:/Users/francisco/Google Drive/Seminario Traductores II/analizadorlexico/analizadorlexico/src/analizadorlexico/lexer.flex";
                            c=1;
                        }
                        generarLexer(path);
                    break;
                case 2: JOptionPane.showMessageDialog(null, "Sintatico.java creado", ""+ind, 1);
                        
                    break;    
                default:
                    break;
            }
        }else{
            
        }
    }//GEN-LAST:event_popItemStateChanged
    public static void generarLexer(String path){
        File file=new File(path);
        JFlex.Main.generate(file);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caracteres;
    private javax.swing.JTextField digitos;
    private javax.swing.JButton guardar;
    private javax.swing.JTextArea input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea output;
    private javax.swing.JTextField palabras;
    private javax.swing.JComboBox<String> pop;
    private javax.swing.JButton run;
    private javax.swing.JTextField tokens;
    // End of variables declaration//GEN-END:variables
  }

