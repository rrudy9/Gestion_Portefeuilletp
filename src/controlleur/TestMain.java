
package controlleur;
import com.sun.xml.internal.bind.v2.model.annotation.FieldLocatable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modele.*;
import vue.*;


public class TestMain implements ActionListener, MouseListener{
    
    private JLabel returnhome;
    private JButton serialbutton, de_serialbutton, ajout_fond_button, supp_fond_button, ajout_instru_button, supp_instru_button, recherchebouton;
    private JMenuItem quitter, serialpage, deserialpage,ajout_supp_fondpage,ajout_supp_fond_instrupage, recherchepage;
    private ArrayList<JTextField> serialiser_field, de_serialiser_field, ajoutfond_field, suppfond_field, ajoutinstru_field, suppinstru_field;
 
    private static GestionGraphique graphique;
    private static Portefeuille portefeuille;
    public static void main(String[] args) throws FondInexistant, InstrumentInexistant, FondsExistant, IOException, FileNotFoundException, ClassNotFoundException {
        
        Scanner sc=new Scanner(System.in);
        //Test pour verifier le fonctionnement du code 
//        System.out.println("saisir votre cle puis votre valeur ");
//        String a1,b1,c1;
//        double a2,b2,c2;
//        a1=sc.next();
//        a2=sc.nextDouble();
//        b1=sc.next();
//        b2=sc.nextDouble();
//        c1=sc.next();
//        c2=sc.nextDouble();
//        Fonds fond=new Fonds(a1,a2);
//        Fonds fond2=new Fonds(b1,b2);
//        Fonds fond3=new Fonds(c1,c2);
//       
//        ArrayList <Fonds> instrum=new ArrayList<>();
//        instrum.add(fond);
//        instrum.add(fond2);
//        instrum.add(fond3);
////        
//        Map<String, Fonds> fonds=new LinkedHashMap<>();
//        fonds.put(a1, fond);
//        fonds.put(b1, fond2);
////        
//        Map<String, Instrument> instrument =new LinkedHashMap<>();
//        instrument.put(a1, new Instrument(a1,instrum));
////        
////        
//        Portefeuille portefeuille=new Portefeuille();
//        portefeuille.ajouterfond_dsMapfond(a1, a2);
//        portefeuille.ajouterfond_dsMapfond(b1, b2);
////        
//        portefeuille.ajouterfonds_dsMapInstru(a1, fond);
//        portefeuille.ajouterfonds_dsMapInstru(b1, fond2);
//        portefeuille.ajouterfonds_dsMapInstru(a1, fond3);
////
//        Gestionconsole console=new Gestionconsole(portefeuille);
////
//        System.out.println("recherche fond ds portefeuille map fond");
//        console.affiche_recherche_fond_dsMap(a1);
////        
//        System.out.println("recherche fond ds portefeuille map fond");
//        console.affiche_recherche_fond_dsMap(b1);
////      
//        System.out.println("recherche instru ds portefeuille map instru");
//        console.affiche_recherche_instru_dsMapInstru(a1);
//        console.affiche_recherche_instru_dsMapInstru(b1);
////        
////        
//        console.afficheinstrudsPortefeuille(a1);
////
////        
//        console.affiche_instru_avant_tri();
//        console.affiche_instru_apres_tri();
//        
//        System.out.println("Statistique");
//        System.out.println(console.affichefond_statistique(a1));
//        
        //Serial serial =new Serial(portefeuille);
        //System.out.println("1er SERIAL ");
       // serial.serialiser("premier serial");
        
         portefeuille=new Portefeuille();
        //Serial serial1=new Serial(portefeuille1);
        //serial1.deserialiser("premierserial.txt");
//        
//        System.out.println("affiche portfeuille 2 apres deserialiser");
//        Gestionconsole console1=new Gestionconsole(portefeuille1);
//        console1.affiche_instru_avant_tri();
//        
         graphique=new GestionGraphique(portefeuille);
        
    }
    
    public void setquitter( JMenuItem quitter){
        this.quitter=quitter;
    }
    
    public void setserialpage( JMenuItem serial){
        this.serialpage=serial;
    }
    
    public void setseriabutton( JButton serial){
        this.serialbutton=serial;
    }
    
    public void setserial_fied(ArrayList<JTextField> field){
        this.serialiser_field=field;
    }
     
    public void setdeserial_fied(ArrayList<JTextField> field){
        this.de_serialiser_field=field;
    }
    
    public void setajout_supp_fondpage(JMenuItem item){
        this.ajout_supp_fondpage=item;
        
    }
    
    public void setajout_supp_fond_instrupage(JMenuItem item){
        this.ajout_supp_fond_instrupage=item;   
    }
    
    public void setajout_supp_instrupage(JMenuItem item){
        this.ajout_supp_fond_instrupage=item;  
    }
    
    public void setrecherchepage(JMenuItem item){
        this.recherchepage=item;  
    }
    
    public void setreturnhome(JLabel label){
        
        this.returnhome=label;
    }
    
    public void setde_serialbutton(JButton button){
       
        this.de_serialbutton=button;
    }
    
    public void setde_serialpage(JMenuItem deserial){
        this.deserialpage=deserial;
    }
    
    public void setajout_bouton_fond(JButton button){
       
        this.ajout_fond_button=button;
    }
 
    public void setsupp_bouton_fond(JButton button){
       
        this.supp_fond_button=button;
    }
 
    public void setajoutfond_field(ArrayList<JTextField> field){
        this.ajoutfond_field=field;
    }
     
    public void setsuppfond_field(ArrayList<JTextField> field){
        this.suppfond_field=field;
    }
    
