package Bank.Management;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login(){
        setTitle("ATM");
        setLayout(null);
        ImageIcon bankPng=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image set=bankPng.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
//   You can not insert 'set' directly to Jlabel i.e why we coverted'set'-
//  -into Imageicon(because it is from another JAVA'S Framework)so that-
//  -we can insert it into Jlabel directly..
        ImageIcon bankPng2=new ImageIcon(set);
        JLabel label=new JLabel(bankPng2);
        label.setBounds(350,20,70,70);
        add(label);
        setSize(800,500);
        setVisible(true);
        setLocation(350,180);
//      HeadLine.
        JLabel headL=new JLabel("Socko |Wall| Bank");
        headL.setBounds(229,100,450,40);
        headL.setFont(new Font("Serif",Font.BOLD,38));
        add(headL);

//        Card No.
        JLabel cardNo=new JLabel("Card No.");
        cardNo.setBounds(100,200,450,40);
        cardNo.setFont(new Font("SanSerif",Font.BOLD,33));
        add(cardNo);
//        TextField for card
        JTextField text1=new JTextField();
        text1.setBounds(250,206,330,30);
        add(text1);


//        Pin
        JLabel pin=new JLabel("Pin No.");
        pin.setBounds(100,275,350,40);
        pin.setFont(new Font("SanSerif",Font.BOLD,33));
        add(pin);
//        TextField for Pin
        JTextField text2=new JTextField();
        text2.setBounds(250,282,330,30);
        add(text2);
        getContentPane().setBackground(Color.white);



    }





    public static void main(String[] args) {
        new Login();
    }
}

