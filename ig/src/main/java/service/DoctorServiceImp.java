package service;

import java.util.List;

import dao.DoctorDao;
import dao.DoctorDaoImp;
import model.Doctor;

public class DoctorServiceImp implements DoctorService{
	DoctorDao DocDao;
	@Override
	public void addDoctor(Doctor doc) throws Exception {
		// TODO Auto-generated method stub
		DocDao =new DoctorDaoImp();
		DocDao.addDoctor(doc);
		
	}

	@Override
	public List<Doctor> listAllProducts() throws Exception {
		// TODO Auto-generated method stub
        DocDao =new DoctorDaoImp();
		
		return DocDao.listAllProducts();
		
	}

	@Override
	public Doctor findDoctorById(int id) throws Exception {
		// TODO Auto-generated method stub
		DocDao =new DoctorDaoImp();
		
		return DocDao.findDoctorById(id);
	}

	@Override
	public void deleteDoctorById(int id) throws Exception {
		// TODO Auto-generated method stub
		DocDao = new DoctorDaoImp();
		DocDao.deleteDoctorById(id);
		
	}

	@Override
	public void updateDoctorspec(int id, String spec) throws Exception {
		// TODO Auto-generated method stub
		DocDao = new DoctorDaoImp();
		DocDao.updateDoctorspec(id,spec);
	}
	

}
