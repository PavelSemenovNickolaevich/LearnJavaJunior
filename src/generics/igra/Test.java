package generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 10);

        Student student1 = new Student("Nickolay", 20);
        Student student2 = new Student("Kseniya", 21);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mickail", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        Team<Student> studentTeam = new Team<>("Run");
        Team<Employee> employeeTeam = new Team<>("Workers");
        schoolarTeam.addNewParticipiant(schoolar1);
        schoolarTeam.addNewParticipiant(schoolar2);

        studentTeam.addNewParticipiant(student1);
        studentTeam.addNewParticipiant(student2);

        employeeTeam.addNewParticipiant(employee1);
        employeeTeam.addNewParticipiant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("QA");
        Schoolar schoolar3 = new Schoolar("Sergey", 10);
        Schoolar schoolar4 = new Schoolar("Oly", 14);
        schoolarTeam2.addNewParticipiant(schoolar3);
        schoolarTeam2.addNewParticipiant(schoolar4);
        schoolarTeam.playWith(schoolarTeam2);


    }
}
