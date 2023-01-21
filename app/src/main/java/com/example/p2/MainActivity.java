package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtweight ,edtheightft ,editheightin;
        Chip click;
        TextView text ,textb ,textp,textgit;

        edtweight=findViewById(R.id.edtweigth);
        edtheightft=findViewById(R.id.edtheightft);
        editheightin=findViewById(R.id.edtheightin);
        click=findViewById(R.id.chip);
        text=findViewById(R.id.textView);
        textb =findViewById(R.id.textViewb);
        textp=findViewById(R.id.textViewp);
        textgit=findViewById(R.id.textViewgit);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt=Integer.parseInt(edtweight.getText().toString());
                int hft=Integer.parseInt(edtheightft.getText().toString());
                int hin=Integer.parseInt(editheightin.getText().toString());

                int tinch=hft*12+hin;
                double tcm=tinch*2.53;
                double totalM=tcm/100;
                double bmi=wt/(totalM*totalM);

                if (bmi>=18.5 && bmi<=24.9){
                    text.setText("You are HealthyWeight");

                } else if (bmi<18.5) {
                    text.setText("You are UnderWeight");
                    textb.setText("What's a good way to gain weight if you're underweight?");
                    textp.setText("ting nutritious foods that are high in calories is a good way to gain weight. It's also important to understand the reason why you're underweight.\n" +
                            "\n" +
                            "Being underweight can be defined in a couple of ways. It can mean low weight for a person's height, defined as a body mass index (BMI) of less than 18.5. It also could be weight that is 15 to 20% below the typical weight for a person's age.\n" +
                            "\n" +
                            "There are many reasons you may not be at your goal weight. Recovering from an illness or losing weight as you age are two examples. It's also common for athletes to want to gain weight as muscle.\n" +
                            "\n" +
                            "It is best to see your health care provider if you lost weight unexpectedly. Your provider or a dietitian can help you gain weight in a healthy way. Together, you can create a plan based on your needs.");

                }else{
                    text.setText("You are OverWeight");
                    textb.setText("Health risks of extra weight");
                    textp.setText("Excess weight has the following effects on the body:\n" +
                            "\n" +
                            "It increases how hard the heart has to work.\n" +
                            "It raises blood pressure, blood cholesterol and triglyceride levels.\n" +
                            "It lowers high-density lipoprotein (HDL), or good cholesterol levels.\n" +
                            "It can make diabetes and other health problems more likely.");
                }

            }
        });

    }
}