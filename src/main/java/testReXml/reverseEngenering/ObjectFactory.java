//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.15 at 10:31:38 AM CET 
//


package testReXml.reverseEngenering;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.diginamic.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.diginamic.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListePays }
     * 
     */
    public ListePays createListePays() {
        return new ListePays();
    }

    /**
     * Create an instance of {@link DonneeDemographique }
     * 
     */
    public DonneeDemographique createDonneeDemographique() {
        return new DonneeDemographique();
    }

    /**
     * Create an instance of {@link DonneeEconomique }
     * 
     */
    public DonneeEconomique createDonneeEconomique() {
        return new DonneeEconomique();
    }

    /**
     * Create an instance of {@link ListePays.Pays }
     * 
     */
    public ListePays.Pays createListePaysPays() {
        return new ListePays.Pays();
    }

    /**
     * Create an instance of {@link DateReleve }
     * 
     */
    public DateReleve createDateReleve() {
        return new DateReleve();
    }

    /**
     * Create an instance of {@link DonneeDemographique.Population }
     * 
     */
    public DonneeDemographique.Population createDonneeDemographiquePopulation() {
        return new DonneeDemographique.Population();
    }

    /**
     * Create an instance of {@link DonneeDemographique.Fecondite }
     * 
     */
    public DonneeDemographique.Fecondite createDonneeDemographiqueFecondite() {
        return new DonneeDemographique.Fecondite();
    }

    /**
     * Create an instance of {@link DonneeEconomique.Pib }
     * 
     */
    public DonneeEconomique.Pib createDonneeEconomiquePib() {
        return new DonneeEconomique.Pib();
    }

}