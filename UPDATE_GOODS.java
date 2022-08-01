package inventory;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class UPDATE_GOODS extends BUY_GOODS implements ActionListener{

    JFrame f;
    JLabel id1,id2,id3,id4,id8,id15;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b,b1,b2,b3; 
    String item_id,idaa;
    ImageIcon img;

   UPDATE_GOODS(String idaa){
        super(0);
        f=new JFrame("update inventory details");
        f.setVisible(true);
        f.setSize(1360,750);
        /*f.setLocation(450,250);*/
        f.setBackground(Color.white);
        f.setLayout(null);

        item_id=idaa;    
        id15=new JLabel();
        id15.setBounds(0,0,1360,750);
        id15.setLayout(null);
      ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("inventory/icons/BUY.JPEG"));
        id15.setIcon(img);

        id8 = new JLabel("Update Inventory Detail:");
        id8.setBounds(520,50,500,220);
        id8.setFont(new Font("serif",Font.ITALIC,40));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);
          /*id8 = new JLabel("GOODS BUYING DETAILS");
        id8.setBounds(520,50,500,220);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);*/
           id1 = new JLabel("Item_ID");
        id1.setBounds(250,250,150,100);
        id1.setFont(new Font("serif",Font.BOLD,20));
         id1.setForeground(Color.blue);
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(470,250,200,100);
         
        t1.setForeground(Color.magenta);
        id15.add(t1);

        id2 = new JLabel("Item_Name");
        id2.setBounds(700,250,200,100);
        id2.setFont(new Font("serif",Font.BOLD,20));
         id2.setForeground(Color.blue);
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(920,250,200,100);
          t1.setForeground(Color.magenta);
        id15.add(t2);

        id3= new JLabel("Item_Buying_Price");
        id3.setBounds(250,400,200,100);
        id3.setFont(new Font("serif",Font.BOLD,20));
         id3.setForeground(Color.blue);
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(470,400,200,100);
          t3.setForeground(Color.magenta);
        id15.add(t3);

        id4= new JLabel("Quantity_Of_Purchase");  
        id4.setBounds(700,400,200,100);
        id4.setFont(new Font("serif",Font.BOLD,20));
         id4.setForeground(Color.blue);
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(920,400,200,100);
          t4.setForeground(Color.magenta);
        id15.add(t4);
         b = new JButton("UPDATE");
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

        showData(idaa);
    }
    int i=0;
  void showData(String s){
        try{
            conn con = new conn();
            String str = "select * from GOODS where item_id = '"+s+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()){
                f.setVisible(true);
                i=1;

                t1.setText(rs.getString(1));
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(3));
                t4.setText(rs.getString(4));
              }
            if(i==0)
                JOptionPane.showMessageDialog(null,"Id not found");
            new SEARCH_GOODS();
        }catch(Exception ex){}
        f.setVisible(true);
        f.setSize(1360,750);
      }
  public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b && i==1){
            try{
                conn con = new conn();
                String str = "update GOODS set Item_Id='"+t1.getText()+"',Item_Name='"+t2.getText()+"',Item_Buying_Price='"+t3.getText()+"',Quantity_Of_Purchase='"+t4.getText()+"' where item_id='"+item_id+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new SEARCH_GOODS();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            details d=new details();
        }
    }
   public static void main(String[] arg){
        new UPDATE_GOODS("UPDATE ");
    }
}