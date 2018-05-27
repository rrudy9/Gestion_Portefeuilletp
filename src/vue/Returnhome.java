
package vue;

import controlleur.TestMain;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
public class Returnhome {
    
    private JLabel home;
    private JPanel panhome;
    
    public Returnhome (){
        
        panhome=new JPanel();
        
        BufferedImage img = null;
            try {
                    img = ImageIO.read(new File("img/download.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        
        Image dimg = img.getScaledInstance(50,50,Image.SCALE_SMOOTH);   
        ImageIcon icon=new ImageIcon(dimg);
        home=new JLabel(icon);
        
        TestMain test=new TestMain();
        test.setreturnhome(home);
        home.addMouseListener(test);
        
    }
    
    public JPanel showicon_home(){
        
        panhome.add(home);
        
        return panhome;
        
    }
    
     
}
