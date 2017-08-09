package com.polls.chart.line;
import com.polls.chart.Chart;
import com.polls.chart.factory.IFactory;

public class LineChart extends Chart {
    public IFactory factory;
    public LineChart(IFactory factory) {
           this.factory = factory;
           createChart();
    }
    private void createChart() {
       legend = this.factory.createLegend();
       series = this.factory.createSeries();
       title  = this.factory.createTitle();
       xaxis  = this.factory.createXaxis();
    }
}