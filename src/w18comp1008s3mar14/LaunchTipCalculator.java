package w18comp1008s3mar14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class LaunchTipCalculator extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TipCalculator.fxml"));
        
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
        primaryStage.setTitle("Super awesome tip calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
