package our.miniproject.skillship;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;

public class Settings extends AppCompatActivity {

    FirebaseAuth firebaseAuth;
    Button lout;
    private DatabaseReference databaseReference;
    private StorageReference storageReference;
    private ImageView imageView;
    String currentid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Toolbar toolbar = findViewById(R.id.settings_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Settings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lout = findViewById(R.id.lout);
        firebaseAuth =  FirebaseAuth.getInstance();

        currentid = firebaseAuth.getCurrentUser().getUid();

        lout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                startActivity(new Intent(Settings.this, Loginpage.class));
                finish();
            }
        });
    }
}
