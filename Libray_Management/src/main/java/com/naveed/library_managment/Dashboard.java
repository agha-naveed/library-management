package com.naveed.library_managment;

import javax.swing.JFrame;

/**
 *
 * @author aghanaveed_
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
         Dashboard_inner_form ds = new Dashboard_inner_form();
        DesktopPane.removeAll();
        DesktopPane.updateUI();
        DesktopPane.add(ds);
        ds.setVisible(true);
        
        
        
//        
    
    this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    String month[]={"JAN","FEB","MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
    String day[]={"S U N D A Y", "M O N D A Y", "T U E S D A Y","W E D N E S D A Y", "T H U R S D A Y", " F R I D A Y ", "S A T U R D A Y"};
    
    java.util.Date date = new java.util.Date();
    main_date.setText(date.getDate()+"");
    main_date_month.setText(month[date.getMonth()]);
    main_date_year.setText((date.getYear()+1900)+"");
    main_date_day.setText(day[date.getDay()]);
    
        
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void getset(String name) {
        label_welcome.setText("Welcome: "+name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        main_date = new javax.swing.JLabel();
        label_welcome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        main_date_day = new javax.swing.JLabel();
        main_date_month = new javax.swing.JLabel();
        main_date_year = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Dashboard_Icon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddBook_Icon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ReturnBook_Btn = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BorrowBook_Icon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BorrowBook_Btn1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AddBook_menu = new javax.swing.JMenuItem();
        BorrowBook_menu = new javax.swing.JMenuItem();
        ReturnBook_menu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        report_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(66, 66, 66));

        main_date.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        main_date.setForeground(new java.awt.Color(255, 153, 51));
        main_date.setText("09");
        main_date.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        main_date.setIconTextGap(0);
        main_date.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        label_welcome.setForeground(new java.awt.Color(255, 255, 255));
        label_welcome.setText("WELCOME: S.NAVEED");
        label_welcome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        main_date_day.setForeground(new java.awt.Color(255, 255, 255));
        main_date_day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_date_day.setText("S A T U R D A Y");
        main_date_day.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        main_date_month.setForeground(new java.awt.Color(255, 255, 255));
        main_date_month.setText("OCT ");
        main_date_month.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        main_date_year.setForeground(new java.awt.Color(255, 255, 255));
        main_date_year.setText("2023");
        main_date_year.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\aghanaveed_\\Desktop\\JAVA Project\\Library_Managment\\Images\\library-logo.png")); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, Short.MAX_VALUE)
                .addComponent(label_welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(main_date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(main_date_month)
                            .addComponent(main_date_year)))
                    .addComponent(main_date_day, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(main_date_month, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(main_date_year, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(main_date_day))
                                .addComponent(label_welcome))
                            .addComponent(main_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(71, 71, 71));

        Dashboard_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dashboard_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\aghanaveed_\\Desktop\\JAVA Project\\Library_Managment\\Images\\dashboard_logo.png")); // NOI18N
        Dashboard_Icon.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Dashboard_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ShowDashboard(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dashboard");

        AddBook_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddBook_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\aghanaveed_\\Desktop\\JAVA Project\\Library_Managment\\Images\\books_logo.png")); // NOI18N
        AddBook_Icon.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        AddBook_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBook_IconMouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Books");

        ReturnBook_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReturnBook_Btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\aghanaveed_\\Desktop\\JAVA Project\\Library_Managment\\Images\\return_book_logo.png")); // NOI18N
        ReturnBook_Btn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ReturnBook_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Return_Book_MouseClicked(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Return Book");

        BorrowBook_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrowBook_Icon.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BorrowBook_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowBookMouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Borrow Books");

        BorrowBook_Btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrowBook_Btn1.setIcon(new javax.swing.ImageIcon("C:\\Users\\aghanaveed_\\Desktop\\JAVA Project\\Library_Managment\\Images\\issued logo.png")); // NOI18N
        BorrowBook_Btn1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BorrowBook_Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowBook_Btn1Return_Book_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AddBook_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Dashboard_Icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ReturnBook_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(BorrowBook_Btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BorrowBook_Icon))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Dashboard_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(AddBook_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(ReturnBook_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BorrowBook_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrowBook_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEVELOPER: S. NAVEED");

        DesktopPane.setBackground(new java.awt.Color(51, 51, 51));
        DesktopPane.setAutoscrolls(true);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 818, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(708, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(DesktopPane)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(DesktopPane)
                .addGap(2, 2, 2)
                .addComponent(jLabel1))
        );

        jMenu1.setText("File");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jMenuItem4.setText("New");
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jMenuItem5.setText("Exit");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        AddBook_menu.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        AddBook_menu.setText("Add Book");
        AddBook_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBook_menuActionPerformed(evt);
            }
        });
        jMenu2.add(AddBook_menu);

        BorrowBook_menu.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        BorrowBook_menu.setText("Borrow Book");
        BorrowBook_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowBook_menuActionPerformed(evt);
            }
        });
        jMenu2.add(BorrowBook_menu);

        ReturnBook_menu.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ReturnBook_menu.setText("Return Book");
        ReturnBook_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBook_menuActionPerformed(evt);
            }
        });
        jMenu2.add(ReturnBook_menu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        report_menu.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        report_menu.setText("Report");
        report_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_menuActionPerformed(evt);
            }
        });
        jMenu3.add(report_menu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(983, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ShowDashboard(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ShowDashboard

        // TODO add your handling code here:
        Dashboard_inner_form ds = new Dashboard_inner_form();
        DesktopPane.removeAll();
        DesktopPane.updateUI();
                DesktopPane.add(ds);
                ds.setVisible(true);
    }//GEN-LAST:event_btn_ShowDashboard

    private void AddBook_IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBook_IconMouseClicked
        // TODO add your handling code here:s
        Add_Book book_list = new Add_Book();
        DesktopPane.removeAll();
        DesktopPane.updateUI();
        
        DesktopPane.add(book_list);
        book_list.setVisible(true);
    }//GEN-LAST:event_AddBook_IconMouseClicked

    private void BorrowBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowBookMouseClicked
        Borrow_Book borrow = new Borrow_Book();
         DesktopPane.removeAll();
        DesktopPane.updateUI();
        
        DesktopPane.add(borrow);
        borrow.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrowBookMouseClicked

    private void Return_Book_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Return_Book_MouseClicked
        Return_Book return_book = new Return_Book();
        DesktopPane.removeAll();
        DesktopPane.updateUI();
        
        DesktopPane.add(return_book);
        return_book.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_Return_Book_MouseClicked

    private void AddBook_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBook_menuActionPerformed
        // TODO add your handling code here:
        Add_Book book_list = new Add_Book();
        DesktopPane.removeAll();
        DesktopPane.updateUI();
        
        DesktopPane.add(book_list);
        book_list.setVisible(true);
    }//GEN-LAST:event_AddBook_menuActionPerformed

    private void report_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_menuActionPerformed
        report_form report = new report_form();
        DesktopPane.removeAll();
        DesktopPane.updateUI();
        
        DesktopPane.add(report);
        report.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_report_menuActionPerformed

    private void BorrowBook_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowBook_menuActionPerformed
        Borrow_Book borrow = new Borrow_Book();
        DesktopPane.removeAll();
        DesktopPane.updateUI();
        
        DesktopPane.add(borrow);
        borrow.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrowBook_menuActionPerformed

    private void ReturnBook_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBook_menuActionPerformed
        Return_Book return_book = new Return_Book();
        DesktopPane.removeAll();
        DesktopPane.updateUI();
        
        DesktopPane.add(return_book);
        return_book.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnBook_menuActionPerformed

    private void BorrowBook_Btn1Return_Book_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowBook_Btn1Return_Book_MouseClicked
        // TODO add your handling code here:
        Borrow_Book borrow = new Borrow_Book();
        DesktopPane.removeAll();
        DesktopPane.updateUI();
        
        DesktopPane.add(borrow);
        borrow.setVisible(true);
    }//GEN-LAST:event_BorrowBook_Btn1Return_Book_MouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
       
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                
                Dashboard obj = new Dashboard();
                        
                        obj.setVisible(true);
                
                
                Dashboard_inner_form ds = new Dashboard_inner_form();
                obj.DesktopPane.add(ds);
                ds.setVisible(true);
      
      

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBook_Icon;
    private javax.swing.JMenuItem AddBook_menu;
    private javax.swing.JLabel BorrowBook_Btn1;
    private javax.swing.JLabel BorrowBook_Icon;
    private javax.swing.JMenuItem BorrowBook_menu;
    private javax.swing.JLabel Dashboard_Icon;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JLabel ReturnBook_Btn;
    private javax.swing.JMenuItem ReturnBook_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel label_welcome;
    private javax.swing.JLabel main_date;
    private javax.swing.JLabel main_date_day;
    private javax.swing.JLabel main_date_month;
    private javax.swing.JLabel main_date_year;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem report_menu;
    // End of variables declaration//GEN-END:variables
}