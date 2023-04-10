package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class UserLogin extends Scene {
    private AnchorPane anchorPane;
    public UserLogin()
    {
        super(new AnchorPane());
        this.anchorPane=(AnchorPane)this.getRoot();
        this.anchorPane.setPrefSize(220,250);
        Label Lab=new Label("账号");
        Lab.setLayoutX(30);
        Lab.setLayoutY(70);

        Label Lab_2=new Label("密码");
        Lab_2.setLayoutX(30);
        Lab_2.setLayoutY(110);

        Button btn1=new Button("登录");
        btn1.setLayoutX(120);
        btn1.setLayoutY(160);

        TextField textTxt=new TextField();
        textTxt.setLayoutX(70);
        textTxt.setLayoutY(70);

        PasswordField pwdTxt=new PasswordField();
        pwdTxt.setLayoutX(70);
        pwdTxt.setLayoutY(110);
        this.anchorPane.getChildren().add(Lab);
        this.anchorPane.getChildren().add(Lab_2);
        this.anchorPane.getChildren().add(btn1);
        this.anchorPane.getChildren().add(textTxt);
        this.anchorPane.getChildren().add(pwdTxt);
    }
}
