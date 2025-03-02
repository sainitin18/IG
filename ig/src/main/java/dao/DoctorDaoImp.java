package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Doctor;
import util.DbUtil;

public class DoctorDaoImp implements DoctorDao {

	@Override
	public void addDoctor(Doctor doc) throws Exception {
		// TODO Auto-generated method stub
		Connection c = DbUtil.getConnectioin();
		PreparedStatement p = c.prepareStatement("insert into doctors values (?,?,?)");
		p.setInt(1, doc.getId());
		p.setString(2, doc.getName());
		p.setString(3, doc.getSpec());
		p.execute();
	}

	@Override
	public List<Doctor> listAllProducts() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Doctor> docList = new ArrayList<Doctor>();
		Connection c = DbUtil.getConnectioin();
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("select * from doctors");
		while(rs.next()) {
			Doctor doc = new Doctor();
			doc.setId(rs.getInt(1));
			doc.setName(rs.getString(2));
			doc.setSpec(rs.getString(3));
			docList.add(doc);
		}
		return docList;
	}

	@Override
	public Doctor findDoctorById(int id) throws Exception {
		Connection c = DbUtil.getConnectioin();
		PreparedStatement p = c.prepareStatement("select * from doctors where id = ?");
		Doctor d = new Doctor();
		p.setInt(1, id);
		ResultSet r = p.executeQuery();
		if (r.next()) {
            Doctor doc = new Doctor();
            doc.setId(r.getInt("id"));
            doc.setName(r.getString("name"));
            doc.setSpec(r.getString("spec"));
            return doc;
        } else {
            System.out.println("Doctor not found.");
            return null;
        }
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteDoctorById(int id) throws Exception {
		// TODO Auto-generated method stub
		Connection c = DbUtil.getConnectioin();
		PreparedStatement p = c.prepareStatement("delete from doctors where id = ?");
		p.setInt(1, id);
		int rowDeleted = p.executeUpdate();
		if(rowDeleted>0) {
			System.out.println("Deleted successfully");
		}else {
			System.out.println("Doctor not found");
		}
	}

	@Override
	public void updateDoctorspec(int id, String spec) throws Exception {
		// TODO Auto-generated method stub
		Connection c = DbUtil.getConnectioin();
		PreparedStatement p = c.prepareStatement("update doctors set spec = ? where id = ? ");
		p.setString(1, spec );
		p.setInt(2, id);
		
		int rowUpdated = p.executeUpdate();
		if(rowUpdated>0) {
			System.out.println("Updated successfully");
		}else {
			System.out.println("Doctor not found");
		}
		
	}
	
}
