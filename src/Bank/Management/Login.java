package Bank.Management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton logIn,clear,signUp;
    JTextField text1;
    JPasswordField text2;
    Login(){
        getContentPane().setBackground(Color.pink);
        setTitle("ATM");
        setSize(780,720);
        setVisible(true);
        setLocation(350,30);
        setLayout(null);
        ImageIcon bankPng=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image set=bankPng.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
//   You can not insert 'set' directly to Jlabel i.e why we coverted'set'-
//  -into Imageicon(because it is from another JAVA'S Framework)so that-
//  -we can insert it into Jlabel directly..
        ImageIcon bankPng2=new ImageIcon(set);
        JLabel label=new JLabel(bankPng2);
        label.setBounds(351,19,80,80);
        add(label);

//      HeadLine.
        JLabel headL=new JLabel("Form |Wall| Bank");
        headL.setBounds(211,100,450,40);
        headL.setFont(new Font("Serif",Font.BOLD,47));
        add(headL);

//        Card No.
        JLabel cardNo=new JLabel("Card No:");
        cardNo.setBounds(100,200,450,40);
        cardNo.setFont(new Font("Raleway",Font.BOLD,30));
        add(cardNo);
//        TextField for card
         text1=new JTextField();
        text1.setBounds(250,208,330,27);
        text1.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text1);
//        Pin
        JLabel pin=new JLabel(" Pin No:");
        pin.setBounds(100,275,400,40);
        pin.setFont(new Font("Raleway",Font.BOLD,30));

        add(pin);
//        TextField for Pin
        text2=new JPasswordField();
        text2.setBounds(250,283,330,27);
        text2.setFont(new Font("serif",Font.BOLD,18));
        add(text2);
//        Buttons
//        LOGIN
         logIn=new JButton("LogIn");
        logIn.setBounds(250,350,150,30);
        logIn.setFont(new Font("SanSerif",Font.BOLD,18));
        logIn.addActionListener(this);
        logIn.setBackground(Color.DARK_GRAY);
        logIn.setForeground(Color.WHITE);
        add(logIn);
//        CLEAR
         clear=new JButton("Clear");
        clear.setBounds(430,350,150,30);
        clear.setFont(new Font("SanSerif",Font.BOLD,18));
        clear.addActionListener(this);
        clear.setBackground(Color.DARK_GRAY);
        clear.setForeground(Color.WHITE);
        add(clear);
//        SIGNUP
        signUp =new JButton("SignUp");
        signUp.setBounds(250,390,330,30);
        signUp.setFont(new Font("SanSerif",Font.BOLD,18));
        signUp.addActionListener(this);
        signUp.setBackground(Color.darkGray);
        signUp.setForeground(Color.WHITE);
        add(signUp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clear){
            text1.setText("");
            text2.setText("");
        }
        else if(e.getSource()==logIn){
            String cardno=text1.getText();
            String pin=text2.getText();
            Connect c=new Connect();
            String query="Select * from login where Card='"+cardno+"' and Pin='"+pin+"'";
            try {
                ResultSet result=c.s.executeQuery(query);
                if(result.next()){
                    setVisible(false);
                    new Transactions( pin).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Pin Or Password");
                }

            }
            catch (Exception ce){
                System.out.println(ce);
            }

        }
        else if (e.getSource()==signUp) {

             setVisible(false);
             new SignUp().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}

