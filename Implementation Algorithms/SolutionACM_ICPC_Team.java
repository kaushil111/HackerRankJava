import java.util.Scanner;

public class SolutionACM_ICPC_Team {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfPeople = sc.nextInt();
		int numberOfTopics = sc.nextInt();
		int currentTopicCount;
		int maxTopicCount = 0;
		int maxTeamCount = 0;
		
		char[][] topicPersons = new char[numberOfPeople][numberOfTopics];
		int[][] team = new int[numberOfPeople][numberOfTopics];
		
		for (int people_i = 0; people_i < topicPersons.length; people_i++) {
			topicPersons[people_i] = sc.next().toCharArray();
		}
		
		sc.close();
		
		for (int person_i = 0; person_i < team.length - 1; person_i++) {
			char[] partner1 = topicPersons[person_i];
			for (int person_j = person_i + 1; person_j < team.length; person_j++) {
				char[] partner2 = topicPersons[person_j];
				currentTopicCount = 0;
				
				for (int char_i = 0; char_i < partner2.length; char_i++) {
					if(partner2[char_i] == '1' || partner1[char_i] == '1') currentTopicCount++;
					
				}
				team[person_i][person_j] = currentTopicCount;
				if (currentTopicCount > maxTopicCount) maxTopicCount = currentTopicCount;
			}
		}
		System.out.println(maxTopicCount);

		for (int person_i = 0; person_i < team.length - 1; person_i++) {
			for (int person_j = person_i + 1; person_j < team.length; person_j++) {
				if (team[person_i][person_j] >= maxTopicCount) maxTeamCount++;
			}
		}
		System.out.println(maxTeamCount);
		
	}

}
