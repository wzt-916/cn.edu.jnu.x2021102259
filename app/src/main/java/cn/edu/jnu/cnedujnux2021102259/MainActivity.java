package cn.edu.jnu.cnedujnux2021102259;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCalculate=this.findViewById(R.id.button);
        final EditText editTextScores=this.findViewById(R.id.editTextText);
        final TextView textViewScore=this.findViewById(R.id.textView);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String scores=editTextScores.getText().toString();
                String []arrayScore=scores.split(",");
                Game game=new Game();
                for(int i=0;i<arrayScore.length;i++){
                    game.roll(Integer.parseInt(arrayScore[i]));
                }
                textViewScore.setText(game.score()+"");
            }
        });
    }

}