package com.example.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    TextView titleTextView, subtitleTextView, descriptionTextView, shopTextView;
    ImageView mainImageView, ratingImageView;
    Button rentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        // Initialize views
        titleTextView = findViewById(R.id.title_text_view);
        subtitleTextView = findViewById(R.id.subtitle_text_view);
        descriptionTextView = findViewById(R.id.description_text_view);
        shopTextView = findViewById(R.id.shop_text_view);
        mainImageView = findViewById(R.id.main_image_view);
        ratingImageView = findViewById(R.id.rating_image_view);
        rentButton = findViewById(R.id.rent_button);

        // Set custom back button in ActionBar/Toolbar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true); // Show back button
        }

        // Retrieve the identifier from the intent
        Intent intent = getIntent();
        String itemId = intent.getStringExtra("ITEM_ID");

        // Use the identifier to determine the clicked item and update the UI
        if (itemId != null) {
            switch (itemId) {
                case "cactus":
                    titleTextView.setText("Cactus");
                    subtitleTextView.setText("S19");
                    descriptionTextView.setText("In addition to being a decoration, cactus can also be a health benefit. Let's buy cactus in our store because now it's 30% off!");
                    shopTextView.setText("Wildan Shop");
                    mainImageView.setImageResource(R.drawable.favorite_img_4); // Ensure this image exists in your drawable folder
                    ratingImageView.setImageResource(R.drawable.four_star); // Ensure this image exists in your drawable folder
                    break;
                case "elegent":
                    titleTextView.setText("Elegent");
                    subtitleTextView.setText("A20");
                    descriptionTextView.setText("This is another great item. Check it out in our store now with a 25% discount!");
                    shopTextView.setText("Another Shop");
                    mainImageView.setImageResource(R.drawable.favorite_img_2); // Ensure this image exists in your drawable folder
                    ratingImageView.setImageResource(R.drawable.four_star); // Ensure this image exists in your drawable folder
                    break;

                case "architecture":
                    titleTextView.setText("Architecture");
                    subtitleTextView.setText("A20");
                    descriptionTextView.setText("This is another great item. Check it out in our store now with a 30% discount!");
                    shopTextView.setText("Another Shop");
                    mainImageView.setImageResource(R.drawable.favorite_img_3); // Ensure this image exists in your drawable folder
                    ratingImageView.setImageResource(R.drawable.four_star); // Ensure this image exists in your drawable folder
                    break;
                case "beach":
                    titleTextView.setText("Beach");
                    subtitleTextView.setText("A20");
                    descriptionTextView.setText("This is another great item. Check it out in our store now with a 20% discount!");
                    shopTextView.setText("Another Shop");
                    mainImageView.setImageResource(R.drawable.favorite_img_4); // Ensure this image exists in your drawable folder
                    ratingImageView.setImageResource(R.drawable.four_star); // Ensure this image exists in your drawable folder
                    break;
                case "wooden":
                    titleTextView.setText("Wooden Chair");
                    subtitleTextView.setText("A20");
                    descriptionTextView.setText("This is great item. Check it out in our store now with a 10% discount!");
                    shopTextView.setText("Another Shop");
                    mainImageView.setImageResource(R.drawable.favorite_img_5); // Ensure this image exists in your drawable folder
                    ratingImageView.setImageResource(R.drawable.four_star); // Ensure this image exists in your drawable folder
                    break;
                case "traditional":
                    titleTextView.setText("Traditional");
                    subtitleTextView.setText("A20");
                    descriptionTextView.setText("This is great item. Check it out in our store now with a 15% discount!");
                    shopTextView.setText("Another Shop");
                    mainImageView.setImageResource(R.drawable.favorite_img_6); // Ensure this image exists in your drawable folder
                    ratingImageView.setImageResource(R.drawable.four_star); // Ensure this image exists in your drawable folder
                    break;

            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {
            onBackPressed(); //
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


 