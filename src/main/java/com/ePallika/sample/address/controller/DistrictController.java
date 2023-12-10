package com.ePallika.sample.address.controller;

import com.ePallika.sample.address.dtoconverter.AddressDtoConverter;
import com.ePallika.sample.address.model.entity.District;
import com.ePallika.sample.address.service.DistrictService;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/district")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DistrictController {

	@Autowired
	private DistrictService districtService;

	@GetMapping("/all")
	public ResponseEntity getAll() {
		return ResponseMessage.success(
				districtService.getAll().stream().map(AddressDtoConverter::convert).collect(Collectors.toList()));
	}
	
	@PostMapping
	public ResponseEntity saveDistrict(@RequestBody District district) {
		
		District district2 = districtService.saveDistrict(district);
		
		return ResponseMessage.success(district2.getDistrictPK().getId(), "District Saved Successfully");
	}
	
	@GetMapping("/province")
	public ResponseEntity getByProvince(@RequestParam("id") long id) {
		return ResponseMessage.success(districtService.getByProvince(id).stream()
				.map(AddressDtoConverter::convert)
				.collect(Collectors.toList())
				);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable("id") long id){
		districtService.deleteDistrict(id);
		return ResponseMessage.success("District Deleted Successfully");
	}
}
