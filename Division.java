import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Division {

    static ImageIcon img = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\division.png");
    static ImageIcon imgError = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\error.png");
    static String salir[] = {"Salir"};

    static int resultado;

    public static void divion() {

        int primerNum = Integer.parseInt((String) JOptionPane.showInputDialog(

        null,
        "Ingresá el primer número",
        "División", 
        JOptionPane.INFORMATION_MESSAGE,
        img,
         null,
          ""));
          
          int segunNum = Integer.parseInt((String) JOptionPane.showInputDialog(

          null,
          "Ingresá el segundo número",
          "División", 
          JOptionPane.INFORMATION_MESSAGE,
           img,
           null,
            ""));

            if(segunNum == 0) {

                JOptionPane.showOptionDialog (

                null, 
                "No se puede dividir entre 0", 
                "Error", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                imgError, 
                salir, 
                0);

            } else {

                JOptionPane.showOptionDialog (
                    
                null, 
                "El resultado de la división es " + (primerNum / segunNum), 
                "Resultado", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                img, 
                salir, 
                0);

                resultado = primerNum / segunNum;

                Historial.historial.add(resultado);

            }
        
    }

    public static int getResultado() {

        return resultado;

    }

}