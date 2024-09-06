module com.example.chasisdashboard {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.chasisdashboard to javafx.fxml;
    exports com.example.chasisdashboard;
}