
package vue;

import controlleur.TestMain;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class DeserialGraphique {
    
    private JLabel text, text2;
    private JButton charger;
    private JPanel de_serialtext, pan_deserial, de_serialfichier;
    private ArrayList<JTextField> deserialiser_field;
    private JTextField deserialname;

    public DeserialGraphique (){
        
        
        text=new JLabel("<html>De-Serialisation<br/><br/><html>");
        text.setFont(new Font("Serif", Font.BOLD, 30));
        
        text2=new JLabel("<html>'Cliquer sur le bouton pour charger<br/> votre portefeuille '</html>",SwingConstants.CENTER);
        text2.setFont(new Font("Serif", Font.ITALIC, 15));
        
        charger=new JButton("Charger");
        deserialname=new JTextField();
        deserialiser_field=new ArrayList<JTextField>();
        deserialiser_field.add(deserialname);

        
        de_serialtext=new JPanel();
        de_serialfichier=new JPanel();
        pan_deserial=new JPanel();
        
        TestMain test=new TestMain();
        test.setde_serialbutton(charger);
        test.setdeserial_fied(deserialiser_field);
        
        charger.addActionListener(test);
    }
    
    
    public JPanel de_serialtext(){
        
        de_serialtext.setLayout(new FlowLayout());
        de_serialtext.add(text);
        return de_serialtext;
   
    }
    
    public JPanel serialiser(){
        
        deserialname.setPreferredSize(new Dimension(150,30));

        pan_deserial.add(charger);
        pan_deserial.add(deserialname);
        de_serialfichier.setLayout(new GridLayout(2,4));
        de_serialfichier.add(text2);
        
        de_serialfichier.add(pan_deserial);
        return de_serialfichier;
        
    }
     
     
    
}
