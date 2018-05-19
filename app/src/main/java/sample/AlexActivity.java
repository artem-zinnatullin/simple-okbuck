package sample;

import android.app.Activity;
import android.os.Bundle;
import com.lyft.okbucksample.R;

public class AlexActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alex);
        System.out.println("Oh hai Mark");
    }
}
