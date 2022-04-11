package suhhyun.lee.igom;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

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
                if (ContextCompat.checkSelfPermission(Emergency.this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED) {
                    Intent it = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "911"));
                    startActivity(it);
                } else {
                    ActivityCompat.requestPermissions(
                            Emergency.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            123);
                }
            }
        });
        mom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = mom.getText().toString();
                if (ContextCompat.checkSelfPermission(Emergency.this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED) {
                    Intent it = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + num));
                    startActivity(it);
                } else {
                    ActivityCompat.requestPermissions(
                            Emergency.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            123);
                }
            }
        });
        dad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = dad.getText().toString();
                if (ContextCompat.checkSelfPermission(Emergency.this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED) {
                    Intent it = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + num));
                    startActivity(it);
                } else {
                    ActivityCompat.requestPermissions(
                            Emergency.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            123);
                }
            }

    });
        brother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = brother.getText().toString();
            if (ContextCompat.checkSelfPermission(Emergency.this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED) {
                Intent it = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + num));
                startActivity(it);
            } else {
                ActivityCompat.requestPermissions(
                        Emergency.this,
                        new String[]{Manifest.permission.CALL_PHONE},
                        123);
            }
        }

        });
}

}

