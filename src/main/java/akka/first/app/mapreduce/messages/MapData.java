package akka.first.app.mapreduce.messages;


import java.util.List;


public final class MapData {
    private final List<WordCount> dataList;


    public MapData(final List<WordCount> dataList) {
        this.dataList = dataList;
    }


    public List<WordCount> getDataList() {
        return this.dataList;
    }
}
