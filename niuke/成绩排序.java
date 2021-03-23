import java.util.*;

class Student {
        public String name;
        public int score;
        
        public Student(String name,int score) {
            this.name = name;
            this.score = score;
        }
    }
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int peopleNum = sc.nextInt();
            int option = sc.nextInt();
            
            List<Student> stu = new ArrayList<>();
            for (int i = 0; i < peopleNum; i++) {
                stu.add(new Student(sc.next(), sc.nextInt()));
            }
            if(option == 0) {
                stu.sort((o1,o2) -> o2.score - o1.score);
            }else if(option == 1) {
                stu.sort((o1,o2) -> o1.score - o2.score);
            }
            for(Student student : stu) {
                System.out.println(student.name + " " + student.score);
            }
        }
        sc.close();
    }
}