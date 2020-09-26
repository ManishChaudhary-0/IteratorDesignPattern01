package iteratordesignpattern;
import java.util.Iterator;

/*  implements the Iterator interface */
public class ToDoIterator implements Iterator<ToDo>{
    private ToDo[] todos;
    private int position;

    /* Constructor that initializes todos and position  */
    public ToDoIterator(ToDo[] todos){
        this.todos = todos;
        position = 0;

    }

    /* Checks position inside todos, and sets boolean hasNext to ture or false depending on position*/
    public boolean hasNext() {
        if (position < todos.length && todos[position] != null){
            return true;
        }
        else {
            return  false;
        }
    }

    /* Returns the next ToDo */
    /* If no more todos, returns null */
    public ToDo next() {
        if (hasNext()){
            return todos[position++];
        }
        else {
            return null;
        }

    }
}
