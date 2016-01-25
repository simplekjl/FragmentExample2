package company.example.fragmentexample2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import company.example.fragmentexample2.Fragments.Fragment1;
import company.example.fragmentexample2.Fragments.Fragment2;

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
        ft.replace(R.id.panelizator, fr1,"FT");

        //Closing the transaction
        ft.commit();
    }

    public void onLoad2(View view) {
        Fragment2 fr2 = new Fragment2();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.panelizator, fr2,"FT");

        //Closing the transaction
        ft.commit();
    }
}
