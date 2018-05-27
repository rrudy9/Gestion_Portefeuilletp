
package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import javax.swing.JPanel;
import modele.Portefeuille;


public class GestionGraphique extends JFrame {

    private Portefeuille portefeuille;
    
    private ShowMenu showmenu;
    private Showaccueil showaccueil;
    private SerialGraphique serialgraphique;
    private DeserialGraphique deserialgraphique;
    private Ajout_supp_fondgraphique ajout_supp_fond;
    private Ajout_supp_instrugraphique ajout_supp_instru;
    private RechercherFond rechercherfond;

    private JPanel container, container1, container_accueil;
    
    private Returnhome returnhome;
    
    public GestionGraphique (Portefeuille portefeuille){
        
        this.portefeuille=portefeuille;
        setTitle("Gestion de Portfeuille");
        
        //on instancie le menu, photo et le text
        showmenu=new ShowMenu();
        showaccueil=new Showaccueil();
        returnhome=new Returnhome();
        
 
        
        getContentPane().add(accueil());
        
        this.setPreferredSize(new Dimension(500, 500));
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        
    }
    
    public JPanel accueil (){
      
        showmenu=new ShowMenu();

        container=new JPanel();
        container_accueil=new JPanel();
        container.setLayout(new BorderLayout());
        container_accueil.add(showaccueil.showtext());
        container_accueil.add(showaccueil.showphoto());
        container.add(container_accueil, BorderLayout.CENTER);
        container.add(showmenu.createMenuBar(),BorderLayout.LINE_START);
        
        return container;
        
    }
    
    public void showSerial(){
        
        showmenu=new ShowMenu();

        serialgraphique= new SerialGraphique();
        getContentPane().removeAll();
        container=new JPanel();
        container1=new JPanel();       
        container1.add(serialgraphique.Serialtext());
        container1.add(serialgraphique.serialiser());

        container.setLayout(new BorderLayout());
        container.add(showmenu.createMenuBar(),BorderLayout.LINE_START);
        container.add(container1,BorderLayout.CENTER);
        container.add(returnhome.showicon_home(),BorderLayout.LINE_END);
      
        getContentPane().add(container);
        revalidate();
        repaint(); 
    }
    
    
    public void showdeSerial(){
        
        showmenu=new ShowMenu();

        deserialgraphique= new DeserialGraphique();
        getContentPane().removeAll();
        container=new JPanel();
        container1=new JPanel();       
        container1.add(deserialgraphique.de_serialtext());
        container1.add(deserialgraphique.serialiser());

        container.setLayout(new BorderLayout());
        container.add(showmenu.createMenuBar(),BorderLayout.LINE_START);
        container.add(container1,BorderLayout.CENTER);
        container.add(returnhome.showicon_home(),BorderLayout.LINE_END);
      
        getContentPane().add(container);
        revalidate();
        repaint(); 
    }
    
    
    public void showajout_supp_fond(){
        
        showmenu=new ShowMenu();

        ajout_supp_fond= new Ajout_supp_fondgraphique();
        getContentPane().removeAll();
        container=new JPanel();
        container1=new JPanel();       
        container1.add(ajout_supp_fond.ajout_supp_fondtext());
        container1.add(ajout_supp_fond.ajout_fond_amount());

        container.setLayout(new BorderLayout());
        container.add(showmenu.createMenuBar(),BorderLayout.LINE_START);
        container.add(container1,BorderLayout.CENTER);
        container.add(returnhome.showicon_home(),BorderLayout.LINE_END);
      
        getContentPane().add(container);
        revalidate();
        repaint(); 
        
    }
    
    
    public void showajout_supp_instru(){
        
        showmenu=new ShowMenu();
        
        ajout_supp_instru= new Ajout_supp_instrugraphique();
        getContentPane().removeAll();
        container=new JPanel();
        container1=new JPanel();       
        container1.add(ajout_supp_instru.ajout_supp_instrutext());
        container1.add(ajout_supp_instru.ajout_instru());

        container.setLayout(new BorderLayout());
        container.add(showmenu.createMenuBar(),BorderLayout.LINE_START);
        container.add(container1,BorderLayout.CENTER);
        container.add(returnhome.showicon_home(),BorderLayout.LINE_END);
      
        getContentPane().add(container);
        revalidate();
        repaint(); 
        
    }
    
    public void showrecherchefond(){
        
        showmenu=new ShowMenu();
        
        rechercherfond= new RechercherFond();
        getContentPane().removeAll();
        container=new JPanel();
        container1=new JPanel();       
        container1.add(rechercherfond.showrecherchefond_text());
        container1.add(rechercherfond.rechercher_fond());

        container.setLayout(new BorderLayout());
        container.add(showmenu.createMenuBar(),BorderLayout.LINE_START);
        container.add(container1,BorderLayout.CENTER);
        container.add(returnhome.showicon_home(),BorderLayout.LINE_END);
      
        getContentPane().add(container);
        revalidate();
        repaint(); 
        
    }
    
  
    
    
    
}
