import java.util.Scanner;

public class SolutionLisaWorkbook {
	public static void main(String[] args  ) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfChapters = sc.nextInt();
		int k = sc.nextInt();
		
		int pageNumber = 0;
		int lowerBound = 0;
		int upperBound = 0;
		int problemsForChapter;
		int specialProblems = 0;
		
		for (int chapter_i = 0; chapter_i < numberOfChapters; chapter_i++) {
			problemsForChapter = sc.nextInt();
			lowerBound = 1;
			upperBound = problemsForChapter <= k ? problemsForChapter : k;
			
			while(upperBound != problemsForChapter && lowerBound <= upperBound) {
				pageNumber  += 1;
				if(pageNumber >= lowerBound && pageNumber <= upperBound) specialProblems++;
				lowerBound = upperBound + 1;
				upperBound = (lowerBound + k - 1) > problemsForChapter ? problemsForChapter : (lowerBound + k - 1);
				
			}

			pageNumber  += 1;
			if(pageNumber >= lowerBound && pageNumber <= upperBound) specialProblems++;
			
		}
		sc.close();
		System.out.println(specialProblems);
		
	}
}
