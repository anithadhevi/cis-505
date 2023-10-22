/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Cyberactive., Instruction to Assignment 8.2.,
    https://learn-us-east-1-prod-fleet01-xythos.content.blackboardcdn.com/blackboard.learn.xythos.prod/5a31d48b683a8/20827415?X-Blackboard-S3-Bucket=blackboard.learn.xythos.prod&X-Blackboard-Expiration=1696518000000&X-Blackboard-Signature=q%2BKvjI2qp8QCwf8%2BBkxbtug3uVQyTenImmtJki1axA4%3D&X-Blackboard-Client-Id=100225&X-Blackboard-S3-Region=us-east-1&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%27Instructions%2520for%2520Assignment%25206.2.pdf&response-content-type=application%2Fpdf&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEFIaCXVzLWVhc3QtMSJIMEYCIQDJsN%2BpRpb36bvz%2B7RHXhYCwQ5gvmBhxwh0Xp8%2B9nwAiAIhAJ2F1LscctB8lXDRgXmV9l532Cokw%2B9wVP%2FMQlT3c1ZgKrQFCFoQABoMNTU2OTAzODYxMzYxIgxRt5xZFDWoP9%2BvpiMqkQW3%2F0d%2FkhrKm3ZAdy8Ehu1D1DIDcH%2BtjGRfe5q%2BDBeb6GgytEAugcvH%2FX5Ty0qpoCQvELyXd9Bp0gjbLSWQfBmG3pBn54f0Y1TLJwlH5zgT5T0IBn2TTC7pkLGZwZ31SmFA8IYu0%2BN4SaXybNJO0w%2F2p7T7hDMqda4IbJ0Cg76SQqcfVe7sffoRTqlBK4Z6jg48TuDGRzddvl1o5k%2FfvuCVc7M%2FQPrVZfqRmBumtD5XU8Xzm2CO9V0p9fzvDmxBVcFKRFF1CI48%2BN66d0wV%2FI%2F%2FV6gOdpYbXiIE9v9Qqi%2BefHtXWE33Z2QxDsHFhxqUF%2FFZLlMHZ7zk%2B38s5cRoajP7BlYymamiSBphHomSMe%2F%2BDOZ9Ra0n%2BUEJF37KPhGvLbtEf7Gsa9rpEZsqDe6C3Bv3c3dUNBB76b5BroGbpPctEXd7TdsMfyn5bTGSKNKHyweIIXcTMAgQq5xkEfdHzsAMutFUz6WDjiFigMdDZP9OsqVP8kDqpq2CsbUX%2BiGxrX1TdZgcVn3EI1A430bvf0b0y%2FopkL8jKq9BTl4Gv6jSJ0kVxMxKZFdCcP0Ny3sCp%2FmEBHakTgnxLuYrQxVR8%2FtuIVK0E%2F%2BRSKVnf7nVudc%2Fn8vh250s9%2BHQwvuMnrPkqZsbZnO6lK9fYXUBLNsW3L3KROhKhskEdtQVrqKCRKfbaNQ8rvupJhShVNqoU2FK%2B%2Fx8oyScyoX64QNRcjG5EhYCL6olm1xFcxVlZ2pNTYTNIGtc4b4w01pIKdNUcXEPgn6TBLpZG1KxmF1VUP%2FDyagLUlTMjTzMtrWm%2FDTRw38ST5OwWLCdOgbirXLtinf0Vt6kw7jDlGzT16brok0FiKD3DNh52Fk%2FRIxnGyQTXpmUAHAw2vz5qAY6sAGg1lLpylMOWq91R%2BbqcrowdOxYa3bBrYy2DEsUsqqnmHFoL4HBnf8t0xRrD%2BXOS00BmB79IRWcJvQqOwTQyPuWKxOlGNDnwD3ZYjrT9D25mZvKz522znnCTLeK5GRv%2BDsvAkvAcgP4ChPhfsrUPqx8yKWGu%2BbxK5%2BVsL7twhHTw8Yi3YELpOmKCXnnpw9I2ZUV1jRqTw09nAlWTn4F2DvMLI76IuUo28a1g5Z4It%2F0Sg%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20231005T090000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAYDKQORRY27OZWCNS%2F20231005%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=b3a320b5612832e72499d3ab87bb1264221382141299ad2e1b7a0a1c51a15565
    Java2 tutorial., http://www.java2s.com/Tutorials/Java/JavaFX/0060__JavaFX_Path.html */
