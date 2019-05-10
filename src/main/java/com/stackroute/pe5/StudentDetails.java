//Create a Student class that represents the following information of a student: id, name, and age
//all the member variables should be private .
//a. Implement `getter and setter` .
//b. Create a `StudentSorter` class that implements `Comparator interface` .
//c. Write a class `Maintest` create Student class object(minimum 5)
//d. Add these student object into a List of type Student .
//e. Sort the list based on their age in decreasing order, for student having
//same age, sort based on their name.
//f. For students having same name and age, sort them according to their ID.
package com.stackroute.pe5;
import java.util.*;
import java.lang.*;
public class StudentDetails {
    int rollno;
    int age;
    String name;

    // Constructor
    public StudentDetails(int rollno, String name, int age)
    {
        this.rollno = rollno;
        this.name = name;
        this.age=age;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name + " "  +this.age;
    }
}

class Sortbyroll implements Comparator<StudentDetails>
{
    // Used for sorting in descending order of
    // roll number
    public int compare(StudentDetails a, StudentDetails b)
    {
        return b.rollno - a.rollno;
    }
}

class Sortbyname implements Comparator<StudentDetails>
{

    public int compare(StudentDetails a, StudentDetails b)
    {
        return b.name.compareTo(a.name);
    }
}

class Sortbyage implements Comparator<StudentDetails>
{
    public int compare(StudentDetails a, StudentDetails b){
        return b.age-a.age;
    }
}
// Driver class
class Main {
    public static void main(String[] args) {
        ArrayList<StudentDetails> ar = new ArrayList<StudentDetails>();
        ar.add(new StudentDetails(111, "saranya",18 ));
        ar.add(new StudentDetails(131, "monisha",15));
        ar.add(new StudentDetails(121, "sneha",16));

        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyname());

        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar,new Sortbyage());
        System.out.println("\n Sorted by age");
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));

    }
}