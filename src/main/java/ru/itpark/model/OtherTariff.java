package ru.itpark.model;

public class OtherTariff extends AbstractTariff {
    private boolean paymentPerMinute;
    private boolean paymentPerSecond;
    private boolean UnlimitedCallsMegafon;
    private int quantityInternet;

    public OtherTariff(long id, String name, boolean unlimitedInternet, int subscriptionFee, boolean top, String shortDescription) {
        super(id, name, unlimitedInternet, subscriptionFee, top, shortDescription);
    }
}
