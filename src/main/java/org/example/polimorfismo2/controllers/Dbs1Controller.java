package org.example.polimorfismo2.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import org.example.polimorfismo2.App;
import org.example.polimorfismo2.models.Student;

import java.util.ArrayList;

public class Dbs1Controller {
    @FXML
    private TableView<Student> studentsTable;

    @FXML
    private TableColumn matriculaColumn;

    @FXML
    private TableColumn nombreColumn;

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {
        App.getStageView().close();
    }
    private ObservableList<Student> students;
    @FXML
    void initialize() {
        students = FXCollections.observableArrayList();
        ArrayList<Student> estudiantes;
        estudiantes = App.getDbs().getStudentDbs1();
        this.matriculaColumn.setCellValueFactory(new PropertyValueFactory("matricula"));
        this.nombreColumn.setCellValueFactory(new PropertyValueFactory("nombre"));
        for (int i = 0; i < estudiantes.size(); i++) {
            students.add(estudiantes.get(i));
        }
        studentsTable.setItems(students);
    }

}
