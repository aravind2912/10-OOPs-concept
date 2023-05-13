package companyabc;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        LocalDate dob = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter your HSC PCM percentage: ");
        double hscPCMPercentage = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter your PCM/PCB average marks: ");
        double pcmOrPcbAvgMarks = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter your UG CGPA: ");
        double ugCGPA = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter your PG CGPA: ");
        double pgCGPA = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the number of projects you have completed: ");
        int numProjects = Integer.parseInt(scanner.nextLine());

        System.out.print("Are you an Indian citizen (true/false): ");
        boolean indianCitizen = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Enter your interview score: ");
        int interviewScore = Integer.parseInt(scanner.nextLine());

        Candidate candidate = new Candidate(name, dob, hscPCMPercentage, pcmOrPcbAvgMarks, ugCGPA, pgCGPA, numProjects, indianCitizen, interviewScore);
        HR hr = new HR();
        Recuiter recruiter = new Recuiter(hr);
        recruiter.evaluateCandidate(candidate);
    }

}
