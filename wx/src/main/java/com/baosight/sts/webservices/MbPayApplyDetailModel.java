
package com.baosight.sts.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MbPayApplyDetailModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MbPayApplyDetailModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applyAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="purContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MbPayApplyDetailModel", propOrder = {
    "applyAmount",
    "purContractId"
})
public class MbPayApplyDetailModel {

    @XmlElementRef(name = "applyAmount", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> applyAmount;
    @XmlElementRef(name = "purContractId", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purContractId;

    /**
     * ��ȡapplyAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getApplyAmount() {
        return applyAmount;
    }

    /**
     * ����applyAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setApplyAmount(JAXBElement<Double> value) {
        this.applyAmount = value;
    }

    /**
     * ��ȡpurContractId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurContractId() {
        return purContractId;
    }

    /**
     * ����purContractId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurContractId(JAXBElement<String> value) {
        this.purContractId = value;
    }

}
