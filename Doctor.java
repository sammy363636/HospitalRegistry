import java.util.*;

public class Doctor extends Person {
	private boolean availability;
	private List<Patient> patients = new ArrayList<Patient>();
	
	/** Doctor Constructor
	 * @param name
	 * Takes string name and uses it for the patients name
	 * @param hospital
	 * Chooses the hospital in accordance with doctors
	 * @param sex
	 * Sex takes M/F or choose not to answer
	 * @param availability
	 * Boolean checks availability whether its true or false if the doctor is available.
	 */
	public Doctor (String name, String hospital, String sex, Boolean availability) {
		super(name, hospital, sex);
		this.availability=availability;
	}

	/** isAvailable method
	 * @return
	 * Boolean availability true or false
	 */
	public boolean isAvailable() {
		return availability;
	}

	/** setAvailability method
	 * @param availability
	 * Boolean variable to initialize availabilty to
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	/** addPatient method
	 * @param p
	 * Patient object to add to Doctor's Patient ArrayList
	 */
	public void addPatient(Patient p) {
		patients.add(p);
	}

	/** getName method
	 * @return String representation of Doctor name
	 * Overload from super class Person
	 */
	@Override
	public String getName() {
		return ("Dr. " + super.getName());
	}

	/** toString method
	 * @return String representation of Doctor object
	 * Overrides super class Person toString
	 */
	@Override
	public String toString() {
		return (super.toString()+ "\tavailability " + availability);
	}
}
