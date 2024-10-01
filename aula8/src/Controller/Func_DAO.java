
package Controller;

import javax.swing.JOptionPane;


public class Func_DAO {
   
    public static void Cal1 (){
    double resp;
    
     String x  = JOptionPane.showInputDialog(null, "INSIRA SEU NOME");
    
     String y = JOptionPane.showInputDialog(null,   "INSIRA SEU PESO");
    double peso = Double.parseDouble(y);
    
     String z = JOptionPane.showInputDialog(null, " INSIRA SUA ALTURA");
    double alt = Double.parseDouble(z);
    
    resp = peso/(alt*alt);
    
    JOptionPane.showMessageDialog(null, "seu nome é " + x + " e seu IMC é " + resp);
}
    public static void gasto (){
    double Litro;
            
        String a = JOptionPane.showInputDialog(null, "quantos km você percorreu?");
       double km = Double.parseDouble(a);
       
        String b = JOptionPane.showInputDialog(null, "em quanto tempo você fez este percurso?");
       double t = Double.parseDouble(b);
       
       Litro = km/t;
       
       JOptionPane.showMessageDialog(null, "o seu carro fez " + km + " km e você gastou " + Litro + " litros de gasolina"); 
    }
    public static void info(){
        
        double dias, horas; 
        String a = JOptionPane.showInputDialog(null, "Insira o seu nome");
        
        String b = JOptionPane.showInputDialog(null, "Insira a sua idade");
     int idade = Integer.parseInt(b);
    
     dias = idade * 365;
     horas = dias * 24;
     
     JOptionPane.showMessageDialog(null, "Seu nome é " + a + " e você viveu " + dias + " dias e " + horas + " horas" );
    }
}