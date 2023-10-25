package com.example.inventoryproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        String Opt = "";
        if (args.length > 0)
            Opt = args[0];
        else
            System.out.println("Please provide a argument!!");

        if ("function1".equals(Opt))
            function1();
        else if ("function2".equals(Opt))
            function2();
        else
            System.out.println("Argument wrong.Choose something between function1 and function2");



        launch();
    }
    public static void function1 () { //Log in page maybe ?

    }

    public static void function2 () {  //Main page ?

    }
}