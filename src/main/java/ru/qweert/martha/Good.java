//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.02 at 01:07:53 PM GMT+03:00 
//


package ru.qweert.martha;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for good complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="good">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *       &lt;attribute name="goodType" type="{http://martha.qweert.ru}goodType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "good", propOrder = {
    "name",
    "quantity",
    "cost"
})
public class Good {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected BigInteger quantity;
    protected float cost;
    @XmlAttribute(name = "goodType")
    protected GoodType goodType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     */
    public float getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     */
    public void setCost(float value) {
        this.cost = value;
    }

    /**
     * Gets the value of the goodType property.
     * 
     * @return
     *     possible object is
     *     {@link GoodType }
     *     
     */
    public GoodType getGoodType() {
        return goodType;
    }

    /**
     * Sets the value of the goodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodType }
     *     
     */
    public void setGoodType(GoodType value) {
        this.goodType = value;
    }

}
