package iteratordesignpattern;
import java.util.ArrayList;

public class ToDo {

    /* Declaring the variables */
    private String title;
    private String description;
    private double price;
    private String contact;
    private ArrayList<String> supplies;


    /*Constructor for ToDo class initializing variables */
    public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
        super();
        this.title = title;
        this.description = description;
        this.price = price;
        this.contact = contact;
        this.supplies = supplies;
    }


    /* Returns price */
    public double getPrice(){
        return price;
    }

    /* Outputs the formatted ToDo List with details */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("*****" + title + "*****");
        sb.append(description +  "\n");
        sb.append("Supply List: \n");
        for (String s : supplies){
            sb.append("- "+ s + "\n");

        }
        sb.append("Price: $" + price + "\n");
        return sb.toString();
    }

}
