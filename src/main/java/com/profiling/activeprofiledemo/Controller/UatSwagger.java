package com.profiling.activeprofiledemo.Controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profiling.activeprofiledemo.Model.CloudVendor;

@Profile("uat")
@RestController
@RequestMapping("/cloudvendor")
public class UatSwagger {
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
}
