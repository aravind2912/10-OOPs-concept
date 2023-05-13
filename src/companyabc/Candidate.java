package companyabc;
import java.time.LocalDate;

public class Candidate {
    private String name;
    private LocalDate dob;
    private double hscPCMPercentage;
    private double pcmOrPcbAvgMarks;
    private double ugCGPA;
    private double pgCGPA;
    private int numProjects;
    private boolean indianCitizen;
    private int interviewScore;

    public Candidate(String name, LocalDate dob, double hscPCMPercentage, double pcmOrPcbAvgMarks, double ugCGPA, double pgCGPA, int numProjects, boolean indianCitizen,int interviewScore) {
        this.name = name;
        this.dob = dob;
        this.hscPCMPercentage = hscPCMPercentage;
        this.pcmOrPcbAvgMarks = pcmOrPcbAvgMarks;
        this.ugCGPA = ugCGPA;
        this.pgCGPA = pgCGPA;
        this.numProjects = numProjects;
        this.indianCitizen = indianCitizen;
        this.interviewScore = interviewScore;
       
    }

   
	public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public double getHscPCMPercentage() {
        return hscPCMPercentage;
    }

    public double getPcmOrPcbAvgMarks() {
        return pcmOrPcbAvgMarks;
    }

    public double getUgCGPA() {
        return ugCGPA;
    }

    public double getPgCGPA() {
        return pgCGPA;
    }

    public int getNumProjects() {
        return numProjects;
    }

    public boolean isIndianCitizen() {
        return indianCitizen;
    }
    public int getInterviewScore() {
        return interviewScore;
    }
    
}
