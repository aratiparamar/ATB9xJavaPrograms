package Nov.ex_08112024_Encapsulation;

public class Lab152 {
    public static void main(String[] args) {
        VWOlogin v1=new VWOlogin("admin","password123");
        System.out.println(v1.password);
        v1.password="hacker";

        GoodVWOlogin v2=new GoodVWOlogin("admin", "password123");
        //System.out.println(v2.password());
        //v2.setPassword("hacker");
        String pass=v2.getPassword(true);
        System.out.println(pass);
        v2.setPassword("Admin",false);
    }
}
class VWOlogin{
    public String username;
    public String password;

    public VWOlogin(String username, String password) {
        this.username=username;
        this.password=password;
    }
}

class GoodVWOlogin{
    private String username;
    private String password;

    public GoodVWOlogin(String username, String password) {
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(Boolean isAuth) {
        if(isAuth) {
            return password;
        }
        return "Not Allowed";
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin){
            this.password=password;
        }
        else{
            System.out.println("Not Allowed");
        }
    }
}
