package inventory;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SEARCH_GOODS implements ActionListener{
    JFrame f;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;
     SEARCH_GOODS(){
        f=new JFrame("search");
        f.setBackground(Color.green);
        f.setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,1360,700);
        l5.setLayout(null);
       ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("inventory/icons/view.JPEG"));
        l5.setIcon(img);
        l=new JLabel("Item_ID");
        l.setVisible(true);
        l.setBounds(200,150,250,100);
        l.setForeground(Color.white);
        Font F1=new Font("serif",Font.BOLD,40);
        l.setFont(F1); 
        l5.add(l);
        f.add(l5);
        t=new JTextField();
        t.setBounds(470,150,250,60);
        t.setForeground(Color.magenta);
          t.setFont(new Font("serif",Font.BOLD,25));
        l5.add(t);
        b=new JButton("Search");
        b.setBounds(500,400,200,60);
        b.addActionListener(this);
        l5.add(b);
        b2=new JButton("Cancel");
        b2.setBounds(820,400,200,60);
        b2.addActionListener(this);
        l5.add(b2);
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
            new UPDATE_GOODS(t.getText());
            f.setVisible(false);
        }
    }
    public static void main(String[]ar){
        new SEARCH_GOODS();
    } 	
}
