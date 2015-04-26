package resume.modele;

import java.util.LinkedList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "cv")
public class Cv {
	String Nom;
	String Prenom;
	private String Objectif;
	private LinkedList<Experiencepro> Experience_profesionelle;
	private LinkedList<Scolarite> Scolarite;
	private LinkedList<Langue> Langues;
	private LinkedList<CompetenceInfo> Competences_informatique;

	String getNom() {
		return Nom;
	}
	@XmlElement
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	@XmlElement
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Cv(String Nom,String Prenom)
	{this.Nom=Nom;
	this.Prenom=Prenom;

	}
	public Cv(String Nom, String Prenom, String Objectif, LinkedList<Experiencepro> Experience_profesionelle
			,LinkedList<Scolarite> Scolarite,LinkedList<Langue> Langues,LinkedList<CompetenceInfo> Competences_informatique) 
	{
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.Objectif=Objectif;
		this.Experience_profesionelle=Experience_profesionelle;
		this.Scolarite=Scolarite;
		this.Langues=Langues;
		this.Competences_informatique=Competences_informatique;

	}
	public Cv(){}
	public String getObjectif() {
		return Objectif;
	}
	@XmlElement
	public void setObjectif(String objectif) {
		Objectif = objectif;
	}
	public LinkedList<Experiencepro> getExperience_profesionelle() {
		return Experience_profesionelle;
	}
	@XmlElement
	public void setExperience_profesionelle(
			LinkedList<Experiencepro> experience_profesionelle) {
		Experience_profesionelle = experience_profesionelle;
	}

	public LinkedList<Scolarite> getScolarite() {
		return Scolarite;
	}
	@XmlElement
	public void setScolarite(LinkedList<Scolarite> scolarite) {
		Scolarite = scolarite;
	}

	public LinkedList<Langue> getLangues() {
		return Langues;
	}
	@XmlElement
	public void setLangues(LinkedList<Langue> langues) {
		Langues = langues;
	}

	public LinkedList<CompetenceInfo> getCompetences_informatique() {
		return Competences_informatique;
	}
	@XmlElement
	public void setCompetences_informatique(
			LinkedList<CompetenceInfo> competences_informatique) {
		Competences_informatique = competences_informatique;
	}
}
