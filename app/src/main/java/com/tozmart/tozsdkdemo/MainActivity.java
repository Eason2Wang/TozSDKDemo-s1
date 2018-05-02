package com.tozmart.tozsdkdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tozmart.toz_sdk.beans.CustomerInfo;
import com.tozmart.toz_sdk.ui.activities.CameraBackActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tv = (Button) findViewById(R.id.sample_text);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MainActivity.this, CameraBackActivity.class);
                CustomerInfo customerInfo = new CustomerInfo();
                customerInfo.setCorId("100");
                customerInfo.setUserId("10000");
                customerInfo.setUserName("test");
                customerInfo.setUserHeight(180.f);
                customerInfo.setUserWeight(75.f);
                customerInfo.setUserGender("1");
                Bundle bundle = new Bundle();
                bundle.putParcelable("customerInfo", customerInfo);
                cameraIntent.putExtras(bundle);
                startActivity(cameraIntent);
            }
        });
    }
}
