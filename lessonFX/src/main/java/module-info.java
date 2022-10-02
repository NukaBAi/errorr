module com.example.lessonfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lessonfx to javafx.fxml;
    exports com.example.lessonfx;
}