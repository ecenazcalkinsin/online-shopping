import java.util.Scanner;
import java.util.ArrayList;

public class ElectronicProduct extends Product {


	    private ArrayList<Product> arr;
	    public boolean isRechargeable;

	    // Constructor
	    public ElectronicProduct() {
	        arr = new ArrayList<Product>();
	        isRechargeable = false;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("\nElectronic Product\n");
	        sb.append("Product List:\n");

	        for (Product product : arr) {
	            sb.append(product.toString());
	            sb.append("\n"); // Add a new line for each product for readability
	        }

	        sb.append("Is it rechargeable? ").append(isRechargeable);
	        return sb.toString();
	    }

	    // Get input method
	    @Override
	    public void getInput() {
	    	   Scanner scanner = new Scanner(System.in);
	    	    super.getInput();
	    	    System.out.print("Is the product rechargeable? (True/False): ");
	    	    isRechargeable = scanner.nextBoolean();
	    }
	    


	    // Getters and Setters
	public ArrayList<Product> getArray() {
			return arr;
		}

		public void setArr(ArrayList<Product> arr) {
			this.arr = arr;
		}

		public boolean getIsRechargeable() {
			return isRechargeable;
		}

		public void setRechargeable(boolean isRechargeable) {
			this.isRechargeable = isRechargeable;
		}

}
