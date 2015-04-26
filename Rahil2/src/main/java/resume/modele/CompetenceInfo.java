package resume.modele;

public class CompetenceInfo {
	private String type;
	private int Niveau;
	public CompetenceInfo()
	{}
	public CompetenceInfo(String type,int Niveau)
	{
		this.type=type;
		this.Niveau=Niveau;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNiveau() {
		return Niveau;
	}
	public void setNiveau(int Niveau) {
		this.Niveau = Niveau;
	}
}
