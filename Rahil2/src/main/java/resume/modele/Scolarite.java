package resume.modele;

public class Scolarite {
	private String titre;
	private String Description;
	public Scolarite()
	{}
	public Scolarite(String titre,String Description)
	{
		this.titre=titre;
		this.Description=Description;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
}
