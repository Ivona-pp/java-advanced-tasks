package DefiningClasses_Exersice.FamilyTime;

public class Family {
    private String firstName;
    private String secondName;
    private String birth;

    public Family(String firstName, String secondName, String birth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birth = birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getBirth() {
        return birth;
    }

    public void setFirstNameName(String name) {
        this.firstName = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
