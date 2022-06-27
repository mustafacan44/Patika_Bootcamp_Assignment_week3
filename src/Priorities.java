import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
     /*Queue'da ilk giren ilk çıkar. PriorityQueue'da ise en yüksek önceliğe sahip giriş kaldırılır.
    Bu projede öncelikler bulunduğu için PriortiyQueue kullanılır.
    */

     PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<Student>(
            Comparator.comparing(Student::getCgpa).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getId));

    public List<Student> getStudents(List<String> events) {
        for (String event : events) {
            if (event.equals("SERVED")) {
                studentPriorityQueue.poll();

            } else if(event.split("\\s")[0].equals("ENTER")){

                String[] data = event.split("\\s"); // Burada metin boşluklara göre bölünür.

                studentPriorityQueue.add(new Student(Integer.parseInt(data[3]), data[1], Double.parseDouble(data[2])));

            }
        }
        List<Student> students = new ArrayList<>();
        while (!studentPriorityQueue.isEmpty()) {
            students.add(studentPriorityQueue.poll());
        }
        return students;
    }
}
