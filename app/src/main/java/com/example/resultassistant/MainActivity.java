package com.example.resultassistant;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.TestLooperManager;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3,editText4,editText5,editText6;
    Button button1;
    TextView textView;
    private String credit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle bundle = getIntent().getExtras();
        final String message = bundle.getString("abc");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.quiz1);
        editText2=findViewById(R.id.quiz2);
        editText3=findViewById(R.id.quiz3);
        editText4=findViewById(R.id.quiz4);
        editText5=findViewById(R.id.mid);
        editText6=findViewById(R.id.Attendance);
        button1=findViewById(R.id.button);
        textView=findViewById(R.id.answer);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String q1=editText1.getText().toString();
                String q2=editText2.getText().toString();
                String q3=editText3.getText().toString();
                String q4=editText4.getText().toString();
                String q5=editText5.getText().toString();
                String q6=editText6.getText().toString();

                int num1= Integer.parseInt(q1);
                int num2= Integer.parseInt(q2);
                int num3= Integer.parseInt(q3);
                int num4= Integer.parseInt(q4);
                int num5= Integer.parseInt(q5);
                int num6= Integer.parseInt(q6);
                int cred=Integer.parseInt(message);
                if(num1<=num2&&num1<=num3&&num1<=num4)num1=0;
                else if(num2<=num1&&num2<=num3&&num2<=num4)num2=0;
                else if(num3<=num2&&num3<=num1&&num3<=num4)num3=0;
                else num4=0;
                int sum=(num1+num2+num3+num4)+num5+num6;
                textView.setText("You need "+ (cred*80-sum)+" in semester final to get A+");
            }
        });
    }
}












