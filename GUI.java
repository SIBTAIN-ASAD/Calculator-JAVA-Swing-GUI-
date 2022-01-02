/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author SAM
 */
public class GUI {
    
    JButton bt1;
    JButton bt2;
    JButton bt3;
    JButton bt4;
    JButton bt5;
    JButton bt6;
    JButton bt7;
    JButton bt8;
    JButton bt9;
    JButton bt0;
    
    JButton plus;
    JButton minu;
    JButton mul;
    JButton div;
    JButton equ;
    JButton btc;
    JButton del;    
    JButton dec;
    
    JButton back;

    
    BtnHandler hnd;

    JPanel pan;
    JFrame fr;
    JTextField jtf;
    JTextField jtf2;

    public GUI()
    {
        initGUI();
    }
    public void initGUI()
    {
        fr = new JFrame("SAM CALCULATOR");
        
        pan = new JPanel();
        pan.setBounds(50, 160, 300, 300);
        pan.setLayout(new GridLayout(4,4,10,10));
        
        jtf = new JTextField(30);
        jtf2 = new JTextField(80);
        
        
        jtf.setBounds(50, 40, 300, 40);
        jtf2.setBounds(50, 90, 100,30);
        
        jtf2.setText("History: 0");
        jtf2.setBackground(Color.LIGHT_GRAY);

        
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        bt0 = new JButton("0");
        plus = new JButton("+");
        minu = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        btc = new JButton("C");
        dec = new JButton(".");
        equ = new JButton("=");
        back = new JButton("<-");
        del = new JButton("Clear");  
        del.setBackground(Color.CYAN);
        back.setBackground(Color.gray);
        
        equ.setBackground(Color.orange);
        
        
    fr.add(jtf);
    fr.add(jtf2);    

    fr.add(del);
    fr.add(back);
    fr.add(pan);
    
    pan.add(bt1);
    pan.add(bt2);
    pan.add(bt3);
    pan.add(plus);

    pan.add(bt4);
    pan.add(bt5);
    pan.add(bt6);
    pan.add(minu);

    pan.add(bt7);
    pan.add(bt8);
    pan.add(bt9);
    pan.add(div);

    pan.add(bt0);
    pan.add(dec);
    pan.add(mul);
    pan.add(equ);
        
    

    del.setBounds(250, 100, 100, 50);
    back.setBounds(190, 100, 50, 50);

    fr.setSize(420,550);
    fr.setLayout(null);
    
    hnd = new BtnHandler(this);
    
    bt1.addActionListener(hnd);
    bt2.addActionListener(hnd);
    bt3.addActionListener(hnd);
    bt4.addActionListener(hnd);
    bt5.addActionListener(hnd);
    bt6.addActionListener(hnd);
    bt7.addActionListener(hnd);
    bt8.addActionListener(hnd);
    bt9.addActionListener(hnd);
    bt0.addActionListener(hnd);

    plus.addActionListener(hnd);
    minu.addActionListener(hnd);
    mul.addActionListener(hnd);
    div.addActionListener(hnd);
    
    btc.addActionListener(hnd);
    equ.addActionListener(hnd);
    dec.addActionListener(hnd);
    del.addActionListener(hnd);
    back.addActionListener(hnd);
    
       
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    fr.setLocationRelativeTo(null);
    }
}
