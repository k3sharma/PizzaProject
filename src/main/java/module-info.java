module main.java.ProjectFiles {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.Database to javafx.fxml;
    exports com.example.Database;
    exports com.example.Controllers;
    opens com.example.Controllers to javafx.fxml;
    opens com.example to javafx.fxml;
    exports com.example;
}
