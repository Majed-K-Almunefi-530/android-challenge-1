package com.example.tictactoe;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public  class MainActivity extends AppCompatActivity {
    private Button next;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button yourButton = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });

    }

    public void openactivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}