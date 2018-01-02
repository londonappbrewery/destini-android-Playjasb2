package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryIndex;

    private Story[] storyBank = {new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)
    };

    private int[] endings = {R.string.T4_End, R.string.T5_End, R.string.T6_End};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 0 || mStoryIndex == 1){
                    mStoryIndex = 2;
                    updateView();
                } else {
                    updateView(2);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mStoryIndex){
                    case 0:
                        mStoryIndex = 1;
                        updateView();
                        break;
                    case 1:
                        updateView(0);
                        break;
                    case 2:
                        updateView(1);
                        break;
                }
            }
        });

    }

    private void updateView() {
        Story new_story = storyBank[mStoryIndex];

        mStoryTextView.setText(new_story.getStoryID());
        mButtonTop.setText(new_story.getFirstOptionID());
        mButtonBottom.setText(new_story.getSecondOptionID());
    }

    private void updateView(int endingIndex){
        mStoryTextView.setText(endings[endingIndex]);
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }

}
