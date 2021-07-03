package decisionTree;

import java.util.ArrayList;

public class Dataset {
	private ArrayList<Person> personSet;
	
	public Dataset() {
		personSet = new ArrayList<Person>();
	}
	
	public void addPersonSet(Person person) {
		personSet.add(person);
	}
	
	public ArrayList<Person> getPersonSet(){
		return personSet;
	}
	
}
