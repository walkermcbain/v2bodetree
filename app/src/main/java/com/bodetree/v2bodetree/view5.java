package com.bodetree.v2bodetree;




import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.alimuzaffar.lib.pin.PinEntryEditText;


public class view5 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view5);

        final PinEntryEditText pinEntry = (PinEntryEditText) findViewById(R.id.txt_pin_entry);
        if (pinEntry != null) {
            pinEntry.setOnPinEnteredListener(new PinEntryEditText.OnPinEnteredListener() {
                @Override
                public void onPinEntered(CharSequence str) {
                    if (str.toString().equals("1234")) {
                        Intent intent = new Intent(view5.this, lastpage.class);
                        startActivity(intent);
                    } else {
                        pinEntry.setText(null);
                    }
                }
            });
        }

    }

    //public void onButtonClicked(View view){
    //    Intent intent = new Intent(this, lastpage.class);
    //    startActivity(intent);

    //}

    @Override
    public void onBackPressed() {

    }



}
