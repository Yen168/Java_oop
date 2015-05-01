import java.util.Scanner;

public class HanoiTower {
	
	public static final void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("How many disks: ");
	int disk = scanner.nextInt();
	System.out.print("Move from Tower (A, B, C): ");
	char source = scanner.next(".").charAt(0);
	System.out.print("Move from Tower (A, B, C): ");
	char dest = scanner.next(".").charAt(0);
	
	
	towerMove(disk, source, dest);
	
	
	}
	
	private static void towerMove(int disk, char source, char dest){
	
	
	if (disk == 1) // stop condition
		System.out.println("Move disk from " + source + " to " +dest);
		
	else{
		
		char spare;
		
		if (source == 'A' && dest == 'B')
			spare = 'C';
		else if (source == 'B' && dest == 'A')
			spare = 'C';
		else if(source == 'B' && dest == 'C')
			spare = 'A';
		else if(source == 'C' && dest == 'B')
			spare = 'A';
		else if(source == 'A' && dest == 'C')
			spare = 'B';
		else
			spare = 'B';
		
		towerMove(disk - 1, source, spare);
		System.out.println("Move disk from " + source + " to " +dest);
		towerMove(disk - 1, spare, dest);
		
	}
	
	} 

	





}