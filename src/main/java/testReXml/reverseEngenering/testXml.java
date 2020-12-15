package testReXml.reverseEngenering;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import fr.diginamic.schema.ListePays.Pays;

public class testXml {
	public static void main(String[] args) throws JAXBException {
		JAXBContext jc=JAXBContext.newInstance(ListePays.class);
		Unmarshaller unmarch = jc.createUnmarshaller();
		ListePays racine=(ListePays) unmarch.unmarshal(new File("src/main/resources/tp1.xml"));
		List<testReXml.reverseEngenering.ListePays.Pays> listPays=racine.getPays();		
		
		for (testReXml.reverseEngenering.ListePays.Pays pays : listPays) {
			System.out.println("nom : "+pays.getNomPays());
			System.out.println("date de relevé : "+pays.getDateReleve().getValue());
			
			System.out.println("monnaie : "+pays.getDonneeEconomique().getMonaie());
		}
		
	}
}
