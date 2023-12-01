import java.io.IOException;


public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "childclass.txt";

		ChildClass childClass = new ChildClass();
		childClass.setProductId(21);
		childClass.setProduct("Blog");
		childClass.setBrand("TechBeamers");

		try {
			SerializationLib.doSerialize(childClass, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		try {
			ChildClass newChild = (ChildClass) SerializationLib
					.doDeserialize(fileName);
			System.out.println("ChildClass output:  \n  |\n   --" + newChild);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ChildClass extends ParentClass implements
		ObjectInputValidation {

	private String Brand;

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		this.Brand = brand;
	}

	@Override
	public String toString() {
		return "Summary[ ProductId=" + getProductId() + ", Product=" + getProduct()
				+ ", Brand=" + getBrand() + " ]";
	}

	// adding helper method for serialization to save/initialize parent class
	// state
	private void readObject(ObjectInputStream ois)
			throws ClassNotFoundException, IOException {
		ois.defaultReadObject();

		// notice the order of read and write should be same
		setProductId(ois.readInt());
		setProduct((String) ois.readObject());

	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();

		oos.writeInt(getProductId());
		oos.writeObject(getProduct());
	}

	@Override
	public void validateObject() throws InvalidObjectException {
		// validate the object here
		if (Brand == null || "".equals(Brand))
			throw new InvalidObjectException("Brand is not set or empty.");
		if (getProductId() <= 0)
			throw new InvalidObjectException("ProductId is not set or zero.");
	}
}
import java.io.Serializable;

public class ParentClass implements Serializable {

	private String Product;
	private int ProductId;

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		this.Product = product;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int Id) {
		this.ProductId = Id;
	}
}
