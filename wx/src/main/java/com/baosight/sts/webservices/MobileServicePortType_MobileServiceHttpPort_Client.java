
package com.baosight.sts.webservices;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-11-02T19:46:55.277+08:00
 * Generated source version: 3.1.7
 * 
 */
public final class MobileServicePortType_MobileServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.ws.st.sts.baosight.com", "MobileService");

    private MobileServicePortType_MobileServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MobileService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        MobileService ss = new MobileService(wsdlURL, SERVICE_NAME);
        MobileServicePortType port = ss.getMobileServiceHttpPort();  
        
        {
        System.out.println("Invoking payApplyResultInfo...");
        com.baosight.sts.webservices.MbPayApplyResultModel _payApplyResultInfo_in0 = new com.baosight.sts.webservices.MbPayApplyResultModel();
        com.baosight.sts.webservices.MbApplyResultModel _payApplyResultInfo__return = port.payApplyResultInfo(_payApplyResultInfo_in0);
        System.out.println("payApplyResultInfo.result=" + _payApplyResultInfo__return);


        }
        {
        System.out.println("Invoking queryPayApplyInfo...");
        com.baosight.sts.webservices.MbPayApplyQueryModel _queryPayApplyInfo_in0 = new com.baosight.sts.webservices.MbPayApplyQueryModel();
        com.baosight.sts.webservices.ArrayOfMbPayApplyModel _queryPayApplyInfo__return = port.queryPayApplyInfo(_queryPayApplyInfo_in0);
        System.out.println("queryPayApplyInfo.result=" + _queryPayApplyInfo__return);


        }
        {
        System.out.println("Invoking login...");
        java.lang.String _login_in0 = "";
        java.lang.String _login__return = port.login(_login_in0);
        System.out.println("login.result=" + _login__return);


        }
        {
        System.out.println("Invoking queryCanSaleGoodsInfo...");
        com.baosight.sts.webservices.MbCanSaleGoodsQueryModel _queryCanSaleGoodsInfo_in0 = new com.baosight.sts.webservices.MbCanSaleGoodsQueryModel();
        com.baosight.sts.webservices.ArrayOfMbCanSaleGoodsModel _queryCanSaleGoodsInfo__return = port.queryCanSaleGoodsInfo(_queryCanSaleGoodsInfo_in0);
        System.out.println("queryCanSaleGoodsInfo.result=" + _queryCanSaleGoodsInfo__return);


        }
        {
        System.out.println("Invoking querySaleDailyInfo...");
        com.baosight.sts.webservices.MbDailyQueryModel _querySaleDailyInfo_in0 = new com.baosight.sts.webservices.MbDailyQueryModel();
        com.baosight.sts.webservices.ArrayOfMbSaleDailyModel _querySaleDailyInfo__return = port.querySaleDailyInfo(_querySaleDailyInfo_in0);
        System.out.println("querySaleDailyInfo.result=" + _querySaleDailyInfo__return);


        }
        {
        System.out.println("Invoking queryPurDailyInfo...");
        com.baosight.sts.webservices.MbDailyQueryModel _queryPurDailyInfo_in0 = new com.baosight.sts.webservices.MbDailyQueryModel();
        com.baosight.sts.webservices.ArrayOfMbPurDailyModel _queryPurDailyInfo__return = port.queryPurDailyInfo(_queryPurDailyInfo_in0);
        System.out.println("queryPurDailyInfo.result=" + _queryPurDailyInfo__return);


        }
        {
        System.out.println("Invoking querySTRP0304...");
        com.baosight.sts.webservices.PageSearchDto _querySTRP0304_in0 = null;
        com.baosight.sts.webservices.PageResultDto _querySTRP0304__return = port.querySTRP0304(_querySTRP0304_in0);
        System.out.println("querySTRP0304.result=" + _querySTRP0304__return);


        }

        System.exit(0);
    }

}