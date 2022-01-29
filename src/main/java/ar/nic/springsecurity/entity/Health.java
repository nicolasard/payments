package ar.nic.springsecurity.entity;

public class Health {
	String host;
	
	String version;
	
	String lastCommit;
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLastCommit() {
		return lastCommit;
	}

	public void setLastCommit(String lastCommit) {
		this.lastCommit = lastCommit;
	}	
}
