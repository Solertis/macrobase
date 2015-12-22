package macrobase.analysis.result;

import macrobase.analysis.summary.itemset.result.ItemsetResult;

import java.util.List;

public class AnalysisResult {
    private int numOutliers;
    private int numInliers;
    private long loadTime;
    private long labelTime;
    private long summarizationTime;
    private List<ItemsetResult> itemSets;

    public AnalysisResult(int numOutliers,
                          int numInliers,
                          long loadTime,
                          long labelTime,
                          long summarizationTime,
                          List<ItemsetResult> itemSets) {
        this.numOutliers = numOutliers;
        this.numInliers = numInliers;
        this.loadTime = loadTime;
        this.labelTime = labelTime;
        this.summarizationTime = summarizationTime;
        this.itemSets = itemSets;
    }

    public int getNumOutliers() {
        return numOutliers;
    }

    public int getNumInliers() {
        return numInliers;
    }

    public long getLoadTime() { return loadTime; }

    public long getLabelTime() {
        return labelTime;
    }

    public long getSummarizationTime() {
        return summarizationTime;
    }

    public void setItemSets(List<ItemsetResult> itemsets) {
        this.itemSets = itemsets;
    }

    public List<ItemsetResult> getItemSets() {
        return itemSets;
    }

    public AnalysisResult() {
        // JACKSON
    }
}
