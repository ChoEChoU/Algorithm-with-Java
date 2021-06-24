package decisionTree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecisionTree {
	private Node rootNode;
	
	public void inputData() {
		List<List<String>> ret = new ArrayList<List<String>>();
		BufferedReader br = null;
		
		try {
			br = Files.newBufferedReader(Paths.get("simpsons.csv"));
			String line = "";
			
			while ((line = br.readLine()) != null) {
				List<String> tmpList = new ArrayList<String>();
				String array[] = line.split(",");
				tmpList = Arrays.asList(array);
				System.out.println(tmpList);
				ret.add(tmpList);
			}
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void createPerson() {
		
	}
}
