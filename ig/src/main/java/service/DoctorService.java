package service;

import java.util.List;

import model.Doctor;

public interface DoctorService {
	public void addDoctor(Doctor doc) throws Exception;
	public List<Doctor> listAllProducts() throws Exception;
	public Doctor findDoctorById(int id) throws Exception;
	public void deleteDoctorById(int id) throws Exception;
	public void updateDoctorspec(int id, String spec) throws Exception;
}
