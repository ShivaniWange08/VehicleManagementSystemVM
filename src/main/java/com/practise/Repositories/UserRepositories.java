package com.practise.Repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Vehicle;
import com.practise.Utility.HibernateUtility;

public class UserRepositories {
		
		//to get single product
		public void getSingleVehicleDetails(int vehicleId) {
			
			SessionFactory factory = HibernateUtility.getSessionFactory();
	        Session session = factory.openSession();
	        Transaction transaction = session.beginTransaction();
	        Vehicle vc = session.find(Vehicle.class, vehicleId);
	        //System.out.println(pd.toString());
	        transaction.commit();
	        session.close();
	        
	        System.out.println("Vehicle ID : " + vc.getVehicleId());
			System.out.println("Vehicle Name : " + vc.getVehicleName());
			System.out.println("Vehicle Price : " + vc.getVehicleType());
			System.out.println("Owner Name :" +vc.getOwnerName());
			System.out.println("Owner Flat No. : " +vc.getOwnerFlatNo());
			System.out.println("Ownwer Mobile No. :" +vc.getOwnerMobileNo());
		}
		
		//to get list of product
		public void getListOfVehicleDetails() {
	SessionFactory factory = HibernateUtility.getSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
		    List<Vehicle> vehicleList = session.createQuery("select v from Vehicle v", Vehicle.class)
		    		.getResultList();
		    
		    vehicleList.stream().forEach(k -> System.out.println(k.toString()));
		    transaction.commit();
		    session.close();
		}
		
		//to add your own product
		public String toAddVehicleDetail(String toAdd)
	    {  
	    	Vehicle v = new Vehicle();
	    	v.setVehicleId(104);
	    	v.setVehicleName("Altroz");
	    	v.setVehicleType("Car");
	    	v.setOwnerName("Yogita Wange");
	    	v.setOwnerFlatNo(04);
	    	v.setOwnerMobileNo(99757143);
	        
	        SessionFactory factory = HibernateUtility.getSessionFactory();
	        Session session = factory.openSession();
	        Transaction transaction = session.beginTransaction();
	        System.out.println(v.toString());
	        session.persist(v);
	        transaction.commit();
	        session.close();
			return toAdd;
	        
	    }
		//to delete any product
		public void toRemoveVehicleDetail(int remove) {
		        
			SessionFactory factory = HibernateUtility.getSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			Vehicle s = session.find(Vehicle.class, 0);
			session.remove(s);
			transaction.commit();
			session.close();
				
				
			}
		
		//to update any detail of product
		public void toUpdateVehicleDetail(int update) {
	        
			SessionFactory factory = HibernateUtility.getSessionFactory();
		    Session session = factory.openSession();
		    Transaction transaction = session.beginTransaction();
			Vehicle v1 = session.find(Vehicle.class, 104);
			v1.setOwnerMobileNo(845985205);
			transaction.commit();
			session.close();
		}
}
