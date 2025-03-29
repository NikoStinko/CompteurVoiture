package fr.univ_pau.compteur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnMoins, btnReset, btnPlus;
    TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoins = findViewById(R.id.btn_moins);
        btnPlus = findViewById(R.id.btn_plus);
        btnReset = findViewById(R.id.btn_reset);
        tvCount = findViewById(R.id.tv_count);
        tvCount.setText("0");

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count  = Integer.parseInt(tvCount.getText().toString());
                count++;
                tvCount.setText(String.valueOf(count));
            }
        });
    }

    //Reaction au clic sur bouton Moins
    public void onClickMoins(View view){
        //je récupère et je transforme le nombre affiché
        int count  = Integer.parseInt(tvCount.getText().toString());
        count--;
        tvCount.setText(String.valueOf(count));
    }
}