package se.ecutb.erik;


import java.time.LocalDate;

public class App {
    public static void main( String[] args ) {
        LocalDate birthDate = LocalDate.parse("1976-09-11");
        String[] certs = {"OCA"};
        String[] skills = {"Java", "C++", "C#", "PHP", "SQL"};
        //Programmer erik = new Programmer("testid", "Erik Svensson", birthDate, certs, skills);
        //Programmer beginner = new Programmer("Nils Andersson", LocalDate.parse("1998-03-25"));
        Programmer stub = new Programmer(LocalDate.parse("1956-06-21"));

        //System.out.println(stub);
    }
}
