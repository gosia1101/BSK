package Controllerrs;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController {


    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    public void openRa(){

        FXMLLoader loader=new FXMLLoader(this.getClass().getResource("/fxml/RailScreen.fxml"));
        Pane pane=null;
        try{

                pane=loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        RailController railController=loader.getController();
        railController.setMainController(mainController);
        mainController.setScreen(pane);

    }
    @FXML
    public void openMac(){
        FXMLLoader loader=new FXMLLoader(this.getClass().getResource("/fxml/MacierzScreen.fxml"));
        Pane pane=null;
        try{

            pane=loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MacierzController macierzController=loader.getController();
        macierzController.setMainController(mainController);
        mainController.setScreen(pane);

    }
    @FXML
    public void openCez(){
        FXMLLoader loader=new FXMLLoader(this.getClass().getResource("/fxml/CezarScreen.fxml"));
        Pane pane=null;
        try{

            pane=loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        CezarController cezarController=loader.getController();
        cezarController.setMainController(mainController);
        mainController.setScreen(pane);

    }
    @FXML
    public void openVig(){
        FXMLLoader loader=new FXMLLoader(this.getClass().getResource("/fxml/VigScreen.fxml"));
        Pane pane=null;
        try{

            pane=loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        VigController vigController=loader.getController();
        vigController.setMainController(mainController);
        mainController.setScreen(pane);

    }

    @FXML
    public void exit(){
        Platform.exit();
    }
}
