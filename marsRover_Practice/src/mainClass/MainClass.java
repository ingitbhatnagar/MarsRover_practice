package mainClass;
import java.io.*;

public class MainClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] coordinates=br.readLine().split(" ");
		int X=Integer.parseInt(coordinates[0]);
		int Y=Integer.parseInt(coordinates[1]);
		System.out.println("Enter number of rovers");
		int number=Integer.parseInt(br.readLine());
		for(int i=0;i<number;i++)
		{
			String[] position=br.readLine().split(" ");
		}
	}

}
