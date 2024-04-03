package com.example.nyitimeapplication.model;



import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;

public class Medium implements Serializable {
    public String type;
    public String subtype;
    public String caption;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getApproved_for_syndication() {
        return approved_for_syndication;
    }

    public void setApproved_for_syndication(int approved_for_syndication) {
        this.approved_for_syndication = approved_for_syndication;
    }

    public ArrayList<MediaMetadatum> getMedia_metadata() {
        return media_metadata;
    }

    public void setMedia_metadata(ArrayList<MediaMetadatum> media_metadata) {
        this.media_metadata = media_metadata;
    }

    public String copyright;
    public int approved_for_syndication;
    @JsonProperty("media-metadata")
    public ArrayList<MediaMetadatum> media_metadata;
}
