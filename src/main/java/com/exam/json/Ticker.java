
package com.exam.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "USD",
    "AUD",
    "BRL",
    "CAD",
    "CHF",
    "CLP",
    "CNY",
    "DKK",
    "EUR",
    "GBP",
    "HKD",
    "INR",
    "ISK",
    "JPY",
    "KRW",
    "NZD",
    "PLN",
    "RUB",
    "SEK",
    "SGD",
    "THB",
    "TWD"
})
public class Ticker {

    public String PROPERTIES[] = {    "USD",
            "AUD",
            "BRL",
            "CAD",
            "CHF",
            "CLP",
            "CNY",
            "DKK",
            "EUR",
            "GBP",
            "HKD",
            "INR",
            "ISK",
            "JPY",
            "KRW",
            "NZD",
            "PLN",
            "RUB",
            "SEK",
            "SGD",
            "THB",
            "TWD"};

    @JsonProperty("USD")
    private TickerBase uSD;
    @JsonProperty("AUD")
    private TickerBase aUD;
    @JsonProperty("BRL")
    private TickerBase bRL;
    @JsonProperty("CAD")
    private TickerBase cAD;
    @JsonProperty("CHF")
    private TickerBase cHF;
    @JsonProperty("CLP")
    private TickerBase cLP;
    @JsonProperty("CNY")
    private TickerBase cNY;
    @JsonProperty("DKK")
    private TickerBase dKK;
    @JsonProperty("EUR")
    private TickerBase eUR;
    @JsonProperty("GBP")
    private TickerBase gBP;
    @JsonProperty("HKD")
    private TickerBase hKD;
    @JsonProperty("INR")
    private TickerBase iNR;
    @JsonProperty("ISK")
    private TickerBase iSK;
    @JsonProperty("JPY")
    private TickerBase jPY;
    @JsonProperty("KRW")
    private TickerBase kRW;
    @JsonProperty("NZD")
    private TickerBase nZD;
    @JsonProperty("PLN")
    private TickerBase pLN;
    @JsonProperty("RUB")
    private TickerBase rUB;
    @JsonProperty("SEK")
    private TickerBase sEK;
    @JsonProperty("SGD")
    private TickerBase sGD;
    @JsonProperty("THB")
    private TickerBase tHB;
    @JsonProperty("TWD")
    private TickerBase tWD;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("USD")
    public TickerBase getUSD() {
        return uSD;
    }

    @JsonProperty("USD")
    public void setUSD(TickerBase uSD) {
        this.uSD = uSD;
    }

    @JsonProperty("AUD")
    public TickerBase getAUD() {
        return aUD;
    }

    @JsonProperty("AUD")
    public void setAUD(TickerBase aUD) {
        this.aUD = aUD;
    }

    @JsonProperty("BRL")
    public TickerBase getBRL() {
        return bRL;
    }

    @JsonProperty("BRL")
    public void setBRL(TickerBase bRL) {
        this.bRL = bRL;
    }

    @JsonProperty("CAD")
    public TickerBase getCAD() {
        return cAD;
    }

    @JsonProperty("CAD")
    public void setCAD(TickerBase cAD) {
        this.cAD = cAD;
    }

    @JsonProperty("CHF")
    public TickerBase getCHF() {
        return cHF;
    }

    @JsonProperty("CHF")
    public void setCHF(TickerBase cHF) {
        this.cHF = cHF;
    }

    @JsonProperty("CLP")
    public TickerBase getCLP() {
        return cLP;
    }

    @JsonProperty("CLP")
    public void setCLP(TickerBase cLP) {
        this.cLP = cLP;
    }

    @JsonProperty("CNY")
    public TickerBase getCNY() {
        return cNY;
    }

    @JsonProperty("CNY")
    public void setCNY(TickerBase cNY) {
        this.cNY = cNY;
    }

    @JsonProperty("DKK")
    public TickerBase getDKK() {
        return dKK;
    }

    @JsonProperty("DKK")
    public void setDKK(TickerBase dKK) {
        this.dKK = dKK;
    }

    @JsonProperty("EUR")
    public TickerBase getEUR() {
        return eUR;
    }

    @JsonProperty("EUR")
    public void setEUR(TickerBase eUR) {
        this.eUR = eUR;
    }

    @JsonProperty("GBP")
    public TickerBase getGBP() {
        return gBP;
    }

    @JsonProperty("GBP")
    public void setGBP(TickerBase gBP) {
        this.gBP = gBP;
    }

    @JsonProperty("HKD")
    public TickerBase getHKD() {
        return hKD;
    }

    @JsonProperty("HKD")
    public void setHKD(TickerBase hKD) {
        this.hKD = hKD;
    }

    @JsonProperty("INR")
    public TickerBase getINR() {
        return iNR;
    }

    @JsonProperty("INR")
    public void setINR(TickerBase iNR) {
        this.iNR = iNR;
    }

    @JsonProperty("ISK")
    public TickerBase getISK() {
        return iSK;
    }

    @JsonProperty("ISK")
    public void setISK(TickerBase iSK) {
        this.iSK = iSK;
    }

    @JsonProperty("JPY")
    public TickerBase getJPY() {
        return jPY;
    }

    @JsonProperty("JPY")
    public void setJPY(TickerBase jPY) {
        this.jPY = jPY;
    }

    @JsonProperty("KRW")
    public TickerBase getKRW() {
        return kRW;
    }

    @JsonProperty("KRW")
    public void setKRW(TickerBase kRW) {
        this.kRW = kRW;
    }

    @JsonProperty("NZD")
    public TickerBase getNZD() {
        return nZD;
    }

    @JsonProperty("NZD")
    public void setNZD(TickerBase nZD) {
        this.nZD = nZD;
    }

    @JsonProperty("PLN")
    public TickerBase getPLN() {
        return pLN;
    }

    @JsonProperty("PLN")
    public void setPLN(TickerBase pLN) {
        this.pLN = pLN;
    }

    @JsonProperty("RUB")
    public TickerBase getRUB() {
        return rUB;
    }

    @JsonProperty("RUB")
    public void setRUB(TickerBase rUB) {
        this.rUB = rUB;
    }

    @JsonProperty("SEK")
    public TickerBase getSEK() {
        return sEK;
    }

    @JsonProperty("SEK")
    public void setSEK(TickerBase sEK) {
        this.sEK = sEK;
    }

    @JsonProperty("SGD")
    public TickerBase getSGD() {
        return sGD;
    }

    @JsonProperty("SGD")
    public void setSGD(TickerBase sGD) {
        this.sGD = sGD;
    }

    @JsonProperty("THB")
    public TickerBase getTHB() {
        return tHB;
    }

    @JsonProperty("THB")
    public void setTHB(TickerBase tHB) {
        this.tHB = tHB;
    }

    @JsonProperty("TWD")
    public TickerBase getTWD() {
        return tWD;
    }

    @JsonProperty("TWD")
    public void setTWD(TickerBase tWD) {
        this.tWD = tWD;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
