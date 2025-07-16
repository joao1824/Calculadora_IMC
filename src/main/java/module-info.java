module com.example.calculadoraimc {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.calculadoraimc to javafx.fxml;
    exports com.example.calculadoraimc;
}