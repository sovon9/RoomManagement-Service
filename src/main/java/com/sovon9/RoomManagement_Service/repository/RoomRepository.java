package com.sovon9.RoomManagement_Service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sovon9.RoomManagement_Service.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{

	List<Room> findByRoomStatus(String string);

}
