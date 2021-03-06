package net.atos.laa.rotas.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  private static Stage primaryStage;

  private void setPrimaryStage(Stage stage) {
    Main.primaryStage = stage;
  }

  static public Stage getPrimaryStage() {
    return Main.primaryStage;
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    setPrimaryStage(primaryStage);
    Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(
        "MainWindow.fxml"));
    primaryStage.setTitle("Atos LAA Rotas Demo");
    primaryStage.setScene(new Scene(root, 500, 560));
    primaryStage.setResizable(false);
    primaryStage.show();

  }

  public static void main(String[] args) {
    launch(args);


  }
}
