package run;

public class ShowDetail extends javax.swing.JFrame {

    static public int indexStart;
    static public int indexEnd;
    static public int indexRoute;

    public ShowDetail(int a, int b, int c) {
        initComponents();
        indexStart = a;
        indexEnd = b;
        indexRoute = c;
        switch (indexRoute) {
            case 1:
                break;
            case 2:
                K_Air1.setVisible(false);
                K_Air2.setVisible(true);
                break;
            case 3:
                K_Air1.setVisible(false);
                K_Anu1.setVisible(true);
                break;
            case 4:
                K_Air1.setVisible(false);
                K_Anu2.setVisible(true);
                break;
            case 5:
                K_Air1.setVisible(false);
                K_Anu3.setVisible(true);
                break;
            case 6:
                K_Air1.setVisible(false);
                K_Anu4.setVisible(true);
                break;
            case 7:
                K_Air1.setVisible(false);
                Air_K1.setVisible(true);
                break;
            case 8:
                K_Air1.setVisible(false);
                Air_K2.setVisible(true);
                break;
            case 9:
                K_Air1.setVisible(false);
                Air_Anu1.setVisible(true);
                break;
            case 10:
                K_Air1.setVisible(false);
                Air_Anu2.setVisible(true);
                break;
            case 11:
                K_Air1.setVisible(false);
                Anu_K1.setVisible(true);
                break;
            case 12:
                K_Air1.setVisible(false);
                Anu_K2.setVisible(true);
                break;
            case 13:
                K_Air1.setVisible(false);
                Anu_K3.setVisible(true);
                break;
            case 14:
                K_Air1.setVisible(false);
                Anu_Air1.setVisible(true);
                break;
            default:
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        K_Air1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        K_Air2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        K_Anu1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        K_Anu2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        K_Anu3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        K_Anu4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Air_K1 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Air_K2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Air_Anu1 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Air_Anu2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Anu_K1 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Anu_K2 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Anu_K3 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Anu_Air1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        K_Air1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel29MousePressed(evt);
            }
        });
        K_Air1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        K_Air1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดสจล-APL.png"))); // NOI18N
        K_Air1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(K_Air1, "card2");

        K_Air2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel30MousePressed(evt);
            }
        });
        K_Air2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        K_Air2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดสจล-ARL-[T].png"))); // NOI18N
        K_Air2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(K_Air2, "card2");

        K_Anu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel31MousePressed(evt);
            }
        });
        K_Anu1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });
        K_Anu1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดสจล-อนุ-[2-A-B].png"))); // NOI18N
        K_Anu1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(K_Anu1, "card2");

        K_Anu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel32MousePressed(evt);
            }
        });
        K_Anu2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
        });
        K_Anu2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดสจล-อนุ [T-B].jpg"))); // NOI18N
        K_Anu2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(K_Anu2, "card2");

        K_Anu3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel33MousePressed(evt);
            }
        });
        K_Anu3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
        });
        K_Anu3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดสจล-อนุ-[T-A-B].png"))); // NOI18N
        K_Anu3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(K_Anu3, "card2");

        K_Anu4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel34MousePressed(evt);
            }
        });
        K_Anu4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
        });
        K_Anu4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดสจล-อนุ-[รถตู้].png"))); // NOI18N
        K_Anu4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(K_Anu4, "card2");

        Air_K1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel35MousePressed(evt);
            }
        });
        Air_K1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
        });
        Air_K1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดAPL-สจล.png"))); // NOI18N
        Air_K1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Air_K1, "card2");

        Air_K2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel36MousePressed(evt);
            }
        });
        Air_K2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });
        Air_K2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดARL-สจล-[T].png"))); // NOI18N
        Air_K2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Air_K2, "card2");

        Air_Anu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel37MousePressed(evt);
            }
        });
        Air_Anu1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel23MousePressed(evt);
            }
        });
        Air_Anu1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดARL-อนุ-[A-B].png"))); // NOI18N
        Air_Anu1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Air_Anu1, "card2");

        Air_Anu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel38MousePressed(evt);
            }
        });
        Air_Anu2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });
        Air_Anu2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดARL-อนุ-[T-B].png"))); // NOI18N
        Air_Anu2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Air_Anu2, "card2");

        Anu_K1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel39MousePressed(evt);
            }
        });
        Anu_K1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel25MousePressed(evt);
            }
        });
        Anu_K1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดอนุ-สจล-[B-A-2].png"))); // NOI18N
        Anu_K1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Anu_K1, "card2");

        Anu_K2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel40MousePressed(evt);
            }
        });
        Anu_K2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel26MousePressed(evt);
            }
        });
        Anu_K2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดอนุ-สจล-[B-A-T].png"))); // NOI18N
        Anu_K2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Anu_K2, "card2");

        Anu_K3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel41MousePressed(evt);
            }
        });
        Anu_K3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel27MousePressed(evt);
            }
        });
        Anu_K3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดอนุ-สจล-[รถตู้].png"))); // NOI18N
        Anu_K3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Anu_K3, "card2");

        Anu_Air1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/ClickOpenMap.png"))); // NOI18N
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel42MousePressed(evt);
            }
        });
        Anu_Air1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/BackBtn.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel28MousePressed(evt);
            }
        });
        Anu_Air1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/รายละเอียดอนุ-ARL [B].jpg"))); // NOI18N
        Anu_Air1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Anu_Air1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel17MousePressed

    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel18MousePressed

    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel19MousePressed

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel20MousePressed

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel21MousePressed

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel23MousePressed

    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel24MousePressed

    private void jLabel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel25MousePressed

    private void jLabel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel26MousePressed

    private void jLabel27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel27MousePressed

    private void jLabel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MousePressed
        setVisible(false);
        new SelectRoute(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel28MousePressed

    private void jLabel29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel29MousePressed

    private void jLabel30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel30MousePressed

    private void jLabel31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel31MousePressed

    private void jLabel32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel32MousePressed

    private void jLabel33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel33MousePressed

    private void jLabel42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel42MousePressed

    private void jLabel34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel34MousePressed

    private void jLabel35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel35MousePressed

    private void jLabel36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel36MousePressed

    private void jLabel37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel37MousePressed

    private void jLabel38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel38MousePressed

    private void jLabel39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel39MousePressed

    private void jLabel40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel40MousePressed

    private void jLabel41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MousePressed
        setVisible(false);
        new ShowMap(indexStart, indexEnd).setVisible(true);
    }//GEN-LAST:event_jLabel41MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Air_Anu1;
    private javax.swing.JPanel Air_Anu2;
    private javax.swing.JPanel Air_K1;
    private javax.swing.JPanel Air_K2;
    private javax.swing.JPanel Anu_Air1;
    private javax.swing.JPanel Anu_K1;
    private javax.swing.JPanel Anu_K2;
    private javax.swing.JPanel Anu_K3;
    private javax.swing.JPanel K_Air1;
    private javax.swing.JPanel K_Air2;
    private javax.swing.JPanel K_Anu1;
    private javax.swing.JPanel K_Anu2;
    private javax.swing.JPanel K_Anu3;
    private javax.swing.JPanel K_Anu4;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
