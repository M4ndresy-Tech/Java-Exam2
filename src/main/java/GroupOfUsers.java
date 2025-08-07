import java.util.ArrayList;
import java.util.List;

public class GroupOfUsers {
    private String groupName;
    private List<StandardUser> standardUsers;
    private List<Mediator> mediators;
    private Admin admin;
    private List<Posts> posts;
    private List<Comments> comments;


    public GroupOfUsers(String groupName, List<StandardUser> standardUsers, List<Mediator> mediators, Admin admin, List<Posts> posts, List<Comments> comments) {
        this.standardUsers = standardUsers;
        this.mediators = mediators;
        this.admin = admin;
        this.posts = posts;
        this.groupName = "Group";
        this.comments = comments;
    }

    public List<StandardUser> getStandardUsers() {
        return standardUsers;
    }

    public void setStandardUsers(List<StandardUser> standarUsers) {
        this.standardUsers = standarUsers;
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
    public List<Posts> getPosts() {
        return posts;
    }
    public void setPosts(List<Posts> posts) {
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

    public List<Posts> searchPosts(List<Posts> pub,String keyword) {
        List<Posts> postsList = new ArrayList<>();
        for (Posts p : pub) {
            if (keyword.equalsIgnoreCase(p.getContent())) {
                postsList.add(p);
            }
        }
        return postsList;
    }




}
