package ar.nic.springsecurity.services;

import ar.nic.springsecurity.entity.Health;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

/*
 * Service to provide the status of the app
 */
@Service
public class HealthService {

	public Health getStatus() throws UnknownHostException {
		Health health = new Health();
		health.setHost(InetAddress.getLocalHost().getHostName());
		return health;
	}
}
