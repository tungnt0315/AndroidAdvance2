package com.example.tung.mvvm_reactivex_dagger.data.model;

/**
 * Created by tung on 5/30/17.
 */

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User implements Parcelable {

    @SerializedName("login")
    private String login;

    private Integer id;
    @SerializedName("avatar_url")
    private String avatarUrl;

    @SerializedName("gravatar_id")
    private String gravatarId;

    @SerializedName("url")
    private String url;

    @SerializedName("html_url")
    private String htmlUrl;

    @SerializedName("followers_url")
    private String followersUrl;

    @SerializedName("following_url")
    private String followingUrl;

    @SerializedName("gists_url")
    private String gistsUrl;

    @SerializedName("starred_url")
    private String starredUrl;

    @SerializedName("subscriptions_url")
    private String subscriptionsUrl;

    @SerializedName("organizations_url")
    private String organizationsUrl;

    @SerializedName("repos_url")
    private String reposUrl;

    @SerializedName("events_url")
    private String eventsUrl;

    @SerializedName("received_events_url")
    private String receivedEventsUrl;

    @SerializedName("type")
    private String type;
    @SerializedName("site_admin")
    private Boolean siteAdmin;

    private Double score;
    public final static Parcelable.Creator<User> CREATOR = new Creator<User>() {

        @SuppressWarnings({
                "unchecked"
        })
        public User createFromParcel(Parcel in) {
            User instance = new User();
            instance.login = ((String) in.readValue((String.class.getClassLoader())));
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.avatarUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.gravatarId = ((String) in.readValue((String.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.followersUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.followingUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.gistsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.starredUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.subscriptionsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.organizationsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.reposUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.eventsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.receivedEventsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.siteAdmin = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.score = ((Double) in.readValue((Double.class.getClassLoader())));
            return instance;
        }

        public User[] newArray(int size) {
            return (new User[size]);
        }
    };

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(login);
        dest.writeValue(id);
        dest.writeValue(avatarUrl);
        dest.writeValue(gravatarId);
        dest.writeValue(url);
        dest.writeValue(htmlUrl);
        dest.writeValue(followersUrl);
        dest.writeValue(followingUrl);
        dest.writeValue(gistsUrl);
        dest.writeValue(starredUrl);
        dest.writeValue(subscriptionsUrl);
        dest.writeValue(organizationsUrl);
        dest.writeValue(reposUrl);
        dest.writeValue(eventsUrl);
        dest.writeValue(receivedEventsUrl);
        dest.writeValue(type);
        dest.writeValue(siteAdmin);
        dest.writeValue(score);
    }

    public int describeContents() {
        return 0;
    }
}