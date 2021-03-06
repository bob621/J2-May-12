public class SalesAssociate extends Employee {
	private double amountSold ;
	private double commissionRate;

	SalesAssociate(double amountSold, double commissionRate, int emplId, String firstName, String lastName, double salary){
		super (emplId, firstName, lastName, salary);
		this.amountSold = amountSold;
		this.commissionRate = commissionRate;
		updateDerivedAttrs();
		
	}

	double getAmountSold (){
		return this.amountSold;
        }

	double getCommissionRate(){
		return this.commissionRate;
	}

	void setAmountSold (double amountSold){
		this.amountSold = amountSold;
	}

	void setCommissionRate (double commissionRate){
		this.commissionRate = commissionRate;
	}

	void updateDerivedAttrs(){
		super.emplTypeDescr = "Sales Associate";
		super.contributionLimit = 40;
		if (super.getSalary() > 1200.0){
			super.taxRate = 0.2;
		}else {
			super.taxRate = 0.15; 
		}
		
	}
}