import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Resta {

    static ImageIcon img = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\substract.png");
    static String salir[] = {"Salir"};

    static int resultado;

    public static void resta() {

        int primerNum = Integer.parseInt((String) JOptionPane.showInputDialog(

                null,
                "Ingresá el primer número",
                "Resta", 
                JOptionPane.INFORMATION_MESSAGE,
                img,
                 null,
                  ""));

        int segunNum = Integer.parseInt((String) JOptionPane.showInputDialog(

                  null,
                  "Ingresá el segundo número",
                  "Resta", 
                  JOptionPane.INFORMATION_MESSAGE,
                   img,
                   null,
                    ""));
        
        JOptionPane.showOptionDialog (

                    null, 
                    "El resultado de la resta es " + (primerNum - segunNum), 
                    "Resultado", 
                    JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.PLAIN_MESSAGE, 
                    img, 
                    salir, 
                    0);

        resultado = primerNum - segunNum;

        Historial.historial.add(resultado);

    }

    public static int getResultado() {

        return resultado;

    }

}
