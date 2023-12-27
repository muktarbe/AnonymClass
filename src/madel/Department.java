package madel;

import java.util.List;

public class Department {
    public static long ID = 0;
    private Long id;
    private String departmentName;
    private List<Doctor> doctors;

    public Department( String departmentName, List<Doctor> doctors) {
        this.id = ++ID;
        this.departmentName = departmentName;
        this.doctors = doctors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Department " +
                "id = " + id +
                ", department name = " + departmentName +
                ", doctors = " + doctors + "\n";
    }
}
