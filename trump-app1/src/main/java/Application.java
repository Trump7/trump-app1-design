import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;

public class Application {
    //create a list of lists to

    @FXML
    private MenuItem addList;

    @FXML
    public void addaList(){

    }

    @FXML
    private MenuItem delList;

    @FXML
    public void delaList(){

    }

    @FXML
    private MenuItem exitProgram;

    @FXML
    public void exitTheProgram(){

    }

    //This is the top list that shows all to-do lists available
    @FXML
    private TableView<?> itemsLists;


    @FXML
    private MenuItem loadLists;

    @FXML
    public void loadList(){
        //create a constructor of SaveOrOpen
        //call the openFile method
    }

    @FXML
    private MenuItem saveLists;

    @FXML
    public void saveList(){
        //create a constructor of SaveOrOpen
        //call the saveFile method with an arrayList of the selected parameters
    }

    @FXML
    private RadioButton showAll;

    @FXML
    public void showAllItems(){

    }

    @FXML
    private RadioButton showComplete;

    @FXML
    public void showCompletedItems(){

    }

    @FXML
    private RadioButton showIncomplete;

    @FXML
    public void showIncompletedItems(){
        //
    }

    @FXML
    private Button showItems;

    @FXML
    public void showItemsOfList(ActionEvent event){

    }

    @FXML
    private ListView<?> todoLists;

}
