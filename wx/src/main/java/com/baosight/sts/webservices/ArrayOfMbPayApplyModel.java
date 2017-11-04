
package com.baosight.sts.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMbPayApplyModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMbPayApplyModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MbPayApplyModel" type="{http://domain.ws.st.sts.baosight.com}MbPayApplyModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMbPayApplyModel", propOrder = {
    "mbPayApplyModel"
})
public class ArrayOfMbPayApplyModel {

    @XmlElement(name = "MbPayApplyModel", nillable = true)
    protected List<MbPayApplyModel> mbPayApplyModel;

    /**
     * Gets the value of the mbPayApplyModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mbPayApplyModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMbPayApplyModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MbPayApplyModel }
     * 
     * 
     */
    public List<MbPayApplyModel> getMbPayApplyModel() {
        if (mbPayApplyModel == null) {
            mbPayApplyModel = new ArrayList<MbPayApplyModel>();
        }
        return this.mbPayApplyModel;
    }

}
