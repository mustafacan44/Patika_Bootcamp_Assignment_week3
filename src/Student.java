public class Student {
    // öğrenci bilgileri burada tutulur.
    int id;
    String name;
    double cgpa;

    // Constructor
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    //GETTER

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

}
