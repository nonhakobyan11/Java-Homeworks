package homework4.set;

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
        if (object == null){
            throw new NullPointerException("Set doesn't allow nulls");
        }
        if(!contains(object)){
            myTree.add(object);
            size++;
            return true;
        }
        return false;
    }

    /**
     * Removed the specified object from the MySortedSet
     *
     * @param object The object to be removed from the set
     * @return  A boolean specifier, which is false, if the object is not present in the set and is true otherwise
     */
    public boolean remove(T object) {
        if (object == null){
            throw new NullPointerException("Removed object can't be null");
        }
        if (contains(object)) {
            myTree.remove(object);
            size--;
            return true;
        }
        return false;
    }

    /**
     * @param object The object to be searched for
     * @return true if the specified object is found in the set and false otherwise
     */
    public boolean contains(T object) {
        if (object == null){
            throw new NullPointerException("Set doesn't contain any nulls");
        }
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

