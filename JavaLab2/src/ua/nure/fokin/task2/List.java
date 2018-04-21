package ua.nure.fokin.task2;

public interface List<E> extends java.lang.Iterable<E> {
    // Appends the specified element to the end of this list
    void add(E el);

    // Appends all of the elements in the specified collection to the end of this list
    void addAll(List<? extends E> list);

    // Removes all of the elements from this list
    void clear();

    // Returns true if this list contains the specified element
    boolean contains(Object el);

    // Returns the element at the specified position in this list.
    E get(int index);

    // Returns the index of the first occurrence of the specified element in this list
    // (use an equals method to find first occurrence)
    int indexOf(Object el);

    // Removes the element at the specified position in this list,
    // returns the element previously at the specified position
    // Throws IndexOutOfBoundsException if the index is out of range
    Object remove(int index);

    // Removes the first occurrence of the specified element from this list,
    // returns true if this list contained the specified element
    boolean remove(Object el);

    // Returns the number of elements in this list
    int size();
    // returns an iterator
    Iterator<E> iterator();
}
