package com.alexey.workshopjavafxjdbc;

import com.alexey.workshopjavafxjdbc.model.services.DepartmentService;
import com.alexey.workshopjavafxjdbc.model.services.SellerService;
import com.alexey.workshopjavafxjdbc.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.function.Consumer;

public class HelloController {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction() {
        loadView("gui/SellerList.fxml", (SellerListController controller) -> {
            controller.setSellerService(new SellerService());
            controller.updateTableView();
        });
    }

    @FXML
    public void onMenuItemDepartmentAction() {
        loadView("gui/DepartmentList.fxml", (DepartmentListController controller) -> {
            controller.setDepartmentService(new DepartmentService());
            controller.updateTableView();
        });
    }

    @FXML
    public void onMenuItemAboutAction() {
        loadView("gui/About.fxml", x -> {});
    }

    private synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAction) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVbox = fxmlLoader.load();

            Scene scene = HelloApplication.getScene();
            VBox mainVbox = (VBox) ((ScrollPane) scene.getRoot()).getContent();

            Node mainMenu = mainVbox.getChildren().getFirst();
            mainVbox.getChildren().clear();
            mainVbox.getChildren().add(mainMenu);
            mainVbox.getChildren().addAll(newVbox.getChildren());

            T controller = fxmlLoader.getController();
            initializingAction.accept(controller);

        } catch (IOException e) {
            Alerts.showAlert("IO Exception", "Erro ao carregar página", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}