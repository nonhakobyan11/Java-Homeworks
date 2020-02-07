package homework4.model;

/**
 * Custom implementation of a Binary Search Tree.
 * Contains methods
 * {@link #add(Comparable) add()},
 * {@link #remove(Comparable)}  remove()},
 * {@link #isFound(Comparable)}  isFound()}, and
 * {@link #print() print()} public methods},
 * <p>
 * It's a generic class that uses BST algorithm for storing data.
 * It doesn't allow duplicates.
 * The objects are sorted in acsending order.
 *
 * @author Nonna Hakobyan
 */

public class MyBinaryTree<T extends Comparable<T>> {

    /* Class containing left and right child of current node and a generic object */
    class Node {
        T item;
        Node left;
        Node right;

        public Node(T item) {
            this.item = item;
        }
    }

    // Root of Binary Search Tree
    private Node root;

    // Constructor, which initialize the root null
    public MyBinaryTree() {
        root = null;
    }

    /**
     * Adds new element to the Binary Search Tree structure
     * This method mainly calls
     * {@link #addRecursive(Node, Comparable) addRecursive()}
     *
     * @param element The element to be added to the tree.
     * @return A boolean specifier, which is false if something went wrong and the object was not added
     * and is true if object is added to the set successfully
     */
    public boolean add(T element) {
        if (!isFound(element)) {
            root = addRecursive(root, element);
            return true;
        }
        return false;
    }

    /* A recursive function to add a new element in BST */
    private Node addRecursive(Node root, T element) {
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(element);
            return root;
        }
        /* Otherwise, recur down the tree */
        if (root.item.compareTo(element) > 0) {
            root.left = addRecursive(root.left, element);
        } else if (root.item.compareTo(element) < 0) {
            root.right = addRecursive(root.right, element);
        }
        /* return the (unchanged) node pointer */
        return root;
    }

    /**
     * Removes element from the Binary Search Tree structure
     * This method mainly calls
     * {@link #removeRecursive(Node, Comparable)}  removeRecursive()}
     *
     * @param element The element to be removed from the tree.
     * @return A boolean specifier, which is false, if the object is not present in the set and is true otherwise
     */
    public boolean remove(T element) {
        if (isFound(element)) {
            root = removeRecursive(root, element);
            return true;
        }
        return false;
    }

    /* A recursive function to remove an element from BST */
    private Node removeRecursive(Node root, T element) {
        /* Recur down the tree */
        if (root.item.compareTo(element) > 0) {
            root.left = removeRecursive(root.left, element);
        } else if (root.item.compareTo(element) < 0) {
            root.right = removeRecursive(root.right, element);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.item = minValue(root.right);
            // Delete the inorder successor
            root.right = removeRecursive(root.right, root.item);
        }
        return root;
    }

    // Find the inorder successor (minimum value in the right subtree)
    public T minValue(Node root) {
        T min = root.item;
        while (root.left != null) {
            min = root.left.item;
            root = root.left;
        }
        return min;
    }

    /**
     * @param element The element to be searched for
     * This method mainly calls
     * {@link #searchRecursive(Node, Comparable) searchRecursive()}
     * @return true if the specified object is found in the set and false otherwise
     */
    public boolean isFound(T element) {
        return searchRecursive(root, element);
    }

    private boolean searchRecursive(Node root, T element) {
        // Root is null or element equals the root
        if (root == null) {
            return false;
        } else if (root.item.equals(element)) {
            return true;
        }
        return root.item.compareTo(element) > 0
                ? searchRecursive(root.left, element)       // element is less than root's key
                : searchRecursive(root.right, element);     // element is greater than root's value
    }

    /**
     * Traverses through the set and prints all stored elements in the console.
     * This method mainly calls
     * {@link #printRecursive(Node) printRecursive()}
     */
    public void print() {
        printRecursive(root);
    }

    // A utility function to do inorder traversal of BST, using left and right children
    private void printRecursive(Node root) {
        if (root != null) {
            printRecursive(root.left);
            System.out.println(root.item);
            printRecursive(root.right);
        }
    }

}
