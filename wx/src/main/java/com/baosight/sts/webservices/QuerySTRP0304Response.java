
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
 *         &lt;element name="out" type="{http://domain.service.ws.st.sts.baosight.com}PageResultDto"/&gt;
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
    "out"
})
@XmlRootElement(name = "querySTRP0304Response", namespace = "http://service.ws.st.sts.baosight.com")
public class QuerySTRP0304Response {

    @XmlElement(namespace = "http://service.ws.st.sts.baosight.com", required = true, nillable = true)
    protected PageResultDto out;

    /**
     * ��ȡout���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PageResultDto }
     *     
     */
    public PageResultDto getOut() {
        return out;
    }

    /**
     * ����out���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PageResultDto }
     *     
     */
    public void setOut(PageResultDto value) {
        this.out = value;
    }

}
