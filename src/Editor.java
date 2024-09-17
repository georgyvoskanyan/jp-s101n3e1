public class Editor {
    private String name;
    private final String DNI;
    private static int salary = 1500;

    public Editor(String DNI, String name) {
        this.DNI = DNI;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Editor.salary = salary;
    }
}
