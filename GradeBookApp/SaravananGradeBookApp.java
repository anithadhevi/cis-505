/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A.Saravanan Student 2023
    Cyberactive., Instruction to Assignment 9.2.,11.2,12.2
    https://learn-us-east-1-prod-fleet01-xythos.content.blackboardcdn.com/blackboard.learn.xythos.prod/5a31d48b683a8/20827415?X-Blackboard-S3-Bucket=blackboard.learn.xythos.prod&X-Blackboard-Expiration=1696518000000&X-Blackboard-Signature=q%2BKvjI2qp8QCwf8%2BBkxbtug3uVQyTenImmtJki1axA4%3D&X-Blackboard-Client-Id=100225&X-Blackboard-S3-Region=us-east-1&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%27Instructions%2520for%2520Assignment%25206.2.pdf&response-content-type=application%2Fpdf&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEFIaCXVzLWVhc3QtMSJIMEYCIQDJsN%2BpRpb36bvz%2B7RHXhYCwQ5gvmBhxwh0Xp8%2B9nwAiAIhAJ2F1LscctB8lXDRgXmV9l532Cokw%2B9wVP%2FMQlT3c1ZgKrQFCFoQABoMNTU2OTAzODYxMzYxIgxRt5xZFDWoP9%2BvpiMqkQW3%2F0d%2FkhrKm3ZAdy8Ehu1D1DIDcH%2BtjGRfe5q%2BDBeb6GgytEAugcvH%2FX5Ty0qpoCQvELyXd9Bp0gjbLSWQfBmG3pBn54f0Y1TLJwlH5zgT5T0IBn2TTC7pkLGZwZ31SmFA8IYu0%2BN4SaXybNJO0w%2F2p7T7hDMqda4IbJ0Cg76SQqcfVe7sffoRTqlBK4Z6jg48TuDGRzddvl1o5k%2FfvuCVc7M%2FQPrVZfqRmBumtD5XU8Xzm2CO9V0p9fzvDmxBVcFKRFF1CI48%2BN66d0wV%2FI%2F%2FV6gOdpYbXiIE9v9Qqi%2BefHtXWE33Z2QxDsHFhxqUF%2FFZLlMHZ7zk%2B38s5cRoajP7BlYymamiSBphHomSMe%2F%2BDOZ9Ra0n%2BUEJF37KPhGvLbtEf7Gsa9rpEZsqDe6C3Bv3c3dUNBB76b5BroGbpPctEXd7TdsMfyn5bTGSKNKHyweIIXcTMAgQq5xkEfdHzsAMutFUz6WDjiFigMdDZP9OsqVP8kDqpq2CsbUX%2BiGxrX1TdZgcVn3EI1A430bvf0b0y%2FopkL8jKq9BTl4Gv6jSJ0kVxMxKZFdCcP0Ny3sCp%2FmEBHakTgnxLuYrQxVR8%2FtuIVK0E%2F%2BRSKVnf7nVudc%2Fn8vh250s9%2BHQwvuMnrPkqZsbZnO6lK9fYXUBLNsW3L3KROhKhskEdtQVrqKCRKfbaNQ8rvupJhShVNqoU2FK%2B%2Fx8oyScyoX64QNRcjG5EhYCL6olm1xFcxVlZ2pNTYTNIGtc4b4w01pIKdNUcXEPgn6TBLpZG1KxmF1VUP%2FDyagLUlTMjTzMtrWm%2FDTRw38ST5OwWLCdOgbirXLtinf0Vt6kw7jDlGzT16brok0FiKD3DNh52Fk%2FRIxnGyQTXpmUAHAw2vz5qAY6sAGg1lLpylMOWq91R%2BbqcrowdOxYa3bBrYy2DEsUsqqnmHFoL4HBnf8t0xRrD%2BXOS00BmB79IRWcJvQqOwTQyPuWKxOlGNDnwD3ZYjrT9D25mZvKz522znnCTLeK5GRv%2BDsvAkvAcgP4ChPhfsrUPqx8yKWGu%2BbxK5%2BVsL7twhHTw8Yi3YELpOmKCXnnpw9I2ZUV1jRqTw09nAlWTn4F2DvMLI76IuUo28a1g5Z4It%2F0Sg%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20231005T090000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAYDKQORRY27OZWCNS%2F20231005%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=b3a320b5612832e72499d3ab87bb1264221382141299ad2e1b7a0a1c51a15565
    Java tutorials.,https://www.w3schools.com/java/ */

