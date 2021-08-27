package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ViewController implements Initializable {

	@FXML
	private Button buttonNumber0;
	@FXML
	private Button buttonNumber1;
	@FXML
	private Button buttonNumber2;
	@FXML
	private Button buttonNumber3;
	@FXML
	private Button buttonNumber4;
	@FXML
	private Button buttonNumber5;
	@FXML
	private Button buttonNumber6;
	@FXML
	private Button buttonNumber7;
	@FXML
	private Button buttonNumber8;
	@FXML
	private Button buttonNumber9;
	@FXML
	private Button buttonPoint;
	@FXML
	private Button buttonDel;
	
	@FXML
	private GridPane gridPaneNumbers;
	
	@FXML
	private GridPane gridPaneOperations;
	
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button sum;
	@FXML
	private Button sub;
	@FXML
	private Button div;
	@FXML
	private Button mult;
	@FXML
	private Button equal;
	
	String firstLabel = "";
	String operation = "";
	Double firstValue = 0.0;
	Double secondValue = 0.0;
	public void onBt00Action() {
		firstLabel = firstLabel + "0";
		labelResult.setText(firstLabel);
	}
	
	public void onBt01Action() {
		firstLabel = firstLabel + "1";
		labelResult.setText(firstLabel);
	}
	
	public void onBt02Action() {
		firstLabel = firstLabel + "2";
		labelResult.setText(firstLabel);
	}

	public void onBt03Action() {
		firstLabel = firstLabel + "3";
		labelResult.setText(firstLabel);
	}

	public void onBt04Action() {
		firstLabel = firstLabel + "4";
		labelResult.setText(firstLabel);
	}

	public void onBt05Action() {
		firstLabel = firstLabel + "5";
		labelResult.setText(firstLabel);
	}

	public void onBt06Action() {
		firstLabel = firstLabel + "6";
		labelResult.setText(firstLabel);
	}

	public void onBt07Action() {
		firstLabel = firstLabel + "7";
		labelResult.setText(firstLabel);
	}

	public void onBt08Action() {
		firstLabel = firstLabel + "8";
		labelResult.setText(firstLabel);
	}

	public void onBt09Action() {
		firstLabel = firstLabel + "9";
		labelResult.setText(firstLabel);
	}
	
	public void onBtPointAction() {
		if(!firstLabel.contains(".")) {
			firstLabel = firstLabel + ".";
			labelResult.setText(firstLabel);
		}
	}
	
	public void onBtDelAction() {
		if (firstLabel != "") {
			int quantNumbers = firstLabel.length() - 1;
			firstLabel = firstLabel.substring(0, quantNumbers);
			labelResult.setText(firstLabel);
		}
	}
	
	public void onBtSumAction() {
		firstValue = Double.parseDouble(firstLabel);
		firstLabel = "";
		labelResult.setText("0");
		operation = "sum";
	}
	
	public void onBtSubAction() {
		firstValue = Double.parseDouble(firstLabel);
		firstLabel = "";
		labelResult.setText("0");
		operation = "sub";
	}
	
	public void onBtMultAction() {
		firstValue = Double.parseDouble(firstLabel);
		firstLabel = "";
		labelResult.setText("0");
		operation = "mult";
	}
	
	public void onBtDivAction() {
		firstValue = Double.parseDouble(firstLabel);
		firstLabel = "";
		labelResult.setText("0");
		operation = "div";
	}
	
	public void onResultAction() {
		Double result = 0.0;
		secondValue = Double.parseDouble(labelResult.getText());
		if (operation == "sum") {
			result = firstValue + secondValue;
		}
		else if (operation == "sub") {
			result = firstValue - secondValue;
		}
		else if (operation == "mult") {
			result = firstValue * secondValue;
		}
		else if (operation == "div") {
			result = firstValue / secondValue;
		}
		labelResult.setText(String.format("%.2f", result));
		firstValue = 0.0;
		secondValue = 0.0;
		firstLabel = "";
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rc) {
		// TODO Auto-generated method stub
		
	}
}
