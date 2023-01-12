import project.RealTimeStudent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class RealTimeHashMap {
    public static void main(String[] args) {
        HashMap<Integer, List<String>> hashMap = new HashMap<>();
        List<RealTimeStudent> studentsList = new ArrayList<>();
        RealTimeStudent student = new RealTimeStudent(1, "Bikas");
        RealTimeStudent student1 = new RealTimeStudent(2, "kumar");
        RealTimeStudent student2 = new RealTimeStudent(3, "pandey");
        RealTimeStudent student4 = new RealTimeStudent(3, "pandey");
        RealTimeStudent student3 = new RealTimeStudent(1, "Bikash");
        studentsList.add(student);
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);

        for (RealTimeStudent students : studentsList) {
            List<String> realTimeStudents = new ArrayList<>();
            if (hashMap.containsKey(students.getRollNo())) {
                realTimeStudents = hashMap.get(students.getRollNo());
            }
            realTimeStudents.add(students.getName());
            hashMap.put(students.getRollNo(), realTimeStudents);

        }
        System.out.println(hashMap);
    }
}


//TODO ; find fibonnaci series using recursion