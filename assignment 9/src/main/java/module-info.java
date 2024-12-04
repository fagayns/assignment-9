module com.example.assignment9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment9 to javafx.fxml;
    exports com.example.assignment9;
}