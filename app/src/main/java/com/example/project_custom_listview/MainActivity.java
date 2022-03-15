package com.example.project_custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewProducts;
    ProductAdapter productAdapter;
    ArrayList<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewProducts = (ListView) findViewById(R.id.lvProduct);
        productList = new ArrayList<>();

        productList.add(new Product("Ca nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        productList.add(new Product("1KG khô gà bơ tỏi","LTD Food",R.drawable.ga_bo_toi));
        productList.add(new Product("Xe cần cẩu","Thế giới đồ chơi",R.drawable.xa_can_cau));
        productList.add(new Product("Đồ chơi dạng mô hình","Thế giới đồ chơi",R.drawable.do_choi_dang_mo_hinh));
        productList.add(new Product("Lãnh đạo giản đơn","Minh Long book",R.drawable.lanh_dao_gian_don));
        productList.add(new Product("Hiểu lòng con trẻ","Minh Long book",R.drawable.hieu_long_con_tre));

        productAdapter = new ProductAdapter(this,R.layout.product_view,productList);
        listViewProducts.setAdapter(productAdapter);

    }
}