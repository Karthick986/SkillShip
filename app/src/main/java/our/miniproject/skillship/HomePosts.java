package our.miniproject.skillship;

public class HomePosts {

    public String uidpost, date, time, postimage, description, profileimage, username, role, uid;

    public HomePosts() {
    }

    public HomePosts(String uidpost, String date, String time, String postimage, String description, String profileimage, String username, String role, String uid) {
        this.uidpost = uidpost;
        this.date = date;
        this.time = time;
        this.postimage = postimage;
        this.description = description;
        this.profileimage = profileimage;
        this.username = username;
        this.role = role;
        this.uid = uid;
    }

    public String getUidpost() {
        return uidpost;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uidpost = uidpost;
    }

    public String getDate() {
        return date;
    }

    public String getDiscription() {
        return description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPostimage() {
    return postimage;
    }

    public void setPostimage(String postimage) {
        this.postimage = postimage;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfileimage() {
        return profileimage;
    }

    public void setProfileimage(String profileimage) {
        this.profileimage = profileimage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
