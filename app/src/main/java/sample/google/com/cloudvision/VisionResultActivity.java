package sample.google.com.cloudvision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;

public class VisionResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
//        String data = intent.getStringExtra("수치값");
//        Log.d("테스트","인식 : "+data);
        ArrayList<String> dataList = intent.getStringArrayListExtra("data");
        for(int i = 0 ; i< dataList.size();i++){
            Toast.makeText(getApplicationContext(), dataList.get(i),Toast.LENGTH_SHORT).show();
        }


    }
}
