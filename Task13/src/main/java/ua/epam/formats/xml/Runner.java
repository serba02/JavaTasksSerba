package ua.epam.formats.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;



/**
 * Created by Bredok on 06.10.2016.
 */
public class Runner {

    public static void main(String[] args) throws Exception {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(Runner.class.getResourceAsStream("/Actors.xml"));

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();

        XPathExpression expr = xpath.compile("/actors/list/item[@id=4]/name");
        String result = (String) expr.evaluate(document, XPathConstants.STRING);
        System.out.println(result);

        XPathExpression expr2 = xpath.compile("/actors/list/item[name='Петр']/expirience");
        String result2 = (String) expr2.evaluate(document, XPathConstants.STRING);
        System.out.println(result2);
        System.out.println();

        XPathExpression expr3 = xpath.compile("/actors/list/item[5]/surname");
        String result3 = (String) expr3.evaluate(document, XPathConstants.STRING);
        System.out.println(result3);
        System.out.println();

        XPathExpression exprList = xpath.compile("/actors/list/item");
        NodeList nodeList = (NodeList) exprList.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element elem = (Element) nodeList.item(i);
            System.out.println(elem.getAttribute("id"));
            System.out.println(elem.getElementsByTagName("name")
                    .item(0).getFirstChild().getNodeValue()
                    + " " + elem.getElementsByTagName("surname")
                    .item(0).getFirstChild().getNodeValue()
                    + " " + elem.getElementsByTagName("expirience")
                    .item(0).getFirstChild().getNodeValue());
        }
    }

}
