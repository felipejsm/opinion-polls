package com.polls.chart;
import java.util.List;

import com.polls.chart.fields.Legend;
import com.polls.chart.fields.Series;
import com.polls.chart.fields.Title;
import com.polls.chart.fields.Xaxis;
public abstract class Chart {
    public List<Series> series;
    public Title title;
    public Legend legend;
    public List<Xaxis> xaxis;
}