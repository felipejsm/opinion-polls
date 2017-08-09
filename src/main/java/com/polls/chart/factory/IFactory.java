package com.polls.chart.factory;
import java.util.List;

import com.polls.chart.Legend;
import com.polls.chart.Series;
import com.polls.chart.Title;
import com.polls.chart.Xaxis;

public interface IFactory {
    public Legend createLegend();
    public Title createTitle();
    public List<Series> createSeries();
    public List<Xaxis> createXaxis();
}