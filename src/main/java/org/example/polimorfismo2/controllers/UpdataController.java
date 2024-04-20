package org.example.polimorfismo2.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.example.polimorfismo2.App;
import org.example.polimorfismo2.models.Student;

public class UpdataController {

    @FXML
    private TextField textFieldMatricula;

    @FXML
    private TextField textFieldNombre;

    @FXML
    private Button updataButton;

    @FXML
    void onMouseClickedGuardar(MouseEvent event) {

        if (textFieldMatricula.getText().trim().isEmpty() || textFieldNombre.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Los campos están vacíos");
            alert.showAndWait();
        } else {
            try {
                int matricula = Integer.parseInt(textFieldMatricula.getText());
                String nombre = textFieldNombre.getText();
                Student student = new Student(matricula, nombre);
                if (App.getDbs().updataStudent(student)) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Notificación");
                    alert.setContentText("Los datos se han guardado exitosamente");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setContentText("Los datos no se han piodido guardar");
                    alert.showAndWait();
                }
            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("Formato incorrecto, solo puedeingresar números en la matrícula" + e.getMessage());
                alert.showAndWait();
            }
        }
    }
}
