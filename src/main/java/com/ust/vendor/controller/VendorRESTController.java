package com.ust.vendor.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ust.vendor.entities.Vendor;
import com.ust.vendor.repos.VendorRepository;

@RestController
@RequestMapping("/vendors")
public class VendorRESTController {

	@Autowired
	VendorRepository vendorRepo;
	
	@GetMapping
	public List<Vendor> getVendor() {
		return vendorRepo.findAll();
	}
	
	@PostMapping
	public Vendor createVendor(@RequestBody Vendor vendor) {
		return vendorRepo.save(vendor);
	}
	
	@PutMapping
	public Vendor updateLocation(@RequestBody Vendor vendor) {
		return vendorRepo.save(vendor);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		vendorRepo.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Optional<Vendor> getLocation(@PathVariable("id") int id) {
		return vendorRepo.findById(id);
	}
}
