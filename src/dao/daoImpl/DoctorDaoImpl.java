package dao.daoImpl;

import dao.DoctorDao;
import db.DataBase;
import madel.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorDaoImpl implements DoctorDao {
    public DataBase dataBase;

    public DoctorDaoImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public ArrayList<Doctor> findDoctorById(Long id) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        for (int i = 0; i < dataBase.hospitals.size(); i++) {
            if (dataBase.hospitals.get(i).getDoctors().get(i).getId() == id){
                doctors.add(dataBase.hospitals.get(i).getDoctors().get(i));;
            } else {
                throw new RuntimeException(String.format("Доктор пад id: "+id+" не найденно."));
            }
        }
        return doctors;
    }

    @Override
    public String assignDoctorToDepartment(Long departmentId, List<Long> doctorsId) {
        return null;
    }

    @Override
    public List<Doctor> getAllDoctorsByHospitalId(Long id) {
        List<Doctor> doctors = new ArrayList<>();
        for (int i = 0; i < dataBase.hospitals.size(); i++) {
            if(dataBase.hospitals.get(i).getId().equals(id)){
                doctors.add((Doctor) dataBase.hospitals.get(i).getDoctors());
            }
            throw new RuntimeException(String.format("Больница под id: "+id+" не гайдено или нету."));
        }
        return doctors;
    }

    @Override
    public List<Doctor> getAllDoctorsByDepartmentId(Long id) {
        List<Doctor> doctors = new ArrayList<>();
        for (int i = 0; i < dataBase.hospitals.size(); i++) {
            if (dataBase.hospitals.get(i).getDepartments().equals(id)){
                doctors.add((Doctor) dataBase.hospitals.get(i).getDepartments());
            }
            throw new RuntimeException(String.format("Отдел под id: "+id+" не найдено или нету."));
        }
        return doctors;
    }
}
