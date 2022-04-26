public class Surgeon extends Person {
    private boolean availability;
    
    /** Surgeon Constructor
     * @param name
     * Name is passed and extends person name is passed from Surgeon
     * @param hospital
     * Hospital is passed within string also
     * @param sex
     * Passes the sex of the patients status
     * @param availability
     * Checks the availability within the surgeon's schedule
     */
    public Surgeon (String name, String hospital, String sex, Boolean availability) {
        super(name, hospital, sex);
        this.availability = availability;
    }
    
    /** isAvailable method
     * @return boolean availability
     */
    public boolean isAvailable() {
        return availability;
    }
    
    /** setAvailability method
     * @param availability boolean to declare availability to
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
   
    /** toString method
     * @return String representation of Surgeon object
     */
    @Override
    public String toString() {
        return (super.toString()+ "\tavailability " + availability);
    }
}
