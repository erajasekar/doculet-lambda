package com.doculet.lambda.model;

import static com.doculet.lambda.support.Constants.*;

/**
 * oEmbedData - Model to hold oEmbed response data.
 * @author relango
 */
public class oEmbedData {

    private String provider_url = PROVIDER_URL;
    private String provider_name = PROVIDER_NAME;
    private int thumbnail_width = THUMBNAIL_WIDTH;
    private int thumbnail_height = THUMBNAIL_HEIGHT;

    private String thumbnail_url = THUMBNAIL_URL;
    private String author_name = AUTHOR_NAME;
    private String html = "";
    private String title = TITLE;
    private int width = WIDTH;
    private int height = HEIGHT;

    private String version = VERSION;
    private String author_url = AUTHOR_URL;
    private String type = TYPE;

    public oEmbedData(String docId){
        this.html = String.format(HTML_FORMAT, docId, height, width);
    }

    public String getProvider_url() {
        return provider_url;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public int getThumbnail_width() {
        return thumbnail_width;
    }

    public int getThumbnail_height() {
        return thumbnail_height;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getHtml() {
        return html;
    }

    public String getTitle() {
        return title;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getVersion() {
        return version;
    }

    public String getAuthor_url() {
        return author_url;
    }

    public String getType() {
        return type;
    }
}
