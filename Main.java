
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
 public static void main(String args[]) {
    LinkedList<Student> list = new LinkedList<Student>();

        System.out.println("Original empty list: ");
        System.out.print(list.toString());

        //Populate the list.
        list.addFirst(new Student("Peter", "Pumpkin", 2.5) );
        list.addFirst(new Student("Adam", "Apple", 3.3) );
        list.insertAt(3, new Student("Jane", "Jalapeno", 4.5) );
        list.insertAt(2, new Student("Kay", "Kasava", 4.3) );
        list.addLast(new Student("Gary", "Guava", 1.3) );

        System.out.println("\nPopulated list: ");
        System.out.print(list.toString());

        System.out.println("\nReverse list: ");
        System.out.print(list.reversed());
    }
}
