/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DJ
 */
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.sql.*;
import javax.swing.JOptionPane;

public class CargoAction extends javax.swing.JFrame {
    
    Admin admin;
    Connection conn;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    static int IMPORT_TYPE = 1;
    static int EXPORT_TYPE = 2;
    static int SHIFT_TYPE = 3;

    /**
     * Creates new form CargoAction
     */
    public CargoAction(Admin admin) {
        super("Cargo Action");
        this.admin = admin;
        initComponents();
        this.setLocationRelativeTo(null);
        conn = JavaConnect.ConnecrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        src_wh_lb = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cargo_amount = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        dst_wh_lb = new javax.swing.JLabel();
        src_wh = new javax.swing.JComboBox();
        cargo_type_label = new javax.swing.JLabel();
        dst_wh = new javax.swing.JComboBox();
        cargo_amount_label = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        import_checkbox = new javax.swing.JRadioButton();
        export_checkbox = new javax.swing.JRadioButton();
        shift_checkbox = new javax.swing.JRadioButton();
        cargo_type = new javax.swing.JComboBox<>();
        cargo_label = new javax.swing.JLabel();
        cargo_name = new javax.swing.JTextField();
        price_label = new javax.swing.JLabel();
        unit_price = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/560076980a5242c2d4c59cb62e223b00.jpg"))); // NOI18N

        src_wh_lb.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        src_wh_lb.setText("Source Warehouse");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cargo_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargo_amountActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        dst_wh_lb.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        dst_wh_lb.setText("Destination Warehouse");

        src_wh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[None]", "1", "2", "3", "4", "5" }));

        cargo_type_label.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        cargo_type_label.setText("Cargo Type");

        dst_wh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[None]", "1", "2", "3", "4", "5" }));

        cargo_amount_label.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        cargo_amount_label.setText("Amount");

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLayeredPane2.setForeground(new java.awt.Color(153, 153, 255));

        buttonGroup1.add(import_checkbox);
        import_checkbox.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        import_checkbox.setText("Import");

        buttonGroup1.add(export_checkbox);
        export_checkbox.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        export_checkbox.setText("Export");

        buttonGroup1.add(shift_checkbox);
        shift_checkbox.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        shift_checkbox.setText("Shift");

        jLayeredPane2.setLayer(import_checkbox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(export_checkbox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(shift_checkbox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(import_checkbox)
                .addGap(36, 36, 36)
                .addComponent(export_checkbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(shift_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(import_checkbox)
                    .addComponent(export_checkbox)
                    .addComponent(shift_checkbox))
                .addContainerGap())
        );

        cargo_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tableware", "Tools", "Food", "Clothes", "Electric Appliance" }));
        cargo_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargo_typeActionPerformed(evt);
            }
        });

        cargo_label.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        cargo_label.setText("Cargo Name");

