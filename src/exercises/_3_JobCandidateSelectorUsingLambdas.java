package exercises;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class _3_JobCandidateSelectorUsingLambdas {
	public static void main(String[] args) {

		// 1. Sort the candidates by salary requirements, low to high.
		List<JobCandidate> jobcandidates = JobCandidate.jobCandidates;
		Collections.sort(jobcandidates, Collections.reverseOrder((jc1, jc2) -> jc2.getSalaryRequired() - jc1.getSalaryRequired()));
		System.out.println(jobcandidates);

		// 2. Filter out any candidates that have not been taught by me (June)
		// Hint: see the removeIf() method in the Collections class 
		//Predicate<JobCandidate> condition = jc -> !jc.getTeacherName().toUpperCase().contains("JUNE CLARK"); // include "June Clark"		
		Predicate<JobCandidate> condition = jc -> !jc.getTeacherName().toUpperCase().contains("JUNE CLARKE"); // did not include "June Clark"		
        jobcandidates.removeIf(condition);
        System.out.println(jobcandidates);
        
	}
}
