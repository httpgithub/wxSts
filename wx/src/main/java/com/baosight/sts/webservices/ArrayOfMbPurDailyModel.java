
package com.baosight.sts.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMbPurDailyModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMbPurDailyModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MbPurDailyModel" type="{http://domain.ws.st.sts.baosight.com}MbPurDailyModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMbPurDailyModel", propOrder = {
    "mbPurDailyModel"
})
public class ArrayOfMbPurDailyModel {

    @XmlElement(name = "MbPurDailyModel", nillable = true)
    protected List<MbPurDailyModel> mbPurDailyModel;

    /**
     * Gets the value of the mbPurDailyModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mbPurDailyModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMbPurDailyModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MbPurDailyModel }
     * 
     * 
     */
    public List<MbPurDailyModel> getMbPurDailyModel() {
        if (mbPurDailyModel == null) {
            mbPurDailyModel = new ArrayList<MbPurDailyModel>();
        }
        return this.mbPurDailyModel;
    }

}
