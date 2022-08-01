package inventory;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class BUY_GOODS implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id8,id15,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;
 

    BUY_GOODS(int i){}
    
    BUY_GOODS(){
        f = new JFrame("BUY_GOODS");
        f.setBackground(Color.white);
        f.setLayout(null);

       id15=new JLabel();
        id15.setBounds(0,0,1360,700);
        id15.setLayout(null);
        
     ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("inventory/icons/BUY.JPEG"));
         id15.setIcon(img);
     

        id8 = new JLabel("GOODS BUYING DETAILS");
        id8.setBounds(520,30,500,220);
        id8.setFont(new Font("serif",Font.BOLD,40));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);

 
        id1 = new JLabel("Item_ID");
        id1.setBounds(250,250,150,100);
        id1.setFont(new Font("serif",Font.BOLD,30));
         id1.setForeground(Color.blue);
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(470,250,200,100);
        t1.setFont(new Font("serif",Font.BOLD,25));
         
        t1.setForeground(Color.magenta);
        id15.add(t1);

        id2 = new JLabel("Item_Name");
        id2.setBounds(700,250,200,100);
        id2.setFont(new Font("serif",Font.BOLD,30));
         id2.setForeground(Color.blue);
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(920,250,200,100);
          t2.setForeground(Color.magenta);
          t2.setFont(new Font("serif",Font.BOLD,25));
        id15.add(t2);

        id3= new JLabel("Item_Buying_Price");
        id3.setBounds(250,400,200,100);
        id3.setFont(new Font("serif",Font.BOLD,30));
         id3.setForeground(Color.blue);
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(470,400,200,100);
          t3.setForeground(Color.magenta);
          t3.setFont(new Font("serif",Font.BOLD,25));
        id15.add(t3);

        id4= new JLabel("Quantity_Of_Purchase");  
        id4.setBounds(700,400,200,100);
        id4.setFont(new Font("serif",Font.BOLD,30));
         id4.setForeground(Color.blue);
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(920,400,200,100);
          t4.setForeground(Color.magenta);
          t4.setFont(new Font("serif",Font.BOLD,25));
        id15.add(t4);

        lab=new JLabel();
        lab.setBounds(200,450,250,200);
	id15.add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,450,250,200);
        id15.add(lab1);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(500,520,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(680,520,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        
         f.setSize(1360,750);
     
    }

    public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
      
        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into GOODS values('"+a+"','"+bb+"','"+c+"','"+d+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"ORDER Successfully Placed");
                f.setVisible(false);
                new details();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new details();
        }
    }
    public static void main(String[ ] arg){
        BUY_GOODS buy_goods = new BUY_GOODS();
    }
}