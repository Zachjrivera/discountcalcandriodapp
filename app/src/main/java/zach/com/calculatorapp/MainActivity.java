package zach.com.calculatorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
       Button clearButton = (Button) findViewById(R.id.clearButton);


        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView resultTextVeiw = (TextView) findViewById(R.id.ResulttextView);
                resultTextVeiw.setText(0+"");
            }
        });




        addButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                EditText firstnumEdittext = (EditText) findViewById(R.id.FirstNumEditText);
                EditText secondnumEditText = (EditText) findViewById(R.id.secondNumberEditText);
                TextView resultTextVeiw = (TextView) findViewById(R.id.ResulttextView);

                double price = Double.parseDouble(firstnumEdittext.getText().toString());
                double discount = Double.parseDouble(secondnumEditText.getText().toString());
                double result = price - (price * (discount/100)) ;
                resultTextVeiw.setText(result + "");
            }
        });




    }
}
