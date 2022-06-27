import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Main class'ını Hackerrank'den aldım.
    private final static Scanner scan = new Scanner(System.in);   // veri almamız için Scanner nesnesini oluşturulur.
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());   //toplam olay sayısı kullanıcıdan alınır.
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);   //öncelik sırasına göre öğrenci listesi

        if (students.isEmpty()) {       //Liste boş ise konsola "Empty" yazdırılır.
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }

    }
}