package akka.first.app.mapreduce.messages;


import java.util.Map;


public final class ReduceData {
    private final Map<String, Integer> reduceDataList;


    public ReduceData(final Map<String, Integer> reduceDataList) {
        this.reduceDataList = reduceDataList;
    }


    public Map<String, Integer> getReduceDataList() {
        return this.reduceDataList;
    }
}
