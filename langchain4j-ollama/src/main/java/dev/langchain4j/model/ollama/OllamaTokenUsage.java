package dev.langchain4j.model.ollama;

import dev.langchain4j.model.output.TokenUsage;

public class OllamaTokenUsage extends TokenUsage {
    private Integer inputCachedTokenCount;

    public OllamaTokenUsage(final Integer inputTokenCount, final Integer outputTokenCount, final Integer totalTokenCount, final Integer inputCachedTokenCount) {
        super(inputTokenCount, outputTokenCount, totalTokenCount);
        this.inputCachedTokenCount = inputCachedTokenCount;
    }

    public OllamaTokenUsage(final Integer inputTokenCount, final Integer outputTokenCount, final Integer inputCachedTokenCount) {
        super(inputTokenCount, outputTokenCount);
        this.inputCachedTokenCount = inputCachedTokenCount;
    }

    public Integer inputCachedTokenCount() {
        return inputCachedTokenCount;
    }

    @Override
    public String toString() {
        return "OllamaTokenUsage{" +
                "inputTokenCount=" + inputTokenCount() +
                ", outputTokenCount=" + outputTokenCount() +
                ", totalTokenCount=" + totalTokenCount() +
                ", inputCachedTokenCount=" + inputCachedTokenCount +
                '}';
    }
}
