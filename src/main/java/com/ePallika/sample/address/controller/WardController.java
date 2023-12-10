package com.ePallika.sample.address.controller;


import com.ePallika.sample.address.dtoconverter.AddressDtoConverter;
import com.ePallika.sample.address.model.entity.Ward;
import com.ePallika.sample.address.service.WardService;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/ward")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class WardController {

	@Autowired
	private WardService wardService;

	@GetMapping("/all")
	public ResponseEntity getAll() {
		return ResponseMessage
				.success(wardService.getAll().stream().map(AddressDtoConverter::convert).collect(Collectors.toList()));
	}

	@PostMapping
	public ResponseEntity saveWard(@RequestBody Ward ward) {

		Ward ward2 = wardService.saveWard(ward);

		return ResponseMessage.success(ward2.getWardPK().getId(), "Ward Saved Successfully");

	}

	@GetMapping("/municipality")
	public ResponseEntity getByMunicipality(@RequestParam("provinceid") long provinceId,
			@RequestParam("districtid") long districtId, @RequestParam("municipalityid") long municipalityId) {
		return ResponseMessage.success(wardService.getByMunicipality(provinceId, districtId, municipalityId).stream()
				.map(AddressDtoConverter::convert).collect(Collectors.toList()));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable("id") long id){
		boolean check = wardService.deleteById(id);
		return ResponseMessage.success("Ward Deleted Successfully");
	}

}
