package jframe;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class product extends javax.swing.JFrame {
    
    String productName,productDesc, productId,productPrice,productQty,path2 = null;
    DefaultTableModel model;
   

    public product() {
        initComponents();
    }
    
    public void setProductDetailsToTable() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop","root","101010");
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select * from product");
            
            while(rs.next()){
                int id = rs.getInt("P_id");
                String name = rs.getString("P_name");
                String desc = rs.getString("P_desc");
                String price = rs.getString("P_price");
                String qty = rs.getString("Qty_stock");
                Blob image = rs.getBlob("P_img");
                
                String path = "C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\LapHub\\src\\Images";
                byte[] bytea = image.getBytes(id,(int)image.length());
                FileOutputStream fos = new FileOutputStream(path);
                fos.write(bytea);
                ImageIcon icon = new ImageIcon(bytea);
                lbl_image.setIcon(icon);
                
                
                Object[] obj = {id,name,desc,price,qty,image}; 
                model = (DefaultTableModel) tbl_product_details.getModel();
                model.addRow(obj);
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public boolean addProduct(){
        
         boolean isAdded = false;
         String productId = txt_product_id.getText();
         String productName =txt_product_name.getText();
         String productPrice = txt_product_price.getText();
         String productQty =txt_product_qty.getText();
         String productDesc =txt_product_desc.getText();
         
         
         try{
            Connection con = DBConnecting.getConnection();
            String sql = "insert into product(P_id,P_name,P_desc,P_price,Qty_stock,P_img) values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,productId);
            pst.setString(2,productName);
            pst.setString(3,productDesc);
            pst.setString(4,productPrice);
            pst.setString(5,productQty);
            InputStream is = new FileInputStream(new File(path2));
            pst.setBlob(6, is);
            pst.execute();
            lbl_image.setIcon(null);
            
            int rowCount = pst.executeUpdate();
            
            if (rowCount > 0){
                isAdded = true;
                
            }else{
                isAdded = false;
            }
        
         }catch(Exception e){
             System.out.println(e);
         }
         return isAdded;
    }
    /*
    public boolean updateProduct(){
        boolean isUpdated = false;
         String productId = txt_product_id.getText();
         String productName =txt_product_name.getText();
         String productPrice = txt_product_price.getText();
         String productQty =txt_product_qty.getText();
         String productDesc =txt_product_desc.getText();
         
         try{
            Connection con = DBConnecting.getConnection();
            String sql = "update product set P_name = ?,P_desc = ?,P_price = ?,Qty_stock = ? where P_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,productName);
            pst.setString(2,productDesc);
            pst.setString(3,productPrice);
            pst.setString(4,productQty);
            pst.setString(5,productId);
            
            int rowCount = pst.executeUpdate();
            
            if (rowCount > 0){
                isUpdated = true;
                
            }else{
                isUpdated = false;
            }
        
         }catch(Exception e){
             System.out.println(e);
         }
         return isUpdated;
    }
    
    public boolean deleteProduct(){
        boolean isDeleted = false;
        String productId = txt_product_id.getText();
        
        try{
            Connection con = DBConnecting.getConnection();
            String sql = "delete from product where P_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
           
            pst.setString(1,productId);
            
            int rowCount = pst.executeUpdate();
            if (rowCount > 0){
                isDeleted = true;
            }else{
                isDeleted = false;
            }
        
         }catch(Exception e){
             System.out.println(e);
         }
         return isDeleted;
        
    }
    */
    public void clearTable(){
         DefaultTableModel model =  (DefaultTableModel) tbl_product_details.getModel();
         model.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_product_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_product_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_product_price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_product_qty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_product_desc = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        btn_image = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_product_details = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(251, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Source Code Pro Medium", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<<Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txt_product_id.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txt_product_id.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 310, -1));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txt_product_name.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txt_product_name.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 310, -1));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txt_product_price.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txt_product_price.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_product_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 310, 30));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Qty");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txt_product_qty.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txt_product_qty.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_product_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 310, -1));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Product Image");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        txt_product_desc.setColumns(20);
        txt_product_desc.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txt_product_desc.setRows(3);
        txt_product_desc.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txt_product_desc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 310, -1));

        jButton1.setBackground(new java.awt.Color(251, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, -1, -1));

        jButton2.setBackground(new java.awt.Color(251, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        jButton3.setBackground(new java.awt.Color(251, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Product Desc");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        lbl_image.setBackground(new java.awt.Color(255, 255, 255));
        lbl_image.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_image.setText("    Image");
        lbl_image.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lbl_image.setPreferredSize(new java.awt.Dimension(175, 175));
        jPanel1.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 175, 175));

        btn_image.setText("Upload");
        btn_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageActionPerformed(evt);
            }
        });
        jPanel1.add(btn_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("x");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 60, -1));

        tbl_product_details.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_product_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Desc", "Price", "Qty", "Image"
            }
        ));
        tbl_product_details.setRowHeight(25);
        jScrollPane2.setViewportView(tbl_product_details);
        if (tbl_product_details.getColumnModel().getColumnCount() > 0) {
            tbl_product_details.getColumnModel().getColumn(0).setResizable(false);
            tbl_product_details.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 180, 580, 320));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 51, 51));
        jLabel2.setText("Manage Product Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 440, 40));

        setSize(new java.awt.Dimension(1100, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        home home1 = new home();
        home1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(addProduct() == true) {
            JOptionPane.showMessageDialog(this,"Product Added.");
            clearTable();
            try {
                setProductDetailsToTable();
            } catch (SQLException ex) {
                Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Product Addition Failed.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
       /* if(updateProduct() == true) {
            JOptionPane.showMessageDialog(this,"Product Updated.");
            clearTable();
            try {
                setProductDetailsToTable();
            } catch (SQLException ex) {
                Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Product Updation Failed.");
        }*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
      /*  if(deleteProduct() == true) {
            JOptionPane.showMessageDialog(this,"Product Deleted.");
            clearTable();
            try {
                setProductDetailsToTable();
            } catch (SQLException ex) {
                Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Product Deletion Failed.");
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imageActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        
        try {
            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(175, 175, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lbl_image.setIcon(icon);
            path2 = path;
            
        } catch (IOException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_imageActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTable tbl_product_details;
    private javax.swing.JTextArea txt_product_desc;
    private javax.swing.JTextField txt_product_id;
    private javax.swing.JTextField txt_product_name;
    private javax.swing.JTextField txt_product_price;
    private javax.swing.JTextField txt_product_qty;
    // End of variables declaration//GEN-END:variables

   
}
