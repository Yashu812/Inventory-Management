package inventory;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class details  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;

    details(){
        f=new JFrame("Inventory Detail");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,1360,700);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("inventory/icons/details.jpg"));
        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("INVENTORY DETAILS");
        l2.setBounds(530,80,300,140);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("BUY_GOODS");
        b1.setBounds(400,200,200,100);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("INVENTORY_REPORT");
        b2.setBounds(620,200,200,100);
        b2.setFont(new Font("serif",Font.BOLD,20));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("SELL_GOODS");
        b3.setBounds(400,350,200,100);
        b3.setFont(new Font("serif",Font.BOLD,20));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("UPDATE_GOODS");
        b4.setBounds(620,350,200,100);
        b4.setFont(new Font("serif",Font.BOLD,20));
        b4.addActionListener(this);
        l1.add(b4);

        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new BUY_GOODS();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new INVENTORY_REPORT();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new SELL_GOODS();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new SEARCH_GOODS();
        }
    }

    public static void main(String[ ] arg){
        details d = new details();
    }
}



