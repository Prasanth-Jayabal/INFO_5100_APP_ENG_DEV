/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.model;

/**
 * FXML Controller class
 *
 * @author prasanthj
 */


public class PrimaryViewFXMLController {
    public TextField nameField;
    public TextField ageField;
    public TextField emailField;
    public Button submitButton;

    public void handleSubmit() {
        String name = nameField.getText();
        String ageText = ageField.getText();
        String email = emailField.getText();

        if (name.isEmpty() || ageText.isEmpty() || email.isEmpty()) {
            showAlert("All fields must be filled!");
            return;
        }

        try {
            int age = Integer.parseInt(ageText);
            model user = new model(name, age, email);
            showAlert("User Details:\nName: " + user.getName() + "\nAge: " + user.getAge() + "\nEmail: " + user.getEmail());
        } catch (NumberFormatException e) {
            showAlert("Age must be a number!");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("User Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
