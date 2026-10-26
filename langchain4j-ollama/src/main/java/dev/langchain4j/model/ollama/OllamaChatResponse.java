package dev.langchain4j.model.ollama;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
class OllamaChatResponse {

    private String model;
    private String createdAt;
    private Message message;
    private String doneReason;
    private Boolean done;
    private Integer promptEvalCount;
    private Integer evalCount;
    private Integer promptEvalCachedCount;

    private String error;

    OllamaChatResponse() {}

    OllamaChatResponse(
            String model,
            String createdAt,
            Message message,
            String doneReason,
            Boolean done,
            Integer promptEvalCount,
            Integer promptEvalCachedCount,
            Integer evalCount,
            String error) {
        this.model = model;
        this.createdAt = createdAt;
        this.message = message;
        this.doneReason = doneReason;
        this.done = done;
        this.promptEvalCount = promptEvalCount;
        this.evalCount = evalCount;
        this.error = error;
        this.promptEvalCachedCount = promptEvalCachedCount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getDoneReason() {
        return doneReason;
    }

    public void setDoneReason(String doneReason) {
        this.doneReason = doneReason;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Integer getPromptEvalCount() {
        return promptEvalCount;
    }

    public void setPromptEvalCount(Integer promptEvalCount) {
        this.promptEvalCount = promptEvalCount;
    }

    public Integer getEvalCount() {
        return evalCount;
    }

    public void setEvalCount(Integer evalCount) {
        this.evalCount = evalCount;
    }

    public Integer getPromptEvalCachedCount() {
        return promptEvalCachedCount;
    }

    public void setPromptEvalCachedCount(final Integer promptEvalCachedCount) {
        this.promptEvalCachedCount = promptEvalCachedCount;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
