//package xml_needtopull;
//
//import hw.hw4.list.Node;
//import org.w3c.dom.NamedNodeMap;
//import org.w3c.dom.NodeList;
//import org.xml.sax.SAXException;
//import sun.plugin.dom.core.Document;
//
//import javax.swing.text.html.parser.Element;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.IOException;
//
//public class DomParser {
//    public static void main(String[] args) {
//        parse();
//    }
//
//    private static void parse() throws ParserConfigurationException, IOException, SAXException {
//        Catalog catalog = new Catalog();
//
//        // Инициализация DOM parser
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = factory.newDocumentBuilder();
//
//        // работа с документом
//        Document document = builder.parse(DomParser.class.getClassLoader().getResourceAsStream("articles.xml"));
//
//        // получаем корневой элемент
//        Element element = document.getDocumentElement();
//        System.out.println(element);
//
//        // получаем подузлы
//        NodeList articlesList = element.getChildeNodes();
//        for (int i = 0; i < articlesList.getLength(); i++) {
//            Node articleNode = articlesList.item(i);
//
//            if (articleNode instanceof Element) {
//                Article article = new Article();
//                catalog.articleList.add(article);
//
//                // чситываем атрибуты
//                NamedNodeMap attrs = articleNode.getAttributes();
//
//                article.id = attrs.getNamedItem("id").getNodeValue();
//
//                NodeList articleProp = articleNode.getChildNodes();
//
//                for (int j = 0; j < articleProp.getLength(); j++) {
//                    Node prop = articleProp.item(j);
//
//                    if (prop instanceof Element) {
//                        String propName = prop.getNodeName();
//                        String value = prop.getTextContent();
//
//                        if ("author".equals(propName))
//                    }
//                }
//            }
//        }
//
//
//    }
//}
