package com.ePallika.sample.address.controller;


import com.ePallika.sample.address.dtoconverter.AddressDtoConverter;
import com.ePallika.sample.address.model.entity.Province;
import com.ePallika.sample.address.service.ProvinceService;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/province")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProvinceController {

	@Autowired
	private ProvinceService provinceService;

	@GetMapping("/all")
	public ResponseEntity getAll() {
		
		return ResponseMessage.success(
				provinceService.getAll().stream().map(AddressDtoConverter::convert).collect(Collectors.toList()));
	}
	
	@PostMapping
	public ResponseEntity saveProvince(@RequestBody Province province) {
		
		Province province2 = provinceService.saveProvince(province);
		
		return ResponseMessage.success(province2.getId(), "Province Saved Successfully");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteProvince(@PathVariable("id") long id){
		boolean check = provinceService.deleteById(id);
		return ResponseMessage.success("Province Deleted Successfully");
	}
}
