class Student {
    String name ;
    String usn;
    String grade;
    int phoneNumber;
    int age;

    void print(String name){
        System.out.println(name + " is present");
    }
}

public class studentInfo{
    public static void main(String[] args){
        Student std1 =new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        Student std4 = new Student();
        Student fn = new Student();

        std1.name= "Darshan";
        std2.name = "Anand";
        std3.name = "Jagannath";
        std4.name = "Bharath";

        fn.print(std1.name);
        fn.print(std2.name);
        fn.print(std3.name);
        fn.print(std4.name);

    }
}
