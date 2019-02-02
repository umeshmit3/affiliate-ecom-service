
package com.ecom.affiliate.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "language",
    "binding",
    "pages",
    "publisher",
    "year",
    "authors"
})
public class BooksInfo {

    @JsonProperty("language")
    private Object language;
    @JsonProperty("binding")
    private Object binding;
    @JsonProperty("pages")
    private Object pages;
    @JsonProperty("publisher")
    private Object publisher;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("authors")
    private List<Object> authors = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("language")
    public Object getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(Object language) {
        this.language = language;
    }

    @JsonProperty("binding")
    public Object getBinding() {
        return binding;
    }

    @JsonProperty("binding")
    public void setBinding(Object binding) {
        this.binding = binding;
    }

    @JsonProperty("pages")
    public Object getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(Object pages) {
        this.pages = pages;
    }

    @JsonProperty("publisher")
    public Object getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(Object publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
    }

    @JsonProperty("authors")
    public List<Object> getAuthors() {
        return authors;
    }

    @JsonProperty("authors")
    public void setAuthors(List<Object> authors) {
        this.authors = authors;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
