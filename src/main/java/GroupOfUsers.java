import java.util.List;

public class GroupOfUsers {
    private String groupName;
    private List<StandarUser> standarUsrs;
    private List<Mediator> mediators;
    private Admin admin;
    private List<Post> posts;
    private List<Comments> comments;


    public GroupOfUsers(String groupName,List<StandarUser> standarUsrs, List<Mediator> mediators, Admin admin,List<Post> posts, List<Comments> comments) {
        this.standarUsrs = standarUsrs;
        this.mediators = mediators;
        this.admin = admin;
        this.posts = posts;
        this.groupName = "Group";
        this.comments = comments;
    }

    public List<StandarUser> getStandarUsrs() {
        return standarUsrs;
    }

    public void setStandarUsrs(List<StandarUser> standarUsrs) {
        this.standarUsrs = standarUsrs;
    }

    public List<Mediator> getMediators() {
        return mediators;
    }

    public void setMediators(List<Mediator> mediators) {
        this.mediators = mediators;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public List<Post> getPosts() {
        return posts;
    }
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}
