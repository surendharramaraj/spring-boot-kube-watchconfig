package com.profiling.activeprofiledemo.Controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profiling.activeprofiledemo.Model.CloudVendor;



@Profile("prod")
@RestController
@RequestMapping("/cloudvendor")
@RefreshScope
public class ProdSwagger {
    CloudVendor cloudVendor;

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
