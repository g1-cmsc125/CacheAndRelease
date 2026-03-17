package com.group1;

import java.net.URL;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        URL htmlUrl = getClass().getResource("/web/index.html");
        
        if (htmlUrl != null) {
            webEngine.load(htmlUrl.toExternalForm());
        } else {
            System.err.println("Critical Error: Core web assets could not be allocated.");
        }

        Scene scene = new Scene(webView, 1024, 768);
        primaryStage.setTitle("QuantumTick CPU Scheduling Simulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}