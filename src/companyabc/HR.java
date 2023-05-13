package companyabc;
import java.time.LocalDate;

public class HR {
    public void informCandidate(Candidate candidate, boolean isEligible) {
        if (isEligible) {
            System.out.println("Congrats!.."+candidate.getName() + ", you have been selected for the job!");
        } else {
            System.out.println("Sorry "+candidate.getName() + ", we regret to inform you that you have not been selected for the job.");
        }
    }

    public boolean checkEligibility(Candidate candidate) {
        if (!candidate.isIndianCitizen()) {
            return false;
        }
        if (candidate.getDob().isAfter(LocalDate.of(1999, 6, 30))) {
            return false;
        }
        if (candidate.getHscPCMPercentage() < 60) {
            return false;
        }
        if ((candidate.getPcmOrPcbAvgMarks() < 50) && (candidate.getHscPCMPercentage() >= 60)) {
            return false;
        }
        if (candidate.getUgCGPA() < 8) {
            return false;
        }
        if (candidate.getPgCGPA() < 8) {
            return false;
        }
        if (candidate.getNumProjects() < 2) {
            return false;
        }
        return true;
    }

}