package GradeBookApp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaravananGradeBookApp extends Application
{
    private ObservableList<Student> students = FXCollections.observableArrayList();
    public static void main (String[] args)
    {
        launch(args);
    }
    //@Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("GradeBookApp");

        //Create UI components
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new javafx.geometry.Insets(20,20,20,20));

        //Create form fields
        Label firstNameLabel = new Label("First Name: ");
        TextField firstNameField = new TextField();

        Label lastNameLabel = new Label("Last Name: ");
        TextField lastNameField = new TextField();

        Label courseLabel = new Label("Courses: ");
        TextField courseField = new TextField();

        Label gradeLabel = new Label("Grade: ");
        ComboBox<String> gradeComboBox = new ComboBox<>();
        gradeComboBox.getItems().addAll("A","B","C","D","E","F");

        //Buttons
        Button clearButton = new Button("Clear Form");
        Button viewButton = new Button("View Grades");
        Button saveButton = new Button("Save Grades");

        //TextArea viewGrade = new TextArea();
        
        //Add components to the Grid
        grid.add(firstNameLabel, 0, 0);
        grid.add(firstNameField, 1, 0, 3, 1);

        grid.add(lastNameLabel, 0, 1);
        grid.add(lastNameField, 1, 1, 3, 1);

        grid.add(courseLabel,0, 2);
        grid.add(courseField, 1, 2, 3, 1);

        grid.add(gradeLabel, 0, 3);
        grid.add(gradeComboBox, 1, 3, 3, 1);

        grid.add(clearButton, 0, 4);
        grid.add(viewButton, 1, 4);
        grid.add(saveButton, 2, 4);
       
        //grid.add(viewGrade, 0, 5, 3, 1);
    

        //set Button actions
        clearButton.setOnAction(e -> clearForm(firstNameField, lastNameField, courseField, gradeComboBox));
        viewButton.setOnAction(e -> viewGrades());
        saveButton.setOnAction(e-> savegrade(firstNameField, lastNameField, courseField, gradeComboBox));
       
        //create a scene
        //Scene scene = new Scene(grid, 400,300);
        //primaryStage.setScene(scene);
        StackPane.setAlignment(viewButton, javafx.geometry.Pos.CENTER);

             // TableView setup
        
        TableView<Student> tableView = new TableView<>();
        TableColumn<Student, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Student, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Student, String> courseCol = new TableColumn<>("Course");
        courseCol.setCellValueFactory(new PropertyValueFactory<>("course"));

        TableColumn<Student, String> gradeCol = new TableColumn<>("Grade");
        gradeCol.setCellValueFactory(new PropertyValueFactory<>("grade"));

        tableView.getColumns().addAll(firstNameCol, lastNameCol, courseCol, gradeCol);
        tableView.setItems(students);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(grid, tableView);

        Scene scene = new Scene(vBox, 500, 400);
        primaryStage.setScene(scene);

        //show the stage
        primaryStage.show();
    }
    
    private void clearForm(TextField firstNameField, TextField lastNameField, TextField courseField, ComboBox<String> gradeComboBox)
    {
        firstNameField.clear();
        lastNameField.clear();
        courseField.clear();
        gradeComboBox.getSelectionModel().clearSelection();
    }
    
    private void viewGrades()
    {
        students.clear(); // Clear previous entries

        try (BufferedReader reader = new BufferedReader(new FileReader("grades.csv"))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) 
            {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    Student student = new Student(parts[0], parts[1], parts[2], parts[3]);
                    students.add(student);
                }
            }
        } catch (IOException e) {  
            e.printStackTrace();
        }
    }

    private void savegrade(TextField firstNameField, TextField lastNameField, TextField courseField,ComboBox<String> gradeComboBox)
    {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String course = courseField.getText();
        String grade = gradeComboBox.getValue();
    
        // Create a Student object
        Student student = new Student(firstName, lastName, course, grade);

        //save the grade entry
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setCourse(course);
        student.setGrade(grade);
        GradeBookHandler.saveGradeEntry(student);

    }
}






    



    

