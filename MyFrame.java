/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wipro.candidate.service;
import  com.wipro.candidate.bean.*;

import java.awt.*;
import java.awt.GridBagConstraints.*;
import java.awt.event.*;
import java.applet.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;
public class MyFrame 
{
     public static void main(String args[])
	{
            try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException e) {
          
        } catch (IllegalAccessException e) {
         } catch (InstantiationException e) {
         } catch (UnsupportedLookAndFeelException e) {
         }
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });
    
        }      
	
         CandidateBean a1=new CandidateBean();
         CandidateBean a2=new CandidateBean();
         CandidateBean a3=new CandidateBean();
         CandidateBean a4=new CandidateBean();
         CandidateBean a5=new CandidateBean();   
     
        ImageIcon image = new ImageIcon("image/snist.png");
        ImageIcon image1 = new ImageIcon("image/snist1.png");
        
        private final String datePattern = "dd-MM-yyyy";
        private final SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
        Date date = new Date();
     
        JFrame mainframe=new JFrame("CANDIDATE MANAGEMENT SYSTEM");
	JFrame wrongdetailsframe=new JFrame("!!!");
        JFrame ma001frame=new JFrame("CANDIDATE INFORMATION");
        JFrame me002frame=new JFrame("CANDIDATE INFORMATION");
        JFrame ch003frame=new JFrame("CANDIDATE INFORMATION");
        JFrame ram004frame=new JFrame("CANDIDATE INFORMATION");
        JFrame sh005frame=new JFrame("CANDIDATE INFORMATION");
        
        
        JPanel loginpanel=new JPanel();
        JPanel gradeinfopanel=new JPanel();
        JPanel candidateinfopanel=new JPanel();
        JPanel passpanel=new JPanel();
        JPanel failpanel=new JPanel();
        
        JLabel username=new JLabel("USERNAME");
        JLabel password=new JLabel("PASSWORD");
        JLabel wrongdetails=new JLabel("WRONG DETAILS !!");
        JLabel rollnumbers=new JLabel("ROLL NUMBERS");
        JLabel logoLabel = new JLabel(image);
        JLabel mayank=new JLabel("MAYANK - 001");
        JLabel meghana=new JLabel("MEGHANA - 002");
        JLabel chanakya=new JLabel("CHANAKYA - 003");
        JLabel ram=new JLabel("RAM - 004");
        JLabel shyam=new JLabel("SHYAM - 005");
     
        JTextField usernameField=new JTextField(20);
        JTextField datedisplay=new JTextField(30);
        JPasswordField passwordField=new JPasswordField(20);
      
        JTextArea passcandidates=new JTextArea(50,50);
        JTextArea failcandidates=new JTextArea(50,50);
        
        JTabbedPane tabs=new JTabbedPane();
        JTabbedPane tabs1=new JTabbedPane();
        
        JButton loginbutton=new JButton("Login");
        JButton ma001bt=new JButton("001");
        JButton me002bt= new JButton("002");
        JButton ch003bt= new JButton("003");
        JButton ram004bt= new JButton("004");
        JButton sh005bt= new JButton("005");   
        JButton exitbt=new JButton("EXIT");
        JButton exitbt2=new JButton("EXIT");
        JButton closebt=new JButton("CLOSE");
        JButton detailsbt=new JButton("CLICK FOR DETAILS");
        JButton detailsbt1=new JButton("CLICK FOR DETAILS");
        JButton detailsbt2=new JButton("CLICK FOR DETAILS");
        JButton detailsbt3=new JButton("CLICK FOR DETAILS");
        JButton detailsbt4=new JButton("CLICK FOR DETAILS");
        

        MyFrame()
                {
                    a1.setid("ma001");
                    a1.setName("MAYANK");
                    a1.setM1(80);
                    a1.setM2(80);
                    a1.setM3(90);
                    a1.setResult();
                    a1.setGrade();
                    a2.setid("me002");
                    a2.setName("MEGHANA");
                    a2.setM1(85);
                    a2.setM2(89);
                    a2.setM3(90);
                    a2.setResult();
                    a2.setGrade();
                    a3.setid("ch003");
                    a3.setName("CHANAKYA");
                    a3.setM1(90);
                    a3.setM2(100);
                    a3.setM3(100);
                    a3.setResult();
                    a3.setGrade();
                    a4.setid("ram004");
                    a4.setName("RAM");
                    a4.setM1(80);
                    a4.setM2(80);
                    a4.setM3(90);
                    a4.setResult();
                    a4.setGrade();
                    a5.setid("sh005");
                    a5.setName("SHYAM");
                    a5.setM1(30);
                    a5.setM2(40);
                    a5.setM3(50);
                    a5.setResult();
                    a5.setGrade();
                    
                    mainframe.setVisible(true);
                    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    mainframe.setSize(800,550);
                    mainframe.setResizable(false);
                    mainframe.setLocationRelativeTo(null);
                    mainframe.setIconImage(image1.getImage());
                    
                    closebt.setBounds(20,150,150,40);
                    
                    ma001frame.setVisible(false);
                    ma001frame.setBounds(400,170,400, 250);
                    ma001frame.setResizable(false);
                    me002frame.setVisible(false);
                    me002frame.setBounds(400,170,400, 250);
                    me002frame.setResizable(false);
                    ch003frame.setVisible(false);
                    ch003frame.setBounds(400,170,400, 250);
                    ch003frame.setResizable(false);
                    ram004frame.setVisible(false);
                    ram004frame.setBounds(400,170,400, 250);
                    ram004frame.setResizable(false);
                    sh005frame.setVisible(false);
                    sh005frame.setBounds(400,170,400, 250);
                    sh005frame.setResizable(false);
                    ma001frame.setIconImage(image1.getImage());
                    me002frame.setIconImage(image1.getImage());
                    ch003frame.setIconImage(image1.getImage());
                    ram004frame.setIconImage(image1.getImage());
                    sh005frame.setIconImage(image1.getImage());
 
                    loginpanel.setLayout(null);
                    loginpanel.add(username);
                    username.setBounds(290,210,100,25);
                    username.setFont(new Font("Signika", Font.PLAIN,18));
                    loginpanel.add(usernameField);
                    usernameField.setBounds(290, 240, 220,25);
                    loginpanel.add(password);
                    password.setBounds(290,300,95,25);
                    password.setFont(new Font("Signika", Font.PLAIN,18));
                    loginpanel.add(passwordField); 
                    passwordField.setBounds(290,330,220,25);
                    loginpanel.add(loginbutton);
                    loginbutton.setBounds(358,390,85,25);
                    loginbutton.setFont(new Font("Signika", Font.PLAIN,16));
                    mainframe.add(loginpanel);
                    loginpanel.setBackground(Color.WHITE);
                    loginpanel.add(logoLabel);
                    logoLabel.setBounds(225,50,351,80);
                    datedisplay.setEditable(false);
                    datedisplay.setText(dateFormatter.format(date));
                    datedisplay.setFont(new Font("Neuton", Font.BOLD,15));
                    datedisplay.setBounds(728,500,70,20);
                    datedisplay.setBackground(Color.WHITE);
                    loginpanel.add(datedisplay);
                    
                   
                    candidateinfopanel.setSize(800,550);
                    rollnumbers.setFont(new Font("Work Sans SemiBold", Font.BOLD+Font.PLAIN,12));
                    Box box = Box.createVerticalBox();
                    box.add(rollnumbers);
                    box.add(Box.createVerticalStrut(20)); 
                    box.add(ma001bt);
                    box.add(Box.createVerticalStrut(20)); 
                    box.add(me002bt);
                    box.add(Box.createVerticalStrut(20));
                    box.add(ch003bt);
                    box.add(Box.createVerticalStrut(20));
                    box.add(ram004bt);
                    box.add(Box.createVerticalStrut(20));
                    box.add(sh005bt);
                    box.add(Box.createVerticalStrut(150));
                    box.add(exitbt);
                    candidateinfopanel.add(box);
                    candidateinfopanel.setBackground(Color.WHITE);
                    
                    gradeinfopanel.setSize(800,550);
                    /*gradeinfopanel.add(exitbt2);
                    exitbt2.setSize(50,20);*/
                    mayank.setBounds(10,15,140,20);
                    passcandidates.setEditable(false);
                    failcandidates.setEditable(false);
                    passcandidates.add(mayank);
                    passcandidates.add(detailsbt);
                    detailsbt.setBounds(170,15,200,20);
                    meghana.setBounds(10,45,140,20);
                    passcandidates.add(meghana);
                    passcandidates.add(detailsbt1);
                    detailsbt1.setBounds(170,45,200,20);
                    chanakya.setBounds(10,75,140,20);
                    passcandidates.add(chanakya);
                    passcandidates.add(detailsbt2);
                    detailsbt2.setBounds(170,75,200,20);
                    ram.setBounds(10,105,140,20);
                    passcandidates.add(ram);
                    passcandidates.add(detailsbt3);
                    detailsbt3.setBounds(170,105,200,20);
                    shyam.setBounds(10,15,140,20);
                    passcandidates.add(detailsbt3);
                    detailsbt4.setBounds(170,15,200,20);
                    failcandidates.add(shyam);
                    failcandidates.add(detailsbt4);
                    
                    tabs1.add("PASSED STUDENTS",passcandidates);
                    tabs1.add("FAILED CANDIDATES",failcandidates);
                    tabs1.setSize(800,550);
                    gradeinfopanel.add(tabs1);
                    gradeinfopanel.setBackground(Color.WHITE);
                    
                    
                    tabs.setSize(800,500);
                    tabs.addTab("CANDIDATE INFO",candidateinfopanel);
                    tabs.setMnemonicAt(0, KeyEvent.VK_1);
                    tabs.addTab("INFO BY GRADE",gradeinfopanel);
                    tabs.setMnemonicAt(1, KeyEvent.VK_2);
                    
                    
          
                     //login button action listener in mainpanel
                    loginbutton.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		loginbuttonActionPerformed(evt);
                
        }
                
        });
                    
                    ma001bt.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		ma001btActionPerformed(evt);
                
        }
        });
                    
                   me002bt.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		me002btActionPerformed(evt);
                
        }
        });
                   ch003bt.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		ch003btActionPerformed(evt);
                
        }
        });
                   ram004bt.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		ram004btActionPerformed(evt);
                
        }
        });
                   sh005bt.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		sh005btActionPerformed(evt);
                
        }
        });
                   exitbt.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		exitbtActionPerformed(evt);
                
        }
        });
                    
                   /*exitbt2.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		exitbt2ActionPerformed(evt);
                
        }
        });*/
                    closebt.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		closebtActionPerformed(evt);
                
        }
        });
                detailsbt.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		detailsbtActionPerformed(evt);
                
        }
        });
                 detailsbt1.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		detailsbt1ActionPerformed(evt);
                
        }
        });
                  detailsbt2.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		detailsbt2ActionPerformed(evt);
                
        }
        });
                   detailsbt3.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		detailsbt3ActionPerformed(evt);
                
        }
        });
                    detailsbt4.addActionListener(new ActionListener() 
	{
                @Override
		public void actionPerformed(ActionEvent evt)
	{
		detailsbt4ActionPerformed(evt);
                
        }
        });
    }
             private void loginbuttonActionPerformed(ActionEvent evt) 
                   {
                if((usernameField.getText().equals("admin"))&&(new String(passwordField.getPassword()).equals("admin")))
                {
                   
                    loginpanel.removeAll();
                    loginpanel.repaint();
                    loginpanel.revalidate();
      
                    loginpanel.add(tabs);
                    loginpanel.repaint();
                    loginpanel.revalidate();  
                }
		else
                {
                    JOptionPane.showMessageDialog(wrongdetailsframe,"Wrong credentials.","Login error",JOptionPane.ERROR_MESSAGE);
                }
}
             private void ma001btActionPerformed(ActionEvent evt) 
                   {
                     JLabel candidatenamelabel=new JLabel("Candidate name: "); 
                     JLabel candidateidlabel=new JLabel("Candidate id: ");
                     JLabel candidatemarks1label=new JLabel("Candidate Marks 1: ");
                     JLabel candidatemarks2label=new JLabel("Candidate Marks 2: ");
                     JLabel candidatemarks3label=new JLabel("Candidate Marks 3: ");
                     JLabel candidategradelabel=new JLabel("Grade: ");
                     JLabel candidateresultlabel=new JLabel("Result: ");
                     JLabel space=new JLabel(" ");
                     JLabel candidatename=new JLabel(); 
                     JLabel candidateid=new JLabel();
                     JLabel candidatemarks1=new JLabel();
                     JLabel candidatemarks2=new JLabel();
                     JLabel candidatemarks3=new JLabel();
                     JLabel candidategrade=new JLabel();
                     JLabel candidateresult=new JLabel();
                     JLabel space1=new JLabel(" ");
                     candidatename.setText(a1.getName());
                     candidateid.setText(a1.getid());
                     candidatemarks1.setText(String.valueOf(a1.getM1()));
                     candidatemarks2.setText(String.valueOf(a1.getM2()));
                     candidatemarks3.setText(String.valueOf(a1.getM3()));
                     candidategrade.setText(a1.getGrade());
                     candidateresult.setText(a1.getResult());
                     ma001frame.add(candidatenamelabel);
                     ma001frame.add(candidateidlabel);
                     ma001frame.add(candidatemarks1label);
                     ma001frame.add(candidatemarks2label);
                     ma001frame.add(candidatemarks3label);
                     ma001frame.add(candidateresultlabel);
                     ma001frame.add(candidategradelabel);
                     ma001frame.add(closebt);
                     ma001frame.add(space);
                     ma001frame.add(candidatename);
                     ma001frame.add(candidateid);
                     ma001frame.add(candidatemarks1);
                     ma001frame.add(candidatemarks2);
                     ma001frame.add(candidatemarks3);
                     ma001frame.add(candidateresult);
                     ma001frame.add(candidategrade);
                     ma001frame.add(space1);
                     candidategradelabel.setBounds(20,110,50,20);
                     candidatenamelabel.setBounds(20,10,150,20);
                     candidateidlabel.setBounds(20,30,100,20);
                     candidatemarks1label.setBounds(20,50,150,20);
                     candidatemarks2label.setBounds(20,70,150,20);
                     candidatemarks3label.setBounds(20,90,150,20);
                     candidateresultlabel.setBounds(20,130,150,20);
                     candidatename.setBounds(130,10,50,20);
                     candidateid.setBounds(130,30,150,20);
                     candidategrade.setBounds(130,110,150,20);
                     candidatemarks1.setBounds(130,50,150,20);
                     candidatemarks2.setBounds(130,70,150,20);
                     candidatemarks3.setBounds(130,90,150,20);
                     candidateresult.setBounds(130,130,150,20);
                     ma001frame.setVisible(true);
                }
		
             private void me002btActionPerformed(ActionEvent evt) 
                   {
                     JLabel candidatenamelabel=new JLabel("Candidate name:");
                     JLabel candidateidlabel=new JLabel("Candidate id:");
                     JLabel candidatemarks1label=new JLabel("Candidate Marks 1: ");
                     JLabel candidatemarks2label=new JLabel("Candidate Marks 2: ");
                     JLabel candidatemarks3label=new JLabel("Candidate Marks 3: ");
                     JLabel candidategradelabel=new JLabel("Grade:");
                     JLabel candidateresultlabel=new JLabel("Result:");
                     JLabel space=new JLabel(" ");
                     JLabel candidatename=new JLabel(); 
                     JLabel candidateid=new JLabel();
                     JLabel candidatemarks1=new JLabel();
                     JLabel candidatemarks2=new JLabel();
                     JLabel candidatemarks3=new JLabel();
                     JLabel candidategrade=new JLabel();
                     JLabel candidateresult=new JLabel();
                     JLabel space1=new JLabel(" ");
                     candidatename.setText(a2.getName());
                     candidateid.setText(a2.getid());
                     candidatemarks1.setText(String.valueOf(a2.getM1()));
                     candidatemarks2.setText(String.valueOf(a2.getM2()));
                     candidatemarks3.setText(String.valueOf(a2.getM3()));
                     candidategrade.setText(a2.getGrade());
                     candidateresult.setText(a2.getResult());
                     me002frame.add(candidatenamelabel);
                     me002frame.add(candidateidlabel);
                     me002frame.add(candidatemarks1label);
                     me002frame.add(candidatemarks2label);
                     me002frame.add(candidatemarks3label);
                     me002frame.add(candidateresultlabel);
                     me002frame.add(candidategradelabel);
                     me002frame.add(closebt);
                     me002frame.add(space);
                     me002frame.add(candidatename);
                     me002frame.add(candidateid);
                     me002frame.add(candidatemarks1);
                     me002frame.add(candidatemarks2);
                     me002frame.add(candidatemarks3);
                     me002frame.add(candidateresult);
                     me002frame.add(candidategrade);
                     me002frame.add(space1);
                     candidategradelabel.setBounds(20,110,500,20);
                     candidatenamelabel.setBounds(20,10,150,20);
                     candidateidlabel.setBounds(20,30,100,20);
                     candidatemarks1label.setBounds(20,50,150,20);
                     candidatemarks2label.setBounds(20,70,150,20);
                     candidatemarks3label.setBounds(20,90,150,20);
                     candidateresultlabel.setBounds(20,130,150,20);
                     candidatename.setBounds(130,10,250,20);
                     candidateid.setBounds(130,30,150,20);
                     candidategrade.setBounds(130,110,150,20);
                     candidatemarks1.setBounds(130,50,150,20);
                     candidatemarks2.setBounds(130,70,150,20);
                     candidatemarks3.setBounds(130,90,150,20);
                     candidateresult.setBounds(130,130,150,20);
                     me002frame.setVisible(true);
                }
            private void ch003btActionPerformed(ActionEvent evt) 
                   {
                     JLabel candidatenamelabel=new JLabel("Candidate name: ");
                     JLabel candidateidlabel=new JLabel("Candidate id: ");
                     JLabel candidatemarks1label=new JLabel("Candidate Marks 1: ");
                     JLabel candidatemarks2label=new JLabel("Candidate Marks 2: ");
                     JLabel candidatemarks3label=new JLabel("Candidate Marks 3: ");
                     JLabel candidategradelabel=new JLabel("Grade: ");
                     JLabel candidateresultlabel=new JLabel("Result: ");
                     JLabel space=new JLabel(" ");
                     JLabel candidatename=new JLabel(); 
                     JLabel candidateid=new JLabel();
                     JLabel candidatemarks1=new JLabel();
                     JLabel candidatemarks2=new JLabel();
                     JLabel candidatemarks3=new JLabel();
                     JLabel candidategrade=new JLabel();
                     JLabel candidateresult=new JLabel();
                     JLabel space1=new JLabel(" ");
                     candidatename.setText(a3.getName());
                     candidateid.setText(a3.getid());
                     candidatemarks1.setText(String.valueOf(a3.getM1()));
                     candidatemarks2.setText(String.valueOf(a3.getM2()));
                     candidatemarks3.setText(String.valueOf(a3.getM3()));
                     candidategrade.setText(a3.getGrade());
                     candidateresult.setText(a3.getResult());
                     ch003frame.add(candidatenamelabel);
                     ch003frame.add(candidateidlabel);
                     ch003frame.add(candidatemarks1label);
                     ch003frame.add(candidatemarks2label);
                     ch003frame.add(candidatemarks3label);
                     ch003frame.add(candidateresultlabel);
                     ch003frame.add(candidategradelabel);
                     ch003frame.add(closebt);
                     ch003frame.add(space);
                     ch003frame.add(candidatename);
                     ch003frame.add(candidateid);
                     ch003frame.add(candidatemarks1);
                     ch003frame.add(candidatemarks2);
                     ch003frame.add(candidatemarks3);
                     ch003frame.add(candidateresult);
                     ch003frame.add(candidategrade);
                     ch003frame.add(space1);
                     candidategradelabel.setBounds(20,110,500,20);
                     candidatenamelabel.setBounds(20,10,150,20);
                     candidateidlabel.setBounds(20,30,100,20);
                     candidatemarks1label.setBounds(20,50,150,20);
                     candidatemarks2label.setBounds(20,70,150,20);
                     candidatemarks3label.setBounds(20,90,150,20);
                     candidateresultlabel.setBounds(20,130,150,20);
                     candidatename.setBounds(130,10,250,20);
                     candidateid.setBounds(130,30,150,20);
                     candidategrade.setBounds(130,110,150,20);
                     candidatemarks1.setBounds(130,50,150,20);
                     candidatemarks2.setBounds(130,70,150,20);
                     candidatemarks3.setBounds(130,90,150,20);
                     candidateresult.setBounds(130,130,150,20);
                     ch003frame.setVisible(true);
                }
		private void ram004btActionPerformed(ActionEvent evt) 
                   {
                     JLabel candidatenamelabel=new JLabel("Candidate name: ");
                     JLabel candidateidlabel=new JLabel("Candidate id:");
                     JLabel candidatemarks1label=new JLabel("Candidate Marks 1: ");
                     JLabel candidatemarks2label=new JLabel("Candidate Marks 2: ");
                     JLabel candidatemarks3label=new JLabel("Candidate Marks 3: ");
                     JLabel candidategradelabel=new JLabel("Grade: ");
                     JLabel candidateresultlabel=new JLabel("Result: ");
                     JLabel space=new JLabel(" ");
                     JLabel candidatename=new JLabel(); 
                     JLabel candidateid=new JLabel();
                     JLabel candidatemarks1=new JLabel();
                     JLabel candidatemarks2=new JLabel();
                     JLabel candidatemarks3=new JLabel();
                     JLabel candidategrade=new JLabel();
                     JLabel candidateresult=new JLabel();
                     JLabel space1=new JLabel(" ");
                     candidatename.setText(a4.getName());
                     candidateid.setText(a4.getid());
                     candidatemarks1.setText(String.valueOf(a4.getM1()));
                     candidatemarks2.setText(String.valueOf(a4.getM2()));
                     candidatemarks3.setText(String.valueOf(a4.getM3()));
                     candidategrade.setText(a4.getGrade());
                     candidateresult.setText(a4.getResult());
                     ram004frame.add(candidatenamelabel);
                     ram004frame.add(candidateidlabel);
                     ram004frame.add(candidatemarks1label);
                     ram004frame.add(candidatemarks2label);
                     ram004frame.add(candidatemarks3label);
                     ram004frame.add(candidateresultlabel);
                     ram004frame.add(candidategradelabel);
                     ram004frame.add(closebt);
                     ram004frame.add(space);
                     ram004frame.add(candidatename);
                     ram004frame.add(candidateid);
                     ram004frame.add(candidatemarks1);
                     ram004frame.add(candidatemarks2);
                     ram004frame.add(candidatemarks3);
                     ram004frame.add(candidateresult);
                     ram004frame.add(candidategrade);
                     ram004frame.add(space1);
                     candidategradelabel.setBounds(20,110,500,20);
                     candidatenamelabel.setBounds(20,10,150,20);
                     candidateidlabel.setBounds(20,30,100,20);
                     candidatemarks1label.setBounds(20,50,150,20);
                     candidatemarks2label.setBounds(20,70,150,20);
                     candidatemarks3label.setBounds(20,90,150,20);
                     candidateresultlabel.setBounds(20,130,150,20);
                     candidatename.setBounds(130,10,250,20);
                     candidateid.setBounds(130,30,150,20);
                     candidategrade.setBounds(130,110,150,20);
                     candidatemarks1.setBounds(130,50,150,20);
                     candidatemarks2.setBounds(130,70,150,20);
                     candidatemarks3.setBounds(130,90,150,20);
                     candidateresult.setBounds(130,130,150,20);
                     ram004frame.setVisible(true);
                }
		private void sh005btActionPerformed(ActionEvent evt) 
                   {
                     JLabel candidatenamelabel=new JLabel("Candidate name:  ");
                     JLabel candidateidlabel=new JLabel("Candidate id: ");
                     JLabel candidatemarks1label=new JLabel("Candidate Marks 1: ");
                     JLabel candidatemarks2label=new JLabel("Candidate Marks 2: ");
                     JLabel candidatemarks3label=new JLabel("Candidate Marks 3: ");
                     JLabel candidategradelabel=new JLabel("Grade:  ");
                     JLabel candidateresultlabel=new JLabel("Result: ");
                     JLabel space=new JLabel(" ");
                     JLabel candidatename=new JLabel(); 
                     JLabel candidateid=new JLabel();
                     JLabel candidatemarks1=new JLabel();
                     JLabel candidatemarks2=new JLabel();
                     JLabel candidatemarks3=new JLabel();
                     JLabel candidategrade=new JLabel();
                     JLabel candidateresult=new JLabel();
                     JLabel space1=new JLabel(" ");
                     candidatename.setText(a5.getName());
                     candidateid.setText(a5.getid());
                     candidatemarks1.setText(String.valueOf(a5.getM1()));
                     candidatemarks2.setText(String.valueOf(a5.getM2()));
                     candidatemarks3.setText(String.valueOf(a5.getM3()));
                     candidategrade.setText(a5.getGrade());
                     candidateresult.setText(a5.getResult());
                     sh005frame.add(candidatenamelabel);
                     sh005frame.add(candidateidlabel);
                     sh005frame.add(candidatemarks1label);
                     sh005frame.add(candidatemarks2label);
                     sh005frame.add(candidatemarks3label);
                     sh005frame.add(candidateresultlabel);
                     sh005frame.add(candidategradelabel);
                     sh005frame.add(closebt);
                     sh005frame.add(space);
                     sh005frame.add(candidatename);
                     sh005frame.add(candidateid);
                     sh005frame.add(candidatemarks1);
                     sh005frame.add(candidatemarks2);
                     sh005frame.add(candidatemarks3);
                     sh005frame.add(candidateresult);
                     sh005frame.add(candidategrade);
                     sh005frame.add(space1);
                     candidategradelabel.setBounds(20,110,500,20);
                     candidatenamelabel.setBounds(20,10,150,20);
                     candidateidlabel.setBounds(20,30,100,20);
                     candidatemarks1label.setBounds(20,50,150,20);
                     candidatemarks2label.setBounds(20,70,150,20);
                     candidatemarks3label.setBounds(20,90,150,20);
                     candidateresultlabel.setBounds(20,130,150,20);
                     candidatename.setBounds(130,10,250,20);
                     candidateid.setBounds(130,30,150,20);
                     candidategrade.setBounds(130,110,150,20);
                     candidatemarks1.setBounds(130,50,150,20);
                     candidatemarks2.setBounds(130,70,150,20);
                     candidatemarks3.setBounds(130,90,150,20);
                     candidateresult.setBounds(130,130,150,20);
                     sh005frame.setVisible(true);
                }
                private void exitbtActionPerformed(ActionEvent evt)
                {
                   System.exit(0);
                }
                private void exitbt2ActionPerformed(ActionEvent evt)
                {
                   System.exit(0);
                }
                private void closebtActionPerformed(ActionEvent evt)
                {
                    ma001frame.dispose();
                    me002frame.dispose();
                    ch003frame.dispose();
                    ram004frame.dispose();
                    sh005frame.dispose();
                }
                private void detailsbtActionPerformed(ActionEvent evt) 
                   {
                     JLabel candidatenamelabel=new JLabel("Candidate name: "); 
                     JLabel candidateidlabel=new JLabel("Candidate id: ");
                     JLabel candidatemarks1label=new JLabel("Candidate Marks 1: ");
                     JLabel candidatemarks2label=new JLabel("Candidate Marks 2: ");
                     JLabel candidatemarks3label=new JLabel("Candidate Marks 3: ");
                     JLabel candidategradelabel=new JLabel("Grade: ");
                     JLabel candidateresultlabel=new JLabel("Result: ");
                     JLabel space=new JLabel(" ");
                     JLabel candidatename=new JLabel(); 
                     JLabel candidateid=new JLabel();
                     JLabel candidatemarks1=new JLabel();
                     JLabel candidatemarks2=new JLabel();
                     JLabel candidatemarks3=new JLabel();
                     JLabel candidategrade=new JLabel();
                     JLabel candidateresult=new JLabel();
                     JLabel space1=new JLabel(" ");
                     candidatename.setText(a1.getName());
                     candidateid.setText(a1.getid());
                     candidatemarks1.setText(String.valueOf(a1.getM1()));
                     candidatemarks2.setText(String.valueOf(a1.getM2()));
                     candidatemarks3.setText(String.valueOf(a1.getM3()));
                     candidategrade.setText(a1.getGrade());
                     candidateresult.setText(a1.getResult());
                     ma001frame.add(candidatenamelabel);
                     ma001frame.add(candidateidlabel);
                     ma001frame.add(candidatemarks1label);
                     ma001frame.add(candidatemarks2label);
                     ma001frame.add(candidatemarks3label);
                     ma001frame.add(candidateresultlabel);
                     ma001frame.add(candidategradelabel);
                     ma001frame.add(closebt);
                     ma001frame.add(space);
                     ma001frame.add(candidatename);
                     ma001frame.add(candidateid);
                     ma001frame.add(candidatemarks1);
                     ma001frame.add(candidatemarks2);
                     ma001frame.add(candidatemarks3);
                     ma001frame.add(candidateresult);
                     ma001frame.add(candidategrade);
                     ma001frame.add(space1);
                     candidategradelabel.setBounds(20,110,50,20);
                     candidatenamelabel.setBounds(20,10,150,20);
                     candidateidlabel.setBounds(20,30,100,20);
                     candidatemarks1label.setBounds(20,50,150,20);
                     candidatemarks2label.setBounds(20,70,150,20);
                     candidatemarks3label.setBounds(20,90,150,20);
                     candidateresultlabel.setBounds(20,130,150,20);
                     candidatename.setBounds(130,10,50,20);
                     candidateid.setBounds(130,30,150,20);
                     candidategrade.setBounds(130,110,150,20);
                     candidatemarks1.setBounds(130,50,150,20);
                     candidatemarks2.setBounds(130,70,150,20);
                     candidatemarks3.setBounds(130,90,150,20);
                     candidateresult.setBounds(130,130,150,20);
                     ma001frame.setVisible(true);
                }   
                private void detailsbt1ActionPerformed(ActionEvent evt) 
                   {
                     JLabel candidatenamelabel=new JLabel("Candidate name:");
                     JLabel candidateidlabel=new JLabel("Candidate id:");
                     JLabel candidatemarks1label=new JLabel("Candidate Marks 1: ");
                     JLabel candidatemarks2label=new JLabel("Candidate Marks 2: ");
                     JLabel candidatemarks3label=new JLabel("Candidate Marks 3: ");
                     JLabel candidategradelabel=new JLabel("Grade:");
                     JLabel candidateresultlabel=new JLabel("Result:");
                     JLabel space=new JLabel(" ");
                     JLabel candidatename=new JLabel(); 
                     JLabel candidateid=new JLabel();
                     JLabel candidatemarks1=new JLabel();
                     JLabel candidatemarks2=new JLabel();
                     JLabel candidatemarks3=new JLabel();
                     JLabel candidategrade=new JLabel();
                     JLabel candidateresult=new JLabel();
                     JLabel space1=new JLabel(" ");
                     candidatename.setText(a2.getName());
                     candidateid.setText(a2.getid());
                     candidatemarks1.setText(String.valueOf(a2.getM1()));
                     candidatemarks2.setText(String.valueOf(a2.getM2()));
                     candidatemarks3.setText(String.valueOf(a2.getM3()));
                     candidategrade.setText(a2.getGrade());
                     candidateresult.setText(a2.getResult());
                     me002frame.add(candidatenamelabel);
                     me002frame.add(candidateidlabel);
                     me002frame.add(candidatemarks1label);
                     me002frame.add(candidatemarks2label);
                     me002frame.add(candidatemarks3label);
                     me002frame.add(candidateresultlabel);
                     me002frame.add(candidategradelabel);
                     me002frame.add(closebt);
                     me002frame.add(space);
                     me002frame.add(candidatename);
                     me002frame.add(candidateid);
                     me002frame.add(candidatemarks1);
                     me002frame.add(candidatemarks2);
                     me002frame.add(candidatemarks3);
                     me002frame.add(candidateresult);
                     me002frame.add(candidategrade);
                     me002frame.add(space1);
                     candidategradelabel.setBounds(20,110,500,20);
                     candidatenamelabel.setBounds(20,10,150,20);
                     candidateidlabel.setBounds(20,30,100,20);
                     candidatemarks1label.setBounds(20,50,150,20);
                     candidatemarks2label.setBounds(20,70,150,20);
                     candidatemarks3label.setBounds(20,90,150,20);
                     candidateresultlabel.setBounds(20,130,150,20);
                     candidatename.setBounds(130,10,250,20);
                     candidateid.setBounds(130,30,150,20);
                     candidategrade.setBounds(130,110,150,20);
                     candidatemarks1.setBounds(130,50,150,20);
                     candidatemarks2.setBounds(130,70,150,20);
                     candidatemarks3.setBounds(130,90,150,20);
                     candidateresult.setBounds(130,130,150,20);
                     me002frame.setVisible(true);
                }
            private void detailsbt2ActionPerformed(ActionEvent evt) 
                   {
                     JLabel candidatenamelabel=new JLabel("Candidate name: ");
                     JLabel candidateidlabel=new JLabel("Candidate id: ");
                     JLabel candidatemarks1label=new JLabel("Candidate Marks 1: ");
                     JLabel candidatemarks2label=new JLabel("Candidate Marks 2: ");
                     JLabel candidatemarks3label=new JLabel("Candidate Marks 3: ");
                     JLabel candidategradelabel=new JLabel("Grade: ");
                     JLabel candidateresultlabel=new JLabel("Result: ");
                     JLabel space=new JLabel(" ");
                     JLabel candidatename=new JLabel(); 
                     JLabel candidateid=new JLabel();
                     JLabel candidatemarks1=new JLabel();
                     JLabel candidatemarks2=new JLabel();
                     JLabel candidatemarks3=new JLabel();
                     JLabel candidategrade=new JLabel();
                     JLabel candidateresult=new JLabel();
                     JLabel space1=new JLabel(" ");
                     candidatename.setText(a3.getName());
                     candidateid.setText(a3.getid());
                     candidatemarks1.setText(String.valueOf(a3.getM1()));
                     candidatemarks2.setText(String.valueOf(a3.getM2()));
                     candidatemarks3.setText(String.valueOf(a3.getM3()));
                     candidategrade.setText(a3.getGrade());
                     candidateresult.setText(a3.getResult());
                     ch003frame.add(candidatenamelabel);
                     ch003frame.add(candidateidlabel);
                     ch003frame.add(candidatemarks1label);
                     ch003frame.add(candidatemarks2label);
                     ch003frame.add(candidatemarks3label);
                     ch003frame.add(candidateresultlabel);
                     ch003frame.add(candidategradelabel);
                     ch003frame.add(closebt);
                     ch003frame.add(space);
                     ch003frame.add(candidatename);
                     ch003frame.add(candidateid);
                     ch003frame.add(candidatemarks1);
                     ch003frame.add(candidatemarks2);
                     ch003frame.add(candidatemarks3);
                     ch003frame.add(candidateresult);
                     ch003frame.add(candidategrade);
                     ch003frame.add(space1);
                     candidategradelabel.setBounds(20,110,500,20);
                     candidatenamelabel.setBounds(20,10,150,20);
                     candidateidlabel.setBounds(20,30,100,20);
                     candidatemarks1label.setBounds(20,50,150,20);
                     candidatemarks2label.setBounds(20,70,150,20);
                     candidatemarks3label.setBounds(20,90,150,20);
                     candidateresultlabel.setBounds(20,130,150,20);
                     candidatename.setBounds(130,10,250,20);
                     candidateid.setBounds(130,30,150,20);
                     candidategrade.setBounds(130,110,150,20);
                     candidatemarks1.setBounds(130,50,150,20);
                     candidatemarks2.setBounds(130,70,150,20);
                     candidatemarks3.setBounds(130,90,150,20);
                     candidateresult.setBounds(130,130,150,20);
                     ch003frame.setVisible(true);
                }
		private void detailsbt3ActionPerformed(ActionEvent evt) 
                   {
                     JLabel candidatenamelabel=new JLabel("Candidate name: ");
                     JLabel candidateidlabel=new JLabel("Candidate id:");
                     JLabel candidatemarks1label=new JLabel("Candidate Marks 1: ");
                     JLabel candidatemarks2label=new JLabel("Candidate Marks 2: ");
                     JLabel candidatemarks3label=new JLabel("Candidate Marks 3: ");
                     JLabel candidategradelabel=new JLabel("Grade: ");
                     JLabel candidateresultlabel=new JLabel("Result: ");
                     JLabel space=new JLabel(" ");
                     JLabel candidatename=new JLabel(); 
                     JLabel candidateid=new JLabel();
                     JLabel candidatemarks1=new JLabel();
                     JLabel candidatemarks2=new JLabel();
                     JLabel candidatemarks3=new JLabel();
                     JLabel candidategrade=new JLabel();
                     JLabel candidateresult=new JLabel();
                     JLabel space1=new JLabel(" ");
                     candidatename.setText(a4.getName());
                     candidateid.setText(a4.getid());
                     candidatemarks1.setText(String.valueOf(a4.getM1()));
                     candidatemarks2.setText(String.valueOf(a4.getM2()));
                     candidatemarks3.setText(String.valueOf(a4.getM3()));
                     candidategrade.setText(a4.getGrade());
                     candidateresult.setText(a4.getResult());
                     ram004frame.add(candidatenamelabel);
                     ram004frame.add(candidateidlabel);
                     ram004frame.add(candidatemarks1label);
                     ram004frame.add(candidatemarks2label);
                     ram004frame.add(candidatemarks3label);
                     ram004frame.add(candidateresultlabel);
                     ram004frame.add(candidategradelabel);
                     ram004frame.add(closebt);
                     ram004frame.add(space);
                     ram004frame.add(candidatename);
                     ram004frame.add(candidateid);
                     ram004frame.add(candidatemarks1);
                     ram004frame.add(candidatemarks2);
                     ram004frame.add(candidatemarks3);
                     ram004frame.add(candidateresult);
                     ram004frame.add(candidategrade);
                     ram004frame.add(space1);
                     candidategradelabel.setBounds(20,110,500,20);
                     candidatenamelabel.setBounds(20,10,150,20);
                     candidateidlabel.setBounds(20,30,100,20);
                     candidatemarks1label.setBounds(20,50,150,20);
                     candidatemarks2label.setBounds(20,70,150,20);
                     candidatemarks3label.setBounds(20,90,150,20);
                     candidateresultlabel.setBounds(20,130,150,20);
                     candidatename.setBounds(130,10,250,20);
                     candidateid.setBounds(130,30,150,20);
                     candidategrade.setBounds(130,110,150,20);
                     candidatemarks1.setBounds(130,50,150,20);
                     candidatemarks2.setBounds(130,70,150,20);
                     candidatemarks3.setBounds(130,90,150,20);
                     candidateresult.setBounds(130,130,150,20);
                     ram004frame.setVisible(true);
                }
		private void detailsbt4ActionPerformed(ActionEvent evt) 
                   {
                     JLabel candidatenamelabel=new JLabel("Candidate name:  ");
                     JLabel candidateidlabel=new JLabel("Candidate id: ");
                     JLabel candidatemarks1label=new JLabel("Candidate Marks 1: ");
                     JLabel candidatemarks2label=new JLabel("Candidate Marks 2: ");
                     JLabel candidatemarks3label=new JLabel("Candidate Marks 3: ");
                     JLabel candidategradelabel=new JLabel("Grade:  ");
                     JLabel candidateresultlabel=new JLabel("Result: ");
                     JLabel space=new JLabel(" ");
                     JLabel candidatename=new JLabel(); 
                     JLabel candidateid=new JLabel();
                     JLabel candidatemarks1=new JLabel();
                     JLabel candidatemarks2=new JLabel();
                     JLabel candidatemarks3=new JLabel();
                     JLabel candidategrade=new JLabel();
                     JLabel candidateresult=new JLabel();
                     JLabel space1=new JLabel(" ");
                     candidatename.setText(a5.getName());
                     candidateid.setText(a5.getid());
                     candidatemarks1.setText(String.valueOf(a5.getM1()));
                     candidatemarks2.setText(String.valueOf(a5.getM2()));
                     candidatemarks3.setText(String.valueOf(a5.getM3()));
                     candidategrade.setText(a5.getGrade());
                     candidateresult.setText(a5.getResult());
                     sh005frame.add(candidatenamelabel);
                     sh005frame.add(candidateidlabel);
                     sh005frame.add(candidatemarks1label);
                     sh005frame.add(candidatemarks2label);
                     sh005frame.add(candidatemarks3label);
                     sh005frame.add(candidateresultlabel);
                     sh005frame.add(candidategradelabel);
                     sh005frame.add(closebt);
                     sh005frame.add(space);
                     sh005frame.add(candidatename);
                     sh005frame.add(candidateid);
                     sh005frame.add(candidatemarks1);
                     sh005frame.add(candidatemarks2);
                     sh005frame.add(candidatemarks3);
                     sh005frame.add(candidateresult);
                     sh005frame.add(candidategrade);
                     sh005frame.add(space1);
                     candidategradelabel.setBounds(20,110,500,20);
                     candidatenamelabel.setBounds(20,10,150,20);
                     candidateidlabel.setBounds(20,30,100,20);
                     candidatemarks1label.setBounds(20,50,150,20);
                     candidatemarks2label.setBounds(20,70,150,20);
                     candidatemarks3label.setBounds(20,90,150,20);
                     candidateresultlabel.setBounds(20,130,150,20);
                     candidatename.setBounds(130,10,250,20);
                     candidateid.setBounds(130,30,150,20);
                     candidategrade.setBounds(130,110,150,20);
                     candidatemarks1.setBounds(130,50,150,20);
                     candidatemarks2.setBounds(130,70,150,20);
                     candidatemarks3.setBounds(130,90,150,20);
                     candidateresult.setBounds(130,130,150,20);
                     sh005frame.setVisible(true);
                }

}

   
             
