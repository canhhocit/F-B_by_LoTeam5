package com.example.learn4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class act_Order extends AppCompatActivity {
    EditText edt_btnQuaylai, edt_hienthiBan, edt_btnChuyenban, edt_Timkiem, edt_btnMontuchon, edt_Note, edtTongtien;
    Button btn_acpTimkiem, btnXacnhan, btnThanhtoan;
    ListView lv_listdanggoi, lv_listdagoi;
    ImageButton img_denda, img_capuchino, img_espresso, img_matcha, img_scdd, img_tradao, img_trachanh, img_trasuanuong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.act_order);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // EditText
        edt_btnQuaylai = findViewById(R.id.edt_btnQuaylai);
        edt_hienthiBan = findViewById(R.id.edt_hienthiBan);
        edt_btnChuyenban = findViewById(R.id.edt_btnChuyenban);
        edt_Timkiem = findViewById(R.id.edt_Timkiem);
        edt_btnMontuchon = findViewById(R.id.edt_btnMontuchon);
        edt_Note = findViewById(R.id.edt_Note);
        edtTongtien = findViewById(R.id.edtTongtien);

        // Button
        btn_acpTimkiem = findViewById(R.id.btn_acpTimkiem);
        btnXacnhan = findViewById(R.id.btnXacnhan);
        btnThanhtoan = findViewById(R.id.btnThanhtoan);

        // ListView
        lv_listdanggoi = findViewById(R.id.lv_listdanggoi);
        lv_listdagoi = findViewById(R.id.lv_listdagoi);

        // ImageButton
        img_denda = findViewById(R.id.img_denda);
        img_capuchino = findViewById(R.id.img_capuchino);
        img_espresso = findViewById(R.id.img_espresso);
        img_matcha = findViewById(R.id.img_matcha);
        img_scdd = findViewById(R.id.img_scdd);
        img_tradao = findViewById(R.id.img_tradao);
        img_trachanh = findViewById(R.id.img_trachanh);
        img_trasuanuong = findViewById(R.id.img_trasuanuong);
    }
}