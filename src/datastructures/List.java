package datastructures;

public interface List {
    // add value to the end of the list
    void add(Object value);

    // we can add value by index between [0, size]
    // otherwise throw new IndexOutOfBoundsException
    void add(Object value, int index);

    // we can remove value by index between [0, size - 1]
    // otherwise throw new IndexOutOfBoundsException
    // [A, B, C] remove = 0
    // [B (index = 0) , C (index = 1)]
    Object remove(int index);

    // [A, B, C] size = 3
    // we can get value by index between [0, size - 1]
    // otherwise throw new IndexOutOfBoundsException
    Object get(int index);

    // we can set value by index between [0, size - 1]
    // otherwise throw new IndexOutOfBoundsException
    Object set(Object value, int index);

    //clear all collection
    void clear();

    //gets the number of elements in the list
    int size();

    //checks if a list is empty or not
    boolean isEmpty();

    //checks if the special element exista in the given list or not
    boolean contains(Object value);

    //returns from the list indext of special element
    int indexOf(Object value);

    //returns from the list last indext of special element
    int lastIndexOf(Object value);

    // prints list in next view [A, B, C]
    String showString();
}
