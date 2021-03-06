package com.example.chinalawtranslate.serviceimpl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.example.chinalawtranslate.service.DocService;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2021-10-25T22:00:22.387+08:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "DocServiceImplService",
                  wsdlLocation = "http://127.0.0.1:8000/ws/doc?wsdl",
                  targetNamespace = "http://serviceImpl.chinalawtranslate.example.com/")
public class DocServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://serviceImpl.chinalawtranslate.example.com/", "DocServiceImplService");
    public final static QName DocServiceImplPort = new QName("http://serviceImpl.chinalawtranslate.example.com/", "DocServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8000/ws/doc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DocServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:8000/ws/doc?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DocServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DocServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DocServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DocServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DocServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DocServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns DocService
     */
    @WebEndpoint(name = "DocServiceImplPort")
    public DocService getDocServiceImplPort() {
        return super.getPort(DocServiceImplPort, DocService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DocService
     */
    @WebEndpoint(name = "DocServiceImplPort")
    public DocService getDocServiceImplPort(WebServiceFeature... features) {
        return super.getPort(DocServiceImplPort, DocService.class, features);
    }

}
