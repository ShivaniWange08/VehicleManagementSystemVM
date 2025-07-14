package com.practise.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehicle_Details")
public class Vehicle {
    @Id
	private int vehicleId;
	
    @Column(name = "VehicleName")
	private String vehicleName;
	
	private String vehicleType;
	
	private String ownerName;
	
	private int ownerFlatNo;
	
	private long ownerMobileNo;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getOwnerFlatNo() {
		return ownerFlatNo;
	}

	public void setOwnerFlatNo(int ownerFlatNo) {
		this.ownerFlatNo = ownerFlatNo;
	}

	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleType=" + vehicleType
				+ ", ownerName=" + ownerName + ", ownerFlatNo=" + ownerFlatNo + ", ownerMobileNo=" + ownerMobileNo
				+ "]";
	}
	
	
}
