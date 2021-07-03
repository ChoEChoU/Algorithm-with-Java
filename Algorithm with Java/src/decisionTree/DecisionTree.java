package decisionTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DecisionTree {
	private Node rootNode;
	private Dataset dataset;
	
	public List<List<String>> inputData() {
		List<List<String>> ret = new ArrayList<List<String>>();
		BufferedReader br = null;
		
//		String path = DecisionTree.class.getResource("").getPath();
		
		try {
			br = Files.newBufferedReader(Paths.get("C:\\Users\\w23640\\git\\Algorithm-with-Java\\Algorithm with Java\\src\\decisionTree\\simpsons.csv"));
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
		return ret;
	}
	
	public void createPerson() {
		
		List<List<String>> ret = inputData();
		
		for (int i = 0; i < ret.size(); i++) {
			if (i != 0) {
				List<String> array = ret.get(i);
				
				String name = array.get(0);
				int hairLength = Integer.parseInt(array.get(1));
				int weight = Integer.parseInt(array.get(2));
				int age = Integer.parseInt(array.get(3));
				String gender = array.get(4);
				
				Person person = new Person(name, hairLength, weight, age, gender);
				
				inputDataSet(person);
			}
		}
	}
	
	public void inputDataSet(Person person) {
		dataset.addPersonSet(person);
	}
}
