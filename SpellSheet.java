package spellsheet;

import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author emmab
 */
public class SpellSheet extends Application {

    @Override
    public void start(Stage primaryStage) {
        ArrayList<Character> charArrayList = new ArrayList<Character>();
        for (int i = 0; i < 10; i++) {
            charArrayList.add(new Character("C" + i));
        }
        InitializeSpells init = new InitializeSpells();
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 800, 600);
        TextArea descr = new TextArea();
        TextArea nickname = new TextArea();
        nickname.setMinSize(200, 25);
        nickname.setMaxSize(200, 25);
        nickname.setPromptText("Character Nickname");
        TextArea nameText = new TextArea();
        nameText.setMinSize(200, 25);
        nameText.setMaxSize(200, 25);
        nameText.setPromptText("Set Character Name");
        ImageView charImage = new ImageView();
        ObservableList<String> classes
                = FXCollections.observableArrayList(
                        "All", "Bard", "Cleric", "Druid", "Paladin", "Ranger", "Sorcerer", "Warlock", "Wizard");
        ObservableList<String> levels
                = FXCollections.observableArrayList(
                        "All", "Cantrips", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        final ComboBox levelBox = new ComboBox(levels);
        levelBox.setPromptText("Level");
        final ComboBox classBox = new ComboBox(classes);
        classBox.setPromptText("Class");
        ObservableList<String> characters
                = FXCollections.observableArrayList(
                        "Character 1", "Character 2", "Character 3", "Character 4", "Character 5", "Character 6", "Character 7", "Character 8", "Character 9", "Character 10");
        final ComboBox characterBox = new ComboBox(characters);
        characterBox.setPromptText("Choose a Character");
        descr.setEditable(false);

        ListView<String> allspellslistView = new ListView<>();
        ListView<String> characterlistView = new ListView<>();
        ListView<String> alldescrslistView = new ListView<>();
        init.initallspellsListView(allspellslistView);
        init.initalldescrListView(alldescrslistView);

        levelBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int selectedLevel = (int) levelBox.getValue();
            }
        });
        characterBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int selectedChar = characterBox.getSelectionModel().getSelectedIndex();
                if (selectedChar != -1) {
                    characterlistView.setItems(charArrayList.get(selectedChar).getCharList());
                }
                nickname.setText(charArrayList.get(selectedChar).getName());
            }
        });
        final Button removeButton = new Button("Remove Spell from Character");
        removeButton.setOnAction((ActionEvent event) -> {
            final int selectedIdx = characterlistView.getSelectionModel().getSelectedIndex();
            if (selectedIdx != -1) {
                String itemToRemove = characterlistView.getSelectionModel().getSelectedItem();

                final int newSelectedIdx
                        = (selectedIdx == characterlistView.getItems().size() - 1)
                        ? selectedIdx - 1
                        : selectedIdx;

                characterlistView.getItems().remove(selectedIdx);
                characterlistView.getSelectionModel().select(newSelectedIdx);
                descr.setText("");
            }
        });
        final Button shiftButton = new Button(">>");
        shiftButton.setOnAction((ActionEvent event) -> {
            final int selectedIdx = allspellslistView.getSelectionModel().getSelectedIndex();
            final int charselectedIdx = characterBox.getSelectionModel().getSelectedIndex();
            if (charselectedIdx > -1) {
                charArrayList.get(charselectedIdx).addCharList(allspellslistView.getSelectionModel().getSelectedItem());
                alldescrslistView.getSelectionModel().select(selectedIdx);
                charArrayList.get(charselectedIdx).addDescrList(alldescrslistView.getSelectionModel().getSelectedItem());
                characterlistView.setItems(charArrayList.get(charselectedIdx).getCharList());
            }
        });
        allspellslistView.setOnMouseClicked((MouseEvent event) -> {
            characterlistView.getSelectionModel().clearSelection();
        });
        characterlistView.setOnMouseClicked((MouseEvent event) -> {
            allspellslistView.getSelectionModel().clearSelection();
        });
        final Button showButton = new Button("Show Spell Description");
        showButton.setOnAction((ActionEvent event) -> {
            final int allselectedIdx = allspellslistView.getSelectionModel().getSelectedIndex();
            final int charselectedIdx = characterlistView.getSelectionModel().getSelectedIndex();
            if (allselectedIdx != -1) {
                alldescrslistView.getSelectionModel().select(allselectedIdx);
                String itemToShow = alldescrslistView.getSelectionModel().getSelectedItem();
                descr.setText(itemToShow);
            }
            if (charselectedIdx != -1) {
                int selectedChar = characterBox.getSelectionModel().getSelectedIndex();
                if (selectedChar != -1) {
                    characterlistView.setItems(charArrayList.get(selectedChar).getCharList());
                    String itemToShow = charArrayList.get(selectedChar).getDescr(charselectedIdx);
                    descr.setText(itemToShow);
                }
            }
        });
        Button nicknameButton = new Button("Set Name");
        nicknameButton.setOnAction((ActionEvent event) -> {
            int selectedChar = characterBox.getSelectionModel().getSelectedIndex();
            if(selectedChar != -1){
                charArrayList.get(selectedChar).setName(nickname.getText());
            }
        });
        //come back to these!
        classBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int selectedLevel = levelBox.getSelectionModel().getSelectedIndex();
                int selectedClass = classBox.getSelectionModel().getSelectedIndex();
                ObservableList<String> list = init.ClassandLevelListView(selectedClass, selectedLevel);
                allspellslistView.setItems(list);                
            }
        });
        levelBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int selectedLevel = levelBox.getSelectionModel().getSelectedIndex();
                int selectedClass = classBox.getSelectionModel().getSelectedIndex();
                ObservableList<String> list = init.ClassandLevelListView(selectedClass, selectedLevel);
                System.out.println(list);
                allspellslistView.setItems(list);
            }
        });
                
        //layout
        final HBox controls = new HBox(10);
        controls.setAlignment(Pos.CENTER_LEFT);
        showButton.setStyle("-fx-padding: 10; -fx-background-color: #e0ccff;");
        shiftButton.setStyle("-fx-padding: 10; -fx-background-color: #e0ccff;");
        removeButton.setStyle("-fx-padding: 10; -fx-background-color: #e0ccff;");
        nicknameButton.setStyle("-fx-padding: 10; -fx-background-color: #e0ccff;");
        controls.getChildren().addAll(showButton, shiftButton, removeButton);
        final HBox modifiers = new HBox(10);
        modifiers.setAlignment(Pos.CENTER_LEFT);
        modifiers.getChildren().addAll(classBox, levelBox, characterBox, nickname, nicknameButton);
        final HBox views = new HBox(10);
        views.setAlignment(Pos.CENTER_LEFT);
        descr.setStyle("-fx-padding: 10; -fx-background-color: #e0ccff;");
        views.setStyle("-fx-padding: 10; -fx-background-color: #e0ccff;");
        views.getChildren().addAll(allspellslistView, characterlistView);
        final VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER_LEFT);
        layout.setStyle("-fx-padding: 10; -fx-background-color: #b380ff;");
        layout.getChildren().setAll(
                modifiers,
                views,
                controls,
                descr
        );
        layout.setPrefWidth(900);
        primaryStage.setScene(new Scene(layout));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
