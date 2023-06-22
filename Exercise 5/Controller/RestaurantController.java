package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Jollibee jollibee = new Jollibee();
    MangInasal manginasal = new MangInasal();
    KFC kfc = new KFC();
    Mcdo mcdo = new Mcdo();
    Popeyes popeyes = new Popeyes();

    public void initialize() {

        jollibee.setProduct("Cake");
        jollibee.setTaste("Very Sweet");

        manginasal.setProduct("Barbeque");
        manginasal.setTaste("Savory");

        kfc.setProduct("Fried Chicken");
        kfc.setTaste("Crispy");

        mcdo.setProduct("Chicken Nuggets");
        mcdo.setTaste("Tasty");

        popeyes.setProduct("Spaghetti");
        popeyes.setTaste("Yummy");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Mang Inasal has " + manginasal.getProduct() + " and  is " + manginasal.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Jollibee has " + jollibee.getProduct() + " and is " + jollibee.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("KFC has " + kfc.getProduct() + " and is " + kfc.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Mcdo has " + mcdo.getProduct() + " and is " + mcdo.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Popeyes has " + popeyes.getProduct() + " and is " + popeyes.getTaste());
        }
        
        alert.showAndWait();

    }
}
