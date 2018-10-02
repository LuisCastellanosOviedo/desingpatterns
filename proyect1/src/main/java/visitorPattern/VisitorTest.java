package visitorPattern;

public class VisitorTest {

    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        Necessity milk = new Necessity(4.6);
        Liquor vodka = new Liquor(7.99);
        Tobacco cigars = new Tobacco(39.88);

        System.out.println(milk.accept(taxVisitor) + "\n");
        System.out.println(vodka.accept(taxVisitor) + "\n");
        System.out.println(cigars.accept(taxVisitor) + "\n");

        System.out.println(" TAX HOLIDAY PRICES \n");
        System.out.println(milk.accept(taxHolidayVisitor) + "\n");
        System.out.println(vodka.accept(taxHolidayVisitor) + "\n");
        System.out.println(cigars.accept(taxHolidayVisitor) + "\n");
    }
}
