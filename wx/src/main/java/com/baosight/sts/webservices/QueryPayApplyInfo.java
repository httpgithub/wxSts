
package com.baosight.sts.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="in0" type="{http://domain.ws.st.sts.baosight.com}MbPayApplyQueryModel"/&gt;
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
    "in0"
})
@XmlRootElement(name = "queryPayApplyInfo", namespace = "http://service.ws.st.sts.baosight.com")
public class QueryPayApplyInfo {

    @XmlElement(namespace = "http://service.ws.st.sts.baosight.com", required = true, nillable = true)
    protected MbPayApplyQueryModel in0;

    /**
     * ��ȡin0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MbPayApplyQueryModel }
     *     
     */
    public MbPayApplyQueryModel getIn0() {
        return in0;
    }

    /**
     * ����in0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MbPayApplyQueryModel }
     *     
     */
    public void setIn0(MbPayApplyQueryModel value) {
        this.in0 = value;
    }

}