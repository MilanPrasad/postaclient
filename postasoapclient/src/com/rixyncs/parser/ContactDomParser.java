package com.rixyncs.parser;

import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.google.common.base.Strings;
import com.rixyncs.bean.Contact;


/*Convert Contact Xml data of Zoho into ArrayList*/

public class ContactDomParser {
	
	public ArrayList<Contact> contactList = new ArrayList<>();

	/*public static void main(String argv[]) {
		
		
		ContactDomParser contactDomParser = new ContactDomParser();
		
		StringBuffer xmlString = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
		xmlString.append("<response uri=\"/crm/private/xml/Accounts/searchRecords\">");
		xmlString.append("<result>");
		xmlString.append("<Contacts>");
		xmlString.append("<row no=\"1\">");
		xmlString.append("<FL val=\"CONTACTID\">2440108000001077001</FL>");
		xmlString.append("<FL val=\"ACCOUNTID\">null</FL>");
		xmlString.append("<FL val=\"Account Name\"><![CDATA[Bishnu]]></FL>");
		xmlString.append("<FL val=\"Email\"><![CDATA[null]]></FL>");
		xmlString.append("<FL val=\"Salesperson Code\"><![CDATA[null]]></FL>");
		xmlString.append("</row>");
		xmlString.append("</Contacts>");
		xmlString.append("</result>");
		xmlString.append("</response>");
		
		ArrayList<Contact> listOfContact= contactDomParser.pasrse(xmlString.toString());
		
		System.out.println("size = "+listOfContact.size());
		System.out.println("Account Name retrive===="+listOfContact.get(0).getAccountname());
		
		
		
	}*/
	
	public ArrayList<Contact> pasrse(String xmlString){
		
	
		try {

			
			
			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(xmlString));

			// Create DocumentBuilder instance to parse the xml file
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(is);

			doc.getDocumentElement().normalize();

			// System.out.print("Root element: ");
			// System.out.println(doc.getDocumentElement().getNodeName());

			// Get the list of data under row Element.
			NodeList nList = doc.getElementsByTagName("row");
			System.out.println("----------------------------");
			for (int i = 0; i < nList.getLength(); i++) {// Loop for row element
				System.out.println("**************Loop" + i + "******************");

				Contact contact= new Contact();
				
				Node nNode = nList.item(i);

				System.out.println("\nCurrent Element :");
				System.out.print(nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					
					Element eElement = (Element) nNode;
					
					System.out.print("row : " + eElement.getAttribute("no"));
					
					
					
					// List of element with name Element
					NodeList flList = eElement.getElementsByTagName("FL");
					for (int count = 0; count < flList.getLength(); count++) { //loop for FL element
						
						Node node1 = flList.item(count);
						if (node1.getNodeType() == node1.ELEMENT_NODE) {
							
							Element fl = (Element) node1;
							System.out.print("FL attribueName : " + fl.getAttribute("val") + "  AND  ");
							System.out.println("FL Text : " + fl.getTextContent());
							
							//setting AccountName
							if(fl.getAttribute("val").equals("Account Name")){
								if (!"null".equals(fl.getTextContent()) && !Strings.isNullOrEmpty(fl.getTextContent())) {
									contact.setAccountName(fl.getTextContent());
								}
							}
							
							//setting Email
							if(fl.getAttribute("val").equals("Email")){
								if (!"null".equals(fl.getTextContent()) && !Strings.isNullOrEmpty(fl.getTextContent())) {
									contact.setEmail(fl.getTextContent());
								}
							}
							
							//setting Salesperson Code
							if(fl.getAttribute("val").equals("Salesperson Code")){
								if (!"null".equals(fl.getTextContent()) && !Strings.isNullOrEmpty(fl.getTextContent())) {
									contact.setSalespersonCode(fl.getTextContent());
								}
							}
							
							if(fl.getAttribute("val").equals("ACCOUNTID")){
								if (!"null".equals(fl.getTextContent()) && !Strings.isNullOrEmpty(fl.getTextContent())) {
									contact.setAccountId(fl.getTextContent());;
								}
							}
							
							if(fl.getAttribute("val").equals("Contact")){
								if (!"null".equals(fl.getTextContent()) && !Strings.isNullOrEmpty(fl.getTextContent())) {
									contact.setContactName(fl.getTextContent());;
								}
							}
							
							
						}//End IF
					}//End 2nd Loop
				}
				
				//Adding Contact instance to ContactList
				contactList.add(contact);
				
				
			}//End of Fist Loop
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return contactList;
	}
}
