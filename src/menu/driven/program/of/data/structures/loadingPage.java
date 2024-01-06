/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu.driven.program.of.data.structures;
/**
 *
 * @author Christian Jhames
 */
public class loadingPage extends javax.swing.JFrame {

    /**
     * Creates new form loadingPage
     */
    public loadingPage() {
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
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        loadingValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Green-Abstract-S-Letter-Free-L-unscreen.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 350, 350));

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(0, 51, 102));
        jProgressBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 400, 20));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel1.setText("Loading...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        loadingValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loadingValue.setText("0 %");
        jPanel1.add(loadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradient.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

         
        loadingPage LP = new loadingPage();
        
        java.awt.EventQueue.invokeLater(() -> {
            LP.setVisible(true);
        });
        
        try{
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(400); // adjust this value to change the loading time
                
                LP.jProgressBar1.setValue(i);
                LP.loadingValue.setText(Integer.toString(i) + "%");
                
                 if (i <= 10) {
            LP.jLabel1.setText("Loading...");}
                else if(i >=10 && i<=20){
            LP.jLabel1.setText("Installing...");}
                else if(i >=20 && i<=30){
            LP.jLabel1.setText("Initializing...");}
                else if(i >=30 && i<=40){
            LP.jLabel1.setText("Verifying...");}
                else if(i >=40 && i<=50){
            LP.jLabel1.setText("Retrieving data...");}
                else if(i >=50 && i<=60){
            LP.jLabel1.setText("Optimizing...");}
                else if(i >=60 && i<=70){
            LP.jLabel1.setText("Loading resources...");}
                else if(i >=70 && i<=80){
            LP.jLabel1.setText("Loading assets...");}
                else if(i >=80 && i<=90){
            LP.jLabel1.setText("Loading components...");}                                                                                                                                    
             else{
            LP.jLabel1.setText("Please wait...");}
            }
            
        }catch  (InterruptedException e) {

             }    

        Introduction Intro = new Introduction();
        LP.setVisible(false);
        Intro.setVisible(true);

    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel loadingValue;
    // End of variables declaration//GEN-END:variables
}
