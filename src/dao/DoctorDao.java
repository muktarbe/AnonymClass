package dao;

import madel.Doctor;

import java.util.ArrayList;
import java.util.List;

public interface DoctorDao {
    ArrayList<Doctor> findDoctorById(Long id);
    String assignDoctorToDepartment(Long departmentId, List<Long> doctorsId);
    List<Doctor> getAllDoctorsByHospitalId(Long id);
    List<Doctor> getAllDoctorsByDepartmentId(Long id);
}
