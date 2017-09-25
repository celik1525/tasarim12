/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ruhi ÇELİK
 */
public class EklemeSihirbaz extends JFrame implements ActionListener{

    public CardLayout card=new CardLayout();
    public JPanel container=new JPanel();
    public JPanel p1=new JPanel();
    public JPanel p2=new JPanel();
    public JPanel p3=new JPanel();
    public JPanel p4=new JPanel();
    public JPanel p5=new JPanel();
    
    public JButton bt[]=new JButton[5];
    public String[] text={
        "PANEL1",
        "PANEL2",
        "PANEL3",
        "PANEL4",
        "PANEL5",
    };
    public EklemeSihirbaz(){
        container.setLayout(card);
        p1.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);
        p4.setLayout(null);
        p5.setLayout(null);
    for(int i=0;i<bt.length;i++){
        bt[i]=new JButton(" "+text[i]);
        bt[i].setBounds(100,150,100,40);
        bt[i].addActionListener(this);
    }
    p1.add(bt[0]);
    p2.add(bt[1]);
    p3.add(bt[2]);
    p4.add(bt[3]);
    p5.add(bt[4]);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.add(p1,"2");
        container.add(p2,"3");
        container.add(p3,"4");
        container.add(p4,"5");
        container.add(p5,"6");
    card.show(container, "1");
    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==bt[0]){
        card.show(container,""+3);
    }    
    if(e.getSource()==bt[1]){
        card.show(container,""+4);
    }    
    if(e.getSource()==bt[2]){
        card.show(container,""+5);
    }    
    if(e.getSource()==bt[3]){
        card.show(container,""+6);
    }    
    if(e.getSource()==bt[4]){
        card.show(container,""+2);
    }    
    }
    
}
