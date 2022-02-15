package ru.anybic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListCashVoucher extends AppCompatActivity {

    private String[] countries = {"На всю неделю", "ДР Алексея П.", "14 февраля"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_cash_voucher);


        ListView countriesList = findViewById(R.id.voucherList);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, countries);

        countriesList.setAdapter(adapter);
    }
}