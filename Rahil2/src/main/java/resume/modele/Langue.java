package resume.modele;

public class Langue {
	private String titre;
	private int Niveau;
	public Langue()
	{}
	public Langue(String titre,int Niveau)
	{
		this.titre=titre;
		this.Niveau=Niveau;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNiveau() {
		return Niveau;
	}
	public void setNiveau(int Niveau) {
		this.Niveau = Niveau;
	}
}
