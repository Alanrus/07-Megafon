package ru.itpark.model;

public class TurnOnTariff extends AbstractTariff {
    private int quantityMinutes;
    private int quantityInternet;
    private int quantitySMS;
    private boolean freeMessengers;
    private boolean freeMusicAndYoutube;
    private boolean changeableSettings;
    private boolean megafonTV;
    private int percentCashback;

    public TurnOnTariff(long id, String name, boolean unlimitedInternet, int subscriptionFee, boolean top, String shortDescription, int quantityMinutes, int quantityInternet, int quantitySMS, boolean freeMessengers, boolean freeMusicAndYoutube, boolean changeableSettings, boolean megafonTV, int percentCashback) {
        super(id, name, unlimitedInternet, subscriptionFee, top, shortDescription);
        this.quantityMinutes = quantityMinutes;
        this.quantityInternet = quantityInternet;
        this.quantitySMS = quantitySMS;
        this.freeMessengers = freeMessengers;
        this.freeMusicAndYoutube = freeMusicAndYoutube;
        this.changeableSettings = changeableSettings;
        this.megafonTV = megafonTV;
        this.percentCashback = percentCashback;
    }


    public int getQuantityMinutes() {
        return quantityMinutes;
    }

    public void setQuantityMinutes(int quantityMinutes) {
        this.quantityMinutes = quantityMinutes;
    }

    public int getQuantityInternet() {
        return quantityInternet;
    }

    public void setQuantityInternet(int quantityInternet) {
        this.quantityInternet = quantityInternet;
    }

    public int getQuantitySMS() {
        return quantitySMS;
    }

    public void setQuantitySMS(int quantitySMS) {
        this.quantitySMS = quantitySMS;
    }

    public boolean isFreeMessengers() {
        return freeMessengers;
    }

    public void setFreeMessengers(boolean freeMessengers) {
        this.freeMessengers = freeMessengers;
    }

    public boolean isFreeMusicAndYoutube() {
        return freeMusicAndYoutube;
    }

    public void setFreeMusicAndYoutube(boolean freeMusicAndYoutube) {
        this.freeMusicAndYoutube = freeMusicAndYoutube;
    }

    public boolean isChangeableSettings() {
        return changeableSettings;
    }

    public void setChangeableSettings(boolean changeableSettings) {
        this.changeableSettings = changeableSettings;
    }

    public boolean isMegafonTV() {
        return megafonTV;
    }

    public void setMegafonTV(boolean megafonTV) {
        this.megafonTV = megafonTV;
    }

    public int getPercentCashback() {
        return percentCashback;
    }

    public void setPercentCashback(int percentCashback) {
        this.percentCashback = percentCashback;
    }
}


