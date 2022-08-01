
package inventory;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
class login implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2 ;
    JButton b1,b2;
   ImageIcon i1, i3;
    

login(){
f=new JFrame("Login");
f.setBackground(Color.WHITE);
f.setLayout(null);
l1=new JLabel("USERNAME");
l1.setBounds(200, 300, 200, 100);
l1.setFont(new Font("serif",Font.BOLD,25));
l1.setForeground(Color.BLACK);
f.add(l1);
l2=new JLabel("PASSWORD");
l2.setBounds(640, 300, 200, 100);
l2.setFont(new Font("serif",Font.BOLD,25));
l2.setForeground(Color.BLACK);
f.add(l2);
t1=new JTextField();
t1.setBounds(410,300,200,60);
t1.setFont(new Font("serif",Font.BOLD,25));
f.add(t1);
t2=new JPasswordField();
t2.setBounds(840,300,200,60);
t2.setFont(new Font("serif",Font.BOLD,25));
f.add(t2);
i1 = new ImageIcon(ClassLoader.getSystemResource("inventory/icons/login.jpg"));
 Image i2=i1.getImage().getScaledInstance(1360,700,Image.SCALE_DEFAULT);
 i3=new ImageIcon(i2);
JLabel l3=new JLabel(i3);
l3.setBounds(0, 0,1360, 700);
f.add(l3);

b1=new JButton("LOGIN");
b1.setBounds(400, 450, 200, 60);
b1.setFont(new Font("serif",Font.BOLD,15));
b1.addActionListener(this);
b1.setBackground(Color.BLACK);
b1.setForeground(Color.WHITE);
f.add(b1);

b2=new JButton("CANCEL");
b2.setBounds(650, 450, 200, 60);
b2.setFont(new Font("serif",Font.BOLD,15));
b2.addActionListener(this);
b2.setBackground(Color.BLACK);
b2.setForeground(Color.WHITE);
f.add(b2);
f.getContentPane().setBackground(Color.WHITE);
f.setVisible(true);
f.setSize(1360,750);
/*f.setLocation(400, 300);*/
}
public void actionPerformed(ActionEvent ae){
    try{
        conn c1=new conn();
        String u=t1.getText();
          String v=t2.getText();
          String q="select*from login where username='"+u+"'and password='"+v+"'";
          ResultSet rs=c1.s.executeQuery(q);
          if(rs.next()){
              new details().f.setVisible(true);
              f.setVisible(false);
          }else{
              JOptionPane.showMessageDialog(null,"Invalid Login");
              f.setVisible(false);
          }
          }catch(Exception e){
                  e.printStackTrace();
                  }
    }
    public static void main (String[]arg){
        
        login l=new login();
              
          }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }









