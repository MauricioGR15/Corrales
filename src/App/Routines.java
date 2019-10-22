package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

public class Routines {


    public void soundAlert(KeyEvent evt, JTextField aux, int size){
        if(aux.getText().length() > size){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }

    public boolean verifyExpression(String cadena, String expr){
        Pattern pat = Pattern.compile(expr);
        return pat.matcher(cadena).find();
    }

    public void msgError(String msg){
        JOptionPane.showMessageDialog(null,msg,"ERROR",JOptionPane.ERROR_MESSAGE);
    }

    public void msgExito(){
        JOptionPane.showMessageDialog(null,"Se ha registrado con éxito","CORRECTO",JOptionPane.INFORMATION_MESSAGE);
    }



}
