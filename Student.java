
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    private String first;
    private String last;
    private double gpa;
    
    public Student(String first, String last, double gpa)
    {
      this.first = first;
      this.last = last;
      this.gpa = gpa;
    }

    public final String getFirst(){return first;  }
    public final String getLast(){return last;  }
    public final String getName(){return "[" + last + " ," + first + "]";  }
    public final double getGpa(){ return gpa; }
   
    public final void setFirst(){ this.first = first; }
    public final void setLast(){ this.last = last; }
    public final void setName(){ this.first = first; this.last = last; }
    public final void setGpa(){ this.gpa = gpa; }
    
    @Override
    public String toString() {
       return "[" + getName() + ", " + getGpa() + "]";
    }
    
}
