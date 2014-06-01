package org.beginningee6.parsonal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name = "findAllParsons", query = "SELECT p FROM Parson p")
public class Parson {

	/*
	 * ID
	 */
	@Id
	private Long id;

	/*
	 * Name
	 */
	private String name;

	/*
	 * 記録
	 */
	@OneToOne
	private Recode recode;
	
	public Parson() {
	}
	
	
	public Parson(Long id,
					String name,
					Recode recode) {
		
		this.id = id;
		this.name = name;
		this.recode = recode;
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

	public Recode getRecode() {
		return recode;
	}

	public void setRecode(Recode recode) {
		this.recode = recode;
	}
}
