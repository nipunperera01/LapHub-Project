package jframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class register extends javax.swing.JFrame {

    public register() {
        initComponents();
    }
    
    public void insertSignupDetails(){
        String id = txt_admin_id.getText();
        String email = txt_admin_email.getText();
        String password = txt_admin_password.getText();
        
        try{
            Connection con = DBConnecting.getConnection();
            String sql = "insert into admin(Admin_id,Ad_mail,A_password) values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,id);
            pst.setString(2,email);
            pst.setString(3,password);
            
            int updateRowCount = pst.executeUpdate();
            
            if(updateRowCount > 0){
                JOptionPane.showMessageDialog(this,"Success.");
                login page = new login();
                page.setVisible(true);
                dispose();
                
            
            }else{
                JOptionPane.showMessageDialog(this,"Failure.");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public boolean validateSignup(){
        String id = txt_admin_id.getText();
        String email = txt_admin_email.getText();
        String password = txt_admin_password.getText();
        
        if(id.equals("")){
            JOptionPane.showMessageDialog(this,"Enter id.");
            return false;
        }
        if(email.equals("") || !email.matches("^.+@.+\\..+$")){
            JOptionPane.showMessageDialog(this,"Enter Valid email.");
            return false;
        }
        if(password.equals("")){
            JOptionPane.showMessageDialog(this,"Enter password.");
            return false;
        }
        
        return true;
    }
    
    public boolean checkDublicateAdmin(){
        String id = txt_admin_id.getText();
        boolean isExist = false;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop","root","101010");
           
           PreparedStatement pst = con.prepareStatement("select * from admin where Admin_id = ?");
           
           pst.setString(1,id);
           ResultSet rs = pst.executeQuery();
           
           if(rs.next()){
               isExist = true;
           }else{
               isExist = false; 
           }
            
        }catch(Exception e){
            System.out.println(e);
        }
        return isExist;
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_admin_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_admin_email = new javax.swing.JTextField();
        txt_admin_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 30, 40));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 120, 60));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMAIL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setText("SIGNUP");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 210, 60));

        jButton2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 210, 60));

        txt_admin_id.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txt_admin_id.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_admin_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 300, -1));

        jLabel6.setFont(new java.awt.Font("Dubai Light", 1, 35)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Shop Management System");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 440, 60));

        txt_admin_email.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txt_admin_email.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_admin_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 300, -1));

        txt_admin_password.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_admin_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 300, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        setSize(new java.awt.Dimension(1100, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       // insertSignupDetails();
        
        if(validateSignup() == true){
            //insertSignupDetails();
           if(checkDublicateAdmin() == false){
                insertSignupDetails();
            }else{
                JOptionPane.showMessageDialog(this,"Admin already exist."); 
            }
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_admin_email;
    private javax.swing.JTextField txt_admin_id;
    private javax.swing.JPasswordField txt_admin_password;
    // End of variables declaration//GEN-END:variables
}
