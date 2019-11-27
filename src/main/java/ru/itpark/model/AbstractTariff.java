package ru.itpark.model;

public abstract class AbstractTariff {
    private long id;
    private String name;
    private boolean unlimitedInternet;
    private int subscriptionFee;
    private boolean top;
    private String shortDescription;

    public AbstractTariff(long id, String name, boolean unlimitedInternet, int subscriptionFee, boolean top, String shortDescription) {
        this.id = id;
        this.name = name;
        this.unlimitedInternet = unlimitedInternet;
        this.subscriptionFee = subscriptionFee;
        this.top = top;
        this.shortDescription = shortDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
