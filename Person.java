public class Person {
	private String name, sex, hospital;

	/** Person Contstructor
	 * @param name
	 * Holds string name in class person
	 * @param sex
	 * holds string sex in person
	 * @param hospital
	 * holds string hospital in Person
	*/
	public Person (String name, String sex, String hospital) {
		this.name = name;
		this.sex = sex;
		this.hospital = hospital;
	}

	/** getName method
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/** setName method
	 * @param name String to declare name to
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** getSex method
	 * @return String sex
	 */
	public String getSex() {
		return sex;
	}

	/** setSex method
	 * @param sex String to declare sex to
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/** getHospital method
	 * @return String hospital
	 */
	public String getHospital() {
		return hospital;
	}

	/** setHospital method
	 * @param hospital String to declare hospital to
	 */
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	/** toString method
	 * @return String representation of Person object
	 */
	public String toString() {
		return ("name: " + name + "\tsex: " + sex + "\thospital" + hospital);
	}
}
