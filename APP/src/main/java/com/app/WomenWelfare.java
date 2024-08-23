package com.app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;

import java.util.Stack;

import javafx.scene.effect.DropShadow;

public class WomenWelfare extends Application 
{
    String[] exName ={"Move 1: Diaphragmatic Breath with Pelvic Floor Activation",
    "Move 2: P.sit to Stand","Move 3: Standing Abs","Move 4: Pelvis Articulation","Move 5: Butt Press",
    "Move 1: Step Back","Move 2: Stagger Row","Move 3: Rotating Stagger","Move 4: Internal 45 with Side Stretch","Move 5: Leg Lift",
    "Move 1: Fire Hydrant","Move 2: Kneeling Hip Flexor Stretch","Move 3: Intercoastal Kneeling Stretch","Move 4: Hamstring Press",
    "Move 5: Bridge"};

    String[] exDesc={"Stand with feet wide, knees soft, eyes closed and hands on belly. Take deep breaths into the belly allowing it to expand and contract fully. As you exhale, think of stopping the flow of urine, contracting vaginally, rectally, and feeling how the tailbone naturally flexes without adding any movement there. As you exhale and contract the pelvic floor, add pulling the abdominals in and up as if you were riding an elevator from the basement to the top floor of a building. All of these sensations account for a properly executed Kegel.",
    "Stand tall with feet, knees, and thighs together and turn your palms forward. Hinge back at your hips into a p.sit, keeping knees over ankles and spine long and straight to stretch the glutes while sweeping the arms overhead. Drive up through the floor, pressing your feet down to come back to stand with the arms by your side. Add the pelvic floor contraction as you stand back up.",
    "Tap one toe straight forward, angling your hip bones up toward the ceiling and squeezing into your glutes while leaning back. Be sure to keep your ribcage hugged together in the front so you don’t sink into the lower back. Reach your arms overhead with palms facing forward. Lift your front leg up while pressing your arms down, recruiting your abdominals as you do in your everyday life and working on stability. If needed, feel free to hold onto the back of a chair.",
    "Step one foot back as if you are mid-step and lower your back heel down. Front knee is slightly bent. Start to open and close your hips, rotating your pelvis while keeping your feet pointing straight forward to get some movement in the hips. For an added challenge for the upper body, grab onto light weights and pull one elbow back at a time, moving the arms as you twist your hips.",
    "Start on all fours stacked with a neutral spine, hands in line with shoulders and hips over knees. Keep your abdominals lifting to the ceiling so your back stays neutral, feeling the sensation of hugging your baby in. Bend one knee up to the ceiling, pressing through a flexed foot and return to start position, pumping through the glutes.",
    "Step one foot back as if you are mid-step and lower your back heel down, leaning your body forward to create one long diagonal line through the crown of your head and down through the back heel, arms reaching back behind you. Keeping your back leg straight, lift the heel high, squeeze the back glute and push through the ball of the foot to engage your glutes while reaching your arms overhead. Feel a huge stretch on the hip flexor which tends to get very tight from pregnancy. From there, return to start position.",
    "Holding onto light hand weights or water bottles, sit your hips back into a p.sit, hinging at your hips with both knees deeply bent and weights reaching on a low diagonal. Keeping your knees in line, bring one foot back behind you pressing through the ball of the foot. Drive up through both feet to come to full hip extension and squeeze your weights in by your ribs, engaging the glutes and postural muscles.",
    "From your stagger position, keep your standing foot forward and pivot your hips and torso toward your front leg, rotating on a 45-degree angle out to the side. Extend the weights in this internal stagger position. Come back to center, rowing your arms back.",
    "From your internal stagger position, drop the hand weights and stretch your back leg. Reach the arm of your extended back leg straight forward in line with your shoulder and bend the other elbow out to the side at a 90 degree angle. Reach your bent arm up overhead while allowing your hips to shift to the side, feeling an elongation from your hip all the way up through your fingertips, allowing breath to move into the sides of your body.",
    "Start on all fours with a neutral spine, hands in line with shoulders and hips over knees. Keep your abdominals lifting to the ceiling so your back stays neutral. Extend one leg straight back behind you, tapping your toes to the floor. Lift and lower the leg while keeping your baby hugged into your spine, pumping through the glutes.",
    "Lean your upper body forward with a soft bend in your knees and stagger one foot back behind you, interlacing your hands. Begin to lift and lower the back leg out to the side, squeezing the outer glute and engaging through the pelvic floor as you come back to stagger. Feel free to hold onto something for balance if needed.",
    "From a kneeling position, step one foot directly out in front of you and reach your arms forward at shoulder height. Squeezing your back glute, shift your hips forward and stretch the arm of the kneeling leg up to the ceiling for a deep hip flexor stretch. Always maintain a squeeze on the kneeling glute. Come back to start position.",
    "From your kneeling inner thigh stretch, step your front leg out to the side, keeping knee in line with second toe and W the arms. Shift your weight into the foot on the floor, stretching open your inner thighs. Reach the arm of your kneeling leg up and over to corner of the room, breathing into all the muscles between your ribs that may not have full excursion of the breath due to your growing belly.",
    "Come to a side-lying position on a prenatal wedge or a stack of pillows to keep your heart above your baby. Bend your knees so they are in 90-degree angles, knees in line with hips and feet in line with knees. Lift your top leg and flex your foot and then extend the leg straight back behind you, working into the back of the leg and glute.",
    "Come to lay on your back on a wedge with your knees bent, feet pressing into the floor. Relax your arms down by your sides. Press your hips up to the ceiling then lower down to a hover."};





