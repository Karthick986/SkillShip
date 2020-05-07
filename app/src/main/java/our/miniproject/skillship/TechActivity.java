package our.miniproject.skillship;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TechActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_learn);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tech_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tech Commnunity");
        toolbar.setTitleTextColor(Color.WHITE);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navtech);
        bottomNavigationView.setSelectedItemId(R.id.bot_tech);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.bot_explore:
                        startActivity(new Intent(getApplicationContext(), ExploreActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.bot_home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.bot_tech:
                        return true;
                }
                return false;
            }
        });
    }
}
