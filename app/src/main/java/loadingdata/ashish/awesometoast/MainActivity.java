package loadingdata.ashish.awesometoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    CardView Info,Download,Error,Confusion,Warning,Default;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Widget_Initialisation();
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Awesome Toast");
        }
    }

    private void Widget_Initialisation() {
        Info=(CardView)findViewById(R.id.information);
        Download=(CardView)findViewById(R.id.download);
        Error=(CardView)findViewById(R.id.error);
        Confusion=(CardView)findViewById(R.id.confusion);
        Warning=(CardView)findViewById(R.id.warning);
        Default=(CardView)findViewById(R.id.def);
        toolbar=(Toolbar)findViewById(R.id.my_toolbar);
    }
}