    public Stage primaryStage;
    private Stack<Scene> sceneHistory = new Stack<Scene>();
    @Override
    public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        Image icon = new Image("D:\\Java projects\\APP\\src\\main\\resources\\com\\app\\pregn2.jpg");
        primaryStage.getIcons().add(icon);
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(5.0);
        dropShadow.setOffsetY(5.0);
        dropShadow.setColor(javafx.scene.paint.Color.GRAY);

        VBox vbox = new VBox(30);
        vbox.setAlignment(Pos.CENTER);
        
        Button btn1 = new Button("Food preferences");
        Button btn2 = new Button("Exercises");
        Button btn3 = new Button("Emergency");
        Button btn4 = new Button("Exit");
        
        btn1.setPrefSize(200, 50); btn1.setEffect(dropShadow); btn1.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightpink; -fx-text-fill: black;");
        btn2.setPrefSize(200, 50); btn2.setEffect(dropShadow); btn2.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightpink; -fx-text-fill: black;");
        btn3.setPrefSize(200, 50); btn3.setEffect(dropShadow); btn3.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightpink; -fx-text-fill: black;");
        btn4.setStyle("-fx-background-color: Black; -fx-text-fill: white;");
        
        btn4.setOnAction(event -> {
            primaryStage.close();
        });
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent arg0) {
                    
                    sceneHistory.push(primaryStage.getScene());
                    
                    Font boldFont2 = Font.font("Lora", FontWeight.BOLD, 18);
                    Font boldFont3 = Font.font("Lora", FontWeight.BOLD, 14);
                    
                    Button btn4 = new Button("First trimester");
                    Button btn5 = new Button("Second trimester");
                    Button btn6 = new Button("Third trimester");
                    Button btn7 = new Button("Do's and Dont's");
                    
                    btn4.setPrefSize(200, 50); btn4.setFont(boldFont2); btn4.setEffect(dropShadow); btn4.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightblue; -fx-text-fill: black;");
                    btn5.setPrefSize(200, 50); btn5.setFont(boldFont2); btn5.setEffect(dropShadow); btn5.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightblue; -fx-text-fill: black;");
                    btn6.setPrefSize(200, 50); btn6.setFont(boldFont2); btn6.setEffect(dropShadow); btn6.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightblue; -fx-text-fill: black;");
                    btn7.setFont(boldFont3); btn7.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightblue; -fx-text-fill: black;");
                 
                    Button backButton = createBackButton();
                    
                    btn4.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent arg0) {
                            sceneHistory.push(primaryStage.getScene());
                            showFoodPreference1();
                        }
                    });
        
                    btn5.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent arg0) {
                            sceneHistory.push(primaryStage.getScene());
                            showFoodPreference2();
                        }
                    });
        
                    btn6.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent arg0) {
                            sceneHistory.push(primaryStage.getScene());
                            showFoodPreference3();
                        }
                    });
                    
                    btn7.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent arg0) {
                            sceneHistory.push(primaryStage.getScene());
                            showBasicInstructions();
                        }
                    });
    
                    BackgroundSize backgroundSize = new BackgroundSize(1200, 700, false, false, false, false);
                    BackgroundImage background = new BackgroundImage(new Image("D:\\Java projects\\APP\\src\\main\\resources\\com\\app\\pregn1.jpg"), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        
                    VBox vbox = new VBox(30);
                    vbox.setAlignment(Pos.CENTER);
                    vbox.setBackground(new Background(background));
                    vbox.getChildren().addAll(btn4,btn5,btn6,btn7,backButton);
                    
                    Scene SceneForCategory1 = new Scene(vbox, 1200, 700);
                    primaryStage.setScene(SceneForCategory1);
                }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {

                sceneHistory.push(primaryStage.getScene());

                Font boldFont2 = Font.font("Lora", FontWeight.BOLD, 18);
                Font boldFont3 = Font.font("Lora", FontWeight.BOLD, 14);

                Button btn4 = new Button("First trimester");
                Button btn5 = new Button("Second trimester");
                Button btn6 = new Button("Third trimester");

                btn4.setPrefSize(200, 50); btn4.setFont(boldFont2); btn4.setEffect(dropShadow); btn4.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightblue; -fx-text-fill: black;");
                btn5.setPrefSize(200, 50); btn5.setFont(boldFont2); btn5.setEffect(dropShadow); btn5.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightblue; -fx-text-fill: black;");
                btn6.setPrefSize(200, 50); btn6.setFont(boldFont2); btn6.setEffect(dropShadow); btn6.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: lightblue; -fx-text-fill: black;");

                Button backButton = createBackButton();

                btn4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent arg0) {
                        sceneHistory.push(primaryStage.getScene());
                        showExercise(0,5);
                    }
                });

                btn5.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent arg0) {
                        sceneHistory.push(primaryStage.getScene());
                        showExercise(5,10);
                    }
                });

                btn6.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent arg0) {
                        sceneHistory.push(primaryStage.getScene());
                        showExercise(10,15);
                    }
                });

                BackgroundSize backgroundSize = new BackgroundSize(1200, 700, false, false, false, false);
                BackgroundImage background = new BackgroundImage(new Image("D:\\Java projects\\APP\\src\\main\\resources\\com\\app\\pregn1.jpg"), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);

                VBox vbox = new VBox(30);
                vbox.setAlignment(Pos.CENTER);
                vbox.setBackground(new Background(background));
                vbox.getChildren().addAll(btn4,btn5,btn6,backButton);

                Scene SceneForCategory1 = new Scene(vbox, 1200, 700);
                primaryStage.setScene(SceneForCategory1);
            }
        });
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                sceneHistory.push(primaryStage.getScene());
                showEmergency();
            }
        });
        
        Label lab = new Label("Pregnancy Guidance");
       
        Font boldFont1 = Font.font("Lora", FontWeight.BOLD, 28);
        Font boldFont2 = Font.font("Lora", FontWeight.BOLD, 18);
        Font boldFont3 = Font.font("Lora", FontWeight.BOLD, 14);
        
        lab.setFont(boldFont1);
        lab.setTextFill(Color.BLACK);
        
        btn1.setFont(boldFont2);
        btn2.setFont(boldFont2);
        btn3.setFont(boldFont2);
        btn4.setFont(boldFont3);
       
        BackgroundSize backgroundSize = new BackgroundSize(1200, 700, false, false, false, false);
        BackgroundImage background = new BackgroundImage(new Image("D:\\Java projects\\APP\\src\\main\\resources\\com\\app\\pregn1.jpg"), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        
        vbox.setAlignment(Pos.CENTER);
        vbox.setBackground(new Background(background));
        vbox.getChildren().addAll(lab,btn1,btn2,btn3,btn4);
        
        Scene SceneForCategory2 = new Scene(vbox, 1200, 700);
        primaryStage.setScene(SceneForCategory2);
        primaryStage.setTitle("Pregnancy guidance");
        primaryStage.show();
    }
  
    private Button createBackButton() {
        Button backButton = new Button("Back");
        Font boldFont = Font.font("Lora", FontWeight.BOLD, 14);
        backButton.setFont(boldFont);
        backButton.setStyle("-fx-border-width: 2px; -fx-border-color: black; -fx-background-color: black; -fx-text-fill: white;");
        backButton.setOnAction(event -> {
            if (!sceneHistory.isEmpty()) {
                Scene previousScene = sceneHistory.pop();
                primaryStage.setScene(previousScene);
            }
        });
        return backButton;
    }
    
    private void showFoodPreference1()
    {
        Button backButton = createBackButton();
        
        Label label = new Label("--Health Tips--");
        Label label1=new Label("1. Foods high in folate are important for neural tube development.");
        Label label2=new Label("2. Lean meats (cooked thoroughly), poultry and eggs provide essential protein");
        Label label3=new Label("3. Whole grains like brown rice, whole wheat bread, and oats offer fiber and energy.");
        
        Font boldFont = Font.font("Lora", FontWeight.BOLD, 18);
        Font boldFont1 = Font.font("Lora", FontWeight.BOLD, 28);
        
        label.setFont(boldFont1); label.setTextFill(Color.BLACK);
        label1.setFont(boldFont); label1.setTextFill(Color.BLACK);
        label2.setFont(boldFont); label2.setTextFill(Color.BLACK);
        label3.setFont(boldFont); label3.setTextFill(Color.BLACK);
        
        VBox vbox = new VBox(30);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(label, label1, label2, label3, backButton);
        
        BackgroundSize backgroundSize = new BackgroundSize(1200, 700, false, false, false, false);
        BackgroundImage background = new BackgroundImage(new Image("D:\\Java projects\\APP\\src\\main\\resources\\com\\app\\pregn1.jpg"), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        vbox.setBackground(new Background(background));
        
        Scene foodPreference1 = new Scene(vbox, 1200, 700);
        primaryStage.setScene(foodPreference1);
    }
    private void showFoodPreference2()
    {
        Button backButton = createBackButton();
        
        Label label = new Label("--Health Tips--");
        Label label1=new Label("1 Iron-rich Foods: Foods like red meat, beans, and fortified cereals help prevent anemia.");
        Label label2=new Label("2. DHA-Rich Foods: Fatty fish like salmon and walnuts provide DHA for fetal brain development.");
        Label label3=new Label("3 Calcium: Continue to get enough calcium from dairy and leafy greens.");
        
        Font boldFont = Font.font("Lora", FontWeight.BOLD, 18);
        Font boldFont1 = Font.font("Lora", FontWeight.BOLD, 28);
        
        label.setFont(boldFont1); label.setTextFill(Color.BLACK);
        label1.setFont(boldFont); label1.setTextFill(Color.BLACK);
        label2.setFont(boldFont); label2.setTextFill(Color.BLACK);
        label3.setFont(boldFont); label3.setTextFill(Color.BLACK);
        
        VBox vbox = new VBox(30);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(label, label1, label2, label3, backButton);
        
        BackgroundSize backgroundSize = new BackgroundSize(1200, 700, false, false, false, false);
        BackgroundImage background = new BackgroundImage(new Image("D:\\Java projects\\APP\\src\\main\\resources\\com\\app\\pregn1.jpg"), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        vbox.setBackground(new Background(background));
        
        Scene foodPreference2 = new Scene(vbox,1200,700);
        primaryStage.setScene(foodPreference2);
        
    }
    private void showFoodPreference3()
    {
        Button backButton = createBackButton();
        
        Label label = new Label("--Health Tips--");
        Label label1 = new Label("1. Maintain a diet rich in iron and protein.");
        Label label2 = new Label("2. Fiber-rich Foods.");
        Label label3 = new Label("3. Include healthy fats from avocados, nuts, and olive oil.");
        
        Font boldFont = Font.font("Lora", FontWeight.BOLD, 18);
        Font boldFont1 = Font.font("Lora", FontWeight.BOLD, 28);

        label.setFont(boldFont1); label.setTextFill(Color.BLACK);
        label1.setFont(boldFont); label1.setTextFill(Color.BLACK);
        label2.setFont(boldFont); label2.setTextFill(Color.BLACK);
        label3.setFont(boldFont); label3.setTextFill(Color.BLACK);
        
        VBox vbox = new VBox(30);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(label,label1,label2,label3,backButton);
        
        BackgroundSize backgroundSize = new BackgroundSize(1200, 700, false, false, false, false);
        BackgroundImage background = new BackgroundImage(new Image("D:\\Java projects\\APP\\src\\main\\resources\\com\\app\\pregn1.jpg"), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        vbox.setBackground(new Background(background));
        
        Scene foodPreference3 = new Scene(vbox, 1200, 700);
        primaryStage.setScene(foodPreference3);
    }
    private void showBasicInstructions()
    {
        Button backButton = createBackButton();
        
        BackgroundSize backgroundSize = new BackgroundSize(1200, 700, false, false, false, false);
        BackgroundImage background = new BackgroundImage(new Image("D:\\Java projects\\APP\\src\\main\\resources\\com\\app\\pregn4.jpg"), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        
        VBox vbox = new VBox(10);
        vbox.setBackground(new Background(background));
        vbox.getChildren().add(backButton);
        
        Scene scene = new Scene(vbox, 1200, 700);
        primaryStage.setScene(scene);
    }
    private void showExercise(int i,int j)
    {
        Button backButton2 = createBackButton();
        VBox exercise=new VBox(10);
        exercise.setPrefWidth(1200);
        BackgroundSize backgroundSize = new BackgroundSize(1200, 700, false, false, false, false);
        BackgroundImage background = new BackgroundImage(new Image("D:\\Java projects\\APP\\src\\main\\resources\\com\\app\\pregn2.jpg"), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        //exercise.setBackground(new Background(background));
        exercise.getChildren().add(backButton2);
        for(;i<j;i++)
        {
            Image img=new Image("D:\\Java projects\\APP\\src\\main\\resources\\com\\app\\ex"+(i+1)+".png");
            ImageView imgv=new ImageView(img);
            imgv.setFitHeight(200);
            imgv.setFitWidth(200);
            Label label = new Label(exName[i]);
            Label label1 = new Label(exDesc[i]);
            label1.setMaxWidth(400);
            label1.setWrapText(true);
            Font boldFont = Font.font("Lora",18);
            Font boldFont1 = Font.font("Lora", FontWeight.BOLD, 28);
            label.setFont(boldFont1); label.setTextFill(Color.BLACK);
            label1.setFont(boldFont); label1.setTextFill(Color.BLACK);

            exercise.getChildren().addAll(label,imgv,label1,new Label(" "));
        }
        exercise.setAlignment(Pos.CENTER);
        exercise.setStyle("-fx-background-color=transparent");
        ScrollPane scrollPane=new ScrollPane();
        scrollPane.setContent(exercise);
        scrollPane.setBackground(new Background(background));
        Scene exScene=new Scene(scrollPane,1200,700);
        primaryStage.setScene(exScene);
    }
    private void showEmergency(){
        Button backButton3 = createBackButton();
        Label label1=new Label("Called an ambulance");
        Label label2=new Label("They will arrive in 15 mins!!");
        VBox menuLayout10 = new VBox(10);
        menuLayout10.setAlignment(Pos.CENTER);
        menuLayout10.getChildren().addAll(label1,label2,backButton3);
        Scene menuScene = new Scene(menuLayout10,400, 400);
        primaryStage.setScene(menuScene);
    }
     public static void main(String[] args) {
        launch(args);
    }
}
