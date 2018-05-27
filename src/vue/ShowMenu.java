
package vue;

import controlleur.TestMain;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class ShowMenu {
    
    private JMenuBar menuBar;
    private JMenu menu, submenu1, submenu2, submenu3, about;
    private JMenuItem aboutus, help,  quitter, statistique, serial, deserial, rechercher_fond, rechercher_instru, ajout_supp_fond, ajout_supp_instru;
    
  
    public ShowMenu(){
         
        //instancier le menubar
        menuBar=new JMenuBar();
        //on instancie le premier menu
        menu=new JMenu("Menu");
        //instancier les submenu
        submenu1=new JMenu("De/Serialisation");
        submenu2=new JMenu("Recherche");
        submenu3=new JMenu("Ajout et suppression");
        
        //on instancie ts les composants 
        statistique=new JMenuItem("Statistiques");
        quitter=new JMenuItem("Quitter");
        serial=new JMenuItem("Serialisation");
        deserial=new JMenuItem("De-Serialisation");
        rechercher_fond=new JMenuItem("Recherche d'un fonds");
        rechercher_instru=new JMenuItem("Recherche d'un instru");
        ajout_supp_fond=new JMenuItem("Ajout et suppression d'un fond");
        ajout_supp_instru=new JMenuItem("Ajout et suppression d'un instrument");
        
        TestMain test= new TestMain();
        test.setquitter(quitter);
        test.setserialpage(serial);
        test.setde_serialpage(deserial);
        test.setajout_supp_fondpage(ajout_supp_fond);
        test.setajout_supp_instrupage(ajout_supp_instru);
        test.setrecherchepage(rechercher_fond);
        
        quitter.addActionListener(test);
        serial.addActionListener(test);
        deserial.addActionListener(test);
        ajout_supp_fond.addActionListener(test);
        ajout_supp_instru.addActionListener(test);
        rechercher_fond.addActionListener(test);
        
    }
    //creer le menu bar
    public JMenuBar createMenuBar(){
       
        menuBar.setLayout(new GridLayout(0,1));
        
        //on ajoute les menus ds le menubar
        menuBar.add(createMenu1());
        menuBar.add(createMenu2("About"));
        
        return menuBar;
    }
    
    //ceer le menu
    public JMenu createMenu1(){
        
        menu.setMnemonic(KeyEvent.VK_F);
        
       
        //on ajoute les items ds chaque menu
        submenu1.add(serial);
        submenu1.add(deserial);
        
        submenu2.add(rechercher_fond);
        submenu2.add(rechercher_instru); 
        
        submenu3.add(ajout_supp_fond);
        submenu3.add(ajout_supp_instru);

        //on ajoute ts les submenu ds le menu principale
        menu.add(submenu1);
        menu.addSeparator();
        menu.add(submenu2);
        menu.addSeparator();
        menu.add(submenu3);
        menu.addSeparator();
        menu.add(statistique);
        menu.addSeparator();
        menu.add(quitter);
        
        
        return menu;
    }
    
    
    public JMenu createMenu2(String title){
        
        //on instancie le deuxieme menu
        about=new JMenu(title);
        about.setMnemonic(KeyEvent.VK_F);
        //items
        aboutus=new JMenuItem("About us");
        help=new JMenuItem("Help");
        
        //ajout
        about.add(aboutus);
        about.addSeparator();
        about.add(help);
        
        return about;
    }
    
   
    
}
        
       
    
        