package Model;

import java.time.LocalDate;

public class PharmaLeader extends Person implements Salary {
    public static final String UNIVERSITY = "Đại học";
    public static final String COLLEGES = "Cao đẳng";
    private String positions;
    private String degree;


    public PharmaLeader(String name, LocalDate birthday) {
        super(name, birthday);
    }

    public PharmaLeader withPositions(String positions) {
        this.positions = positions;
        return this;
    }
    public PharmaLeader withDegree(String degree){
        this.degree = degree;
        return this;
    }

    public PharmaLeader(String degree) {
        this.degree = degree;
    }


    @Override
    public double getSalary() {
        if (degree.equalsIgnoreCase(UNIVERSITY)) {
            return 10000000;
        }
        if (degree.equalsIgnoreCase(COLLEGES)) {
            return 7000000;
        } else return 0;
    }
    @Override
    public String toString() {
        return "Model.PharmaLeader{" +
                "positions='" + positions + '\'' +
                ", degree='" + degree + '\'' + ", salary=" + getSalary() +
                "} " + super.toString();
    }
}
