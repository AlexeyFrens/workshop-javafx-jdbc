module com.alexey.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens com.alexey.workshopjavafxjdbc to javafx.fxml;
    exports com.alexey.workshopjavafxjdbc;

    opens com.alexey.workshopjavafxjdbc.util to javafx.fxml;
    exports com.alexey.workshopjavafxjdbc.util;

    opens com.alexey.workshopjavafxjdbc.gui to javafx.fxml;

    opens com.alexey.workshopjavafxjdbc.model.entities to javafx.fxml;
    exports com.alexey.workshopjavafxjdbc.model.entities;

    opens com.alexey.workshopjavafxjdbc.model.services to javafx.fxml;
    exports com.alexey.workshopjavafxjdbc.model.services;

    opens com.alexey.workshopjavafxjdbc.listeners to javafx.fxml;
    exports com.alexey.workshopjavafxjdbc.listeners;
}