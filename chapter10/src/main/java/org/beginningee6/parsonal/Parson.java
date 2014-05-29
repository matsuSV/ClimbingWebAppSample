package org.beginningee6.parsonal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Parson {

	/*
	 * ID
	 */
	@Id
	Long id;

	/*
	 * Name
	 */
	String name;

	/*
	 * 記録
	 */
	@OneToOne
	Recode recode;

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
