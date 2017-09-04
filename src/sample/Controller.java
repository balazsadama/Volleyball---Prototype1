package sample;

import com.sun.corba.se.spi.oa.ObjectAdapterFactory;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML TreeView<String> treeView;

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
    }



}
