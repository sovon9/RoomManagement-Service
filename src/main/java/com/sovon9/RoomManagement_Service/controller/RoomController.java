package com.sovon9.RoomManagement_Service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sovon9.RoomManagement_Service.model.Room;
import com.sovon9.RoomManagement_Service.service.RoomService;

@RequestMapping("/room-service")
@RestController
public class RoomController {

	@Autowired
	private RoomService roomService;

	@PutMapping("/room/{roomnum}/status/{status}")
	public ResponseEntity<Room> upateRoomStatus(@PathVariable("roomnum") Integer roomnum, @PathVariable("status") String status)
	{
		Optional<Room> roomData = roomService.getRoom(roomnum);
		if (roomData.isPresent())
		{
			Room room = roomData.get();
			room.setRoomStatus(status);
			room = roomService.saveRoom(room);
			return new ResponseEntity<>(room, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("resID/{resID}/room/{roomnum}/status/{status}")
	public ResponseEntity<Room> upateResRoomStatus(@PathVariable("resID") Long resID, @PathVariable("roomnum") Integer roomnum, @PathVariable("status") String status)
	{
		Optional<Room> roomData = roomService.getRoom(roomnum);
		if(roomData.isPresent())
		{
			Room room = roomData.get();
			room.setGuestID(resID);
			room.setRoomStatus(status);
			room = roomService.saveRoom(room);
			return new ResponseEntity<>(room, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/getAllAvailableRooms")
	public ResponseEntity<List<Room>> getAllAvailableRooms()
	{
		return new ResponseEntity<>(roomService.getAllRoomDetails(), HttpStatus.OK);
	}
	
}
