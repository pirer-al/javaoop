public class Student {
    private String name;
    private int id;
    private int age;
    private String gender;
    public Student(String name, int id, int age, String gender){
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
    public void display(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: " + getName() + "\n");
        sb.append("Id: " + getId() + "\n");
        sb.append("Edad: " + getAge() + "\n");
        sb.append("Genero: " + getGender());
        System.out.println(sb);
    }
}
