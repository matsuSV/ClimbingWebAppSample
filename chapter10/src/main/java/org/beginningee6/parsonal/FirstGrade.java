package org.beginningee6.parsonal;

import java.util.Date;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FirstGrade {

	/*
	 * ID
	 */
	@Id
	private Long id;

	/*
	 * Route
	 */
	private Map<String, Date> route;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Map<String, Date> getRoute() {
		return route;
	}

	public void setRoute(Map<String, Date> route) {
		this.route = route;
	}
}
