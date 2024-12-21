package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transaction extends JFrame implements ActionListener {
    
   JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber = pinnumber;
        
        setTitle("ATM Simulation System");
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image);
        
        JLabel text = new JLabel("please select your trasaction");
        text.setFont(new Font("relway",Font.BOLD,20));
        text.setForeground(Color.WHITE);
        text.setBounds(200,240,700,35);
        image.add(text);
        
        deposit = new JButton("Depodit");
        deposit.setBounds(170,365,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(365,365,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,400,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(365,400,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("PIN Change");
        pinchange.setBounds(170,435,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(365,435,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(365,470,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
              
        setSize(900,900);
        setLocation(300,0);
       // setUndecorated(true);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== exit)
        {
            System.exit(0);
        }else if(ae.getSource()==deposit)
        {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()==withdrawl)
        {
            setVisible(false);
            new withdraw(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash)
        {
            setVisible(false);
            new fastcash(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange)
        {
            setVisible(false);
            new pinchange(pinnumber).setVisible(true);
        }else if(ae.getSource()==balanceenquiry)
        {
            setVisible(false);
            new balanceenquiry(pinnumber).setVisible(true);
        }else if(ae.getSource()== ministatement)
        {
            setVisible(false);
            new minisatatement(pinnumber).setVisible(true);
        }
    }

    
    public static void main(String args[]) {
        new Transaction("");
    }
}
