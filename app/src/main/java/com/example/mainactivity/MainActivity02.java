package com.example.mainactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity02 extends AppCompatActivity {

    LinearLayout personLinearLayout;
    FloatingActionButton favorite;
    CardView cactusCardView, elegentCardView, architechtureCardView, beachCardView, woodenCardView, traditionalchairCardView, plantCardView, chairCardView, lampCardView;
    private FirebaseAuth mAuth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);

        mAuth = FirebaseAuth.getInstance();

        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null) {
            Intent intent = new Intent(MainActivity02.this, MainActivity.class);
            startActivity(intent);
            finish();
            return;
        }

        personLinearLayout = findViewById(R.id.person_linear_layout);
        favorite = findViewById(R.id.favorite);
        cactusCardView = findViewById(R.id.cactus_card_view);
        elegentCardView = findViewById(R.id.elegent);
        architechtureCardView = findViewById(R.id.architecture);
        beachCardView = findViewById(R.id.beach);
        woodenCardView = findViewById(R.id.wooden);
        traditionalchairCardView = findViewById(R.id.traditional);
        plantCardView = findViewById(R.id.plant);
        chairCardView = findViewById(R.id.chair);
        lampCardView = findViewById(R.id.lamp);

        personLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity03.class);
            startActivity(intent);
        });

        favorite.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
            startActivity(intent);
        });

        cactusCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
            intent.putExtra("Cartus", "1"); // Pass identifier
            startActivity(intent);
        });

        elegentCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
            intent.putExtra("Elegent", "2"); // Pass identifier
            startActivity(intent);
        });

        architechtureCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
            intent.putExtra("Architecture", "3"); // Pass identifier
            startActivity(intent);
        });

        beachCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
            intent.putExtra("ITEM_ID", "4"); // Pass identifier
            startActivity(intent);
        });

        woodenCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
            intent.putExtra("Wooden", "5"); // Pass identifier
            startActivity(intent);
        });

        traditionalchairCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
            intent.putExtra("Traditional", "6"); // Pass identifier
            startActivity(intent);
        });

        plantCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
            intent.putExtra("Plant", "7"); // Pass identifier
            startActivity(intent);
        });

        chairCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
            intent.putExtra("Chair", "8"); // Pass identifier
            startActivity(intent);
        });

        lampCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
            intent.putExtra("Lamp", "9"); // Pass identifier
            startActivity(intent);
        });
    }
}
