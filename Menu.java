import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Menu {

    public static void menuPrincipal() {

        JFrame menuPrincipal = new JFrame("Calculadora");
        ImageIcon img = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\main.png");
        
        Icon iconSuma = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\plus.png");
        Icon iconResta = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\substract.png");
        Icon iconMultip = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\multiplication.png");
        Icon iconDiv = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\division.png");
        Icon iconHist = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\record.png");
        Icon iconCerrar = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\close.png");
        Icon iconGit = new ImageIcon("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\github.png");

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

        JButton texto = new JButton("Versión 1.0");

        texto.setBorderPainted(false);
        texto.setFocusPainted(false);
        texto.setContentAreaFilled(false);
        texto.setFont(new Font("Texto", Font.ITALIC, 17));
        texto.setForeground(Color.YELLOW);

        botonSuma.setBounds(90,30,30,30);
        botonResta.setBounds(165,30,30,30);
        botonMultip.setBounds(90,90,30,30);
        botonDiv.setBounds(165,90,30,30);
        botonHist.setBounds(10,110,30,30);
        botonCerrar.setBounds(10, 150,30,30);
        botonGit.setBounds(240, 150,30,30);
        texto.setBounds(80, 105,120,120);
        
        menuPrincipal.setResizable(false);
        menuPrincipal.setIconImage(img.getImage());

        try {

            menuPrincipal.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\User\\Desktop\\Calculadora\\recursos\\background.jpg")))));

        } catch (IOException e) {

            e.printStackTrace();
        }

        //menuPrincipal.getContentPane().setBackground(Color.CYAN);
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

        botonSuma.addActionListener(new ActionListener() {  
            
            public void actionPerformed(ActionEvent e){

                Suma.suma();

            }
        
        });
   
        botonResta.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                
                Resta.resta();
            
            }
        
        });
        
        botonMultip.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                Multiplicacion.multiplicacion();
            
            }
        
        });

        botonDiv.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                Division.divion();

            }
        
        });

        botonHist.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                Historial.historial();

            }
        
        });

        botonCerrar.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                System.exit(0);

            }
        
        });

        botonGit.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                try {

                    Desktop.getDesktop().browse(new URL("https://github.com/Notimagination?tab=repositories").toURI());

                } catch (Exception error) {}

            }
        
        });

    }
    
}
