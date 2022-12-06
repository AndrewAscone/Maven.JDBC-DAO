package models;

public class BandMember implements BandMembersDTO{

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer birthYear;
    private String instrument;

    public BandMember(){

    }

    public BandMember(String firstName, String lastName, Integer birthYear, String instrument){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.instrument = instrument;
    }

    public BandMember(Integer id, String firstName, String lastName, Integer birthYear, String instrument){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.instrument = instrument;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
