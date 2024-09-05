package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

	@FXML
	private Button bt1;
	
	@FXML
	public void onBt1Action() {
		Alerts.showAlert("Alert titulo", "Alert cabeçalho", "conteudo", AlertType.INFORMATION);
	}
}
