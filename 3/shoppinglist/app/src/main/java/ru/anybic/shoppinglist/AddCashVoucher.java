package ru.anybic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AddCashVoucher extends AppCompatActivity {

    private String[] products = {
        "Йогурт", "Творог", "Кефир", "Молоко",
        "Куриная грудка", "Яйца", "Консервр. горошек", "Консервр. кукуруза",
        "Шпроты", "Хлеб", "Что-нибудь к чаю", "Сыр"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_cash_voucher);

        ListView countriesList = findViewById(R.id.productList);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, products);

        countriesList.setAdapter(adapter);
    }

    public void openIntentAddProduct(View view) {

        Intent intent1 = new Intent(this, AddProduct.class);

        startActivity( intent1 );
    }
}