package Module_8;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SaravananEnhancedFutureValueApp extends Application
{
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();
    private TextArea txtResults = new TextArea();
    private ComboBox<Integer> cbYears = new ComboBox<>();
    private Label lblMonthlyPayment = new Label("Monthly Payment: ");
    private Label lblInterestRate = new Label("Interest Rate: ");
    private Label lblYear = new Label("Years:");
    private Label lblFutureValueDate = new Label();
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    //Override
    public void start(Stage primaryStage)
    {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new javafx.geometry.Insets(11.5,12.5,13.5,14.5));
        gridPane.setHgap(5.5);//Hgap to 5.5
        gridPane.setVgap(5.5);//Vgap to 5.5

        txtMonthlyPayment.setPrefWidth(200);
        txtMonthlyPayment.setMaxWidth(150);
        txtInterestRate.setPrefWidth(200);
        txtInterestRate.setMaxWidth(150);
        
        //add controls to the GridPane
        gridPane.add(lblMonthlyPayment, 0, 0);
        gridPane.add(txtMonthlyPayment, 1,0);
        //gridPane.add(textArea, 1, 2);

        gridPane.add(lblInterestRate, 0, 1);
        gridPane.add(txtInterestRate, 1, 1);
       
        //customize 1b1InterestRateFormat
        Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        lblInterestRateFormat.setTextFill(javafx.scene.paint.Color.RED);//set the font color of the Interest rate instructions to red
        gridPane.add(lblInterestRateFormat,1,2); //Add the label to the grid pane
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT); //position the label to the right of the pane
        cbYears.setPrefWidth(150);//set the required width for the combo
        gridPane.add(lblYear, 0, 3);
        gridPane.add(cbYears, 1, 3);

        // Add the HBox for buttons 
        HBox hboxButtons = new HBox(10);
        hboxButtons.setAlignment(Pos.CENTER);
        hboxButtons.setPadding(new javafx.geometry.Insets(15,0,15,30));
        hboxButtons.getChildren().addAll(btnCalculate,btnClear);
        
        HBox actionBtnContainer = new HBox(); //Create a new HBox container.
        actionBtnContainer.setPadding(new javafx.geometry.Insets(15,0,15,30)); //set the container padding
        actionBtnContainer.setSpacing(10);//set the container spacing.
        actionBtnContainer.getChildren().add(btnClear); //Add the btnClear to teh container
        actionBtnContainer.getChildren().add(btnCalculate); //Add the btnCalc to teh container
        gridPane.add(actionBtnContainer, 1, 4); //Add the container to the GridPanel;
        
        gridPane.add(lblFutureValueDate, 0, 5, 2, 1);
        gridPane.add(txtResults, 0, 6, 2, 1);
        txtResults.setPrefWidth(200);
        txtResults.setPrefHeight(75);

        btnClear.setOnAction(event -> clearFormFields());
        btnCalculate.setOnAction(btevent -> calculateResults());
 
        cbYears.getItems().addAll(1, 2, 3, 4, 5);

        // Create a scene and set it to the stage
        Scene scene1 = new Scene(gridPane, 325,325);
         
        // Create a label for the title
        Label titleLabel = new Label("Saravanan Future Value App");
        titleLabel.setStyle("-fx-font-size: 14px;"); // Adjust font size if needed

        // Create a layout for the entire scene
        StackPane root = new StackPane(titleLabel);
        StackPane.setAlignment(titleLabel,Pos.CENTER);

        // Set up the scene
        Scene scene = new Scene(root, 400, 300);

        // Style the stage to have only the close button
        primaryStage.initStyle(StageStyle.UTILITY);

       
       //set up the stage 
        primaryStage.setScene(scene1);
       
        //set the stage Title
        primaryStage.setTitle("Saravanan Future Value App");  
        
    
        //set the size of the stage
        primaryStage.setWidth(300);  // Set the width to 400 pixels
        primaryStage.setHeight(330); // Set the height to 300 pixels

        //show the stage
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
    private void clearFormFields()
    {
        txtMonthlyPayment.setText("");
        txtInterestRate.setText("");
        txtResults.setText ("");
        lblFutureValueDate.setText("");
        cbYears.setValue(null);
    }
     
    private void calculateResults()
    {
        try
        {
            // collect user-entered values  
            double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
            double interestRate = Double.parseDouble(txtInterestRate.getText());
            int years = (int) cbYears.getValue();
           
            //Call CalculateFutureValue method from FinanceCalculator class
            double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, interestRate, years);
            lblFutureValueDate.setText("Calculation as of " + getTodayDate());
            
            //set the results text area
            DecimalFormat f = new DecimalFormat("##,###.00");
            txtResults.setText("The future value is $" + f.format(futureValue));
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
    }

    private String getTodayDate()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(new Date());
    }
}

