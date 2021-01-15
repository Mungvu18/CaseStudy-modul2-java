import java.time.LocalDate;

public class Leader extends Person implements Salary{
    private String positions;
    private String degree;

    public Leader(String name, LocalDate birthday, String positions, String degree) {
        super(name, birthday);
        this.positions = positions;
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Leader{" +
                "positions='" + positions + '\'' +
                ", degree='" + degree + '\'' +
                "} " + super.toString();
    }

    @Override
    public double getSalary() {
        if(degree.equalsIgnoreCase("Đại học")){
            return 10000000;
        }
        if(degree.equalsIgnoreCase("Cao đẳng")){
            return 70000000;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
