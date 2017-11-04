
package com.baosight.sts.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMbSaleDailyModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMbSaleDailyModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MbSaleDailyModel" type="{http://domain.ws.st.sts.baosight.com}MbSaleDailyModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMbSaleDailyModel", propOrder = {
    "mbSaleDailyModel"
})
public class ArrayOfMbSaleDailyModel {

    @XmlElement(name = "MbSaleDailyModel", nillable = true)
    protected List<MbSaleDailyModel> mbSaleDailyModel;

    /**
     * Gets the value of the mbSaleDailyModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mbSaleDailyModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMbSaleDailyModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MbSaleDailyModel }
     * 
     * 
     */
    public List<MbSaleDailyModel> getMbSaleDailyModel() {
        if (mbSaleDailyModel == null) {
            mbSaleDailyModel = new ArrayList<MbSaleDailyModel>();
        }
        return this.mbSaleDailyModel;
    }

}
