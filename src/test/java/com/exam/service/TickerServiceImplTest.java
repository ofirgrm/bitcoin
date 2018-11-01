package com.exam.service;

import com.exam.domain.TickerArray;
import com.exam.json.Ticker;
import com.exam.service.TickerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TickerServiceImplTest {


    @Autowired
    private TickerServiceImpl tickerService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getTickersUsingHttp() {
        Ticker tickers = tickerService.getTickersUsingHttp();

        assertNotNull(tickers);
        assertThat(tickers.getUSD().get15m(), greaterThan(0d));
    }

    @Test
    public void getTickers() {
        TickerArray tickers = tickerService.getTickers();


    }
}