package com.example.leiturapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class cap2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cap2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.cap2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        findViewById(R.id.imgVolta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(getApplicationContext(), cap1.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(cap2.this, view, "fade_in");
                startActivity(tela, options.toBundle());
            }
        });
    }

}