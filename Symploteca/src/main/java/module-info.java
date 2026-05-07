module com.example.symploteca {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.symploteca to javafx.fxml;
    exports com.example.symploteca;
}