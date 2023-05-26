import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Suma {
    
    static URL iconSuma = Menu.class.getClassLoader().getResource("Recursos/plus.png");
    static ImageIcon imgSuma = new ImageIcon(iconSuma);
    static String salir[] = {"Salir"};

    static int resultado;

    public static void suma() {

        int primerNum = Integer.parseInt((String) JOptionPane.showInputDialog(

                null,
                "Ingresá el primer número",
                "Suma", 
                JOptionPane.INFORMATION_MESSAGE,
                imgSuma,
                 null,
                  ""));

        int segunNum = Integer.parseInt((String) JOptionPane.showInputDialog(

                  null,
                  "Ingresá el segundo número",
                  "Suma", 
                  JOptionPane.INFORMATION_MESSAGE,
                  imgSuma,
                   null,
                    ""));

        JOptionPane.showOptionDialog (

            null, 
            "El resultado de la suma es " + (primerNum + segunNum), 
            "Resultado", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.PLAIN_MESSAGE, 
            imgSuma, 
            salir, 
            0);
            
            resultado = primerNum + segunNum;
            
            Historial.historial.add(resultado);
        
    }

    public static int getResultado() {

        return resultado;

    }


}
