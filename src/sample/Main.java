package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    private static String najduzaRijec(String[] nizrijeci) {

        String najduza = "";

        for(String rijec : nizrijeci){
            if(rijec.length() > najduza.length())
                najduza=rijec;
        }

        return najduza;
    }


    public static void main(String[] args) {

        /*String recenica = "";
        System.out.println("Unesite jednu recenicu: ");
        Scanner ulaz = new Scanner(System.in);
        recenica= ulaz.nextLine();

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
            if (i < nizrijeci.length - 1) novarecenica = novarecenica + ' ';   // ako dodje do kraja rijeci stavi razmak

*/
        launch(args);
    }
}
