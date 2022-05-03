package com.v2.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Para tomar configuraciones de un archivo de propiedades local. importante la
 * anotacion de component para q se pueda inyectar en el controller.
 * 
 * @author esteb
 *
 */
@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	private int minimum;
	private int maximun;

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximun() {
		return maximun;
	}

	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}

}
