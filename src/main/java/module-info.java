module org.example.polimorfismo2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.polimorfismo2 to javafx.fxml;
    exports org.example.polimorfismo2;
    exports org.example.polimorfismo2.controllers;
    opens org.example.polimorfismo2.controllers to javafx.fxml;
}