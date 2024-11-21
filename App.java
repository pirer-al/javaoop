import java.util.Scanner;
public class App{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        Section lis301 = new Section();
        int opcion;

        do {
            System.out.println("1)Agregar 2)Buscar 3)Borrar 4)Imprimir por genero 4)Imprimir todos 6)Salir");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa Id, Nombre, Genero, Edad");
                    Student s = new Student(in.next(), in.nextInt(), in.nextInt(), in.next());
                    lis301.addStudent(s);
                    break;
                case 2:
                    System.out.println("Ingresa Id a buscar");
                    lis301.searchStudent(in.nextInt());
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    break;
            }
        } while (opcion != 6);
        
        opcion = in.nextInt();

    }
}