package ru.anybic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListCashVoucher extends AppCompatActivity {

    private String[] vouchers = {"На всю неделю", "ДР Алексея П.", "14 февраля"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_cash_voucher);

        ListView countriesList = findViewById(R.id.voucherList);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, vouchers);

        countriesList.setAdapter(adapter);
    }

    public void openIntentAddCashVoucher(View view) {

        Intent intent1 = new Intent(this, AddCashVoucher.class);

        startActivity( intent1 );
    }
}