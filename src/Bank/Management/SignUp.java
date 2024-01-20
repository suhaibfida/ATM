package Bank.Management;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignUp extends JFrame{
    SignUp(){
//        BACKGROUND COLOR
        getContentPane().setBackground(Color.pink);
//        FRAME
        setLayout(null);
        setTitle("Page No.1");
        setSize(750,770);
        setVisible(true);
        setLocation(410,30);
//        HEAD IMG
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image set=img1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(set);
        JLabel label=new JLabel(img2);
        label.setBounds(15,10,30,30);
        add(label);
//        Title
        JLabel bName=new JLabel("Form |Wall| Bank");
        bName.setFont(new Font("serif",Font.BOLD,13));
        bName.setBounds(50,12,130,30);
        add(bName);
//        Form No
        Random random=new Random();
        long rNo=Math.abs((random.nextLong()%9000L)+1000L);
        System.out.println(rNo);
        JLabel fNo=new JLabel("Form No:- "+rNo);
        fNo.setBounds(590,7,150,40);
        fNo.setFont(new Font("sanserif",Font.BOLD,15));
        add(fNo);

//        Personal Details
        JLabel pDetails=new JLabel("Personal Details:-");
        pDetails.setFont(new Font("sanserif",Font.BOLD,30));
        pDetails.setBounds(60,70,450,40);
        add(pDetails);
//       STARTING FROM NAME:
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("sanserif",Font.BOLD,20));
        name.setBounds(70,130,450,40);
        add(name);
        JTextField text1=new JTextField();
        text1.setBounds(250,137,250,25);
        text1.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text1);
        JLabel fname=new JLabel("Fathers Name:");
        fname.setFont(new Font("sanserif",Font.BOLD,20));
        fname.setBounds(70,180,450,40);
        add(fname);
        JTextField text2=new JTextField();
        text2.setBounds(250,188,250,25);
        text2.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text2);
        JLabel mname=new JLabel("Mothers Name:");
        mname.setFont(new Font("sanserif",Font.BOLD,20));
        mname.setBounds(70,230,450,40);
        add(mname);
        JTextField text3=new JTextField();
        text3.setBounds(250,238,250,25);
        text3.setFont(new Font("SanSerif",Font.BOLD,13));
        add(text3);
//
        JLabel dob=new JLabel("DOB:");
        dob.setFont(new Font("sanserif",Font.BOLD,20));
        dob.setBounds(70,280,450,40);
        add(dob);
//        -------------------------------------------------------------------------------------------
//       JCALENDAR site:"https://toedter.com/jcalendar/"-->unzip -->bin --> jcalendar  {Upload Jcalendar into library} (IMPORT JCalender through module settings)
        JDateChooser date=new JDateChooser();
        date.setBounds(250,288,250,25);
        date.setForeground(Color.BLACK);
        add(date);
        JLabel email=new JLabel("Gender:");
        email.setFont(new Font("sanserif",Font.BOLD,20));
        email.setBounds(70,330,450,40);
        add(email);
//        -------------------------------------New Ideas------------------------------------------------
        JRadioButton male=new JRadioButton("Male");
        male.setBounds(250,338,100,25);
        male.setBackground(Color.white);
        add(male);
        JRadioButton female=new JRadioButton("Female");
        female.setBounds(400,338,100,25);
        female.setBackground(Color.white);
        add(female);
        ButtonGroup button1=new ButtonGroup();
        button1.add(male);
        button1.add(female);

        JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("sanserif",Font.BOLD,20));
        marital.setBounds(70,380,450,40);
        add(marital);
        JRadioButton married=new JRadioButton ("Married");
        married.setBounds(250,388,70,25);
        married.setBackground(Color.white);
        add(married);
        JRadioButton unmarried=new JRadioButton ("Unmarried");
        unmarried.setBounds(327,388,85,25);
        unmarried.setBackground(Color.white);
        add(unmarried);
        JRadioButton others=new JRadioButton ("Others");
        others.setBounds(419,388,81,25);
        others.setBackground(Color.white);
        add(others);
        ButtonGroup button2=new ButtonGroup();
        button2.add(married);
        button2.add(unmarried);
        button2.add(others);

//        ------------------------------------------------------------------------------------

        JLabel state=new JLabel("State:");
        state.setFont(new Font("sanserif",Font.BOLD,20));
        state.setBounds(70,430,450,40);
        add(state);
        JTextField text7=new JTextField();
        text7.setBounds(250,438,250,25);
        text7.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text7);

        JLabel city=new JLabel("City:");
        city.setFont(new Font("sanserif",Font.BOLD,20));
        city.setBounds(70,480,450,40);
        add(city);
        JTextField text8=new JTextField();
        text8.setBounds(250,488,250,25);
        text8.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text8);

        JLabel address=new JLabel("Address:");
        address.setFont(new Font("sanserif",Font.BOLD,20));
        address.setBounds(70,530,450,40);
        add(address);
        JTextField text9=new JTextField();
        text9.setBounds(250,538,250,25);
        text9.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text9);

        JLabel pincode=new JLabel("Pincode:");
        pincode.setFont(new Font("sanserif",Font.BOLD,20));
        pincode.setBounds(70,580,450,40);
        add(pincode);
        JTextField text10=new JTextField();
        text10.setBounds(250,588,250,25);
        text10.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text10);
//        Buttons

        JButton next=new JButton("Next");
        next.setBounds(300,650,150,30);
        next.setFont(new Font("SanSerif",Font.BOLD,18));
        next.setBackground(Color.DARK_GRAY);
        next.setForeground(Color.WHITE);
        add(next);
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
