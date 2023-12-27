package dao;

import madel.Hospital;
import madel.Patient;

import java.util.List;
import java.util.Map;

public interface HospitalDao {
    String addHospital(Hospital hospital);
    List<Hospital> findHospitalById(Long id);
    List<Hospital> getAllHospital();
    List<Patient> getAllPatientFromHospital(Long id);
    String deleteHospitalById(Long id);
    List<Hospital> getAllHospitalByAddress(String address);
}
