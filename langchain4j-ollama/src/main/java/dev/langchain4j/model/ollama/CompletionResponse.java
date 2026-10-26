package dev.langchain4j.model.ollama;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
class CompletionResponse {

    private String model;
    private String createdAt;
    private String response;
    private String image;
    private Boolean done;
    private Integer promptEvalCount;
    private Integer evalCount;
    private Integer promptEvalCachedCount;
    private String error;

    CompletionResponse() {}

    CompletionResponse(
            String model,
            String createdAt,
            String response,
            String image,
            Boolean done,
            Integer promptEvalCount,
            Integer promptEvalCachedCount,
            Integer evalCount,
            String error) {
        this.model = model;
        this.createdAt = createdAt;
        this.response = response;
        this.image = image;
        this.done = done;
        this.promptEvalCount = promptEvalCount;
        this.promptEvalCachedCount = promptEvalCachedCount;
        this.evalCount = evalCount;
        this.error = error;
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

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
