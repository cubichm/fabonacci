package com.bignerdranch.android.fabonacci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mainActivity extends AppCompatActivity {


    private TextView output;
    private EditText input;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output= (TextView)findViewById(R.id.show_result);


                input=(EditText)findViewById(R.id.input_length);
b1=(Button)findViewById(R.id.press_it);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });


    }

    public void add(){
int n =Integer.parseInt(input.getText().toString());
        int [] arr = new int[n];
        arr [0]=0;
        arr [1]=1;
        for (int i=2; i<n; i++){
            arr [i]=arr[i-2]+arr [i-1];

        }

        StringBuilder sb = new StringBuilder();
        boolean appendSeprator = false;
        for (int y=0; y<n; y++){
            if (appendSeprator)
                sb.append(',');
            appendSeprator=true;
            sb.append(arr[y]);
        }
        output.setText(sb.toString());

    }
}
