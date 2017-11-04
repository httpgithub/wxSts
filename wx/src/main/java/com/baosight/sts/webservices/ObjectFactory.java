
package com.baosight.sts.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baosight.sts.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PageResultDtoT_QNAME = new QName("http://domain.service.ws.st.sts.baosight.com", "t");
    private final static QName _PageSearchDtoPage_QNAME = new QName("http://domain.service.ws.st.sts.baosight.com", "page");
    private final static QName _PageSearchDtoQueryParam_QNAME = new QName("http://domain.service.ws.st.sts.baosight.com", "queryParam");
    private final static QName _PageSearchDtoSegNo_QNAME = new QName("http://domain.service.ws.st.sts.baosight.com", "segNo");
    private final static QName _PageSearchDtoSort_QNAME = new QName("http://domain.service.ws.st.sts.baosight.com", "sort");
    private final static QName _PageSearchDtoUserClientIp_QNAME = new QName("http://domain.service.ws.st.sts.baosight.com", "userClientIp");
    private final static QName _PageSearchDtoUserId_QNAME = new QName("http://domain.service.ws.st.sts.baosight.com", "userId");
    private final static QName _PageSearchDtoUserName_QNAME = new QName("http://domain.service.ws.st.sts.baosight.com", "userName");
    private final static QName _MbCanSaleGoodsModelCanSaleQty_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "canSaleQty");
    private final static QName _MbCanSaleGoodsModelProductTypeName_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "productTypeName");
    private final static QName _MbCanSaleGoodsModelShopsign_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "shopsign");
    private final static QName _MbCanSaleGoodsModelSpec_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "spec");
    private final static QName _MbCanSaleGoodsModelTotQty_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "totQty");
    private final static QName _MbCanSaleGoodsModelWproviderName_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "wproviderName");
    private final static QName _MbCanSaleGoodsQueryModelMnemonicCode_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "mnemonicCode");
    private final static QName _MbCanSaleGoodsQueryModelSegNo_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "segNo");
    private final static QName _MbSaleDailyModelCustomerName_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "customerName");
    private final static QName _MbSaleDailyModelSaleAmountAt_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "saleAmountAt");
    private final static QName _MbSaleDailyModelWeightQty_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "weightQty");
    private final static QName _MbPurDailyModelProviderName_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "providerName");
    private final static QName _MbPurDailyModelPurAmountAt_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "purAmountAt");
    private final static QName _MbDailyQueryModelEndDate_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "endDate");
    private final static QName _MbDailyQueryModelStartDate_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "startDate");
    private final static QName _MbApplyResultModelApplyDate_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "applyDate");
    private final static QName _MbApplyResultModelApplyResult_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "applyResult");
    private final static QName _MbApplyResultModelProcError_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "procError");
    private final static QName _MbPayApplyResultModelPayApplyId_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "payApplyId");
    private final static QName _MbPayApplyResultModelPayApplyResult_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "payApplyResult");
    private final static QName _MbPayApplyDetailModelApplyAmount_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "applyAmount");
    private final static QName _MbPayApplyDetailModelPurContractId_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "purContractId");
    private final static QName _MbPayApplyModelApplyPers_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "applyPers");
    private final static QName _MbPayApplyModelMbPayApplyDetailModel_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "mbPayApplyDetailModel");
    private final static QName _MbPayApplyModelPayApplyStatus_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "payApplyStatus");
    private final static QName _MbPayApplyModelTotalApplyAmount_QNAME = new QName("http://domain.ws.st.sts.baosight.com", "totalApplyAmount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baosight.sts.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MbPayApplyQueryModel }
     * 
     */
    public MbPayApplyQueryModel createMbPayApplyQueryModel() {
        return new MbPayApplyQueryModel();
    }

    /**
     * Create an instance of {@link ArrayOfMbPayApplyModel }
     * 
     */
    public ArrayOfMbPayApplyModel createArrayOfMbPayApplyModel() {
        return new ArrayOfMbPayApplyModel();
    }

    /**
     * Create an instance of {@link MbPayApplyModel }
     * 
     */
    public MbPayApplyModel createMbPayApplyModel() {
        return new MbPayApplyModel();
    }

    /**
     * Create an instance of {@link ArrayOfMbPayApplyDetailModel }
     * 
     */
    public ArrayOfMbPayApplyDetailModel createArrayOfMbPayApplyDetailModel() {
        return new ArrayOfMbPayApplyDetailModel();
    }

    /**
     * Create an instance of {@link MbPayApplyDetailModel }
     * 
     */
    public MbPayApplyDetailModel createMbPayApplyDetailModel() {
        return new MbPayApplyDetailModel();
    }

    /**
     * Create an instance of {@link MbPayApplyResultModel }
     * 
     */
    public MbPayApplyResultModel createMbPayApplyResultModel() {
        return new MbPayApplyResultModel();
    }

    /**
     * Create an instance of {@link MbApplyResultModel }
     * 
     */
    public MbApplyResultModel createMbApplyResultModel() {
        return new MbApplyResultModel();
    }

    /**
     * Create an instance of {@link MbDailyQueryModel }
     * 
     */
    public MbDailyQueryModel createMbDailyQueryModel() {
        return new MbDailyQueryModel();
    }

    /**
     * Create an instance of {@link ArrayOfMbPurDailyModel }
     * 
     */
    public ArrayOfMbPurDailyModel createArrayOfMbPurDailyModel() {
        return new ArrayOfMbPurDailyModel();
    }

    /**
     * Create an instance of {@link MbPurDailyModel }
     * 
     */
    public MbPurDailyModel createMbPurDailyModel() {
        return new MbPurDailyModel();
    }

    /**
     * Create an instance of {@link ArrayOfMbSaleDailyModel }
     * 
     */
    public ArrayOfMbSaleDailyModel createArrayOfMbSaleDailyModel() {
        return new ArrayOfMbSaleDailyModel();
    }

    /**
     * Create an instance of {@link MbSaleDailyModel }
     * 
     */
    public MbSaleDailyModel createMbSaleDailyModel() {
        return new MbSaleDailyModel();
    }

    /**
     * Create an instance of {@link MbCanSaleGoodsQueryModel }
     * 
     */
    public MbCanSaleGoodsQueryModel createMbCanSaleGoodsQueryModel() {
        return new MbCanSaleGoodsQueryModel();
    }

    /**
     * Create an instance of {@link ArrayOfMbCanSaleGoodsModel }
     * 
     */
    public ArrayOfMbCanSaleGoodsModel createArrayOfMbCanSaleGoodsModel() {
        return new ArrayOfMbCanSaleGoodsModel();
    }

    /**
     * Create an instance of {@link MbCanSaleGoodsModel }
     * 
     */
    public MbCanSaleGoodsModel createMbCanSaleGoodsModel() {
        return new MbCanSaleGoodsModel();
    }

    /**
     * Create an instance of {@link QueryPayApplyInfo }
     * 
     */
    public QueryPayApplyInfo createQueryPayApplyInfo() {
        return new QueryPayApplyInfo();
    }

    /**
     * Create an instance of {@link QueryPayApplyInfoResponse }
     * 
     */
    public QueryPayApplyInfoResponse createQueryPayApplyInfoResponse() {
        return new QueryPayApplyInfoResponse();
    }

    /**
     * Create an instance of {@link PayApplyResultInfo }
     * 
     */
    public PayApplyResultInfo createPayApplyResultInfo() {
        return new PayApplyResultInfo();
    }

    /**
     * Create an instance of {@link PayApplyResultInfoResponse }
     * 
     */
    public PayApplyResultInfoResponse createPayApplyResultInfoResponse() {
        return new PayApplyResultInfoResponse();
    }

    /**
     * Create an instance of {@link QuerySTRP0304 }
     * 
     */
    public QuerySTRP0304 createQuerySTRP0304() {
        return new QuerySTRP0304();
    }

    /**
     * Create an instance of {@link PageSearchDto }
     * 
     */
    public PageSearchDto createPageSearchDto() {
        return new PageSearchDto();
    }

    /**
     * Create an instance of {@link QuerySTRP0304Response }
     * 
     */
    public QuerySTRP0304Response createQuerySTRP0304Response() {
        return new QuerySTRP0304Response();
    }

    /**
     * Create an instance of {@link PageResultDto }
     * 
     */
    public PageResultDto createPageResultDto() {
        return new PageResultDto();
    }

    /**
     * Create an instance of {@link QueryPurDailyInfo }
     * 
     */
    public QueryPurDailyInfo createQueryPurDailyInfo() {
        return new QueryPurDailyInfo();
    }

    /**
     * Create an instance of {@link QueryPurDailyInfoResponse }
     * 
     */
    public QueryPurDailyInfoResponse createQueryPurDailyInfoResponse() {
        return new QueryPurDailyInfoResponse();
    }

    /**
     * Create an instance of {@link QuerySaleDailyInfo }
     * 
     */
    public QuerySaleDailyInfo createQuerySaleDailyInfo() {
        return new QuerySaleDailyInfo();
    }

    /**
     * Create an instance of {@link QuerySaleDailyInfoResponse }
     * 
     */
    public QuerySaleDailyInfoResponse createQuerySaleDailyInfoResponse() {
        return new QuerySaleDailyInfoResponse();
    }

    /**
     * Create an instance of {@link QueryCanSaleGoodsInfo }
     * 
     */
    public QueryCanSaleGoodsInfo createQueryCanSaleGoodsInfo() {
        return new QueryCanSaleGoodsInfo();
    }

    /**
     * Create an instance of {@link QueryCanSaleGoodsInfoResponse }
     * 
     */
    public QueryCanSaleGoodsInfoResponse createQueryCanSaleGoodsInfoResponse() {
        return new QueryCanSaleGoodsInfoResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.service.ws.st.sts.baosight.com", name = "t", scope = PageResultDto.class)
    public JAXBElement<Object> createPageResultDtoT(Object value) {
        return new JAXBElement<Object>(_PageResultDtoT_QNAME, Object.class, PageResultDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.service.ws.st.sts.baosight.com", name = "page", scope = PageSearchDto.class)
    public JAXBElement<String> createPageSearchDtoPage(String value) {
        return new JAXBElement<String>(_PageSearchDtoPage_QNAME, String.class, PageSearchDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.service.ws.st.sts.baosight.com", name = "queryParam", scope = PageSearchDto.class)
    public JAXBElement<Object> createPageSearchDtoQueryParam(Object value) {
        return new JAXBElement<Object>(_PageSearchDtoQueryParam_QNAME, Object.class, PageSearchDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.service.ws.st.sts.baosight.com", name = "segNo", scope = PageSearchDto.class)
    public JAXBElement<String> createPageSearchDtoSegNo(String value) {
        return new JAXBElement<String>(_PageSearchDtoSegNo_QNAME, String.class, PageSearchDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.service.ws.st.sts.baosight.com", name = "sort", scope = PageSearchDto.class)
    public JAXBElement<String> createPageSearchDtoSort(String value) {
        return new JAXBElement<String>(_PageSearchDtoSort_QNAME, String.class, PageSearchDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.service.ws.st.sts.baosight.com", name = "userClientIp", scope = PageSearchDto.class)
    public JAXBElement<String> createPageSearchDtoUserClientIp(String value) {
        return new JAXBElement<String>(_PageSearchDtoUserClientIp_QNAME, String.class, PageSearchDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.service.ws.st.sts.baosight.com", name = "userId", scope = PageSearchDto.class)
    public JAXBElement<String> createPageSearchDtoUserId(String value) {
        return new JAXBElement<String>(_PageSearchDtoUserId_QNAME, String.class, PageSearchDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.service.ws.st.sts.baosight.com", name = "userName", scope = PageSearchDto.class)
    public JAXBElement<String> createPageSearchDtoUserName(String value) {
        return new JAXBElement<String>(_PageSearchDtoUserName_QNAME, String.class, PageSearchDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "canSaleQty", scope = MbCanSaleGoodsModel.class)
    public JAXBElement<Double> createMbCanSaleGoodsModelCanSaleQty(Double value) {
        return new JAXBElement<Double>(_MbCanSaleGoodsModelCanSaleQty_QNAME, Double.class, MbCanSaleGoodsModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "productTypeName", scope = MbCanSaleGoodsModel.class)
    public JAXBElement<String> createMbCanSaleGoodsModelProductTypeName(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsModelProductTypeName_QNAME, String.class, MbCanSaleGoodsModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "shopsign", scope = MbCanSaleGoodsModel.class)
    public JAXBElement<String> createMbCanSaleGoodsModelShopsign(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsModelShopsign_QNAME, String.class, MbCanSaleGoodsModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "spec", scope = MbCanSaleGoodsModel.class)
    public JAXBElement<String> createMbCanSaleGoodsModelSpec(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsModelSpec_QNAME, String.class, MbCanSaleGoodsModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "totQty", scope = MbCanSaleGoodsModel.class)
    public JAXBElement<Double> createMbCanSaleGoodsModelTotQty(Double value) {
        return new JAXBElement<Double>(_MbCanSaleGoodsModelTotQty_QNAME, Double.class, MbCanSaleGoodsModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "wproviderName", scope = MbCanSaleGoodsModel.class)
    public JAXBElement<String> createMbCanSaleGoodsModelWproviderName(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsModelWproviderName_QNAME, String.class, MbCanSaleGoodsModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "mnemonicCode", scope = MbCanSaleGoodsQueryModel.class)
    public JAXBElement<String> createMbCanSaleGoodsQueryModelMnemonicCode(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsQueryModelMnemonicCode_QNAME, String.class, MbCanSaleGoodsQueryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "segNo", scope = MbCanSaleGoodsQueryModel.class)
    public JAXBElement<String> createMbCanSaleGoodsQueryModelSegNo(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsQueryModelSegNo_QNAME, String.class, MbCanSaleGoodsQueryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "customerName", scope = MbSaleDailyModel.class)
    public JAXBElement<String> createMbSaleDailyModelCustomerName(String value) {
        return new JAXBElement<String>(_MbSaleDailyModelCustomerName_QNAME, String.class, MbSaleDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "productTypeName", scope = MbSaleDailyModel.class)
    public JAXBElement<String> createMbSaleDailyModelProductTypeName(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsModelProductTypeName_QNAME, String.class, MbSaleDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "saleAmountAt", scope = MbSaleDailyModel.class)
    public JAXBElement<Double> createMbSaleDailyModelSaleAmountAt(Double value) {
        return new JAXBElement<Double>(_MbSaleDailyModelSaleAmountAt_QNAME, Double.class, MbSaleDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "shopsign", scope = MbSaleDailyModel.class)
    public JAXBElement<String> createMbSaleDailyModelShopsign(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsModelShopsign_QNAME, String.class, MbSaleDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "spec", scope = MbSaleDailyModel.class)
    public JAXBElement<String> createMbSaleDailyModelSpec(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsModelSpec_QNAME, String.class, MbSaleDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "weightQty", scope = MbSaleDailyModel.class)
    public JAXBElement<Double> createMbSaleDailyModelWeightQty(Double value) {
        return new JAXBElement<Double>(_MbSaleDailyModelWeightQty_QNAME, Double.class, MbSaleDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "productTypeName", scope = MbPurDailyModel.class)
    public JAXBElement<String> createMbPurDailyModelProductTypeName(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsModelProductTypeName_QNAME, String.class, MbPurDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "providerName", scope = MbPurDailyModel.class)
    public JAXBElement<String> createMbPurDailyModelProviderName(String value) {
        return new JAXBElement<String>(_MbPurDailyModelProviderName_QNAME, String.class, MbPurDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "purAmountAt", scope = MbPurDailyModel.class)
    public JAXBElement<Double> createMbPurDailyModelPurAmountAt(Double value) {
        return new JAXBElement<Double>(_MbPurDailyModelPurAmountAt_QNAME, Double.class, MbPurDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "shopsign", scope = MbPurDailyModel.class)
    public JAXBElement<String> createMbPurDailyModelShopsign(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsModelShopsign_QNAME, String.class, MbPurDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "spec", scope = MbPurDailyModel.class)
    public JAXBElement<String> createMbPurDailyModelSpec(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsModelSpec_QNAME, String.class, MbPurDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "weightQty", scope = MbPurDailyModel.class)
    public JAXBElement<Double> createMbPurDailyModelWeightQty(Double value) {
        return new JAXBElement<Double>(_MbSaleDailyModelWeightQty_QNAME, Double.class, MbPurDailyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "endDate", scope = MbDailyQueryModel.class)
    public JAXBElement<String> createMbDailyQueryModelEndDate(String value) {
        return new JAXBElement<String>(_MbDailyQueryModelEndDate_QNAME, String.class, MbDailyQueryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "segNo", scope = MbDailyQueryModel.class)
    public JAXBElement<String> createMbDailyQueryModelSegNo(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsQueryModelSegNo_QNAME, String.class, MbDailyQueryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "startDate", scope = MbDailyQueryModel.class)
    public JAXBElement<String> createMbDailyQueryModelStartDate(String value) {
        return new JAXBElement<String>(_MbDailyQueryModelStartDate_QNAME, String.class, MbDailyQueryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "applyDate", scope = MbApplyResultModel.class)
    public JAXBElement<String> createMbApplyResultModelApplyDate(String value) {
        return new JAXBElement<String>(_MbApplyResultModelApplyDate_QNAME, String.class, MbApplyResultModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "applyResult", scope = MbApplyResultModel.class)
    public JAXBElement<String> createMbApplyResultModelApplyResult(String value) {
        return new JAXBElement<String>(_MbApplyResultModelApplyResult_QNAME, String.class, MbApplyResultModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "procError", scope = MbApplyResultModel.class)
    public JAXBElement<String> createMbApplyResultModelProcError(String value) {
        return new JAXBElement<String>(_MbApplyResultModelProcError_QNAME, String.class, MbApplyResultModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "payApplyId", scope = MbPayApplyResultModel.class)
    public JAXBElement<String> createMbPayApplyResultModelPayApplyId(String value) {
        return new JAXBElement<String>(_MbPayApplyResultModelPayApplyId_QNAME, String.class, MbPayApplyResultModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "payApplyResult", scope = MbPayApplyResultModel.class)
    public JAXBElement<String> createMbPayApplyResultModelPayApplyResult(String value) {
        return new JAXBElement<String>(_MbPayApplyResultModelPayApplyResult_QNAME, String.class, MbPayApplyResultModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "segNo", scope = MbPayApplyResultModel.class)
    public JAXBElement<String> createMbPayApplyResultModelSegNo(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsQueryModelSegNo_QNAME, String.class, MbPayApplyResultModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "applyAmount", scope = MbPayApplyDetailModel.class)
    public JAXBElement<Double> createMbPayApplyDetailModelApplyAmount(Double value) {
        return new JAXBElement<Double>(_MbPayApplyDetailModelApplyAmount_QNAME, Double.class, MbPayApplyDetailModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "purContractId", scope = MbPayApplyDetailModel.class)
    public JAXBElement<String> createMbPayApplyDetailModelPurContractId(String value) {
        return new JAXBElement<String>(_MbPayApplyDetailModelPurContractId_QNAME, String.class, MbPayApplyDetailModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "applyDate", scope = MbPayApplyModel.class)
    public JAXBElement<String> createMbPayApplyModelApplyDate(String value) {
        return new JAXBElement<String>(_MbApplyResultModelApplyDate_QNAME, String.class, MbPayApplyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "applyPers", scope = MbPayApplyModel.class)
    public JAXBElement<String> createMbPayApplyModelApplyPers(String value) {
        return new JAXBElement<String>(_MbPayApplyModelApplyPers_QNAME, String.class, MbPayApplyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMbPayApplyDetailModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "mbPayApplyDetailModel", scope = MbPayApplyModel.class)
    public JAXBElement<ArrayOfMbPayApplyDetailModel> createMbPayApplyModelMbPayApplyDetailModel(ArrayOfMbPayApplyDetailModel value) {
        return new JAXBElement<ArrayOfMbPayApplyDetailModel>(_MbPayApplyModelMbPayApplyDetailModel_QNAME, ArrayOfMbPayApplyDetailModel.class, MbPayApplyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "payApplyId", scope = MbPayApplyModel.class)
    public JAXBElement<String> createMbPayApplyModelPayApplyId(String value) {
        return new JAXBElement<String>(_MbPayApplyResultModelPayApplyId_QNAME, String.class, MbPayApplyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "payApplyStatus", scope = MbPayApplyModel.class)
    public JAXBElement<String> createMbPayApplyModelPayApplyStatus(String value) {
        return new JAXBElement<String>(_MbPayApplyModelPayApplyStatus_QNAME, String.class, MbPayApplyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "providerName", scope = MbPayApplyModel.class)
    public JAXBElement<String> createMbPayApplyModelProviderName(String value) {
        return new JAXBElement<String>(_MbPurDailyModelProviderName_QNAME, String.class, MbPayApplyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "totalApplyAmount", scope = MbPayApplyModel.class)
    public JAXBElement<Double> createMbPayApplyModelTotalApplyAmount(Double value) {
        return new JAXBElement<Double>(_MbPayApplyModelTotalApplyAmount_QNAME, Double.class, MbPayApplyModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "mnemonicCode", scope = MbPayApplyQueryModel.class)
    public JAXBElement<String> createMbPayApplyQueryModelMnemonicCode(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsQueryModelMnemonicCode_QNAME, String.class, MbPayApplyQueryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "purContractId", scope = MbPayApplyQueryModel.class)
    public JAXBElement<String> createMbPayApplyQueryModelPurContractId(String value) {
        return new JAXBElement<String>(_MbPayApplyDetailModelPurContractId_QNAME, String.class, MbPayApplyQueryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.ws.st.sts.baosight.com", name = "segNo", scope = MbPayApplyQueryModel.class)
    public JAXBElement<String> createMbPayApplyQueryModelSegNo(String value) {
        return new JAXBElement<String>(_MbCanSaleGoodsQueryModelSegNo_QNAME, String.class, MbPayApplyQueryModel.class, value);
    }

}
