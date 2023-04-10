package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class TicketConfirm extends Scene {
    private AnchorPane anchorPane;
    public TicketConfirm() {
        super(new AnchorPane());
        this.anchorPane = (AnchorPane) this.getRoot();
        this.anchorPane.setPrefSize(400, 300);

        Label Label1=new Label("用户名");
        Label1.setLayoutX(40);
        Label1.setLayoutY(50);
        Label1.setPrefSize(50,30);

        Label Label2_1=new Label();
        Label2_1.setLayoutX(90);
        Label2_1.setLayoutY(50);
        Label2_1.setPrefSize(100,30);
        Label2_1.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));

        Label Label2=new Label("姓名");
        Label2.setLayoutX(230);
        Label2.setLayoutY(50);
        Label2.setPrefSize(50,30);

        Label Label2_2=new Label();
        Label2_2.setLayoutX(280);
        Label2_2.setLayoutY(50);
        Label2_2.setPrefSize(100,30);
        Label2_2.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));

        Label Label3=new Label("始发站");
        Label3.setLayoutX(40);
        Label3.setLayoutY(120);
        Label3.setPrefSize(50,30);

        Label Label2_3=new Label();
        Label2_3.setLayoutX(90);
        Label2_3.setLayoutY(120);
        Label2_3.setPrefSize(100,30);
        Label2_3.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));

        Label Label4=new Label("终点站");
        Label4.setLayoutX(230);
        Label4.setLayoutY(120);
        Label4.setPrefSize(50,30);

        Label Label2_4=new Label();
        Label2_4.setLayoutX(280);
        Label2_4.setLayoutY(120);
        Label2_4.setPrefSize(100,30);
        Label2_4.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));

        Label Label5=new Label("时间");
        Label5.setLayoutX(40);
        Label5.setLayoutY(200);
        Label5.setPrefSize(50,30);

        Label Label2_5=new Label();
        Label2_5.setLayoutX(90);
        Label2_5.setLayoutY(200);
        Label2_5.setPrefSize(180,30);
        Label2_5.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));

        Button btn1=new Button("确定");
        btn1.setLayoutX(15);
        btn1.setLayoutY(260);
        btn1.setPrefSize(200,40);

        Button btn2=new Button("取消");
        btn2.setLayoutX(200);
        btn2.setLayoutY(260);
        btn2.setPrefSize(200,40);
        this.anchorPane.getChildren().add(Label1);
        this.anchorPane.getChildren().add(Label2_1);
        this.anchorPane.getChildren().add(Label2);
        this.anchorPane.getChildren().add(Label2_2);
        this.anchorPane.getChildren().add(Label3);
        this.anchorPane.getChildren().add(Label2_3);
        this.anchorPane.getChildren().add(Label4);
        this.anchorPane.getChildren().add(Label2_4);
        this.anchorPane.getChildren().add(Label5);
        this.anchorPane.getChildren().add(Label2_5);
        this.anchorPane.getChildren().add(btn1);
        this.anchorPane.getChildren().add(btn2);
    }
}
