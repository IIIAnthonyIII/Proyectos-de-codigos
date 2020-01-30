package juegoacorazados;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class PantallaInicial extends JFrame{
static Component j;
JLayeredPane presentacion=new JLayeredPane();
    PantallaInicial(){
        setTitle(" Batalla de Acorazados");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,500);
        setResizable(false);
        setLocationRelativeTo(null);
        JLabel jl=new JLabel();
        JButton boton=new JButton(" BATALLA DE ACORAZADOS ,HÁZ CLICK AQUÍ PARA EMPEZAR");
        boton.setSize(new Dimension(400,40));
        boton.setOpaque(false);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setLocation(200,10);
        boton.addActionListener(al);
        jl.setLocation(0,0);
        jl.setSize(800,500);
        jl.setIcon(new ImageIcon("src//imagenes//portada arte.jpg"));
        presentacion.add(jl,new Integer(1));
        presentacion.add(boton,new Integer(2));
        add(presentacion);
    } 
    
static Juego J;

    ActionListener al=new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            j=new Juego();
            j.setVisible(true);
            disp();
        }
    };
    
    void disp(){
        this.dispose();
    }
}
