
package modele;

import java.io.Serializable;

public class Fonds implements Serializable{
    
    public String cle;
    private double amount;
    
    //constructeur par defaut
    public Fonds(){
        
        this.cle=null;
        this.amount=0;

    }    
    
    //constructeur avec parametre
    public Fonds(String cle,double amount){
        
        this.cle=cle;
        this.amount=amount;
          
    }

    public Fonds (double amount){
        this.amount=amount;
    }
    
    //methode qui retourne fond
    public double getAmount(){
        
        return amount;
    }
    
    
    @Override
    public String toString() {
        return "Montant : " + amount;
    }
    
}
   