package com.example.chooseforme;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button rollButton = (Button) findViewById(R.id.RollButton);
            TextView resultsText = (TextView) findViewById(R.id.ResultsText);
            TextView sizeIdx = (TextView) findViewById(R.id.SizeIdx);
            SeekBar rangeSlider = (SeekBar) findViewById(R.id.RangeSlider);

            rangeSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    sizeIdx.setText(String.valueOf(progress + 2));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    // do nothing here
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    // do nothing here
                }
            });

            rollButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double range = rangeSlider.getProgress() + 2;
                    int random = (int) (Math.random() * range) + 1;
                    resultsText.setText(String.valueOf(random));
                };
            });

        }
    }