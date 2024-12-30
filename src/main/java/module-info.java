module com.alexey.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.alexey.workshopjavafxjdbc to javafx.fxml;
    exports com.alexey.workshopjavafxjdbc;

    opens com.alexey.workshopjavafxjdbc.util to javafx.fxml;
    exports com.alexey.workshopjavafxjdbc.util;

    opens com.alexey.workshopjavafxjdbc.gui to javafx.fxml;
}