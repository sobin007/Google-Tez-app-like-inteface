package touch.in.keep.sobin.roundbutton;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    CoordinatorLayout mCoordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mCoordinatorLayout = (CoordinatorLayout)findViewById(R.id.coordinator);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        if (fab != null) {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(mCoordinatorLayout, "I'm a Snackbar", Snackbar.LENGTH_LONG).setAction("Action", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(HomeActivity.this, "Snackbar Action", Toast.LENGTH_LONG).show();
                        }
                    }).show();
                }
            });
        }
    }

    public void next(View view){

        Intent intent =new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
}
