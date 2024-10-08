/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogovelhajava;

public class jogo extends javax.swing.JFrame {
    
  public boolean joga= true;
  public boolean jogb= true;
  public int contpos=0;
  public int k=0,i=0;
  int op;
  
  
  public String linha1,linha2,linha3,coluna1,coluna2,coluna3,diagonal1,diagonal2;
   String [] [] posVetor = new String [3] [3];

    public jogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnReinicar = new javax.swing.JButton();
        txtVisor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnReinicar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnReinicar.setText("Reiniciar");
        btnReinicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinicarActionPerformed(evt);
            }
        });

        txtVisor.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtVisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(btnReinicar, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnReinicar)
                .addGap(58, 58, 58))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
     verificaJogadorDaVez();
           if(op==1){
               btn8.setText("X");
               posVetor[2] [1]= "X";
           }else{
                 btn8.setText("o");
               posVetor[2] [1]= "o";
           }
               btn8.setEnabled(false);
              verificaPosicoes();
               VerificaVencedor();
    }//GEN-LAST:event_btn8ActionPerformed
    public void verificaJogadorDaVez(){
    if(joga&&jogb){
           this.op=1;
           joga=false;
           jogb=true;
           txtVisor.setText("vez do jogador o");
       }else if(joga&&jogb==false){
           this.op=1;
           joga=false;
           jogb=true;
           txtVisor.setText("vez do jogador o");
       }else{
           this.op=2;
           joga=true;
           jogb=false;
           txtVisor.setText("vez do jogador X");
            
            
        }
    }
    
    public void limpaPosicoes()
    {
        for(i=0;i<3; i++){
            for(k=0;k<3;k++){
                posVetor[i] [k] = "";
                
            }
    }
    }
     public void verificaPosicoes(){    
         contpos=0;
         
        for(i=0;i<3; i++){
            for(k=0;k<3;k++){
                if(posVetor [i][k] == "X" || posVetor[i][k]=="o"){
                contpos+=1;
                    
                }
            
        
    }
        }
     }
    
   public void VerificaVencedor() {
    linha1 = posVetor[0][0] + posVetor[0][1] + posVetor[0][2];
    linha2 = posVetor[1][0] + posVetor[1][1] + posVetor[1][2];
    linha3 = posVetor[2][0] + posVetor[2][1] + posVetor[2][2];

    coluna1 = posVetor[0][0] + posVetor[1][0] + posVetor[2][0];
    coluna2 = posVetor[0][1] + posVetor[1][1] + posVetor[2][1];
    coluna3 = posVetor[0][2] + posVetor[1][2] + posVetor[2][2];

    diagonal1 = posVetor[0][0] + posVetor[1][1] + posVetor[2][2];
    diagonal2 = posVetor[0][2] + posVetor[1][1] + posVetor[2][0];

    // Verificação do vencedor para o Jogador X
    if (linha1.equals("XXX") || linha2.equals("XXX") || linha3.equals("XXX") ||
        coluna1.equals("XXX") || coluna2.equals("XXX") || coluna3.equals("XXX") ||
        diagonal1.equals("XXX") || diagonal2.equals("XXX")) {
        
        txtVisor.setText("O vencedor é o Jogador X");
        DesativaB();

    // Verificação do vencedor para o Jogador O
    } else if (linha1.equals("ooo") || linha2.equals("ooo") || linha3.equals("ooo") ||
               coluna1.equals("ooo") || coluna2.equals("ooo") || coluna3.equals("ooo") ||
               diagonal1.equals("ooo") || diagonal2.equals("ooo")) {
        
        txtVisor.setText("O vencedor é o Jogador o");
        DesativaB();

    // Caso de empate
    } else if (contpos ==9) {
        txtVisor.setText("Não Houve Vencedor");
    }
}

    
    
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
           verificaJogadorDaVez();
           if(op==1){
               btn1.setText("X");
               posVetor[0] [0]= "X";
           }else{
                 btn1.setText("o");
               posVetor[0] [0]= "o";
           }
               btn1.setEnabled(false);
               verificaPosicoes();
               VerificaVencedor();
          
               
           
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void txtVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisorActionPerformed
        
    }//GEN-LAST:event_txtVisorActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         verificaJogadorDaVez();
           if(op==1){
               btn2.setText("X");
               posVetor[0] [1]= "X";
           }else{
                 btn2.setText("o");
               posVetor[0] [1]= "o";
           }
               btn2.setEnabled(false); 
               verificaPosicoes();
               VerificaVencedor();
           
           
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       
          verificaJogadorDaVez();
           if(op==1){
               btn3.setText("X");
               posVetor[0] [2]= "X";
           }else{
                 btn3.setText("o");
               posVetor[0] [2]= "o";
           }
               btn3.setEnabled(false);
                verificaPosicoes();
               VerificaVencedor();
      
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
             verificaJogadorDaVez();
           if(op==1){
               btn4.setText("X");
               posVetor[1] [0]= "X";
           }else{
                 btn4.setText("o");
               posVetor[1] [0]= "o";
           }
               btn4.setEnabled(false);
               verificaPosicoes();
               VerificaVencedor();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
             verificaJogadorDaVez();
           if(op==1){
               btn5.setText("X");
               posVetor[1] [1]= "X";
           }else{
                 btn5.setText("o");
               posVetor[1] [1]= "o";
           }
               btn5.setEnabled(false);
                verificaPosicoes();
               VerificaVencedor();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
            verificaJogadorDaVez();
           if(op==1){
               btn6.setText("X");
               posVetor[1] [2]= "X";
           }else{
                 btn6.setText("o");
               posVetor[1] [2]= "o";
           }
               btn6.setEnabled(false);
                verificaPosicoes();
               VerificaVencedor();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
             verificaJogadorDaVez();
           if(op==1){
               btn7.setText("X");
               posVetor[2] [0]= "X";
           }else{
                 btn7.setText("o");
               posVetor[2] [0]= "o";
           }
               btn7.setEnabled(false);
                verificaPosicoes();
               VerificaVencedor();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
     verificaJogadorDaVez();
           if(op==1){
               btn9.setText("X");
               posVetor[2] [2]= "X";
           }else{
                 btn9.setText("o");
               posVetor[2] [2]= "o";
           }
               btn9.setEnabled(false);
                verificaPosicoes();
               VerificaVencedor();// TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    
    
    private void btnReinicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinicarActionPerformed
        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
        limpaPosicoes();
        txtVisor.setText("");
        joga=true;
        jogb=true;
    }//GEN-LAST:event_btnReinicarActionPerformed

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
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReinicar;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables

    public void DesativaB() {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
       
    }
}
