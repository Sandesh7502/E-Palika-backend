package com.ePallika.sample.address.controller;

import com.ePallika.sample.address.dtoconverter.AddressDtoConverter;
import com.ePallika.sample.address.model.entity.Municipality;
import com.ePallika.sample.address.service.MunicipalityService;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/municipality")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MunicipalityController {

	@Autowired
	private MunicipalityService municipalityService;

	@GetMapping("/all")
	public ResponseEntity getAll() {
		return ResponseMessage.success(
				municipalityService.getAll().stream().map(AddressDtoConverter::convert).collect(Collectors.toList()));
	}

	@PostMapping
	public ResponseEntity saveMunicipality(@RequestBody Municipality municipality) {
		Municipality municipality2 = municipalityService.saveMuncipality(municipality);
		return ResponseMessage.success(municipality2.getMunicipalityPK().getId(), "Municipality Saved Successfully");
	}

	@GetMapping("/district")
	public ResponseEntity getByDistrict(@RequestParam("provinceid") long provinceId,
			@RequestParam("districtid") long districtId) {
		return ResponseMessage.success(municipalityService.getByDistrict(provinceId, districtId).stream()
				.map(AddressDtoConverter::convert).collect(Collectors.toList()));

	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable("id") long id){
		boolean check = municipalityService.deleteByMunicipality(id);
		return ResponseMessage.success("Municipality deleted successfully");
	}

}
