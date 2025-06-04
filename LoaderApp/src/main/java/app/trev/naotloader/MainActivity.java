package app.trev.naotloader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = new Button(this);
        button.setText("Click to load native library");
        button.setOnClickListener(v -> {
            System.loadLibrary("naotlib");
            button.setText("Native library loaded successfully!");
        });

        setContentView(button);
    }
}
