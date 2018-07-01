
package Clases;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author nuvol
 */
public class Celda extends JButton {
    private int x;
    private int y;
    private int tipoCelda;
    private boolean visible;

    public Celda(int x, int y) {
        this.x = x;
        this.y = y;   
        this.visible=false;
        this.setMinimumSize(new Dimension(33,9));
        this.setBackground(new java.awt.Color(0,0,204));
        this.setFont(new java.awt.Font("Tahoma",1,12));
        this.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               celdaActionPerformed(evt);
            }
        });
    }

    public void setTipoCelda(int tipoCelda) {
        this.tipoCelda = tipoCelda;
    }
    
    
    private void celdaActionPerformed(java.awt.event.ActionEvent evt){
        
        if(!visible){
            this.visible=true;
            switch(this.tipoCelda){
                case 0:
                    this.setIcon(defaultIcon);
                    break;
                case 1:
                default:
                    throw new AssertionError();
            }
        }
        System.out.println(tipoCelda);
    }
    
    
}
