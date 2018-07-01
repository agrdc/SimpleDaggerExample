package com.bilulo.simpledaggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bilulo.simpledaggerexample.session.GameSession;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private GameSession session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).getAppComponent().inject(this);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        tv1.setText(session.data.getPlayerName());
        tv2.setText(session.data.getPlayerID());
        tv3.setText(String.valueOf(session.data.getScore()));
    }

    @Inject
    public void setGameSession(GameSession session) {
        this.session = session;
    }
}
