package madel;

import enums.Gender;

public class Doctor {
    public static long ID = 0;
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private int experienceYear;

    public Doctor(String firstName, String lastName, Gender gender, int experienceYear) {
        this.id = ++ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.experienceYear = experienceYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    @Override
    public String toString() {
        return "Doctor " +
                "id = " + id +
                ", first name = " + firstName +
                ", last name = " + lastName +
                ", gender = " + gender +
                ", experience year = " + experienceYear + "\n";
    }


}
