package org.example.polimorfismo2.controllers;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import org.example.polimorfismo2.App;
import org.example.polimorfismo2.models.Student;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Dbs2Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn matriculaColumn;

    @FXML
    private TableColumn nombreColumn;

    @FXML
    private TableView<Student> studentsTable;

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void initialize() {
        ObservableList<Student> students = FXCollections.observableArrayList();
        ArrayList<Student> estudiantes;
        estudiantes = App.getDbs().getStudentDbs2();
        this.matriculaColumn.setCellValueFactory(new PropertyValueFactory("matricula"));
        this.nombreColumn.setCellValueFactory(new PropertyValueFactory("nombre"));
        students.addAll(estudiantes);
        studentsTable.setItems(students);
    }

}
