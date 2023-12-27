package dao;

import madel.Department;

import java.util.ArrayList;
import java.util.List;

public interface DepartmentDao {
    List<Department> getAllDepartmentByHospital(Long id);
    ArrayList<Department> findDepartmentByName(String name);
}
