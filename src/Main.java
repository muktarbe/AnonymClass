import db.DataBase;
import enums.Gender;
import madel.Department;
import madel.Doctor;
import madel.Hospital;
import madel.Patient;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Ажыбек","Садыков",17, Gender.MALE);
        Patient patient2 = new Patient("Алиаскар","Темирбеков",21, Gender.MALE);
        Patient patient3 = new Patient("Билал","Шарипов",27, Gender.MALE);
        Patient patient4 = new Patient("Жигит","Турунбаев",17, Gender.MALE);
        Patient patient5 = new Patient("Зарипбек","Душоев",19, Gender.MALE);
        Patient patient6 = new Patient("Нургазы","Темиралиев",22, Gender.MALE);

        ArrayList<Patient> patientArrayList0 = new ArrayList<>();
        patientArrayList0.add(patient1);
        patientArrayList0.add(patient2);
        patientArrayList0.add(patient3);
        patientArrayList0.add(patient4);
        patientArrayList0.add(patient5);
        patientArrayList0.add(patient6);
        
        ArrayList<Patient> patientArrayList1 = new ArrayList<>();
        patientArrayList1.add(patient1);
        patientArrayList1.add(patient2);
        patientArrayList1.add(patient3);
        
        ArrayList<Patient> patientArrayList2 = new ArrayList<>();
        patientArrayList2.add(patient4);
        patientArrayList2.add(patient5);
        patientArrayList2.add(patient6);

        Doctor doctor1 = new Doctor("Мырзайым","Келдибекова",Gender.FEMALE, 2002);
        Doctor doctor2 = new Doctor("Айнура","Анарбаевна",Gender.FEMALE, 2002);
        Doctor doctor3 = new Doctor("Кундуз","Зикирова",Gender.FEMALE, 2002);
        Doctor doctor4 = new Doctor("Рамазан","Каракев",Gender.FEMALE, 2002);
        Doctor doctor5 = new Doctor("Рабия","Меваза",Gender.FEMALE, 2002);
        Doctor doctor6 = new Doctor("","Келдибекова",Gender.FEMALE, 2002);

        ArrayList<Doctor> doctorArrayList0 = new ArrayList<>();
        doctorArrayList0.add(doctor1);
        doctorArrayList0.add(doctor2);
        doctorArrayList0.add(doctor3);
        doctorArrayList0.add(doctor4);
        doctorArrayList0.add(doctor5);
        doctorArrayList0.add(doctor6);

        ArrayList<Doctor> doctorArrayList1 = new ArrayList<>();
        doctorArrayList1.add(doctor1);
        doctorArrayList1.add(doctor2);
        doctorArrayList1.add(doctor3);

        ArrayList<Doctor> doctorArrayList2 = new ArrayList<>();
        doctorArrayList2.add(doctor4);
        doctorArrayList2.add(doctor5);
        doctorArrayList2.add(doctor6);

        Department department1 = new Department("Доктор айболить",doctorArrayList1);
        Department department2 = new Department("Плюс ультра",doctorArrayList1);

        ArrayList<Department> departmentArrayList1 = new ArrayList<>();
        departmentArrayList1.add(department1);

        ArrayList<Department> departmentArrayList2 = new ArrayList<>();
        departmentArrayList2.add(department2);

        Hospital hospital1 = new Hospital("Доктор айболить","Гражданская 119",departmentArrayList1,doctorArrayList1,patientArrayList1);
        Hospital hospital2 = new Hospital("Плюс ультра","Чапаева 33",departmentArrayList2,doctorArrayList2,patientArrayList2);

        ArrayList<Hospital> hospitalArrayList0 = new ArrayList<>();
        hospitalArrayList0.add(hospital1);
        hospitalArrayList0.add(hospital2);

        DataBase dataBase = new DataBase(hospitalArrayList0);

        Scanner scanner = new Scanner(System.in);


    }
    public static void menu (){
        System.out.print("""
                Дабро пожаловать в бальницу.
                Выберите действие перчисленных в незу!
                ======================================
                1 Получить все отделения больницы.
                2 Найти отдел по названию
                2 Найти врача по id.
                3 
                """);
        System.out.print("Ваша дйствие: ");
    }
}

//        DepartmentDaoImpl dao = new DepartmentDaoImpl();
//        long muha = 5;
//        try {
//        dao.getAllDepartmentByHospital(muha);
//        }catch (RuntimeException f){
//            System.out.println(f.getMessage());
//        }
