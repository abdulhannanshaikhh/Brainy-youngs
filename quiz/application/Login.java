package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton start;
    String name;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 500, 500);
        add(image);
        
        JLabel heading = new JLabel("Brainy youngs");
        heading.setBounds(600, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(250, 0,50));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(670, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(250, 0,50));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(600, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        start = new JButton("Rules");
        start.setBounds(700, 270, 120, 25);
        start.setBackground(new Color(250, 0,50));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(1000, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
    }}
    
    public static void main(String[] args) {
        new Login();
    }
}