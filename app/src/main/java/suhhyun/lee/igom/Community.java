package suhhyun.lee.igom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Community extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community2);
        Button Post = findViewById(R.id.button9);

        Post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Community.this, PostCommunity.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });
    }
}
