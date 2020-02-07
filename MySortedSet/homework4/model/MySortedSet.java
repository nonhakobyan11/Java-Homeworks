package homework4.model;
import homework4.exceptions.DuplicateElementException;
import homework4.exceptions.ObjectNotFoundException;

/**
 * Custom implementation of a sorted set.
 * Contains methods
 * {@link #add(Comparable) add()},
 * {@link #remove(Comparable) remove()},
 * {@link #getSize() getSize()},
 * {@link #contains(Comparable) contains()}, and
 * {@link #print() print()} public methods},
 * <p>
 * It's a generic class that stores objects in a  Binary Search Tree data structure.
 * It doesn't allow duplicates or nulls.
 * The objects are sorted in acsending order.
 *
 * @author Nonna Hakobyan
 */

public class MySortedSet<T extends Comparable<T>> {
    private MyBinaryTree<T> myTree;
    private int size;

    public MySortedSet() {
        this.myTree = new MyBinaryTree<>();
    }

    /**
     * Adds new objects to the MySortedSet
     *
     * @param object The object to be added to the set. Object must implement Comparable interface
     * @return  A boolean specifier, which is false if something went wrong and the object was not added
     *          and is true if object is added to the set successfully
     */
    public boolean add(T object) {
        if(contains(object)){
            throw new DuplicateElementException("The set already contains " + object);
        }
        size++;
        return myTree.add(object);
    }

    /**
     * Removed the specified object from the MySortedSet
     *
     * @param object The object to be removed from the set
     * @return  A boolean specifier, which is false, if the object is not present in the set and is true otherwise
     */
    public boolean remove(T object) {
        if (!contains(object)) {
            throw new ObjectNotFoundException("There is no " + object + " in the set.");
        }
        size--;
        return myTree.remove(object);
    }

    /**
     * @param object The object to be searched for
     * @return true if the specified object is found in the set and false otherwise
     */
    public boolean contains(T object) {
        return myTree.isFound(object);
    }

    /**
     * The getSize() method return the size of the MySortedSet
     *
     * @return size represents the number of objects in the set
     */
    public int getSize() {
        return size;
    }

    /**
     * Traverses through the set and prints all stored elements in the console.
     */
    public void print() {
        System.out.println("\nIn set is stored the following data:");
        myTree.print();
        System.out.println();
    }
}

