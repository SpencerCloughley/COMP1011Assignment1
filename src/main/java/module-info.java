module com.example.comp1011assignment1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.comp1011assignment1 to javafx.fxml;
    exports com.example.comp1011assignment1;
}