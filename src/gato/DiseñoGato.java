/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author nesto
 */
public class DiseñoGato extends javax.swing.JFrame {

    private static int TAM=3;
    private int nTablero[][]=new int[TAM][TAM];
    private int nGanador=-1;
    private static int nContar=0;
    private int Profundidad=7;
    Jugador jugador1;
    Jugador maquina;
    private boolean maquinas=false;
    
    public DiseñoGato() {
        initComponents();
        this.setLocationRelativeTo(null);
        botones(false);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Radio1 = new javax.swing.JRadioButton();
        Radio2 = new javax.swing.JRadioButton();
        JugadorInicio = new javax.swing.JComboBox<>();
        inicio = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Ganador = new javax.swing.JLabel();
        compu = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 80, 60));

        boton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, 60));

        boton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 60));

        boton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 60));

        boton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 80, 60));

        boton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 80, 60));

        boton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 60));

        boton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 80, 60));

        boton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 80, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("JUGADOR 1:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel2.setText("TIC TAC TOE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("MAQUINA:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        Radio1.setText("En turno");
        getContentPane().add(Radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        Radio2.setText("En turno");
        getContentPane().add(Radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        JugadorInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir Turno", "Jugador 1", "Maquina" }));
        getContentPane().add(JugadorInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        inicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inicio.setText("Jugar");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        jButton10.setText("Salir");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, 30));

        Ganador.setFont(new java.awt.Font("Tahoma", 3, 34)); // NOI18N
        getContentPane().add(Ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        compu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        compu.setText("Computadora vs Computadora");
        compu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compuActionPerformed(evt);
            }
        });
        getContentPane().add(compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 230, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/images.jpeg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
       llenarTabla(boton3,0, 2);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
       llenarTabla(boton6,1, 2);
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        llenarTabla(boton7,2, 0);
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
       llenarTabla(boton8,2, 1);
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
       llenarTabla(boton9,2, 2);
    }//GEN-LAST:event_boton9ActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        String categoria1 = (String) JugadorInicio.getSelectedItem();
        empezarJuego();
        if (categoria1=="Elegir Turno") {
            JOptionPane.showMessageDialog(null, "Elige un turno");
        }else{
            botones(true);
            inicio.setEnabled(false);
            JugadorInicio.setEnabled(false);
            if (categoria1=="Maquina") {
                maquina=new Jugador(true, 2);
                jugador1=new Jugador(false, 1);
                JugadaMaquina(nTablero,2);
            }
            if(categoria1=="Jugador 1"){
                maquina=new Jugador(false, 2);
                jugador1=new Jugador(true, 1);
            }
            turno();
        }
    }//GEN-LAST:event_inicioActionPerformed
    public void empezarJuego(){
        for (int n=0;n<TAM;n++)
            for (int m=0;m<TAM;m++)
                nTablero[n][m]=0;
        nGanador=-1;
        MostrarJuego();
    }
    public void MostrarJuego(){
        System.out.println("Jugada");
        for (int n=0;n<TAM;n++){
            System.out.println("");
            for (int m=0;m<TAM;m++){
                System.out.print("["+nTablero[n][m]+"]");
            }
        }
        
    }
    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
       llenarTabla(boton2,0, 1);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        llenarTabla(boton1,0, 0);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
      llenarTabla(boton4,1, 0);
        
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        llenarTabla(boton5,1, 1);
    }//GEN-LAST:event_boton5ActionPerformed

    private void compuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compuActionPerformed
        String categoria1 = (String) JugadorInicio.getSelectedItem();
        
        empezarJuego();
        maquinas=true;
        botones(true);
        inicio.setEnabled(false);
        JugadorInicio.setEnabled(false);
        maquina=new Jugador(true, 2);
        jugador1=new Jugador(false, 1);
        int n=0;
        JugadaMaquina(nTablero, 2);
    }//GEN-LAST:event_compuActionPerformed
    
    public void botones(boolean onOf){
        boton1.setEnabled(onOf);
        boton2.setEnabled(onOf);
        boton3.setEnabled(onOf);
        boton4.setEnabled(onOf);
        boton5.setEnabled(onOf);
        boton6.setEnabled(onOf);
        boton7.setEnabled(onOf);
        boton8.setEnabled(onOf);
        boton9.setEnabled(onOf);
    }
    
    public void turno(){
        boolean fin=false;
        Radio1.setEnabled(false);
        Radio2.setEnabled(false);
        if (jugador1.turno==true) {
            Radio1.setSelected(true);
            Radio2.setSelected(false);
        }else{
            Radio1.setSelected(false);
            Radio2.setSelected(true);
        }
    }
    public void TerminarJuego(){
        nGanador=ganaPartida();
            if (nGanador==2) {
                Ganador.setText("Perdiste");
                botones(false);
            }
            if(nGanador==1){
                Ganador.setText("Ganaste");
                botones(false);
            }
            if (nGanador==-1 && tableroCompleto()) {
                Ganador.setText("Empate");
                botones(false);
            }
    }
    
    public void llenarTabla(JButton btn,int x, int y){
        if (jugador1.turno==true) {
            System.out.println("poniendo jugador");
            nTablero[x][y]=1;
            btn.setText("X");
            btn.setEnabled(false);
            jugador1.setTurno(false);
            maquina.setTurno(true);
            JugadaMaquina(nTablero,2);
        }else{
            System.out.println("poniendo maquina");
            nTablero[x][y]=2;
            btn.setText("O");
            btn.setEnabled(false);
            jugador1.setTurno(true);
            maquina.setTurno(false);
            if(maquinas){
                JugadaMaquina(nTablero,1);
            }
        }
        
        TerminarJuego();
        turno();
    }
    private void ClickBoton(int[] xy){
        if(xy[0] == 0 && xy[1] == 0)  boton1.doClick();
        else if(xy[0] == 0 && xy[1] == 1)  boton2.doClick();
        else if(xy[0] == 0 && xy[1] == 2)  boton3.doClick();
        else if(xy[0] == 1 && xy[1] == 0)  boton4.doClick();
        else if(xy[0] == 1 && xy[1] == 1)  boton5.doClick();
        else if(xy[0] == 1 && xy[1] == 2)  boton6.doClick();
        else if(xy[0] == 2 && xy[1] == 0)  boton7.doClick();
        else if(xy[0] == 2 && xy[1] == 1)  boton8.doClick();
        else if(xy[0] == 2 && xy[1] == 2)  boton9.doClick();
    }
    
    public int ganaPartida(){
        if (nTablero[0][0] != 0 && nTablero[0][0] == nTablero[1][1]
                && nTablero[0][0] == nTablero[2][2])
            return nTablero[0][0];
        if (nTablero[0][2] != 0 && nTablero[0][2] == nTablero[1][1]
                && nTablero[0][2] == nTablero[2][0])
            return nTablero[0][2];
        for (int n=0;n<TAM;n++){
            if (nTablero[n][0] != 0 && nTablero[n][0] == nTablero[n][1]
                    && nTablero[n][0] == nTablero[n][2])
                return nTablero[n][0];
            if (nTablero[0][n] != 0 && nTablero[0][n] == nTablero[1][n]
                    && nTablero[0][n] == nTablero[2][n])
                return nTablero[0][n];
        }
        return -1;
    }
    
   //Algoritmo minimax
    private boolean tableroCompleto(){
        for (int n=0;n<TAM;n++)
            for (int m=0;m<TAM;m++)
                if (nTablero[n][m]==0)
                    return false;
        return true;
    }
    
    
    
    private void JugadaMaquina(int[][] m,int aux){
        int mejorfila=0,mejorCol=1;
        int max,maxActual;
        max=Integer.MIN_VALUE;
       	for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if (m[j][i]==0){
                    int temfila,temcol;
                    m[j][i]=aux;
                    temfila=i;
                    temcol=j;
                    maxActual=ValorMin(m,3,Integer.MIN_VALUE,Integer.MAX_VALUE,aux);
                    m[temcol][temfila]=0;
                    if (max<maxActual) {
                        max=maxActual;
                        mejorfila=temfila;
                        mejorCol=temcol;
                    }
                    
                }
            }
       	}
        ClickBoton(new int[]{mejorCol,mejorfila});
    }
    private int ValorMin(int[][] m, int profundidad, int alpha, int beta,int aux) {
        if (ganaPartida()==1 || ganaPartida()==2) {
            return logica(m,aux);
        }else if(tableroCompleto()==true){
            return logica(m,aux);
        }else if(Profundidad<profundidad){
            return logica(m,aux);
        }else{
            int aux2=0;
            if (aux==2) {
                aux2=1;
            }else{
                aux2=2;
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <3; j++) {
                    if (m[j][i]==0){
                        int temfila,temcol;
                        m[j][i]=aux2;
                        temfila=i;
                        temcol=j;
                        beta=min(beta,ValorMax(m,profundidad+1,alpha,beta,aux));
                        m[temcol][temfila]=0;
                        if (alpha>=beta) {
                            return alpha;
                        } 
                    }
                }
            }
            return beta;
       }
    }
    
    private int ValorMax(int[][] m, int profundidad, int alpha, int beta,int aux) {
         if (ganaPartida()==1 || ganaPartida()==2) {
            return logica(m,aux);
        }else if(tableroCompleto()==true){
            return logica(m,aux);
        }else if(Profundidad<profundidad){
           return logica(m,aux);
        }else{
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <3; j++) {
                    if (m[j][i]==0){
                        int temfila,temcol;
                        m[j][i]=aux;
                        temfila=i;
                        temcol=j;
                        alpha=max(alpha,ValorMin(m,profundidad+1,alpha,beta,aux));
                        m[temcol][temfila]=0;
                        if (alpha>=beta) {
                            return beta;
                        } 
                    }
                }
            }
            return alpha;
        }
    }
     private int logica(int[][] m, int aux) {
        int costo;
         if (aux==2) {
             costo=jugada(m,2)-jugada(m,1);
         }else
         {
             costo=jugada(m,1)-jugada(m,2);
         }
        return costo;
     }
     private int jugada(int [][]m,int jugador){
         int value=0;
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if (j+2<3) {
                     if (m[j][i]==jugador && m[j+1][i]==jugador && m[j+2][i]==jugador){
                        return 500; 
                     }
                 }
                 if (i+2<3) {
                     if (m[j][i]==jugador && m[j][i+1]==jugador && m[j][i+2]==jugador){
                        return 500; 
                     }
                 }
                 if (i+2<3) {
                     if (m[j][i]==jugador && m[j][i+1]==jugador && m[j][i+2]==jugador){
                        return 500; 
                     }
                 }
                 if (i+2<3 && j+2<3) {
                     if (m[j][i]==jugador && m[j+1][i+1]==jugador && m[j+2][i+2]==jugador){
                        return 500; 
                     }
                 }
                 if (i-2>-1 && j+2<3) {
                     if (m[j][i]==jugador && m[j+1][i-1]==jugador && m[j+2][i-2]==jugador){
                        return 500; 
                     }
                 }
                 if (i+2<3 && j-2>-1) {
                     if (m[j][i]==jugador && m[j-1][i+1]==jugador && m[j-2][i+2]==jugador){
                        return 500; 
                     }
                 }
                 if (j+1<3) {
                     if (m[j][i]==jugador && m[j+1][i]==jugador ){
                        value= 300; 
                     }
                 }
                 if (i+1<3) {
                     if (m[j][i]==jugador && m[j][i+1]==jugador ){
                        value= 300; 
                     }
                 }
                 if (i-1>-1 && j+1<3 ) {
                     if (m[j][i]==jugador && m[j+1][i-1]==jugador ){
                        value= 300; 
                     }
                 }
                 if (i+1<3 && j-1>-1 ) {
                     if (m[j][i]==jugador && m[j-1][i+1]==jugador ){
                        value= 300; 
                     }
                 }
             }
         }
         return value;
     }
    
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
            java.util.logging.Logger.getLogger(DiseñoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiseñoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiseñoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiseñoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiseñoGato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Ganador;
    private javax.swing.JComboBox<String> JugadorInicio;
    private javax.swing.JRadioButton Radio1;
    private javax.swing.JRadioButton Radio2;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton compu;
    private javax.swing.JButton inicio;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

   

    

    
}
