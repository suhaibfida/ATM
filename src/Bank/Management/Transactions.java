package Bank.Management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{
    String pin;
    JButton b1,b2,b3,b4,b5,b6,b7;
    Transactions (String pin){
        this.pin=pin;
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
        label2.setBounds(228,240,450,40);
        label2.setFont(new Font("sanserif",Font.BOLD,17));
        label2.setForeground(Color.WHITE);
        label.add(label2);
        b1 =new JButton("Cash Withdrawl");
        b1.setBounds(190,320,130,30);
        b1.setFont(new Font("SanSerif",Font.BOLD,15));
        b1.setBackground(Color.white);
        b1.setForeground(Color.BLACK);
        label.add(b1);
        b2 =new JButton("Deposit");
        b2.setBounds(370,320,130,30);
        b2.setFont(new Font("SanSerif",Font.BOLD,15));
        b2.setBackground(Color.white);
        b2.setForeground(Color.BLACK);
        label.add(b2);
        b3 =new JButton("Mini State.");
        b3.setBounds(190,360,130,30);
        b3.setFont(new Font("SanSerif",Font.BOLD,15));
        b3.setBackground(Color.white);
        b3.setForeground(Color.BLACK);
        label.add(b3);
        b4 =new JButton("Bal. Enq.");
        b4.setBounds(370,360,130,30);
        b4.setFont(new Font("SanSerif",Font.BOLD,15));
        b4.setBackground(Color.white);
        b4.setForeground(Color.BLACK);
        label.add(b4);
        b5 =new JButton("Change Pin");
        b5.setBounds(190,400,130,30);
        b5.setFont(new Font("SanSerif",Font.BOLD,15));
        b5.setBackground(Color.white);
        b5.setForeground(Color.BLACK);
        label.add(b5);
        b6 =new JButton("Curr. Convt.");
        b6.setBounds(370,400,130,30);
        b6.setFont(new Font("SanSerif",Font.BOLD,15));
        b6.setBackground(Color.white);
        b6.setForeground(Color.BLACK);
        label.add(b6);
        b7 =new JButton("EXIT");
        b7.setBounds(280,440,130,30);
        b7.setFont(new Font("SanSerif",Font.BOLD,15));
        b7.setBackground(Color.PINK);
        b7.setForeground(Color.WHITE);
        label.add(b7);



    }

    public static void main(String[] args) {
        new Transactions("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {




    }
}
