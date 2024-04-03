package com.example.nyitimeapplication.model;



import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Result {
    public String uri;
    public String url;
    public Object id;
    public Object asset_id;
    public String source;
    public String published_date;
    public String updated;
    public String section;
    public String subsection;
    public String nytdsection;
    public String adx_keywords;
    public Object column;
    public String byline;
    public String type;
    public String title;
    @JsonProperty("abstract")
    public String myabstract;
    public ArrayList<String> des_facet;
    public ArrayList<String> org_facet;
    public ArrayList<String> per_facet;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(Object asset_id) {
        this.asset_id = asset_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getNytdsection() {
        return nytdsection;
    }

    public void setNytdsection(String nytdsection) {
        this.nytdsection = nytdsection;
    }

    public String getAdx_keywords() {
        return adx_keywords;
    }

    public void setAdx_keywords(String adx_keywords) {
        this.adx_keywords = adx_keywords;
    }

    public Object getColumn() {
        return column;
    }

    public void setColumn(Object column) {
        this.column = column;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMyabstract() {
        return myabstract;
    }

    public void setMyabstract(String myabstract) {
        this.myabstract = myabstract;
    }

    public ArrayList<String> getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(ArrayList<String> des_facet) {
        this.des_facet = des_facet;
    }

    public ArrayList<String> getOrg_facet() {
        return org_facet;
    }

    public void setOrg_facet(ArrayList<String> org_facet) {
        this.org_facet = org_facet;
    }

    public ArrayList<String> getPer_facet() {
        return per_facet;
    }

    public void setPer_facet(ArrayList<String> per_facet) {
        this.per_facet = per_facet;
    }

    public ArrayList<String> getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(ArrayList<String> geo_facet) {
        this.geo_facet = geo_facet;
    }

    public ArrayList<Medium> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Medium> media) {
        this.media = media;
    }

    public int getEta_id() {
        return eta_id;
    }

    public void setEta_id(int eta_id) {
        this.eta_id = eta_id;
    }

    public ArrayList<String> geo_facet;
    public ArrayList<Medium> media;
    public int eta_id;
}
