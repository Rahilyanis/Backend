package resume.controler;


import java.util.HashMap;
import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import resume.modele.CompetenceInfo;
import resume.modele.Cv;
import resume.modele.Experiencepro;
import resume.modele.Langue;
import resume.modele.Listcvs;
import resume.modele.Scolarite;

@Controller
@RequestMapping("/cv")
public class XMLController {
	HashMap<Integer, Cv> listdescvs = new HashMap<Integer, Cv>();
	Listcvs listcvs = new Listcvs();
	public XMLController()
	{		//CV1
		LinkedList<Experiencepro> Experiences_profesionelle = new LinkedList<Experiencepro>()  ;
		LinkedList<Langue> Langues =new LinkedList<Langue>();
		LinkedList<Scolarite> Scolarites =new LinkedList<Scolarite>();
		LinkedList<CompetenceInfo> Competences_informatique=new LinkedList<CompetenceInfo>();
		Experiencepro E = new Experiencepro();
		E.setTitre("Concepteur/Développeur");
		E.setDescription("Android");
		Experiences_profesionelle.add(E);		
		Experiencepro E2 = new Experiencepro();
		E2.setTitre("Concepteur/Développeur");
		E2.setDescription("JEE");
		Experiences_profesionelle.add(E2);			
		Langue L= new Langue();
		L.setTitre("Français");
		L.setNiveau(5);
		Langues.add(L);	
		Langue L2= new Langue();
		L2.setTitre("Anglais");
		L2.setNiveau(4);
		Langues.add(L2);	
		Langue L3= new Langue();
		L3.setTitre("Kabyle");
		L3.setNiveau(5);
		Langues.add(L3);	
		Scolarite s = new Scolarite();
		s.setTitre("Université De Paris");
		s.setDescription("Licence Informatique");
		Scolarites.add(s);		
		Scolarite s2 = new Scolarite();
		s2.setTitre("Université De Rouen");
		s2.setDescription("Master 1 GIL");
		Scolarites.add(s2);		
		CompetenceInfo C= new CompetenceInfo();
		C.setType("JEE");
		C.setNiveau(5);
		Competences_informatique.add(C);
		CompetenceInfo C2= new CompetenceInfo();		
		C2.setType("SPRING");
		C2.setNiveau(4);
		Competences_informatique.add(C2);
		CompetenceInfo C3= new CompetenceInfo();		
		C3.setType("MAVEN");
		C3.setNiveau(4);
		Competences_informatique.add(C3);
		CompetenceInfo C4= new CompetenceInfo();		
		C4.setType("ANDROID");
		C4.setNiveau(4);
		Competences_informatique.add(C4);
		Cv Cv = new Cv("Rahil","Yanis","Chef De Projet",Experiences_profesionelle,
				Scolarites,Langues,Competences_informatique);
		listdescvs.put(1, Cv);
		listcvs.setCvs(listdescvs);
		//CV2
		LinkedList<Experiencepro> Experiences_profesionelle2 = new LinkedList<Experiencepro>()  ;
		LinkedList<Langue> Langues2 =new LinkedList<Langue>();
		LinkedList<Scolarite> Scolarites2 =new LinkedList<Scolarite>();
		LinkedList<CompetenceInfo> Competences_informatique2=new LinkedList<CompetenceInfo>();
		Experiencepro E2_2 = new Experiencepro();
		E2_2.setTitre("Chef De Projet");
		E2_2.setDescription("Android");
		Experiences_profesionelle2.add(E2_2);		
		Experiencepro E2_3 = new Experiencepro();
		E2_3.setTitre("Chef De Projet");
		E2_3.setDescription("JEE");
		Experiences_profesionelle2.add(E2_3);			
		Langue L2_1= new Langue();
		L2_1.setTitre("Français");
		L2_1.setNiveau(5);
		Langues2.add(L2_1);	
		Langue L2_2= new Langue();
		L2_2.setTitre("Anglais");
		L2_2.setNiveau(4);
		Langues2.add(L2_2);	
		Langue L2_3= new Langue();
		L2_3.setTitre("Russe");
		L2_3.setNiveau(5);
		Langues2.add(L2_3);	
		Scolarite s2_1 = new Scolarite();
		s2_1.setTitre("Université De Grenoble");
		s2_1.setDescription("Licence Informatique");
		Scolarites2.add(s2_1);		
		Scolarite s2_2 = new Scolarite();
		s2_2.setTitre("Université De Paris");
		s2_2.setDescription("Master 1 Mangament Des SI");
		Scolarites2.add(s2_2);		
		CompetenceInfo C2_1= new CompetenceInfo();
		C2_1.setType("HTML/CSS");
		C2_1.setNiveau(5);
		Competences_informatique2.add(C2_1);
		CompetenceInfo C2_2= new CompetenceInfo();		
		C2_2.setType("MSProject");
		C2_2.setNiveau(4);
		Competences_informatique2.add(C2_2);
		CompetenceInfo C2_3= new CompetenceInfo();		
		C2_3.setType("SAP");
		C2_3.setNiveau(4);
		Competences_informatique2.add(C2_3);
		CompetenceInfo C2_4= new CompetenceInfo();		
		C2_4.setType("JAVA");
		C2_4.setNiveau(4);
		Competences_informatique2.add(C2_4);
		Cv Cv2 = new Cv("Jean","Luc","Développeur",Experiences_profesionelle2,
				Scolarites2,Langues2,Competences_informatique2);
		listdescvs.put(1, Cv);
		listdescvs.put(2, Cv2);
		listcvs.setCvs(listdescvs);

	}


	@RequestMapping(value="", method = RequestMethod.GET)
	public @ResponseBody Listcvs getCVsInXML(  ) {
		return listcvs;
	}

	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public @ResponseBody Cv getCVInXML(@PathVariable int id ) {

		return listcvs.getCvs().get(id);

	}  



	@RequestMapping(method=RequestMethod.POST, value="/addCv")
	public @ResponseBody void postCv(@RequestBody Cv cv) {
		listdescvs.put(listdescvs.size()+1, cv);
		listcvs.setCvs(listdescvs);

	}

}