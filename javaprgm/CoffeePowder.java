

class CoffeePowder {
    double cost;
    String company;
    double weight;
    String manfDate;

    public CoffeePowder() {
        System.out.println("Creating a no-parameter constructor");
    }

    public CoffeePowder(String company) {
        System.out.println("Creating a constructor with company");
        this.company = company;
    }

    public CoffeePowder(String company, double cost, double weight, String manfDate) {
        System.out.println("Creating a constructor with company, cost, weight, and manufacturing date");
        this.company = company;
        this.cost = cost;
        this.weight = weight;
        this.manfDate = manfDate;
    }

    public CoffeePowder(String company, String manfDate) {
        System.out.println("Creating a constructor with company and manufacturing date");
        this.company = company;
        this.manfDate = manfDate;
    }

    public CoffeePowder(double weight) {
        System.out.println("Creating a constructor with weight");
        this.weight = weight;
    }

    public static void main(String[] args) {
        CoffeePowder coffee1 = new CoffeePowder();
        
        CoffeePowder coffee2 = new CoffeePowder("Java Beans");
        System.out.println("Coffee company is = " + coffee2.company);

        CoffeePowder coffee3 = new CoffeePowder(500);
        System.out.println("Coffee weight is = " + coffee3.weight);

        CoffeePowder coffee4 = new CoffeePowder("Java Beans", 250.75, 500, "2/4/2024");
        System.out.println("Coffee company is = " + coffee4.company);
        System.out.println("Coffee cost is = " + coffee4.cost);
        System.out.println("Coffee weight is = " + coffee4.weight);
        System.out.println("Coffee manufacturing date is = " + coffee4.manfDate);

        CoffeePowder coffee5 = new CoffeePowder("Java Beans","2/4/2024" );
        System.out.println("Coffee company is = " + coffee5.company);
        System.out.println("Coffee manufacturing date is = " + coffee5.manfDate);
    }
}
