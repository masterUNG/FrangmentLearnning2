package appewtc.masterung.frangmentlearnning2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Fragment myFragment;
    private Button btnActivity;
    private MyFragment objMyFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        btnActivity = (Button) findViewById(R.id.btnActivity);
        myFragment = getFragmentManager().findFragmentById(R.id.fragment);
        objMyFragment = (MyFragment) myFragment;

        //Button Controller
        buttonController();

    }   // onCreate

    private void buttonController() {
        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                objMyFragment.changeBackImage();
            }
        });
    }


}   // Main Class
