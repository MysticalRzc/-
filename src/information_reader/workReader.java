package information_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class workReader {
	public int reader(Work[] work, int workNum) throws IOException {
		String[] message = null;
		int listIndex = 0;
		String read = null;
		BufferedReader input = new BufferedReader(new FileReader("src/information/work.txt"));
		read = input.readLine();
		while (read != null && listIndex <= workNum) {
			work[listIndex] = new Work();
			message = read.split("£¬|,");
			work[listIndex].setWorkPlace(message[0]);
			double a = Double.parseDouble(message[1]);
			work[listIndex].setWorkEducation(a);
			work[listIndex].setWorkMajor(message[2]);
			double b = Double.parseDouble(message[3]);
			work[listIndex].setWorkMoney(b);
			work[listIndex].setValue(a/(b/1000));
			read = input.readLine();
			listIndex++;
		}
		return listIndex;
	}
}