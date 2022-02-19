package ru.anybic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product);
    }

    public void openIntentAddCashVoucher(View view) {

        Intent intent1 = new Intent(this, AddCashVoucher.class);

        startActivity( intent1 );
    }
}