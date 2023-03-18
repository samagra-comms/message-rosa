package messagerosa.xml;

import messagerosa.core.model.XMessage;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.InputStream;

/**
 * @author chakshu
 * @author umang
 */

public class XMessageParser {

    public static JAXBContext context;
    public static Unmarshaller jaxbUnmarshaller;

    static {
        try {
            context = JAXBContext.newInstance(XMessage.class);
            jaxbUnmarshaller = context.createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static XMessage parse(InputStream stream) throws JAXBException {
        return (XMessage) jaxbUnmarshaller.unmarshal(stream);
    }
}

