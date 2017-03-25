import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;


public class Demo {
	public static void main(String[] args){
		String line = "";
		int lineNo;
		try {
			FileReader fr = new FileReader("/Challenge/country.csv");
			BufferedReader br = new BufferedReader(fr);
			Scanner in = new Scanner(System.in);
			System.out.println("1. powder, 2.diapers, 3. soap, 4. scissors, 5. toys, 6.games ");
			System.out.println("Please enter product name: ");
			String msg = in.nextLine();
			
			
			int i=1;
			for (lineNo = 1; lineNo < 7; lineNo++) {
				
				if (lineNo <= i) {
					line = br.readLine();
					
					
					String[] lines=line.split(",");
					if(lines[2].equals(msg)){
						for(int j=0;j<=2;j++)
						System.out.print(lines[j] + " ");
						
					}
					i++;
					
				} else
					br.readLine();
					
			}
			
		
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
			
		}
	}
