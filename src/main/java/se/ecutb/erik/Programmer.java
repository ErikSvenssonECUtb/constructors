package se.ecutb.erik;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

public class Programmer {

    private String id;
    private String name;
    private LocalDate birthDate;
    private String[] certificates;
    private String[] skills;

    public Programmer(String id, String name, LocalDate birthDate, String[] certificates, String[] skills) {
        System.out.println("Kontruktor 1 jobbar");
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.certificates = certificates;
        this.skills = skills;
    }

    public Programmer(String name, LocalDate birthDate){
        this(UUID.randomUUID().toString(), name, birthDate, new String[0], new String[0]);
        System.out.println("Konstruktor 2 jobbar");
    }

    public Programmer(LocalDate birthDate){
        this("Not specified", birthDate);
        System.out.println("konstruktor 3 jobbar");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", certificates=" + Arrays.toString(certificates) +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
