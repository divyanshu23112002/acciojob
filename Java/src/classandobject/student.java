package classandobject;

public class student {
    public   int id;
    public String name;
    public String gender;
    public String grade;
    public String address;

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
