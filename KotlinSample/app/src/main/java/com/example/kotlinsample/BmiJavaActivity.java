package com.example.kotlinsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    // 불필요한 findViewById 함수를 피하기 위해 UI 요소를 멤버 변수로 가지고 있는다.
    EditText tallField;
    EditText weightField;
    TextView resultLabel;
    Button bmiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // UI로 사용할 레이아웃 XML 파일을 지정한다.
        setContentView(R.layout.layout_view_binding);

        // UI 요소 멤버변수를 XML 레이아웃에서 findViewById 함수를 이용해 바인딩한다. 한번만!
        tallField = findViewById(R.id.tallField);
        weightField = findViewById(R.id.weightField);
        resultLabel = findViewById(R.id.resultLabel);
        bmiButton = findViewById(R.id.bmiButton);

        // bmiButton이 클릭된 경우의 이벤트 리스너를 등록한다.
        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tallField의 값을 읽어온다.
                String tall = tallField.getText().toString();

                // weightField의 값을 읽어온다.
                String weight = weightField.getText().toString();

                // BMI를 계산한다. 체중(kg) / 키(m)^2
                // Math.pow() 는 넘겨받은 파라미터 값을 제곱해서 돌려준다.
                // 예를 들어 Math.pow(2, 3) 은 2의 3제곱을 돌려준다.
                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0, 2);

                // 결과 bmi를 resultLabel에 보여준다.
                resultLabel.setText("키" + tall + ", 체중: " + weight + ", BMI: " + bmi);
            }
        });
    }
}