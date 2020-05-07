package our.miniproject.skillship;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegInformation {

    private FirebaseAuth firebaseAuth;
    private FirebaseUser firebaseUser;

    public String username, erpid, email, pass, role, profileimage, college;

    public RegInformation() {

    }

    public RegInformation(String role, String username, String erpid, String email, String pass, String profileimage, String college) {
        this.role = role;
        this.username = username;
        this.erpid = erpid;
        this.email = email;
        this.pass = pass;
        this.profileimage = profileimage;
        this.college = college;
    }
}

