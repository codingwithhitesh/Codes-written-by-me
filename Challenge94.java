import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPrioirityQueue {

        private static class Student {
            private final String name;
            private final char grade;

            public Student(String name, char grade) {
                this.name = name;
                this.grade = grade;
            }

            public String getName() {
                return name;
            }

            public char getGrade() {
                return grade;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", grade=" + grade +
                        '}';
            }
        }

        public static void main(String[] args) {
            PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getGrade() - o2.getGrade();
                }
            });

            queue.add(new Student("Hitesh", 'B'));

            queue.add(new Student("Shruti", 'A'));

            System.out.println(queue);

        }
    }

