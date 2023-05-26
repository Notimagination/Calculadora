import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Historial {

    static ArrayList<Integer> historial = new ArrayList<Integer>();
    static String guardar;

    static URL iconRecord = Menu.class.getClassLoader().getResource("Recursos/record.png");

    static ImageIcon imgRecord = new ImageIcon(iconRecord);
    static String salir[] = {"Salir"};

    public static void historial() {

        if(historial.isEmpty()) {

            JOptionPane.showOptionDialog (

            null, 
            "Actualmente no tenés nada en el historial", 
            "Historial", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.PLAIN_MESSAGE, 
            imgRecord, 
            salir, 
            0);

        } else {

            String estetica = historial.toString().replace("[", "").replace("]", "").replace(",", "\n                      ");
            guardar = estetica;

            JOptionPane.showOptionDialog (

            null, 
            "Historial de tus últimas operaciones\n\n                       " + guardar, 
            "Historial", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.PLAIN_MESSAGE, 
            imgRecord, 
            salir, 
            0);

        }
    
    }

}
