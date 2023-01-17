import java.util.ArrayList;
import java.util.Scanner;

public class UAS1B {
   private String ID;
   private String UserName;
   private String FullName;
   private String Posted;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPosted() {
        return Posted;
    }

    public void setPosted() {
        Posted = Posted;
    }

    public UAS1B(){

    }


    public static void main(String[] args) {
        int jumpost =4;
        Scanner sc = new Scanner(System.in);
        UAS1B user1 = new UAS1B();
            user1.setID("001");
        user1.setUserName("dbgb4a");
        user1.setFullName("Debby Gibsion");
        ArrayList<String> myPost = new ArrayList<>();
        for(int index=0; index<jumpost;index++){
            myPost.add(sc.nextLine());
        }
        user1.setPosted();
        System.out.println("Total Posted : "+ user1.ShowNumberOfPost());

    }
    private String ShowNumberOfPost() {
        return ShowNumberOfPost();
    }

}
