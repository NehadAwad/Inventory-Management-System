

package inventorymanagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

   DateFormat dateFormat = new SimpleDateFormat("MM/dd/YY");
   Date date = new Date();
   Calendar cal = Calendar.getInstance();
   DefaultTableModel model;
   DefaultTableModel modelListView;
   DefaultTableModel modelSellPanel;
   
   
   private ArrayList<Phone> phoneArray = new ArrayList<Phone>();
   private ArrayList<Tv> tvArray = new ArrayList<Tv>();
   
   
   public Home() throws NumberFormatException  {
    initComponents();
      model = (DefaultTableModel) jTable.getModel();
      DateTF.setText(" "+ dateFormat.format(date));
      DateTF_panel3.setText(" "+ dateFormat.format(date));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        LeftMenuPanel = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButtonProductDetails = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_product_name = new javax.swing.JTextField();
        jTextField_product_catagory = new javax.swing.JTextField();
        jTextField_product_id = new javax.swing.JTextField();
        jTextField_quantity = new javax.swing.JTextField();
        jTextField_sell_rate = new javax.swing.JTextField();
        jTextField_purchase_rate = new javax.swing.JTextField();
        Button_Save_panel_1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        DateTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_panel2_catagory_search = new javax.swing.JTextField();
        jButton_panel2_seach_catagory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Product_list = new javax.swing.JTable();
        Panel3 = new javax.swing.JPanel();
        jTextField6aaaaaaaaaaa = new javax.swing.JTextField();
        jButton_SellItems = new javax.swing.JButton();
        jTextField1sellllllllllllllllllllll = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DateTF_panel3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Sell_Item = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField_TotalPhone = new javax.swing.JTextField();
        jTextField_TotalTv = new javax.swing.JTextField();
        jButton_panel4_refreash = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField_Max_Name = new javax.swing.JTextField();
        jTextField_Max_Catagory = new javax.swing.JTextField();
        jTextField_Max_Quantity = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField_Low_Name2 = new javax.swing.JTextField();
        jTextField_Low_Catagory2 = new javax.swing.JTextField();
        jTextField_Low_Quantity2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LeftMenuPanel.setBackground(new java.awt.Color(54, 33, 89));
        LeftMenuPanel.setLayout(null);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jToggleButton2.setText("Product List");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        LeftMenuPanel.add(jToggleButton2);
        jToggleButton2.setBounds(30, 140, 130, 50);

        jToggleButton3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jToggleButton3.setText("Sell Item Panel");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        LeftMenuPanel.add(jToggleButton3);
        jToggleButton3.setBounds(30, 210, 130, 50);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jToggleButton1.setText("Add Product");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        LeftMenuPanel.add(jToggleButton1);
        jToggleButton1.setBounds(30, 70, 130, 50);

        jButtonProductDetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonProductDetails.setText("Product Details");
        jButtonProductDetails.setMaximumSize(new java.awt.Dimension(130, 50));
        jButtonProductDetails.setMinimumSize(new java.awt.Dimension(130, 50));
        jButtonProductDetails.setPreferredSize(new java.awt.Dimension(130, 50));
        jButtonProductDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductDetailsActionPerformed(evt);
            }
        });
        LeftMenuPanel.add(jButtonProductDetails);
        jButtonProductDetails.setBounds(30, 280, 130, 50);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(100, 100));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(523, 400));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Add Products");

        jLabel3.setText("Product Name");

        jLabel5.setText("Catagory");

        jLabel6.setText("Product Id");

        jLabel7.setText("Purchase Rate");

        jLabel8.setText("Quantity");

        jLabel9.setText("Sell Rate");

        jTextField_product_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_product_nameActionPerformed(evt);
            }
        });

        Button_Save_panel_1.setText("SAVE");
        Button_Save_panel_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Save_panel_1ActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Catagory", "Quantity", "Purchase Rate", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabel2.setText("Date");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(Button_Save_panel_1))
                                    .addComponent(jTextField_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_product_catagory, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_sell_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_purchase_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(DateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Save_panel_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_product_catagory, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_sell_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_purchase_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jLayeredPane1.add(Panel1, "card2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setText("Product List");

        jLabel10.setText("Catagory");

        jButton_panel2_seach_catagory.setText("Search");
        jButton_panel2_seach_catagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_panel2_seach_catagoryActionPerformed(evt);
            }
        });

        jTable_Product_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Catagory", "Quantity", "Purchase Rate", "Sell Rate"
            }
        ));
        jScrollPane2.setViewportView(jTable_Product_list);

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_panel2_catagory_search, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton_panel2_seach_catagory)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_panel2_catagory_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_panel2_seach_catagory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jLayeredPane1.add(Panel2, "card3");

        jTextField6aaaaaaaaaaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6aaaaaaaaaaaActionPerformed(evt);
            }
        });

        jButton_SellItems.setText("DONE");
        jButton_SellItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SellItemsActionPerformed(evt);
            }
        });

        jTextField1sellllllllllllllllllllll.setText("0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel11.setText("Sell Item Panel");

        jLabel12.setText("Product Name");

        jLabel13.setText("Quantity");

        jTable_Sell_Item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Catagory", "Quantity", "Purchase Rate", "Sell Rate"
            }
        ));
        jScrollPane3.setViewportView(jTable_Sell_Item);

        jLabel14.setText("Date");

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(DateTF_panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1sellllllllllllllllllllll, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addComponent(jTextField6aaaaaaaaaaa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton_SellItems)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTF_panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(20, 20, 20)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField6aaaaaaaaaaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SellItems))
                .addGap(28, 28, 28)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1sellllllllllllllllllllll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel3, "card4");

        Panel4.setMaximumSize(new java.awt.Dimension(539, 560));
        Panel4.setMinimumSize(new java.awt.Dimension(539, 560));
        Panel4.setName(""); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel15.setText("Product Details");

        jLabel16.setText("Total Phone Product ");

        jLabel17.setText("Total Tv Product ");

        jTextField_TotalPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TotalPhoneActionPerformed(evt);
            }
        });

        jButton_panel4_refreash.setText("Refreash");
        jButton_panel4_refreash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_panel4_refreashActionPerformed(evt);
            }
        });

        jLabel18.setText("Max Selling Product in the Shop :");

        jLabel19.setText("Name ");

        jLabel20.setText("Catagory");

        jLabel21.setText("Quantity");

        jLabel22.setText("Lowest Selling Product in the Shop:");

        jLabel34.setText("Name ");

        jLabel35.setText("Catagory");

        jLabel36.setText("Quantity");

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addContainerGap())
                            .addGroup(Panel4Layout.createSequentialGroup()
                                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel4Layout.createSequentialGroup()
                                        .addComponent(jTextField_TotalTv, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(Panel4Layout.createSequentialGroup()
                                        .addComponent(jTextField_TotalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton_panel4_refreash)
                                        .addGap(0, 188, Short.MAX_VALUE))))
                            .addGroup(Panel4Layout.createSequentialGroup()
                                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel4Layout.createSequentialGroup()
                                            .addComponent(jLabel34)
                                            .addGap(33, 33, 33)
                                            .addComponent(jTextField_Low_Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(Panel4Layout.createSequentialGroup()
                                            .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel19)
                                                .addComponent(jLabel21)
                                                .addComponent(jLabel20))
                                            .addGap(24, 24, 24)
                                            .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField_Max_Catagory, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField_Max_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField_Max_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(Panel4Layout.createSequentialGroup()
                                        .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35)
                                            .addComponent(jLabel36))
                                        .addGap(18, 18, 18)
                                        .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Low_Quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Low_Catagory2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField_TotalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_panel4_refreash, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField_TotalTv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField_Max_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField_Max_Catagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField_Max_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField_Low_Name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField_Low_Catagory2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField_Low_Quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel4, "card5");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(LeftMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
            .addComponent(LeftMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        jLayeredPane1.removeAll();
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
        jLayeredPane1.add(Panel2);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
           
        jLayeredPane1.removeAll();           
        jLayeredPane1.repaint();           
        jLayeredPane1.revalidate();                       
        jLayeredPane1.add(Panel1);            
        jLayeredPane1.repaint();        
        jLayeredPane1.revalidate();
            
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
    
        jLayeredPane1.removeAll();    
        jLayeredPane1.repaint();    
        jLayeredPane1.revalidate();   
        jLayeredPane1.add(Panel3);   
        jLayeredPane1.repaint();    
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jTextField6aaaaaaaaaaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6aaaaaaaaaaaActionPerformed
       
    }//GEN-LAST:event_jTextField6aaaaaaaaaaaActionPerformed

    private void jTextField_product_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_product_nameActionPerformed
       
    }//GEN-LAST:event_jTextField_product_nameActionPerformed
   
    
    //ADD PRODUCT SAVE BUTTON
    private void Button_Save_panel_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Save_panel_1ActionPerformed
        getValue();
        if(catagory.equals("Phone")){
         Phone a = new Phone(catagory,name,id,quantity,purchase_rate,sell_rate);
         phoneArray.add(a);     
        }
        else if(catagory.equals("Tv")){
         Tv b= new Tv(catagory,name,id,quantity,purchase_rate,sell_rate);
         tvArray.add(b);     
        } 
       
        model.insertRow(model.getRowCount(),new Object[]{id,name,catagory,quantity,purchase_rate,DateTF.getText()});
        
    }//GEN-LAST:event_Button_Save_panel_1ActionPerformed

    //SEARCH
    private void jButton_panel2_seach_catagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_panel2_seach_catagoryActionPerformed
      
       
        getValue();
        modelListView = (DefaultTableModel) jTable_Product_list.getModel();

       
       if(panel2Search.equals("Phone")){
       
       for(int i=0;i<phoneArray.size();i++){
        modelListView.insertRow(modelListView.getRowCount(),new Object[]{phoneArray.get(i).getId(),phoneArray.get(i).getName(),phoneArray.get(i).getCatagory(),phoneArray.get(i).getQuantity(),phoneArray.get(i).getPurchase_rate(),DateTF.getText()}); 
       }
       }
       
       else if(panel2Search.equals("Tv")){
          
       for(int i=0;i<phoneArray.size();i++){
        modelListView.insertRow(modelListView.getRowCount(),new Object[]{tvArray.get(i).getId(),tvArray.get(i).getName(),tvArray.get(i).getCatagory(),tvArray.get(i).getQuantity(),tvArray.get(i).getPurchase_rate(),DateTF.getText()}); 
       }
       }
       
        System.out.println(phoneArray.size());
    }//GEN-LAST:event_jButton_panel2_seach_catagoryActionPerformed
          
    //SELL ITEM BUTTON
    
    private void jButton_SellItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SellItemsActionPerformed
            modelSellPanel = (DefaultTableModel) jTable_Sell_Item.getModel();
        
            getValue();
            try{
            for(int i=0;i<tvArray.size();i++){
                if(Sell_Text_Field_input.equals(tvArray.get(i).getName())){
               
                int b =tvArray.get(i).sell(sell_quantity);
                modelSellPanel.insertRow(modelListView.getRowCount(),new Object[]{tvArray.get(i).getId(),tvArray.get(i).getName(),tvArray.get(i).getCatagory(),tvArray.get(i).getQuantity(),tvArray.get(i).getPurchase_rate(),DateTF.getText()}); 
                System.out.println("now :"+b);
                }      
            }
                
            for(int i=0;i<phoneArray.size();i++){
            
           
                if(Sell_Text_Field_input.equals(phoneArray.get(i).getName())){
               // System.out.println("before: "+phoneArray.get(i).getQuantity());
                phoneArray.get(i).sell(sell_quantity);
                modelSellPanel.insertRow(modelSellPanel.getRowCount(),new Object[]{phoneArray.get(i).getId(),phoneArray.get(i).getName(),phoneArray.get(i).getCatagory(),phoneArray.get(i).getQuantity(),phoneArray.get(i).getPurchase_rate(),DateTF.getText()});
                //System.out.println("now :"+a);                
                }
            //else    
            }
          
            }catch(Exception e){
             
            }
       
    }//GEN-LAST:event_jButton_SellItemsActionPerformed

    private void jButtonProductDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductDetailsActionPerformed
        jLayeredPane1.removeAll();    
        jLayeredPane1.repaint();    
        jLayeredPane1.revalidate();   
        jLayeredPane1.add(Panel4);   
        jLayeredPane1.repaint();    
        jLayeredPane1.revalidate();
        
        
    }//GEN-LAST:event_jButtonProductDetailsActionPerformed

    private void jTextField_TotalPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TotalPhoneActionPerformed
      
    }//GEN-LAST:event_jTextField_TotalPhoneActionPerformed

    private void jButton_panel4_refreashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_panel4_refreashActionPerformed
        jTextField_TotalPhone.setText(phoneArray.size()+"");
        jTextField_TotalTv.setText(tvArray.size()+"");
        int m=phoneArray.get(0).Total_sell,x=0,y=0;
        for(int i=0;i<phoneArray.size();i++){
            if(m<phoneArray.get(i).Total_sell){
            m=phoneArray.get(i).Total_sell;
            x=i;            
            }
        }
         for(int i=0;i<phoneArray.size();i++){
            if(m>phoneArray.get(i).Total_sell){
            m=phoneArray.get(i).Total_sell;
            y=i;            
            }
        }
        
       
        
        jTextField_Low_Name2.setText(phoneArray.get(y).name);
        jTextField_Low_Catagory2.setText(phoneArray.get(y).catagory);
        jTextField_Low_Quantity2.setText(phoneArray.get(y).Total_sell+" pieces");
        
        
        jTextField_Max_Name.setText(phoneArray.get(x).name);
        jTextField_Max_Catagory.setText(phoneArray.get(x).catagory);
        jTextField_Max_Quantity.setText(phoneArray.get(x).Total_sell+" pieces");
        
        
    }//GEN-LAST:event_jButton_panel4_refreashActionPerformed
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
       
    }
    

    //ADD PRODUCTS
    String catagory,name,panel2Search,Sell_Text_Field_input;
    int id,quantity,sell_quantity;
    double purchase_rate,sell_rate;
    void getValue() throws NumberFormatException {
        
    catagory=jTextField_product_catagory.getText();
    name=jTextField_product_name.getText();
    id=Integer.parseInt(jTextField_product_id.getText());
    quantity=Integer.parseInt(jTextField_quantity.getText());
    purchase_rate=Double.parseDouble(jTextField_purchase_rate.getText());
    sell_rate=Double.parseDouble(jTextField_sell_rate.getText());
    panel2Search=jTextField_panel2_catagory_search.getText();
    Sell_Text_Field_input=jTextField6aaaaaaaaaaa.getText();
    sell_quantity=Integer.parseInt(jTextField1sellllllllllllllllllllll.getText());
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Save_panel_1;
    private javax.swing.JTextField DateTF;
    private javax.swing.JTextField DateTF_panel3;
    private javax.swing.JPanel LeftMenuPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JButton jButtonProductDetails;
    private javax.swing.JButton jButton_SellItems;
    private javax.swing.JButton jButton_panel2_seach_catagory;
    private javax.swing.JButton jButton_panel4_refreash;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable_Product_list;
    private javax.swing.JTable jTable_Sell_Item;
    private javax.swing.JTextField jTextField1sellllllllllllllllllllll;
    private javax.swing.JTextField jTextField6aaaaaaaaaaa;
    private javax.swing.JTextField jTextField_Low_Catagory2;
    private javax.swing.JTextField jTextField_Low_Name2;
    private javax.swing.JTextField jTextField_Low_Quantity2;
    private javax.swing.JTextField jTextField_Max_Catagory;
    private javax.swing.JTextField jTextField_Max_Name;
    private javax.swing.JTextField jTextField_Max_Quantity;
    private javax.swing.JTextField jTextField_TotalPhone;
    private javax.swing.JTextField jTextField_TotalTv;
    private javax.swing.JTextField jTextField_panel2_catagory_search;
    private javax.swing.JTextField jTextField_product_catagory;
    private javax.swing.JTextField jTextField_product_id;
    private javax.swing.JTextField jTextField_product_name;
    private javax.swing.JTextField jTextField_purchase_rate;
    private javax.swing.JTextField jTextField_quantity;
    private javax.swing.JTextField jTextField_sell_rate;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
