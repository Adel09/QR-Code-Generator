package com.crumlabs.qrfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private ImageView imageView;

    @FXML
    private TextField contentInput;

    @FXML
    public void generate(){
        String content = contentInput.getText();
        String newCon = content.replace(" ", "%20");
        String source = "http://api.qrserver.com/v1/create-qr-code/?data=" + newCon + "!&size=180x180";
        Image image = new Image(source);
        imageView.setImage(image);
    }
}