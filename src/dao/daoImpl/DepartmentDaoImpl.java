package dao.daoImpl;

import dao.DepartmentDao;
import db.DataBase;
import madel.Department;
import madel.Hospital;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    public DataBase dataBase;

    public DepartmentDaoImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Department> getAllDepartmentByHospital(Long id) {
        for (Hospital hospital : dataBase.hospitals) {
            if (hospital.getId().equals(id)){
                return hospital.getDepartments();
            }

        }
        throw new RuntimeException(String.format("Бальница под id: "+id+" не нойденно."));
    }

    @Override
    public ArrayList<Department> findDepartmentByName(String name) {
        ArrayList<Department> departments = new ArrayList<>();
        for (int i = 0; i < dataBase.hospitals.size(); i++) {
            if (dataBase.hospitals.get(i).getDepartments().get(i).getDepartmentName().contains(name)){
                departments.add(dataBase.hospitals.get(i).getDepartments().get(i));
            } else {
                throw new RuntimeException(String.format("Отдел по названию: "+name+" не найденно."));
            }
        }
        return departments;
    }
}
