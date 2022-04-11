package suhhyun.lee.igom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Nearme extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nearme2);
        Button searchHospital = findViewById(R.id.button7);
        Button searchPharmacy = findViewById(R.id.button8);

        searchHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Nearme.this, Map.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });
        searchPharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Nearme.this, Map.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });

    }
}

