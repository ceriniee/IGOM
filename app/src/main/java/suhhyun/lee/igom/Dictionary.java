package suhhyun.lee.igom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Dictionary extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary2);
        TextInputEditText input = findViewById(R.id.input);
        ImageButton Search = findViewById(R.id.imageButton9);
        ImageView imv = findViewById(R.id.imageView10);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Dictionary.this, Translator.class); // 이동 해야 되는 페이지
                startActivity(it);
                finish();
            }
        });
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = input.getText().toString();
                if (query.equals("Tylenol")){
                    tv1.setText("pain reliever and a fever reducer");
                    tv2.setText("Allergic reactions, nausea, upper stomach pain, itching, loss of appetite, dark urine, clay-colored stools; jaundice");
                    imv.setImageResource(R.drawable.tylenol);
                }
                else if (query.equals("Ibuprofen")){
                    tv1.setText("anti-inflammatory drug; treating pain, fever, and inflammation");
                    tv2.setText("Nausea, vomiting, stomach pain, feeling tired or sleepy, black stool and blood in your vomit – a sign of bleeding in your stomach, ringing in your ears (tinnitus), difficulty breathing or changes in your heart rate (slower or faster)");
                    imv.setImageResource(R.drawable.ibuprofen);
                }
                else if (query.equals("Antihistamine")){
                    tv1.setText("treats allergic rhinitis, common cold, influenza, and other allergies");
                    tv2.setText("Drowsiness, dry mouth, dry eyes, blurred or double vision, dizziness and headache, low blood pressure");
                    imv.setImageResource(R.drawable.antihistamine);
                }
                else if (query.equals("Fentanyl")){
                    tv1.setText("used as a pain medication and, together with other medications, for anesthesia");
                    tv2.setText("Drowsiness, confusion, dizziness, nausea, vomiting, wind, cramps, constipation, diarrhoea, rash (inflammation, itch, swelling at patch site), weakness, fatigue");
                    imv.setImageResource(R.drawable.fentanyl);
                }
                else if (query.equals("Ampicillin")){
                    tv1.setText("Used to prevent and treat a number of bacterial infections, such as respiratory tract infections, urinary tract infections, meningitis, salmonellosis, and endocarditis.");
                    tv2.setText("Acute inflammatory skin eruption (erythema multiforme), redness and peeling of the skin (exfoliative dermatitis), rash, hives, fever, seizure");
                    imv.setImageResource(R.drawable.ampicillin);
                }
                else if (query.equals("Carbamazepine")){
                    tv1.setText("Anticonvulsant, also used to treat bipolar disorder");
                    tv2.setText("Dizziness, loss of coordination, problems with walking, nausea, vomiting; or drowsiness");
                    imv.setImageResource(R.drawable.ampicillin);
                }
                else {
                    tv1.setText("Result not found in Dictionary");
                }
            }
        });
    }
}

