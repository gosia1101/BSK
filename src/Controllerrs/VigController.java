package Controllerrs;

import javafx.fxml.FXML;

public class VigController {
    private MainController mainController;

    @FXML
    public void backMenu(){


        mainController.loadMenu();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}
