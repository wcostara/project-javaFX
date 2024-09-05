package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

	@FXML
	private TextField txtnumber1;
	
	@FXML
	private TextField txtnumber2;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	
	@FXML
	public void onBtSumAction() {
		try {
		Locale.setDefault(Locale.US);
		Double number1 = Double.parseDouble(txtnumber1.getText());
		Double number2 = Double.parseDouble(txtnumber2.getText());
		Double sum = number1 + number2;
		labelResult.setText(String.format("%.2f", sum));
		
		}catch(NumberFormatException e) {
			Alerts.showAlert("ERROR", "Parse error", e.getMessage(),AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtnumber1);
		Constraints.setTextFieldDouble(txtnumber1);
		Constraints.setTextFieldDouble(txtnumber2);
		Constraints.setTextFieldMaxLength(txtnumber1, 10);
		Constraints.setTextFieldMaxLength(txtnumber2, 10);
		
		
	}
}
