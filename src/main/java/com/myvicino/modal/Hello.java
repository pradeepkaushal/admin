package com.myvicino.modal;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;



/**
 * Created by pradeep.kaushal on 03/08/15.
 */
public class Hello {

    private long id;

    @Length(max = 3)
    private String content;

    public Hello() {
        // Jackson deserialization
    }

    public Hello(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
