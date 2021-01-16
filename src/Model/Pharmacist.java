package Model;
import java.time.LocalDate;

public class Pharmacist extends Person implements Salary {
    private String scCode;
    private String team;
    private String areaWork;

    public Pharmacist(String name, LocalDate birthday) {
        super(name, birthday);
    }
    public Person withScCode(String scCode){
        this.scCode = scCode;
        return this;
    }
    public Person withTeam(String team){
        this.team = team;
        return this;
    }
    public Person withAreaWork(String areaWork){
        this.areaWork = areaWork;
        return this;
    }

    public Pharmacist(String areaWork) {
        this.areaWork = areaWork;
    }

    public String getScCode() {
        return scCode;
    }

    public String getAreaWork() {
        return areaWork;
    }

    @Override
    public String toString() {
        return "Model.Pharmacist{" +
                "scCode='" + scCode + '\'' +
                ", team='" + team + '\'' +
                ", areWork='" + areaWork + '\'' +
                "} " + super.toString();
    }

    @Override
    public double getSalary() {
        if(areaWork.equalsIgnoreCase("Hà Nội")|| areaWork.equalsIgnoreCase("TPHCM")){
            return 6000000;
        } else return 5000000;
    }
}
