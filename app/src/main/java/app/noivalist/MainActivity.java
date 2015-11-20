package app.noivalist;

/**
 * Created by Alan on 23/10/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText txtname;
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname = (EditText)findViewById(R.id.inputNome);
        start = (Button) findViewById(R.id.btStart);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = txtname.getText().toString();
                //Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();
                startMenu();
            }
        });
    }
    private void startMenu(){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
