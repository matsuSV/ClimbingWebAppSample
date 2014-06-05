package org.beginningee6.parsonal;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ParsonController {

	@EJB
	private ParsonEJB parsonEJB;

	private Parson parson = new Parson();
	private List<Parson> parsonList = new ArrayList<Parson>();

	public String doCreateParson() {
		this.parson = parsonEJB.createParson(parson);
		this.parsonList = this.parsonEJB.findParsons();
		return "listParsons.xhtml";
	}

	public Parson getParson() {
		return parson;
	}

	public void setParson(Parson parson) {
		this.parson = parson;
	}

	public List<Parson> getParsonList() {
		return parsonList;
	}

	public void setParsonList(List<Parson> parsonList) {
		this.parsonList = parsonList;
	}
}
