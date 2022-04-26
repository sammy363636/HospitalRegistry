public class Patient extends Person {
	private String dateOfbirth;
	private int id;

	/** Patient Constructor
	 * @param dateOfbirth
	 * INT dob takes users birthday under integer variable 
	 * @param id
	 * ID takes users national ID
	 * @param name
	 * users name is passed on
	 * @param sex
	 * passes users sex
	 * @param hospital
	 *passes hospitals extends from person
	 */
	public Patient (String dateOfbirth, int id, String name, String sex, String hospital) {
		super(name, sex, hospital);
		this.dateOfbirth = dateOfbirth;
		this.id = id;
	}

	/** getDateOfBirth method
	 * @return String representing date of birth
	 */
	public String getDateOfBirth() {
		return dateOfbirth;
	}

	/** setDateOfBirth method
	 * @param dateOfbirth String to declare dateOfBirth to
	 */
	public void setDateOfBirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	/** getId method
	 * @return int ID
	 */
	public int getId() {
		return id;
	}

	/** setId method
	 * @param id int value to declare ID to
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/** toString method
	 * @return String representation of Patient object
	 */
	@Override
	public String toString() {
		return (super.toString() + "\tDate Of Birth " + dateOfbirth + "\tID " + id);
	}
}
	


	
	