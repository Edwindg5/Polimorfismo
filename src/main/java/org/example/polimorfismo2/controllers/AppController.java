package org.example.polimorfismo2.controllers;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.polimorfismo2.App;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import org.example.polimorfismo2.models.Student;

public class AppController {

    public AnchorPane ancApp;
    public Button base3;
    public Button base1;
    public Button base2;
    public Button closeButton;
    public Button addButton;
    public Button updataButton;
    @FXML
    private Button saveButton;
    public void onMouseClickedBase1(MouseEvent event) {App.newStage("dbs1-view","App Dbs-view");}

    public void onMouseClickedBase2(MouseEvent event) {App.newStage("dbs2-view","App Dbs2-view");}

    public void onMouseClickedCerrar(MouseEvent event) {
        Platform.exit();
    }

    public void onMouseClickedAñadir(MouseEvent event) {App.newStage("add-view","App Add-view");}

    public void onMouseClickedUpdata(MouseEvent event) {App.newStage("upData-view","App UpData-view");}

    public void onMouseClickedBase3(MouseEvent event) {App.newStage("dbs3-view","App Dbs3-view");}
}
