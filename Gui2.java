import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.FileChooserUI;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Gui2 extends JFrame
{   
    public static void main(/*String[] args*/) {
        EventQueue.invokeLater(new Runnable() {
        public void run() {
        Gui2 gui2 = new Gui2();
        gui2.setVisible(true);
        }
        });
        }
    
    int career1 = 0; 
    Bag bag = new Bag();
    Novice novice = new Novice();
    Mandragora mandragora = new Mandragora();
    Marozka marozka = new Marozka();
    Menblatt menblatt = new Menblatt();
    Tikbalang tikbalang = new Tikbalang();
    Frame frame = new Frame();
    Random random = new Random();

    public Gui2()
    {
        
        super("Ragnarok");
        setSize(450, 300);
        setLocation(500, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        Container c = getContentPane();
        c.setLayout(new BorderLayout(10,7));
        JPanel p3 = new JPanel();
           p3.setBorder(BorderFactory.createEmptyBorder(14, 150, 0, 18));
           p3.setLayout(new GridLayout(1,2,5,5));
           JLabel career = new JLabel("CAREER : "+novice.getName());
           career.setForeground(Color.PINK);
           JLabel kill = new JLabel("KILL : "+novice.getKill());
           kill.setForeground(Color.RED);
           p3.add(career);
           p3.add(kill);
           c.add(p3, BorderLayout.NORTH);
        JPanel p4 = new JPanel();
           p4.setBorder(BorderFactory.createEmptyBorder(14, 30, 0, 18));
           p4.setLayout(new GridLayout(4,2));
           JLabel mons1 = new JLabel(new ImageIcon("mons1.gif"));
           JLabel name1 = new JLabel("NAME : "+mandragora.getName());
           JLabel hp1 = new JLabel("HP : 20");
           JLabel upexp1 = new JLabel("EXP : + 5");
           JLabel amount1 = new JLabel("AMOUNT : "+mandragora.Amountmons());
            JPanel data1 = new JPanel();
            data1.setLayout(new BoxLayout(data1,BoxLayout.Y_AXIS));
            data1.add(name1);
            data1.add(hp1);
            data1.add(upexp1);
            data1.add(amount1);
           JLabel mons2 = new JLabel(new ImageIcon("mons2.gif"));
           JLabel name2 = new JLabel("NAME : "+menblatt.getName());
           JLabel hp2 = new JLabel("HP : 100");
           JLabel upexp2 = new JLabel("EXP : + 15");
           JLabel amount2 = new JLabel("AMOUNT : "+menblatt.Amountmons());
            JPanel data2 = new JPanel();
            data2.setLayout(new BoxLayout(data2,BoxLayout.Y_AXIS));
            data2.add(name2);
            data2.add(hp2);
            data2.add(upexp2);
            data2.add(amount2);
           JLabel mons3 = new JLabel(new ImageIcon("mons33.gif"));
           JLabel name3 = new JLabel("NAME : "+tikbalang.getName()); 
           JLabel hp3 = new JLabel("HP : 500");
            JLabel upexp3 = new JLabel("EXP : + 50");
            JLabel amount3 = new JLabel("AMOUNT : "+tikbalang.Amountmons());
             JPanel data3 = new JPanel();
             data3.setLayout(new BoxLayout(data3,BoxLayout.Y_AXIS));
             data3.add(name3);
             data3.add(hp3);
             data3.add(upexp3);
             data3.add(amount3);
            JLabel mons4 = new JLabel(new ImageIcon("mons4.gif"));
            JLabel name4 = new JLabel("NAME : "+marozka.getName());
            JLabel hp4 = new JLabel("HP : 1000");
             JLabel upexp4 = new JLabel("EXP : + 100");
             JLabel amount4 = new JLabel("AMOUNT : "+marozka.Amountmons());
              JPanel data4 = new JPanel();
              data4.setLayout(new BoxLayout(data4,BoxLayout.Y_AXIS));
              data4.add(name4);
              data4.add(hp4);
              data4.add(upexp4);
              data4.add(amount4);
           p4.add(mons1);
           p4.add(data1);
           p4.add(mons2);
           p4.add(data2);
           p4.add(mons3);
           p4.add(data3);
           p4.add(mons4);
           p4.add(data4);
        c.add(p4, BorderLayout.WEST);
        JPanel p2 = new JPanel();
           p2.setBorder(BorderFactory.createEmptyBorder(14, 150, 14, 18));
           p2.setLayout(new BoxLayout(p2,BoxLayout.X_AXIS));
           JButton Acttact = new JButton("ATTACT");
           JButton Dead = new JButton("DEAD");
           JButton Hppotion = new JButton("HPPOTION");
           JButton Energypotion = new JButton("ENERGYPOTION");
           JButton setname = new JButton("NAME");
           p2.add(Acttact);
           p2.add(Dead);
           p2.add(Hppotion);
           p2.add(Energypotion);
           p2.add(setname);
           c.add(p2, BorderLayout.SOUTH);
        JLabel image = new JLabel(new ImageIcon("c2.gif"));
           image.setBorder(BorderFactory.createEmptyBorder(14, 0, 50, 18));
        c.add(image, BorderLayout.CENTER);
        JPanel p1 = new JPanel();
           p1.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 100)); 
           p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
           JLabel name = new JLabel("");
           name.setForeground(Color.ORANGE);
           JLabel phh = new JLabel(new ImageIcon("w1.jpg"));
           JLabel level = new JLabel("LEVEL : "+novice.getLevel());
           level.setForeground(Color.BLUE);
           JLabel hp = new JLabel("HP : "+novice.getHp());
           JLabel exp = new JLabel("EXP : "+novice.getExp());
           JLabel energy = new JLabel("ENERGY : "+novice.getEnergy());
           JLabel imhpotion = new JLabel(new ImageIcon("hp3.png"));
           JLabel hpotion = new JLabel(" x "+bag.Numberhppotion());
           JLabel imepotion = new JLabel(new ImageIcon("exp2.png"));
           JLabel epotion = new JLabel(" x "+bag.Numberenergypotion());
           JPanel php = new JPanel();
           php.setLayout(new BoxLayout(php,BoxLayout.X_AXIS));
           php.add(imhpotion);
           php.add(hpotion);
           JPanel pexp = new JPanel();
           pexp.setLayout(new BoxLayout(pexp,BoxLayout.X_AXIS));
           pexp.add(imepotion);
           pexp.add(epotion);
           p1.add(name);
           p1.add(phh);
           p1.add(level);
           p1.add(Box.createRigidArea(new Dimension(35,35)));
           p1.add(hp);
           p1.add(Box.createRigidArea(new Dimension(30,30)));
           p1.add(exp);
           p1.add(Box.createRigidArea(new Dimension(30,30)));
           p1.add(energy);
           p1.add(Box.createRigidArea(new Dimension(30,30)));
           p1.add(php);
           p1.add(Box.createRigidArea(new Dimension(25,25)));
           p1.add(pexp);
        c.add(p1, BorderLayout.EAST);
        
        Acttact.addActionListener(new java.awt.event.ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
                 String[] options = {"Marozka","Tikbalang","Menblatt","Mandragora"};
                 int x = JOptionPane.showOptionDialog(null, "Choose the monster you want to attack","monster",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
                 if(x==3){
                   int num = random.nextInt(2);
                   if(num==0)
                   {
                       bag.increaseHPPotion();
                   }
                   else
                   {
                       bag.increaseENERGYPotion();
                   }
                    novice.losehp(mandragora.getDamage());
                    novice.upexp(mandragora.getUpexp());
                    novice.loseenergy();
                    novice.kill();
                    mandragora.decrease();
                    if(mandragora.Amountmons()<0){
                        JOptionPane.showMessageDialog(null,"Don't have mandragora");
                        setVisible(true);
                    }
                    else{
                        if(novice.getExp() >= 30){
                           int  sum =0; 
                            novice.levelup();
                           sum=novice.getExp()-30;
                           novice.setEXP(sum);
                           exp.setText("EXP : "+novice.getExp());
                           level.setText("LEVEL : "+novice.getLevel());
                           if(novice.getLevel() >=4 && career1 == 0){
                            career1=career1+1;
                            String[] option1 = {"Knight","Wizard"};
                            int n = JOptionPane.showOptionDialog(frame, "Choose Your Career", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, null);
                            if(n == JOptionPane.YES_OPTION){
                                novice.setName("KNIGHT");
                                novice.setEXP(0);
                                novice.setHP((novice.getHp()+500));
                                novice.setENERGY((novice.getEnergy()+100));
                                novice.setLevel(4);
                                image.setIcon(new ImageIcon("c4.gif")); 
                                energy.setText("ENERGY : "+novice.getEnergy());
                                level.setText("LEVEL : "+novice.getLevel());
                                career.setText("CAREER : "+novice.getName());
                                hp.setText("HP : "+novice.getHp());
    
                            }
                            else{
                                novice.setName("WIZARD");
                                novice.setEXP(0);
                                novice.setHP((novice.getHp()+300));
                                novice.setENERGY((novice.getEnergy()+100));
                                novice.setLevel(4);
                                image.setIcon(new ImageIcon("c5.gif")); 
                                energy.setText("ENERGY : "+novice.getEnergy());
                                level.setText("LEVEL : "+novice.getLevel());
                                career.setText("CAREER : "+novice.getName());
                                hp.setText("HP : "+novice.getHp());
                            }
                           
                        }
                    }
                        if(novice.getHp()<=0){
                        JOptionPane.showMessageDialog(null,"YOU Dead");
                        setVisible(false);
                      }
                      else{
                       exp.setText("EXP : "+novice.getExp());
                      hp.setText("HP : "+novice.getHp());
                      energy.setText("ENERGY : "+novice.getEnergy());
                      amount1.setText("AMOUNT : "+mandragora.Amountmons());
                      kill.setText(("KILL : "+novice.getKill()));
                      hpotion.setText(" x "+bag.Numberhppotion());
                      epotion.setText(" x "+bag.Numberenergypotion()); 
                      }
                    }
                      
                    
                   
                 }
                 else if(x==2){
                    int num = random.nextInt(2);
                    if(num==0)
                    {
                        bag.increaseHPPotion();
                    }
                    else
                    {
                        bag.increaseENERGYPotion();
                    }
                     novice.losehp(menblatt.getDamage());
                     novice.upexp(menblatt.getUpexp());
                     novice.loseenergy();
                     novice.kill();
                     menblatt.decrease();
                     if(menblatt.Amountmons()<0){
                         JOptionPane.showMessageDialog(null,"Don't have menblatt");
                         setVisible(true);
                     }
                     else{
                         if(novice.getExp() >= 30){
                            int  sum =0; 
                             novice.levelup();
                            sum=novice.getExp()-30;
                            novice.setEXP(sum);
                            exp.setText("EXP : "+novice.getExp());
                            level.setText("LEVEL : "+novice.getLevel());
                            if(novice.getLevel() >=4 && career1 == 0){
                             career1=career1+1;
                             String[] option1 = {"Knight","Wizard"};
                             int n = JOptionPane.showOptionDialog(frame, "Choose Your Career", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, null);
                             if(n == JOptionPane.YES_OPTION){
                                 novice.setName("KNIGHT");
                                 novice.setEXP(0);
                                 novice.setHP((novice.getHp()+500));
                                 novice.setENERGY((novice.getEnergy()+100));
                                 novice.setLevel(4);
                                 image.setIcon(new ImageIcon("c4.gif")); 
                                 energy.setText("ENERGY : "+novice.getEnergy());
                                 level.setText("LEVEL : "+novice.getLevel());
                                 career.setText("CAREER : "+novice.getName());
                                 hp.setText("HP : "+novice.getHp());
     
                             }
                             else{
                                 novice.setName("WIZARD");
                                 novice.setEXP(0);
                                 novice.setHP((novice.getHp()+300));
                                 novice.setENERGY((novice.getEnergy()+100));
                                 novice.setLevel(4);
                                 image.setIcon(new ImageIcon("c5.gif")); 
                                 energy.setText("ENERGY : "+novice.getEnergy());
                                 level.setText("LEVEL : "+novice.getLevel());
                                 career.setText("CAREER : "+novice.getName());
                                 hp.setText("HP : "+novice.getHp());
                             }
                            
                         }
                     }
                         if(novice.getHp()<=0){
                         JOptionPane.showMessageDialog(null,"YOU Dead");
                         setVisible(false);
                       }
                       else{
                        exp.setText("EXP : "+novice.getExp());
                       hp.setText("HP : "+novice.getHp());
                       energy.setText("ENERGY : "+novice.getEnergy());
                       amount2.setText("AMOUNT : "+menblatt.Amountmons());
                       kill.setText(("KILL : "+novice.getKill()));
                       hpotion.setText(" x "+bag.Numberhppotion());
                       epotion.setText(" x "+bag.Numberenergypotion()); 
                       }
                     }
                  
                 }
                 else if(x==1){
                    int num = random.nextInt(2);
                    if(num==0)
                    {
                        bag.increaseHPPotion();
                    }
                    else
                    {
                        bag.increaseENERGYPotion();
                    }
                     novice.losehp(tikbalang.getDamage());
                     novice.upexp(tikbalang.getUpexp());
                     novice.loseenergy();
                     novice.kill();
                     tikbalang.decrease();
                     if(tikbalang.Amountmons()<0){
                         JOptionPane.showMessageDialog(null,"Don't have tikbalang");
                         setVisible(true);
                     }
                     else{
                         if(novice.getExp() >= 30){
                            int  sum =0; 
                             novice.levelup();
                            sum=novice.getExp()-30;
                            novice.setEXP(sum);
                            exp.setText("EXP : "+novice.getExp());
                            level.setText("LEVEL : "+novice.getLevel());
                            if(novice.getLevel() >=4 && career1 == 0){
                             career1=career1+1;
                             String[] option1 = {"Knight","Wizard"};
                             int n = JOptionPane.showOptionDialog(frame, "Choose Your Career", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, null);
                             if(n == JOptionPane.YES_OPTION){
                                 novice.setName("KNIGHT");
                                 novice.setEXP(0);
                                 novice.setHP((novice.getHp()+500));
                                 novice.setENERGY((novice.getEnergy()+100));
                                 novice.setLevel(4);
                                 image.setIcon(new ImageIcon("c4.gif")); 
                                 energy.setText("ENERGY : "+novice.getEnergy());
                                 level.setText("LEVEL : "+novice.getLevel());
                                 career.setText("CAREER : "+novice.getName());
                                 hp.setText("HP : "+novice.getHp());
     
                             }
                             else{
                                 novice.setName("WIZARD");
                                 novice.setEXP(0);
                                 novice.setHP((novice.getHp()+300));
                                 novice.setENERGY((novice.getEnergy()+100));
                                 novice.setLevel(4);
                                 image.setIcon(new ImageIcon("c5.gif")); 
                                 energy.setText("ENERGY : "+novice.getEnergy());
                                 level.setText("LEVEL : "+novice.getLevel());
                                 career.setText("CAREER : "+novice.getName());
                                 hp.setText("HP : "+novice.getHp());
                             }
                            
                         }
                     }
                         if(novice.getHp()<=0){
                         JOptionPane.showMessageDialog(null,"YOU Dead");
                         setVisible(false);
                       }
                       else{
                        exp.setText("EXP : "+novice.getExp());
                       hp.setText("HP : "+novice.getHp());
                       energy.setText("ENERGY : "+novice.getEnergy());
                       amount3.setText("AMOUNT : "+tikbalang.Amountmons());
                       kill.setText(("KILL : "+novice.getKill()));
                       hpotion.setText(" x "+bag.Numberhppotion());
                       epotion.setText(" x "+bag.Numberenergypotion()); 
                       }
                     }
                    
                    
                 }
                 else if(x==0){
                    int num = random.nextInt(2);
                    if(num==0)
                    {
                        bag.increaseHPPotion();
                    }
                    else
                    {
                        bag.increaseENERGYPotion();
                    }
                     novice.losehp(marozka.getDamage());
                     novice.upexp(marozka.getUpexp());
                     novice.loseenergy();
                     novice.kill();
                     marozka.decrease();
                     if(marozka.Amountmons()<0){
                         JOptionPane.showMessageDialog(null,"Don't have marozka");
                         setVisible(true);
                     }
                     else{
                         if(novice.getExp() >= 30){
                            int  sum =0; 
                             novice.levelup();
                            sum=novice.getExp()-30;
                            novice.setEXP(sum);
                            exp.setText("EXP : "+novice.getExp());
                            level.setText("LEVEL : "+novice.getLevel());
                            if(novice.getLevel() >=4 && career1 == 0){
                             career1=career1+1;
                             String[] option1 = {"Knight","Wizard"};
                             int n = JOptionPane.showOptionDialog(frame, "Choose Your Career", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, null);
                             if(n == JOptionPane.YES_OPTION){
                                 novice.setName("KNIGHT");
                                 novice.setEXP(0);
                                 novice.setHP((novice.getHp()+500));
                                 novice.setENERGY((novice.getEnergy()+100));
                                 novice.setLevel(4);
                                 image.setIcon(new ImageIcon("c4.gif")); 
                                 energy.setText("ENERGY : "+novice.getEnergy());
                                 level.setText("LEVEL : "+novice.getLevel());
                                 career.setText("CAREER : "+novice.getName());
                                 hp.setText("HP : "+novice.getHp());
     
                             }
                             else{
                                 novice.setName("WIZARD");
                                 novice.setEXP(0);
                                 novice.setHP((novice.getHp()+300));
                                 novice.setENERGY((novice.getEnergy()+100));
                                 novice.setLevel(5);
                                 image.setIcon(new ImageIcon("c5.gif")); 
                                 energy.setText("ENERGY : "+novice.getEnergy());
                                 level.setText("LEVEL : "+novice.getLevel());
                                 career.setText("CAREER : "+novice.getName());
                                 hp.setText("HP : "+novice.getHp());
                             }
                            
                         }
                     }
                         if(novice.getHp()<=0){
                         JOptionPane.showMessageDialog(null,"YOU Dead");
                         setVisible(false);
                       }
                       else{
                        exp.setText("EXP : "+novice.getExp());
                       hp.setText("HP : "+novice.getHp());
                       energy.setText("ENERGY : "+novice.getEnergy());
                       amount4.setText("AMOUNT : "+marozka.Amountmons());
                       kill.setText(("KILL : "+novice.getKill()));
                       hpotion.setText(" x "+bag.Numberhppotion());
                       epotion.setText(" x "+bag.Numberenergypotion()); 
                       }
                     }
                    
                 
                }

             }
        });
       /* Power.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                novice.Powerup();
                energy.setText("ENERGY : "+novice.getEnergy());
                hp.setText("HP : "+novice.getHp());
                
             }
        });*/
        Dead.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                novice.Dead();
                energy.setText("ENERGY : "+novice.getEnergy());
                hp.setText("HP : "+novice.getHp());
                exp.setText("EXP : "+novice.getExp());
                JOptionPane.showMessageDialog(null,"YOU Dead");
                        setVisible(false);
                
             }
        });
        Hppotion.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(bag.Numberhppotion()>0)
                {
                bag.decreaseHPPotion();
                novice.usingHPPotion();
                hp.setText("HP : "+novice.getHp());
                hpotion.setText(" x "+bag.Numberhppotion());
                }
                else{
                    JOptionPane.showMessageDialog(null,"YOU don't have Hppotion");
                    setVisible(true);
                }
                
                
             }
        });
        Energypotion.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(bag.Numberenergypotion()>0)
                {
                bag.decreaseENERGYPotion();
                novice.usingENERGYPotion();
                energy.setText("ENERGY : "+novice.getEnergy());
                epotion.setText(" x "+bag.Numberenergypotion());
                }
                else{
                    JOptionPane.showMessageDialog(null,"YOU don't have Energypotion");
                    setVisible(true);
                }
                
                
             }
                
             });
             setname.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                String s = (String) JOptionPane.showInputDialog(null,"Hey !\n" + "\"Input your name?\"","Title Dialog", JOptionPane.PLAIN_MESSAGE, null,null, "Name");
                if ((s != null) && (s.length() > 0)) {
                name.setText("" + s);
                }
                }
                });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().add(p3);
        getContentPane().add(p4);
        getContentPane().add(p1);
        getContentPane().add(p2);
        getContentPane().add(image);
    }
    public static void main(String[] args)
    {
        new Gui2();
    }
}