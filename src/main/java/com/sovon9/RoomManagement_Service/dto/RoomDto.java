package com.sovon9.RoomManagement_Service.dto;

public class RoomDto {

	private int roomNum;
	private Long guestID;
	private String roomStatus;
	private String desc;
	private double roomRate;
	private String ratePlan;
	private boolean overriden;
	private int floor;
	public RoomDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public Long getGuestID() {
		return guestID;
	}
	public void setGuestID(Long guestID) {
		this.guestID = guestID;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getRoomRate() {
		return roomRate;
	}
	public void setRoomRate(double roomRate) {
		this.roomRate = roomRate;
	}
	public String getRatePlan() {
		return ratePlan;
	}
	public void setRatePlan(String ratePlan) {
		this.ratePlan = ratePlan;
	}
	public boolean isOverriden() {
		return overriden;
	}
	public void setOverriden(boolean overriden) {
		this.overriden = overriden;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
}
