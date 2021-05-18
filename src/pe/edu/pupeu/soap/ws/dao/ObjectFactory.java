
package pe.edu.pupeu.soap.ws.dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.pupeu.soap.ws.dao package. 
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

    private final static QName _ReadCliente_QNAME = new QName("http://dao.ws.soap.pupeu.edu.pe/", "readCliente");
    private final static QName _ReadClienteResponse_QNAME = new QName("http://dao.ws.soap.pupeu.edu.pe/", "readClienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.pupeu.soap.ws.dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadClienteResponse }
     * 
     */
    public ReadClienteResponse createReadClienteResponse() {
        return new ReadClienteResponse();
    }

    /**
     * Create an instance of {@link ReadCliente }
     * 
     */
    public ReadCliente createReadCliente() {
        return new ReadCliente();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.ws.soap.pupeu.edu.pe/", name = "readCliente")
    public JAXBElement<ReadCliente> createReadCliente(ReadCliente value) {
        return new JAXBElement<ReadCliente>(_ReadCliente_QNAME, ReadCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.ws.soap.pupeu.edu.pe/", name = "readClienteResponse")
    public JAXBElement<ReadClienteResponse> createReadClienteResponse(ReadClienteResponse value) {
        return new JAXBElement<ReadClienteResponse>(_ReadClienteResponse_QNAME, ReadClienteResponse.class, null, value);
    }

}
