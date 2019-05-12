package run;

public class SelectRoute extends javax.swing.JFrame {

    static public int indexStart;
    static public int indexEnd;

    public SelectRoute(int a, int b) {
        initComponents();
        indexStart = a;
        indexEnd = b;
        switch (indexStart) {
            case 1:
                if (indexEnd == 0) {
                    K_Air.setVisible(true);
                } else if (indexEnd == 1) {
                    K_Air.setVisible(false);
                    K_Anu.setVisible(true);
                }
                break;
            case 2:
                if (indexEnd == 0) {
                    K_Air.setVisible(false);
                    Air_K.setVisible(true);
                } else if (indexEnd == 1) {
                    K_Air.setVisible(false);
                    Air_Anu.setVisible(true);
                }
                break;
            case 3:
                if (indexEnd == 0) {
                    K_Air.setVisible(false);
                    Anu_K.setVisible(true);
                } else if (indexEnd == 1) {
                    K_Air.setVisible(false);
                    Anu_Air.setVisible(true);
                }
                break;
            default:
                break;

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        K_Air = new javax.swing.JPanel();
        K_Air2 = new javax.swing.JLabel();
        K_Air1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        K_Anu = new javax.swing.JPanel();
        K_Anu4 = new javax.swing.JLabel();
        K_Anu3 = new javax.swing.JLabel();
        K_Anu2 = new javax.swing.JLabel();
        K_Anu1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Air_K = new javax.swing.JPanel();
        Air_K2 = new javax.swing.JLabel();
        Air_K1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Air_Anu = new javax.swing.JPanel();
        Air_Anu2 = new javax.swing.JLabel();
        Air_Anu1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Anu_K = new javax.swing.JPanel();
        Anu_K3 = new javax.swing.JLabel();
        Anu_K2 = new javax.swing.JLabel();
        Anu_K1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Anu_Air = new javax.swing.JPanel();
        Anu_Air1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        K_Air.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        K_Air2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        K_Air2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        K_Air2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                K_Air2MousePressed(evt);
            }
        });
        K_Air.add(K_Air2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        K_Air1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        K_Air1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        K_Air1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                K_Air1MousePressed(evt);
            }
        });
        K_Air.add(K_Air1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        K_Air.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ทางเลือกเว้นทางสจล-ARL.png"))); // NOI18N
        K_Air.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(K_Air, "card2");

        K_Anu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        K_Anu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        K_Anu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        K_Anu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                K_Anu4MousePressed(evt);
            }
        });
        K_Anu.add(K_Anu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, -1, -1));

        K_Anu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        K_Anu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        K_Anu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                K_Anu3MousePressed(evt);
            }
        });
        K_Anu.add(K_Anu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        K_Anu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        K_Anu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        K_Anu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                K_Anu2MousePressed(evt);
            }
        });
        K_Anu.add(K_Anu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        K_Anu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        K_Anu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        K_Anu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                K_Anu1MousePressed(evt);
            }
        });
        K_Anu.add(K_Anu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        K_Anu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ทางเลือกเว้นทางสจล-อนุ.png"))); // NOI18N
        K_Anu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(K_Anu, "card2");

        Air_K.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Air_K2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        Air_K2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Air_K2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Air_K2MousePressed(evt);
            }
        });
        Air_K.add(Air_K2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        Air_K1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        Air_K1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Air_K1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Air_K1MousePressed(evt);
            }
        });
        Air_K.add(Air_K1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        Air_K.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ทางเลือกเว้นทางARL-สจล.png"))); // NOI18N
        Air_K.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Air_K, "card2");

        Air_Anu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Air_Anu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        Air_Anu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Air_Anu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Air_Anu2MousePressed(evt);
            }
        });
        Air_Anu.add(Air_Anu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        Air_Anu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        Air_Anu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Air_Anu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Air_Anu1MousePressed(evt);
            }
        });
        Air_Anu.add(Air_Anu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        Air_Anu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ทางเลือกเว้นทางARL-อนุ.png"))); // NOI18N
        Air_Anu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Air_Anu, "card2");

        Anu_K.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Anu_K3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        Anu_K3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Anu_K3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Anu_K3MousePressed(evt);
            }
        });
        Anu_K.add(Anu_K3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        Anu_K2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        Anu_K2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Anu_K2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Anu_K2MousePressed(evt);
            }
        });
        Anu_K.add(Anu_K2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        Anu_K1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        Anu_K1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Anu_K1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Anu_K1MousePressed(evt);
            }
        });
        Anu_K.add(Anu_K1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        Anu_K.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ทางเลือกเว้นทางอนุ-สจล.png"))); // NOI18N
        Anu_K.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Anu_K, "card2");

        Anu_Air.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Anu_Air1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดเพิ่มเติมClick.png"))); // NOI18N
        Anu_Air1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Anu_Air1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Anu_Air1MousePressed(evt);
            }
        });
        Anu_Air.add(Anu_Air1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });
        Anu_Air.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ทางเลือกเว้นทางอนุ-ARL.jpg"))); // NOI18N
        Anu_Air.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Anu_Air, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        setVisible(false);
        new SelectLocation().setVisible(true);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        setVisible(false);
        new SelectLocation().setVisible(true);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        setVisible(false);
        new SelectLocation().setVisible(true);
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        setVisible(false);
        new SelectLocation().setVisible(true);
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        setVisible(false);
        new SelectLocation().setVisible(true);
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        setVisible(false);
        new SelectLocation().setVisible(true);
    }//GEN-LAST:event_jLabel12MousePressed

    private void K_Air1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_Air1MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 1).setVisible(true);
    }//GEN-LAST:event_K_Air1MousePressed

    private void K_Air2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_Air2MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 2).setVisible(true);
    }//GEN-LAST:event_K_Air2MousePressed

    private void K_Anu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_Anu1MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 3).setVisible(true);
    }//GEN-LAST:event_K_Anu1MousePressed

    private void K_Anu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_Anu2MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 4).setVisible(true);
    }//GEN-LAST:event_K_Anu2MousePressed

    private void K_Anu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_Anu3MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 5).setVisible(true);
    }//GEN-LAST:event_K_Anu3MousePressed

    private void K_Anu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_Anu4MousePressed
         setVisible(false);
        new ShowDetail(indexStart, indexEnd, 6).setVisible(true);
    }//GEN-LAST:event_K_Anu4MousePressed

    private void Air_K1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Air_K1MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 7).setVisible(true);
    }//GEN-LAST:event_Air_K1MousePressed

    private void Air_K2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Air_K2MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 8).setVisible(true);
    }//GEN-LAST:event_Air_K2MousePressed

    private void Air_Anu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Air_Anu1MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 9).setVisible(true);
    }//GEN-LAST:event_Air_Anu1MousePressed

    private void Air_Anu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Air_Anu2MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 10).setVisible(true);
    }//GEN-LAST:event_Air_Anu2MousePressed

    private void Anu_K1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anu_K1MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 11).setVisible(true);
    }//GEN-LAST:event_Anu_K1MousePressed

    private void Anu_K2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anu_K2MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 12).setVisible(true);
    }//GEN-LAST:event_Anu_K2MousePressed

    private void Anu_K3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anu_K3MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 13).setVisible(true);
    }//GEN-LAST:event_Anu_K3MousePressed

    private void Anu_Air1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anu_Air1MousePressed
        setVisible(false);
        new ShowDetail(indexStart, indexEnd, 14).setVisible(true);
    }//GEN-LAST:event_Anu_Air1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Air_Anu;
    private javax.swing.JLabel Air_Anu1;
    private javax.swing.JLabel Air_Anu2;
    private javax.swing.JPanel Air_K;
    private javax.swing.JLabel Air_K1;
    private javax.swing.JLabel Air_K2;
    private javax.swing.JPanel Anu_Air;
    private javax.swing.JLabel Anu_Air1;
    private javax.swing.JPanel Anu_K;
    private javax.swing.JLabel Anu_K1;
    private javax.swing.JLabel Anu_K2;
    private javax.swing.JLabel Anu_K3;
    private javax.swing.JPanel K_Air;
    private javax.swing.JLabel K_Air1;
    private javax.swing.JLabel K_Air2;
    private javax.swing.JPanel K_Anu;
    private javax.swing.JLabel K_Anu1;
    private javax.swing.JLabel K_Anu2;
    private javax.swing.JLabel K_Anu3;
    private javax.swing.JLabel K_Anu4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
