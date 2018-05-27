
package modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Instrument implements Serializable{
    
    public String cle;
    private List <Fonds> Fond;
    
    
    //constructeur par defaut
    public Instrument(){
        this.cle=null;
        this.Fond = new ArrayList<>();
        
    }
    
    //constructeur avec parametre
    public Instrument(String cle, List<Fonds> fonds){
        
        this.cle=cle;
        this.Fond=fonds;
    }
    
    //methode qui permet d'ajouter un fond dans l'arraylist
    public void ajoutfond( Fonds fonds){
       
        Fond.add(fonds);
       
    }
    
    public void suppfond( Fonds fonds){
       
        Fond.remove(fonds);
       
    }
    
    //methode qui retourne le nombre totale de fond dans l'instrument
    public int get_nbretotale(){
        
        return Fond.size();
    }
  
    //methode qui return tous les fonds d'un instrument
    public List<Fonds> getfondinstruments(){
        
         return Fond;
         
    }
    
   
    
    //methode qui retourne la somme de tous les fonds d'un instrument
    public double sommefond(){
        
        double somme=0.0;
        
        for (Fonds fonds : Fond){
         
         somme+=fonds.getAmount();
         
        }
        
        return somme;
    }
    
    //methode qui permet de trier un instrument 
    public void trieinstru(){
        
        Fond.sort(new InstruComparator());
        
        }
    
    @Override
    public String toString() {
        return Fond.toString();
    }
    
    
    }
