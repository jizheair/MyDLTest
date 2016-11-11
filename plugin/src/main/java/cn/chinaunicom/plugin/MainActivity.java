package cn.chinaunicom.plugin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ryg.dynamicload.DLBasePluginActivity;


public class MainActivity extends DLBasePluginActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
