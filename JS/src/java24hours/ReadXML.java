package java24hours;

import java.io.IOException;

import nu.xom.Attribute;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

public class ReadXML {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     * @throws IOException 
     * @throws ParsingException 
     * @throws ValidityException 
     */
    public ReadXML() throws ValidityException, ParsingException, IOException {
        Builder builder = new Builder();
        Document doc = builder.build("src\\java24hours\\properties.xml");
        Element root = doc.getRootElement();
        Element comment = root.getFirstChildElement("comment");
        String c = comment.getValue();
        System.out.println("Comment: "+c);
        Elements properties = root.getChildElements("entry");
        for (int i=0;i<properties.size();i++) {
            Element p = properties.get(i);
            System.out.print("\t entry["+i+"]: attributes are");
            int attrNum = p.getAttributeCount();
            for (int j=0;j<attrNum;j++) {
                Attribute attr = p.getAttribute(j);
                String strType = attr.getLocalName();
                String strValue = attr.getValue();
                System.out.print(" "+strType+":"+strValue);
            } 
            String value = p.getValue();
            System.out.print(", value is "+value+"\r\n");
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            ReadXML rx = new ReadXML();
        } catch (ValidityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParsingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
