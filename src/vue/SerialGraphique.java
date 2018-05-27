
package vue;

import controlleur.TestMain;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class SerialGraphique {
    
    private JLabel text, text2;
    private JPanel serialtext, serialfichier, panhome , panserial;
    private JButton save;
    private JTextField deserialname;
    private ArrayList<JTextField> deserialiser_field;
    
    public SerialGraphique(){
        
        deserialiser_field = new ArrayList<JTextField>();
        deserialname=new JTextField();
        
        panserial= new JPanel();
        deserialiser_field.add(deserialname);
        
        text=new JLabel("<html>Serialisation<br/><br/><html>");
        text.setFont(new Font("Serif", Font.BOLD, 30));
        
        text2=new JLabel("<html>'Ecrivez le nom du fichier dans lequel<br/>  vous souhaitez sauvegarder votre portefeuille'</html>",SwingConstants.CENTER);
        text2.setFont(new Font("Serif", Font.ITALIC, 15));
        
        save=new JButton("Save");
        panhome =new JPanel();

        serialtext=new JPanel();
        serialfichier=new JPanel();
        
        
        TestMain test= new TestMain();
        test.setseriabutton(save);
        test.setserial_fied(deserialiser_field);
        
        save.addActionListener(test);
    }
    
    public JPanel Serialtext(){
        
        serialtext.setLayout(new FlowLayout());
        serialtext.add(text);
        return serialtext;
   
    }
    
    public JPanel serialiser(){
        
        deserialname.setPreferredSize(new Dimension(150,30));
        panserial.add(save);
        panserial.add(deserialname);
        
        serialfichier.setLayout(new GridLayout(2,4));
        serialfichier.add(text2);
        
        serialfichier.add(panserial);
        return serialfichier;
        
    }
    
    
    
    
    
    
}
