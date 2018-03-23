package assignment1;

public class Baby extends Dependent{

	String parents;
	public Baby(int id, String name, String age, String gender, String telNum, String status,String parents) {
		super(id, name, age, gender, telNum, status, parents);
		this.parents=parents;
		// TODO Auto-generated constructor stub
	}
}
