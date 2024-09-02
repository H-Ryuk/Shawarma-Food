/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fastfood;

import java.awt.Color;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ADmiN
 */
public class FoodInterface extends javax.swing.JFrame {

    int chickenNum, meatNum, waterNum, juiceNum;
    double chickenPrice, meatPrice, waterPrice, juicePrice;
    final double chicken_cost = 5.00, meat_cost = 10.00, water_cost = 1.50, juice_cost = 3.00;
    double subtotal, taxx, totalCheck;
    int customerCounter;
    PrintWriter output;

    /**
     * Creates new form FoodInterface
     */
    public FoodInterface() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cheese1 = new javax.swing.JCheckBox();
        cheese2 = new javax.swing.JCheckBox();
        meatShawa = new javax.swing.JSpinner();
        chickenShawa = new javax.swing.JSpinner();
        chickenPriceLabel = new javax.swing.JLabel();
        meatPriceLabel = new javax.swing.JLabel();
        meatCheese = new javax.swing.JSpinner();
        chickenCheese = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        NumOfCheese1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NumOfCheese2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        totalbill = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        CheckBill = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        water = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        juice = new javax.swing.JSpinner();
        waterPriceLabel = new javax.swing.JLabel();
        juicePriceLabel = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Food", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Chicken Shawarma");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Meat Shawarma");

        cheese1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cheese1.setText("Cheese for all chicken Shawarma orders ");
        cheese1.setBorder(null);
        cheese1.setOpaque(true);
        cheese1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cheese1StateChanged(evt);
            }
        });
        cheese1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheese1ActionPerformed(evt);
            }
        });

        cheese2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cheese2.setText("Cheese for all meat Shawarma orders");
        cheese2.setBorder(null);
        cheese2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheese2ActionPerformed(evt);
            }
        });

        meatShawa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        meatShawa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        meatShawa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatShawaStateChanged(evt);
            }
        });

        chickenShawa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chickenShawa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        chickenShawa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickenShawaStateChanged(evt);
            }
        });

        chickenPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chickenPriceLabel.setText("00");

        meatPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        meatPriceLabel.setText("00");

        meatCheese.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        meatCheese.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        meatCheese.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatCheeseStateChanged(evt);
            }
        });

        chickenCheese.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chickenCheese.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        chickenCheese.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickenCheeseStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Cheese");

        NumOfCheese1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NumOfCheese1.setText("00");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Number of chicken Shawarma with cheese :");

        jLabel11.setText("-----------------------------------------------------------------------------------------------------------------------------------");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Cheese");

        NumOfCheese2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NumOfCheese2.setText("00");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Number of meat Shawarma with cheese :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(meatCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(143, 143, 143))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(meatShawa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cheese2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(meatPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chickenShawa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cheese1)
                        .addGap(18, 18, 18)
                        .addComponent(chickenPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chickenCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumOfCheese2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumOfCheese1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chickenShawa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheese1)
                    .addComponent(chickenPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chickenCheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(NumOfCheese1))
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(meatShawa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheese2)
                    .addComponent(meatPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meatCheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(NumOfCheese2))
                .addGap(15, 15, 15))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Check", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tax    :");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Total Bill :");

        totalbill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalbill.setText("0000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalbill, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalbill, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tax.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tax.setText("00");

        total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total.setText("00");

        CheckBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckBill.setText("Check");
        CheckBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckBill)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(total))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tax))
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(CheckBill)
                .addGap(14, 14, 14))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Check", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Water");

        water.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        water.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        water.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                waterStateChanged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Juice");

        juice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        juice.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        juice.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                juiceStateChanged(evt);
            }
        });

        waterPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        waterPriceLabel.setText("00");

        juicePriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        juicePriceLabel.setText("00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(water, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(juice))
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(waterPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(juicePriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waterPriceLabel)
                    .addComponent(water, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(juice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(juicePriceLabel))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Pictures\\icons\\icon extention\\shawarma.png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Shawarma Food");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cheese1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheese1ActionPerformed
        // TODO add your handling code here:

        if (cheese1.isSelected()) {
            chickenPrice += chickenNum * 2;
            NumOfCheese1.setText(String.valueOf(chickenNum));
            chickenCheese.setValue(0);
        } else {
            chickenPrice -= chickenNum * 2;
            NumOfCheese1.setText(String.valueOf(0));
        }
        chickenPriceLabel.setText(chickenPrice + " DH");

    }//GEN-LAST:event_cheese1ActionPerformed

    private void chickenShawaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickenShawaStateChanged
        // TODO add your handling code here:
        int a = (Integer) chickenCheese.getValue();
        int b = (Integer) chickenShawa.getValue();
        if (a == 0) {
            if (cheese1.isSelected()) {
                chickenNum = (Integer) chickenShawa.getValue();
                chickenPrice = (chickenNum * chicken_cost) + (chickenNum * 2);
                chickenPriceLabel.setText(chickenPrice + " DH");

                NumOfCheese1.setText(String.valueOf(chickenNum));
                chickenCheese.setValue(0);

            } else {
                chickenNum = (Integer) chickenShawa.getValue();
                chickenPrice = chickenNum * chicken_cost;
                chickenPriceLabel.setText(chickenPrice + " DH");
                if (b < a) {
                    chickenCheese.setValue(b);
                }
            }
        }

    }//GEN-LAST:event_chickenShawaStateChanged

    private void meatShawaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatShawaStateChanged
        // TODO add your handling code here:
        int a = (Integer) meatCheese.getValue();
        int b = (Integer) meatShawa.getValue();

        if (a == 0) {
            if (cheese2.isSelected()) {
                meatNum = (Integer) meatShawa.getValue();
                meatPrice = (meatNum * meat_cost) + (meatNum * 2);
                meatPriceLabel.setText(meatPrice + " DH");

                NumOfCheese2.setText(String.valueOf(meatNum));
                meatCheese.setValue(0);

            } else {
                meatNum = (Integer) meatShawa.getValue();
                meatPrice = meatNum * meat_cost;
                meatPriceLabel.setText(meatPrice + " DH");
                if (b < a) {
                    meatCheese.setValue(b);
                }
            }
        }


    }//GEN-LAST:event_meatShawaStateChanged

    private void waterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_waterStateChanged
        // TODO add your handling code here:

        waterNum = (Integer) water.getValue();
        waterPrice = waterNum * water_cost;
        waterPriceLabel.setText(waterPrice + " DH");
    }//GEN-LAST:event_waterStateChanged

    private void juiceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_juiceStateChanged
        // TODO add your handling code here:

        juiceNum = (Integer) juice.getValue();
        juicePrice = juiceNum * juice_cost;
        juicePriceLabel.setText(juicePrice + " DH");
    }//GEN-LAST:event_juiceStateChanged

    private void cheese1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cheese1StateChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_cheese1StateChanged

    private void cheese2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheese2ActionPerformed
        // TODO add your handling code here:

        if (cheese2.isSelected()) {
            meatPrice += meatNum * 2;
            NumOfCheese2.setText(String.valueOf(meatNum));
            meatCheese.setValue(0);
        } else {
            meatPrice -= meatNum * 2;
            NumOfCheese2.setText(String.valueOf(0));
        }
        meatPriceLabel.setText(meatPrice + " DH");
    }//GEN-LAST:event_cheese2ActionPerformed

    private void CheckBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBillActionPerformed
        // TODO add your handling code here:
