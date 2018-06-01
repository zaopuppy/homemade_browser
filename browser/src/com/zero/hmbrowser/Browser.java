package com.zero.hmbrowser;

import com.zero.hmbrowser.log.Log;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Browser extends Application {

    private static final String TAG = "Browser";

    @FXML private Canvas canvas;

    public static void main(String[] args) {
        Log.i(TAG, "welcome to homemade browser");
        launch(args);
    }

    public void initialize() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.CORNSILK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // FXMLLoader loader = new FXMLLoader(getClass().getResource("browser.fxml"));
        // loader.setController(this);
        // Parent root = loader.load();
        Parent root = FXMLLoader.load(getClass().getResource("browser.fxml"));
        primaryStage.setTitle("homemade browser");
        primaryStage.setScene(new Scene(root, 720, 1080));
        primaryStage.show();
    }

}
