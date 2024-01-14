package Bank.Management;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login(){
        setTitle("ATM");
        setLayout(null);
        ImageIcon bankPng=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image set=bankPng.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
//   You can not insert 'set' directly to Jlabel i.e why we coverted'set' into Imageicon(because it is from another JAVA'S Framework)so that we can insert it into Jlabel directly..
        ImageIcon bankPng2=new ImageIcon(set);
        JLabel label=new JLabel(bankPng2);
        label.setBounds(82,50,70,70);
        add(label);
        setSize(800,500);
        setVisible(true);
        setLocation(350,180);
    }





    public static void main(String[] args) {
        new Login();
    }
}

