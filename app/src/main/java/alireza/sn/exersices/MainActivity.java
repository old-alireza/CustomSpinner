package alireza.sn.exersices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
//    Spinner spinner1 ,spinner2 , spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner = findViewById(R.id.myspinner);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this,R.array.number, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //custom spinner
//
//        //find views********************************
//        setContentView(R.layout.activity_main);
//        spinner1 = findViewById(R.id.spinner1);
//        spinner2 = findViewById(R.id.spinner2);
//        spinner3 = findViewById(R.id.spinner3);
//        //*******************************************
//
//        String[] value = new String[]{"1","2","3"};
//
//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(value));
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.style_text_spinner,arrayList);
//        spinner1.setAdapter(arrayAdapter);
//
//        String[] value2 = new String[]{"A","B","C","D","E","F"};
//        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(value2));
//        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(this,R.layout.style_text_spinner,arrayList1);
//        spinner2.setAdapter(arrayAdapter1);
    }
}