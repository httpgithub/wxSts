
package com.baosight.sts.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MbCanSaleGoodsQueryModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MbCanSaleGoodsQueryModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mnemonicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MbCanSaleGoodsQueryModel", propOrder = {
    "mnemonicCode",
    "segNo"
})
public class MbCanSaleGoodsQueryModel {

    @XmlElementRef(name = "mnemonicCode", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mnemonicCode;
    @XmlElementRef(name = "segNo", namespace = "http://domain.ws.st.sts.baosight.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segNo;

    /**
     * ��ȡmnemonicCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMnemonicCode() {
        return mnemonicCode;
    }

    /**
     * ����mnemonicCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMnemonicCode(JAXBElement<String> value) {
        this.mnemonicCode = value;
    }

    /**
     * ��ȡsegNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegNo() {
        return segNo;
    }

    /**
     * ����segNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegNo(JAXBElement<String> value) {
        this.segNo = value;
    }

}
