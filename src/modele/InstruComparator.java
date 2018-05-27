
package modele;

import java.util.Comparator;


public class InstruComparator implements Comparator<Fonds> {

   
    
    //on utilise compare pour comparer les fonds , pas besoin d'equals
    @Override
    public int compare(Fonds o1, Fonds o2) {
       
        return Double.compare(o1.getAmount(), o2.getAmount());

    }
    
}
