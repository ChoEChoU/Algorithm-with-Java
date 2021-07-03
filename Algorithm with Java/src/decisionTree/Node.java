package decisionTree;

import java.util.ArrayList;

public class Node {
	private ArrayList<Person> personSet;
	
	
	private Node leftNode;
	private Node rightNode;
	
	public Node() {
		personSet = new ArrayList<Person>();
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
	public void addPersonSet(Person person) {
		personSet.add(person);
	}
	
	public ArrayList<Person> getPersonSet() {
		return personSet;
	}
}
