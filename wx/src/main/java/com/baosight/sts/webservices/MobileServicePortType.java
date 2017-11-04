package com.baosight.sts.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-11-02T19:46:55.605+08:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://service.ws.st.sts.baosight.com", name = "MobileServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface MobileServicePortType {

    @WebMethod
    @RequestWrapper(localName = "payApplyResultInfo", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.PayApplyResultInfo")
    @ResponseWrapper(localName = "payApplyResultInfoResponse", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.PayApplyResultInfoResponse")
    @WebResult(name = "out", targetNamespace = "http://service.ws.st.sts.baosight.com")
    public com.baosight.sts.webservices.MbApplyResultModel payApplyResultInfo(
        @WebParam(name = "in0", targetNamespace = "http://service.ws.st.sts.baosight.com")
        com.baosight.sts.webservices.MbPayApplyResultModel in0
    );

    @WebMethod
    @RequestWrapper(localName = "queryPayApplyInfo", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.QueryPayApplyInfo")
    @ResponseWrapper(localName = "queryPayApplyInfoResponse", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.QueryPayApplyInfoResponse")
    @WebResult(name = "out", targetNamespace = "http://service.ws.st.sts.baosight.com")
    public com.baosight.sts.webservices.ArrayOfMbPayApplyModel queryPayApplyInfo(
        @WebParam(name = "in0", targetNamespace = "http://service.ws.st.sts.baosight.com")
        com.baosight.sts.webservices.MbPayApplyQueryModel in0
    );

    @WebMethod
    @RequestWrapper(localName = "login", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.LoginResponse")
    @WebResult(name = "out", targetNamespace = "http://service.ws.st.sts.baosight.com")
    public java.lang.String login(
        @WebParam(name = "in0", targetNamespace = "http://service.ws.st.sts.baosight.com")
        java.lang.String in0
    );

    @WebMethod
    @RequestWrapper(localName = "queryCanSaleGoodsInfo", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.QueryCanSaleGoodsInfo")
    @ResponseWrapper(localName = "queryCanSaleGoodsInfoResponse", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.QueryCanSaleGoodsInfoResponse")
    @WebResult(name = "out", targetNamespace = "http://service.ws.st.sts.baosight.com")
    public com.baosight.sts.webservices.ArrayOfMbCanSaleGoodsModel queryCanSaleGoodsInfo(
        @WebParam(name = "in0", targetNamespace = "http://service.ws.st.sts.baosight.com")
        com.baosight.sts.webservices.MbCanSaleGoodsQueryModel in0
    );

    @WebMethod
    @RequestWrapper(localName = "querySaleDailyInfo", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.QuerySaleDailyInfo")
    @ResponseWrapper(localName = "querySaleDailyInfoResponse", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.QuerySaleDailyInfoResponse")
    @WebResult(name = "out", targetNamespace = "http://service.ws.st.sts.baosight.com")
    public com.baosight.sts.webservices.ArrayOfMbSaleDailyModel querySaleDailyInfo(
        @WebParam(name = "in0", targetNamespace = "http://service.ws.st.sts.baosight.com")
        com.baosight.sts.webservices.MbDailyQueryModel in0
    );

    @WebMethod
    @RequestWrapper(localName = "queryPurDailyInfo", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.QueryPurDailyInfo")
    @ResponseWrapper(localName = "queryPurDailyInfoResponse", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.QueryPurDailyInfoResponse")
    @WebResult(name = "out", targetNamespace = "http://service.ws.st.sts.baosight.com")
    public com.baosight.sts.webservices.ArrayOfMbPurDailyModel queryPurDailyInfo(
        @WebParam(name = "in0", targetNamespace = "http://service.ws.st.sts.baosight.com")
        com.baosight.sts.webservices.MbDailyQueryModel in0
    );

    @WebMethod
    @RequestWrapper(localName = "querySTRP0304", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.QuerySTRP0304")
    @ResponseWrapper(localName = "querySTRP0304Response", targetNamespace = "http://service.ws.st.sts.baosight.com", className = "com.baosight.sts.webservices.QuerySTRP0304Response")
    @WebResult(name = "out", targetNamespace = "http://service.ws.st.sts.baosight.com")
    public com.baosight.sts.webservices.PageResultDto querySTRP0304(
        @WebParam(name = "in0", targetNamespace = "http://service.ws.st.sts.baosight.com")
        com.baosight.sts.webservices.PageSearchDto in0
    );
}