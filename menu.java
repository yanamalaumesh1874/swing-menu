import javax.swing.*;  
class MenuEx  
{  
          JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5,i6;  
          MenuEx(){  
          JFrame f= new JFrame("Menu and MenuItem Example");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
          submenu=new JMenu("Sub Menu");  
          i1=new JMenuItem("New");  
          i2=new JMenuItem("copy");  
          i3=new JMenuItem("cut");  
          i4=new JMenuItem("size");  
          i6=new JMenuItem("style");  
          i5=new JMenuItem("paste");
		  menu.add(i1);
		  menu.add(i2); 
		  menu.add(i3);  
          submenu.add(i4); 
		  menu.add(i5);
		  submenu.add(i6);
          menu.add(submenu);  
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(800,800);  
          f.setLayout(null);  
          f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MenuEx();  
}
}  
