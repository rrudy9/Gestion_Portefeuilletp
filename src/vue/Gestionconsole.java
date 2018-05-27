
package vue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import modele.FondInexistant;
import modele.InstrumentInexistant;

import java.util.Map;
import java.util.Set;
import modele.*;

public class Gestionconsole {
    
    private Portefeuille portefeuille;

    private double fond;
    
    public Gestionconsole(Portefeuille portefeuille){
        this.portefeuille=portefeuille;
    }
    
    
    
    //affichage de l'instrument 
    public void afficheinstrudsPortefeuille(String cle) throws InstrumentInexistant{
        
      if (!portefeuille.getinstrumentMap().containsKey(cle)) {
            throw new InstrumentInexistant();
        }

        Map<String, Instrument> instrument = portefeuille.getinstrumentMap();
        Instrument instru = instrument.get(cle);
        System.out.println("cle de numero " +cle);
        System.out.println("nombre totale de fonds " + instru.get_nbretotale());
        System.out.println("somme totale des fonds " + instru.sommefond());
    }
    
    public void affiche_recherche_fond_dsMap(String cle) throws FondInexistant {
        System.out.println("Votre fonds ds map de cle " + cle + " est de " + portefeuille.rechercherfond_dsFondsMap(cle));
    }
    
    public void affiche_recherche_instru_dsMapInstru(String cle) throws InstrumentInexistant {
        System.out.println("Votre Instru ds map de cle " + cle + " est de " + portefeuille.rechercherfondinstrument(cle));
    }
    
     public void affiche_recherche_instru_dsMapInstruac_val(String cle, Fonds fond) throws InstrumentInexistant, FondInexistant {
        System.out.println("Votre fonds ds map de cle " + cle + " est de valeur " + portefeuille.rechercherfondinstrument_avecvaleurfond(cle, fond));
    }
    
    
    //affichage de l'instrument avant tri
    public void affiche_instru_avant_tri() {
        System.out.println("votre instru ds map instru avant tri" + portefeuille.getinstrumentMap());
    }
  
    
     //affichage de l'instrument apress tri
    public void affiche_instru_apres_tri() {
        Collection<Instrument> instruments = portefeuille.getinstrumentMap().values();
        for (Instrument instrument : instruments) {
            instrument.trieinstru();
        }

        System.out.println("votre instru ds map instru apres tri" + portefeuille.getinstrumentMap());
    }
    
   
    
    //propotion du fond en fonction du nombre totale de fond ds lintru N 
    public float affichefond_statistique(String cle) throws FondInexistant, InstrumentInexistant{
        
        ArrayList<Instrument> list= new ArrayList<>();
        list= portefeuille.recherche_instru_avec_clefond(cle); 
        
        int countFond = 0;
        int countTotal = 0;
        float pourcentage;
        double amount;
        HashMap<String, Integer> mapOccurence = new HashMap<String, Integer>();
        
        // recuperer tous les instru;ents qui contiennent la clef
        
        // iterer sur chaque instruement pour trouver le nombre doccurence du fond
        // on stock le nbre d occurence dans un hashmap
        if (!list.isEmpty()) {
            
            for (int i = 0 ; i < list.size() ; i++){
                
                for (int j = 0; j < list.get(i).getfondinstruments().size(); j ++){
                
                        if (list.get(i).getfondinstruments().get(j).cle==cle){
            
                            countFond ++;
            
                            mapOccurence.put(cle, countFond);
                
                        }
                        
               
//                     else {
//                        throw new FondInexistant();
//                    }
            
                }
            }
            
            Set<Map.Entry<String, Integer>> setEntry = mapOccurence.entrySet();
            for (Map.Entry<String, Integer> entry : setEntry) {
                
                countTotal+= entry.getValue();
            }
          
            amount=list.get(0).getfondinstruments().get(0).getAmount();
            pourcentage= (float)(amount/ countTotal);
       
        return pourcentage;
            
        }
        
        else { 
            
            throw new InstrumentInexistant();
        }
        
       
    }
    
}
