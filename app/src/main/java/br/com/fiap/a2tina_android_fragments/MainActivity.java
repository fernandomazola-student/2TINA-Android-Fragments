package br.com.fiap.a2tina_android_fragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentContainer = (FrameLayout)findViewById(R.id.fragment_container);
    }

    public void alteraFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
    }

    public void exibirCarro1(View view) {
        alteraFragment(new Carro1Fragment());
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Carro1Fragment()).commit();
    }

    public void exibirCarro2(View view) {
        alteraFragment(new Carro2Fragment());
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Carro2Fragment()).commit();
    }
}
