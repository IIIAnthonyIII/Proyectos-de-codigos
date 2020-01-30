package juegoacorazados;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Jugando extends JPanel{
JButton botones[][]=new JButton[10][10];
    Jugando(){
        setSize(700,400);
        setLocation(100,50);
        this.setOpaque(false);
        GridLayout mapa=new GridLayout(10,10);
        this.setLayout(mapa);
        Pelea();
    }
    
    void Pelea(){
        this.setVisible(false);
        for(int a=0;a<10;a++){
            for(int b=0;b<10;b++){
                botones[a][b]=defBotones2(a,b);
                this.add(botones[a][b]);
            }
        }
    this.setVisible(true);
    }

    JButton defBotones2(final int tres,final int cuatro){
        final JButton boton2=new JButton();
        boton2.setSize(new Dimension(70,40));
        boton2.setOpaque(false);
        boton2.setContentAreaFilled(false);
        boton2.setVisible(true);
        boton2.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
                if(Preparando.coordenadas[tres][cuatro]==0||Preparando.coordenadas[tres][cuatro]==6||Preparando.coordenadas[tres][cuatro]==7){
                    switch(Preparando.coordenadas[tres][cuatro]){
                        case 0: Preparando.coordenadas[tres][cuatro]=1;
                                boton2.setIcon(new ImageIcon("src//imagenes//fallido.png"));
                                break;
                        case 6: Preparando.coordenadas[tres][cuatro]=5;
                                boton2.setIcon(new ImageIcon("src//imagenes//enemigoHundido.png"));
                                Preparando.AcorazadoEnemigo--;
                                JOptionPane.showMessageDialog(PantallaInicial.J, "Tu proyectíl impactó un Acorazado enemigo \n Barcos amigos : "+Preparando.AcorazadoAmigo+" \n Barcos enemigos : "+Preparando.AcorazadoEnemigo, "Bien hecho!",JOptionPane.INFORMATION_MESSAGE);
                                break;
                        case 7: Preparando.coordenadas[tres][cuatro]=8;
                                boton2.setIcon(new ImageIcon("src//imagenes//amigoHundido.png"));
                                Preparando.AcorazadoAmigo--;
                                JOptionPane.showMessageDialog(PantallaInicial.J,"Tu proyectíl destruyó un Acorazado amigo \n Barcos amigos : "+Preparando.AcorazadoAmigo+" \n Barcos enemigos : "+Preparando.AcorazadoEnemigo, "Cometimos errores",JOptionPane.WARNING_MESSAGE);
                                break;
                    }
                
                    if(Preparando.AcorazadoAmigo>0&&Preparando.AcorazadoEnemigo>0){
                    int  x,y;
                        do{
                            x=(int)(Math.random()*10);
                            y=(int)(Math.random()*10);
                        }while(Preparando.coordenadas[x][y]!=0&&Preparando.coordenadas[x][y]!=6&&Preparando.coordenadas[x][y]!=7);
                        
                        switch(Preparando.coordenadas[x][y]){
                            case 0: Preparando.coordenadas[x][y]=1;
                                    botones[x][y].setIcon(new ImageIcon("src//imagenes//fallido.png"));
                                    break;
                            case 6: Preparando.coordenadas[x][y]=5;
                                    botones[x][y].setIcon(new ImageIcon("src//imagenes//enemigoHundido.png"));
                                    Preparando.AcorazadoEnemigo--;
                                    JOptionPane.showMessageDialog(PantallaInicial.J,"El enemigo destruyó su propio Acorazado \n Barcos amigos : "+Preparando.AcorazadoAmigo+" \n Barcos enemigos : "+Preparando.AcorazadoEnemigo, "En hora buena!",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                            case 7: Preparando.coordenadas[x][y]=8;
                                    botones[x][y].setIcon(new ImageIcon("src//imagenes//amigoHundido.png"));
                                    Preparando.AcorazadoAmigo--;
                                    JOptionPane.showMessageDialog(PantallaInicial.J,"Un proyectíl enemigo hundío un Acorazado amigo \n Barcos amigos : "+Preparando.AcorazadoAmigo+" \n Barcos enemigos : "+Preparando.AcorazadoEnemigo, "Sufrimos bajas!",JOptionPane.WARNING_MESSAGE);
                                    break;
                        }
                
                        if(Preparando.AcorazadoAmigo==0||Preparando.AcorazadoEnemigo==0){
                        estatusFinal();
                            if(Preparando.AcorazadoAmigo==0){
                                JOptionPane.showMessageDialog(PantallaInicial.J,"Toda tu flota fue hundida", " Hemos perdido",JOptionPane.WARNING_MESSAGE);
                            }
                            if(Preparando.AcorazadoEnemigo==0){
                                JOptionPane.showMessageDialog(PantallaInicial.J,"Acabamos con toda la flota enemiga", " Victoria!!",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }else{
                        estatusFinal();
                        if(Preparando.AcorazadoAmigo==0){
                            JOptionPane.showMessageDialog(PantallaInicial.J,"Toda tu flota fue hundida", " Hemos perdido",JOptionPane.WARNING_MESSAGE);
                        }
                        if(Preparando.AcorazadoEnemigo==0){
                            JOptionPane.showMessageDialog(PantallaInicial.J,"Acabamos con toda la flota enemiga", " Victoria!!",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        });
    return boton2;
    } 
    void estatusFinal(){
        this.removeAll();
        this.setVisible(false);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                JButton boton3=new JButton();
                boton3.setSize(new Dimension(70,40));
                boton3.setOpaque(false);
                boton3.setContentAreaFilled(false);
                boton3.setVisible(true);
                switch(Preparando.coordenadas[i][j]){
                    case 0: boton3.setIcon(new ImageIcon(""));
                            break;
                    case 6: boton3.setIcon(new ImageIcon("src//imagenes//acorazadoEnemigo.png"));
                            break;
                    case 7: boton3.setIcon(new ImageIcon("src//imagenes//acorazadoAmigo.png"));
                            break;
                    case 1: boton3.setIcon(new ImageIcon(""));
                            break;
                    case 5: boton3.setIcon(new ImageIcon("src//imagenes//enemigoHundido.png"));
                            break;
                    case 8: boton3.setIcon(new ImageIcon("src//imagenes//amigoHundido.png"));
                            break;    
                }
            this.add(boton3);
            }
        }
        this.setVisible(true);
    }
}
