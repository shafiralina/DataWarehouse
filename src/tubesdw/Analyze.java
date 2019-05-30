/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesdw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shafira
 */
public class Analyze extends javax.swing.JFrame {

    /**
     * Creates new form Analyze
     */
    public Analyze() {
        initComponents();
        showTabel();
        showTabel1();
        showTabel3();
        banyakLaki();
        banyakWan();
        TGJ();
        
    }
    public ArrayList<listAD> listTabelAD (){
           ArrayList<listAD> listTabelAD= new ArrayList<>();
    
    try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=SUKSESCUBE;user=herlina;password=yuyu";
            Connection con = DriverManager.getConnection(url);
            
            String query= "SELECT TBFAKTA.IDKARYAWAN, TBFAKTA.NAMAKARYAWAN, TBFAKTA.ASAL, TBFAKTA.NAMATIM FROM TBFAKTA";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            listAD list;
            while(rs.next()){
                list = new listAD(rs.getString("IDKARYAWAN"),rs.getString("NAMAKARYAWAN"),rs.getString("ASAL"), rs.getString("NAMATIM"));
                listTabelAD.add(list);
            }
            
          
   }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
    return listTabelAD;
    }
    public void showTabel(){
        ArrayList<listAD> list= listTabelAD();
        DefaultTableModel  model = (DefaultTableModel)AD.getModel();
        Object [] row = new Object[4];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getIDKARYAWAN();
            row[1]=list.get(i).getNAMAKARYAWAN();
            row[2]=list.get(i).getASAL();
            row[3]=list.get(i).getNAMATIM();
           
            
            
            model.addRow(row);
        }
    }
    public ArrayList<listAPG> listTabelAPG (){
           ArrayList<listAPG> listTabelAPG= new ArrayList<>();
    
    try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=SUKSESCUBE;user=herlina;password=yuyu";
            Connection con = DriverManager.getConnection(url);
            
            String query= "SELECT TBFAKTA.IDKARYAWAN, TBFAKTA.NAMAKARYAWAN, TBFAKTA.GENDER, TBFAKTA.NAMATIM FROM TBFAKTA";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            listAPG list;
            while(rs.next()){
                list = new listAPG(rs.getString("IDKARYAWAN"),rs.getString("NAMAKARYAWAN"),rs.getString("GENDER"), rs.getString("NAMATIM"));
                listTabelAPG.add(list);
            }
            
          
   }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
    return listTabelAPG;
    }
    public void showTabel1(){
        ArrayList<listAPG> list= listTabelAPG();
        DefaultTableModel  model = (DefaultTableModel)APG.getModel();
        Object [] row = new Object[4];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getIDKARYAWAN();
            row[1]=list.get(i).getNAMAKARYAWAN();
            row[2]=list.get(i).getGENDER();
            row[3]=list.get(i).getNAMATIM();
           
            
            
            model.addRow(row);
        }
    }
    public void banyakLaki(){
       
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=SUKSESCUBE;user=herlina;password=yuyu";
            Connection con = DriverManager.getConnection(url);
            
            String query= "select COUNT(GENDER)  FROM TBFAKTA " +
                          "WHERE GENDER = 'L'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                int a=rs.getInt(1);
                LK.setText(Integer.toString(a));
                System.out.println(a);
            }
            
          
   }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }}
        public void banyakWan(){
       
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=SUKSESCUBE;user=herlina;password=yuyu";
            Connection con = DriverManager.getConnection(url);
            
            String query= "select COUNT(GENDER)  FROM TBFAKTA " +
                          "WHERE GENDER = 'P'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                int a=rs.getInt(1);
                WN.setText(Integer.toString(a));
            }
            
          
   }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
        

    }
         public ArrayList<listG> listTabelG (){
           ArrayList<listG> listTabelG= new ArrayList<>();
    
    try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=SUKSESCUBE;user=herlina;password=yuyu";
            Connection con = DriverManager.getConnection(url);
            
            String query= "select TBFAKTA.IDKARYAWAN, TBFAKTA.NAMAKARYAWAN, TBFAKTA.NAMATIM, TBFAKTA.GAJI+TBFAKTA.BONUSGAJI as 'TOTALGAJI' " +
                           "from  TBFAKTA";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            listG list;
            while(rs.next()){
                list = new listG(rs.getString("IDKARYAWAN"),rs.getString("NAMAKARYAWAN"),rs.getString("NAMATIM"), rs.getFloat("TOTALGAJI"));
                listTabelG.add(list);
            }
            
          
   }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
    return listTabelG;
    }
    public void showTabel3(){
        ArrayList<listG> list= listTabelG();
        DefaultTableModel  model = (DefaultTableModel)G.getModel();
        Object [] row = new Object[4];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getIDKARYAWAN();
            row[1]=list.get(i).getNAMAKARYAWAN();
            row[2]=list.get(i).getNAMATIM();
            row[3]=list.get(i).getGAJITOTAL();
           
            
            
            model.addRow(row);
        }
    }
      public void TGJ(){
       
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=SUKSESCUBE;user=herlina;password=yuyu";
            Connection con = DriverManager.getConnection(url);
            
            String query= "SELECT SUM(TBFAKTA.GAJI+TBFAKTA.BONUSGAJI) FROM TBFAKTA";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                int a=rs.getInt(1);
                TG.setText(Integer.toString(a));
            }
            
          
   }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
    }
        

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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AD = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        APG = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        LK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        WN = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        G = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        T = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TG = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Analysis");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data Analysis");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel4)
                .addContainerGap(452, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 140));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        AD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDKARYAWAN", "NAMA", "DAERAH", "TIM"
            }
        ));
        jScrollPane1.setViewportView(AD);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Analisis Daerah", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        APG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDKARYAWAN", "NAMA KARYAWAN", "GENDER", "TIM"
            }
        ));
        jScrollPane2.setViewportView(APG);

        jLabel1.setText("Jumlah Karyawan Laki-laki :");

        LK.setText(" ");

        jLabel2.setText("Jumlah Karyawan Perempuan :");

        WN.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LK, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(WN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Analisis Persebaran Gender", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        G.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDKARYAWAN", "NAMA KARYAWAN", "TIM", "TOTAL GAJI SETAHUN"
            }
        ));
        jScrollPane3.setViewportView(G);

        jLabel3.setText("Masukkan n-Tahun :");

        T.setText("0");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });

        jLabel5.setText("Akumulasi total gaji :");

        AG.setEditable(false);
        AG.setText(" ");

        jLabel6.setText("Total Gaji                :");

        TG.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(AG, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TG)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(73, 73, 73))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Pengeluaran Gaji n-Tahun Pertama", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 630, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
       AG.setText(Integer.toString(Integer.parseInt(T.getText())*Integer.parseInt(TG.getText())));
    }//GEN-LAST:event_TActionPerformed

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
            java.util.logging.Logger.getLogger(Analyze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analyze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analyze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analyze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analyze().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AD;
    private javax.swing.JTextField AG;
    private javax.swing.JTable APG;
    private javax.swing.JTable G;
    private javax.swing.JTextField LK;
    private javax.swing.JTextField T;
    private javax.swing.JTextField TG;
    private javax.swing.JTextField WN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
