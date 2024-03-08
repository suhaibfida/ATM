package Bank.Management;
import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class Ministat extends JFrame implements ActionListener {
    String pin;
    JButton b1;
    JLabel label2;
    Ministat(String pin){
        this.pin=pin;
        setTitle("Mini Statement");
        setSize(400,600);
        setLocation(50,30);
        setVisible(true);
        setLayout(null);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image set=img1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(set);
        JLabel label=new JLabel(img2);
        label.setBounds(170,35,30,30);
        add(label);
//        Title
        JLabel bName=new JLabel("Form | Wall | Bank");
        bName.setFont(new Font("serif",Font.BOLD,14));
        bName.setBounds(126,65,130,30);
        add(bName);

        JLabel label2=new JLabel();
        label2.setBounds(100,100,500,30);
        add(label2);
        JLabel label3=new JLabel();
        label3.setBounds(30,200,500,100);
        add(label3);
        JLabel bal=new JLabel();
        bal.setBounds(30,300,500,30);
        add(bal);


        try{
            Connect c=new Connect();
            ResultSet rs=c.s.executeQuery("select * from login where Pin='"+pin+"'" );
            while(rs.next()){
                label2.setText("Card Number: "+rs.getString("Card").substring(0,4)+"xxxxxxxx"+rs.getString("Card").substring(12));
            }

        }

        catch (Exception e){
            System.out.println(e);
        }

        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from account where pin='" + pin + "'");
            int balance = 0;
            while (rs.next()) {
                label3.setText(label3.getText()+"<html>" + rs.getString("Date") + " &nbsp; &nbsp; &nbsp; " + rs.getString("Type") + "&nbsp; &nbsp; &nbsp;  " + rs.getString("Amount") + " <br><br><html>");
                if (rs.getString("Type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("Amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("Amount"));
                }
                bal.setText("Your current balance : " + balance);

            }



        }
        catch (Exception e){
            System.out.println(e);
        }





        b1=new JButton("Back");
        b1.setBounds(135,500,100,30);
        b1.setFont(new Font("SanSerif",Font.BOLD,17));
        b1.addActionListener(this);
        b1.setBackground(Color.pink);
        b1.setForeground(Color.BLACK);
        add(b1);




    }

    public static void main(String[] args) {
        new Ministat("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            setVisible(false);
            new Transactions(pin).setVisible(true);

        }

    }
}
