package com.codepath.fbuinstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Movie;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.parse.ParseFile;

import org.parceler.Parcels;

public class PostDetailsActivity extends AppCompatActivity {

    private TextView tvUsername;
    private ImageView ivImage;
    private TextView tvDescription;
    private TextView tvTimestamp;
    private Post post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details2);
        tvUsername = findViewById(R.id.tvUsername);
        ivImage = findViewById(R.id.ivImage);
        tvDescription = findViewById(R.id.tvDescription);
        tvTimestamp = findViewById(R.id.tvTimestamp);

        post = (Post) Parcels.unwrap(getIntent().getParcelableExtra("post"));

        // Bind the post data to the view elements
        tvDescription.setText(post.getDescription());
        tvUsername.setText(post.getUser().getUsername());
        tvTimestamp.setText(PostsAdapter.formatTimestamp(post.getCreatedAt()));
        ParseFile image = post.getImage();
        if (image != null) {
            Glide.with(getApplicationContext()).load(image.getUrl()).into(ivImage);
        }
    }
}