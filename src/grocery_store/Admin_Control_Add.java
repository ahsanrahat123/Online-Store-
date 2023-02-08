   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;


import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import javax.swing.JScrollPane;


public class Admin_Control_Add extends javax.swing.JFrame {


    public Admin_Control_Add() { 
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));      
        initComponents();

    }
    
    public Admin_Control_Add(String name){
        Product_name_add11 = name;
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));      
        initComponents();
    }
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        header_label = new javax.swing.JLabel();
        SignIn_Out = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        main_panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Product_unit_add = new javax.swing.JTextField();
        Product_price_add = new javax.swing.JTextField();
        Product_image_add = new javax.swing.JTextField();
        image_combo_add = new javax.swing.JComboBox<>();
        unit_combo_add1 = new javax.swing.JComboBox<>();
        Product_name_add = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 247, 243));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        header_label.setFont(new java.awt.Font("Elephant", 2, 14)); // NOI18N
        header_label.setForeground(new java.awt.Color(255, 255, 255));
        header_label.setText("Vai  Brothers  Store ");
        header_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        header_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                header_labelMouseClicked(evt);
            }
        });

        SignIn_Out.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        SignIn_Out.setForeground(new java.awt.Color(255, 255, 255));
        SignIn_Out.setText("Sign Out");
        SignIn_Out.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignIn_Out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignIn_OutMouseClicked(evt);
            }
        });
        SignIn_Out.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SignIn_OutComponentShown(evt);
            }
        });

        username_label.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Admin");
        username_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        username_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username_labelMouseClicked(evt);
            }
        });
        username_label.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                username_labelComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(header_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(username_label)
                .addGap(53, 53, 53)
                .addComponent(SignIn_Out)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(header_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignIn_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_panel.setBackground(new java.awt.Color(255, 247, 243));
        main_panel.setMinimumSize(new java.awt.Dimension(1200, 800));
        main_panel.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add Product");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 111, 0, 0);
        main_panel.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 102));
        jLabel8.setText("Product Unit : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 299, 0, 0);
        main_panel.add(jLabel8, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 102));
        jLabel12.setText("Product Price : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 299, 0, 0);
        main_panel.add(jLabel12, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 102));
        jLabel14.setText("Product Image : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 299, 0, 0);
        main_panel.add(jLabel14, gridBagConstraints);

        Product_unit_add.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Product_unit_add.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Product_unit_add.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Product_unit_addFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Product_unit_addFocusLost(evt);
            }
        });
        Product_unit_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Product_unit_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Product_unit_addMouseExited(evt);
            }
        });
        Product_unit_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_unit_addActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 287;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 64, 0, 0);
        main_panel.add(Product_unit_add, gridBagConstraints);

        Product_price_add.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Product_price_add.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Product_price_add.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Product_price_addFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Product_price_addFocusLost(evt);
            }
        });
        Product_price_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Product_price_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Product_price_addMouseExited(evt);
            }
        });
        Product_price_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_price_addActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 422;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 64, 0, 610);
        main_panel.add(Product_price_add, gridBagConstraints);

        Product_image_add.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Product_image_add.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Product_image_add.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Product_image_addFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Product_image_addFocusLost(evt);
            }
        });
        Product_image_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Product_image_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Product_image_addMouseExited(evt);
            }
        });
        Product_image_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_image_addActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 291;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 64, 0, 0);
        main_panel.add(Product_image_add, gridBagConstraints);

        image_combo_add.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        image_combo_add.setForeground(new java.awt.Color(255, 0, 51));
        image_combo_add.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "png", "jpg" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 610);
        main_panel.add(image_combo_add, gridBagConstraints);

        unit_combo_add1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        unit_combo_add1.setForeground(new java.awt.Color(255, 51, 51));
        unit_combo_add1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "gm", "pcs", "dozen", "L", "ml" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 610);
        main_panel.add(unit_combo_add1, gridBagConstraints);

        Product_name_add.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Product_name_add.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Product_name_add.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Product_name_addFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Product_name_addFocusLost(evt);
            }
        });
        Product_name_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Product_name_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Product_name_addMouseExited(evt);
            }
        });
        Product_name_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_name_addActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 422;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(134, 64, 0, 610);
        main_panel.add(Product_name_add, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 102));
        jLabel15.setText("Product Name : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(134, 299, 0, 0);
        main_panel.add(jLabel15, gridBagConstraints);

        Update.setBackground(new java.awt.Color(255, 0, 0));
        Update.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        Update.setBorderPainted(false);
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(76, 115, 453, 0);
        main_panel.add(Update, gridBagConstraints);

        jScrollPane1.setViewportView(main_panel);

        jPanel2.setBackground(new java.awt.Color(255, 247, 243));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Contact Us");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 51)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 301, 0, 0);
        jPanel2.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("01674455123");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 0);
        jPanel2.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("vaibrothers@gmail.com");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 608);
        jPanel2.add(jLabel11, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Vai Brothers Store");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 48, 0);
        jPanel2.add(jLabel13, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/call.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 136, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/facebook-logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 136, 48, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gmail.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 136, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_labelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_username_labelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_username_labelComponentShown

    private void username_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_labelMouseClicked
       new Admin_Control_Option().setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_username_labelMouseClicked

    private void SignIn_OutComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SignIn_OutComponentShown

    }//GEN-LAST:event_SignIn_OutComponentShown

    private void SignIn_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIn_OutMouseClicked
        if(Product_name_add11==null){
            new SignIn().setVisible(true);
            this.dispose();
        }
        else{
            new Items().setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_SignIn_OutMouseClicked

    private void header_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_labelMouseClicked
        new Items("admin").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_header_labelMouseClicked

    private void Product_unit_addFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_unit_addFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_addFocusGained

    private void Product_unit_addFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_unit_addFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_addFocusLost

    private void Product_unit_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_unit_addMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_addMouseEntered

    private void Product_unit_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_unit_addMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_addMouseExited

    private void Product_unit_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_unit_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_addActionPerformed

    private void Product_price_addFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_price_addFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_price_addFocusGained

    private void Product_price_addFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_price_addFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_price_addFocusLost

    private void Product_price_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_price_addMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_price_addMouseEntered

    private void Product_price_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_price_addMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_price_addMouseExited

    private void Product_price_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_price_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_price_addActionPerformed

    private void Product_image_addFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_image_addFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_image_addFocusGained

    private void Product_image_addFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_image_addFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_image_addFocusLost

    private void Product_image_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_image_addMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_image_addMouseEntered

    private void Product_image_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_image_addMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_image_addMouseExited

    private void Product_image_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_image_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_image_addActionPerformed

    private void Product_name_addFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_name_addFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_addFocusGained

    private void Product_name_addFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_name_addFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_addFocusLost

    private void Product_name_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_name_addMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_addMouseEntered

    private void Product_name_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_name_addMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_addMouseExited

    private void Product_name_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_name_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_addActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        int input = JOptionPane.showConfirmDialog(null,"Do you really want to place this order?", "Confirmation", OK_CANCEL_OPTION);
        if(input==0){
            JOptionPane.showMessageDialog(this, "You have successfully added the product in the store ","Added in the store",JOptionPane.PLAIN_MESSAGE);
            try{
                FileReader filereader = new FileReader("Items.csv");
                CSVReader reader = new CSVReaderBuilder(filereader).build();       
                List<String[]> Items = reader.readAll();
                String[] item = {"/images/" + Product_image_add.getText() + "." +String.valueOf(image_combo_add.getSelectedItem()) , Product_name_add.getText(),Product_unit_add.getText() +" "+ String.valueOf(unit_combo_add1.getSelectedItem()),Product_price_add.getText(),String.valueOf((int) Integer.valueOf(Items.get(Items.size()-1)[4]) + 1)};                                                   
                CSVWriter writer = new CSVWriter(new FileWriter("Items.csv"));
                Items.add(item);
                writer.writeAll(Items);
                writer.flush();
                writer.close();
                                    
             }
             catch(IOException e){
                 e.printStackTrace(); 
             }
             catch(CsvException e){
                 e.printStackTrace();
        }
        }
    }//GEN-LAST:event_UpdateMouseClicked

    
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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {  
                new Admin_Control_Add().setVisible(true);
            }
        });
    }
    public JLabel getUsernameLabel(){
        return SignIn_Out;
    }
    private String Product_name_add11;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Product_image_add;
    private javax.swing.JTextField Product_name_add;
    private javax.swing.JTextField Product_price_add;
    private javax.swing.JTextField Product_unit_add;
    private javax.swing.JLabel SignIn_Out;
    private javax.swing.JButton Update;
    private javax.swing.JLabel header_label;
    private javax.swing.JComboBox<String> image_combo_add;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JComboBox<String> unit_combo_add1;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables

}
