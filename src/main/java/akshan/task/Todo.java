package akshan.task;

/**
 * Represents a todo task without a specific deadline.
 */
public class Todo extends Task{

    /**
     * Constructs a Todo task.
     *
     * @param name Name of the todo.
     * @throws IllegalArgumentException If name is null or empty.
     */
    public Todo(String name) throws IllegalArgumentException {
        super(name);
        this.type = "T";
    }

    /**
     * Returns a string representation of the todo task.
     *
     * @return String representation of the todo task.
     */
    @Override
    public String toString() {
        return "[" + this.type + "]" + "[" + (this.isDone ? "X" : " ") + "] " + this.name;
    }

    /**
     * Returns a string representation of the todo task suitable to be stored in data file.
     *
     * @return String representation of the todo task (storage format).
     */
    @Override
    public String toStorageString(String separator) {
        return this.type + separator + (super.isDone ? "1" : "0") + separator + this.name;
    }
}
