package Bank.Management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame{
    Transactions (){
        setLayout(null);
        setTitle("Welcome");
        setSize(715,740);
        setLocation(400,20);
        setVisible(true);
        ImageIcon atm=new ImageIcon(ClassLoader.getSystemResource("Icons/atm png.jpg"));
        Image set=atm.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon img=new ImageIcon(set);
        JLabel label=new JLabel(img);
        label.setBounds(0,0,700,700);
        add(label);
        JLabel label2=new JLabel("Please Select your transaction");
        label2.setBounds(230,240,450,40);
        label2.setFont(new Font("sanserif",Font.BOLD,17));
        label2.setForeground(Color.WHITE);
        label.add(label2);



    }

    public static void main(String[] args) {
        new Transactions();
    }

}
