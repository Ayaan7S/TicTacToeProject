package com.mycompany.tictactoeproject;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author aysye9035 Ayaan
 */
public class TicTacToeFrame extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToeFrame
     */
    private String startgame = "X";
    private int xcount = 0;
    private int ocount = 0;
    boolean checker;
    
    
    int turn = 2;
    int buttonused[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public TicTacToeFrame() {
        initComponents();
    }

    private void gameScore()
    {
        jbtplayerX.setText(String.valueOf(xcount));
        jbtplayerO.setText(String.valueOf(ocount));

    }
    private void choose_a_Player()
    {
        if(startgame.equalsIgnoreCase("X"))
        {
            startgame = "O";
        }
        else
        {
            startgame = "X";
        }
    }
    private void winningGame()
    {
        String button1 = b1.getText();
        String button2 = b2.getText();
        String button3 = b3.getText();
        String button4 = b4.getText();
        String button5 = b5.getText();       
        String button6 = b6.getText();        
        String button7 = b7.getText();
        String button8 = b8.getText();
        String button9 = b9.getText();
                
        if (button1 == ("X") && button2 == ("X") && button3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.pink);
            b2.setBackground(Color.pink);
            b3.setBackground(Color.pink);
            xcount++;
            gameScore();
        }
        

        if (button4 == ("X") && button5 == ("X") && button6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b4.setBackground(Color.cyan);
            b5.setBackground(Color.cyan);
            b6.setBackground(Color.cyan);
            xcount++;
            gameScore();
        }        
           
        if (button7 == ("X") && button8 == ("X") && button9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b7.setBackground(Color.pink);
            b8.setBackground(Color.pink);
            b9.setBackground(Color.pink);
            xcount++;
            gameScore();
        }      
        
        if (button1 == ("X") && button4 == ("X") && button7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.cyan);
            b4.setBackground(Color.cyan);
            b7.setBackground(Color.cyan);
            xcount++;
            gameScore();
        }
        if (button2 == ("X") && button5 == ("X") && button8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b2.setBackground(Color.green);
            b5.setBackground(Color.green);
            b8.setBackground(Color.green);
            xcount++;
            gameScore();
        } 
        if (button3 == ("X") && button6 == ("X") && button9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b3.setBackground(Color.pink);
            b6.setBackground(Color.pink);
            b9.setBackground(Color.pink);
            xcount++;
            gameScore();
        }
        if (button1== ("X") && button5 == ("X") && button9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.pink);
            b5.setBackground(Color.pink);
            b9.setBackground(Color.pink);
            xcount++;
            gameScore();
        }
        if (button3 == ("X") && button5 == ("X") && button7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b3.setBackground(Color.pink);
            b5.setBackground(Color.pink);
            b7.setBackground(Color.pink);
            xcount++;
            gameScore();
        }
       //-----------------------------------------------------------------------------------------------------------------------------
       //Winning code for the letter "O"
       if (button1 == ("O") && button2 == ("O") && button3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.pink);
            b2.setBackground(Color.pink);
            b3.setBackground(Color.pink);
            ocount++;
            gameScore();
        }
        

        if (button4 == ("O") && button5 == ("O") && button6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b4.setBackground(Color.cyan);
            b5.setBackground(Color.cyan);
            b6.setBackground(Color.cyan);
            ocount++;
            gameScore();
        }        
           
        if (button7 == ("O") && button8 == ("O") && button9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b7.setBackground(Color.pink);
            b8.setBackground(Color.pink);
            b9.setBackground(Color.pink);
            ocount++;
            gameScore();
        }      
        
        if (button1 == ("O") && button4 == ("O") && button7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.cyan);
            b4.setBackground(Color.cyan);
            b7.setBackground(Color.cyan);
            ocount++;
            gameScore();
        }
        if (button2 == ("O") && button5 == ("O") && button8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b2.setBackground(Color.green);
            b5.setBackground(Color.green);
            b8.setBackground(Color.green);
            ocount++;
            gameScore();
        } 
        if (button3 == ("O") && button6 == ("O") && button9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b3.setBackground(Color.pink);
            b6.setBackground(Color.pink);
            b9.setBackground(Color.pink);
            ocount++;
            gameScore();
        }
        if (button1== ("O") && button5 == ("O") && button9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.pink);
            b5.setBackground(Color.pink);
            b9.setBackground(Color.pink);
            ocount++;
            gameScore();
        }
        if (button3 == ("O") && button5 == ("O") && button7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Won","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            b3.setBackground(Color.pink);
            b5.setBackground(Color.pink);
            b7.setBackground(Color.pink);
            ocount++;
            gameScore();
        }
       
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtplayerX = new javax.swing.JButton();
        jbtplayerO = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlblplayerX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnnewgame = new javax.swing.JButton();
        jbtExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        b1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtplayerX.setBackground(new java.awt.Color(0, 153, 153));
        jbtplayerX.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        jbtplayerX.setText("0");

        jbtplayerO.setBackground(new java.awt.Color(0, 153, 153));
        jbtplayerO.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        jbtplayerO.setText("0");

        jLabel2.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        jLabel2.setText("PLAYER O :");

        jlblplayerX.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        jlblplayerX.setText("PLAYER X :");

        jLabel4.setFont(new java.awt.Font("Russo One", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Wins");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(jlblplayerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtplayerO, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jbtplayerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblplayerX, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jbtplayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtplayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnnewgame.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        jbtnnewgame.setText("NEW GAME");
        jbtnnewgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnewgameActionPerformed(evt);
            }
        });

        jbtExit.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        jbtExit.setText("EXIT");
        jbtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExitActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        jbtnReset.setText("RESET");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnnewgame, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jbtnnewgame, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC -TAC -TOE");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
           System.exit(0); 
        }
        
        
    }//GEN-LAST:event_jbtExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        
        
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.LIGHT_GRAY);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        b3.setText(startgame);
        if (startgame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b3ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        b9.setText(startgame);
        if (startgame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b9ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        b6.setText(startgame);
        if (startgame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        b8.setText(startgame);
        if (startgame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        b7.setText(startgame);
        if (startgame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b7ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        b5.setText(startgame);
        if (startgame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        b4.setText(startgame);
        if (startgame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b4ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        b2.setText(startgame);
        if (startgame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        b1.setText(startgame);
        if (startgame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
        
    }//GEN-LAST:event_b1ActionPerformed

    private void jbtnnewgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnewgameActionPerformed
        // TODO add your handling code here:
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        
        jbtplayerX.setText("0");
        jbtplayerO.setText("0");
        
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        
        
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.LIGHT_GRAY);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnnewgameActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jbtExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnnewgame;
    private javax.swing.JButton jbtplayerO;
    private javax.swing.JButton jbtplayerX;
    private javax.swing.JLabel jlblplayerX;
    // End of variables declaration//GEN-END:variables
}
