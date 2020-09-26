package iteratordesignpattern;

import java.util.ArrayList;
import java.util.Arrays;

public class ContractorToDoList  extends ToDoIterator{
    private String address;
    private ToDo[] todos;
    private int count;

    /* Constructor to initialize variables. Calls the createIterator method along with */
    public ContractorToDoList(String address){
        super(null);
        this.address = address;
        todos = new ToDo[2];
        createIterator();
        count = 0;

    }

    /*
    Accepts the title, description, price, contact, and list of supplies
    Adds the items to the Array
     */
    public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
        ToDo todo = new ToDo(title, description, price, contact, supplies);
        if(todos.length==count) {
            todos=growArray(todos);
        }
        todos[count] = todo;
        count++;
    }


    /*
    returns a new ToDoIterator
     */
    public ToDoIterator createIterator(){
        return new ToDoIterator(todos);


    }

    /*
    Returns the Address
     */
    public String getAddress(){
        return address;
    }

    /* creates a double total value to hold the price from the String m
    which iterates through todos adding the price to the total.
    */
    public double getTotalCost(){
        double total = 0.0;
        for(ToDo m : todos){
            if (m!=null){
                total += m.getPrice();
            }
        }
        return total;

    }

    /* Doubles the length of the todos array length */
    private ToDo[] growArray(ToDo[] todos){
        todos = Arrays.copyOf(todos, todos.length*2);
        return todos;

    }
}
