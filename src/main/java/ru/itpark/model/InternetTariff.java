package ru.itpark.model;

public class InternetTariff extends AbstractTariff {
    private int priceFor1Mb;

    public int getPriceFor1Mb() {
        return priceFor1Mb;
    }

    public void setPriceFor1Mb(int priceFor1Mb) {
        this.priceFor1Mb = priceFor1Mb;
    }

    public InternetTariff(long id, String name, boolean unlimitedInternet, int subscriptionFee, boolean top, String shortDescription, int priceFor1Mb) {
        super(id, name, unlimitedInternet, subscriptionFee, top, shortDescription);
        this.priceFor1Mb = priceFor1Mb;
    }
}
