package rlp.somuna.ble_test3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.chimeraiot.android.ble.BleScanner;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_ENABLE_BT = 1;
    /** Scan delay period. */
    private static final long SCAN_PERIOD = 10000L;

    private BleScanner scanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}