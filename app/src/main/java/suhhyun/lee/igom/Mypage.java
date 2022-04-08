package suhhyun.lee.igom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Mypage extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage2);
        Button ChangePFP = findViewById(R.id.button13);
        Button EditInfo = findViewById(R.id.button14);

        ChangePFP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Mypage.this, Translator.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });
        EditInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Mypage.this, Translator.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });
    }
}

