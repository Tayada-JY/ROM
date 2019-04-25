import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.FileChooserUI;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.EventQueue;
public class Manu extends JFrame {
    public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
    public void run() {
    Manu form = new Manu();
    form.setVisible(true);
    }
    });
    }
    public Manu() {
    super("Ragnarok");
    setSize(800, 600);
    setLocation(500, 280);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);
    Container a = getContentPane();
    a.setLayout(new BorderLayout(10,7));
    JLabel logo = new JLabel(new ImageIcon("logo2-2.png"));
           logo.setBorder(BorderFactory.createEmptyBorder(14, 0, 50, 18)); 
    JLabel image1 = new JLabel(new ImageIcon("c3.gif"));
           image1.setBorder(BorderFactory.createEmptyBorder(120, 150, 200,120)); 
    JLabel image2 = new JLabel(new ImageIcon("c2.gif"));
           image2.setBorder(BorderFactory.createEmptyBorder(120, 0, 200, 0)); 
    JPanel image = new JPanel();
           image.setLayout(new BoxLayout(image,BoxLayout.X_AXIS));
           image.add(image1);
           image.add(image2);
    JButton btnOpen = new JButton("Male");
    btnOpen.setBounds(171, 95, 100, 23);
    //btnOpen.setBorder(BorderFactory.createEmptyBorder(14, 200, 0, 18)); 
    btnOpen.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    Gui gui = new Gui();
    gui.setVisible(true);
    setVisible(false);
    }
    });
    JButton btnOpen2 = new JButton("Female");
    btnOpen2.setBounds(171, 95, 100, 23);
    //btnOpen2.setBorder(BorderFactory.createEmptyBorder(14, 0, 200, 18));
    btnOpen2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    Gui2 gui2 = new Gui2();
    gui2.setVisible(true);
    setVisible(false);
    }
    });
    JPanel b1 = new JPanel();
           b1.setBorder(BorderFactory.createEmptyBorder(0, 320, 100, 0));
           b1.setLayout(new BoxLayout(b1,BoxLayout.X_AXIS));  
           b1.add(btnOpen);
           b1.add(btnOpen2);
    a.add(logo,BorderLayout.NORTH);
    a.add(image, BorderLayout.CENTER);  
    a.add(b1,BorderLayout.SOUTH);
    
    }  
    }
