/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uweb;

import analizadores.Analisis_Lexico;
import analizadores.Analisis_Sintactico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.filechooser.FileNameExtensionFilter;
import Arbol.*;
import java.io.FileNotFoundException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

/**
 *
 * @author ASKAR
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    String ruta="";
    FileWriter escritor;
    JTable tabla;
    DefaultTableModel dtm;
    Runtime ejecutar=Runtime.getRuntime();
    HTMLEditorKit kit=new HTMLEditorKit();
    public Ventana() {
        initComponents();
        tabla=(JTable)((JViewport)((JScrollPane)jTabbedPane2.getComponent(1)).getComponent(0)).getComponent(0);
        dtm=(DefaultTableModel) tabla.getModel();
        dtm.removeRow(3);
        dtm.removeRow(2);
        dtm.removeRow(1);
        dtm.removeRow(0);
        jEditorPane1.setEditable(false);
        
        jEditorPane1.setEditorKit(kit);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTabbedPane1.addTab("Edicion", jScrollPane1);

        jButton2.setText("Abrir con Navegador");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Página Web Resultante","Reporte de Tokens","Errores Léxicos","Errores Sintácticos"}));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jTabbedPane4.addTab("Texto Plano", jScrollPane4);

        jScrollPane5.setViewportView(jEditorPane1);

        jTabbedPane4.addTab("Vista Previa", jScrollPane5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Resultados", jPanel1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTabbedPane2.addTab("Consola", jScrollPane2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Tipo", "Valor", "Linea","Columna"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jTabbedPane2.addTab("Variables", jScrollPane3);

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Guardar Como...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Compilar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem6.setText("Manual de Usuario");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Manual Técnico");
        jMenu2.add(jMenuItem7);
        jMenu2.add(jSeparator3);

        jMenuItem8.setText("Acerca de...");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i=jComboBox1.getSelectedIndex();
        switch(i){
            case 0:
                try {
                    ejecutar.exec("cmd.exe /K "+((ruta.equals(""))?"DEFAULT":ruta)+".html");
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 1:
                try {
                    ejecutar.exec("cmd.exe /K "+((ruta.equals(""))?"DEFAULT":ruta)+"_Tokens.html");
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                try {
                    ejecutar.exec("cmd.exe /K "+((ruta.equals(""))?"DEFAULT":ruta)+"_E_LEXICOS.html");
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                try {
                    ejecutar.exec("cmd.exe /K "+((ruta.equals(""))?"DEFAULT":ruta)+"_E_SINTACTICOS.html");
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //NEW FILE
        JTextArea OwO= (JTextArea)((JViewport)((JScrollPane)jTabbedPane1.getComponent(0)).getComponent(0)).getComponent(0);
        OwO.setText("");
        ruta="";
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // OPEN FILE
        String texto="";
        try{
            JFileChooser file=new JFileChooser();
            file.showOpenDialog(this);
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos UWeb", "uweb");
            file.setFileFilter(filtro);
            File abre=file.getSelectedFile();
            ruta=abre.getAbsolutePath();
            String aux;
            
            if(abre!=null){
                FileReader archivos=new FileReader(abre);
                BufferedReader lee=new BufferedReader(archivos);
                while((aux=lee.readLine())!=null)
                    texto+=aux+"\n";
                lee.close();
            }
            JTextArea woo= (JTextArea)((JViewport)((JScrollPane)jTabbedPane1.getComponent(0)).getComponent(0)).getComponent(0);
            woo.setText(texto);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,e+"" +"\nNo se ha encontrado el archivo","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            if("".equals(ruta)) wardho();
            else ward();
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // SAVE AS FILE
        try {
            wardho();
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //COMPILATION BUTTON
        JTextArea woo= (JTextArea)((JViewport)((JScrollPane)jTabbedPane1.getComponent(0)).getComponent(0)).getComponent(0);
        String data = woo.getText().replace("“","\"").replace("”","\"");
        Analisis_Lexico Scanner = new Analisis_Lexico(new BufferedReader(new StringReader(data)));
        Analisis_Sintactico Parser = new Analisis_Sintactico(Scanner);
        Arbol AST=null;
        try{
            Parser.parse();
            AST=Parser.getAST();
            AST.setTs(Scanner.getTokens());
            AST.addTE(Scanner.getErrors());
            AST.addTE(Parser.getErrors());
            escritor=new FileWriter(((ruta.equals(""))?"DEFAULT":ruta)+"_Tokens.html");
            escritor.write(AST.ts.getTokens());
            escritor.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Algo valió madres en la sintaxis o el lexico!","TODO MAL :(!!!",JOptionPane.WARNING_MESSAGE);
        }
        if(AST!=null){
            if(AST.te.isEmpty()){
                try {
                    TablaSimbolos ts=new TablaSimbolos();
                    String s=AST.ejecutar(ts, AST).toString();
                    escritor=new FileWriter(((ruta.equals(""))?"DEFAULT":ruta)+".html");
                    escritor.write(s);
                    escritor.close();
                    ventana();

                    JOptionPane.showMessageDialog(null,"Funciona!","TODO GOOD!!!",JOptionPane.WARNING_MESSAGE);
                    for(int i=0;i<dtm.getRowCount();i++){
                        dtm.removeRow(i);
                    }
                    for(Simbolo sim:ts){
                        
                        dtm.addRow(new Object[]{sim.getId(),sim.getTipo(),sim.getValor(),sim.getF(),sim.getC()});
                    }
                    jTextArea2.setText(AST.getConsole());
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null,"Algo valió madres en la ejecución del arbol: un NULL!","TODO MAL :(!!!",JOptionPane.WARNING_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Hay errores Léxicos o Sintácticos!","TODO MAL :(!!!",JOptionPane.WARNING_MESSAGE);
                try {
                    escritor=new FileWriter(((ruta.equals(""))?"DEFAULT":ruta)+"_E_SINTACTICOS.html");
                    escritor.write(AST.te.getErrores(true));
                    escritor.close();
                    escritor=new FileWriter(((ruta.equals(""))?"DEFAULT":ruta)+"_E_LEXICOS.html");
                    escritor.write(AST.te.getErrores(false));
                    escritor.close();
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Algo valió madres en el arbol!","TODO MAL :(!!!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        JOptionPane.showMessageDialog(null,"CURSO: ORGANIZACIÓN DE LENGUAJES Y COMPILADORES 1 \nSECCIÓN: C \nNOMBRE: ANDRÉS ESTEBAN CARVAJAL MORALES \nCARNET: 201612272 ","INFORMACION DEL ESTUDIANTE",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    private void ward() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (new FileOutputStream (ruta), "utf-8"));
        
        JTextArea woo= (JTextArea)((JViewport)((JScrollPane)jTabbedPane1.getComponent(0)).getComponent(0)).getComponent(0);
        String[] st= woo.getText().split("\\n");
        for(String owo:st){
            bw.write(owo);
            if(!owo.equals(st[st.length-1])) bw.newLine();
        }
        bw.close();
        //StringBuffer e;
    }
    private void wardho() throws IOException{
        JFileChooser fc =new JFileChooser("");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.setFileFilter(new FileNameExtensionFilter("Archivos UWeb", "uweb"));
        fc.setDialogTitle("Guardar documento como...");
        fc.setSelectedFile(new File("nuevo.uweb"));
        
        fc.setApproveButtonText("Guardar");
        
        int resp=fc.showOpenDialog(this);
        
        if(resp==JFileChooser.APPROVE_OPTION){
            File archivo=fc.getSelectedFile();
            ruta=archivo.getPath();
            ward();
        }
    }
    private void ventana(){
        FileReader archivos;
        String aux,texto="";
        try {
            archivos = new FileReader(((ruta.equals(""))?"DEFAULT":ruta)+".html");
            BufferedReader lee=new BufferedReader(archivos);
            while((aux=lee.readLine())!=null)
                texto+=aux+"\n";
            lee.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextArea3.setText(texto);
        Document doc = kit.createDefaultDocument();
        jEditorPane1.setDocument(doc);
        jEditorPane1.setText(texto);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
