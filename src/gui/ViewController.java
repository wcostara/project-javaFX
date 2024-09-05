package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

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
}
