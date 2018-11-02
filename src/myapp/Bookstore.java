/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

/**
 *
 * @author MILK
 */
public class Bookstore extends javax.swing.JFrame {

    /**
     * Creates new form Bookdetaill
     */
    public Bookstore() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBook = new javax.swing.JPanel();
        img_showbook = new javax.swing.JLabel();
        btn_selectCounts = new javax.swing.JSpinner();
        btn_pick = new javax.swing.JButton();
        lbl_bookname = new javax.swing.JLabel();
        lbl_authorname = new javax.swing.JLabel();
        lbl_booktype = new javax.swing.JLabel();
        lbl_bookprice = new javax.swing.JLabel();
        lbl_bookpublisher = new javax.swing.JLabel();
        lbl_bookyears = new javax.swing.JLabel();
        lbl_booklanguage = new javax.swing.JLabel();
        lbl_bookpagenumber = new javax.swing.JLabel();
        lbl_showdetail = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btn_userStatus = new javax.swing.JLabel();
        btn_menubar = new javax.swing.JPanel();
        btn_allbook = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_loginStatus = new javax.swing.JButton();
        btn_basket = new javax.swing.JButton();
        btn_search = new javax.swing.JTextField();
        btn_search_icon = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        btn_editbook = new javax.swing.JButton();
        img_logo = new javax.swing.JLabel();
        img_customercare = new javax.swing.JLabel();
        statusbar = new javax.swing.JPanel();
        lbl_version = new javax.swing.JLabel();
        lbl_statusbar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        setPreferredSize(new java.awt.Dimension(1050, 600));

