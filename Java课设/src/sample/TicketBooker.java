package sample;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.awt.*;


public class TicketBooker extends Scene {
    private AnchorPane anchorPane;
    public TicketBooker() {
        super(new AnchorPane());
        this.anchorPane=(AnchorPane)this.getRoot();
        this.anchorPane.setPrefSize(800,600);
        Label Lab=new Label("始发站");
        Lab.setLayoutX(30);
        Lab.setLayoutY(50);

        Label Lab_2=new Label("终到站");
        Lab_2.setLayoutX(260);
        Lab_2.setLayoutY(50);

        ComboBox box1=new ComboBox();
        box1.setLayoutX(80);
        box1.setLayoutY(50);
        box1.setPrefWidth(150);
        box1.setPrefHeight(30);

        ComboBox box2=new ComboBox();
        box2.setPrefWidth(150);
        box2.setPrefHeight(30);
        box2.setLayoutX(310);
        box2.setLayoutY(50);

        ComboBox box3=new ComboBox();
        box3.getItems().add("年");
        box3.getSelectionModel().select(0);
        box3.setPrefWidth(80);
        box3.setPrefHeight(30);
        box3.setLayoutX(520);
        box3.setLayoutY(50);

        ComboBox box4=new ComboBox();
        box4.getItems().add("月");
        box4.getSelectionModel().select(0);
        box4.setPrefWidth(70);
        box4.setPrefHeight(30);
        box4.setLayoutX(620);
        box4.setLayoutY(50);

        ComboBox box5=new ComboBox();
        box5.getItems().add("日");
        box5.getSelectionModel().select(0);
        box5.setPrefWidth(70);
        box5.setPrefHeight(30);
        box5.setLayoutX(710);
        box5.setLayoutY(50);

        TableView tableView=new TableView();
        tableView.setLayoutX(10);
        tableView.setLayoutY(100);
        tableView.setPrefSize(800,500);
        TableColumn time=new TableColumn("时间");
        time.setPrefWidth(250);
        TableColumn price=new TableColumn("票价");
        price.setPrefWidth(250);
        TableColumn race=new TableColumn("剩余票数");
        race.setPrefWidth(360);
        tableView.getColumns().addAll(time,price,race);
        this.anchorPane.getChildren().add(Lab);
        this.anchorPane.getChildren().add(box1);
        this.anchorPane.getChildren().add(Lab_2);
        this.anchorPane.getChildren().add(box2);
        this.anchorPane.getChildren().add(box3);
        this.anchorPane.getChildren().add(box4);
        this.anchorPane.getChildren().add(box5);
        this.anchorPane.getChildren().add(tableView);
    }
}
