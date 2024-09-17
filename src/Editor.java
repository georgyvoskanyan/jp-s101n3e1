import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Editor {
    private String name;

    public String getDNI() {
        return DNI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editor editor = (Editor) o;
        return Objects.equals(DNI, editor.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DNI);
    }

    private final String DNI;
    private static int salary = 1500;

    List<NewsEntry> newsEntries = new ArrayList<>();

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

    public void printNews() {
        for(NewsEntry newsEntry : newsEntries){
            System.out.println(newsEntry);
        }
    }

    public void addNewsEntry(NewsEntry entry) {
        newsEntries.add(entry);
    }
}
