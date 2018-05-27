
package vue;

import controlleur.TestMain;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class Ajout_supp_fondgraphique {
   
    private JLabel text, text2, text3, textfield, textfield2, textfield3, textfield4;
    private JPanel ajout_fondtext, pansupp , panajout, panajout_supp, panboutonajouter, panfield, panfield1, panboutonsupprimer;
    private JButton ajouter, supprimer;
    private JTextField cle_ajout_jtfi, amount_ajout_jtfi, cle_supp_jtfi, amount_supp_jtfi;
    private ArrayList<JTextField> ajout_field, supp_field;
    
    
    public Ajout_supp_fondgraphique() {
        
        ajout_field = new ArrayList<JTextField>();
        supp_field=new ArrayList<JTextField>();
        
        cle_ajout_jtfi=new JTextField();
        amount_ajout_jtfi=new JTextField();
        cle_supp_jtfi=new JTextField();
        amount_supp_jtfi=new JTextField();
        
        panajout= new JPanel();
        pansupp=new JPanel();
        panajout_supp=new JPanel();
        
        ajout_field.add(cle_ajout_jtfi);
        ajout_field.add(amount_ajout_jtfi);
        
        supp_field.add(cle_supp_jtfi);
        supp_field.add(amount_supp_jtfi);
        
        text=new JLabel("<html>Ajout / Suppression <br/>  d'un fond <br/><br/><html>");
        text.setFont(new Font("Serif", Font.BOLD, 30));
        
        text2=new JLabel("<html>'Saisissez la cle et le montant<br/>pour ajouter un fond'</html>",SwingConstants.CENTER);
        text2.setFont(new Font("Serif", Font.ITALIC, 15));
        
        text3=new JLabel("<html>'Saisissez la cle et le montant<br/>pour supprimer un fond'</html>",SwingConstants.CENTER);
        text3.setFont(new Font("Serif", Font.ITALIC, 15));
        
        textfield=new JLabel("Cle:");
        textfield.setFont(new Font("Serif", Font.ITALIC, 15));
        
        textfield2=new JLabel("Amount:");
        textfield2.setFont(new Font("Serif", Font.ITALIC, 15));

        textfield3=new JLabel("Cle:");
        textfield3.setFont(new Font("Serif", Font.ITALIC, 15));
        
        textfield4=new JLabel("Amount:");
        textfield4.setFont(new Font("Serif", Font.ITALIC, 15));
        
        ajouter=new JButton("Ajouter");
        supprimer=new JButton("Supprimer");

        ajout_fondtext=new JPanel();
        pansupp=new JPanel();
        panajout=new JPanel();
        panajout_supp=new JPanel();
        panboutonajouter=new JPanel();
        panfield=new JPanel();
        panfield1=new JPanel();
        panboutonsupprimer= new JPanel();
        
        TestMain test=new TestMain();
        
        test.setajout_bouton_fond(ajouter);
        test.setsupp_bouton_fond(supprimer);
        test.setajoutfond_field(ajout_field);
        test.setsuppfond_field(supp_field);

        ajouter.addActionListener(test);
        supprimer.addActionListener(test);
        
    }
    
    public JPanel ajout_supp_fondtext(){
        
        ajout_fondtext.setLayout(new FlowLayout());
        ajout_fondtext.add(text);
        return ajout_fondtext;
   
    }
    
    public JPanel ajout_fond_amount(){
        
        cle_ajout_jtfi.setPreferredSize(new Dimension(100,30));
        amount_ajout_jtfi.setPreferredSize(new Dimension(100,30));
        
        cle_supp_jtfi.setPreferredSize(new Dimension(100,30));
        amount_supp_jtfi.setPreferredSize(new Dimension(100,30));
        
        panajout.add(textfield3);
        panajout.add(cle_ajout_jtfi);
        panajout.add(textfield4);
        panajout.add(amount_ajout_jtfi);
        
        pansupp.add(textfield);
        pansupp.add(cle_supp_jtfi);
        pansupp.add(textfield2);
        pansupp.add(amount_supp_jtfi);
        
        panfield.add(panajout);
        panboutonajouter.add(ajouter);
        
        panfield1.add(pansupp);
        panboutonsupprimer.add(supprimer);
        
        panajout_supp.setLayout(new GridLayout(6,5));
        panajout_supp.add(text2);
        panajout_supp.add(panfield);
        panajout_supp.add(panboutonajouter);
        panajout_supp.add(text3);
        panajout_supp.add(panfield1);
        panajout_supp.add(panboutonsupprimer);
        
       
    
        return panajout_supp;
        
    }

    
}
