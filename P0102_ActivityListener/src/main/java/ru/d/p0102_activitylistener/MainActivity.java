package ru.d.p0102_activitylistener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvOut = (TextView) findViewById(R.id.tvOut) ;
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        btnCancel.setOnClickListener(this);
        btnOk.setOnClickListener(this);
    }

    public void OnClickStart(View view){

    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnCancel:
                tvOut.setText("Вы нажали Cancel");
                break;
            case R.id.btnOk:
                tvOut.setText("Вы нажали Ок");
                break;
        }
    }
}
