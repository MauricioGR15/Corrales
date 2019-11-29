package Support;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

public class Routines {

    private final String[] SALUD = {"Saludable","Enferma"};

    public static int nextInt(int max, int min){
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    public static String procesada(String cad){
        if(cad == null)
            return "NO PROCESADA";
        else
            return cad;
    }

    public static void soundAlert(KeyEvent evt, JTextField aux, int size){
        if(aux.getText().length() >= size){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }

    public static void onlyNumbers(KeyEvent evt, JTextField aux){
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }

    public static boolean borderCheck(JTextField aux, Border original){
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

    public static void msgError(String msg){
        JOptionPane.showMessageDialog(null,msg,"ERROR",JOptionPane.ERROR_MESSAGE);
    }

    public static void msgExito(){
        JOptionPane.showMessageDialog(null,"Se hizo con éxito","CORRECTO",JOptionPane.INFORMATION_MESSAGE);
    }

    public static ImageIcon AjustarImagen(String ico,int Ancho,int Alto) {
        ImageIcon tmpIconAux = new ImageIcon(ico);
        //Escalar Imagen
        ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(Ancho,
                Alto, Image.SCALE_SMOOTH));//SCALE_DEFAULT
        return tmpIcon;
    }



}
