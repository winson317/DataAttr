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
				Intent intent = new Intent(); //����Intent����
				String data = "http://www.baidu.com";
				Uri uri = Uri.parse(data); //����ָ���ַ���������Uri����
				intent.setAction(Intent.ACTION_VIEW); //ΪIntent����Action����
				intent.setData(uri); //����data����
				startActivity(intent);
			}
		});
        
        Button edit = (Button)findViewById(R.id.edit);
        edit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(); //����Intent����
				intent.setAction(Intent.ACTION_EDIT); //ΪIntent����Action���ԣ�����Ϊ���༭��
				String data = "content://com.android.contacts/contacts/2";
				Uri uri = Uri.parse(data); //����ָ���ַ���������Uri����
				intent.setData(uri); //����Data����
				startActivity(intent);
			}
		});
    }
}
