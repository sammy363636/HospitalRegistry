
public class patient {
	

protected String patName;
protected int patNumber;

public patient(String patName,int patNumber){
	this.patName = patName;
		       this.patNumber = patNumber;
		   }

		   


public String getName() {
		       return patName;
		   }
		   public int getNumber() {
		       return patNumber;
		   }

		   
		   public void setName(String patName) {
		       this.patName = patName;
		   }
		   public void setNumber(int patNumber) {
		       this.patNumber = patNumber;
		   }

		   public String toString() {
		       return patName+"\t"+patNumber;
		   }

		   public void checkIn() {
		       System.out.println(patName+"  is a patient today at the hospital.");
		   }
		}
		

