package L1_JavaFX_Stage;

import javafx.application.Application;
import javafx.stage.Stage;

public class StageExamples extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Stage Examples");

        primaryStage.setX(200);
        primaryStage.setY(200);

        primaryStage.setHeight(400);
        primaryStage.setWidth(800);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