    public void setrecherchebouton(JButton button){
       this.recherchebouton=button;
    }
 
    
    public void setajout_bouton_instru(JButton button){
       
        this.ajout_instru_button=button;
    }
 
    public void setsupp_bouton_instru(JButton button){
       
        this.supp_instru_button=button;
    }
 
    public void setajoutinstru_field(ArrayList<JTextField> field){
        this.ajoutinstru_field=field;
    }
     
    public void setsuppinstru_field(ArrayList<JTextField> field){
        this.suppinstru_field=field;
    }
    
  
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==quitter){
                System.exit(0);
        }
        
        if (e.getSource()==serialpage){
            graphique.showSerial();

        }
        
        if (e.getSource()==deserialpage){
            graphique.showdeSerial();

        }
        
        if (e.getSource()==ajout_supp_fondpage){
            graphique.showajout_supp_fond();

        }
        
        if (e.getSource()==ajout_supp_fond_instrupage){
            graphique.showajout_supp_instru();

        }
         
        if (e.getSource()==recherchepage){
            graphique.showrecherchefond();
        }
        
        if (e.getSource()==serialbutton){
        
            String st1 = serialiser_field.get(0).getText().trim();
            
            if (st1.compareTo("")==0){
                
                JOptionPane jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "Veuillez remplir les champs", "Attention", JOptionPane.WARNING_MESSAGE);
            }
            
            else {
                
                Serial serial=new Serial(portefeuille);
                serial.serialiser(st1);
                JOptionPane jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "Vous avez enregistre le fichier sous le nom "+st1, "Success", JOptionPane.WARNING_MESSAGE);
            }
            
        }
        
        if (e.getSource()==de_serialbutton){
            
            String st1 = de_serialiser_field.get(0).getText().trim();
            
             if (st1.compareTo("")==0){
                
                JOptionPane jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "Veuillez remplir les champs", "Attention", JOptionPane.WARNING_MESSAGE);
            }
             
            else {
               
                try {
                    Serial serial= new Serial(portefeuille);
                    
                    serial.deserialiser(st1);
                    
                } catch (IOException ex) {
                    Logger.getLogger(TestMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TestMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "Fichier imported ", "Success", JOptionPane.WARNING_MESSAGE);
            }    
        }
        
        if (e.getSource()==ajout_fond_button){
            
            
                String st1 = ajoutfond_field.get(0).getText().trim();
                
                double d =0;
                if(suppfond_field.get(1).getText().length() != 0){
                    d= Double.parseDouble(suppfond_field.get(1).getText().trim());
                }
                
                
                if (st1.compareTo("")==0 && d==0){
                
                JOptionPane jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "Veuillez remplir les champs", "Attention", JOptionPane.WARNING_MESSAGE);
            }
                
                else {
                    
                    try {
                        portefeuille.ajouterfond_dsMapfond(st1, d);
                    } catch (FondsExistant ex) {
                        Logger.getLogger(TestMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    JOptionPane jop2 = new JOptionPane();
                    jop2.showMessageDialog(null, "Amont ajoute ", "Success", JOptionPane.WARNING_MESSAGE);
                }
        }
        
        
     if (e.getSource()==supp_fond_button){
            
            
                String st1 = suppfond_field.get(0).getText().trim();
          
                //pas besoin de la valeur de l'amount , la cle pointe sur l'amount 
                if (st1.compareTo("")==0 ){
                
                JOptionPane jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "Veuillez remplir les champs", "Attention", JOptionPane.WARNING_MESSAGE);
            }
                
                else {
                    
                    portefeuille.supprimerfondMapfond(st1);
                    JOptionPane jop2 = new JOptionPane();
                    jop2.showMessageDialog(null, "Amont ajoute ", "Success", JOptionPane.WARNING_MESSAGE);
                }
        }
            
        
         if (e.getSource()==ajout_instru_button){
            
            
                String st1 = ajoutinstru_field.get(0).getText().trim();
                
                double d =0;
                if(ajoutinstru_field.get(1).getText().length() != 0){
                    d= Double.parseDouble(ajoutinstru_field.get(1).getText().trim());
                }
                
                if (st1.compareTo("")==0){
                JOptionPane jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "Veuillez remplir les champs", "Attention", JOptionPane.WARNING_MESSAGE);
            }
                
                else {
                    
                    Fonds fond=new Fonds(st1,d);
                    portefeuille.ajouterfonds_dsMapInstru(st1, fond);
                    JOptionPane jop2 = new JOptionPane();
                    jop2.showMessageDialog(null, "Fond ajoute ", "Success", JOptionPane.WARNING_MESSAGE);
                }
        }
       
          if (e.getSource()==supp_instru_button){
            
            
                String st1 = suppinstru_field.get(0).getText().trim();
                
                double d =0;
                if(suppinstru_field.get(1).getText().length() != 0){
                    d= Double.parseDouble(suppinstru_field.get(1).getText().trim());
                }
                
                if (st1.compareTo("")==0){
                JOptionPane jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "Veuillez remplir les champs", "Attention", JOptionPane.WARNING_MESSAGE);
            }
                
                else {
                    
                    Fonds fond=new Fonds(st1,d);
                    try {
                        portefeuille.supprimerfondinstru(st1, fond);
                    } catch (InstrumentInexistant ex) {
                        Logger.getLogger(TestMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane jop2 = new JOptionPane();
                    jop2.showMessageDialog(null, "Amont ajoute ", "Success", JOptionPane.WARNING_MESSAGE);
                }
        }
        
        // if (e.getSource())
         
        
        
    
    
    
    
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {            
       
 
        if ( (JLabel) e.getComponent()==returnhome){
           
            System.out.println("yo");
          //  graphique=new GestionGraphique(portefeuille);
        
        }
      

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}