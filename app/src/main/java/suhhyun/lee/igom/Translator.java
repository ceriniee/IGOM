package suhhyun.lee.igom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Translator extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translator);
        Button translate = findViewById(R.id.button17);

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Translator.this, Translator.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });

        //button
    }
}

