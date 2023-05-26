import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Multiplicacion {

    static URL iconMult = Menu.class.getClassLoader().getResource("Recursos/multiplication.png");
    static ImageIcon imgMult = new ImageIcon(iconMult);

    static String salir[] = {"Salir"};

    static int resultado;

    public static void multiplicacion() {

        int primerNum = Integer.parseInt((String) JOptionPane.showInputDialog(

        null,
        "Ingresá el primer número",
        "Multiplicación", 
        JOptionPane.INFORMATION_MESSAGE,
        imgMult,
         null,
          ""));
          
          int segunNum = Integer.parseInt((String) JOptionPane.showInputDialog(

          null,
          "Ingresá el segundo número",
          "Multiplicación", 
          JOptionPane.INFORMATION_MESSAGE,
          imgMult,
           null,
            ""));
            
          JOptionPane.showOptionDialog (

            null, 
            "El resultado de la multiplicación es " + (primerNum * segunNum), 
            "Resultado", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.PLAIN_MESSAGE, 
            imgMult, 
            salir, 
            0);
            
            resultado = primerNum * segunNum;

        Historial.historial.add(resultado);
        
    }

    public static int getResultado() {

        return resultado;

    }
    
}
