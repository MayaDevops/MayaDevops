package com.translator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/translator")
public class translatorController {
	
	 @GetMapping(value = {"/translate"})
	    public ResponseEntity<KsmartBirthApplicationSearchResponse> searchKsmartBirth(@RequestBody KsmartBirthDetailsRequest request, @Valid @ModelAttribute KsmartBirthApplicationSearchCriteria criteria) {
	        List<KsmartBirthAppliactionDetail> birthDetails=ksmartBirthService.searchKsmartBirthDetails(request, criteria);
	        KsmartBirthApplicationSearchResponse response=KsmartBirthApplicationSearchResponse.builder()
	                                                                              .responseInfo(responseInfoFactory.createResponseInfoFromRequestInfo(request.getRequestInfo(), Boolean.TRUE))
	                                                                              .ksmartBirthDetails(birthDetails)
	                                                                              .build();


	        return ResponseEntity.ok(response);
	    }

}
