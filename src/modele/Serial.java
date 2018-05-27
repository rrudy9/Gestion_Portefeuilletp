
package modele;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public class Serial implements Serializable{
    
   
    Portefeuille portefeuille;
    
    
    
    public Serial(Portefeuille portefeuille){
            this.portefeuille=portefeuille;
    }
    
    
    
    
    public void serialiser (String nom){
        try {
            
            FileOutputStream fos= new FileOutputStream(nom);
            
            ObjectOutputStream oos= new ObjectOutputStream(fos);
           
            oos.writeObject(portefeuille.fonds);
            oos.writeObject(portefeuille.instruments);
            
            oos.close();
            fos.close();
            
            System.out.printf("Serialized HashMap data is saved in "+ nom);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public void deserialiser(String nom) throws FileNotFoundException, IOException, ClassNotFoundException{
        try{
            
            FileInputStream fis= new FileInputStream(nom);
            ObjectInputStream ois= new ObjectInputStream(fis);
            
            portefeuille.fonds=(Map<String, Fonds>) ois.readObject();
            portefeuille.instruments=(Map<String, Instrument>) ois.readObject();

            ois.close();
            fis.close();
            System.out.println("Deserialized HashMap..");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
}