//        int hh = (Integer)chickenCheese.getValue() * 2;
        DecimalFormat decimal = new DecimalFormat("0.00");
        subtotal = chickenPrice + meatPrice + waterPrice + juicePrice;
        total.setText(decimal.format(subtotal) + " DH");
        taxx = subtotal * 0.05;
        tax.setText(decimal.format(taxx) + " DH");
        totalCheck = subtotal + taxx;
        totalbill.setText(decimal.format(totalCheck) + " DH");
    }//GEN-LAST:event_CheckBillActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_exitActionPerformed

    private void chickenCheeseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickenCheeseStateChanged
        // TODO add your handling code here:
        int a = (Integer) chickenCheese.getValue();
        int b = (Integer) chickenShawa.getValue();
        int c = (Integer) chickenCheese.getValue();

        if (a == 0) {
            cheese1.setEnabled(true);
            NumOfCheese1.setText(String.valueOf(a));
        } else {
            cheese1.setEnabled(false);
        }

        chickenNum = (Integer) chickenShawa.getValue();
        chickenPrice = chickenNum * chicken_cost + (c * 2);
        chickenPriceLabel.setText(chickenPrice + " DH");
        if (!cheese1.isSelected() || a != 0) {
            NumOfCheese1.setText(String.valueOf(a));

            if (b < a) {
                JOptionPane.showMessageDialog(null, "Sorry yo can not order cheese more than chichen Shawrma order !!!");
                chickenCheese.setValue(a - 1);
            }
        }


    }//GEN-LAST:event_chickenCheeseStateChanged

    private void meatCheeseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatCheeseStateChanged
        // TODO add your handling code here:
        int a = (Integer) meatCheese.getValue();
        int b = (Integer) meatShawa.getValue();
        int c = (Integer) meatCheese.getValue();

        if (a == 0) {
            cheese2.setEnabled(true);
            NumOfCheese2.setText(String.valueOf(a));
        } else {
            cheese2.setEnabled(false);
        }

        meatNum = (Integer) meatShawa.getValue();
        meatPrice = meatNum * meat_cost + (c * 2);
        meatPriceLabel.setText(meatPrice + " DH");
        if (!cheese2.isSelected() || a != 0) {
            NumOfCheese2.setText(String.valueOf(a));

            if (b < a) {
                JOptionPane.showMessageDialog(null, "Sorry yo can not order cheese more than chichen Shawrma order !!!");
                meatCheese.setValue(a - 1);
            }
        }
    }//GEN-LAST:event_meatCheeseStateChanged

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
            java.util.logging.Logger.getLogger(FoodInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckBill;
    private javax.swing.JLabel NumOfCheese1;
    private javax.swing.JLabel NumOfCheese2;
    private javax.swing.JCheckBox cheese1;
    private javax.swing.JCheckBox cheese2;
    private javax.swing.JSpinner chickenCheese;
    private javax.swing.JLabel chickenPriceLabel;
    private javax.swing.JSpinner chickenShawa;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner juice;
    private javax.swing.JLabel juicePriceLabel;
    private javax.swing.JSpinner meatCheese;
    private javax.swing.JLabel meatPriceLabel;
    private javax.swing.JSpinner meatShawa;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalbill;
    private javax.swing.JSpinner water;
    private javax.swing.JLabel waterPriceLabel;
    // End of variables declaration//GEN-END:variables
}
