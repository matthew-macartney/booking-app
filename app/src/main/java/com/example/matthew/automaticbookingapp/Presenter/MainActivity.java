package com.example.matthew.automaticbookingapp.Presenter;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.matthew.automaticbookingapp.Model.BookingDetails;
import com.example.matthew.automaticbookingapp.Model.MyBroadcastReceiver;
import com.example.matthew.automaticbookingapp.R;

public class MainActivity extends AppCompatActivity {

    private PendingIntent pendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Retrieve a PendingIntent that will perform a broadcast */
        Intent alarmIntent = new Intent(MainActivity.this, MyBroadcastReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, alarmIntent, 0);
    }

    /** Called when the user taps the Send button */
    public Boolean getOnOrOff(View view) {
        Switch onOrOff = findViewById(R.id.switch1);
        Boolean isOn = onOrOff.isChecked();
        return isOn;
    }

    /** Called when the user taps the Send button */
    public String getDayEntered(View view) {
        EditText editDay = findViewById(R.id.editDay);
        String day = editDay.getText().toString();
        return day;
    }

    /** Called when the user taps the Send button */
    public String getTimeEntered(View view) {
        EditText editTime = findViewById(R.id.courtTime);
        String time = editTime.getText().toString();
        return time;
    }

    /** Called when the user taps the Send button */
    public String getPlayer1Entered(View view) {
        EditText editTextPlayer1 = findViewById(R.id.editTextPlayer1);
        String player1 = editTextPlayer1.getText().toString();
        return player1;
    }

    /** Called when the user taps the Send button */
    public String getPlayer2Entered(View view) {
        EditText editTextPlayer2 = findViewById(R.id.editTextPlayer2);
        String player2 = editTextPlayer2.getText().toString();
        return player2;
    }

    /** Called when the user taps the Send button */
    public String getPlayer3Entered(View view) {
        EditText editTextPlayer3 = findViewById(R.id.editTextPlayer3);
        String player3 = editTextPlayer3.getText().toString();
        return player3;
    }

    /** Called when the user taps the Send button */
    public String getBookingTime(View view) {
        EditText editTextBookingTime = findViewById(R.id.bookingTime);
        String bookingTime = editTextBookingTime.getText().toString();
        return bookingTime;
    }

    /** Called when the user taps the Send button */
    public void updatePressed(View view) {

        BookingDetails booking1 = BookingDetails.getInstance();

        booking1.setOnOrOff(getOnOrOff(view));
        booking1.setDay(getDayEntered(view));
        booking1.setTime(getTimeEntered(view));
        booking1.setPlayer1(getPlayer1Entered(view));
        booking1.setPlayer2(getPlayer2Entered(view));
        booking1.setPlayer3(getPlayer3Entered(view));
        booking1.setBookingTime(getBookingTime(view));


        Context context = getApplicationContext();
        CharSequence text = booking1.getPlayer1();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

}
