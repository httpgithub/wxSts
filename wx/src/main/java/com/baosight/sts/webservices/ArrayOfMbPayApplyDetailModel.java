
package com.baosight.sts.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMbPayApplyDetailModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMbPayApplyDetailModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MbPayApplyDetailModel" type="{http://domain.ws.st.sts.baosight.com}MbPayApplyDetailModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMbPayApplyDetailModel", propOrder = {
    "mbPayApplyDetailModel"
})
public class ArrayOfMbPayApplyDetailModel {

    @XmlElement(name = "MbPayApplyDetailModel", nillable = true)
    protected List<MbPayApplyDetailModel> mbPayApplyDetailModel;

    /**
     * Gets the value of the mbPayApplyDetailModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mbPayApplyDetailModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMbPayApplyDetailModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MbPayApplyDetailModel }
     * 
     * 
     */
    public List<MbPayApplyDetailModel> getMbPayApplyDetailModel() {
        if (mbPayApplyDetailModel == null) {
            mbPayApplyDetailModel = new ArrayList<MbPayApplyDetailModel>();
        }
        return this.mbPayApplyDetailModel;
    }

}
