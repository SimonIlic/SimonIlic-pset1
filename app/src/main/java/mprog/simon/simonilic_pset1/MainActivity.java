package mprog.simon.simonilic_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeVisibility(View buttonView, View view) {
        boolean checked = ((ToggleButton) buttonView).isChecked();

        if (checked)
        {
            view.setVisibility(view.VISIBLE);
        }
        else
        {
            view.setVisibility(view.INVISIBLE);
        }
    }


    public void changeEars(View view) {
        View imageView = findViewById(R.id.ears);
        changeVisibility(view, imageView);
    }


    public void changeNose(View view) {
        View imageView = findViewById(R.id.nose);
        changeVisibility(view, imageView);
    }

    public void changeMouth(View view) {
        View imageView = findViewById(R.id.mouth);
        changeVisibility(view, imageView);
    }

    public void changeEyes(View view) {
        View imageView = findViewById(R.id.eyes);
        changeVisibility(view, imageView);
    }

    public void changeEyebrows(View view) {
        View imageView = findViewById(R.id.eyebrows);
        changeVisibility(view, imageView);
    }

    public void changeGlasses(View view) {
        View imageView = findViewById(R.id.glasses);
        changeVisibility(view, imageView);
    }

    public void changeArms(View view) {
        View imageView = findViewById(R.id.arms);
        changeVisibility(view, imageView);
    }

    public void changeMoustache(View view) {
        View imageView = findViewById(R.id.mustache);
        changeVisibility(view, imageView);
    }

    public void changeHat(View view) {
        View imageView = findViewById(R.id.hat);
        changeVisibility(view, imageView);
    }

    public void changeShoes(View view) {
        View imageView = findViewById(R.id.shoes);
        changeVisibility(view, imageView);
    }
}
