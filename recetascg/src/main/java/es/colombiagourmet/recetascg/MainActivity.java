package es.colombiagourmet.recetascg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static int pesoAguacate = 350;
    private static int pesoTomate = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.editText);
        String strPesoFinalAguacate = editText.getText().toString();

        if ("".equals(strPesoFinalAguacate)) {
            int pesoFinalAguacate = Integer.valueOf(strPesoFinalAguacate);
        } else {

        }


    }
}
