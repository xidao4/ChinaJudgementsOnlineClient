
package com.example.chinalawtranslate.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.chinalawtranslate.service package. 
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

    private final static QName _GetByTitle_QNAME = new QName("http://service.chinalawtranslate.example.com/", "getByTitle");
    private final static QName _GetByTitleResponse_QNAME = new QName("http://service.chinalawtranslate.example.com/", "getByTitleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.chinalawtranslate.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetByTitle }
     * 
     */
    public GetByTitle createGetByTitle() {
        return new GetByTitle();
    }

    /**
     * Create an instance of {@link GetByTitleResponse }
     * 
     */
    public GetByTitleResponse createGetByTitleResponse() {
        return new GetByTitleResponse();
    }

    /**
     * Create an instance of {@link Doc }
     * 
     */
    public Doc createDoc() {
        return new Doc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.chinalawtranslate.example.com/", name = "getByTitle")
    public JAXBElement<GetByTitle> createGetByTitle(GetByTitle value) {
        return new JAXBElement<GetByTitle>(_GetByTitle_QNAME, GetByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.chinalawtranslate.example.com/", name = "getByTitleResponse")
    public JAXBElement<GetByTitleResponse> createGetByTitleResponse(GetByTitleResponse value) {
        return new JAXBElement<GetByTitleResponse>(_GetByTitleResponse_QNAME, GetByTitleResponse.class, null, value);
    }

}
