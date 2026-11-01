package app;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        ChoiceDialog<String> dialog = new ChoiceDialog<>(
            "English",
            "Finnish", "English", "Swedish", "Japanese"
        );

        dialog.setTitle("Language");
        dialog.setHeaderText("Choose a language");

        String language = dialog.showAndWait().orElse("English");

        Locale locale = switch (language) {
            case "Finnish" -> new Locale("fi", "FI");
            case "Swedish" -> new Locale("sv", "SE");
            case "Japanese" -> new Locale("ja", "JP");
            default -> Locale.US;
        };

        ResourceBundle bundle = ResourceBundle.getBundle(
            "i18n.Message_bundle", locale
        );

        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("/app/converter.fxml"),
            bundle
        );

        Scene scene = new Scene(loader.load(), 350, 300);

        stage.setTitle(bundle.getString("title"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

