package Nov.ex_18112024_Exception_Part2;

public class bank {
    private String currency;
    private Integer amount;

    public bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(bank bankname) throws Exception{
        if(!bankname.currency.equalsIgnoreCase("INR"))
        {
            throw new Exception("Currency Mismatch, Can't Proceed");
        }
        return bankname.amount + this.amount;
    }

}
