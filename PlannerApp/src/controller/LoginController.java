package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
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
			System.out.print("Sign in Clicked!");
		});
	}
	
	
}
