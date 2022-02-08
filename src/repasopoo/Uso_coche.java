package repasopoo;

import javax.swing.JOptionPane;

public class Uso_coche {

    public static void main(String[] args) {
       Coche Renault= new Coche(); //Instanciar una clase
       // System.out.println("Este coche tiene " + Renault.getRuedas() + " " + Renault.dame_largo());
       // System.out.println("Este coche tiene " + Renault.ruedas);
       //Renault.establece_color();
       Renault.estable_color("amarillo");
     //  Renault.color= "Negro perlado";
       System.out.println("" + Renault.dime_color());
        System.out.println("" + Renault.dime_datosgenerales());
       // Renault.configura_asientos("si");
       Renault.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero???"));
        System.out.println("" + Renault.dime_asientos());
    }
    
}
