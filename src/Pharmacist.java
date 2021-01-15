import java.time.LocalDate;

public class Pharmacist extends Person implements Salary{
    private String scCode;
    private String team;
    private String areWork;

    public Pharmacist(String name, LocalDate birthday, String scCode, String team, String areWork) {
        super(name, birthday);
        this.scCode = scCode;
        this.team = team;
        this.areWork = areWork;
    }

    @Override
    public String toString() {
        return "Pharmacist{" +
                "scCode='" + scCode + '\'' +
                ", team='" + team + '\'' +
                ", areWork='" + areWork + '\'' +
                "} " + super.toString();
    }

    @Override
    public double getSalary() {
        if(areWork.equalsIgnoreCase("Hà Nội")||areWork.equalsIgnoreCase("TPHCM")){
            return 6000000;
        } else return 5000000;
    }
}
