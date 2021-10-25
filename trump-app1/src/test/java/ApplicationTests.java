import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTests {

    @Test
    void delaListTest(){
        //This test will check if a list was actually deleted from a list
        //create a constructor of Application
        //create a new list of lists
        //add three or four lists to that list
        //set the newly created list to the Applications todoList
        //call delaList
        //check that there is no list named testList in the file
    }

    @Test
    void showAllItemsTest(){
        //This test will check if a list displays all the items
        //create a constructor of Application
        //create a new list of lists
        //add three or four lists to that list of lists
        //set the newly created list to the Applications itemsList
        //call showAllItems
        //check that all lists are present in the newly created arraylist
    }

    @Test
    void showCompletedItemsTest(){
        //This test will check if a list displays all the completed items
        //create a constructor of Application
        //create a new list of lists
        //add three or four lists to that list of lists with two being completed
        //set the newly created list to the Applications itemsList
        //call showCompletedItems
        //check that all completed lists are present in the newly created arraylist
    }

    @Test
    void showIncompletedItemsTest(){
        //This test will check if a list displays all the incompleted items
        //create a constructor of Application
        //create a new list of lists
        //add three or four lists to that list of lists with two being incomplete
        //set the newly created list to the Applications itemsList
        //call showIncompletedItems
        //check that all incompleted lists are present in the newly created arraylist
    }
}
