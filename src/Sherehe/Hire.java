package Sherehe;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;

public class Hire extends javax.swing.JFrame {

    DBConnection dbconn;
    String Recno;

    public Hire() {

        initComponents();
        dbconn = new DBConnection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtEvent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboItem = new javax.swing.JComboBox<>();
        lblAvailable = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtPerson = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        cboreturned = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblbill = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHire = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        updateItem = new javax.swing.JMenu();
        PlaceOrder = new javax.swing.JMenuItem();
        OrderListItem = new javax.swing.JMenuItem();
        NewOrder = new javax.swing.JMenuItem();
        DeleteItem = new javax.swing.JMenuItem();
        update = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("Place an oder");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Company/Event");

        txtEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventActionPerformed(evt);
            }
        });

        jLabel2.setText("ItemHired");

        cboItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboItemActionPerformed(evt);
            }
        });

        lblAvailable.setText("Available?");

        jLabel3.setText("Start Date");

        jLabel4.setText("End Date");

        jLabel5.setText("Quantity");

        jLabel6.setText("Contact Person");

        jLabel7.setText("Telephone");

        jLabel8.setText("Order No");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });

        cboreturned.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));

        jLabel9.setText("Returned");

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        jLabel10.setText("NOTE: VALID DATE FORMAT IS DD-MM-YYYY");

        lblCost.setText("BILL");

        lblbill.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        lblbill.setText("CASH TO PAY IN Ksh");

        tblHire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHireMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHire);

        updateItem.setText("Sherehe Actions");

        PlaceOrder.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        PlaceOrder.setText("Place an oder");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });
        updateItem.add(PlaceOrder);

        OrderListItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, 0));
        OrderListItem.setText("Order List");
        OrderListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderListItemActionPerformed(evt);
            }
        });
        updateItem.add(OrderListItem);

        NewOrder.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        NewOrder.setText("New Order");
        NewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewOrderActionPerformed(evt);
            }
        });
        updateItem.add(NewOrder);

        DeleteItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
        DeleteItem.setText("Dlelete Order");
        DeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteItemActionPerformed(evt);
            }
        });
        updateItem.add(DeleteItem);

        update.setText("Update Order");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        updateItem.add(update);

        jMenuBar1.add(updateItem);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboItem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboreturned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(529, 529, 529))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblbill, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(883, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblAvailable)
                        .addGap(18, 18, 18)
                        .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(cboreturned, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblbill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventActionPerformed

    }//GEN-LAST:event_txtEventActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try {
            String sql = "Select ItemName from item";
            dbconn.rs = dbconn.St.executeQuery(sql);

            while (dbconn.rs.next()) {
                cboItem.addItem(dbconn.rs.getString("ItemName"));//puts the value in the combobox
                 txtEndDate.setText(dbconn.rs.getString("ItemName"));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_formWindowOpened

    private void cboItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboItemActionPerformed
    }

    private int isAvailable(String Item,int Qbal) {
        int Avail = 0;
        int totalHired=hiredOut(Item);
        int diff=0;
        
        try {

            dbconn.rs = dbconn.St.executeQuery("Select Quantity from Item where ItemName='" + cboItem.getSelectedItem() + "'");

            if (dbconn.rs.next()) {
                int Qtty = dbconn.rs.getInt("Quantity");
                diff=Qtty-totalHired;
                
                if (Qtty > totalHired && Qbal<=diff) {
                    lblAvailable.setText(cboItem.getSelectedItem() + " is Available");

                    Avail = 1;

                } else {
                    lblAvailable.setText(cboItem.getSelectedItem() + " is not available");
                }

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return Avail;

    }//GEN-LAST:event_cboItemActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed

        int Avail = isAvailable(cboItem.getSelectedItem().toString(),Integer.parseInt(txtQuantity.getText()));

        if (Avail == 0) {

            JOptionPane.showMessageDialog(this, "Item is not Available");
        } else {
            String co = txtEvent.getText();
            String item = cboItem.getSelectedItem().toString();
            String sDate = txtStartDate.getText();
            String eDate = txtEndDate.getText();
            int Quantity = Integer.parseInt(txtQuantity.getText());
            int price = Quantity * 500;
            String name = txtPerson.getText();
            String Tel = txtTel.getText();
            int No = Integer.parseInt(txtNo.getText());

            try {
                dbconn.St.execute("Insert into hire values('" + co + "','" + item + "','" + sDate + "','" + eDate + "','" + Quantity + "','" + price + "','" + name + "','" + Tel + "','" + No + "')");
                JOptionPane.showMessageDialog(this, "Order No" + No + " has been placed");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }//GEN-LAST:event_PlaceOrderActionPerformed

    private void DeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteItemActionPerformed

        try {

            String no = JOptionPane.showInputDialog(this, "Type the Order No you want to delete");
            dbconn.St.execute("Delete from hire where OrderNo='" + no + "'");
            JOptionPane.showMessageDialog(this, no + " has been deleted");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_DeleteItemActionPerformed


    private void OrderListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderListItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderListItemActionPerformed

    private void NewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewOrderActionPerformed

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased

        SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {

            Date StartDate = myFormat.parse(txtStartDate.getText());
            Date EndDate = myFormat.parse(txtEndDate.getText());

            long diff = EndDate.getTime() - StartDate.getTime();
            int days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

            lblCost.setText(String.valueOf(days * 100 * Integer.parseInt(txtQuantity.getText())));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private int hiredOut(String item) {

        int no = 0;
        try {
            dbconn.rs = dbconn.St.executeQuery("Select Quantity from hire where ItemName='" + item + "'");
            while (dbconn.rs.next()) {
                no += dbconn.rs.getInt("Quantity");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return no;


    }//GEN-LAST:event_txtQuantityKeyReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
      /*  try {
           dbconn.rs=dbconn.St.executeQuery("Select* from hire");
            tblHire.setModel(DbUtils.resultSetToTableModel(dbconn.rs));
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }//GEN-LAST:event_formWindowGainedFocus

    private void tblHireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHireMouseClicked
       
        int rowNo=tblHire.getSelectedRow();
         Recno=tblHire.getModel().getValueAt(rowNo,8).toString();
        String sql="Select Quantity from hire where OrderNo='"+Recno+"'";
        
        try {
            dbconn.rs=dbconn.St.executeQuery(sql);
            if (dbconn.rs.next()) {
                txtQuantity.setText(Integer.toString(dbconn.rs.getInt("Quantity")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_tblHireMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            
            dbconn.St.executeUpdate("Update hire set Quantity='"+txtQuantity.getText()+"' where OrderNo='"+Recno+"'" );
            JOptionPane.showMessageDialog(this, "Record Updated");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

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
            java.util.logging.Logger.getLogger(Hire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DeleteItem;
    private javax.swing.JMenuItem NewOrder;
    private javax.swing.JMenuItem OrderListItem;
    private javax.swing.JMenuItem PlaceOrder;
    private javax.swing.JComboBox<String> cboItem;
    private javax.swing.JComboBox<String> cboreturned;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblbill;
    private javax.swing.JTable tblHire;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtEvent;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtPerson;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTel;
    private javax.swing.JMenuItem update;
    private javax.swing.JMenu updateItem;
    // End of variables declaration//GEN-END:variables
}
