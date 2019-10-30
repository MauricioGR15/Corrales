package Support;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

public class Routines {

    private final String[] SALUD = {"Saludable","Enferma"};

    public String convertSalud(char c){
        if(c == 'S')
            return SALUD[0];
        else
            return SALUD[1];
    }

    public int nextInt(int max, int min){
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    public String procesada(String cad){
        if(cad == null)
            return "NO PROCESADA";
        else
            return cad;
    }

    public void soundAlert(KeyEvent evt, JTextField aux, int size){
        if(aux.getText().length() >= size){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }

    public void onlyNumbers(KeyEvent evt, JTextField aux){
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }

    public boolean borderCheck(JTextField aux, Border original){
        if(aux.getText().isEmpty()){
            aux.setBorder(BorderFactory.createLineBorder(Color.red));
            aux.requestFocus();
            return true;
        }
        else{
            aux.setBorder(original);
            aux.transferFocus();
            return false;
        }
    }

    public String salud(String c){
        if(c.equals("S")) return "Saludable";
        else return "Enferma";
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
