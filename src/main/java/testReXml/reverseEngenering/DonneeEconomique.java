//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.15 at 10:31:38 AM CET 
//


package testReXml.reverseEngenering;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="pib"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
 *                 &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="monaie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "pib",
    "monaie"
})
@XmlRootElement(name = "donneeEconomique")
public class DonneeEconomique {

    @XmlElement(required = true)
    protected DonneeEconomique.Pib pib;
    @XmlElement(required = true)
    protected String monaie;

    /**
     * Gets the value of the pib property.
     * 
     * @return
     *     possible object is
     *     {@link DonneeEconomique.Pib }
     *     
     */
    public DonneeEconomique.Pib getPib() {
        return pib;
    }

    /**
     * Sets the value of the pib property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneeEconomique.Pib }
     *     
     */
    public void setPib(DonneeEconomique.Pib value) {
        this.pib = value;
    }

    /**
     * Gets the value of the monaie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonaie() {
        return monaie;
    }

    /**
     * Sets the value of the monaie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonaie(String value) {
        this.monaie = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
     *       &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Pib {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "unite")
        protected String unite;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the unite property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnite() {
            return unite;
        }

        /**
         * Sets the value of the unite property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnite(String value) {
            this.unite = value;
        }

    }

}
