package com.apk.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class gomart extends AppCompatActivity {

    public EditText txtnama,txtalamat,txtorder;
    public Button btn_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gomart);
        txtnama = findViewById(R.id.txtNama);
        txtalamat = findViewById(R.id.txtAlamat);
        txtorder = findViewById(R.id.txtOrder);
        btn_order = findViewById(R.id.btn_Order);
        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(gomart.this,detail_gomart.class);
                i.putExtra("nama",txtnama.getText().toString());
                i.putExtra("alamat",txtalamat.getText().toString());
                i.putExtra("order",txtorder.getText().toString());
                startActivity(i);
            }
        });
    }
}
