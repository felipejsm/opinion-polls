package com.polls.chart.factory;
import java.util.List;

import com.polls.chart.fields.Legend;
import com.polls.chart.fields.Series;
import com.polls.chart.fields.Title;
import com.polls.chart.fields.Xaxis;

public interface IFactory {
    public Legend createLegend();
    public Title createTitle();
    public List<Series> createSeries();
    public List<Xaxis> createXaxis();
}