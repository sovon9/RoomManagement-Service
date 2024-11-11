package com.sovon9.RoomManagement_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoomManagementServiceApplication {

	public static void main(String[] args) {
		try
		{
		SpringApplication.run(RoomManagementServiceApplication.class, args);
		}
		catch(Exception e)
		{
			if(e.getClass().getName().equals("SilentExitException"))
			{
				
			}
		}
	}

}
