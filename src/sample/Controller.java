package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.Scanner;



public class Controller {
    public TextField Text1;
    public TextField Text2;


    private static String najduzaRijec(String[] nizrijeci) {

        String najduza = "";

        for(String rijec : nizrijeci){
            if(rijec.length() > najduza.length())
                najduza=rijec;
        }

        return najduza;
    }

    public void Submit(ActionEvent actionEvent) {

        String recenica = Text1.getText();

        String[] nizrijeci = recenica.split(" ");    // rastavljanje recenice

        String novarecenica = "";

        String najduza = najduzaRijec(nizrijeci);

        int i = 0;
        for (String rijec : nizrijeci) {
            if (najduza.equals(rijec)) {
                novarecenica = novarecenica + rijec.toUpperCase();
            } else {
                novarecenica = novarecenica + rijec;
            }
            if (i < nizrijeci.length - 1) novarecenica = novarecenica + ' ';

        }

        Text2.setText(novarecenica);
    }

}