        cargo_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargo_nameActionPerformed(evt);
            }
        });

        price_label.setFont(new java.awt.Font("Calibri", 0, 19)); // NOI18N
        price_label.setText("Unit Price");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cargo_label)
                                    .addComponent(cargo_type_label)
                                    .addComponent(src_wh_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dst_wh_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargo_amount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price_label))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dst_wh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(src_wh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cargo_type, 0, 140, Short.MAX_VALUE)
                            .addComponent(cargo_amount)
                            .addComponent(cargo_name)
                            .addComponent(unit_price))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargo_label)
                    .addComponent(cargo_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unit_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargo_type_label)
                    .addComponent(cargo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargo_amount_label)
                    .addComponent(cargo_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(src_wh_lb)
                    .addComponent(src_wh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dst_wh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_wh_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            int report_type;
            if (import_checkbox.isSelected()){
                report_type = IMPORT_TYPE;
            }
            else if  (export_checkbox.isSelected()) {
                report_type = EXPORT_TYPE;
            }
            else if (shift_checkbox.isSelected()) {
                report_type = SHIFT_TYPE;
            } else {
                JOptionPane.showMessageDialog(null, "Error: Please Select The Transaction Type!");
                return;
            }
            
            if (cargo_name.getText().length() != 0 && unit_price.getText().length() != 0 && cargo_amount.getText().length() != 0) {
                // check stock in the corresponding warehouse
                if (report_type == EXPORT_TYPE || report_type == SHIFT_TYPE) {
                    if (src_wh.getSelectedItem().toString() == "[None]") {
                        JOptionPane.showMessageDialog(null, "Error: Please Select Source Warehouse!");
                        return;
                    }
                    String sql_1 = "SELECT warehouse_id, COUNT(*) FROM Cargo WHERE name = ? AND warehouse_id = ? GROUP BY warehouse_id";
                    pst = conn.prepareStatement(sql_1);
                    pst.setString(1, cargo_name.getText());
                    pst.setString(2, src_wh.getSelectedItem().toString());
                    rs = pst.executeQuery();
                    int stock = 0;
                    while (rs.next()) {
                        stock = rs.getInt("COUNT(*)");
                    }
                    pst.close();
                    rs.close();
                    if (stock < parseInt(cargo_amount.getText())) {
                        JOptionPane.showMessageDialog(null, "Error: Cargo Out Of Stock");
                        return;
                    }
                }
                String sql_2 = "SELECT MAX(TransactionID) FROM Report";
                st = conn.createStatement();
                rs = st.executeQuery(sql_2);
                int transaction_id = 0;
                while (rs.next()) {
                    transaction_id = rs.getInt("MAX(TransactionID)") + 1;
                }
                st.close();
                rs.close();
                String Creator = this.admin.username;
                String sql_insert_1;
                switch (report_type) {
                    case 1:
                    {
                        if (dst_wh.getSelectedItem().toString() == "[None]") {
                            JOptionPane.showMessageDialog(null, "Error: Please Select Destination Warehouse!");
                            return;
                        }
                        sql_insert_1 = "INSERT INTO REPORT (TransactionID, Creator, Type, CargoName, CargoType, Amount, Confirmed, dstwarehouse, damage, unitprice) VALUES (?,?,?,?,?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql_insert_1);
                        pst.setString(1, valueOf(transaction_id));
                        pst.setString(2, Creator);
                        pst.setString(3, valueOf(IMPORT_TYPE));
                        pst.setString(4, cargo_name.getText());
                        pst.setString(5, cargo_type.getSelectedItem().toString());
                        pst.setString(6, cargo_amount.getText());
                        pst.setString(7, valueOf(0));
                        pst.setString(8, dst_wh.getSelectedItem().toString());
                        pst.setString(9, valueOf(0));
                        pst.setString(10, unit_price.getText());
                        break;
                    }
                    case 2:
                    {
                        if (src_wh.getSelectedItem().toString() == "[None]") {
                            JOptionPane.showMessageDialog(null, "Error: Please Select Source Warehouse!");
                            return;
                        }
                        sql_insert_1 = "INSERT INTO REPORT (TransactionID, Creator, Type, CargoName, CargoType, Amount, Confirmed, srcwarehouse, damage, unitprice) VALUES (?,?,?,?,?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql_insert_1);
                        pst.setString(1, valueOf(transaction_id));
                        pst.setString(2, Creator);
                        pst.setString(3, valueOf(EXPORT_TYPE));
                        pst.setString(4, cargo_name.getText());
                        pst.setString(5, cargo_type.getSelectedItem().toString());
                        pst.setString(6, cargo_amount.getText());
                        pst.setString(7, valueOf(0));
                        pst.setString(8, src_wh.getSelectedItem().toString());
                        pst.setString(9, valueOf(0));
                        pst.setString(10, unit_price.getText());
                        break;
                    }
                    case 3:
                    {
                        if (src_wh.getSelectedItem().toString() == dst_wh.getSelectedItem().toString()){
                            JOptionPane.showMessageDialog(null, "Error: Please Choose Different Warehouses!");
                            return;
                        } 
                        if (src_wh.getSelectedItem().toString() == "[None]" || dst_wh.getSelectedItem().toString() == "[None]") {
                            JOptionPane.showMessageDialog(null, "Error: Please Choose Two Warehouses!");
                            return;
                        }
                            sql_insert_1 = "INSERT INTO REPORT VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                            pst = conn.prepareStatement(sql_insert_1);
                            pst.setString(1, valueOf(transaction_id));
                            pst.setString(2, Creator);
                            pst.setString(3, valueOf(SHIFT_TYPE));
                            pst.setString(4, cargo_name.getText());
                            pst.setString(5, cargo_type.getSelectedItem().toString());
                            pst.setString(6, cargo_amount.getText());
                            pst.setString(7, valueOf(0));
                            pst.setString(8, src_wh.getSelectedItem().toString());
                            pst.setString(9, dst_wh.getSelectedItem().toString());
                            pst.setString(10, valueOf(0));
                            pst.setString(11, unit_price.getText());
                            break;
                    }
                }
                pst.execute();
                JOptionPane.showMessageDialog(null, "Report Creation Succeed");
                pst.close();
            }
            else {
                JOptionPane.showMessageDialog(null, "Error: Please Fill All Information!");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargo_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargo_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargo_amountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AdminPage ob = new AdminPage(admin);
        ob.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cargo_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargo_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargo_typeActionPerformed

    private void cargo_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargo_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargo_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cargo_amount;
    private javax.swing.JLabel cargo_amount_label;
    private javax.swing.JLabel cargo_label;
    private javax.swing.JTextField cargo_name;
    private javax.swing.JComboBox<String> cargo_type;
    private javax.swing.JLabel cargo_type_label;
    private javax.swing.JComboBox dst_wh;
    private javax.swing.JLabel dst_wh_lb;
    private javax.swing.JRadioButton export_checkbox;
    private javax.swing.JRadioButton import_checkbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel price_label;
    private javax.swing.JRadioButton shift_checkbox;
    private javax.swing.JComboBox src_wh;
    private javax.swing.JLabel src_wh_lb;
    private javax.swing.JTextField unit_price;
    // End of variables declaration//GEN-END:variables
}
