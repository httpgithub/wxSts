
package com.baosight.sts.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MbSaleDailyModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MbSaleDailyModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saleAmountAt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shopsign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weightQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MbSaleDailyModel", propOrder = {
    "customerName",
    "productTypeName",
    "saleAmountAt",
    "shopsign",
    "spec",
    "weightQty"
})
public class MbSaleDailyModel {

    @XmlElementRef(name = "customerName", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerName;
    @XmlElementRef(name = "productTypeName", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productTypeName;
    @XmlElementRef(name = "saleAmountAt", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> saleAmountAt;
    @XmlElementRef(name = "shopsign", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shopsign;
    @XmlElementRef(name = "spec", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spec;
    @XmlElementRef(name = "weightQty", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> weightQty;

    /**
     * ��ȡcustomerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerName() {
        return customerName;
    }

    /**
     * ����customerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerName(JAXBElement<String> value) {
        this.customerName = value;
    }

    /**
     * ��ȡproductTypeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductTypeName() {
        return productTypeName;
    }

    /**
     * ����productTypeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductTypeName(JAXBElement<String> value) {
        this.productTypeName = value;
    }

    /**
     * ��ȡsaleAmountAt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSaleAmountAt() {
        return saleAmountAt;
    }

    /**
     * ����saleAmountAt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSaleAmountAt(JAXBElement<Double> value) {
        this.saleAmountAt = value;
    }

    /**
     * ��ȡshopsign���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShopsign() {
        return shopsign;
    }

    /**
     * ����shopsign���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShopsign(JAXBElement<String> value) {
        this.shopsign = value;
    }

    /**
     * ��ȡspec���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpec() {
        return spec;
    }

    /**
     * ����spec���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpec(JAXBElement<String> value) {
        this.spec = value;
    }

    /**
     * ��ȡweightQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getWeightQty() {
        return weightQty;
    }

    /**
     * ����weightQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setWeightQty(JAXBElement<Double> value) {
        this.weightQty = value;
    }

}
