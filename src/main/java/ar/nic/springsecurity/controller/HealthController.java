package ar.nic.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;

import ar.nic.springsecurity.services.HealthService;
import ar.nic.springsecurity.entity.Health;

@RestController
public class HealthController {

	@Autowired
    private HealthService healthService;
	
    @GetMapping("/health")
    public Health health() throws UnknownHostException {
    	return healthService.getStatus();
    }

}