import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class Menu {

    public static void playSound(URL sonidos) {
        
        try 
        
        {
            
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(sonidos);

            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        
        }
        
        catch(Exception ex)
        
        {
            
            ex.printStackTrace( );
        
        }
    
    }

    public static void menuPrincipal() {

        JFrame menuPrincipal = new JFrame("Calculadora");

        URL sonidoOperaciones = Menu.class.getClassLoader().getResource("Sonidos/clic_2.wav");
        URL sonidoExtras = Menu.class.getClassLoader().getResource("Sonidos/clic.wav");
        URL sonidoCerrar = Menu.class.getClassLoader().getResource("Sonidos/close.wav");

        URL getIconSuma = Menu.class.getClassLoader().getResource("Recursos/plus.png");
        URL getIconRes = Menu.class.getClassLoader().getResource("Recursos/substract.png");
        URL getIconMult = Menu.class.getClassLoader().getResource("Recursos/multiplication.png");
        URL getIconDiv = Menu.class.getClassLoader().getResource("Recursos/division.png");
        URL getIconHist = Menu.class.getClassLoader().getResource("Recursos/record.png");
        URL getIconCerrar = Menu.class.getClassLoader().getResource("Recursos/close.png");
        URL getIconGit = Menu.class.getClassLoader().getResource("Recursos/github.png");

        URL iconPrincipal = Menu.class.getClassLoader().getResource("Recursos/main.png");
        URL background = Menu.class.getClassLoader().getResource("Recursos/background.jpg");
        
        Icon iconSuma = new ImageIcon(getIconSuma);
        Icon iconResta = new ImageIcon(getIconRes);
        Icon iconMultip = new ImageIcon(getIconMult);
        Icon iconDiv = new ImageIcon(getIconDiv);
        Icon iconHist = new ImageIcon(getIconHist);
        Icon iconCerrar = new ImageIcon(getIconCerrar);
        Icon iconGit = new ImageIcon(getIconGit);

        ImageIcon img = new ImageIcon(iconPrincipal);

        JButton botonSuma = new JButton(iconSuma);

        botonSuma.setBorderPainted(false);
        botonSuma.setFocusPainted(false);
        botonSuma.setContentAreaFilled(false);

        JButton botonResta = new JButton(iconResta);

        botonResta.setBorderPainted(false);
        botonResta.setFocusPainted(false);
        botonResta.setContentAreaFilled(false);

        JButton botonMultip = new JButton(iconMultip);

        botonMultip.setBorderPainted(false);
        botonMultip.setFocusPainted(false);
        botonMultip.setContentAreaFilled(false);

        JButton botonDiv = new JButton(iconDiv);

        botonDiv.setBorderPainted(false);
        botonDiv.setFocusPainted(false);
        botonDiv.setContentAreaFilled(false);

        JButton botonHist = new JButton(iconHist);

        botonHist.setBorderPainted(false);
        botonHist.setFocusPainted(false);
        botonHist.setContentAreaFilled(false);

        JButton botonCerrar = new JButton(iconCerrar);

        botonCerrar.setBorderPainted(false);
        botonCerrar.setFocusPainted(false);
        botonCerrar.setContentAreaFilled(false);

        JButton botonGit = new JButton(iconGit);

        botonGit.setBorderPainted(false);
        botonGit.setFocusPainted(false);
        botonGit.setContentAreaFilled(false);

        JButton texto = new JButton("Versión 1.5");

        texto.setBorderPainted(false);
        texto.setFocusPainted(false);
        texto.setContentAreaFilled(false);
        texto.setFont(new Font("Texto", Font.ITALIC, 17));
        texto.setForeground(Color.MAGENTA);

        botonSuma.setBounds(80,20,50,50);
        botonResta.setBounds(155,20,50,50);
        botonMultip.setBounds(80,90,50,50);
        botonDiv.setBounds(155,90,50,50);
        botonHist.setBounds(10,80,50,50);
        botonCerrar.setBounds(10, 140,50,50);
        botonGit.setBounds(230, 140,50,50);
        texto.setBounds(80, 115,120,120);

        try {

            menuPrincipal.setContentPane(new JLabel(new ImageIcon(ImageIO.read(background))));

        } catch (IOException e) {

            e.printStackTrace();
        }
        
        menuPrincipal.setResizable(false);
        menuPrincipal.setIconImage(img.getImage());
        menuPrincipal.add(botonSuma);
        menuPrincipal.add(botonResta);
        menuPrincipal.add(botonMultip);
        menuPrincipal.add(botonDiv);
        menuPrincipal.add(botonHist);
        menuPrincipal.add(botonCerrar);
        menuPrincipal.add(botonGit);
        menuPrincipal.add(texto);
        menuPrincipal.setSize(300,230);
        menuPrincipal.setLocationRelativeTo(null);
        menuPrincipal.setLayout(null);
        menuPrincipal.setVisible(true);
        menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuPrincipal.setIconImage(Toolkit.getDefaultToolkit().getImage(iconPrincipal));

        botonSuma.addActionListener(new ActionListener() {  
            
            public void actionPerformed(ActionEvent e){

                playSound(sonidoOperaciones);

                Suma.suma();

            }
        
        });
   
        botonResta.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                playSound(sonidoOperaciones);
                
                Resta.resta();
            
            }
        
        });
        
        botonMultip.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                playSound(sonidoOperaciones);

                Multiplicacion.multiplicacion();
            
            }
        
        });

        botonDiv.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                playSound(sonidoOperaciones);

                Division.divion();

            }
        
        });

        botonHist.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                playSound(sonidoExtras);

                Historial.historial();

            }
        
        });

        botonCerrar.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                playSound(sonidoCerrar);

                try {
                    
                    TimeUnit.SECONDS.sleep(1);

                } catch (InterruptedException e1) {

                    e1.printStackTrace();

                }
    
                System.exit(0);

            }
        
        });

        botonGit.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                playSound(sonidoExtras);

                try {

                    Desktop.getDesktop().browse(new URL("https://github.com/Notimagination/Calculadora").toURI());

                } catch (Exception error) {}

            }
        
        });

    }
    
}
