package visitorPattern;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#,##");

    public TaxHolidayVisitor() {
    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item : Price with tax ");
        return Double.parseDouble(df.format(liquorItem.getPrice()* .80) + liquorItem.getPrice());
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item : Price with tax ");
        return Double.parseDouble(df.format(tobaccoItem.getPrice()* .42) + tobaccoItem.getPrice());
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity item : Price with tax ");
        return Double.parseDouble(df.format(necessityItem.getPrice()* 0) + necessityItem.getPrice());
    }
}
