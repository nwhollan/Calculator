package application;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Window {
	
	@FXML
	private Label result;
	private double num1;
	private String operator = "";
	private boolean start = true;
	private Calculator model = new Calculator();
	@FXML
	public void getNum(ActionEvent event) {
		if (start) {
			result.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
	}
	@FXML
	public void getOperators(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
		
		
		if (value.equals("Ln()")) {
			double num2 = 0;
			num1 = Double.parseDouble(result.getText());
			float output = model.calculate(num1, num2, value);
			num1 = output;
			result.setText(String.valueOf(output));;
			operator = "";
			start = true;
		}
		else if (!value.equals("=")) {
			if (value.isEmpty()) {
				return;
			}
			operator = value;
			num1 = Double.parseDouble(result.getText());
			result.setText("");
		} 
		else {
			if (operator.equals("")) {
				return;
			}
			if (start) {
				operator = value;
			}
			Double num2 = Double.parseDouble(result.getText());
			float output = model.calculate(num1, num2, operator);
			num1 = output;
			result.setText(String.valueOf(output));;
			operator = "";
			start = true;
			System.out.print("Here\n");
		}
			
	}
}
