package inventory;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class INVENTORY_REPORT implements ActionListener{

    JFrame f;
    JTextField t1;
    JLabel l1,l2;
    JButton b,b2;
   /*  ImageIcon img;*/

    INVENTORY_REPORT(){
        f=new JFrame("INVENTORY_REPORT");
        f.setBackground(Color.green);
        f.setLayout(null);

        l1=new JLabel();
        l1.setBounds(0,0,1360,700);
        l1.setLayout(null);
       ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("inventory/icons/view.JPEG"));
        l1.setIcon(img);


        l2=new JLabel("Item_ID");
        l2.setVisible(true);
        l2.setBounds(300,260,250,60);
        l2.setForeground(Color.white);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        l1.add(l2);
        f.add(l1);


        t1=new JTextField();
        t1.setBounds(560,260,250,60);
        l1.add(t1);

        b=new JButton("Search");
        b.setBounds(360,530,100,60);
        b.addActionListener(this);
        l1.add(b);

        b2=new JButton("Cancel");
        b2.setBounds(550,530,100,60);
        b2.addActionListener(this);
        l1.add(b2);

        f.setSize(1360,750);
        /*f.setLocation(450,250);*/
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b2){
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b){
            f.setVisible(false);
            Print_Data p=new Print_Data(t1.getText());
        }

    }

    public static void main(String[]ar){
       INVENTORY_REPORT v=new INVENTORY_REPORT();
    }
}


