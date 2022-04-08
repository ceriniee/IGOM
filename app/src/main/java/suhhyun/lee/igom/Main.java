package suhhyun.lee.igom;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageButton About = findViewById(R.id.aboutIGOM);
        ImageButton Translator = findViewById(R.id.imageButton3);
        ImageButton MyPage = findViewById(R.id.imageButton4);
        ImageButton MedicalDictionary = findViewById(R.id.imageButton5);
        ImageButton Tips = findViewById(R.id.imageButton6);
        ImageButton NearMe = findViewById(R.id.imageButton7);
        ImageButton Community = findViewById(R.id.imageButton11);
        ImageButton Emergency = findViewById(R.id.imageButton12);
        ImageButton Settings = findViewById(R.id.imageButton13);


        Translator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent it = new Intent(Main.this, Translator.class); // 이동 해야 되는 페이지
                    startActivity(it);
                    //finish();
            }
        });
        MyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent it = new Intent(Main.this, Mypage.class); // 이동 해야 되는 페이지
                    startActivity(it);
                    //finish();
            }
        });
        MedicalDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent it = new Intent(Main.this, Dictionary.class); // 이동 해야 되는 페이지
                    startActivity(it);
                    //finish();
            }
        });
        Tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main.this, Tips.class); // 이동 해야 되는 페이지
                startActivity(it);
                //finish();
            }
        });
        NearMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main.this, Nearme.class); // 이동 해야 되는 페이지
                startActivity(it);
                //finish();
            }
        });
        Community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main.this, Community.class); // 이동 해야 되는 페이지
                startActivity(it);
                //finish();
            }
        });
        Emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main.this, Emergency.class); // 이동 해야 되는 페이지
                startActivity(it);
                //finish();
            }
        });
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main.this, About.class); // 이동 해야 되는 페이지
                startActivity(it);
                //finish();
            }
        });
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main.this, Settings.class); // 이동 해야 되는 페이지
                startActivity(it);
                //finish();
            }
        });

    }
}