//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.15 at 10:31:38 AM CET 
//


package testReXml.reverseEngenering;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pays" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nomPays" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element ref="{}dateReleve"/&gt;
 *                   &lt;element ref="{}donneeDemographique"/&gt;
 *                   &lt;element ref="{}donneeEconomique"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pays"
})
@XmlRootElement(name = "listePays")
public class ListePays {

    @XmlElement(required = true)
    protected List<ListePays.Pays> pays;

    /**
     * Gets the value of the pays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListePays.Pays }
     * 
     * 
     */
    public List<ListePays.Pays> getPays() {
        if (pays == null) {
            pays = new ArrayList<ListePays.Pays>();
        }
        return this.pays;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="nomPays" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element ref="{}dateReleve"/&gt;
     *         &lt;element ref="{}donneeDemographique"/&gt;
     *         &lt;element ref="{}donneeEconomique"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nomPays",
        "dateReleve",
        "donneeDemographique",
        "donneeEconomique"
    })
    public static class Pays {

        @XmlElement(required = true)
        protected String nomPays;
        @XmlElement(required = true)
        protected DateReleve dateReleve;
        @XmlElement(required = true)
        protected DonneeDemographique donneeDemographique;
        @XmlElement(required = true)
        protected DonneeEconomique donneeEconomique;

        /**
         * Gets the value of the nomPays property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomPays() {
            return nomPays;
        }

        /**
         * Sets the value of the nomPays property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomPays(String value) {
            this.nomPays = value;
        }

        /**
         * Gets the value of the dateReleve property.
         * 
         * @return
         *     possible object is
         *     {@link DateReleve }
         *     
         */
        public DateReleve getDateReleve() {
            return dateReleve;
        }

        /**
         * Sets the value of the dateReleve property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateReleve }
         *     
         */
        public void setDateReleve(DateReleve value) {
            this.dateReleve = value;
        }

        /**
         * Gets the value of the donneeDemographique property.
         * 
         * @return
         *     possible object is
         *     {@link DonneeDemographique }
         *     
         */
        public DonneeDemographique getDonneeDemographique() {
            return donneeDemographique;
        }

        /**
         * Sets the value of the donneeDemographique property.
         * 
         * @param value
         *     allowed object is
         *     {@link DonneeDemographique }
         *     
         */
        public void setDonneeDemographique(DonneeDemographique value) {
            this.donneeDemographique = value;
        }

        /**
         * Gets the value of the donneeEconomique property.
         * 
         * @return
         *     possible object is
         *     {@link DonneeEconomique }
         *     
         */
        public DonneeEconomique getDonneeEconomique() {
            return donneeEconomique;
        }

        /**
         * Sets the value of the donneeEconomique property.
         * 
         * @param value
         *     allowed object is
         *     {@link DonneeEconomique }
         *     
         */
        public void setDonneeEconomique(DonneeEconomique value) {
            this.donneeEconomique = value;
        }

    }

}