package a2;

/** Test harness for Assignment 2
 */
public class A2Test {
    public static void main(String[] args) {
        testEmptyList();
        testAppend();
        testContains();
        testRemove();
        testGet();
        testSizeandAppend();
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
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("expected = BillNye");
    }

    public static void testSizeandAppend(){
        StudentList list = new StudentList();
        Student s = new Student("Bill", "Nye", 4);
        Student a = new Student("Andy", "Li", 4);
        Student b = new Student("Cathy", "Lin", 3);
        Student c = new Student("Bill", "Chang", 2);
        Student d = new Student("Leo", "kim", 1);
        Student e = new Student("Issac", "Wang", 3);
        list.append(a);
        list.append(b);
        list.append(s);
        list.append(c);
        list.append(d);
        list.append(e);
        System.out.println("list.size() = " + list.size());
        System.out.println("expected = 6");
        System.out.println("list.get(5) = " + list.get(5));
        System.out.println("expected = Issac Wang");
    }

}
