
package vue;

import java.util.Collection;
import modele.FondInexistant;
import modele.InstrumentInexistant;

import java.util.Map;
import modele.*;

public class Gestionconsole {
    
    private Portefeuille portefeuille;
    private float pourcentage;

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
    
   
    
    
    public float affichefond_statistique(String cle) throws FondInexistant, InstrumentInexistant{
        
        
        
        if (portefeuille.getfondMap().containsKey(cle)){
            fond=portefeuille.rechercherfond_dsFondsMap(cle);
            
            if (portefeuille.getinstrumentMap().containsKey(cle)) {
        
        
                Map<String, Instrument> instrument = portefeuille.getinstrumentMap();
                Instrument instru = instrument.get(cle);
                System.out.println(instru.sommefond());
                pourcentage= (float)((fond) / (instru.sommefond()));
            
            }else {
                    throw new InstrumentInexistant();

                    }
        
        }else {
            portefeuille.rechercherfond_dsFondsMap(cle);
        }
//        
        return pourcentage;
    }
    
}
