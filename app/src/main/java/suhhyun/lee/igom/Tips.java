package suhhyun.lee.igom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Tips extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips);
        Button Insurances = findViewById(R.id.button);
        Button LocalFunding = findViewById(R.id.button5);
        Button GovernmentSupport = findViewById(R.id.button6);

        Insurances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Tips.this, Insurances.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });
        LocalFunding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Tips.this, LocalFunding.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });
        GovernmentSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Tips.this, Government_Support.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });
    }
}
