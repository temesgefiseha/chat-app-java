/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * server.java
 *
 * Created on Mar 11, 2022, 12:46:57 AM
 */

package chatapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.net.ServerSocket;
import java.net.Socket;



    // Variables declaration - do not modify
/**
 *
 * @author teme
 */
public class server extends javax.swing.JFrame {
   // class name
    static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;


    /** Creates new form server */
    public server() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        text = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        send = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 170));
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 400, 50));

        jButton1.setText("close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 100, 70));

        send.setText("send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        getContentPane().add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 100, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("  chat application server");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 224, 200, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
       try {
            String mess = "";
            mess = text.getText(); //getting data from text field and assign to mess
            dout.writeUTF(mess);
            //sending mess by using udf hold the data .....
            text.setText("");
// TODO add your handling code here:

        } catch (Exception e) {
          //handel
        } 
// TODO add your handling code here:





// TODO add your handling code here:
    }//GEN-LAST:event_sendActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new server().setVisible(true);
            }
        });
        try{

String in=""; // declared in for reciving the message
ss = new ServerSocket(1234); //giving port number for server
       s=ss.accept(); //server accept the request of the client and from the client we accept the socket we can store in socket
       din =new DataInputStream(s.getInputStream());// accept data from socket or client
       dout=new DataOutputStream(s.getOutputStream());//send date the socket or client
       while(!in.equals("exist")){

      area.setText(area.getText()+"new text"+in);

       }
        }catch(Exception e){

//handel ecception

        }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton send;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables

}
