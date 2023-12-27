package dao.daoImpl;
import dao.HospitalDao;
import db.DataBase;
import madel.Hospital;
import madel.Patient;
import java.util.ArrayList;
import java.util.List;

public class HospitalDaoImpl implements HospitalDao {
    DataBase dataBase = new DataBase();

    public HospitalDaoImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addHospital(Hospital hospital) {
        hospital.setHospitalName(hospital.getHospitalName());
        hospital.setAddress(hospital.getAddress());
        dataBase.hospitals.add(hospital);
        return "Больница успешно дабавлен.";
    }

    @Override
    public List<Hospital> findHospitalById(Long id) {
        List<Hospital> hospitals = new ArrayList<>();
        for (int i = 0; i < dataBase.hospitals.size(); i++) {
            if (dataBase.hospitals.get(i).equals(id)){
                hospitals.add(dataBase.hospitals.get(i));
            }
            throw new RuntimeException(String.format("Больница под id: "+id+" не найдено или нету."));
        }
        return null;
    }

    @Override
    public List<Hospital> getAllHospital() {
        return dataBase.hospitals;
    }

    @Override
    public List<Patient> getAllPatientFromHospital(Long id) {
        List<Patient> patients = new ArrayList<>();
        for (int i = 0; i < dataBase.hospitals.size(); i++) {
            if (dataBase.hospitals.get(i).getId().equals(id)){
                patients.add((Patient) dataBase.hospitals.get(i).getPatients());
            }
            throw new RuntimeException(String.format("Больница под id:"+id+" не найдено или нету."));
        }
        return patients;
    }

    @Override
    public String deleteHospitalById(Long id) {
        for (int i = 0; i < dataBase.hospitals.size(); i++) {
            if (dataBase.hospitals.get(i).getId().equals(id)){
                dataBase.hospitals.remove(dataBase.hospitals.get(i));
            }
            throw  new RuntimeException(String.format("Больница под id:"+id+" не найдено или нету."));
        }
        return "Бальница успешно удалён.";
    }

    @Override
    public List<Hospital> getAllHospitalByAddress(String address) {
        List<Hospital> hospitals = new ArrayList<>();
        for (int i = 0; i < dataBase.hospitals.size(); i++) {
            if (dataBase.hospitals.get(i).getAddress().equals(address)){
                hospitals.add(dataBase.hospitals.get(i));
            }
            throw new RuntimeException(String.format("Больница под адресом: "+address+" не найдено или нету."));
        }
        return hospitals;
    }
}
