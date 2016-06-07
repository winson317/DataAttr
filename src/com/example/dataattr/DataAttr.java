package com.example.dataattr;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DataAttr extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(); //创建Intent对象
				String data = "http://www.baidu.com";
				Uri uri = Uri.parse(data); //根据指定字符串解析出Uri对象
				intent.setAction(Intent.ACTION_VIEW); //为Intent设置Action属性
				intent.setData(uri); //设置data属性
				startActivity(intent);
			}
		});
        
        Button edit = (Button)findViewById(R.id.edit);
        edit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(); //创建Intent对象
				intent.setAction(Intent.ACTION_EDIT); //为Intent设置Action属性（动作为：编辑）
				String data = "content://com.android.contacts/contacts/2";
				Uri uri = Uri.parse(data); //根据指定字符串解析出Uri对象
				intent.setData(uri); //设置Data属性
				startActivity(intent);
			}
		});
    }
}