        panelBook.setBackground(new java.awt.Color(255, 255, 255));
        panelBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBook.add(img_showbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 280, 390));

        btn_selectCounts.setFont(new java.awt.Font("Ekkamai Standard", 1, 24)); // NOI18N
        btn_selectCounts.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        btn_selectCounts.setVerifyInputWhenFocusTarget(false);
        panelBook.add(btn_selectCounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 110, 40));

        btn_pick.setBackground(new java.awt.Color(204, 204, 255));
        btn_pick.setFont(new java.awt.Font("Ekkamai Standard", 1, 14)); // NOI18N
        btn_pick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/img_cart.png"))); // NOI18N
        btn_pick.setText("หยิบใส่ตะกร้า");
        panelBook.add(btn_pick, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 160, 40));

        lbl_bookname.setFont(new java.awt.Font("Ekkamai Standard", 1, 18)); // NOI18N
        panelBook.add(lbl_bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 410, 60));

        lbl_authorname.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(lbl_authorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 390, 60));

        lbl_booktype.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(lbl_booktype, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 390, 60));

        lbl_bookprice.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(lbl_bookprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 390, 60));

        lbl_bookpublisher.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(lbl_bookpublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 390, 60));

        lbl_bookyears.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(lbl_bookyears, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 390, 60));

        lbl_booklanguage.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(lbl_booklanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 390, 60));

        lbl_bookpagenumber.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(lbl_bookpagenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 390, 60));

        lbl_showdetail.setBackground(new java.awt.Color(233, 233, 255));
        panelBook.add(lbl_showdetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 460, 360));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setName(""); // NOI18N
        panelMenu.setPreferredSize(new java.awt.Dimension(1024, 60));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_userStatus.setBackground(new java.awt.Color(255, 255, 255));
        btn_userStatus.setFont(new java.awt.Font("Ekkamai Standard", 1, 18)); // NOI18N
        btn_userStatus.setForeground(new java.awt.Color(204, 204, 255));
        btn_userStatus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_userStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/img_loginuser.png"))); // NOI18N
        btn_userStatus.setText("ผู้เยี่ยมชม");
        panelMenu.add(btn_userStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 220, 40));

        btn_menubar.setBackground(new java.awt.Color(204, 204, 255));
        btn_menubar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_allbook.setBackground(new java.awt.Color(204, 204, 255));
        btn_allbook.setFont(new java.awt.Font("Ekkamai Standard", 0, 17)); // NOI18N
        btn_allbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/img_allbook_26px.png"))); // NOI18N
        btn_allbook.setText("หนังสือทั้งหมด");
        btn_allbook.setBorder(null);
        btn_allbook.setBorderPainted(false);
        btn_allbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_allbook.setFocusable(false);
        btn_menubar.add(btn_allbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 160, 40));

        btn_home.setBackground(new java.awt.Color(204, 204, 255));
        btn_home.setFont(new java.awt.Font("Ekkamai Standard", 0, 17)); // NOI18N
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/img_home.png"))); // NOI18N
        btn_home.setText("หน้าหลัก");
        btn_home.setBorder(null);
        btn_home.setBorderPainted(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.setFocusable(false);
        btn_menubar.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        btn_loginStatus.setBackground(new java.awt.Color(204, 204, 255));
        btn_loginStatus.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        btn_loginStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/img_loginuser.png"))); // NOI18N
        btn_loginStatus.setText("เข้าสู่ระบบ");
        btn_loginStatus.setBorder(null);
        btn_loginStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_loginStatus.setFocusable(false);
        btn_menubar.add(btn_loginStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 130, 40));

        btn_basket.setBackground(new java.awt.Color(204, 204, 255));
        btn_basket.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        btn_basket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/img_cart.png"))); // NOI18N
        btn_basket.setText("0");
        btn_basket.setBorder(null);
        btn_basket.setBorderPainted(false);
        btn_basket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_basket.setFocusable(false);
        btn_menubar.add(btn_basket, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 80, 40));

        btn_search.setBackground(new java.awt.Color(205, 205, 240));
        btn_search.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        btn_search.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        btn_search.setText("กรอกเพื่อค้นหา");
        btn_search.setBorder(null);
        btn_search.setCaretColor(new java.awt.Color(255, 255, 255));
        btn_search.setRequestFocusEnabled(false);
        btn_search.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        btn_search.setSelectionColor(new java.awt.Color(255, 255, 255));
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchMouseClicked(evt);
            }
        });
        btn_menubar.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 100, 40));

        btn_search_icon.setBackground(new java.awt.Color(205, 205, 240));
        btn_search_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/img_search.png"))); // NOI18N
        btn_search_icon.setBorder(null);
        btn_search_icon.setBorderPainted(false);
        btn_search_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_search_icon.setFocusable(false);
        btn_menubar.add(btn_search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 40));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/img_searchbar.png"))); // NOI18N
        btn_menubar.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 5, 30, 30));

        btn_editbook.setBackground(new java.awt.Color(204, 204, 255));
        btn_editbook.setFont(new java.awt.Font("Ekkamai Standard", 0, 17)); // NOI18N
        btn_editbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/img_edit.png"))); // NOI18N
        btn_editbook.setText("แก้ไขหนังสือ");
        btn_editbook.setBorder(null);
        btn_editbook.setBorderPainted(false);
        btn_editbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editbook.setFocusable(false);
        btn_menubar.add(btn_editbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 140, 40));

        panelMenu.add(btn_menubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 1080, 40));

        img_logo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        panelMenu.add(img_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 60));

        img_customercare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/img_contactcare.png"))); // NOI18N
        panelMenu.add(img_customercare, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 230, 60));

        statusbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_version.setText("Version : 5.10.12.2");
        statusbar.add(lbl_version, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        lbl_statusbar.setText("Status : Online");
        statusbar.add(lbl_statusbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelBook, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(statusbar, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 419, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelBook, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 501, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 586, Short.MAX_VALUE)
                    .addComponent(statusbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        statusbar.getAccessibleContext().setAccessibleParent(btn_allbook);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked
        btn_search.setText("");
    }//GEN-LAST:event_btn_searchMouseClicked

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
            java.util.logging.Logger.getLogger(Bookstore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookstore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookstore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookstore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_allbook;
    private javax.swing.JButton btn_basket;
    private javax.swing.JButton btn_editbook;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_loginStatus;
    private javax.swing.JPanel btn_menubar;
    private javax.swing.JButton btn_pick;
    private javax.swing.JTextField btn_search;
    private javax.swing.JButton btn_search_icon;
    private javax.swing.JSpinner btn_selectCounts;
    private javax.swing.JLabel btn_userStatus;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel img_customercare;
    private javax.swing.JLabel img_logo;
    private javax.swing.JLabel img_showbook;
    private javax.swing.JLabel lbl_authorname;
    private javax.swing.JLabel lbl_booklanguage;
    private javax.swing.JLabel lbl_bookname;
    private javax.swing.JLabel lbl_bookpagenumber;
    private javax.swing.JLabel lbl_bookprice;
    private javax.swing.JLabel lbl_bookpublisher;
    private javax.swing.JLabel lbl_booktype;
    private javax.swing.JLabel lbl_bookyears;
    private javax.swing.JPanel lbl_showdetail;
    private javax.swing.JLabel lbl_statusbar;
    private javax.swing.JLabel lbl_version;
    private javax.swing.JPanel panelBook;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel statusbar;
    // End of variables declaration//GEN-END:variables
}
