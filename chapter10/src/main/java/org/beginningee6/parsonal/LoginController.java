package org.beginningee6.parsonal;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.persistence.Id;

@ManagedBean
@SessionScoped
public class LoginController {
	
	/*
	 * ID
	 */
	@Id
	private Long id;

	/*
	 * Name
	 */
	private String name;
	
	
	@Inject
	private Parson parson;
	
	@EJB
	private LoginEJB loginEJB;

	
	public String doCreateParson() {
		this.parson = loginEJB.findLoginParson(id);
		return "listParsons.xhtml";
	}

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
