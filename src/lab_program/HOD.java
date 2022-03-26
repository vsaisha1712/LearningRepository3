package lab_program;

//HOD Class 
public class HOD {
 public static void main(String[] args) {
     // Creating object of Professor class
     Professor p1 = new Professor("Oops",2);
     // Invoking methods and printing results
     p1.teaches();
     p1.install();

     // Creating object of PHDscholar class 
     PHDscholar s1 = new Professor("Scholar","LAB1002");
     // Invoking methods and printing results
     s1.labsAssigned();
     s1.help();
 }
}

//LabInCharge Interface
interface LabInCharge{
// Declaring and initializing member variables
String labName = "LAB10";
int roomNo = 5;

// Defining abstract method install
public void install();
}

//PHDscholar interface
abstract class PHDscholar{  
// Declaring member variables
String scholarName;
String labConducted;

// Declaring abstract method help
abstract void help(); 
// Declaring concrete method labsAssigned
void labsAssigned(){
 // Printing details
  System.out.println(scholarName + " assigned " + labConducted);
}
}  

//Professor Class
class Professor extends PHDscholar implements LabInCharge{
// Declaring member variables
String subject;
int emp_id;

// Constructor to intialize member variables of Professor class
Professor(String subject,int emp_id)
{
 this.subject = subject;
 this.emp_id = emp_id;
}

// Constructor to intialize member variables of abstract class PHDscholar
Professor(String scholarName,String labConducted)
{
 this.scholarName = scholarName;
 this.labConducted = labConducted;
}

// Defining install method from LabInCharge interface
public void install(){
 // Printing details
  System.out.println("Programs installed in " + labName + " and roomNo is " + roomNo);
}

// Defining help method from abstract class PHDscholar
void help(){
 // Printing details
  System.out.println(scholarName + " helps students to complete work");
}

// Defining concrete method teaches
void teaches(){
 // Printing details
 System.out.println("Professor" + emp_id + " teaches " + subject);
}
}
