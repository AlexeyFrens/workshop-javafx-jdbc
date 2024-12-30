module com.alexey.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alexey.workshopjavafxjdbc to javafx.fxml;
    exports com.alexey.workshopjavafxjdbc;
}