package com.example.diskone.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.diskone.FakeDatabase;
import com.example.diskone.outros.OneboardingAdapter;
import com.example.diskone.R;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class TutorialActivity extends AppCompatActivity {
    private OneboardingAdapter oneboardingAdapter;
    private LinearLayout linearLayoutOnboardingIndicators;
    private MaterialButton buttonOnboardingAction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        setupOnboardingItens();

        ViewPager2 viewPager2 = findViewById(R.id.viewPager2Onebording);
        viewPager2.setAdapter(oneboardingAdapter);

        linearLayoutOnboardingIndicators = findViewById(R.id.linearOneboarding);
        buttonOnboardingAction = findViewById(R.id.buttonOnBoardingAction);

        setupOnboardingIndicators();
        setCurrentOnboardingIndicator(0);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentOnboardingIndicator(position);
            }
        });

        buttonOnboardingAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(viewPager2.getCurrentItem() +1<oneboardingAdapter.getItemCount()){
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem()+ 1);
                }else{
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
            }
        });
    }

    private void setupOnboardingItens(){
        ArrayList<FakeDatabase.Walkthrough> walkthroughs = new ArrayList<>();

        FakeDatabase.Walkthrough walkthrough1 = new FakeDatabase.Walkthrough();
        FakeDatabase.Walkthrough walkthrough2 = new FakeDatabase.Walkthrough();
        FakeDatabase.Walkthrough walkthrough3 = new FakeDatabase.Walkthrough();
        walkthrough1.setTitle("Oque é?");
        walkthrough1.setDescription("A gastronomia (do grego gastronomía) é um ramo de conhecimento que abrange a culinária, as bebidas, os materiais usados na alimentação e, em geral, todos os aspectos culturais a ela associados.");
        walkthrough1.setImageURL(R.drawable.imagetutorial1);
        walkthroughs.add(walkthrough1);

        walkthrough2.setTitle("Por que?");
        walkthrough2.setDescription("O prazer proporcionado pela comida é um dos fatores mais importantes da vida depois da alimentação de sobrevivência. A gastronomia nasceu desse prazer e constituiu-se como a arte de cozinhar e associar os alimentos para, deles, retirar o máximo benefício.");
        walkthrough2.setImageURL(R.drawable.imagetutorial2);
        walkthroughs.add(walkthrough2);

        walkthrough3.setTitle("Então, oque obtivemos?");
        walkthrough3.setDescription("A humanidade cedo se percebeu das virtudes da associação de certas plantas aromáticas aos alimentos para lhes exaltar o sabor, contribuir para a sua conservação e permitir uma melhor e mais saudável assimilação por parte do corpo.");
        walkthrough3.setImageURL(R.drawable.imagetutorial3);
        walkthroughs.add(walkthrough3);


        oneboardingAdapter = new OneboardingAdapter(this, walkthroughs);
    }

    private void setupOnboardingIndicators(){
        ImageView[] indicators = new ImageView[oneboardingAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8,0,8,0);
        for(int i =0; i<indicators.length; i++){
            indicators[i] = new ImageView(getApplicationContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.onboarding_indicator_inactive
            ));
            indicators[i].setLayoutParams(layoutParams);
            linearLayoutOnboardingIndicators.addView(indicators[i]);
        }
    }

    private void setCurrentOnboardingIndicator(int index){
        int childCount = linearLayoutOnboardingIndicators.getChildCount();
        for(int i = 0; i <childCount; i++){
            ImageView imageView = (ImageView) linearLayoutOnboardingIndicators.getChildAt(i);
            if(i==index){
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_active)
                );
            } else{
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_inactive)
                );
            }
        }
        if(index == oneboardingAdapter.getItemCount() -1){

            buttonOnboardingAction.setTextSize(10);
            buttonOnboardingAction.setText("Iniciar");
        }
        else {
            buttonOnboardingAction.setTextSize(8);
            buttonOnboardingAction.setText("Proximo");
        }
    }
}