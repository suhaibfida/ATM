package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    JButton b1,b2;
    String pin;
    JTextField text;

    Deposit(String pin){
        this.pin=pin;
        setLayout(null);
        setTitle("Deposit");
        setSize(715,740);
        setLocation(400,20);
        setVisible(true);
        ImageIcon atm=new ImageIcon(ClassLoader.getSystemResource("Icons/atm png.jpg"));
        Image set=atm.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon img=new ImageIcon(set);
        JLabel label=new JLabel(img);
        label.setBounds(0,0,700,700);
        add(label);
        JLabel label2=new JLabel("Please Enter the Amount You Want To Deposit");
        label2.setBounds(175,240,430,40);
        label2.setFont(new Font("sanserif",Font.BOLD,15));
        label2.setForeground(Color.WHITE);
        label.add(label2);
         text=new JTextField();
        text.setBounds(180,285,300,25);
        text.setFont(new Font("Raleway",Font.BOLD,18));
        label.add(text);
        b1 =new JButton("Deposit");
        b1.setBounds(400,330,100,30);
        b1.setFont(new Font("SanSerif",Font.BOLD,15));
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        label.add(b1);
         b2=new JButton("Back");
         b2.setBounds(290,330,100,30);
         b2.setFont(new Font("SanSerif",Font.BOLD,17));
         b2.addActionListener(this);
          b2.setBackground(Color.pink);
           b2.setForeground(Color.BLACK);
         label.add(b2);
    }
    public static void main(String[] args) {
        new Deposit("");

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
           String st=text.getText();

           if(st.equals("")){
               JOptionPane.showMessageDialog(null,"Please enter the amount");

           } else {

               try {
                   Connect c=new Connect();
                   Date date=new Date();
                   String query="Insert into Account values('"+pin+"','"+date+"','Deposit','"+st+"')";
                   c.s.executeUpdate(query);
                   JOptionPane.showMessageDialog(null,"Deposited Successfully.");
               } catch (SQLException ex) {
                   System.out.println(ex);
               }
           }

        }

        else if(e.getSource()==b2){
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }
    }
}
