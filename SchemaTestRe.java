package logic.misc;



import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
  * custom error handler while validating xml against xsd
  */
public class SchemaTestRe {

              static List<SAXParseException> exceptions = null;
              
              static{
            	  SchemaTestRe.exceptions = new LinkedList<SAXParseException>();
              }
              
    public static String xml =
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<ndNotices>\n" +
                             "<metaData>\n" +
                                           "<caseNum>123455</caseNum>\n" +
                                           "<templateName>5345</templateName>\n" +
                                           "<jobName></jobName>\n" +
                             "</metaData>\n" +
            "</ndNotices>";
    
    private static void handleMessage(SAXParseException exception) throws SAXException {
              int lineNumber = exception.getLineNumber();
                      int columnNumber = exception.getColumnNumber();
                      String message = exception.getMessage();
                      System.out.print("[ XSD Validation Error ]:: line number: " + lineNumber + " column number: " + columnNumber + " message: " + message +"\n");

    }

    public static void main(String... args) {
        try {
            System.out.println("Custom Error Handler while Validating XML against XSD");
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(SchemaTestRe.class.getResource("schema.xsd"));
            Validator validator = schema.newValidator();
            validator.setErrorHandler(new ErrorHandler(){
             @Override
                public void warning(SAXParseException exception) throws SAXException{
                  exceptions.add(exception);
                }

                @Override
                public void fatalError(SAXParseException exception) throws SAXException{
                  exceptions.add(exception);
                }

                @Override
                public void error(SAXParseException exception) throws SAXException{
                  exceptions.add(exception);
                }
            });
            validator.validate(new StreamSource(new StringReader(xml)));
            if(SchemaTestRe.exceptions.size()>0){
              for(SAXParseException exception: SchemaTestRe.exceptions){
            	  SchemaTestRe.handleMessage(exception);
              }
            }else{
              System.out.println("Validation is successful");
            }
            
        } catch (IOException e) {
            // handle exception while reading source
        } catch (SAXException e) {
            System.out.println("Fatal Error: " + e.getMessage());
        } 
    }
}
