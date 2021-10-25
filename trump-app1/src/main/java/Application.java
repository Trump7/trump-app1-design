import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;

public class Application {
    //create a list of lists named todoLists to hold each to-do list
    //create another list named itemsList to hold each item

    public void updateToDoList(){
        //clear the todoLists
        //go through every top element in the list of lists and add it to the todoLists
    }

    public void updateItemList(){
        //clear the itemsList
        //go through every element in the selected list of lists list and add it to the itemsLists
    }

    @FXML
    private MenuItem addList;

    @FXML
    public void addaList(){
        //this will open the AddList fxml file
        //After the user inputs the list title,
        //this method will add a list to the lists of lists
    }

    @FXML
    private MenuItem delList;

    @FXML
    public void delaList(){
        //this will delete a selected list
        //it does this by getting the selected text
        //and iterating through the list until it finds the selected list
        //then it will delete it
    }

    @FXML
    private MenuItem exitProgram;

    @FXML
    public void exitTheProgram(){
        //close the stage when clicked
    }

    @FXML
    private TableView<String> itemsLists;


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
        //this is the default show method that will show all items within a specific arraylist
    }

    @FXML
    private RadioButton showComplete;

    @FXML
    public void showCompletedItems(){
        //this method will only populate itemsList with items that have a true value
        //in their completed section

        //In order to do this we have to filter the itemsList
        //create a new arraylist to store the filtered items and set it equal to null
        //use filterfield to find items with a true value in their completed section
        //update the itemslist
    }

    @FXML
    private RadioButton showIncomplete;

    @FXML
    public void showIncompletedItems(){
        //this method will only populate itemsList with items that have a false value
        //in their completed section

        //In order to do this we have to filter the itemsList
        //create a new arraylist to store the filtered items and set it equal to null
        //use filterfield to find items with a false value in their completed section
        //update the itemslist
    }

    @FXML
    private Button showItems;

    @FXML
    public void showItemsOfList(ActionEvent event){
        //This method will take the highlighted field and show the items of that list
        //It will have to iterate through the lists to find the correct to-do list
        //then it will have to update the listview with the contents of the highlighted field
    }

    //This is the top list that shows all to-do lists available
    @FXML
    private ListView<?> todoLists;

}
