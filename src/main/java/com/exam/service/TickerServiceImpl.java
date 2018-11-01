package com.exam.service;


import com.exam.domain.TickerArray;
import com.exam.domain.TickerDAO;
import com.exam.json.Ticker;
import com.exam.json.TickerBase;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class TickerServiceImpl implements TickerService {

    private RestTemplate restTemplate;

    public TickerServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public TickerArray getTickers() {
        Ticker ticker = getTickersUsingHttp();
        TickerArray array = mapTicker(ticker);

        return array;
    }

    public Ticker getTickersUsingHttp() {
        Ticker ticker = restTemplate.getForObject("https://blockchain.info/ticker",
                Ticker.class);

        return ticker;
    }

    private TickerArray mapTicker(Ticker ticker) {
        TreeMap<Double, TickerDAO> sortedMap = new TreeMap<>();

        sortedMap.put(ticker.getUSD().get15m(), convertTicker("USD", ticker.getUSD()));
        sortedMap.put(ticker.getAUD().get15m(), convertTicker("AUD", ticker.getAUD()));
        sortedMap.put(ticker.getBRL().get15m(), convertTicker("BRL", ticker.getBRL()));
        sortedMap.put(ticker.getCAD().get15m(), convertTicker("CAD", ticker.getCAD()));
        sortedMap.put(ticker.getCHF().get15m(), convertTicker("CHF", ticker.getCHF()));
        sortedMap.put(ticker.getCLP().get15m(), convertTicker("CLP", ticker.getCLP()));
        sortedMap.put(ticker.getCNY().get15m(), convertTicker("CNY", ticker.getCNY()));

        TickerArray array = new TickerArray();
        Collection<TickerDAO> values = sortedMap.values();
        //TickerDAO tickers =
        values.stream().forEach(value -> {
        //    array.getTickerMap().put()
        });


        return array;
    }



    private TickerDAO convertTicker(String currency, TickerBase json) {
        TickerDAO tickerDAO = new TickerDAO();
        tickerDAO.setBuy(json.getBuy());
        tickerDAO.setFifteenm(json.get15m());
        tickerDAO.setLast(json.getLast());
        tickerDAO.setSell(json.getSell());
        tickerDAO.setSymbol(json.getSymbol());
        tickerDAO.setCurrency(currency);

        return tickerDAO;
    }

}
