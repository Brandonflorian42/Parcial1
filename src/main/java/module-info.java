module com.example.parcial1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.parcial1 to javafx.fxml;
    exports com.example.parcial1;
}