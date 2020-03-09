package com.adam.bleDevices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class BleDevicesApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World";
	}

	@RequestMapping(value = "device", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public List<String> saveDevice(@RequestBody DeviceWrapper wrapper) {
		List<String> response = new ArrayList<String>();
		for (Device device : wrapper.getDevices()) {
			// deviceService.save(device);
			response.add("Found Device: " + device.toString());
			// display.add("Found Device: " + device.toString());
			System.out.println("Found Device: " + device.toString());
		}
		return response;
	}

	public static void main(String[] args) {
		SpringApplication.run(BleDevicesApplication.class, args);
    }
}
