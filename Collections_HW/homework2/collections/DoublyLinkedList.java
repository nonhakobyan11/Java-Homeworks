package homework2.collections;

import java.util.Iterator;

public class DoublyLinkedList implements Iterable<Student>{
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        Student student;
        Node next;
        Node prev;

        public Node(Student student, Node next, Node prev) {
            this.student = student;
            this.next = next;
            this.prev = prev;
        }
    }
    // constructor to create a list
    public DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    // inserts the student at the front of the list
    public void push(Student student) {
        Node newHead = new Node(student, head, null);
        if (head != null) {
            head.prev = newHead;
        }
        head = newHead;
        if (tail == null) {
            tail = newHead;
        }
        size++;
    }

    // removes and returns the first student of the list
    public Student pop() {
        if (size == 0) {
            System.out.println("The list is empty. It's impossible to do this action now.");
        }
        Node oldHead = head;
        head = head.next;
        if (head != null)
            head.prev = null;
        size--;
        return oldHead.student;
    }

    // appends the specified student to the end of the list
    public boolean addLast(Student student) {
        Node newTail = new Node(student, null, tail);
        if (tail != null) {
            tail.next = newTail;
        }
        tail = newTail;
        if (head == null) {
            head = newTail;
        }
        size++;
        return true;
    }

    // removes and returns the last student
    public Student removeLast() {
        if (size == 0) {
            System.out.println("The list is empty. It's impossible to do this action now.");
        }
        Node oldTail = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return oldTail.student;
    }

    // returns the number of students in the list
    public int size() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    // implementing Iterable interface for using foreach
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            Node current = getHead();
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Student next() {
                Student student = current.student;
                current = current.next;
                return student;
            }
        };
    }
}


