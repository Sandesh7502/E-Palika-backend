package com.ePallika.sample.user.controller;

import com.ePallika.sample.user.dtoconverter.UserDtoConverter;
import com.ePallika.sample.user.model.dto.UserAddressDto;
import com.ePallika.sample.user.model.entity.UserAddress;
import com.ePallika.sample.user.service.UserAddressService;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("user/address")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserAddressController {
	@Autowired
	private UserAddressService addressService;
	
	@GetMapping("/all")
	//@Secured(ADDRESS_MODULE.SELECT)
	public ResponseEntity getAllAddress() {
		
		return ResponseMessage.success(addressService.getAddress().stream()
				.map(UserDtoConverter::convert)
				.collect(Collectors.toList())
				);
	}
	@PostMapping
	//@Secured(ADDRESS_MODULE.INSERT)
	public ResponseEntity saveAddress(@RequestBody UserAddressDto address) {
	System.out.println(" -------------- address controller -------------" );
		UserAddress address1 = addressService.saveAddress(UserDtoConverter.convert(address));
		return ResponseMessage.success(address1.getId(), "Address Saved Successfully");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteAddress(@PathVariable("id") long id){
		boolean check = addressService.deleteAddress(id);
		return ResponseMessage.success("Address Deleted Successfully");
	}
	
}
