package juegoacorazados;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Preparando extends JPanel{
    Preparando(){
        setSize(700,400);
        setLocation(100,50);
        this.setOpaque(false);
        GridLayout mapa=new GridLayout(10,10);
        this.setLayout(mapa);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
            coordenadas[i][j]=0;
            }
        }
    Dibujar();
    } 
static int coordenadas[][]=new int[10][10];
static int AcorazadoAmigo=0;
static int AcorazadoEnemigo=0;

    void Dibujar(){
    this.setVisible(false);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                JButton btn=defBotones(i,j);
                this.add(btn);
            }
        }
    this.setVisible(true);
    }
    
    JButton defBotones(final int unos,final int dos){
        final JButton boton=new JButton();
        boton.setSize(new Dimension(70,40));
        boton.setOpaque(false);
        boton.setContentAreaFilled(false);
        boton.setVisible(true);
        boton.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
                if(coordenadas[unos][dos]==0&&AcorazadoAmigo<5){
                    coordenadas[unos][dos]=7;
                    boton.setIcon(new ImageIcon("src//imagenes//acorazadoAmigo.png"));
                    AcorazadoAmigo++;
                    if(AcorazadoAmigo==5){
                        for(int barcos=0;barcos<5;barcos++){
                            int fila,columna;
                            do{
                                fila=(int)(Math.random()*10);
                                columna=(int)(Math.random()*10);
                            }while(coordenadas[fila][columna]!=0);
                            if(coordenadas[fila][columna]==0){
                                coordenadas[fila][columna]=6;
                                AcorazadoEnemigo++;
                            }
                        }
                    Juego.boton.setText("                                                      Da click aquí para comenzar");
                    Juego.boton.setEnabled(true);
                    }
                }
            }
        });
    return boton;
    }
}
