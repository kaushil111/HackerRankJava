import java.util.Scanner;

class Position {
	int x;
	int y;
	
	Position(int y, int x) {
		this.x = x;
		this.y = y;
	}
}

public class SolutionQueensAttackII {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfChessBoard = sc.nextInt() - 1;
		int numberOfObstacles = sc.nextInt();
		
		Position queenPosition = new Position(sc.nextInt() - 1, sc.nextInt() - 1);
		Position[] obstacles = new Position[8];
		
		for (int obstacle_i = 0; obstacle_i < numberOfObstacles; obstacle_i++) {
			Position p = new Position(sc.nextInt() - 1, sc.nextInt() - 1);
			
			if(p.x == queenPosition.x) {
				//On the same Y
				if ((p.y - queenPosition.y) > 0) {
					//Above the queen
					if(shouldAddObstacle(obstacles[2], p, queenPosition)) obstacles[2] = p;
				}
				else {
					//Below the queen
					if(shouldAddObstacle(obstacles[6], p, queenPosition)) obstacles[6] = p;
				}
			}
			if(p.y == queenPosition.y) {
				//On the same X
				if ((p.x - queenPosition.x) < 0) {
					//To the left of queen
					if(shouldAddObstacle(obstacles[4], p, queenPosition)) obstacles[4] = p;
				}
				else {
					//Right of queen
					if(shouldAddObstacle(obstacles[0], p, queenPosition)) obstacles[0] = p;
				}
			}
			else if (Math.abs(p.x - queenPosition.x) == Math.abs(p.y-queenPosition.y)) {
				if((p.y - queenPosition.y) > 0){
					//Above the Queen
					if ((p.x - queenPosition.x) < 0) {
						//To the left of queen
						if(shouldAddObstacle(obstacles[3], p, queenPosition)) obstacles[3] = p;
					}
					else {
						//Right of queen
						if(shouldAddObstacle(obstacles[1], p, queenPosition)) obstacles[1] = p;
					}
				}
				else {
					//Below the queen
					if ((p.x - queenPosition.x) < 0) {
						//To the left of queen
						if(shouldAddObstacle(obstacles[5], p, queenPosition)) obstacles[5] = p;
					}
					else {
						//Right of queen
						if(shouldAddObstacle(obstacles[7], p, queenPosition)) obstacles[7] = p;
					}
				}
			}
			
		}
//		
//		for (int i = 0; i < obstacles.length; i++) {
//			Position position = obstacles[i];
//			if(position != null) System.out.println(i);
//			
//		}
		
		
		System.out.println(countBlocks(obstacles, queenPosition, sizeOfChessBoard));
		sc.close();
		
	}
	public static boolean shouldAddObstacle(Position previous, Position p, Position queenPosition) {
		if (previous != null) {
			int dist1 = Math.min(Math.abs(previous.x - queenPosition.x), Math.abs(previous.y-queenPosition.y));
			int dist2 = Math.min(Math.abs(p.x - queenPosition.x), Math.abs(p.y-queenPosition.y));
			
			if(dist2 < dist1) return true;
		}
		else {
			return true;
		}
		return false;
	}
	
	public static int countBlocks(Position[] obstacles, Position queen, int size) {
		
		int count = 0;
		
		for (int obstacle_i = 0; obstacle_i < obstacles.length; obstacle_i++) {
			Position position = obstacles[obstacle_i];
			
			if (position == null) {
				switch (obstacle_i) {
				case 0:
					count += Math.abs(size-queen.x);
					break;
				case 4:
					count += Math.abs(0-queen.x);
					break;

				case 2:
					count += Math.abs(size-queen.y);
					break;

				case 6:
					count += Math.abs(0-queen.y);
					break;

				case 1:
					count+= Math.min(Math.abs(size - queen.x), Math.abs(size -queen.y));
					break;

				case 3:
					count+= Math.min(Math.abs(0 - queen.x), Math.abs(size -queen.y));
					break;

				case 5:
					count+= Math.min(Math.abs(0 - queen.x), Math.abs(0 -queen.y));
					break;

				case 7:
					count+= Math.min(Math.abs(size - queen.x), Math.abs(0 -queen.y));
					break;

				default:
					break;
				}
			}
			else {
				if(position.x == queen.x) {
					count += Math.abs(position.y-queen.y) - 1;
				}
				else if (position.y == queen.y) {
					count += Math.abs(position.x-queen.x) - 1;
				}
				else {
					count+= Math.min(Math.abs(position.x - queen.x), Math.abs(position.y-queen.y)) - 1;
				}
			}
			
			
		}
		
		return count;
	}
}
