
package vue;


import java.awt.*;
import javax.swing.*;


public class Showaccueil {
    
    private JLabel photo1, text, text1;

    private JPanel photo, pantext;
   
    

    
    public JPanel showphoto(){
    
        photo=new JPanel();
        ImageIcon icon=new ImageIcon("img/p.png");
        photo1=new JLabel(icon);
        photo.add(photo1);
        photo.setSize(80, 120);
        
        return photo;
    }
    
    public JPanel showtext(){
        
        text=new JLabel("<html>Welcome to your wallet<br/></html>");
        text.setFont(new Font("Serif", Font.BOLD, 30));
        
        text1=new JLabel("<html>Click on the Menu on the left to manage your wallet</html>",SwingConstants.CENTER);
        text1.setFont(new Font("Serif", Font.ITALIC, 15));

        pantext=new JPanel();
        pantext.setLayout(new GridLayout(2,0));
        pantext.add(text);
        pantext.add(text1);
        
        return pantext;
        
    }
    
    
}
