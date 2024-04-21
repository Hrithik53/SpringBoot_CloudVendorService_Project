package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CloudVendor;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cloudvendor);
	
	public String updateCloudVendor(CloudVendor cloudvendor);
	
	public String deleteCloudVendor(String cloudVendorId);
	
	public CloudVendor getCloudVendor(String cloudVendorId);
	
	public List<CloudVendor> getAllCloudVendor();
	

}
