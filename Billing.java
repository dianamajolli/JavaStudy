package arrayListBillingProject;

public class Billing {
	private double prd_Price;
	private int prd_Qty;
	public static double Fed_Tax;
	public static double Prv_Tax;
	public double T_Billing;
	
	public Billing() {
		
		
	}

	public double getPrd_Price() {
		return prd_Price;
	}

	public void setPrd_Price(double prd_Price) {
		this.prd_Price = prd_Price;
	}

	public double getPrd_Qty() {
		return prd_Qty;
	}

	public void setPrd_Qty(int prd_Qty) {
		this.prd_Qty = prd_Qty;
	}

	public static double getFed_Tax() {
		return Fed_Tax;
	}

	public static void setFed_Tax(double fed_Tax) {
		Fed_Tax = fed_Tax;
	}

	public static double getPrv_Tax() {
		return Prv_Tax;
	}

	public static void setPrv_Tax(double prv_Tax) {
		Prv_Tax = prv_Tax;
	}

	@Override
	public String toString() {
		return "Billing [prd_Price=" + prd_Price + ", prd_Qty=" + prd_Qty + "]";
	}
	
	public double CalculateBilling() {
		return T_Billing = (prd_Price* prd_Qty) + (prd_Price*prd_Qty)* Fed_Tax + (prd_Price*prd_Qty)* Prv_Tax;
		
	}
}

