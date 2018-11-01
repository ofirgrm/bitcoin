package com.exam.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TickerDAO {

    private String currency;
    private double fifteenm;
    private double last;
    private double buy;
    private double sell;
    private String symbol;

}
