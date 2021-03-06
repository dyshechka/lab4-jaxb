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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://martha.qweert.ru}item">
 *       &lt;sequence>
 *         &lt;element name="codeWord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loanProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tradePoint" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="incomeType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="monthlyIncome" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="initialPayment" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="loanTerm" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="transferClaimAgree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="goods" type="{http://martha.qweert.ru}goodsType"/>
 *         &lt;element name="person" type="{http://martha.qweert.ru}person"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codeWord",
    "loanProductId",
    "tradePoint",
    "incomeType",
    "monthlyIncome",
    "initialPayment",
    "loanTerm",
    "transferClaimAgree",
    "goods",
    "person"
})
@XmlRootElement(name = "application")
public class Application
    extends Item
{

    @XmlElement(required = true)
    protected String codeWord;
    @XmlElement(required = true)
    protected String loanProductId;
    @XmlElement(required = true)
    protected BigInteger tradePoint;
    @XmlElement(required = true)
    protected BigInteger incomeType;
    @XmlElement(required = true)
    protected BigInteger monthlyIncome;
    @XmlElement(required = true)
    protected BigInteger initialPayment;
    @XmlElement(required = true)
    protected BigInteger loanTerm;
    protected boolean transferClaimAgree;
    @XmlElement(required = true)
    protected GoodsType goods;
    @XmlElement(required = true)
    protected Person person;

    /**
     * Gets the value of the codeWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeWord() {
        return codeWord;
    }

    /**
     * Sets the value of the codeWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeWord(String value) {
        this.codeWord = value;
    }

    /**
     * Gets the value of the loanProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanProductId() {
        return loanProductId;
    }

    /**
     * Sets the value of the loanProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanProductId(String value) {
        this.loanProductId = value;
    }

    /**
     * Gets the value of the tradePoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTradePoint() {
        return tradePoint;
    }

    /**
     * Sets the value of the tradePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTradePoint(BigInteger value) {
        this.tradePoint = value;
    }

    /**
     * Gets the value of the incomeType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncomeType() {
        return incomeType;
    }

    /**
     * Sets the value of the incomeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncomeType(BigInteger value) {
        this.incomeType = value;
    }

    /**
     * Gets the value of the monthlyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyIncome() {
        return monthlyIncome;
    }

    /**
     * Sets the value of the monthlyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyIncome(BigInteger value) {
        this.monthlyIncome = value;
    }

    /**
     * Gets the value of the initialPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInitialPayment() {
        return initialPayment;
    }

    /**
     * Sets the value of the initialPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInitialPayment(BigInteger value) {
        this.initialPayment = value;
    }

    /**
     * Gets the value of the loanTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoanTerm() {
        return loanTerm;
    }

    /**
     * Sets the value of the loanTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoanTerm(BigInteger value) {
        this.loanTerm = value;
    }

    /**
     * Gets the value of the transferClaimAgree property.
     * 
     */
    public boolean isTransferClaimAgree() {
        return transferClaimAgree;
    }

    /**
     * Sets the value of the transferClaimAgree property.
     * 
     */
    public void setTransferClaimAgree(boolean value) {
        this.transferClaimAgree = value;
    }

    /**
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsType }
     *     
     */
    public GoodsType getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsType }
     *     
     */
    public void setGoods(GoodsType value) {
        this.goods = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
