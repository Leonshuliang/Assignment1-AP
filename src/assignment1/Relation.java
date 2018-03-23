package assignment1;

public class Relation {
	public void checkFiends(int personID1,int personID2,int personAge1,int personAge2)
	{
		int id1=personID1;
	    int id2=personID2;
	    int age1=personAge1;
	    int age2=personAge2;
	    if(age1<=16 && age1 >16 && id1==id2)
	    {
	        	System.out.println("person1 is dependent of person2");
	    }
	    else if(age1>=16 && age2<16 && id1==id2)
		 {
			 System.out.println("person2 is dependent of person1");
		 }
	    else if(age1>16 && age2 >16 && id1==id2)
	    {
	         System.out.println("person1 and person2 are friends");
	    }
	    else if (age1<=16 && age2<=16 && age1-age2 <=3 && id1==id2)
	    {
	    		System.out.println("person1 and person2 are all independs, they are  friends");
	    }
	    else if (age1<=16 && age2<=16 && age1-age2 >3)
	    {
	    	    if(age1 <= 2)
	    	    {
	    	    	System.out.println("person1's age lower than 3,so she/he has no friend");
	    	    }
	    	    if(age2 <= 2){
	    	    	System.out.println("person1 and person2 are all independs, they are not friends");
	    	    	}
	    	    else {
	    	    	System.out.println("person1 and person2 are all independs, they are not friends");
	    	    }
	    }
	}
	
	
	
	
}
