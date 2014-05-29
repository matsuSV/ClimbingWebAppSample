package org.beginningee6.parsonal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Recode {

	/*
	 * ID
	 */
	@Id
	private Long id;

	/*
	 * 初段
	 */
	@OneToOne
	private FirstGrade firstGrade;

	/*
	 * 1級
	 */
	@OneToOne
	private FirstClass firstClass;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FirstGrade getFirstGrade() {
		return firstGrade;
	}

	public void setFirstGrade(FirstGrade firstGrade) {
		this.firstGrade = firstGrade;
	}

	public FirstClass getFirstClass() {
		return firstClass;
	}

	public void setFirstClass(FirstClass firstClass) {
		this.firstClass = firstClass;
	}
}
