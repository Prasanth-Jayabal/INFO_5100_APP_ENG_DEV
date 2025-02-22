/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author prasanthj
 */

public class viewFXMain extends Application {
    @Override
public void start(Stage primaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/PrimaryViewFXML.fxml")); // Fix path
    VBox root = loader.load();
    
    Scene scene = new Scene(root);
    primaryStage.setTitle("JavaFX Form");
    primaryStage.setScene(scene);
    primaryStage.show();
}

    
    public static void main(String[] args) {
        launch(args);
    }
}