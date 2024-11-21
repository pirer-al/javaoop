import java.util.ArrayList;

public class Section {
    private ArrayList<Student> arrayStu;
    private String NRC;
    public Section(){
        this.NRC = "21761";
        arrayStu = new ArrayList<Student>();
    }
    public void addStudent(Student st){
        try {
            arrayStu.add(st);
        } catch (Exception e) {
            System.out.println("La seccion de la EE esta llena");
            return;
        }
        System.out.println("Estudiante agregado");
    }
    public void searchStudent(int id){
        for (int i = 0; i < arrayStu.size(); i++){
            if (id == arrayStu.get(i).getId()){
                System.out.println("Id: " + arrayStu.get(i).getId());
                System.out.println("Id: " + arrayStu.get(i).getName());
                System.out.println("Id: " + arrayStu.get(i).getGender());
                System.out.println("Id: " + arrayStu.get(i).getAge());                              
            }

        }
        for (Student s: arrayStu){

        }
    }
    
    public Student searchMax(){
        Student oldestStudent = new Student(null, 0, 0, null);
        int edadMax = 0;
        for (Student s: arrayStu){
            if (s != null){
                if (s.getAge() > edadMax){
                    oldestStudent = s;
                    edadMax = s.getAge();
                } 
            }
        }
        return oldestStudent;
    }
    public Student searchMax(String gender){
        Student oldestStudent = new Student(null, 0, 0, null);
        int edadMax = 0;
        for (Student s: arrayStu){
            if (s != null){
                if (s.getAge() > edadMax && s.getGender() == gender){
                    oldestStudent = s;
                    edadMax = s.getAge();
                }
            } 
        }
        return oldestStudent;
    }
    
    public int splitStudents(Student[] male, Student[] female){
        int indexMale = 0;
        int indexFemale = 0;
        for (Student s: arrayStu){
            if (s.getGender() == "Male"){
                male[indexMale] = s;
                indexMale++;
            }
            else if (s.getGender() == "Female"){
                female[indexFemale] = s;
                indexFemale++;
            }

        }
        return indexFemale;
    }
}
