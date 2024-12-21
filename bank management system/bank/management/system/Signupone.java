package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
//import java.awt.event.*;
//import com.toedter.calendar.JDateChooser;



public class Signupone extends JFrame implements ActionListener
{
    
    long random;
    JTextField ntextfield,ftextfield,dtextfield,etextfield,atextfield,ctextfield,ptextfield,stextfield;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
   
    Signupone (){
        
        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 1");
        setLayout(null);
        
        Random rad =new Random();
        random = Math.abs((rad.nextLong() % 900L)+1000L);
        
        JLabel formno =new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("relway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personaldetail =new JLabel("Page 1:Personal Detail");
        personaldetail.setFont(new Font("relway",Font.BOLD,22));
        personaldetail.setBounds(290,80,400,30);
        add(personaldetail);
        
        JLabel name =new JLabel("Name:");
        name.setFont(new Font("relway",Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);
        
        ntextfield=new JTextField();
        ntextfield.setFont(new Font("relway",Font.BOLD,15));
        ntextfield.setBounds(300,140,400,30);
        add(ntextfield);
        
        JLabel fname =new JLabel("Father Name:");
        fname.setFont(new Font("relway",Font.BOLD,20));
        fname.setBounds(100,190,300,30);
        add(fname);
        
        ftextfield=new JTextField();
        ftextfield.setFont(new Font("ralway",Font.BOLD,15));
        ftextfield.setBounds(300,190,400,30);
        add(ftextfield);
        
        JLabel dob =new JLabel("Date of Birth:");
        dob.setFont(new Font("relway",Font.BOLD,20));
        dob.setBounds(100,240,300,30);
        add(dob);
        
        /*JDateChooser datechooser = new JDateChooser();
        datechooser.setBounds(300,240,400,30);
        add(datechooser);*/
        
       dtextfield = new JTextField(10);
       dtextfield.setFont(new Font("relway",Font.BOLD,20));
       dtextfield.setBounds(300,240,400,30);
       add(dtextfield);  
        
        JLabel gender =new JLabel("Gender:");
        gender.setFont(new Font("relway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("FeMale");
        female.setBounds(450,290,70,30);
        female.setBackground(Color.WHITE);
        add(female);
        other = new JRadioButton("Other");
        other.setBounds(600,290,70,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        JLabel email =new JLabel("Email Address:");
        email.setFont(new Font("relway",Font.BOLD,20));
        email.setBounds(100,340,300,30);
        add(email);
        
        etextfield=new JTextField();
        etextfield.setFont(new Font("ralway",Font.BOLD,15));
        etextfield.setBounds(300,340,400,30);
        add(etextfield);
        
        JLabel mstatus =new JLabel("Marital Status:");
        mstatus.setFont(new Font("relway",Font.BOLD,20));
        mstatus.setBounds(100,390,300,30);
        add(mstatus);
        
        married = new JRadioButton("Merried");
        married.setBounds(300,390,70,30);
        married.setBackground(Color.WHITE);
        add(married);
        unmarried = new JRadioButton(" UnMerried");
        unmarried.setBounds(450,390,90,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        
        JLabel address =new JLabel("Address:");
        address.setFont(new Font("relway",Font.BOLD,20));
        address.setBounds(100,440,300,30);
        add(address);
        
        atextfield=new JTextField();
        atextfield.setFont(new Font("ralway",Font.BOLD,15));
        atextfield.setBounds(300,440,400,30);
        add(atextfield);
        
        JLabel city =new JLabel("City:");
        city.setFont(new Font("relway",Font.BOLD,20));
        city.setBounds(100,490,300,30);
        add(city);
        
        ctextfield=new JTextField();
        ctextfield.setFont(new Font("ralway",Font.BOLD,15));
        ctextfield.setBounds(300,490,400,30);
        add(ctextfield);
        
        JLabel state =new JLabel("State:");
        state.setFont(new Font("relway",Font.BOLD,20));
        state.setBounds(100,540,300,30);
        add(state);
        
        stextfield=new JTextField();
        stextfield.setFont(new Font("ralway",Font.BOLD,15));
        stextfield.setBounds(300,540,400,30);
        add(stextfield);
        
        JLabel pincode =new JLabel("Pin Code:");
        pincode.setFont(new Font("relway",Font.BOLD,20));
        pincode.setBounds(100,590,300,30);
        add(pincode);
        
        ptextfield=new JTextField();
        ptextfield.setFont(new Font("ralway",Font.BOLD,15));
        ptextfield.setBounds(300,590,400,30);
        add(ptextfield);
        
       /* JLabel state =new JLabel("State:");
        state.setFont(new Font("relway",Font.BOLD,20));
        state.setBounds(100,590,300,30);
        add(state);
        
        stextfield=new JTextField();
        stextfield.setFont(new Font("ralway",Font.BOLD,15));
        stextfield.setBounds(300,590,400,30);
        add(stextfield);*/
        
        next =new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Machine",Font.BOLD,15));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(400,10);
        setVisible(true);
        
        
    }
   
    
    public void actionPerformed(ActionEvent ae)
    //public abstract void actionPerformed(ActionEvent e);
    {
        String  formno="" + random; //long
        String name=ntextfield.getText();
        String fname=ftextfield.getText();
        String dob=dtextfield.getText();
        String gender=null;
        if(male.isSelected())
        {
            gender="Male";
        }else if(female.isSelected())
        {
            gender="Female";
        }else if(other.isSelected())
        {
            gender="Other";        
        }
        String email=etextfield.getText();
        String mstatus=null;
        if(married.isSelected())
        {
            mstatus="married";
        }else if(unmarried.isSelected())
        {
           mstatus="unmarried";         
        }
        String address=atextfield.getText();
        String city=ctextfield.getText();
        String state=stextfield.getText();
        String pincode=ptextfield.getText();
        
        try
        {
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            if(fname.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Father Name is Required");
            }
            if(dob.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Date of birth is Required");
            }
            if(email.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Email is Required");
            }
            if(address.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Address is Required");
            }
            if(city.equals(""))
            {
                JOptionPane.showMessageDialog(null,"City is Required");
            }
            if(state.equals(""))
            {
                JOptionPane.showMessageDialog(null,"State is Required");
            }
            if(pincode.equals(""))
            {
                JOptionPane.showMessageDialog(null,"PinCode is Required");
            }
            else
            {
                Conn c= new Conn();
                String query ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+mstatus+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c.stmt.executeUpdate(query);
               // JOptionPane.showMessageDialog(null,"Data Inserted SuccessFully.");
                
                setVisible(false);
                new Signuptwo(formno).setVisible(true);
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }

   
    public static void main(String args[])
    {
         new Signupone();
    }

}
    