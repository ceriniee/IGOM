package suhhyun.lee.igom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Emergency extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency2);
        Button NineOneOne = findViewById(R.id.button10);
        TextView mom = findViewById(R.id.mom_num);
        TextView dad = findViewById(R.id.dad_num);
        TextView brother = findViewById(R.id.bro_num);

        NineOneOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Emergency.this, Translator.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });
        mom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = mom.getText().toString();
            }
        });
        dad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = dad.getText().toString();
        }
    });
        brother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = brother.getText().toString();
            }
        });
}

}

