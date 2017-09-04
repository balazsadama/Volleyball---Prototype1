package sample;

import com.sun.corba.se.spi.oa.ObjectAdapterFactory;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML TreeView<String> treeView;
    @FXML Button setter, leftSide1, leftSide2, rightSide, center1, center2;

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        parent.getChildren().add(item);
        return item;
    }

    public void initTreeView(){
        TreeItem<String> root, serveReceive, offence, defence;

        root = new TreeItem<>();
        root.setExpanded(true);

        serveReceive = makeBranch("Serve Receive", root);
        serveReceive.setExpanded(true);
        makeBranch("Rotation 1", serveReceive);
        makeBranch("Rotation 2", serveReceive);
        makeBranch("Rotation 3", serveReceive);
        makeBranch("Rotation 4", serveReceive);
        makeBranch("Rotation 5", serveReceive);
        makeBranch("Rotation 6", serveReceive);

        offence = makeBranch("Offence", root);
        makeBranch("Coming soon", offence);

        defence = makeBranch("Defence", root);
        makeBranch("Coming soon", defence);

        treeView.setRoot(root);
        treeView.setShowRoot(false);
    }

    // initialize treeView
    public void initialize() {

        initTreeView();

        // adding a listener
        treeView.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue, newValue) -> {
                    if (newValue.getValue() == "Rotation 1")
                        receive1();
                    else if (newValue.getValue() == "Rotation 2")
                        receive2();
                    else if (newValue.getValue() == "Rotation 3")
                        receive3();
                    else if (newValue.getValue() == "Rotation 4")
                        receive4();
                    else if (newValue.getValue() == "Rotation 5")
                        receive5();
                    else
                        receive6();
                });
    }

    public void receive1(){
        setter.setLayoutX(530);
        setter.setLayoutY(160);
        leftSide1.setLayoutX(530);
        leftSide1.setLayoutY(90);
        leftSide2.setLayoutX(200);
        leftSide2.setLayoutY(445);
        rightSide.setLayoutX(60);
        rightSide.setLayoutY(325);
        center1.setLayoutX(375);
        center1.setLayoutY(445);
        center2.setLayoutX(515);
        center2.setLayoutY(325);
    }

    public void receive2(){
        setter.setLayoutX(330);
        setter.setLayoutY(140);
        leftSide1.setLayoutX(375);
        leftSide1.setLayoutY(445);
        leftSide2.setLayoutX(60);
        leftSide2.setLayoutY(325);
        rightSide.setLayoutX(270);
        rightSide.setLayoutY(70);
        center1.setLayoutX(200);
        center1.setLayoutY(445);
        center2.setLayoutX(515);
        center2.setLayoutY(325);
    }

    public void receive3(){
        setter.setLayoutX(50);
        setter.setLayoutY(140);
        leftSide1.setLayoutX(200);
        leftSide1.setLayoutY(445);
        leftSide2.setLayoutX(60);
        leftSide2.setLayoutY(325);
        rightSide.setLayoutX(515);
        rightSide.setLayoutY(325);
        center1.setLayoutX(20);
        center1.setLayoutY(55);
        center2.setLayoutX(375);
        center2.setLayoutY(445);
    }

    public void receive4(){
        setter.setLayoutX(50);
        setter.setLayoutY(60);
        leftSide1.setLayoutX(60);
        leftSide1.setLayoutY(350);
        leftSide2.setLayoutX(515);
        leftSide2.setLayoutY(290);
        rightSide.setLayoutX(375);
        rightSide.setLayoutY(445);
        center1.setLayoutX(290);
        center1.setLayoutY(60);
        center2.setLayoutX(200);
        center2.setLayoutY(445);
    }

    public void receive5(){
        setter.setLayoutX(290);
        setter.setLayoutY(60);
        leftSide1.setLayoutX(50);
        leftSide1.setLayoutY(60);
        leftSide2.setLayoutX(375);
        leftSide2.setLayoutY(445);
        rightSide.setLayoutX(200);
        rightSide.setLayoutY(445);
        center1.setLayoutX(515);
        center1.setLayoutY(290);
        center2.setLayoutX(60);
        center2.setLayoutY(350);
    }

    public void receive6() {
        setter.setLayoutX(450);
        setter.setLayoutY(60);
        leftSide1.setLayoutX(290);
        leftSide1.setLayoutY(60);
        leftSide2.setLayoutX(375);
        leftSide2.setLayoutY(445);
        rightSide.setLayoutX(200);
        rightSide.setLayoutY(445);
        center1.setLayoutX(515);
        center1.setLayoutY(325);
        center2.setLayoutX(60);
        center2.setLayoutY(325);
    }
}
