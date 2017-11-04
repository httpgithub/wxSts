
package com.baosight.sts.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MbPayApplyModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MbPayApplyModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applyPers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mbPayApplyDetailModel" type="{http://domain.ws.st.sts.baosight.com}ArrayOfMbPayApplyDetailModel" minOccurs="0"/&gt;
 *         &lt;element name="payApplyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payApplyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalApplyAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MbPayApplyModel", propOrder = {
    "applyDate",
    "applyPers",
    "mbPayApplyDetailModel",
    "payApplyId",
    "payApplyStatus",
    "providerName",
    "totalApplyAmount"
})
public class MbPayApplyModel {

    @XmlElementRef(name = "applyDate", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applyDate;
    @XmlElementRef(name = "applyPers", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applyPers;
    @XmlElementRef(name = "mbPayApplyDetailModel", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMbPayApplyDetailModel> mbPayApplyDetailModel;
    @XmlElementRef(name = "payApplyId", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payApplyId;
    @XmlElementRef(name = "payApplyStatus", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payApplyStatus;
    @XmlElementRef(name = "providerName", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> providerName;
    @XmlElementRef(name = "totalApplyAmount", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalApplyAmount;

    /**
     * 获取applyDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplyDate() {
        return applyDate;
    }

    /**
     * 设置applyDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplyDate(JAXBElement<String> value) {
        this.applyDate = value;
    }

    /**
     * 获取applyPers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplyPers() {
        return applyPers;
    }

    /**
     * 设置applyPers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplyPers(JAXBElement<String> value) {
        this.applyPers = value;
    }

    /**
     * 获取mbPayApplyDetailModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMbPayApplyDetailModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMbPayApplyDetailModel> getMbPayApplyDetailModel() {
        return mbPayApplyDetailModel;
    }

    /**
     * 设置mbPayApplyDetailModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMbPayApplyDetailModel }{@code >}
     *     
     */
    public void setMbPayApplyDetailModel(JAXBElement<ArrayOfMbPayApplyDetailModel> value) {
        this.mbPayApplyDetailModel = value;
    }

    /**
     * 获取payApplyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayApplyId() {
        return payApplyId;
    }

    /**
     * 设置payApplyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayApplyId(JAXBElement<String> value) {
        this.payApplyId = value;
    }

    /**
     * 获取payApplyStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayApplyStatus() {
        return payApplyStatus;
    }

    /**
     * 设置payApplyStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayApplyStatus(JAXBElement<String> value) {
        this.payApplyStatus = value;
    }

    /**
     * 获取providerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProviderName() {
        return providerName;
    }

    /**
     * 设置providerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProviderName(JAXBElement<String> value) {
        this.providerName = value;
    }

    /**
     * 获取totalApplyAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalApplyAmount() {
        return totalApplyAmount;
    }

    /**
     * 设置totalApplyAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalApplyAmount(JAXBElement<Double> value) {
        this.totalApplyAmount = value;
    }

}
