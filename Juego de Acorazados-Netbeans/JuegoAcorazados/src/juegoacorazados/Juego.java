package juegoacorazados;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


class Juego extends JFrame{
   static JOptionPane jop=new JOptionPane();
   JLayeredPane oceano=new JLayeredPane();
   JPanel Agua=new JPanel();
   JPanel panel1;
   static JButton boton;
        Juego(){
            setTitle(" Batalla de Acorazados");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(900,500);
            setResizable(false);
            setLocationRelativeTo(null);
            JLabel jl=new JLabel();
            Agua.setSize(700,400);
            Agua.setLocation(100,50);
            JLabel aguaFondo=new JLabel();
            aguaFondo.setSize(700,400);
            aguaFondo.setIcon(new ImageIcon("src//imagenes//marLF.jpg"));
            Agua.add(aguaFondo);
            Agua.setVisible(true);
            jl.setLocation(0,0);
            jl.setSize(900,500);
            jl.setIcon(new ImageIcon("src//imagenes//fondo.jpg"));
            oceano.add(jl,new Integer(1));
            oceano.add(Agua,new Integer(2));
            boton=new JButton(" Coloca tus 5 barcos para poder comenzar");
            boton.setSize(new Dimension(400,40));
            boton.setOpaque(false);
            boton.setBorderPainted(false);
            boton.setContentAreaFilled(false);
            boton.setLocation(200,10);
            boton.setEnabled(false);
            boton.addActionListener(comenzar);
            oceano.add(boton,new Integer(3));
            Preparar();

            add(oceano);
        }

    ActionListener comenzar = new ActionListener(){
    @Override
        public void actionPerformed(ActionEvent ae) {
            Pelear();
            boton.setEnabled(false);
        }
    };
     
    void Preparar(){
        panel1=new Preparando();
        oceano.add(panel1,new Integer(3));
    }
    
    void Pelear(){
        oceano.remove(panel1);
        panel1=new Jugando();
        oceano.add(panel1,new Integer(3));
        oceano.setVisible(true);
    }
}
