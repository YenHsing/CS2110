package a2;

/** Test harness for Assignment 2
 */
public class A2Test {
    public static void main(String[] args) {
        testEmptyList();
        testAppend();
        // TODO Add more tests to thoroughly test StudentList
        //
        // The methods provided do not necessarily test everything in each
        // case.  You will need to add more to the existing testing procedures
        // as well as add new testing procedures.  You can also add tests to
        // test the Course and Student classes.
        // 
        // Try to keep tests small and test features as independently as
        // possible.
        //testContains();
        testRemove();
        testGet();
    }

    public static void testEmptyList() {
        StudentList list = new StudentList();
        Student s = new Student("Bill", "Nye", 4);
        System.out.println("list.size() = " + list.size());
        System.out.println("expected = 0");
        System.out.println("list.contains(s) = " + list.contains(s));
        System.out.println("expected = false");
    }

    public static void testAppend() {
        StudentList list = new StudentList();
        Student s = new Student("Bill", "Nye", 4);
        Student a = new Student("Andy", "Li", 2);
        list.append(s);
        System.out.println("list.size() = " + list.size());
        System.out.println("expected = 1");
        list.append(a);
        System.out.println("list.size() = " + list.size());
        System.out.println("expected = 2");
    }

    //self testing

    public static void testContains() {
        StudentList list = new StudentList();
        Student s = new Student("Bill", "Nye", 4);
        Student a = new Student("Andy", "Li", 4);
        list.append(s);
        list.append(a);
        System.out.println("list.contains(s) = " + list.contains(s));
        System.out.println("expected = true");
        System.out.println("list.contains(a) = " + list.contains(a));
        System.out.println("expected = true");
        System.out.println("list.contains(Kevin) = " + list.contains(new Student("Kevin", "Lin", 2)));
        System.out.println("expected = false");
    }

    public static void testRemove(){
        StudentList list = new StudentList();
        Student s = new Student("Bill", "Nye", 4);
        Student a = new Student("Andy", "Li", 4);
        Student b = new Student("Cathy", "Lin", 4);
        list.append(a);
        list.append(s);
        list.append(b);
        System.out.println("list.size() = " + list.size());
        System.out.println("expected = 3");
        list.remove(a);
        System.out.println("list.size() = " + list.size());
        System.out.println("expected = 2");
        System.out.println("list.contains(a) = " + list.contains(a));
        System.out.println("expected = false");
        System.out.println("list.contains(s) = " + list.contains(s));
        System.out.println("expected = true");
    }

    public static void testGet(){
        StudentList list = new StudentList();
        Student s = new Student("Bill", "Nye", 4);
        Student a = new Student("Andy", "Li", 4);
        Student b = new Student("Cathy", "Lin", 4);
        list.append(a);
        list.append(b);
        list.append(s);
        System.out.println("list.get(2).toString() = " + list.get(2).toString());
        System.out.println("expected = BillNye");
    }


}
