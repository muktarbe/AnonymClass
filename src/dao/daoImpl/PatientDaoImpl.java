package dao.daoImpl;

import dao.PatientDao;
import db.DataBase;
import madel.Patient;
import java.util.List;

public class PatientDaoImpl implements PatientDao {
    DataBase dataBase = new DataBase();

    public PatientDaoImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addPatientsToHospital(Long id, List<Patient> patients) {
        for (int i = 0; i < dataBase.hospitals.size(); i++) {
            if (dataBase.hospitals.get(i).getId().equals(id));
        }
        return null;
    }

    @Override
    public Patient getPatientById(Long id) {
        return null;
    }

    @Override
    public List<Patient> getPatientByAge() {
        return null;
    }

    @Override
    public List<Patient> sortPatientsByAge(String ascOrDesc) {
        return null;
    }
}
