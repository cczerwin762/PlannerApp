package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class LoginController {
	@FXML
	private ResourceBundle resources;
	
	@FXML
	private URL location;
	
	@FXML
	private TextField UsernameField;
	
	@FXML
	private  PasswordField PasswordField;
	
	@FXML
	private Button SignUpButton;
	
	@FXML
	private Button SignInButton;
	
	@FXML
	public void initialize() {
		
		this.SignInButton.setOnAction(event ->{
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/view/addTask.fxml"));
				primaryStage.setTitle("Planner");
				primaryStage.setScene(new Scene(root, 700, 400));
				primaryStage.show();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	
}
