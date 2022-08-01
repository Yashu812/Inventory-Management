package inventory;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class SELL_GOODS implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;
      JComboBox c1;
       JRadioButton r7,r8;

  
    SELL_GOODS(){
        f = new JFrame("GOODS SELLING DETAILS");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,1360,700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("inventory/icons/SELL.jpeg"));
        id15.setIcon(img);

        id8 = new JLabel("GOODS SELLING DETAILS ");
        id8.setBounds(320,0,500,250);
        id8.setFont(new Font("serif",Font.BOLD,35));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);

 
        id1 = new JLabel("Item_ID");
        id1.setBounds(300,250,200,30);
        id1.setFont(new Font("serif",Font.BOLD,30));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(510,250,150,30);
        t1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(t1);

        id2 = new JLabel("Item_Name");
        id2.setBounds(670,250,200,30);
        id2.setFont(new Font("serif",Font.BOLD,30));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(890,250,150,30);
        t2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(t2);
 id3= new JLabel("Item_Selling_Price");
        id3.setBounds(300,300,200,30);
        id3.setFont(new Font("serif",Font.BOLD,30));
                id3.setForeground(Color.BLACK);
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(520,300,150,30);
        t3.setFont(new Font("serif",Font.BOLD,25));
        id15.add(t3);
   
       id4= new JLabel("Product_Selling_Quantity ");
        id4.setBounds(690,300,200,30);
        id4.setFont(new Font("serif",Font.BOLD,30));
                id4.setForeground(Color.BLACK);
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(920,300,150,30);
        t4.setFont(new Font("serif",Font.BOLD,25));
        id15.add(t4);

        id5= new JLabel("Discount_%");
        id5.setBounds(300,350,100,30);
        id5.setFont(new Font("serif",Font.BOLD,30));
                id5.setForeground(Color.BLACK);
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(400,350,150,30);
        t5.setFont(new Font("serif",Font.BOLD,25));
               
        id15.add(t5);
        
        String Sale[] = {"ON SALE","NOT ON SALE"};
        

        c1= new JComboBox(Sale);
        c1.setBounds(600,350,100,30);
       c1.setBackground(Color.WHITE);
        id15.add(c1);
        id7= new JLabel ("BUYER_GENDER");
        id7.setBounds(720,350,100,30);
        id7.setFont(new Font("serif",Font.BOLD,30));
                id7.setForeground(Color.BLACK);
        id15.add(id7);

        r7=new JRadioButton("MALE");
        r7.setBounds(820,350,150,30);
        r7.setBackground(Color.WHITE);
        id15.add(r7);
         r8=new JRadioButton("FEMALE");
        r8.setBounds(980,350,150,30);
        r8.setBackground(Color.WHITE);
        id15.add(r8);

        lab=new JLabel();
        lab.setBounds(200,450,250,200);
	id15.add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,450,250,200);
        id15.add(lab1);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(450,500,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(700,500,150,40);
        
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
        String e = t5.getText();
        String ff =(String)c1.getSelectedItem();
        String g = null;
        if(r7.isSelected()){
            g="Male";
        }
        else if(r8.isSelected()){
            g="Female";
        }
       
        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into inventory values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"ORDER SUCCESSFULLY PLACED");
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
         SELL_GOODS s;
                s= new SELL_GOODS();
    }
}