import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class Prem extends JFrame{
    Container c;
    JButton b1,b2,b3;
    TextArea tx;
    JFrame Th;
    JMenuBar m;
    int saveStatus=0;
    String fiile="";


    Prem()
    {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setBounds(0,0,1500,1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setBackground(Color.blue);
        f.setForeground(Color.white);
        f.setTitle("textEditor");
        Font ft=new Font("Arial",1,20);
        
         m=new JMenuBar();
        JMenu m1=new JMenu("file");
        JMenuItem m11=new JMenuItem("new");
        JMenuItem m12=new JMenuItem("clear");
        JMenuItem m13=new JMenuItem("open");
        JMenuItem m14=new JMenuItem("save");
        JMenuItem m15=new JMenuItem("saveas");
        JMenuItem m16=new JMenuItem("exit");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);
        m1.add(m16);
        m.add(m1);
        Font fg=new Font("Arial",1,28);
        m.setFont(fg);
        JMenu m2=new JMenu("Edit");
        JMenuItem m21=new JMenuItem("cut---Ctrl+X");
        JMenuItem m22=new JMenuItem("paste----Ctrl+V");
        JMenuItem m23=new JMenuItem("theme");
        JMenuItem m24=new JMenuItem("fontsize");
        m22.setEnabled(false);
        m21.setEnabled(false);
        m2.add(m23);
        m2.add(m21);
        m2.add(m22);
        m2.add(m24);
        m.add(m2);

        
        f.setJMenuBar(m);
        
         c=new Container();
         c=f.getContentPane();
         c.setLayout(null);
         c.setVisible(true);
         tx=new TextArea();
        tx.setBounds(50,20,1300,700);
        c.add(tx);
        m.setBackground(new Color(204,204,255));
        c.setBackground(new Color(153,255,51));
        tx.setFont(ft);
        tx.setBackground(Color.yellow);
        tx.setForeground(Color.red);
        tx.setEditable(true);
         m14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String sb = "TESTCONTENT";
                if(saveStatus==0){
    JFileChooser chooser = new JFileChooser();
    chooser.setCurrentDirectory(new File("C:\\Users\\User\\Documents\\javaall\\datastructure"));
    int retrival = chooser.showSaveDialog(null);
    if (retrival == JFileChooser.APPROVE_OPTION) {
        try {
            fiile=chooser.getSelectedFile().getPath();
            FileWriter fw = new FileWriter(chooser.getSelectedFile());
            fw.write(tx.getText());
            fw.close();
            saveStatus=1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    }
    else{
        try{
          FileWriter fr=new FileWriter(fiile);
          fr.write(tx.getText());
          fr.close();

        }
        catch(Exception ee)
        {
            JOptionPane.showMessageDialog(m23, ee.getStackTrace(), "error", ABORT);
        }

    }
}
            
         });
         m15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                  JFileChooser chooser = new JFileChooser();
                  chooser.setCurrentDirectory(new File("C:\\Users\\User\\Documents\\javaall\\datastructure"));
                  int retrival = chooser.showSaveDialog(null);
                 if (retrival == JFileChooser.APPROVE_OPTION) {
        try {
            fiile=chooser.getSelectedFile().getPath();
            FileWriter fw = new FileWriter(chooser.getSelectedFile());
            fw.write(tx.getText());
            fw.close();
            saveStatus=1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    }
            
         });
         m13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                
                   tx.setText("");
                   JFileChooser choice = new JFileChooser();
                    int option = choice.showOpenDialog(null);
                  if (option == JFileChooser.APPROVE_OPTION) {
                 
               try{
                 FileReader fr=new FileReader(choice.getSelectedFile().getPath());
                Scanner S = new Scanner(fr);
                
                while(S.hasNextLine())
                {
                  tx.append(S.nextLine()+"\n");
                }
            }
            catch(Exception ee)
            {
                System.out.println(ee.getStackTrace());
            }

        }
                    

           
                
            
        }
         });
        
  m23.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
        String n[]={"t1","t2","t3","t4","t5","custom"};
    JComboBox h=new JComboBox(n);
    JFrame g=new JFrame();
    g.setVisible(true);
    g.setBounds(50,50,400,400);
    h.setBounds(100,50,200,50);
    h.setVisible(true);
    h.setBackground(Color.CYAN);
    g.setLayout(null);
    g.add(h);
    h.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            if(h.getSelectedItem()=="t1")
            {
                theme1();
            }
            else if(h.getSelectedItem()=="t2")
            {
                theme2();
            }
            else if(h.getSelectedItem()=="t3")
            {
                theme3();
            }
            else if(h.getSelectedItem()=="t4")
            {
                theme4();
            }
            else if(h.getSelectedItem()=="t5")
            {
                theme5();
            }
            else{
                //JOptionPane.showMessageDialog(m23,"Enter right choice", "alert", JOptionPane.YES_OPTION);
                JFrame cut=new JFrame("setcolor");
                cut.setLayout(null);
                cut.setBounds(200,200,400,400);
                cut.setVisible(true);
                JButton menu,texbac,texfor,bac;
                menu=new JButton("setMenubarBackground");
                menu.setBounds(30,30,200,40);
                cut.add(menu);
                texbac=new JButton("settextareabackground");
                texbac.setBounds(30,90,200,40);
                cut.add(texbac);
                texfor=new JButton("settextareaforeground");
                texfor.setBounds(30,150,200,40);
                cut.add(texfor);
                bac=new JButton("setbackgorondcolr");
                bac.setBounds(30,210,200,40);
                cut.add(bac);
                menu.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {
                        Color clr=JColorChooser.showDialog(m23, "choosemenubarcolor", m.getBackground());
                        m.setBackground(clr);
                    }
                });
                texbac.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {
                        Color clr=JColorChooser.showDialog(m23, "choosetextareabackground", tx.getBackground());
                        tx.setBackground(clr);
                    }
                });
                 texfor.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {
                        Color clr=JColorChooser.showDialog(m23, "choosetextareaforeground", tx.getForeground());
                        tx.setForeground(clr);
                    }
                });
                 bac.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {
                        Color clr=JColorChooser.showDialog(m23, "chooseabackgroundcolor", c.getBackground());
                        c.setBackground(clr);
                    }
                });

            }
        }
    });
    
    

    }
  });
  m16.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
        int a=JOptionPane.showConfirmDialog(tx,"do you want exit","exite",JOptionPane.YES_NO_CANCEL_OPTION);
        if(a==0)
        System.exit(0);
    }
  });
  m24.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
        int x=Integer.parseInt(JOptionPane.showInputDialog("enter the font size from 10 to 60"));
        if(x>=10&&x<=60){
            tx.setFont(new Font("Arial",1,x));
            m1.setFont(new Font("Arial",1,x));
            m2.setFont(new Font("Arial",1,x));
        }
        else{
            JOptionPane.showMessageDialog(m24, "wrong entry must be beteen 10 and 60", "error", JOptionPane.ERROR_MESSAGE);
        }

    }
  });
  m11.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
        saveStatus=0;
        fiile="";
        tx.setText("");
    }
  });
  m12.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
       
        tx.setText("");
    }
  });

    }
    public void theme1(){
        tx.setBackground(Color.pink);
        c.setBackground(Color.blue);
        m.setBackground(Color.GRAY);
        tx.setForeground(Color.white);

    }
    public void theme2(){
        tx.setBackground(Color.blue);
        c.setBackground(Color.red);
        m.setBackground(Color.yellow);
        tx.setForeground(Color.white);


    }
     public void theme3(){
        tx.setBackground(Color.yellow);
        c.setBackground(Color.orange);
        m.setBackground(Color.white);
        tx.setForeground(Color.red);

    }
     public void theme4(){
        tx.setBackground(Color.cyan);
        c.setBackground(Color.pink);
        m.setBackground(Color.white);
        tx.setForeground(Color.black);

    }
     public void theme5(){
        tx.setBackground(Color.white);
        c.setBackground(Color.white);
        m.setBackground(Color.white);
        tx.setForeground(Color.white);

    }
}

public class swing10
{
    public static void main(String args[])
    {
        Prem p=new Prem();

    }
}