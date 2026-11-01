package app;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ConverterController {

    @FXML
    private TextField temperatureInput;

    @FXML
    private ComboBox<String> fromUnit;

    @FXML
    private ComboBox<String> toUnit;

    @FXML
    private Label resultLabel;

    @FXML
    public void initialize() {
        fromUnit.getItems().addAll("Celsius", "Fahrenheit", "Kelvin");
        toUnit.getItems().addAll("Celsius", "Fahrenheit", "Kelvin");

        fromUnit.setValue("Celsius");
        toUnit.setValue("Fahrenheit");
    }

    @FXML
    public void convert() {
        try {
            double temperature =
                Double.parseDouble(temperatureInput.getText());

            double result = temperature;

            String from = fromUnit.getValue();
            String to = toUnit.getValue();

            if (from.equals(to)) {
                result = temperature;
            }
            else if (from.equals("Celsius") && to.equals("Fahrenheit")) {
                result = TemperatureConverter.celsiusToFahrenheit(temperature);
            }
            else if (from.equals("Fahrenheit") && to.equals("Celsius")) {
                result = TemperatureConverter.fahrenheitToCelsius(temperature);
            }
            else if (from.equals("Kelvin") && to.equals("Celsius")) {
                result = TemperatureConverter.kelvinToCelsius(temperature);
            }
            else if (from.equals("Celsius") && to.equals("Kelvin")) {
                result = temperature + 273.15;
            }
            else if (from.equals("Fahrenheit") && to.equals("Kelvin")) {
                result = TemperatureConverter.fahrenheitToCelsius(temperature) + 273.15;
            }
            else if (from.equals("Kelvin") && to.equals("Fahrenheit")) {
                result = TemperatureConverter.celsiusToFahrenheit(
                    TemperatureConverter.kelvinToCelsius(temperature)
                );
            }

            resultLabel.setText(String.format("%.2f", result));

        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid temperature!");
        }
    }
}
