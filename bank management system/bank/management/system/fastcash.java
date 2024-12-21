package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class fastcash extends JFrame implements ActionListener {
    
   JButton hundred,fivehundred,thousand,twothousand,fivethousand,tenthousand ,back;
    String pinnumber;
    fastcash(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("ATM Simulation System");
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image);
        
        JLabel text = new JLabel("Select Withdrawl Amount");
        text.setFont(new Font("relway",Font.BOLD,20));
        text.setForeground(Color.WHITE);
        text.setBounds(200,240,700,35);
        image.add(text);
        
        hundred = new JButton("Rs 100");
        hundred.setBounds(170,365,150,30);
        hundred.addActionListener(this);
        image.add(hundred);
        
        fivehundred = new JButton("Rs 500");
        fivehundred.setBounds(365,365,150,30);
        fivehundred.addActionListener(this);
        image.add(fivehundred);
        
        thousand = new JButton("Rs 1000");
        thousand.setBounds(170,400,150,30);
        thousand.addActionListener(this);
        image.add(thousand);
        
        twothousand = new JButton("Rs 2000");
        twothousand.setBounds(365,400,150,30);
        twothousand.addActionListener(this);
        image.add(twothousand);
        
        fivethousand = new JButton("Rs 5000");
        fivethousand.setBounds(170,435,150,30);
        fivethousand.addActionListener(this);
        image.add(fivethousand);
        
        tenthousand = new JButton("Rs 10000");
        tenthousand.setBounds(365,435,150,30);
        tenthousand.addActionListener(this);
        image.add(tenthousand);
        
        back = new JButton("Back");
        back.setBounds(365,470,150,30);
        back.addActionListener(this);
        image.add(back);
        
              
        setSize(900,900);
        setLocation(300,0);
       // setUndecorated(true);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== back)
        {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }else
        {
            //click button then get text on button 
            String amount = ((JButton)ae.getSource()).getText().substring(3);//remove Rs 500 first 3 carecter
            Conn c = new Conn();
            try
            {
                ResultSet rs = c.stmt.executeQuery("select * from bank where pin ='"+pinnumber+"'");
                int balance =0;
                while(rs.next())
                {   //chech balance
                    if(rs.getString("type").equals("deposit"))
                    {
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else      //getbalance current
                    {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                   //check amount you eithdrw bust blance is up
                if(ae.getSource() != back && balance < Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                c.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"RS" +amount+ "debited sucessfully");
                
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
                
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
        }
    }

    
    public static void main(String args[]) {
        new fastcash("");
    }
}
