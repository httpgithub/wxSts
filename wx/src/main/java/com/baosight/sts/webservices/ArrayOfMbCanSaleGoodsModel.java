
package com.baosight.sts.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMbCanSaleGoodsModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMbCanSaleGoodsModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MbCanSaleGoodsModel" type="{http://domain.ws.st.sts.baosight.com}MbCanSaleGoodsModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMbCanSaleGoodsModel", propOrder = {
    "mbCanSaleGoodsModel"
})
public class ArrayOfMbCanSaleGoodsModel {

    @XmlElement(name = "MbCanSaleGoodsModel", nillable = true)
    protected List<MbCanSaleGoodsModel> mbCanSaleGoodsModel;

    /**
     * Gets the value of the mbCanSaleGoodsModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mbCanSaleGoodsModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMbCanSaleGoodsModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MbCanSaleGoodsModel }
     * 
     * 
     */
    public List<MbCanSaleGoodsModel> getMbCanSaleGoodsModel() {
        if (mbCanSaleGoodsModel == null) {
            mbCanSaleGoodsModel = new ArrayList<MbCanSaleGoodsModel>();
        }
        return this.mbCanSaleGoodsModel;
    }

}
