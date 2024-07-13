package com.example.wearespeakers;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HistoryChatActivity extends Activity {
    private Button btn_historychat_return;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_chat);
        init();

        //返回主界面
        btn_historychat_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HistoryChatActivity.this.finish();
            }
        });


    }
    private void init(){
        btn_historychat_return=findViewById(R.id.btn_historychat_return);
    }
}