package Problem_2;
class Clothings extends Product implements Tax
{
    public Clothings(int id, String name, double price)
    {
        super(id, name, price);
    }
    public double calculateDiscount()
    {
        return getPrice() * 0.2;
    }
    public double calculateTax()
    {
        return getPrice() * 0.05;
    }
    public String getTaxDetails()
    {
        return "Clothings Tax 5%";
    }
    public double getTax()
    {
        return calculateTax();
    }
}
