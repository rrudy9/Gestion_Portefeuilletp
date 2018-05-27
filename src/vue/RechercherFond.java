
package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;


public class RechercherFond {
    
    private JLabel text, text2, textfield, textfield2;
    private JButton rechercher;
    private JTextField recherche_cle, recherche_amount;
    private ArrayList<JTextField> rechercher_fond_field;
    private JPanel panresult, pantext, pan_field, panbouton, panrecherche, panfieldpan,panpan;
    private JScrollPane scroll;
    
    
    
    public RechercherFond(){
        
        text=new JLabel("<html>Recherche Fond<br/><br/><html>");
        text.setFont(new Font("Serif", Font.BOLD, 30));
        
        text2=new JLabel("<html>'Cliquer sur le bouton pour rechercher'</html>",SwingConstants.CENTER);
        text2.setFont(new Font("Serif", Font.ITALIC, 15));
        
        textfield=new JLabel("Cle:");
        textfield.setFont(new Font("Serif", Font.ITALIC, 15));
        
        textfield2=new JLabel("Amount:");
        textfield2.setFont(new Font("Serif", Font.ITALIC, 15));
        
        rechercher=new JButton("Rechercher");
        
        recherche_cle=new JTextField();
        recherche_amount=new JTextField();
        
        rechercher_fond_field=new ArrayList<JTextField>();
        
        panresult=new JPanel();
        panresult.setBackground(Color.WHITE);
        panbouton=new JPanel();
        pan_field=new JPanel();
        panrecherche=new JPanel();
        pantext=new JPanel();
        panfieldpan=new JPanel();
        scroll = new JScrollPane(panresult,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setLayout(new ScrollPaneLayout());
        //scroll.setSize(new Dimension(800, 200));
        panpan=new JPanel();
        
    }
    
    public JPanel showrecherchefond_text(){
 
        pantext.setLayout(new FlowLayout());
        pantext.add(text);
        return pantext;
   
    }
    
    public JPanel rechercher_fond(){
        
        
        recherche_cle.setPreferredSize(new Dimension(100,30));
        recherche_amount.setPreferredSize(new Dimension(100,30));
        
     
        pan_field.add(textfield);
        pan_field.add(recherche_cle);
        pan_field.add(textfield2);
        pan_field.add(recherche_amount);
        
        panfieldpan.add(pan_field);
        
        panbouton.add(rechercher);
        
        
        panrecherche.setLayout(new GridBagLayout());
        GridBagConstraints gbc= new GridBagConstraints();
        gbc.anchor= GridBagConstraints.FIRST_LINE_START;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.3;
        
        panrecherche.add(text2,gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 1;
        gbc.weighty = 0.7;
        
        panrecherche.add(panfieldpan, gbc);
        
        gbc.fill = GridBagConstraints.PAGE_END;

        gbc.gridy = 2;
        gbc.weighty = 0.7;
        
        panrecherche.add(panbouton,gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 250;      //make this component tall
        gbc.weightx = 0.0;
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 3;
        
        
        panrecherche.add(scroll,gbc);
        return panrecherche;
        
    }
    
    
    
    
    
    
    
    
}
