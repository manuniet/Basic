package logic.misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;

public class XMLFormat {
	 
	
	 static Source xmlFile = new StreamSource(new File("C:/Users/manochauhan/Desktop/test.xml"));
	
	public static void main(String[] args) throws Exception {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		dbf.setValidating(false);

		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new FileInputStream(new File("C:/Users/manochauhan/Desktop/test.xml")));
		
		prettyPrint(xmlFile);

	}

	public static final void prettyPrint(Source xmlFile2) throws Exception {

		Transformer tf = TransformerFactory.newInstance().newTransformer();

		tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

		tf.setOutputProperty(OutputKeys.INDENT, "yes");

		Writer out = new StringWriter();

		tf.transform(xmlFile, new StreamResult(out));

		System.out.println(out.toString());

	}

}
