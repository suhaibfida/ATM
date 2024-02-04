package Bank.Management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignUp extends JFrame implements ActionListener{
    long rNo;
    JDateChooser date;
    JTextField text1,text2,text3,text11,text12,text13,text14;
    JLabel name,fNo,dob,gender,marital,fname,mname;
    JRadioButton male,female,married,unmarried,others;
    JButton next;
    SignUp( ){
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
         rNo=Math.abs((random.nextLong()%9000L)+1000L);
        fNo=new JLabel("Form No:- "+rNo);
        fNo.setBounds(590,7,150,40);
        fNo.setFont(new Font("sanserif",Font.BOLD,15));
        add(fNo);

//        Personal Details
        JLabel pDetails=new JLabel("Personal Details:-");
        pDetails.setFont(new Font("sanserif",Font.BOLD,30));
        pDetails.setBounds(60,70,450,40);
        add(pDetails);
//       STARTING FROM NAME:
        name=new JLabel("Name:");
        name.setFont(new Font("sanserif",Font.BOLD,20));
        name.setBounds(70,130,450,40);
        add(name);
        text1=new JTextField();
        text1.setBounds(250,137,250,25);
        text1.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text1);
        fname=new JLabel("Fathers Name:");
        fname.setFont(new Font("sanserif",Font.BOLD,20));
        fname.setBounds(70,180,450,40);
        add(fname);
        text2=new JTextField();
        text2.setBounds(250,188,250,25);
        text2.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text2);
        mname=new JLabel("Mothers Name:");
        mname.setFont(new Font("sanserif",Font.BOLD,20));
        mname.setBounds(70,230,450,40);
        add(mname);
        text3=new JTextField();
        text3.setBounds(250,238,250,25);
        text3.setFont(new Font("SanSerif",Font.BOLD,13));
        add(text3);
//
        dob=new JLabel("DOB:");
        dob.setFont(new Font("sanserif",Font.BOLD,20));
        dob.setBounds(70,280,450,40);
        add(dob);
//        -------------------------------------------------------------------------------------------
//       JCALENDAR site:"https://toedter.com/jcalendar/"-->unzip -->bin --> jcalendar  {Upload Jcalendar into library} (IMPORT JCalender through module settings)
         date=new JDateChooser();
        date.setBounds(250,288,250,25);
        date.setFont(new Font("sanserif",Font.BOLD,10));
        date.setForeground(Color.black);
        add(date);
        gender=new JLabel("Gender:");
        gender.setFont(new Font("sanserif",Font.BOLD,20));
        gender.setBounds(70,330,450,40);
        add(gender);
//        -------------------------------------New Ideas------------------------------------------------
        male=new JRadioButton("Male");
        male.setBounds(250,338,100,25);
        male.setBackground(Color.white);
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(400,338,100,25);
        female.setBackground(Color.white);
        add(female);
        ButtonGroup button1=new ButtonGroup();
        button1.add(male);
        button1.add(female);

        marital=new JLabel("Marital Status:");
        marital.setFont(new Font("sanserif",Font.BOLD,20));
        marital.setBounds(70,380,450,40);
        add(marital);
        married=new JRadioButton ("Married");
        married.setBounds(250,388,70,25);
        married.setBackground(Color.white);
        add(married);
        unmarried=new JRadioButton ("Unmarried");
        unmarried.setBounds(327,388,85,25);
        unmarried.setBackground(Color.white);
        add(unmarried);
        others=new JRadioButton ("Others");
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
        text11=new JTextField();
        text11.setBounds(250,438,250,25);
        text11.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text11);

        JLabel city=new JLabel("City:");
        city.setFont(new Font("sanserif",Font.BOLD,20));
        city.setBounds(70,480,450,40);
        add(city);
        text12=new JTextField();
        text12.setBounds(250,488,250,25);
        text12.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text12);

        JLabel address=new JLabel("Address:");
        address.setFont(new Font("sanserif",Font.BOLD,20));
        address.setBounds(70,530,450,40);
        add(address);
        text13=new JTextField();
        text13.setBounds(250,538,250,25);
        text13.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text13);

        JLabel pincode=new JLabel("Pincode:");
        pincode.setFont(new Font("sanserif",Font.BOLD,20));
        pincode.setBounds(70,580,450,40);
        add(pincode);
        text14=new JTextField();
        text14.setBounds(250,588,250,25);
        text14.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text14);
//        Buttons

        next=new JButton("Next");
        next.setBounds(300,650,150,30);
        next.setFont(new Font("SanSerif",Font.BOLD,18));
        next.setBackground(Color.DARK_GRAY);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
    }

    public static void main(String[] args) {
        new SignUp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String random=""+rNo;
        String name=text1.getText();
        String fName=text2.getText();
        String mName=text3.getText();
        String dob=((JTextField)date.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
        }
        String marital;
        if(married.isSelected()){
            marital="Married";


        }
        else if(unmarried.isSelected()){
            marital="Unmarried";

        }
        else{
            marital="Others";
        }
        String state=text11.getText();
        String city =text12.getText();
        String address=text13.getText();
        String pinc=text14.getText();
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Invalid Name");
            }
            else if (e.getSource()==next){

               Connect c=new Connect();
               String insertVal="insert  into signUp values('"+random+"','"+name+"','"+fName+"','"+mName+"','"+dob+"','"+gender+"','"+marital+"','"+state+"','"+city+"','"+address+"','"+pinc+"')";
                c.s.executeUpdate(insertVal);
                setVisible(false);
                new SignUp2(random).setVisible(true);
            }

        }
        catch (Exception f){
            System.out.println(f);
        }



    }
}
