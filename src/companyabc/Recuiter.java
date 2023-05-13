package companyabc;
import java.time.LocalDate;

public class Recuiter {
	private HR hr;

    public Recuiter(HR hr) {
        this.hr = hr;
    }


    public void evaluateCandidate(Candidate candidate) {
        // Check if candidate's date of birth is after July 1999
        if (candidate.getDob().isBefore(LocalDate.of(1999, 7, 1))) {
            hr.informCandidate(candidate, false);
            return;
        }

        // Check if candidate has scored 60% or more in HSC PCM/PCB
        if (candidate.getHscPCMPercentage() < 60) {
            hr.informCandidate(candidate, false);
            return;
        }

        // Check if candidate belongs to SC/ST category and has PCM/PCB average marks of 50% or more
        if ((candidate.getPcmOrPcbAvgMarks() < 50) && (candidate.isIndianCitizen())) {
            hr.informCandidate(candidate, false);
            return;
        }

        // Check if candidate has UG and PG CGPA of 8 or more
        if ((candidate.getUgCGPA() < 8) || (candidate.getPgCGPA() < 8)) {
            hr.informCandidate(candidate, false);
            return;
        }

        // Check if candidate has done at least 2 projects during the course of study
        if (candidate.getNumProjects() < 2) {
            hr.informCandidate(candidate, false);
            return;
        }

        // Check if candidate has studied full-time
        if (!candidate.isIndianCitizen()) {
            hr.informCandidate(candidate, false);
            return;
        }

        // Check if candidate has scored 35 or more in the interview selection process
        if (candidate.getInterviewScore() < 35) {
            hr.informCandidate(candidate, false);
            return;
        }

        // If all conditions are satisfied, inform candidate that they have been selected
        hr.informCandidate(candidate, true);
    }
}

