package com.baosight.sts.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-11-02T19:46:55.646+08:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "MobileService", 
                  wsdlLocation = "file:/C:/wxSts/wx/src/main/java/com/baosight/sts/webservices/MobileService.wsdl",
                  targetNamespace = "http://service.ws.st.sts.baosight.com") 
public class MobileService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.ws.st.sts.baosight.com", "MobileService");
    public final static QName MobileServiceHttpPort = new QName("http://service.ws.st.sts.baosight.com", "MobileServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/wxSts/wx/src/main/java/com/baosight/sts/webservices/MobileService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MobileService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/wxSts/wx/src/main/java/com/baosight/sts/webservices/MobileService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MobileService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MobileService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MobileService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MobileService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MobileService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MobileServicePortType
     */
    @WebEndpoint(name = "MobileServiceHttpPort")
    public MobileServicePortType getMobileServiceHttpPort() {
        return super.getPort(MobileServiceHttpPort, MobileServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileServicePortType
     */
    @WebEndpoint(name = "MobileServiceHttpPort")
    public MobileServicePortType getMobileServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(MobileServiceHttpPort, MobileServicePortType.class, features);
    }

}
