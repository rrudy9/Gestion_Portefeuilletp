
package modele;

import controlleur.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Portefeuille {
    

    Map<String, Fonds> fonds;
    Map<String, Instrument> instruments;

    
    //constructeur par defaut
    public Portefeuille(){
       
        this.fonds=new HashMap<>();
        this.instruments=new HashMap<>();
        
    }
    
    //constructeur avec parametre
    public Portefeuille(Map<String,Fonds> fonds, Map<String, Instrument> instruments){
    
 
        this.fonds=fonds;
        this.instruments=instruments;
    }
    
    public Map<String, Fonds> getfondMap(){
        
         return this.fonds;
         
    }
    
    public Map<String, Instrument> getinstrumentMap(){
        
         return this.instruments;
         
    }
    
    //methode qui permet de rechercher un fond a l'aide de sa cle 
    public double rechercherfond_dsFondsMap(String cle) throws FondInexistant{
        Fonds fond = fonds.get(cle);
        if (fonds == null) {
            throw new FondInexistant();
        }

        return fond.getAmount();
       
    }
    
    //methode qui permet de rechercher un instrument a l'aide de sa cle 
    public List<Fonds> rechercherfondinstrument(String cle) throws InstrumentInexistant{
        
        Instrument instrument = instruments.get(cle);
        if (instrument == null) {
            throw new InstrumentInexistant();
        }

        return instrument.getfondinstruments();
       
    }
    
    public ArrayList<Instrument> recherche_instru_avec_clefond(String cle){
        
        
        ArrayList<Instrument> list= new ArrayList<Instrument>();
        
        Instrument instru = new Instrument();
        
        Set<Entry<String, Instrument>> setEntry = instruments.entrySet();
        
        
        for (Entry<String, Instrument> entry : setEntry){
            instru = entry.getValue();
            for(int i = 0; i < instru.getfondinstruments().size(); i++){
                if(instru.getfondinstruments().get(i).cle == cle){
                    list.add(instru);
                }
            } 
        }
        if (list.size() > 0){
            return list;
        } else {
            return null; 
        }
        
    }
      
    
    public double rechercherfondinstrument_avecvaleurfond(String cle, Fonds fonds) throws InstrumentInexistant, FondInexistant{
        
        ArrayList<Fonds> f=new ArrayList<Fonds>();
        f= (ArrayList<Fonds>) rechercherfondinstrument(cle);
        if(f.contains(fonds)) {
          
            return fonds.getAmount();
        } else {
            throw new FondInexistant();
        }
       
      
    }
       
    //methode qui permet d'ajouter un fond dans le HashMap fond 
    public void ajouterfond_dsMapfond(String cle, double amount) throws FondsExistant{
           
           if (fonds.containsKey(cle)) {
               
               throw new FondsExistant();
        }

        fonds.put(cle, new Fonds(amount));
    }
      
    //methode qui permet d'ajouter un fond dans le HashMap instruments
    public void ajouterfonds_dsMapInstru(String cle, Fonds fond){
        
        Instrument current= instruments.get(cle);
      
        if (current ==null) {
            current= new Instrument();
            instruments.put(cle, current);
        }
        
        current.ajoutfond(fond);

    }
    
    //methode qui permet de supprimer un fond 
    public void supprimerfondMapfond (String cle){

        if (fonds.containsKey(cle)){
            fonds.remove(cle);
            }
            
        }
        
     
    //methode qui permet de supprimer un instrument
    public void supprimerfondinstru(String cle, Fonds fond) throws InstrumentInexistant{
        
        if (!instruments.containsKey(cle)){
            throw new InstrumentInexistant();
        }
        
        Instrument current= instruments.get(cle);
        
        current.suppfond(fond);
      
    }
    
    
    
    
    //methode qui permet d'afficher ts les fonds d'un instrument 
    public void affiche_allfond(){
       
        Set<Entry<String, Fonds>> setEntry = fonds.entrySet();

        for (Entry<String, Fonds> entry : setEntry) {
            System.out.println("Valeur pour la cle " + entry.getKey() + ":" + entry.getValue());
            entry.getKey();
            entry.getValue();
        }  
    }
    
    
}
        
        
    
        
        
        
           
            
     
    
       
       
       
       
       
       
       
        
        

    
    
    


