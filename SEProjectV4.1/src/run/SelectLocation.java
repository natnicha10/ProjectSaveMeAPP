package run;

import javax.swing.JOptionPane;

public class SelectLocation extends javax.swing.JFrame {

    public SelectLocation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        StartLocation = new javax.swing.JComboBox<>();
        EndLocation = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/NextText.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel2)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 450, 90));

        StartLocation.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        StartLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "StartLocation", "KMITL", "Airport Link", "อนุสาวรีชัยฯ" }));
        StartLocation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StartLocation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StartLocationItemStateChanged(evt);
            }
        });
        getContentPane().add(StartLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 250, 50));

        EndLocation.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        EndLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EndLocation" }));
        EndLocation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(EndLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 250, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run/Page2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StartLocationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StartLocationItemStateChanged
        switch (StartLocation.getSelectedIndex()) {
            case 1:
                EndLocation.removeAllItems();
                EndLocation.addItem("AirPort Link");
                EndLocation.addItem("อนุสาวรีชัยฯ");
                break;
            case 2:
                EndLocation.removeAllItems();
                EndLocation.addItem("KMITL");
                EndLocation.addItem("อนุสาวรีชัยฯ");
                break;
            case 3:
                EndLocation.removeAllItems();
                EndLocation.addItem("KMITL");
                EndLocation.addItem("AirPort Link");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_StartLocationItemStateChanged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        if (StartLocation.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "กรุณาเลือกจุดเริ่มต้น", "คุณไม่ได้เลือกจุดเริ่มต้น", JOptionPane.ERROR_MESSAGE);
        } else {
            setVisible(false);
            new SelectRoute(StartLocation.getSelectedIndex(),EndLocation.getSelectedIndex()).setVisible(true);
        }
    }//GEN-LAST:event_jPanel1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EndLocation;
    private javax.swing.JComboBox<String> StartLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
