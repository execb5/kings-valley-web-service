
package kingsvalleyws_client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "KingsValleyWS", targetNamespace = "http://kingsvalley.marina.org/", wsdlLocation = "http://localhost:8080/KingsValleyWS/KingsValleyWS?wsdl")
public class KingsValleyWS_Service
    extends Service
{

    private final static URL KINGSVALLEYWS_WSDL_LOCATION;
    private final static WebServiceException KINGSVALLEYWS_EXCEPTION;
    private final static QName KINGSVALLEYWS_QNAME = new QName("http://kingsvalley.marina.org/", "KingsValleyWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/KingsValleyWS/KingsValleyWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        KINGSVALLEYWS_WSDL_LOCATION = url;
        KINGSVALLEYWS_EXCEPTION = e;
    }

    public KingsValleyWS_Service() {
        super(__getWsdlLocation(), KINGSVALLEYWS_QNAME);
    }

    public KingsValleyWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), KINGSVALLEYWS_QNAME, features);
    }

    public KingsValleyWS_Service(URL wsdlLocation) {
        super(wsdlLocation, KINGSVALLEYWS_QNAME);
    }

    public KingsValleyWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, KINGSVALLEYWS_QNAME, features);
    }

    public KingsValleyWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KingsValleyWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns KingsValleyWS
     */
    @WebEndpoint(name = "KingsValleyWSPort")
    public KingsValleyWS getKingsValleyWSPort() {
        return super.getPort(new QName("http://kingsvalley.marina.org/", "KingsValleyWSPort"), KingsValleyWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KingsValleyWS
     */
    @WebEndpoint(name = "KingsValleyWSPort")
    public KingsValleyWS getKingsValleyWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://kingsvalley.marina.org/", "KingsValleyWSPort"), KingsValleyWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KINGSVALLEYWS_EXCEPTION!= null) {
            throw KINGSVALLEYWS_EXCEPTION;
        }
        return KINGSVALLEYWS_WSDL_LOCATION;
    }

}
