package suhhyun.lee.igom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Translator extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translator);
        Button translate = findViewById(R.id.button17);
        TextInputEditText editText= findViewById(R.id.inputT);
        TextView tv = findViewById(R.id.textView29);

        String[] eng = {"Where can I get my insurance certificate?","Where is the elevator?","Your blood pressure is very low."};
        String[] kor = {"보험 진단서 어디에서 뗄 수 있을까요?","엘리베이터는 어디에 있나요?","혈압이 굉장히 낮네요."};

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = editText.getText().toString();
                Toast.makeText(Translator.this, eng[0], Toast.LENGTH_LONG).show();
                if(query.equals(eng[0])){
                    Toast.makeText(Translator.this, eng[0], Toast.LENGTH_LONG).show();
                    tv.setText(kor[0]);
                }
                else if(query.equals(eng[1])){
                    tv.setText(kor[1]);
                }
                else if(query.equals(eng[2])){
                    tv.setText(kor[2]);
                }
                else {tv.setText("use Google translator");}

            }
        });

        //button
    }
}

