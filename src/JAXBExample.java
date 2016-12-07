import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBExample {
	public static void main(String[] args) {

	  Costumer customer = new Costumer();
	  customer.setId(100);
	  customer.setName("hhhhh");
	  customer.setAge(29);

	  try {

		File file = new File("C:\\Users\\Janar\\Documents\\Uuskaust\\JABX-Example\\src\\file.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Costumer.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(customer, file);
		jaxbMarshaller.marshal(customer, System.out);

	      } catch (JAXBException e) {
		e.printStackTrace();
	      }

	}
}