package a2;
/**
 * Please provide the following information
 *  Name: Yen-Hsing, Li
 *  NetID: yl2924
 *  Testing Partner Name:
 *  Testing Partner NetID:
 *  Tell us what you thought about the assignment:
 */

/** A mutable list of {@code Student} objects.
 */
public class StudentList {
    // Implementation: the StudentList is implemented
    // as a resizable array data structure. It should contain
    // an array that has a large enough capacity to hold all the elements,
    // plus possibly extra elements. It should be able to hold
    // a large number of students but not use up a large amount
    // of memory if it holds a small number of students.

    // TODO 10: Add instance variables for the StudentList and write a class invariant
    // You may not use any classes from the java.util package.
    private Student [] list;
    private int numsofstudent;
    /** How long you spent on this assignment */
    public static double timeSpent = -1;

    /** Constructor: A new empty {@code StudentList}. */
    public StudentList() {
        // TODO 11
        // The capacity of the StudentList is not the same as the size.
        // The capacity is the length of the backing array.
        // We suggest starting with a capacity of 5.
        // If the backing array runs out of space, double the size of the backing array
        // and copy all elements to the new backing array
        list = new Student[5];
        numsofstudent = 0;
    }

    /** The number of elements in this StudentList. */
    public int size() {
        // TODO 12
        // Note: Do not confuse size and capacity.
        return numsofstudent;
    }

    /** The element in the list at position i. Positions start from 0.
     * Requires: 0 <= i < size of StudentList
     */
    public Student get(int i) {
        // TODO 13
        return list[i];
    }

    /** Effect: Add Student s to the end of the list. */
    public void append(Student s) {
        // TODO 14
        // Make sure that BEFORE adding a Student to the array, you
        // ensure that the capacity of the array is enough to add a
        // Student to it.
        // Note: Make sure you are keeping the class invariant for ALL classes true.
        if(list.length == numsofstudent){
            Student [] newlist = new Student[list.length*2];
            for(int i = 0; i < list.length; i++){
                newlist[i] = list[i];
            }
            list = newlist;
        }
        list[numsofstudent++] = s;
    }

    /** Returns: whether this list contains Student s. */
    public boolean contains(Student s) {
        // TODO 15
        for(int i = 0; i < list.length; i++){
            if(list[i]!=null && s.toString().equals(list[i].toString()))return true;
        }
        return false;
    }

    /** Effect: If Student s is in this StudentList, remove Student s from the array and return true.
     * Otherwise return false. Elements other than s remain in the same relative order.
     */
    public boolean remove(Student s) {
        // TODO 16
        // Note: Make sure you are keeping the class invariant for ALL classes true.
        if(contains(s)){
            Student [] newlist = new Student[list.length-1];
            for(int i = 0; i < newlist.length; i++){
                if(list[i] != null && !list[i].toString().equals(s.toString())){
                    newlist[i] = list[i];
                }
            }
            list = newlist;
            numsofstudent--;
            for(Student b : list){
                if(b!=null)System.out.println(b.firstName());
            }
            return true;
        }
        return false;
    }

    // TODO 17 you may want to write some private helper methods

    /** The String representation of this StudentList */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(get(i));
        }
        sb.append("]");
        return sb.toString();
    }
}
