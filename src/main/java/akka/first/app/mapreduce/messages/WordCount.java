package akka.first.app.mapreduce.messages;

public final class WordCount {
    private final String word;
    private final Integer count;


    public WordCount(final String word, final Integer count) {
        this.word = word;
        this.count = count;
    }


    public String getWord() {
        return this.word;
    }


    public Integer getCount() {
        return this.count;
    }
}
