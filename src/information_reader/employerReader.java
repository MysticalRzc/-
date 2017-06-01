package information_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class employerReader {
	public int reader(Employer[] employer, int employerNum) throws IOException {
		String[] message = null;
		int listIndex = 0;
		String read = null;
		@SuppressWarnings("resource")
		BufferedReader input = new BufferedReader(new FileReader("src/information/employer.txt"));
		read = input.readLine();
		while (read != null && listIndex <= employerNum) {
			employer[listIndex] = new Employer();
			message = read.split("£¬|,");
			
			employer[listIndex].setWorkPlace(message[0]);
			double a = Double.parseDouble(message[1]);
			employer[listIndex].setWorkEducation(a);
			double b = Double.parseDouble(message[3]);
			employer[listIndex].setWorkMoney(b);
			employer[listIndex].setWorkMajor(message[2]);
			employer[listIndex].setValue(a/(b/1000));
			read = input.readLine();
			listIndex++;	
		}
		return listIndex;
	}
}
