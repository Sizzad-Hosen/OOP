class Pen {
    private String color;
    private String type;

    // Constructor to initialize Pen object
    public Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    // Getter and Setter methods (Good practice for encapsulation)
    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void write() {
        System.out.println("Writing something with a " + color + " " + type + " pen.");
    }
}

class Student {
    private String name;    // Made private
    private String id;      // Changed "Id" to "id" (Java naming convention)
    private String age;     // Made private
    private String address; // Changed "Address" to "address" (Java naming convention)

    // Constructor for Student
    public Student(String name, String id, String age, String address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
    }
}

//inheritance

//singel inheritance
class Shape{
    String color;

    public void area(){
        System.out.println("display area");
    }
}

//multi inheritance
class Triangle extends Shape{

    public void area(int l , int h){
        System.out.println(0.5*l*h);
    }
}
//there only one based class
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.1416)*r);
    }
}


public class Main {
    public static void main(String[] args) {

        // Creating and using Pen object
        Pen pen1 = new Pen("red", "gel");
        pen1.write();

        // Creating and using Student object
        Student student1 = new Student("Alice", "S123", "20", "123 Main St");
        student1.printInfo();
    }
}