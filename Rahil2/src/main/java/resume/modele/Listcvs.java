package resume.modele;

import java.util.HashMap;
import java.util.LinkedList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cvs")
public class Listcvs {
	public Listcvs(){}
	public HashMap<Integer,Cv> getCvs() {
		return cvs;
	}
	@XmlElement
	public void setCvs(HashMap<Integer,Cv> listcvs) {
		this.cvs = listcvs;
	}
	HashMap<Integer,Cv> cvs= new HashMap<Integer,Cv> ();



}
