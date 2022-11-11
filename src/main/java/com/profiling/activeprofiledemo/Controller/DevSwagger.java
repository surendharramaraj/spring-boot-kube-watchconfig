package com.profiling.activeprofiledemo.Controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profiling.activeprofiledemo.Model.CloudVendor;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Profile("dev")
@RestController
@RequestMapping("/cloudvendor")
public class DevSwagger {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		return cloudVendor;
	}
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "cloud vendor created successfully";
	}
    @PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "cloud vendor updated successfully";
	}
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId){
		this.cloudVendor = null;
		return "cloud vendor deleted successfully";
	}
}
