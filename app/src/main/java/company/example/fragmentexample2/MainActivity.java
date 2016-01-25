package company.example.fragmentexample2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import company.example.fragmentexample2.Fragments.Fragment1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoad1(View view) {
        Fragment1 fr1 = new Fragment1();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        //Closing the transaction
        ft.commit();
    }

    public void onLoad2(View view) {
    }
}
