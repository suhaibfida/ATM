package Bank.Management;

import javax.swing.*;
import java.awt.*;

public class Deposit extends JFrame {
    JButton b1;
    Deposit(){
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
        JLabel label2=new JLabel("Please Enter the Amount You Want To Dep.");
        label2.setBounds(175,240,430,40);
        label2.setFont(new Font("sanserif",Font.BOLD,17));
        label2.setForeground(Color.WHITE);
        label.add(label2);
        JTextField text=new JTextField();
        text.setBounds(170,290,350,35);
        text.setFont(new Font("Raleway",Font.BOLD,18));
        label.add(text);
        b1 =new JButton("Deposit");
        b1.setBounds(400,350,130,30);
        b1.setFont(new Font("SanSerif",Font.BOLD,15));
        b1.setBackground(Color.white);
        b1.setForeground(Color.BLACK);
        label.add(b1);





    }




    public static void main(String[] args) {
        new Deposit();

    }
}
