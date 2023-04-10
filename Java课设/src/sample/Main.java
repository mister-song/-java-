package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    Button btn=new Button("登录");
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new UserLogin());
        //primaryStage.setScene(new TicketBooker());
        primaryStage.setScene(new TicketConfirm());
        primaryStage.setResizable(false);

        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
